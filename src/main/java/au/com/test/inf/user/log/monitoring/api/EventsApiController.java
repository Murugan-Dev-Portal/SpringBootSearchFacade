package au.com.test.inf.user.log.monitoring.api;

import au.com.test.inf.user.log.monitoring.model.Error;
import au.com.test.inf.user.log.monitoring.model.Event;
import au.com.test.inf.user.log.monitoring.model.EventFilter;
import au.com.test.inf.user.log.monitoring.model.EventFilters;
import au.com.test.inf.user.log.monitoring.repo.EventRepository;
import au.com.test.inf.user.log.monitoring.repo.dto.EventDTO;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

@Component
public class EventsApiController implements EventsApi {

    @Autowired
    private EventRepository eventRepo;

    @Override
    public ResponseEntity<Event> eventsIdGet(String id) {
        Optional<EventDTO> dto = eventRepo.findByEventId(id);
        ResponseEntity<Event> response = null;
        if (dto.isPresent()) {
            EventDTO dtoObject = dto.get();
            Event event = new Event();
            event.setUserId(dtoObject.getUser().getUserId());
            event.setType(dtoObject.getEventType());
            event.setEmailAddress(dtoObject.getUser().getEmailAddress());
            event.setWorkStationIP(dtoObject.getUser().getWorkStationIP());
            event.setTime(dtoObject.getEventTime().toString());
            response = new ResponseEntity<Event>(HttpStatus.OK).ok(event);
        } else {
            Error recordNotFound = new Error().code(101).details("No User found for id: " + id).message("No records found");
            response = new ResponseEntity<Event>(HttpStatus.NOT_FOUND);
            response.status(HttpStatus.NOT_FOUND).body(recordNotFound);
        }
        return response;
    }

    @Override
    public ResponseEntity<List<Event>> eventsSearchGet(EventFilters filter) {
        ResponseEntity<List<Event>> response = null;
        if(filter == null || CollectionUtils.isEmpty(filter.getFilters())){
            Error recordNotFound = new Error().code(101).details("Invalid filter criteria").message("Bad search criteria");
            response = new ResponseEntity<List<Event>>(HttpStatus.BAD_REQUEST);
            response.status(HttpStatus.BAD_REQUEST).body(recordNotFound);
        } else if (hasInvalidFilterUsage(filter.getFilters())) {
            Error recordNotFound = new Error().code(102).details("Invalid filter criteria options used").message("Bad search criteria options");
            response = new ResponseEntity<List<Event>>(HttpStatus.BAD_REQUEST);
            response.status(HttpStatus.BAD_REQUEST).body(recordNotFound);
        } else {
            // TODO
            response = new ResponseEntity<Event>(HttpStatus.OK).ok(Lists.newArrayList());
        }
        return response;
    }

    private boolean hasInvalidFilterUsage(List<EventFilter> filters){
        boolean bothRangeAndValuePresent = filters.stream().anyMatch(filter -> filter.getRange() != null && filter.getValue() != null);
        boolean bothRangeAndOperatorPresent = filters.stream().anyMatch(filter -> filter.getRange() != null &&
                (EventFilter.OperatorEnum.GTE.equals(filter.getOperator()) ||
                        EventFilter.OperatorEnum.GTE.equals(filter.getOperator())));
        return bothRangeAndValuePresent || bothRangeAndOperatorPresent;
    }
}

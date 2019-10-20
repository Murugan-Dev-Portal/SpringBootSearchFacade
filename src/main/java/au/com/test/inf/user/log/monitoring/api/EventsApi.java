package au.com.test.inf.user.log.monitoring.api;

import au.com.test.inf.user.log.monitoring.model.ErrorResult;
import au.com.test.inf.user.log.monitoring.model.Event;
import au.com.test.inf.user.log.monitoring.model.InlineResponse400;
import au.com.test.inf.user.log.monitoring.model.ErrorResponse;
import au.com.test.inf.user.log.monitoring.model.EventFilters;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Retrieve information about an event", notes = "Retrieve information about an event", response = Event.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Event information about the user", response = Event.class),
        @ApiResponse(code = 400, message = "Error response for bad request", response = Event.class),
        @ApiResponse(code = 404, message = "Error response for bad request or unknown resources", response = Event.class),
        @ApiResponse(code = 500, message = "Error resposne for unexpected or runtime errors while processing", response = Event.class) })
    @RequestMapping(value = "/events/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Event> eventsIdGet(
@ApiParam(value = "Unique identifier of the event object",required=true ) @PathVariable("id") String id


) {
        // do some magic!
        return new ResponseEntity<Event>(HttpStatus.OK);
    }


    @ApiOperation(value = "Retrieve event details based on the criteria provided", notes = "This end point helps to retrieve all the matching information about the events being inquired.", response = Event.class, responseContainer = "List", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "event", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response object for event search", response = Event.class),
        @ApiResponse(code = 400, message = "Error response for bad request", response = Event.class),
        @ApiResponse(code = 404, message = "Error response for bad request or unknown resources", response = Event.class),
        @ApiResponse(code = 500, message = "Error resposne for unexpected or runtime errors while processing", response = Event.class) })
    @RequestMapping(value = "/events/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<Event>> eventsSearchGet(

@ApiParam(value = "Input criteria for filtering the list of events" ,required=true ) @RequestBody EventFilters filter

) {
        // do some magic!
        return new ResponseEntity<List<Event>>(HttpStatus.OK);
    }

}

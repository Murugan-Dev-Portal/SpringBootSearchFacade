package au.com.test.inf.user.log.monitoring.api;

import au.com.test.inf.user.log.monitoring.model.Error;
import au.com.test.inf.user.log.monitoring.model.User;
import au.com.test.inf.user.log.monitoring.model.UserFilters;
import au.com.test.inf.user.log.monitoring.repo.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

@Controller
public class UsersApiController implements UsersApi {

    @Autowired
    private UserRepository userRepo;

    public List<User> getAllUsers() {
        List<User> employeeList = userRepo.findAll();
        if (CollectionUtils.isEmpty(employeeList)) {
            return Lists.newArrayList();
        } else {
            return employeeList;
        }
    }

    @Override
    public ResponseEntity<User> getUserById(String id) {
        Optional<User> user = userRepo.findById(id);
        ResponseEntity<User> response = null;
        if (user.isPresent()) {
            response = new ResponseEntity<User>(HttpStatus.OK).of(user);
        } else {
            Error recordNotFound = new Error().code(101).details("No User found for id: " + id).message("No records found");
            response = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
            response.status(HttpStatus.NOT_FOUND).body(recordNotFound);
        }
        return response;
    }

    @Override
    public ResponseEntity<List<User>> searchUsers(UserFilters filter) {
        return null;
    }
}

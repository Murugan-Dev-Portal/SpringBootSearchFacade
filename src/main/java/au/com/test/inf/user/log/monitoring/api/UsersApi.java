package au.com.test.inf.user.log.monitoring.api;

import au.com.test.inf.user.log.monitoring.model.User;
import au.com.test.inf.user.log.monitoring.model.UserFilters;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-10-20T23:03:10.322+11:00")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Retrieve user details", notes = "This end point helps to retrieve the information about the target user being inquired.", response = User.class, authorizations = {
            @Authorization(value = "BasicAuth")
    }, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Valid User Object Response", response = User.class),
            @ApiResponse(code = 400, message = "Error response for bad request", response = User.class),
            @ApiResponse(code = 404, message = "Error response for bad request or unknown resources", response = User.class),
            @ApiResponse(code = 500, message = "Error resposne for unexpected or runtime errors while processing", response = User.class)})
    @RequestMapping(value = "/users/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<User> getUserById(@ApiParam(value = "Unique identifier of the User being queried", required = true) @PathVariable("id") String id
    ) {
        return new ResponseEntity<User>(HttpStatus.OK);
    }


    @ApiOperation(value = "Retrieve user details based on the criteria provided", notes = "This end point helps to retrieve all the matching information about the users being inquired.", response = User.class, responseContainer = "List", authorizations = {
            @Authorization(value = "BasicAuth")
    }, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Response object for user search", response = User.class),
            @ApiResponse(code = 400, message = "Error response for bad request", response = User.class),
            @ApiResponse(code = 404, message = "Error response for bad request or unknown resources", response = User.class),
            @ApiResponse(code = 500, message = "Error resposne for unexpected or runtime errors while processing", response = User.class)})
    @RequestMapping(value = "/users/search",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<List<User>> searchUsers(

            @ApiParam(value = "Input criteria for filtering the list of users", required = true) @RequestBody UserFilters filter

    ) {
        // do some magic!
        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

}

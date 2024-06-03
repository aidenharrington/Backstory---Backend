package com.backstory.api.endpoints;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import com.backstory.api.models.User;

@RestController
@RequestMapping("/backstory")
@Api(value = "Backstory User API")
public class UserController {

    @ApiOperation(value = "Create a new user", response = User.class)
    @PostMapping("/user")
    public User creatUser() {
        return new User();
    }

    @ApiOperation(value = "Get a greeting message", response = String.class)
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
    
}

package com.backstory.api.endpoints;


import org.springframework.web.bind.annotation.*;

import com.backstory.api.models.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/users")
@Tag(name = "User")
public class UserController {

    

    @Operation(
        description = "POST User endpoint",
        summary = "Create a new user and return the created object",
        responses = {
            @ApiResponse(
                description = "Success",
                responseCode = "200",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            ),
            @ApiResponse(
                description = "Unauthorized",
                responseCode = "403"
            ),
            @ApiResponse(
                description = "Server error",
                responseCode = "500"
            ),
        }
    )
    @PostMapping()
    public User creatUser(@RequestParam User user) {
        return new User();
    }

    @Operation(
        description = "GET User endpoint",
        summary = "Get the user by id",
        responses = {
            @ApiResponse(
                description = "Success",
                responseCode = "200",
                content = @Content(schema = @Schema(implementation = User.class))
            ),
            @ApiResponse(
                description = "Unauthorized",
                responseCode = "403"
            ),
            @ApiResponse(
                description = "User not found",
                responseCode = "404"
            ),
            @ApiResponse(
                description = "Server error",
                responseCode = "500"
            ),
        }
    )
    @GetMapping("/{id}")
    public User getUser() {
        return new User();
    }

    @Operation(
        description = "PATCH User endpoint",
        summary = "Patch update the user by id",
        responses = {
            @ApiResponse(
                description = "Success",
                responseCode = "200"
            ),
            @ApiResponse(
                description = "Unauthorized",
                responseCode = "403"
            ),
            @ApiResponse(
                description = "User not found",
                responseCode = "404"
            ),
            @ApiResponse(
                description = "Server error",
                responseCode = "500"
            ),
        }
    )
    @PatchMapping("/{id}")
    public void updateUser(@RequestParam User user) {
        return;
    }

    
    
}

package com.backstory.api.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    @Schema(
        description = "Id of user",
        name = "userId",
        type = "string",
        example = "1"
    )
    @Getter
    String userId;

    @Schema(
        description = "First name of user",
        name = "firstName",
        type = "string",
        example = "John"
    )
    @Getter
    @Setter
    String firstName;

    @Schema(
        description = "Last name of user",
        name = "lastName",
        type = "string",
        example = "Doe"
    )
    String lastName;

    @Schema(
        description = "Email address of user",
        name = "emailAddress",
        type = "string",
        example = "robert.smith@gmail.com"
    )
    @Getter
    @Setter
    String emailAddress;

    public User() {}


}

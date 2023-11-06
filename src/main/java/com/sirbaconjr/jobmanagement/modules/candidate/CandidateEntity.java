package com.sirbaconjr.jobmanagement.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "The [username] field must not contain spaces")
    private String username;

    @Email(message = "The [email] field must contain a valid email")
    private String email;

    @Length(min = 8, max = 32, message = "The [password] field must have between 8 and 32 characters")
    private String password;
    private String description;
    private String curriculum;
}

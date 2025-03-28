package com.example.demoProject.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Create the custom annotation for validating email domain
@Constraint(validatedBy = EmailDomainValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmailDomain {

    // Custom error message
    String message() default "Email must be from the domain @example.com";

    // Grouping constraints - @ValidEmailDomain(groups = CreateUserGroup.class)
    Class<?>[] groups() default {};

    // Payload for additional data
    Class<? extends Payload>[] payload() default {};
}

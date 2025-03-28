package com.example.demoProject.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailDomainValidator implements ConstraintValidator<ValidEmailDomain, String> {

    @Override
    public void initialize(ValidEmailDomain constraintAnnotation) {
        // Initialize if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Check if the email domain ends with "@example.com"
        if (value == null) {
            return true; // We leave null values to be handled by other annotations (like @NotNull)
        }
        return value.endsWith("@example.com");
    }
}
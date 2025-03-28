package com.example.demoProject.model;


import com.example.demoProject.Validation.CreateUserGroup;
import com.example.demoProject.Validation.UpdateUserGroup;
import com.example.demoProject.Validation.ValidEmailDomain;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull(groups = CreateUserGroup.class, message = "Name is required for user creation")
    @Size(min = 2, groups = CreateUserGroup.class, message = "Name must be at least 2 characters long")
    @NotNull(groups = UpdateUserGroup.class, message = "Name is required for user update")
    private String name;

    @NotNull(groups = CreateUserGroup.class, message = "Email is required for user creation")
    @Email(groups = CreateUserGroup.class, message = "Email must be valid")
    @ValidEmailDomain
    private String email;

    @NotNull(groups = UpdateUserGroup.class, message = "Updated name is required for user update")
    private String updatedName;

}
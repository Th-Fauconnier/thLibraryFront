package com.emilie.thLibraryClient.model.Entities.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
    private Long clientNumber;

    private Address address;


}
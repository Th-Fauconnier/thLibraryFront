package com.emilie.thLibraryClient.Entities;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
    private Long clientNumber;


}

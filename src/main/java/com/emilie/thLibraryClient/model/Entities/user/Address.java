package com.emilie.thLibraryClient.model.Entities.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

    private int number;
    private String street;
    private String zipCode;
    private String city;

    @Override
    public String toString() {
        return number + " " + street + " " + zipCode + " " + city;
    }

}

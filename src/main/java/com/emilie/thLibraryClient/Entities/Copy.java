package com.emilie.thLibraryClient.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Copy {

    private Long id;
    private boolean available;
    private Book book;
    private Library library;
}

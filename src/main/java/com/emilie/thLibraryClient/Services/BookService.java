package com.emilie.thLibraryClient.Services;

import com.emilie.thLibraryClient.Entities.Book;
import com.emilie.thLibraryClient.Entities.Library;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    List<Book> getBookList();

    List<Library> getLibraryList();


}

package com.emilie.thLibraryClient.Services;


import com.emilie.thLibraryClient.Entities.Book;
import com.emilie.thLibraryClient.Entities.Library;
import com.emilie.thLibraryClient.Proxy.FeignProxy;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    private final FeignProxy feignProxy;

    public BookServiceImpl(FeignProxy feignProxy) {
        this.feignProxy=feignProxy;
    }

    public Book getBookById (Long id){
        return this.feignProxy.getBookById(id);
    }

    public List<Book> getBookList(){
        return this.feignProxy.getBookList();
    }

    public List<Library> getLibraryList(){return feignProxy.getLibraryList();}

    public Library getLibraryById(Long id){
        return this.feignProxy.getLibraryById(id);
    }


}

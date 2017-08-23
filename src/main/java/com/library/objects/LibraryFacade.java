package com.library.objects;

import com.library.dao.interfaces.BookDAO;
import com.library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryFacade {


    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private SearchCriteria searchCriteria;

    private List<Book> books;


    public List<Book> getBooks() {
        if (books == null){
            books = bookDAO.getBooks();
        }
        return books;
    }

    public void searchBooksByLetter() {
        books = bookDAO.getBooks(searchCriteria.getLetter());
    }
}

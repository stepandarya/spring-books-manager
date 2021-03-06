package ru.pelmegov.booksmanager.dao;

import ru.pelmegov.booksmanager.model.Book;

import java.util.List;

/**
 * @author modkomi
 * @since 03.05.2016
 */
public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}

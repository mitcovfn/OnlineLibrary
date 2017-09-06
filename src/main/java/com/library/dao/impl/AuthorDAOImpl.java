package com.library.dao.impl;

import com.library.dao.interfaces.AuthorDAO;
import com.library.entities.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AuthorDAOImpl implements AuthorDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Author> getAuthors() {
        return sessionFactory.getCurrentSession().createCriteria(Author.class).list();
    }
}

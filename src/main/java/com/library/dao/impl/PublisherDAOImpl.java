package com.library.dao.impl;


import com.library.dao.interfaces.PublisherDAO;
import com.library.entities.Publisher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PublisherDAOImpl implements PublisherDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Publisher> getPublishers() {
        return sessionFactory.getCurrentSession().createCriteria(Publisher.class).list();
    }
}

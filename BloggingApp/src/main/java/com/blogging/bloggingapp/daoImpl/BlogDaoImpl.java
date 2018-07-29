/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogging.bloggingapp.daoImpl;

import com.blogging.bloggingapp.dao.BlogDao;
import com.blogging.bloggingapp.model.Blogs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author My Computer
 */
@Repository
public class BlogDaoImpl implements BlogDao {
@Autowired
private SessionFactory sessionFactory;
    
    
    @Override
    public String save(Blogs blog) {
        
        Session session=sessionFactory.openSession();
        session.save(blog);
        session.beginTransaction().commit();
        session.close();
        return "success";
    }
    
}

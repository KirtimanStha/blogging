/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogging.bloggingapp.serviceImpl;

import com.blogging.bloggingapp.dao.BlogDao;
import com.blogging.bloggingapp.model.Blogs;
import com.blogging.bloggingapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author My Computer
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public String saveBlog(Blogs blog) {

        return blogDao.save(blog);
    }

}

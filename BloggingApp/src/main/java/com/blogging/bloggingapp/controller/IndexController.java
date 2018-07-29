/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogging.bloggingapp.controller;

import com.blogging.bloggingapp.model.Blogs;
import com.blogging.bloggingapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author My Computer
 */
@Controller
public class IndexController {
    @Autowired
    private BlogService blogService;
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String blank(){
        return "index";  
    }
    
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index(){
        return "index";  
    }
    
    @RequestMapping(value="/student", method=RequestMethod.GET)
    public String student(){
        return "student";  
    }
    
    @RequestMapping(value="/add-blog", method=RequestMethod.GET)
    public String add(){
        return "add_blog";  
    }
    
    @RequestMapping(value="/list-blog", method=RequestMethod.GET)
    public String list(){
        return "list_blog";  
    }
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String saveData(
    @RequestParam("title") String title,
            @RequestParam("caption") String caption,
            @RequestParam("desc") String desc
    ){
      Blogs blog= new Blogs();
      blog.setBlogtitle(title);
      blog.setBlogdescription(desc);
      
      blogService.saveBlog(blog);
        
        return "add_blog";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogging.bloggingapp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author My Computer
 */
@Entity
@Table(name = "blogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blogs.findAll", query = "SELECT b FROM Blogs b")
    , @NamedQuery(name = "Blogs.findByBlogid", query = "SELECT b FROM Blogs b WHERE b.blogid = :blogid")
    , @NamedQuery(name = "Blogs.findByBlogdescription", query = "SELECT b FROM Blogs b WHERE b.blogdescription = :blogdescription")
    , @NamedQuery(name = "Blogs.findByBlogtitle", query = "SELECT b FROM Blogs b WHERE b.blogtitle = :blogtitle")
    , @NamedQuery(name = "Blogs.findByRating", query = "SELECT b FROM Blogs b WHERE b.rating = :rating")
    , @NamedQuery(name = "Blogs.findByViews", query = "SELECT b FROM Blogs b WHERE b.views = :views")})
public class Blogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "blogid")
    private Integer blogid;
    @Size(max = 255)
    @Column(name = "blogdescription")
    private String blogdescription;
    @Size(max = 255)
    @Column(name = "blogtitle")
    private String blogtitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private float rating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "views")
    private int views;

    public Blogs() {
    }

    public Blogs(Integer blogid) {
        this.blogid = blogid;
    }

    public Blogs(Integer blogid, float rating, int views) {
        this.blogid = blogid;
        this.rating = rating;
        this.views = views;
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogdescription() {
        return blogdescription;
    }

    public void setBlogdescription(String blogdescription) {
        this.blogdescription = blogdescription;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blogid != null ? blogid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blogs)) {
            return false;
        }
        Blogs other = (Blogs) object;
        if ((this.blogid == null && other.blogid != null) || (this.blogid != null && !this.blogid.equals(other.blogid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogging.bloggingapp.model.Blogs[ blogid=" + blogid + " ]";
    }
    
}

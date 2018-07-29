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
@Table(name = "studenttable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studenttable.findAll", query = "SELECT s FROM Studenttable s")
    , @NamedQuery(name = "Studenttable.findByStudentid", query = "SELECT s FROM Studenttable s WHERE s.studentid = :studentid")
    , @NamedQuery(name = "Studenttable.findByRating", query = "SELECT s FROM Studenttable s WHERE s.rating = :rating")
    , @NamedQuery(name = "Studenttable.findByStudentdescription", query = "SELECT s FROM Studenttable s WHERE s.studentdescription = :studentdescription")
    , @NamedQuery(name = "Studenttable.findByStudentname", query = "SELECT s FROM Studenttable s WHERE s.studentname = :studentname")})
public class Studenttable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "studentid")
    private Integer studentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private float rating;
    @Size(max = 255)
    @Column(name = "studentdescription")
    private String studentdescription;
    @Size(max = 255)
    @Column(name = "studentname")
    private String studentname;

    public Studenttable() {
    }

    public Studenttable(Integer studentid) {
        this.studentid = studentid;
    }

    public Studenttable(Integer studentid, float rating) {
        this.studentid = studentid;
        this.rating = rating;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getStudentdescription() {
        return studentdescription;
    }

    public void setStudentdescription(String studentdescription) {
        this.studentdescription = studentdescription;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studenttable)) {
            return false;
        }
        Studenttable other = (Studenttable) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogging.bloggingapp.model.Studenttable[ studentid=" + studentid + " ]";
    }
    
}

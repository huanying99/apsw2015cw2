/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ents;

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
 * @author Pavilion
 */
@Entity
@Table(name = "STUDENTCATEGORIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentcategories.findAll", query = "SELECT s FROM Studentcategories s"),
    @NamedQuery(name = "Studentcategories.findByStudentcategoryid", query = "SELECT s FROM Studentcategories s WHERE s.studentcategoryid = :studentcategoryid"),
    @NamedQuery(name = "Studentcategories.findByStudentcategorydesc", query = "SELECT s FROM Studentcategories s WHERE s.studentcategorydesc = :studentcategorydesc")})
public class Studentcategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENTCATEGORYID")
    private Integer studentcategoryid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "STUDENTCATEGORYDESC")
    private String studentcategorydesc;

    public Studentcategories() {
    }

    public Studentcategories(Integer studentcategoryid) {
        this.studentcategoryid = studentcategoryid;
    }

    public Studentcategories(Integer studentcategoryid, String studentcategorydesc) {
        this.studentcategoryid = studentcategoryid;
        this.studentcategorydesc = studentcategorydesc;
    }

    public Integer getStudentcategoryid() {
        return studentcategoryid;
    }

    public void setStudentcategoryid(Integer studentcategoryid) {
        this.studentcategoryid = studentcategoryid;
    }

    public String getStudentcategorydesc() {
        return studentcategorydesc;
    }

    public void setStudentcategorydesc(String studentcategorydesc) {
        this.studentcategorydesc = studentcategorydesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentcategoryid != null ? studentcategoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentcategories)) {
            return false;
        }
        Studentcategories other = (Studentcategories) object;
        if ((this.studentcategoryid == null && other.studentcategoryid != null) || (this.studentcategoryid != null && !this.studentcategoryid.equals(other.studentcategoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Studentcategories[ studentcategoryid=" + studentcategoryid + " ]";
    }
    
}

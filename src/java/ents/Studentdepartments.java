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
@Table(name = "STUDENTDEPARTMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentdepartments.findAll", query = "SELECT s FROM Studentdepartments s"),
    @NamedQuery(name = "Studentdepartments.findByDepartmentid", query = "SELECT s FROM Studentdepartments s WHERE s.departmentid = :departmentid"),
    @NamedQuery(name = "Studentdepartments.findByDepartmentdesc", query = "SELECT s FROM Studentdepartments s WHERE s.departmentdesc = :departmentdesc")})
public class Studentdepartments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEPARTMENTID")
    private Integer departmentid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DEPARTMENTDESC")
    private String departmentdesc;

    public Studentdepartments() {
    }

    public Studentdepartments(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Studentdepartments(Integer departmentid, String departmentdesc) {
        this.departmentid = departmentid;
        this.departmentdesc = departmentdesc;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentdesc() {
        return departmentdesc;
    }

    public void setDepartmentdesc(String departmentdesc) {
        this.departmentdesc = departmentdesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentid != null ? departmentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentdepartments)) {
            return false;
        }
        Studentdepartments other = (Studentdepartments) object;
        if ((this.departmentid == null && other.departmentid != null) || (this.departmentid != null && !this.departmentid.equals(other.departmentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Studentdepartments[ departmentid=" + departmentid + " ]";
    }
    
}

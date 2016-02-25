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
@Table(name = "IDEASCATEGORIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ideascategories.findAll", query = "SELECT i FROM Ideascategories i"),
    @NamedQuery(name = "Ideascategories.findByIdeacategoryid", query = "SELECT i FROM Ideascategories i WHERE i.ideacategoryid = :ideacategoryid"),
    @NamedQuery(name = "Ideascategories.findByIdeacategorydesc", query = "SELECT i FROM Ideascategories i WHERE i.ideacategorydesc = :ideacategorydesc")})
public class Ideascategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEACATEGORYID")
    private Integer ideacategoryid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "IDEACATEGORYDESC")
    private String ideacategorydesc;

    public Ideascategories() {
    }

    public Ideascategories(Integer ideacategoryid) {
        this.ideacategoryid = ideacategoryid;
    }

    public Ideascategories(Integer ideacategoryid, String ideacategorydesc) {
        this.ideacategoryid = ideacategoryid;
        this.ideacategorydesc = ideacategorydesc;
    }

    public Integer getIdeacategoryid() {
        return ideacategoryid;
    }

    public void setIdeacategoryid(Integer ideacategoryid) {
        this.ideacategoryid = ideacategoryid;
    }

    public String getIdeacategorydesc() {
        return ideacategorydesc;
    }

    public void setIdeacategorydesc(String ideacategorydesc) {
        this.ideacategorydesc = ideacategorydesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideacategoryid != null ? ideacategoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ideascategories)) {
            return false;
        }
        Ideascategories other = (Ideascategories) object;
        if ((this.ideacategoryid == null && other.ideacategoryid != null) || (this.ideacategoryid != null && !this.ideacategoryid.equals(other.ideacategoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Ideascategories[ ideacategoryid=" + ideacategoryid + " ]";
    }
    
}

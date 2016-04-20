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
@Table(name = "PERSONSTATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personstatus.findAll", query = "SELECT p FROM Personstatus p"),
    @NamedQuery(name = "Personstatus.findByPersonstatusid", query = "SELECT p FROM Personstatus p WHERE p.personstatusid = :personstatusid"),
    @NamedQuery(name = "Personstatus.findByPersonstatusdesc", query = "SELECT p FROM Personstatus p WHERE p.personstatusdesc = :personstatusdesc")})
public class Personstatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERSONSTATUSID")
    private Integer personstatusid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PERSONSTATUSDESC")
    private String personstatusdesc;

    public Personstatus() {
    }

    public Personstatus(Integer personstatusid) {
        this.personstatusid = personstatusid;
    }

    public Personstatus(Integer personstatusid, String personstatusdesc) {
        this.personstatusid = personstatusid;
        this.personstatusdesc = personstatusdesc;
    }

    public Integer getPersonstatusid() {
        return personstatusid;
    }

    public void setPersonstatusid(Integer personstatusid) {
        this.personstatusid = personstatusid;
    }

    public String getPersonstatusdesc() {
        return personstatusdesc;
    }

    public void setPersonstatusdesc(String personstatusdesc) {
        this.personstatusdesc = personstatusdesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personstatusid != null ? personstatusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personstatus)) {
            return false;
        }
        Personstatus other = (Personstatus) object;
        if ((this.personstatusid == null && other.personstatusid != null) || (this.personstatusid != null && !this.personstatusid.equals(other.personstatusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Personstatus[ personstatusid=" + personstatusid + " ]";
    }
    
}

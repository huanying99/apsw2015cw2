/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ents;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pavilion
 */
@Entity
@Table(name = "SUSPENSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suspension.findAll", query = "SELECT s FROM Suspension s"),
    @NamedQuery(name = "Suspension.findBySuspensionid", query = "SELECT s FROM Suspension s WHERE s.suspensionid = :suspensionid"),
    @NamedQuery(name = "Suspension.findByPersonid", query = "SELECT s FROM Suspension s WHERE s.personid = :personid"),
    @NamedQuery(name = "Suspension.findBySuspensiondate", query = "SELECT s FROM Suspension s WHERE s.suspensiondate = :suspensiondate")})
public class Suspension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUSPENSIONID")
    private Integer suspensionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERSONID")
    private int personid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUSPENSIONDATE")
    @Temporal(TemporalType.DATE)
    private Date suspensiondate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "SUSPENSIONREASON")
    private String suspensionreason;

    public Suspension() {
    }

    public Suspension(Integer suspensionid) {
        this.suspensionid = suspensionid;
    }

    public Suspension(Integer suspensionid, int personid, Date suspensiondate, String suspensionreason) {
        this.suspensionid = suspensionid;
        this.personid = personid;
        this.suspensiondate = suspensiondate;
        this.suspensionreason = suspensionreason;
    }

    public Integer getSuspensionid() {
        return suspensionid;
    }

    public void setSuspensionid(Integer suspensionid) {
        this.suspensionid = suspensionid;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public Date getSuspensiondate() {
        return suspensiondate;
    }

    public void setSuspensiondate(Date suspensiondate) {
        this.suspensiondate = suspensiondate;
    }

    public String getSuspensionreason() {
        return suspensionreason;
    }

    public void setSuspensionreason(String suspensionreason) {
        this.suspensionreason = suspensionreason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suspensionid != null ? suspensionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suspension)) {
            return false;
        }
        Suspension other = (Suspension) object;
        if ((this.suspensionid == null && other.suspensionid != null) || (this.suspensionid != null && !this.suspensionid.equals(other.suspensionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Suspension[ suspensionid=" + suspensionid + " ]";
    }
    
}

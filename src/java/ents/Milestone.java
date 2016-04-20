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
@Table(name = "MILESTONE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Milestone.findAll", query = "SELECT m FROM Milestone m"),
    @NamedQuery(name = "Milestone.findByMilestoneid", query = "SELECT m FROM Milestone m WHERE m.milestoneid = :milestoneid"),
    @NamedQuery(name = "Milestone.findByMilestonestartdate", query = "SELECT m FROM Milestone m WHERE m.milestonestartdate = :milestonestartdate"),
    @NamedQuery(name = "Milestone.findByMilestoneenddate", query = "SELECT m FROM Milestone m WHERE m.milestoneenddate = :milestoneenddate")})
public class Milestone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONEID")
    private Integer milestoneid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONESTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date milestonestartdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONEENDDATE")
    @Temporal(TemporalType.DATE)
    private Date milestoneenddate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "MILESTONEDESC")
    private String milestonedesc;

    public Milestone() {
    }

    public Milestone(Integer milestoneid) {
        this.milestoneid = milestoneid;
    }

    public Milestone(Integer milestoneid, Date milestonestartdate, Date milestoneenddate, String milestonedesc) {
        this.milestoneid = milestoneid;
        this.milestonestartdate = milestonestartdate;
        this.milestoneenddate = milestoneenddate;
        this.milestonedesc = milestonedesc;
    }

    public Integer getMilestoneid() {
        return milestoneid;
    }

    public void setMilestoneid(Integer milestoneid) {
        this.milestoneid = milestoneid;
    }

    public Date getMilestonestartdate() {
        return milestonestartdate;
    }

    public void setMilestonestartdate(Date milestonestartdate) {
        this.milestonestartdate = milestonestartdate;
    }

    public Date getMilestoneenddate() {
        return milestoneenddate;
    }

    public void setMilestoneenddate(Date milestoneenddate) {
        this.milestoneenddate = milestoneenddate;
    }

    public String getMilestonedesc() {
        return milestonedesc;
    }

    public void setMilestonedesc(String milestonedesc) {
        this.milestonedesc = milestonedesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (milestoneid != null ? milestoneid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Milestone)) {
            return false;
        }
        Milestone other = (Milestone) object;
        if ((this.milestoneid == null && other.milestoneid != null) || (this.milestoneid != null && !this.milestoneid.equals(other.milestoneid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Milestone[ milestoneid=" + milestoneid + " ]";
    }
    
}

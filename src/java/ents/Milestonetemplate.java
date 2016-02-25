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
@Table(name = "MILESTONETEMPLATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Milestonetemplate.findAll", query = "SELECT m FROM Milestonetemplate m"),
    @NamedQuery(name = "Milestonetemplate.findByMilestonetemplateid", query = "SELECT m FROM Milestonetemplate m WHERE m.milestonetemplateid = :milestonetemplateid"),
    @NamedQuery(name = "Milestonetemplate.findByMilestonetemplatetitle", query = "SELECT m FROM Milestonetemplate m WHERE m.milestonetemplatetitle = :milestonetemplatetitle"),
    @NamedQuery(name = "Milestonetemplate.findByMilestonetemplatestartdate", query = "SELECT m FROM Milestonetemplate m WHERE m.milestonetemplatestartdate = :milestonetemplatestartdate"),
    @NamedQuery(name = "Milestonetemplate.findByMilestonetemplateenddate", query = "SELECT m FROM Milestonetemplate m WHERE m.milestonetemplateenddate = :milestonetemplateenddate"),
    @NamedQuery(name = "Milestonetemplate.findByMilestonetemplatestatus", query = "SELECT m FROM Milestonetemplate m WHERE m.milestonetemplatestatus = :milestonetemplatestatus")})
public class Milestonetemplate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONETEMPLATEID")
    private Integer milestonetemplateid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "MILESTONETEMPLATETITLE")
    private String milestonetemplatetitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONETEMPLATESTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date milestonetemplatestartdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONETEMPLATEENDDATE")
    @Temporal(TemporalType.DATE)
    private Date milestonetemplateenddate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "MILESTONETEMPLATEDESC")
    private String milestonetemplatedesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONETEMPLATESTATUS")
    private int milestonetemplatestatus;

    public Milestonetemplate() {
    }

    public Milestonetemplate(Integer milestonetemplateid) {
        this.milestonetemplateid = milestonetemplateid;
    }

    public Milestonetemplate(Integer milestonetemplateid, String milestonetemplatetitle, Date milestonetemplatestartdate, Date milestonetemplateenddate, String milestonetemplatedesc, int milestonetemplatestatus) {
        this.milestonetemplateid = milestonetemplateid;
        this.milestonetemplatetitle = milestonetemplatetitle;
        this.milestonetemplatestartdate = milestonetemplatestartdate;
        this.milestonetemplateenddate = milestonetemplateenddate;
        this.milestonetemplatedesc = milestonetemplatedesc;
        this.milestonetemplatestatus = milestonetemplatestatus;
    }

    public Integer getMilestonetemplateid() {
        return milestonetemplateid;
    }

    public void setMilestonetemplateid(Integer milestonetemplateid) {
        this.milestonetemplateid = milestonetemplateid;
    }

    public String getMilestonetemplatetitle() {
        return milestonetemplatetitle;
    }

    public void setMilestonetemplatetitle(String milestonetemplatetitle) {
        this.milestonetemplatetitle = milestonetemplatetitle;
    }

    public Date getMilestonetemplatestartdate() {
        return milestonetemplatestartdate;
    }

    public void setMilestonetemplatestartdate(Date milestonetemplatestartdate) {
        this.milestonetemplatestartdate = milestonetemplatestartdate;
    }

    public Date getMilestonetemplateenddate() {
        return milestonetemplateenddate;
    }

    public void setMilestonetemplateenddate(Date milestonetemplateenddate) {
        this.milestonetemplateenddate = milestonetemplateenddate;
    }

    public String getMilestonetemplatedesc() {
        return milestonetemplatedesc;
    }

    public void setMilestonetemplatedesc(String milestonetemplatedesc) {
        this.milestonetemplatedesc = milestonetemplatedesc;
    }

    public int getMilestonetemplatestatus() {
        return milestonetemplatestatus;
    }

    public void setMilestonetemplatestatus(int milestonetemplatestatus) {
        this.milestonetemplatestatus = milestonetemplatestatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (milestonetemplateid != null ? milestonetemplateid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Milestonetemplate)) {
            return false;
        }
        Milestonetemplate other = (Milestonetemplate) object;
        if ((this.milestonetemplateid == null && other.milestonetemplateid != null) || (this.milestonetemplateid != null && !this.milestonetemplateid.equals(other.milestonetemplateid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Milestonetemplate[ milestonetemplateid=" + milestonetemplateid + " ]";
    }
    
}

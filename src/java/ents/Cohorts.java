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
@Table(name = "COHORTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cohorts.findAll", query = "SELECT c FROM Cohorts c"),
    @NamedQuery(name = "Cohorts.findByCohortid", query = "SELECT c FROM Cohorts c WHERE c.cohortid = :cohortid"),
    @NamedQuery(name = "Cohorts.findByCohortdesc", query = "SELECT c FROM Cohorts c WHERE c.cohortdesc = :cohortdesc"),
    @NamedQuery(name = "Cohorts.findByRegisterstartdate", query = "SELECT c FROM Cohorts c WHERE c.registerstartdate = :registerstartdate"),
    @NamedQuery(name = "Cohorts.findByRegisterenddate", query = "SELECT c FROM Cohorts c WHERE c.registerenddate = :registerenddate"),
    @NamedQuery(name = "Cohorts.findByProjectstartdate", query = "SELECT c FROM Cohorts c WHERE c.projectstartdate = :projectstartdate"),
    @NamedQuery(name = "Cohorts.findByProjectenddate", query = "SELECT c FROM Cohorts c WHERE c.projectenddate = :projectenddate")})
public class Cohorts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COHORTID")
    private Integer cohortid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "COHORTDESC")
    private String cohortdesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGISTERSTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date registerstartdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGISTERENDDATE")
    @Temporal(TemporalType.DATE)
    private Date registerenddate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJECTSTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date projectstartdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJECTENDDATE")
    @Temporal(TemporalType.DATE)
    private Date projectenddate;

    public Cohorts() {
    }

    public Cohorts(Integer cohortid) {
        this.cohortid = cohortid;
    }

    public Cohorts(Integer cohortid, String cohortdesc, Date registerstartdate, Date registerenddate, Date projectstartdate, Date projectenddate) {
        this.cohortid = cohortid;
        this.cohortdesc = cohortdesc;
        this.registerstartdate = registerstartdate;
        this.registerenddate = registerenddate;
        this.projectstartdate = projectstartdate;
        this.projectenddate = projectenddate;
    }

    public Integer getCohortid() {
        return cohortid;
    }

    public void setCohortid(Integer cohortid) {
        this.cohortid = cohortid;
    }

    public String getCohortdesc() {
        return cohortdesc;
    }

    public void setCohortdesc(String cohortdesc) {
        this.cohortdesc = cohortdesc;
    }

    public Date getRegisterstartdate() {
        return registerstartdate;
    }

    public void setRegisterstartdate(Date registerstartdate) {
        this.registerstartdate = registerstartdate;
    }

    public Date getRegisterenddate() {
        return registerenddate;
    }

    public void setRegisterenddate(Date registerenddate) {
        this.registerenddate = registerenddate;
    }

    public Date getProjectstartdate() {
        return projectstartdate;
    }

    public void setProjectstartdate(Date projectstartdate) {
        this.projectstartdate = projectstartdate;
    }

    public Date getProjectenddate() {
        return projectenddate;
    }

    public void setProjectenddate(Date projectenddate) {
        this.projectenddate = projectenddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cohortid != null ? cohortid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cohorts)) {
            return false;
        }
        Cohorts other = (Cohorts) object;
        if ((this.cohortid == null && other.cohortid != null) || (this.cohortid != null && !this.cohortid.equals(other.cohortid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Cohorts[ cohortid=" + cohortid + " ]";
    }
    
}

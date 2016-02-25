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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pavilion
 */
@Entity
@Table(name = "FINALPROJECT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finalproject.findAll", query = "SELECT f FROM Finalproject f"),
    @NamedQuery(name = "Finalproject.findById", query = "SELECT f FROM Finalproject f WHERE f.id = :id"),
    @NamedQuery(name = "Finalproject.findByIdealid", query = "SELECT f FROM Finalproject f WHERE f.finalprojectPK.idealid = :idealid"),
    @NamedQuery(name = "Finalproject.findByStudentid", query = "SELECT f FROM Finalproject f WHERE f.finalprojectPK.studentid = :studentid"),
    @NamedQuery(name = "Finalproject.findByPlannedsubmissiondate", query = "SELECT f FROM Finalproject f WHERE f.plannedsubmissiondate = :plannedsubmissiondate"),
    @NamedQuery(name = "Finalproject.findByActualsubmissiondate", query = "SELECT f FROM Finalproject f WHERE f.actualsubmissiondate = :actualsubmissiondate")})
public class Finalproject implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FinalprojectPK finalprojectPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLANNEDSUBMISSIONDATE")
    @Temporal(TemporalType.DATE)
    private Date plannedsubmissiondate;
    @Column(name = "ACTUALSUBMISSIONDATE")
    @Temporal(TemporalType.DATE)
    private Date actualsubmissiondate;

    public Finalproject() {
    }

    public Finalproject(FinalprojectPK finalprojectPK) {
        this.finalprojectPK = finalprojectPK;
    }

    public Finalproject(FinalprojectPK finalprojectPK, int id, Date plannedsubmissiondate) {
        this.finalprojectPK = finalprojectPK;
        this.id = id;
        this.plannedsubmissiondate = plannedsubmissiondate;
    }

    public Finalproject(int idealid, int studentid) {
        this.finalprojectPK = new FinalprojectPK(idealid, studentid);
    }

    public FinalprojectPK getFinalprojectPK() {
        return finalprojectPK;
    }

    public void setFinalprojectPK(FinalprojectPK finalprojectPK) {
        this.finalprojectPK = finalprojectPK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPlannedsubmissiondate() {
        return plannedsubmissiondate;
    }

    public void setPlannedsubmissiondate(Date plannedsubmissiondate) {
        this.plannedsubmissiondate = plannedsubmissiondate;
    }

    public Date getActualsubmissiondate() {
        return actualsubmissiondate;
    }

    public void setActualsubmissiondate(Date actualsubmissiondate) {
        this.actualsubmissiondate = actualsubmissiondate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (finalprojectPK != null ? finalprojectPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Finalproject)) {
            return false;
        }
        Finalproject other = (Finalproject) object;
        if ((this.finalprojectPK == null && other.finalprojectPK != null) || (this.finalprojectPK != null && !this.finalprojectPK.equals(other.finalprojectPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Finalproject[ finalprojectPK=" + finalprojectPK + " ]";
    }
    
}

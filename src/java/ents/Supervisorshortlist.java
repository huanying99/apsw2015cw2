/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ents;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pavilion
 */
@Entity
@Table(name = "SUPERVISORSHORTLIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supervisorshortlist.findAll", query = "SELECT s FROM Supervisorshortlist s"),
    @NamedQuery(name = "Supervisorshortlist.findById", query = "SELECT s FROM Supervisorshortlist s WHERE s.id = :id"),
    @NamedQuery(name = "Supervisorshortlist.findByStudentid", query = "SELECT s FROM Supervisorshortlist s WHERE s.supervisorshortlistPK.studentid = :studentid"),
    @NamedQuery(name = "Supervisorshortlist.findBySupervisorid", query = "SELECT s FROM Supervisorshortlist s WHERE s.supervisorshortlistPK.supervisorid = :supervisorid"),
    @NamedQuery(name = "Supervisorshortlist.findByPriority", query = "SELECT s FROM Supervisorshortlist s WHERE s.priority = :priority")})
public class Supervisorshortlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SupervisorshortlistPK supervisorshortlistPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRIORITY")
    private int priority;

    public Supervisorshortlist() {
    }

    public Supervisorshortlist(SupervisorshortlistPK supervisorshortlistPK) {
        this.supervisorshortlistPK = supervisorshortlistPK;
    }

    public Supervisorshortlist(SupervisorshortlistPK supervisorshortlistPK, int id, int priority) {
        this.supervisorshortlistPK = supervisorshortlistPK;
        this.id = id;
        this.priority = priority;
    }

    public Supervisorshortlist(int studentid, int supervisorid) {
        this.supervisorshortlistPK = new SupervisorshortlistPK(studentid, supervisorid);
    }

    public SupervisorshortlistPK getSupervisorshortlistPK() {
        return supervisorshortlistPK;
    }

    public void setSupervisorshortlistPK(SupervisorshortlistPK supervisorshortlistPK) {
        this.supervisorshortlistPK = supervisorshortlistPK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supervisorshortlistPK != null ? supervisorshortlistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supervisorshortlist)) {
            return false;
        }
        Supervisorshortlist other = (Supervisorshortlist) object;
        if ((this.supervisorshortlistPK == null && other.supervisorshortlistPK != null) || (this.supervisorshortlistPK != null && !this.supervisorshortlistPK.equals(other.supervisorshortlistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Supervisorshortlist[ supervisorshortlistPK=" + supervisorshortlistPK + " ]";
    }
    
}

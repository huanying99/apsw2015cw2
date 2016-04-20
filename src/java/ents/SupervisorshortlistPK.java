/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ents;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Pavilion
 */
@Embeddable
public class SupervisorshortlistPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENTID")
    private int studentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUPERVISORID")
    private int supervisorid;

    public SupervisorshortlistPK() {
    }

    public SupervisorshortlistPK(int studentid, int supervisorid) {
        this.studentid = studentid;
        this.supervisorid = supervisorid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getSupervisorid() {
        return supervisorid;
    }

    public void setSupervisorid(int supervisorid) {
        this.supervisorid = supervisorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) studentid;
        hash += (int) supervisorid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupervisorshortlistPK)) {
            return false;
        }
        SupervisorshortlistPK other = (SupervisorshortlistPK) object;
        if (this.studentid != other.studentid) {
            return false;
        }
        if (this.supervisorid != other.supervisorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.SupervisorshortlistPK[ studentid=" + studentid + ", supervisorid=" + supervisorid + " ]";
    }
    
}

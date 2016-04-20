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
public class FinalprojectPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEALID")
    private int idealid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENTID")
    private int studentid;

    public FinalprojectPK() {
    }

    public FinalprojectPK(int idealid, int studentid) {
        this.idealid = idealid;
        this.studentid = studentid;
    }

    public int getIdealid() {
        return idealid;
    }

    public void setIdealid(int idealid) {
        this.idealid = idealid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idealid;
        hash += (int) studentid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinalprojectPK)) {
            return false;
        }
        FinalprojectPK other = (FinalprojectPK) object;
        if (this.idealid != other.idealid) {
            return false;
        }
        if (this.studentid != other.studentid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.FinalprojectPK[ idealid=" + idealid + ", studentid=" + studentid + " ]";
    }
    
}

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
@Table(name = "IDEASSHORTLIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ideasshortlist.findAll", query = "SELECT i FROM Ideasshortlist i"),
    @NamedQuery(name = "Ideasshortlist.findById", query = "SELECT i FROM Ideasshortlist i WHERE i.id = :id"),
    @NamedQuery(name = "Ideasshortlist.findByIdealid", query = "SELECT i FROM Ideasshortlist i WHERE i.ideasshortlistPK.idealid = :idealid"),
    @NamedQuery(name = "Ideasshortlist.findByStudentid", query = "SELECT i FROM Ideasshortlist i WHERE i.ideasshortlistPK.studentid = :studentid"),
    @NamedQuery(name = "Ideasshortlist.findByTreatedstatus", query = "SELECT i FROM Ideasshortlist i WHERE i.treatedstatus = :treatedstatus"),
    @NamedQuery(name = "Ideasshortlist.findByTreatredby", query = "SELECT i FROM Ideasshortlist i WHERE i.treatredby = :treatredby"),
    @NamedQuery(name = "Ideasshortlist.findByPriority", query = "SELECT i FROM Ideasshortlist i WHERE i.priority = :priority")})
public class Ideasshortlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IdeasshortlistPK ideasshortlistPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TREATEDSTATUS")
    private int treatedstatus;
    @Column(name = "TREATREDBY")
    private Integer treatredby;
    @Column(name = "PRIORITY")
    private Integer priority;

    public Ideasshortlist() {
    }

    public Ideasshortlist(IdeasshortlistPK ideasshortlistPK) {
        this.ideasshortlistPK = ideasshortlistPK;
    }

    public Ideasshortlist(IdeasshortlistPK ideasshortlistPK, int id, int treatedstatus) {
        this.ideasshortlistPK = ideasshortlistPK;
        this.id = id;
        this.treatedstatus = treatedstatus;
    }

    public Ideasshortlist(int idealid, int studentid) {
        this.ideasshortlistPK = new IdeasshortlistPK(idealid, studentid);
    }

    public IdeasshortlistPK getIdeasshortlistPK() {
        return ideasshortlistPK;
    }

    public void setIdeasshortlistPK(IdeasshortlistPK ideasshortlistPK) {
        this.ideasshortlistPK = ideasshortlistPK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTreatedstatus() {
        return treatedstatus;
    }

    public void setTreatedstatus(int treatedstatus) {
        this.treatedstatus = treatedstatus;
    }

    public Integer getTreatredby() {
        return treatredby;
    }

    public void setTreatredby(Integer treatredby) {
        this.treatredby = treatredby;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideasshortlistPK != null ? ideasshortlistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ideasshortlist)) {
            return false;
        }
        Ideasshortlist other = (Ideasshortlist) object;
        if ((this.ideasshortlistPK == null && other.ideasshortlistPK != null) || (this.ideasshortlistPK != null && !this.ideasshortlistPK.equals(other.ideasshortlistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Ideasshortlist[ ideasshortlistPK=" + ideasshortlistPK + " ]";
    }
    
}

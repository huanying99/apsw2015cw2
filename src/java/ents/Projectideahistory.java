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
@Table(name = "PROJECTIDEAHISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projectideahistory.findAll", query = "SELECT p FROM Projectideahistory p"),
    @NamedQuery(name = "Projectideahistory.findByProjectideahistoryid", query = "SELECT p FROM Projectideahistory p WHERE p.projectideahistoryid = :projectideahistoryid"),
    @NamedQuery(name = "Projectideahistory.findByProjectideaid", query = "SELECT p FROM Projectideahistory p WHERE p.projectideaid = :projectideaid"),
    @NamedQuery(name = "Projectideahistory.findByOwnerid", query = "SELECT p FROM Projectideahistory p WHERE p.ownerid = :ownerid"),
    @NamedQuery(name = "Projectideahistory.findByTitle", query = "SELECT p FROM Projectideahistory p WHERE p.title = :title"),
    @NamedQuery(name = "Projectideahistory.findByPicategory", query = "SELECT p FROM Projectideahistory p WHERE p.picategory = :picategory"),
    @NamedQuery(name = "Projectideahistory.findByNoofstudent", query = "SELECT p FROM Projectideahistory p WHERE p.noofstudent = :noofstudent"),
    @NamedQuery(name = "Projectideahistory.findByPistatus", query = "SELECT p FROM Projectideahistory p WHERE p.pistatus = :pistatus"),
    @NamedQuery(name = "Projectideahistory.findByIdeaaltereddate", query = "SELECT p FROM Projectideahistory p WHERE p.ideaaltereddate = :ideaaltereddate"),
    @NamedQuery(name = "Projectideahistory.findByAlteredby", query = "SELECT p FROM Projectideahistory p WHERE p.alteredby = :alteredby")})
public class Projectideahistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJECTIDEAHISTORYID")
    private Integer projectideahistoryid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJECTIDEAID")
    private int projectideaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OWNERID")
    private int ownerid;
    @Size(max = 200)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "PIDESC")
    private String pidesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "AIM")
    private String aim;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "ACADEMICQUESTION")
    private String academicquestion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PICATEGORY")
    private int picategory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOOFSTUDENT")
    private int noofstudent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PISTATUS")
    private int pistatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEAALTEREDDATE")
    @Temporal(TemporalType.DATE)
    private Date ideaaltereddate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "IDEAALTEREDREASON")
    private String ideaalteredreason;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALTEREDBY")
    private int alteredby;

    public Projectideahistory() {
    }

    public Projectideahistory(Integer projectideahistoryid) {
        this.projectideahistoryid = projectideahistoryid;
    }

    public Projectideahistory(Integer projectideahistoryid, int projectideaid, int ownerid, String pidesc, String aim, String academicquestion, int picategory, int noofstudent, int pistatus, Date ideaaltereddate, String ideaalteredreason, int alteredby) {
        this.projectideahistoryid = projectideahistoryid;
        this.projectideaid = projectideaid;
        this.ownerid = ownerid;
        this.pidesc = pidesc;
        this.aim = aim;
        this.academicquestion = academicquestion;
        this.picategory = picategory;
        this.noofstudent = noofstudent;
        this.pistatus = pistatus;
        this.ideaaltereddate = ideaaltereddate;
        this.ideaalteredreason = ideaalteredreason;
        this.alteredby = alteredby;
    }

    public Integer getProjectideahistoryid() {
        return projectideahistoryid;
    }

    public void setProjectideahistoryid(Integer projectideahistoryid) {
        this.projectideahistoryid = projectideahistoryid;
    }

    public int getProjectideaid() {
        return projectideaid;
    }

    public void setProjectideaid(int projectideaid) {
        this.projectideaid = projectideaid;
    }

    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPidesc() {
        return pidesc;
    }

    public void setPidesc(String pidesc) {
        this.pidesc = pidesc;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getAcademicquestion() {
        return academicquestion;
    }

    public void setAcademicquestion(String academicquestion) {
        this.academicquestion = academicquestion;
    }

    public int getPicategory() {
        return picategory;
    }

    public void setPicategory(int picategory) {
        this.picategory = picategory;
    }

    public int getNoofstudent() {
        return noofstudent;
    }

    public void setNoofstudent(int noofstudent) {
        this.noofstudent = noofstudent;
    }

    public int getPistatus() {
        return pistatus;
    }

    public void setPistatus(int pistatus) {
        this.pistatus = pistatus;
    }

    public Date getIdeaaltereddate() {
        return ideaaltereddate;
    }

    public void setIdeaaltereddate(Date ideaaltereddate) {
        this.ideaaltereddate = ideaaltereddate;
    }

    public String getIdeaalteredreason() {
        return ideaalteredreason;
    }

    public void setIdeaalteredreason(String ideaalteredreason) {
        this.ideaalteredreason = ideaalteredreason;
    }

    public int getAlteredby() {
        return alteredby;
    }

    public void setAlteredby(int alteredby) {
        this.alteredby = alteredby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectideahistoryid != null ? projectideahistoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projectideahistory)) {
            return false;
        }
        Projectideahistory other = (Projectideahistory) object;
        if ((this.projectideahistoryid == null && other.projectideahistoryid != null) || (this.projectideahistoryid != null && !this.projectideahistoryid.equals(other.projectideahistoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Projectideahistory[ projectideahistoryid=" + projectideahistoryid + " ]";
    }
    
}

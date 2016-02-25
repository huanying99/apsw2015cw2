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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "PROJECTIDEAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projectideas.findAll", query = "SELECT p FROM Projectideas p"),
    @NamedQuery(name = "Projectideas.findByProjectideaid", query = "SELECT p FROM Projectideas p WHERE p.projectideaid = :projectideaid"),
    @NamedQuery(name = "Projectideas.findByOwnerid", query = "SELECT p FROM Projectideas p WHERE p.ownerid = :ownerid"),
    @NamedQuery(name = "Projectideas.findByTitle", query = "SELECT p FROM Projectideas p WHERE p.title = :title"),
    @NamedQuery(name = "Projectideas.findByPicategory", query = "SELECT p FROM Projectideas p WHERE p.picategory = :picategory"),
    @NamedQuery(name = "Projectideas.findByNoofstudent", query = "SELECT p FROM Projectideas p WHERE p.noofstudent = :noofstudent"),
    @NamedQuery(name = "Projectideas.findByPistatus", query = "SELECT p FROM Projectideas p WHERE p.pistatus = :pistatus"),
    @NamedQuery(name = "Projectideas.findByApprovaldate", query = "SELECT p FROM Projectideas p WHERE p.approvaldate = :approvaldate"),
    @NamedQuery(name = "Projectideas.findBySubmissiondate", query = "SELECT p FROM Projectideas p WHERE p.submissiondate = :submissiondate")})
public class Projectideas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROJECTIDEAID")
    private Integer projectideaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OWNERID")
    private int ownerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
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
    @Column(name = "APPROVALDATE")
    @Temporal(TemporalType.DATE)
    private Date approvaldate;
    @Column(name = "SUBMISSIONDATE")
    @Temporal(TemporalType.DATE)
    private Date submissiondate;

    public Projectideas() {
    }

    public Projectideas(Integer projectideaid) {
        this.projectideaid = projectideaid;
    }

    public Projectideas(Integer projectideaid, int ownerid, String title, String pidesc, String aim, String academicquestion, int picategory, int noofstudent) {
        this.projectideaid = projectideaid;
        this.ownerid = ownerid;
        this.title = title;
        this.pidesc = pidesc;
        this.aim = aim;
        this.academicquestion = academicquestion;
        this.picategory = picategory;
        this.noofstudent = noofstudent;
//        this.pistatus = pistatus;
    }

    public Integer getProjectideaid() {
        return projectideaid;
    }

    public void setProjectideaid(Integer projectideaid) {
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

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public Date getSubmissiondate() {
        return submissiondate;
    }

    public void setSubmissiondate(Date submissiondate) {
        this.submissiondate = submissiondate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectideaid != null ? projectideaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projectideas)) {
            return false;
        }
        Projectideas other = (Projectideas) object;
        if ((this.projectideaid == null && other.projectideaid != null) || (this.projectideaid != null && !this.projectideaid.equals(other.projectideaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Projectideas[ projectideaid=" + projectideaid + " ]";
    }
    
}

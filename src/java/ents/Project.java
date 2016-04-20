/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ents;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import converters.Convertable;
import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author up792072
 */
@Entity
public class Project implements Serializable, Convertable {

    @OneToMany(mappedBy = "ideapicked")
    private List<Shortlist> ideaspool;
    @ManyToOne
    private Registation ideaowner;
    @OneToMany(mappedBy = "phistory")
    private List<Projecthistory> pversion;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long status;//1--create, 2--approve, 3--allcation, 4--disapprove
    private String pidesc;
    private String aim;
    private String academicquestion;
    private Long picategory;
    private Long noofstudent;
    private Long pistatus;
    private  long  ownerid;
    private Date creationdate;//for idea addition date
    private Date approvaldate;//for coodinator to approve idea, when it is fit for dessertation
    private Date allocationdate;//for coordinator to allocate the idea to student

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Shortlist> getIdeaspool() {
        return ideaspool;
    }

    public void setIdeaspool(List<Shortlist> ideaspool) {
        this.ideaspool = ideaspool;
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

    public Long getPicategory() {
        return picategory;
    }

    public void setPicategory(Long picategory) {
        this.picategory = picategory;
    }

    public Long getNoofstudent() {
        return noofstudent;
    }

    public void setNoofstudent(Long noofstudent) {
        this.noofstudent = noofstudent;
    }

    public long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(long ownerid) {
        this.ownerid = ownerid;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getAllocationdate() {
        return allocationdate;
    }

    public void setAllocationdate(Date allocationdate) {
        this.allocationdate = allocationdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project)) {
            return false;
        }
        Project other = (Project) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

}

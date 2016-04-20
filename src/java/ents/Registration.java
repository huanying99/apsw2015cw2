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
@Table(name = "REGISTRATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r"),
    @NamedQuery(name = "Registration.findById", query = "SELECT r FROM Registration r WHERE r.id = :id"),
    @NamedQuery(name = "Registration.findByStudentid", query = "SELECT r FROM Registration r WHERE r.studentid = :studentid"),
    @NamedQuery(name = "Registration.findByForename", query = "SELECT r FROM Registration r WHERE r.forename = :forename"),
    @NamedQuery(name = "Registration.findByMiddlename", query = "SELECT r FROM Registration r WHERE r.middlename = :middlename"),
    @NamedQuery(name = "Registration.findBySurname", query = "SELECT r FROM Registration r WHERE r.surname = :surname"),
    @NamedQuery(name = "Registration.findByEmailaddr", query = "SELECT r FROM Registration r WHERE r.emailaddr = :emailaddr"),
    @NamedQuery(name = "Registration.findByPhoneno", query = "SELECT r FROM Registration r WHERE r.phoneno = :phoneno"),
    @NamedQuery(name = "Registration.findByPersonstatusid", query = "SELECT r FROM Registration r WHERE r.personstatusid = :personstatusid"),
    @NamedQuery(name = "Registration.findByCohortid", query = "SELECT r FROM Registration r WHERE r.cohortid = :cohortid"),
    @NamedQuery(name = "Registration.findByDepartmentid", query = "SELECT r FROM Registration r WHERE r.departmentid = :departmentid"),
    @NamedQuery(name = "Registration.findByStudentcategoryid", query = "SELECT r FROM Registration r WHERE r.studentcategoryid = :studentcategoryid"),
    @NamedQuery(name = "Registration.findByProjectattempcode", query = "SELECT r FROM Registration r WHERE r.projectattempcode = :projectattempcode"),
    @NamedQuery(name = "Registration.findByRegistrationstatus", query = "SELECT r FROM Registration r WHERE r.registrationstatus = :registrationstatus"),
    @NamedQuery(name = "Registration.findByAccountcreateddate", query = "SELECT r FROM Registration r WHERE r.accountcreateddate = :accountcreateddate"),
    @NamedQuery(name = "Registration.findByAccountconfirmeddate", query = "SELECT r FROM Registration r WHERE r.accountconfirmeddate = :accountconfirmeddate"),
    @NamedQuery(name = "Registration.findByUserexternalorganisationcode", query = "SELECT r FROM Registration r WHERE r.userexternalorganisationcode = :userexternalorganisationcode"),
    @NamedQuery(name = "Registration.findByUserorganisationname", query = "SELECT r FROM Registration r WHERE r.userorganisationname = :userorganisationname"),
    @NamedQuery(name = "Registration.findByUserexternalorganisationaddr", query = "SELECT r FROM Registration r WHERE r.userexternalorganisationaddr = :userexternalorganisationaddr"),
    @NamedQuery(name = "Registration.findByUserexternalorganisationpostcode", query = "SELECT r FROM Registration r WHERE r.userexternalorganisationpostcode = :userexternalorganisationpostcode"),
    @NamedQuery(name = "Registration.findByUserexternalorganisationaccountdesc", query = "SELECT r FROM Registration r WHERE r.userexternalorganisationaccountdesc = :userexternalorganisationaccountdesc"),
    @NamedQuery(name = "Registration.findBySuspensionstatus", query = "SELECT r FROM Registration r WHERE r.suspensionstatus = :suspensionstatus"),
    @NamedQuery(name = "Registration.findByIscoordinator", query = "SELECT r FROM Registration r WHERE r.iscoordinator = :iscoordinator"),
    @NamedQuery(name = "Registration.findByUsername", query = "SELECT r FROM Registration r WHERE r.username = :username"),
    @NamedQuery(name = "Registration.findByPassword", query = "SELECT r FROM Registration r WHERE r.password = :password")})
public class Registration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Size(max = 15)
    @Column(name = "STUDENTID")
    private String studentid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FORENAME")
    private String forename;
    @Size(max = 20)
    @Column(name = "MIDDLENAME")
    private String middlename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAILADDR")
    private String emailaddr;
    @Size(max = 20)
    @Column(name = "PHONENO")
    private String phoneno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERSONSTATUSID")
    private short personstatusid;
    @Column(name = "COHORTID")
    private Integer cohortid;
    @Column(name = "DEPARTMENTID")
    private Integer departmentid;
    @Column(name = "STUDENTCATEGORYID")
    private Integer studentcategoryid;
    @Column(name = "PROJECTATTEMPCODE")
    private Integer projectattempcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGISTRATIONSTATUS")
    private int registrationstatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCOUNTCREATEDDATE")
    @Temporal(TemporalType.DATE)
    private Date accountcreateddate;
    @Column(name = "ACCOUNTCONFIRMEDDATE")
    @Temporal(TemporalType.DATE)
    private Date accountconfirmeddate;
    @Column(name = "USEREXTERNALORGANISATIONCODE")
    private Integer userexternalorganisationcode;
    @Size(max = 150)
    @Column(name = "USERORGANISATIONNAME")
    private String userorganisationname;
    @Size(max = 250)
    @Column(name = "USEREXTERNALORGANISATIONADDR")
    private String userexternalorganisationaddr;
    @Size(max = 10)
    @Column(name = "USEREXTERNALORGANISATIONPOSTCODE")
    private String userexternalorganisationpostcode;
    @Size(max = 250)
    @Column(name = "USEREXTERNALORGANISATIONACCOUNTDESC")
    private String userexternalorganisationaccountdesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUSPENSIONSTATUS")
    private int suspensionstatus;
    @Column(name = "ISCOORDINATOR")
    private Boolean iscoordinator;
    @Size(max = 20)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 20)
    @Column(name = "PASSWORD")
    private String password;

    public Registration() {
    }

    public Registration(Long id) {
        this.id = id;
    }

    public Registration(Long id, String forename, String surname, String emailaddr, short personstatusid, int registrationstatus, Date accountcreateddate, int suspensionstatus) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.emailaddr = emailaddr;
        this.personstatusid = personstatusid;
        this.registrationstatus = registrationstatus;
        this.accountcreateddate = accountcreateddate;
        this.suspensionstatus = suspensionstatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public short getPersonstatusid() {
        return personstatusid;
    }

    public void setPersonstatusid(short personstatusid) {
        this.personstatusid = personstatusid;
    }

    public Integer getCohortid() {
        return cohortid;
    }

    public void setCohortid(Integer cohortid) {
        this.cohortid = cohortid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getStudentcategoryid() {
        return studentcategoryid;
    }

    public void setStudentcategoryid(Integer studentcategoryid) {
        this.studentcategoryid = studentcategoryid;
    }

    public Integer getProjectattempcode() {
        return projectattempcode;
    }

    public void setProjectattempcode(Integer projectattempcode) {
        this.projectattempcode = projectattempcode;
    }

    public int getRegistrationstatus() {
        return registrationstatus;
    }

    public void setRegistrationstatus(int registrationstatus) {
        this.registrationstatus = registrationstatus;
    }

    public Date getAccountcreateddate() {
        return accountcreateddate;
    }

    public void setAccountcreateddate(Date accountcreateddate) {
        this.accountcreateddate = accountcreateddate;
    }

    public Date getAccountconfirmeddate() {
        return accountconfirmeddate;
    }

    public void setAccountconfirmeddate(Date accountconfirmeddate) {
        this.accountconfirmeddate = accountconfirmeddate;
    }

    public Integer getUserexternalorganisationcode() {
        return userexternalorganisationcode;
    }

    public void setUserexternalorganisationcode(Integer userexternalorganisationcode) {
        this.userexternalorganisationcode = userexternalorganisationcode;
    }

    public String getUserorganisationname() {
        return userorganisationname;
    }

    public void setUserorganisationname(String userorganisationname) {
        this.userorganisationname = userorganisationname;
    }

    public String getUserexternalorganisationaddr() {
        return userexternalorganisationaddr;
    }

    public void setUserexternalorganisationaddr(String userexternalorganisationaddr) {
        this.userexternalorganisationaddr = userexternalorganisationaddr;
    }

    public String getUserexternalorganisationpostcode() {
        return userexternalorganisationpostcode;
    }

    public void setUserexternalorganisationpostcode(String userexternalorganisationpostcode) {
        this.userexternalorganisationpostcode = userexternalorganisationpostcode;
    }

    public String getUserexternalorganisationaccountdesc() {
        return userexternalorganisationaccountdesc;
    }

    public void setUserexternalorganisationaccountdesc(String userexternalorganisationaccountdesc) {
        this.userexternalorganisationaccountdesc = userexternalorganisationaccountdesc;
    }

    public int getSuspensionstatus() {
        return suspensionstatus;
    }

    public void setSuspensionstatus(int suspensionstatus) {
        this.suspensionstatus = suspensionstatus;
    }

    public Boolean getIscoordinator() {
        return iscoordinator;
    }

    public void setIscoordinator(Boolean iscoordinator) {
        this.iscoordinator = iscoordinator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Registration[ id=" + id + " ]";
    }
    
}

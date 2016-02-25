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
@Table(name = "MILESTONEFEEDBACK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Milestonefeedback.findAll", query = "SELECT m FROM Milestonefeedback m"),
    @NamedQuery(name = "Milestonefeedback.findByMilestonefeedbackid", query = "SELECT m FROM Milestonefeedback m WHERE m.milestonefeedbackid = :milestonefeedbackid"),
    @NamedQuery(name = "Milestonefeedback.findByMilestonemark", query = "SELECT m FROM Milestonefeedback m WHERE m.milestonemark = :milestonemark"),
    @NamedQuery(name = "Milestonefeedback.findByFeedbacktimeread", query = "SELECT m FROM Milestonefeedback m WHERE m.feedbacktimeread = :feedbacktimeread"),
    @NamedQuery(name = "Milestonefeedback.findByFeedbackrecordeddate", query = "SELECT m FROM Milestonefeedback m WHERE m.feedbackrecordeddate = :feedbackrecordeddate")})
public class Milestonefeedback implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONEFEEDBACKID")
    private Integer milestonefeedbackid;
    @Lob
    @Size(max = 32700)
    @Column(name = "TEXTUALFEEDBACK")
    private String textualfeedback;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MILESTONEMARK")
    private int milestonemark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEEDBACKTIMEREAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedbacktimeread;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEEDBACKRECORDEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feedbackrecordeddate;

    public Milestonefeedback() {
    }

    public Milestonefeedback(Integer milestonefeedbackid) {
        this.milestonefeedbackid = milestonefeedbackid;
    }

    public Milestonefeedback(Integer milestonefeedbackid, int milestonemark, Date feedbacktimeread, Date feedbackrecordeddate) {
        this.milestonefeedbackid = milestonefeedbackid;
        this.milestonemark = milestonemark;
        this.feedbacktimeread = feedbacktimeread;
        this.feedbackrecordeddate = feedbackrecordeddate;
    }

    public Integer getMilestonefeedbackid() {
        return milestonefeedbackid;
    }

    public void setMilestonefeedbackid(Integer milestonefeedbackid) {
        this.milestonefeedbackid = milestonefeedbackid;
    }

    public String getTextualfeedback() {
        return textualfeedback;
    }

    public void setTextualfeedback(String textualfeedback) {
        this.textualfeedback = textualfeedback;
    }

    public int getMilestonemark() {
        return milestonemark;
    }

    public void setMilestonemark(int milestonemark) {
        this.milestonemark = milestonemark;
    }

    public Date getFeedbacktimeread() {
        return feedbacktimeread;
    }

    public void setFeedbacktimeread(Date feedbacktimeread) {
        this.feedbacktimeread = feedbacktimeread;
    }

    public Date getFeedbackrecordeddate() {
        return feedbackrecordeddate;
    }

    public void setFeedbackrecordeddate(Date feedbackrecordeddate) {
        this.feedbackrecordeddate = feedbackrecordeddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (milestonefeedbackid != null ? milestonefeedbackid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Milestonefeedback)) {
            return false;
        }
        Milestonefeedback other = (Milestonefeedback) object;
        if ((this.milestonefeedbackid == null && other.milestonefeedbackid != null) || (this.milestonefeedbackid != null && !this.milestonefeedbackid.equals(other.milestonefeedbackid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.Milestonefeedback[ milestonefeedbackid=" + milestonefeedbackid + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.schoolhealth;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    ActivityType type;
    @ManyToOne
    Institution institution;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date activityDate;
    int studentParticipation;
    int teacherParticpation;
    int totalParticipants;

    @ManyToOne
    Area mohArea;
    @ManyToOne
    Area phiArea;

    @ManyToOne
    WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createAt;

    @ManyToOne
    WebUser phi;
    @ManyToOne
    WebUser moh;
    @ManyToOne
    WebUser amoh;
    @ManyToOne
    WebUser mo;
    @ManyToOne
    WebUser amo_rmo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public int getStudentParticipation() {
        return studentParticipation;
    }

    public void setStudentParticipation(int studentParticipation) {
        this.studentParticipation = studentParticipation;
    }

    public int getTeacherParticpation() {
        return teacherParticpation;
    }

    public void setTeacherParticpation(int teacherParticpation) {
        this.teacherParticpation = teacherParticpation;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public WebUser getPhi() {
        return phi;
    }

    public void setPhi(WebUser phi) {
        this.phi = phi;
    }

    public Area getMohArea() {
        return mohArea;
    }

    public void setMohArea(Area mohArea) {
        this.mohArea = mohArea;
    }

    public Area getPhiArea() {
        return phiArea;
    }

    public void setPhiArea(Area phiArea) {
        this.phiArea = phiArea;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public WebUser getMoh() {
        return moh;
    }

    public void setMoh(WebUser moh) {
        this.moh = moh;
    }

    public WebUser getAmoh() {
        return amoh;
    }

    public void setAmoh(WebUser amoh) {
        this.amoh = amoh;
    }

    public WebUser getMo() {
        return mo;
    }

    public void setMo(WebUser mo) {
        this.mo = mo;
    }

    public WebUser getAmo_rmo() {
        return amo_rmo;
    }

    public void setAmo_rmo(WebUser amo_rmo) {
        this.amo_rmo = amo_rmo;
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
        if (!(object instanceof Activity)) {
            return false;
        }
        Activity other = (Activity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.Activity[ id=" + id + " ]";
    }

}

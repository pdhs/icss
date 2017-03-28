/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.schoolhealth;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
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
public class SchoolMedicalExaminationRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    Area educational_zone;
    @ManyToOne
    Institution school;
    String grade;
    @ManyToOne
    Area moh_division;
    @ManyToOne
    Area phi_area;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date date_screened;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date date_examined;
    
    
    
    @ManyToOne
    WebUser phi;
    @ManyToOne
    WebUser moh_amoh_mo;

    @ManyToOne
    WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Area getEducational_zone() {
        return educational_zone;
    }

    public void setEducational_zone(Area educational_zone) {
        this.educational_zone = educational_zone;
    }

    public Institution getSchool() {
        return school;
    }

    public void setSchool(Institution school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Area getMoh_division() {
        return moh_division;
    }

    public void setMoh_division(Area moh_division) {
        this.moh_division = moh_division;
    }

    public Area getPhi_area() {
        return phi_area;
    }

    public void setPhi_area(Area phi_area) {
        this.phi_area = phi_area;
    }

    public Date getDate_screened() {
        return date_screened;
    }

    public void setDate_screened(Date date_screened) {
        this.date_screened = date_screened;
    }

    public Date getDate_examined() {
        return date_examined;
    }

    public void setDate_examined(Date date_examined) {
        this.date_examined = date_examined;
    }

    public WebUser getPhi() {
        return phi;
    }

    public void setPhi(WebUser phi) {
        this.phi = phi;
    }

    public WebUser getMoh_amoh_mo() {
        return moh_amoh_mo;
    }

    public void setMoh_amoh_mo(WebUser moh_amoh_mo) {
        this.moh_amoh_mo = moh_amoh_mo;
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

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SchoolMedicalExaminationRecord)) {
            return false;
        }
        SchoolMedicalExaminationRecord other = (SchoolMedicalExaminationRecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.SchoolMedicalExaminationRecord[ id=" + id + " ]";
    }

}

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

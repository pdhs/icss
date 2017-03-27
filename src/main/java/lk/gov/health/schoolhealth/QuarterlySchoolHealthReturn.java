/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.schoolhealth;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author User
 */
@Entity
public class QuarterlySchoolHealthReturn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    Area rdhs_division;
    @ManyToOne
    Area moh_area;
    int report_year;
    int report_quarter;

    int total_no_of_schools_less_than_200;
    int total_no_of_schools_more_than_200;
    int total_no_of_schools;

    int no_of_schools_without_latrines_in_less_than_200;
    int no_of_schools_without_latrines_in_less_more_200;
    int no_of_schools_without_latrines;

    int no_of_schools_inadequate_latrines_in_less_than_200;
    int no_of_schools_inadequate_latrines_in_less_more_200;
    int no_of_schools_inadequate_latrines;

    int no_of_schools_without_water_in_less_than_200;
    int no_of_schools_without_water_in_less_more_200;
    int no_of_schools_without_water;

    Month month_1;
    Month month_2;
    Month month_3;

    int reproductive_Health_Programmes_No_Conducted_1;
    int reproductive_Health_Programmes_No_Conducted_2;
    int reproductive_Health_Programmes_No_Conducted_3;
    int reproductive_Health_Programmes_No_Conducted;

    int reproductive_Health_Programmes_Students_1;
    int reproductive_Health_Programmes_Students_2;
    int reproductive_Health_Programmes_Students_3;
    int reproductive_Health_Programmes_Students;

    int reproductive_Health_Programmes_Teachers_1;
    int reproductive_Health_Programmes_Teachers_2;
    int reproductive_Health_Programmes_Teachers_3;
    int reproductive_Health_Programmes_Teachers;

    int life_skills_Health_Programmes_No_Conducted_1;
    int life_skills_Health_Programmes_No_Conducted_2;
    int life_skills_Health_Programmes_No_Conducted_3;
    int life_skills_Health_Programmes_No_Conducted;

    int life_skills_Health_Programmes_Students_1;
    int life_skills_Health_Programmes_Students_2;
    int life_skills_Health_Programmes_Students_3;
    int life_skills_Health_Programmes_Students;

    int life_skills_Health_Programmes_Teachers_1;
    int life_skills_Health_Programmes_Teachers_2;
    int life_skills_Health_Programmes_Teachers_3;
    int life_skills_Health_Programmes_Teachers;

    int com_and_noncom_Health_Programmes_No_Conducted_1;
    int com_and_noncom_Health_Programmes_No_Conducted_2;
    int com_and_noncom_Health_Programmes_No_Conducted_3;
    int com_and_noncom_Health_Programmes_No_Conducted;

    int com_and_noncom_Health_Programmes_Students_1;
    int com_and_noncom_Health_Programmes_Students_2;
    int com_and_noncom_Health_Programmes_Students_3;
    int com_and_noncom_Health_Programmes_Students;

    int com_and_noncom_Health_Programmes_Teachers_1;
    int com_and_noncom_Health_Programmes_Teachers_2;
    int com_and_noncom_Health_Programmes_Teachers_3;
    int com_and_noncom_Health_Programmes_Teachers;

    int nutrition_programmes_Health_Programmes_No_Conducted_1;
    int nutrition_programmes_Health_Programmes_No_Conducted_2;
    int nutrition_programmes_Health_Programmes_No_Conducted_3;
    int nutrition_programmes_Health_Programmes_No_Conducted;

    int nutrition_programmes_Health_Programmes_Students_1;
    int nutrition_programmes_Health_Programmes_Students_2;
    int nutrition_programmes_Health_Programmes_Students_3;
    int nutrition_programmes_Health_Programmes_Students;

    int nutrition_programmes_Health_Programmes_Teachers_1;
    int nutrition_programmes_Health_Programmes_Teachers_2;
    int nutrition_programmes_Health_Programmes_Teachers_3;
    int nutrition_programmes_Health_Programmes_Teachers;

    int students_Councelled_1;
    int students_Councelled_2;
    int students_Councelled_3;
    int students_Councelled;

    int community_Health_1;
    int community_Health_2;
    int community_Health_3;
    int community_Health;

    int other_1;
    int other_2;
    int other_3;
    int other;
    
    int phi_smi_l200;
    int phi_smi_m200;
    int phi_smi;
    
    int moh_smi_l200;
    int moh_smi_m200;
    int moh_smi;

    int amoh_smi_l200;
    int amoh_smi_m200;
    int amoh_smi;

    int mo_smi_l200;
    int mo_smi_m200;
    int mo_smi;

    int rmo_smi_l200;
    int rmo_smi_m200;
    int rmo_smi;
    
    int smi_quarter_l200;
    int smi_quarter_m200;
    int smi_quarter;
    
    int smi_cumulative_l200;
    int smi_cumulative_m200;
    int smi_cumulative;
    
    int smi_l200_m_1;
    int smi_l200_m_4;
    int smi_l200_m_7;
    int smi_l200_m_10;
    int smi_l200_m_other;
    int smi_l200_m_total;
           
    int smi_l200_f_1;
    int smi_l200_f_4;
    int smi_l200_f_7;
    int smi_l200_f_10;
    int smi_l200_f_other;
    int smi_l200_f_total;

    
    
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
        if (!(object instanceof QuarterlySchoolHealthReturn)) {
            return false;
        }
        QuarterlySchoolHealthReturn other = (QuarterlySchoolHealthReturn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.QuarterlySchoolHealthReturn[ id=" + id + " ]";
    }

}

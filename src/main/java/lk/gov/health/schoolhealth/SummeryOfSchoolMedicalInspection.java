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
public class SummeryOfSchoolMedicalInspection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Area educationalZone;
    @ManyToOne
    private Institution school;
    @ManyToOne
    private Area mohArea;
    @ManyToOne
    private Area phiArea;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateExamined;
    String schoolCensusNo;
    @ManyToOne
    WebUser creator;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createdAt;
    

    private int totalNoOfChildren1Male;
    private int totalNoOfChildren1Female;
    private int totalNoOfChildren4Male;
    private int totalNoOfChildren4Female;
    private int totalNoOfChildren7Male;
    private int totalNoOfChildren7Female;
    private int totalNoOfChildren10Male;
    private int totalNoOfChildren10Female;
    private int totalNoOfChildrenOtherMale;
    private int totalNoOfChildrenOtherFemale;
    private int totalNoOfChildrenMale;
    private int totalNoOfChildrenFemale;
    private int totalNoOfChildrenMalePercentage;
    private int totalNoOfChildren1FemalePercentage;

    private int numberExaminedOfChildren1Male;
    private int numberExaminedOfChildren1Female;
    private int numberExaminedOfChildren4Male;
    private int numberExaminedOfChildren4Female;
    private int numberExaminedOfChildren7Male;
    private int numberExaminedOfChildren7Female;
    private int numberExaminedOfChildren10Male;
    private int numberExaminedOfChildren10Female;
    private int numberExaminedOfChildrenOtherMale;
    private int numberExaminedOfChildrenOtherFemale;
    private int numberExaminedOfChildrenMale;
    private int numberExaminedOfChildrenFemale;
    private int numberExaminedOfChildrenMalePercentage;
    private int numberExaminedOfChildren1FemalePercentage;

    private int numberOfDefectsOfChildren1Male;
    private int numberOfDefectsOfChildren1Female;
    private int numberOfDefectsOfChildren4Male;
    private int numberOfDefectsOfChildren4Female;
    private int numberOfDefectsOfChildren7Male;
    private int numberOfDefectsOfChildren7Female;
    private int numberOfDefectsOfChildren10Male;
    private int numberOfDefectsOfChildren10Female;
    private int numberOfDefectsOfChildrenOtherMale;
    private int numberOfDefectsOfChildrenOtherFemale;
    private int numberOfDefectsOfChildrenMale;
    private int numberOfDefectsOfChildrenFemale;
    private int numberOfDefectsOfChildrenMalePercentage;
    private int numberOfDefectsOfChildren1FemalePercentage;

    private int numberOfDefectsOf1Male;
    private int numberOfDefectsOf1Female;
    private int numberOfDefectsOf4Male;
    private int numberOfDefectsOf4Female;
    private int numberOfDefectsOf7Male;
    private int numberOfDefectsOf7Female;
    private int numberOfDefectsOf10Male;
    private int numberOfDefectsOf10Female;
    private int numberOfDefectsOfOtherMale;
    private int numberOfDefectsOfOtherFemale;
    private int numberOfDefectsOfMale;
    private int numberOfDefectsOfFemale;
    private int numberOfDefectsOfMalePercentage;
    private int numberOfDefectsOf1FemalePercentage;

    
    private int numberGivenAdtVaccinesOfChildren1Male;
    private int numberGivenAdtVaccinesOfChildren1Female;
    private int numberGivenAdtVaccinesOfChildren4Male;
    private int numberGivenAdtVaccinesOfChildren4Female;
    private int numberGivenAdtVaccinesOfChildren7Male;
    private int numberGivenAdtVaccinesOfChildren7Female;
    private int numberGivenAdtVaccinesOfChildren10Male;
    private int numberGivenAdtVaccinesOfChildren10Female;
    private int numberGivenAdtVaccinesOfChildrenOtherMale;
    private int numberGivenAdtVaccinesOfChildrenOtherFemale;
    private int numberGivenAdtVaccinesOfChildrenMale;
    private int numberGivenAdtVaccinesOfChildrenFemale;
    private int numberGivenAdtVaccinesOfChildrenMalePercentage;
    private int numberGivenAdtVaccinesOfChildren1FemalePercentage;

    private int numberGivenVitaminOfChildren1Male;
    private int numberGivenVitaminOfChildren1Female;
    private int numberGivenVitaminOfChildren4Male;
    private int numberGivenVitaminOfChildren4Female;
    private int numberGivenVitaminOfChildren7Male;
    private int numberGivenVitaminOfChildren7Female;
    private int numberGivenVitaminOfChildren10Male;
    private int numberGivenVitaminOfChildren10Female;
    private int numberGivenVitaminOfChildrenOtherMale;
    private int numberGivenVitaminOfChildrenOtherFemale;
    private int numberGivenVitaminOfChildrenMale;
    private int numberGivenVitaminOfChildrenFemale;
    private int numberGivenVitaminOfChildrenMalePercentage;
    private int numberGivenVitaminOfChildren1FemalePercentage;

    private int stuntingOfChildren1Male;
    private int stuntingOfChildren1Female;
    private int stuntingOfChildren4Male;
    private int stuntingOfChildren4Female;
    private int stuntingOfChildren7Male;
    private int stuntingOfChildren7Female;
    private int stuntingOfChildren10Male;
    private int stuntingOfChildren10Female;
    private int stuntingOfChildrenOtherMale;
    private int stuntingOfChildrenOtherFemale;
    private int stuntingOfChildrenMale;
    private int stuntingOfChildrenFemale;
    private int stuntingOfChildrenMalePercentage;
    private int stuntingOfChildren1FemalePercentage;

    private int wastingOfChildren1Male;
    private int wastingOfChildren1Female;
    private int wastingOfChildren4Male;
    private int wastingOfChildren4Female;
    private int wastingOfChildren7Male;
    private int wastingOfChildren7Female;
    private int wastingOfChildren10Male;
    private int wastingOfChildren10Female;
    private int wastingOfChildrenOtherMale;
    private int wastingOfChildrenOtherFemale;
    private int wastingOfChildrenMale;
    private int wastingOfChildrenFemale;
    private int wastingOfChildrenMalePercentage;
    private int wastingOfChildren1FemalePercentage;

    private int overweightOfChildren1Male;
    private int overweightOfChildren1Female;
    private int overweightOfChildren4Male;
    private int overweightOfChildren4Female;
    private int overweightOfChildren7Male;
    private int overweightOfChildren7Female;
    private int overweightOfChildren10Male;
    private int overweightOfChildren10Female;
    private int overweightOfChildrenOtherMale;
    private int overweightOfChildrenOtherFemale;
    private int overweightOfChildrenMale;
    private int overweightOfChildrenFemale;
    private int overweightOfChildrenMalePercentage;
    private int overweightOfChildren1FemalePercentage;

    private int obesityChildren1Male;
    private int obesityChildren1Female;
    private int obesityChildren4Male;
    private int obesityChildren4Female;
    private int obesityChildren7Male;
    private int obesityChildren7Female;
    private int obesityChildren10Male;
    private int obesityChildren10Female;
    private int obesityChildrenOtherMale;
    private int obesityChildrenOtherFemale;
    private int obesityChildrenMale;
    private int obesityChildrenFemale;
    private int obesityChildrenMalePercentage;
    private int obesityChildren1FemalePercentage;

    private int visualDefectsChildren1Male;
    private int visualDefectsChildren1Female;
    private int visualDefectsChildren4Male;
    private int visualDefectsChildren4Female;
    private int visualDefectsChildren7Male;
    private int visualDefectsChildren7Female;
    private int visualDefectsChildren10Male;
    private int visualDefectsChildren10Female;
    private int visualDefectsChildrenOtherMale;
    private int visualDefectsChildrenOtherFemale;
    private int visualDefectsChildrenMale;
    private int visualDefectsChildrenFemale;
    private int visualDefectsChildrenMalePercentage;
    private int visualDefectsChildren1FemalePercentage;

    private int hearingDefectsChildren1Male;
    private int hearingDefectsChildren1Female;
    private int hearingDefectsChildren4Male;
    private int hearingDefectsChildren4Female;
    private int hearingDefectsChildren7Male;
    private int hearingDefectsChildren7Female;
    private int hearingDefectsChildren10Male;
    private int hearingDefectsChildren10Female;
    private int hearingDefectsChildrenOtherMale;
    private int hearingDefectsChildrenOtherFemale;
    private int hearingDefectsChildrenMale;
    private int hearingDefectsChildrenFemale;
    private int hearingDefectsChildrenMalePercentage;
    private int hearingDefectsChildren1FemalePercentage;

    private int speechDeefctsChildren1Male;
    private int speechDeefctsChildren1Female;
    private int speechDeefctsChildren4Male;
    private int speechDeefctsChildren4Female;
    private int speechDeefctsChildren7Male;
    private int speechDeefctsChildren7Female;
    private int speechDeefctsChildren10Male;
    private int speechDeefctsChildren10Female;
    private int speechDeefctsChildrenOtherMale;
    private int speechDeefctsChildrenOtherFemale;
    private int speechDeefctsChildrenMale;
    private int speechDeefctsChildrenFemale;
    private int speechDeefctsChildrenMalePercentage;
    private int speechDeefctsChildren1FemalePercentage;

    private int pallorChildren1Male;
    private int pallorChildren1Female;
    private int pallorChildren4Male;
    private int pallorChildren4Female;
    private int pallorChildren7Male;
    private int pallorChildren7Female;
    private int pallorChildren10Male;
    private int pallorChildren10Female;
    private int pallorChildrenOtherMale;
    private int pallorChildrenOtherFemale;
    private int pallorChildrenMale;
    private int pallorChildrenFemale;
    private int pallorChildrenMalePercentage;
    private int pallorChildren1FemalePercentage;

    private int dentalCariesChildren1Male;
    private int dentalCariesChildren1Female;
    private int dentalCariesChildren4Male;
    private int dentalCariesChildren4Female;
    private int dentalCariesChildren7Male;
    private int dentalCariesChildren7Female;
    private int dentalCariesChildren10Male;
    private int dentalCariesChildren10Female;
    private int dentalCariesChildrenOtherMale;
    private int dentalCariesChildrenOtherFemale;
    private int dentalCariesChildrenMale;
    private int dentalCariesChildrenFemale;
    private int dentalCariesChildrenMalePercentage;
    private int dentalCariesChildren1FemalePercentage;

    private int calculusChildren1Male;
    private int calculusChildren1Female;
    private int calculusChildren4Male;
    private int calculusChildren4Female;
    private int calculusChildren7Male;
    private int calculusChildren7Female;
    private int calculusChildren10Male;
    private int calculusChildren10Female;
    private int calculusChildrenOtherMale;
    private int calculusChildrenOtherFemale;
    private int calculusChildrenMale;
    private int calculusChildrenFemale;
    private int calculusChildrenMalePercentage;
    private int calculusChildren1FemalePercentage;

    private int entDefectsChildren1Male;
    private int entDefectsChildren1Female;
    private int entDefectsChildren4Male;
    private int entDefectsChildren4Female;
    private int entDefectsChildren7Male;
    private int entDefectsChildren7Female;
    private int entDefectsChildren10Male;
    private int entDefectsChildren10Female;
    private int entDefectsChildrenOtherMale;
    private int entDefectsChildrenOtherFemale;
    private int entDefectsChildrenMale;
    private int entDefectsChildrenFemale;
    private int entDefectsChildrenMalePercentage;
    private int entDefectsChildren1FemalePercentage;

    private int heartDeceasesChildren1Male;
    private int heartDeceasesChildren1Female;
    private int heartDeceasesChildren4Male;
    private int heartDeceasesChildren4Female;
    private int heartDeceasesChildren7Male;
    private int heartDeceasesChildren7Female;
    private int heartDeceasesChildren10Male;
    private int heartDeceasesChildren10Female;
    private int heartDeceasesChildrenOtherMale;
    private int heartDeceasesChildrenOtherFemale;
    private int heartDeceasesChildrenMale;
    private int heartDeceasesChildrenFemale;
    private int heartDeceasesChildrenMalePercentage;
    private int heartDeceasesChildren1FemalePercentage;

    private int asthmaChildren1Male;
    private int asthmaChildren1Female;
    private int asthmaChildren4Male;
    private int asthmaChildren4Female;
    private int asthmaChildren7Male;
    private int asthmaChildren7Female;
    private int asthmaChildren10Male;
    private int asthmaChildren10Female;
    private int asthmaChildrenOtherMale;
    private int asthmaChildrenOtherFemale;
    private int asthmaChildrenMale;
    private int asthmaChildrenFemale;
    private int asthmaChildrenMalePercentage;
    private int asthmaChildren1FemalePercentage;

    private int behaviouralProblemsChildren1Male;
    private int behaviouralProblemsChildren1Female;
    private int behaviouralProblemsChildren4Male;
    private int behaviouralProblemsChildren4Female;
    private int behaviouralProblemsChildren7Male;
    private int behaviouralProblemsChildren7Female;
    private int behaviouralProblemsChildren10Male;
    private int behaviouralProblemsChildren10Female;
    private int behaviouralProblemsChildrenOtherMale;
    private int behaviouralProblemsChildrenOtherFemale;
    private int behaviouralProblemsChildrenMale;
    private int behaviouralProblemsChildrenFemale;
    private int behaviouralProblemsChildrenMalePercentage;
    private int behaviouralProblemsChildren1FemalePercentage;

    private int learningDifficultiesChildren1Male;
    private int learningDifficultiesChildren1Female;
    private int learningDifficultiesChildren4Male;
    private int learningDifficultiesChildren4Female;
    private int learningDifficultiesChildren7Male;
    private int learningDifficultiesChildren7Female;
    private int learningDifficultiesChildren10Male;
    private int learningDifficultiesChildren10Female;
    private int learningDifficultiesChildrenOtherMale;
    private int learningDifficultiesChildrenOtherFemale;
    private int learningDifficultiesChildrenMale;
    private int learningDifficultiesChildrenFemale;
    private int learningDifficultiesChildrenMalePercentage;
    private int learningDifficultiesChildren1FemalePercentage;

    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem1;
    private int otherHealthProblem1Children1Male;
    private int otherHealthProblem1Children1Female;
    private int otherHealthProblem1Children4Male;
    private int otherHealthProblem1Children4Female;
    private int otherHealthProblem1Children7Male;
    private int otherHealthProblem1Children7Female;
    private int otherHealthProblem1Children10Male;
    private int otherHealthProblem1Children10Female;
    private int otherHealthProblem1ChildrenOtherMale;
    private int otherHealthProblem1ChildrenOtherFemale;
    private int otherHealthProblem1ChildrenMale;
    private int otherHealthProblem1ChildrenFemale;
    private int otherHealthProblem1ChildrenMalePercentage;
    private int otherHealthProblem1Children1FemalePercentage;

    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem2;
    private int otherHealthProblem2Children1Male;
    private int otherHealthProblem2Children1Female;
    private int otherHealthProblem2Children4Male;
    private int otherHealthProblem2Children4Female;
    private int otherHealthProblem2Children7Male;
    private int otherHealthProblem2Children7Female;
    private int otherHealthProblem2Children10Male;
    private int otherHealthProblem2Children10Female;
    private int otherHealthProblem2ChildrenOtherMale;
    private int otherHealthProblem2ChildrenOtherFemale;
    private int otherHealthProblem2ChildrenMale;
    private int otherHealthProblem2ChildrenFemale;
    private int otherHealthProblem2ChildrenMalePercentage;
    private int otherHealthProblem2Children1FemalePercentage;

    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem3;
    private int otherHealthProblem3Children1Male;
    private int otherHealthProblem3Children1Female;
    private int otherHealthProblem3Children4Male;
    private int otherHealthProblem3Children4Female;
    private int otherHealthProblem3Children7Male;
    private int otherHealthProblem3Children7Female;
    private int otherHealthProblem3Children10Male;
    private int otherHealthProblem3Children10Female;
    private int otherHealthProblem3ChildrenOtherMale;
    private int otherHealthProblem3ChildrenOtherFemale;
    private int otherHealthProblem3ChildrenMale;
    private int otherHealthProblem3ChildrenFemale;
    private int otherHealthProblem3ChildrenMalePercentage;
    private int otherHealthProblem3Children1FemalePercentage;

    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem4;
    private int otherHealthProblem4Children1Male;
    private int otherHealthProblem4Children1Female;
    private int otherHealthProblem4Children4Male;
    private int otherHealthProblem4Children4Female;
    private int otherHealthProblem4Children7Male;
    private int otherHealthProblem4Children7Female;
    private int otherHealthProblem4Children10Male;
    private int otherHealthProblem4Children10Female;
    private int otherHealthProblem4ChildrenOtherMale;
    private int otherHealthProblem4ChildrenOtherFemale;
    private int otherHealthProblem4ChildrenMale;
    private int otherHealthProblem4ChildrenFemale;
    private int otherHealthProblem4ChildrenMalePercentage;
    private int otherHealthProblem4Children1FemalePercentage;

    
    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem5;
    private int otherHealthProblem5Children1Male;
    private int otherHealthProblem5Children1Female;
    private int otherHealthProblem5Children4Male;
    private int otherHealthProblem5Children4Female;
    private int otherHealthProblem5Children7Male;
    private int otherHealthProblem5Children7Female;
    private int otherHealthProblem5Children10Male;
    private int otherHealthProblem5Children10Female;
    private int otherHealthProblem5ChildrenOtherMale;
    private int otherHealthProblem5ChildrenOtherFemale;
    private int otherHealthProblem5ChildrenMale;
    private int otherHealthProblem5ChildrenFemale;
    private int otherHealthProblem5ChildrenMalePercentage;
    private int otherHealthProblem5Children1FemalePercentage;

    
    
    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem6;
    private int otherHealthProblem6Children1Male;
    private int otherHealthProblem6Children1Female;
    private int otherHealthProblem6Children4Male;
    private int otherHealthProblem6Children4Female;
    private int otherHealthProblem6Children7Male;
    private int otherHealthProblem6Children7Female;
    private int otherHealthProblem6Children10Male;
    private int otherHealthProblem6Children10Female;
    private int otherHealthProblem6ChildrenOtherMale;
    private int otherHealthProblem6ChildrenOtherFemale;
    private int otherHealthProblem6ChildrenMale;
    private int otherHealthProblem6ChildrenFemale;
    private int otherHealthProblem6ChildrenMalePercentage;
    private int otherHealthProblem6Children1FemalePercentage;

    
    
    @Enumerated(EnumType.STRING)
    private HealthProblem otherHealthProblem7;
    private int otherHealthProblem7Children1Male;
    private int otherHealthProblem7Children1Female;
    private int otherHealthProblem7Children4Male;
    private int otherHealthProblem7Children4Female;
    private int otherHealthProblem7Children7Male;
    private int otherHealthProblem7Children7Female;
    private int otherHealthProblem7Children10Male;
    private int otherHealthProblem7Children10Female;
    private int otherHealthProblem7ChildrenOtherMale;
    private int otherHealthProblem7ChildrenOtherFemale;
    private int otherHealthProblem7ChildrenMale;
    private int otherHealthProblem7ChildrenFemale;
    private int otherHealthProblem7ChildrenMalePercentage;
    private int otherHealthProblem7Children1FemalePercentage;

    
    @ManyToOne
    private WebUser phi;
    @ManyToOne
    private WebUser moh;
    @ManyToOne
    private WebUser amoh;
    @ManyToOne
    private WebUser mo;
    
    
    
    
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
        if (!(object instanceof SummeryOfSchoolMedicalInspection)) {
            return false;
        }
        SummeryOfSchoolMedicalInspection other = (SummeryOfSchoolMedicalInspection) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.SummeryOfSchoolMedicalInspection[ id=" + id + " ]";
    }

    public Area getEducationalZone() {
        return educationalZone;
    }

    public void setEducationalZone(Area educationalZone) {
        this.educationalZone = educationalZone;
    }

    public Institution getSchool() {
        return school;
    }

    public void setSchool(Institution school) {
        this.school = school;
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

    public Date getDateExamined() {
        return dateExamined;
    }

    public void setDateExamined(Date dateExamined) {
        this.dateExamined = dateExamined;
    }

    public int getTotalNoOfChildren1Male() {
        return totalNoOfChildren1Male;
    }

    public void setTotalNoOfChildren1Male(int totalNoOfChildren1Male) {
        this.totalNoOfChildren1Male = totalNoOfChildren1Male;
    }

    public int getTotalNoOfChildren1Female() {
        return totalNoOfChildren1Female;
    }

    public void setTotalNoOfChildren1Female(int totalNoOfChildren1Female) {
        this.totalNoOfChildren1Female = totalNoOfChildren1Female;
    }

    public int getTotalNoOfChildren4Male() {
        return totalNoOfChildren4Male;
    }

    public void setTotalNoOfChildren4Male(int totalNoOfChildren4Male) {
        this.totalNoOfChildren4Male = totalNoOfChildren4Male;
    }

    public int getTotalNoOfChildren4Female() {
        return totalNoOfChildren4Female;
    }

    public void setTotalNoOfChildren4Female(int totalNoOfChildren4Female) {
        this.totalNoOfChildren4Female = totalNoOfChildren4Female;
    }

    public int getTotalNoOfChildren7Male() {
        return totalNoOfChildren7Male;
    }

    public void setTotalNoOfChildren7Male(int totalNoOfChildren7Male) {
        this.totalNoOfChildren7Male = totalNoOfChildren7Male;
    }

    public int getTotalNoOfChildren7Female() {
        return totalNoOfChildren7Female;
    }

    public void setTotalNoOfChildren7Female(int totalNoOfChildren7Female) {
        this.totalNoOfChildren7Female = totalNoOfChildren7Female;
    }

    public int getTotalNoOfChildren10Male() {
        return totalNoOfChildren10Male;
    }

    public void setTotalNoOfChildren10Male(int totalNoOfChildren10Male) {
        this.totalNoOfChildren10Male = totalNoOfChildren10Male;
    }

    public int getTotalNoOfChildren10Female() {
        return totalNoOfChildren10Female;
    }

    public void setTotalNoOfChildren10Female(int totalNoOfChildren10Female) {
        this.totalNoOfChildren10Female = totalNoOfChildren10Female;
    }

    public int getTotalNoOfChildrenOtherMale() {
        return totalNoOfChildrenOtherMale;
    }

    public void setTotalNoOfChildrenOtherMale(int totalNoOfChildrenOtherMale) {
        this.totalNoOfChildrenOtherMale = totalNoOfChildrenOtherMale;
    }

    public int getTotalNoOfChildrenOtherFemale() {
        return totalNoOfChildrenOtherFemale;
    }

    public void setTotalNoOfChildrenOtherFemale(int totalNoOfChildrenOtherFemale) {
        this.totalNoOfChildrenOtherFemale = totalNoOfChildrenOtherFemale;
    }

    public int getTotalNoOfChildrenMale() {
        return totalNoOfChildrenMale;
    }

    public void setTotalNoOfChildrenMale(int totalNoOfChildrenMale) {
        this.totalNoOfChildrenMale = totalNoOfChildrenMale;
    }

    public int getTotalNoOfChildrenFemale() {
        return totalNoOfChildrenFemale;
    }

    public void setTotalNoOfChildrenFemale(int totalNoOfChildrenFemale) {
        this.totalNoOfChildrenFemale = totalNoOfChildrenFemale;
    }

    public int getTotalNoOfChildrenMalePercentage() {
        return totalNoOfChildrenMalePercentage;
    }

    public void setTotalNoOfChildrenMalePercentage(int totalNoOfChildrenMalePercentage) {
        this.totalNoOfChildrenMalePercentage = totalNoOfChildrenMalePercentage;
    }

    public int getTotalNoOfChildren1FemalePercentage() {
        return totalNoOfChildren1FemalePercentage;
    }

    public void setTotalNoOfChildren1FemalePercentage(int totalNoOfChildren1FemalePercentage) {
        this.totalNoOfChildren1FemalePercentage = totalNoOfChildren1FemalePercentage;
    }

    public int getNumberExaminedOfChildren1Male() {
        return numberExaminedOfChildren1Male;
    }

    public void setNumberExaminedOfChildren1Male(int numberExaminedOfChildren1Male) {
        this.numberExaminedOfChildren1Male = numberExaminedOfChildren1Male;
    }

    public int getNumberExaminedOfChildren1Female() {
        return numberExaminedOfChildren1Female;
    }

    public void setNumberExaminedOfChildren1Female(int numberExaminedOfChildren1Female) {
        this.numberExaminedOfChildren1Female = numberExaminedOfChildren1Female;
    }

    public int getNumberExaminedOfChildren4Male() {
        return numberExaminedOfChildren4Male;
    }

    public void setNumberExaminedOfChildren4Male(int numberExaminedOfChildren4Male) {
        this.numberExaminedOfChildren4Male = numberExaminedOfChildren4Male;
    }

    public int getNumberExaminedOfChildren4Female() {
        return numberExaminedOfChildren4Female;
    }

    public void setNumberExaminedOfChildren4Female(int numberExaminedOfChildren4Female) {
        this.numberExaminedOfChildren4Female = numberExaminedOfChildren4Female;
    }

    public int getNumberExaminedOfChildren7Male() {
        return numberExaminedOfChildren7Male;
    }

    public void setNumberExaminedOfChildren7Male(int numberExaminedOfChildren7Male) {
        this.numberExaminedOfChildren7Male = numberExaminedOfChildren7Male;
    }

    public int getNumberExaminedOfChildren7Female() {
        return numberExaminedOfChildren7Female;
    }

    public void setNumberExaminedOfChildren7Female(int numberExaminedOfChildren7Female) {
        this.numberExaminedOfChildren7Female = numberExaminedOfChildren7Female;
    }

    public int getNumberExaminedOfChildren10Male() {
        return numberExaminedOfChildren10Male;
    }

    public void setNumberExaminedOfChildren10Male(int numberExaminedOfChildren10Male) {
        this.numberExaminedOfChildren10Male = numberExaminedOfChildren10Male;
    }

    public int getNumberExaminedOfChildren10Female() {
        return numberExaminedOfChildren10Female;
    }

    public void setNumberExaminedOfChildren10Female(int numberExaminedOfChildren10Female) {
        this.numberExaminedOfChildren10Female = numberExaminedOfChildren10Female;
    }

    public int getNumberExaminedOfChildrenOtherMale() {
        return numberExaminedOfChildrenOtherMale;
    }

    public void setNumberExaminedOfChildrenOtherMale(int numberExaminedOfChildrenOtherMale) {
        this.numberExaminedOfChildrenOtherMale = numberExaminedOfChildrenOtherMale;
    }

    public int getNumberExaminedOfChildrenOtherFemale() {
        return numberExaminedOfChildrenOtherFemale;
    }

    public void setNumberExaminedOfChildrenOtherFemale(int numberExaminedOfChildrenOtherFemale) {
        this.numberExaminedOfChildrenOtherFemale = numberExaminedOfChildrenOtherFemale;
    }

    public int getNumberExaminedOfChildrenMale() {
        return numberExaminedOfChildrenMale;
    }

    public void setNumberExaminedOfChildrenMale(int numberExaminedOfChildrenMale) {
        this.numberExaminedOfChildrenMale = numberExaminedOfChildrenMale;
    }

    public int getNumberExaminedOfChildrenFemale() {
        return numberExaminedOfChildrenFemale;
    }

    public void setNumberExaminedOfChildrenFemale(int numberExaminedOfChildrenFemale) {
        this.numberExaminedOfChildrenFemale = numberExaminedOfChildrenFemale;
    }

    public int getNumberExaminedOfChildrenMalePercentage() {
        return numberExaminedOfChildrenMalePercentage;
    }

    public void setNumberExaminedOfChildrenMalePercentage(int numberExaminedOfChildrenMalePercentage) {
        this.numberExaminedOfChildrenMalePercentage = numberExaminedOfChildrenMalePercentage;
    }

    public int getNumberExaminedOfChildren1FemalePercentage() {
        return numberExaminedOfChildren1FemalePercentage;
    }

    public void setNumberExaminedOfChildren1FemalePercentage(int numberExaminedOfChildren1FemalePercentage) {
        this.numberExaminedOfChildren1FemalePercentage = numberExaminedOfChildren1FemalePercentage;
    }

    public int getNumberOfDefectsOfChildren1Male() {
        return numberOfDefectsOfChildren1Male;
    }

    public void setNumberOfDefectsOfChildren1Male(int numberOfDefectsOfChildren1Male) {
        this.numberOfDefectsOfChildren1Male = numberOfDefectsOfChildren1Male;
    }

    public int getNumberOfDefectsOfChildren1Female() {
        return numberOfDefectsOfChildren1Female;
    }

    public void setNumberOfDefectsOfChildren1Female(int numberOfDefectsOfChildren1Female) {
        this.numberOfDefectsOfChildren1Female = numberOfDefectsOfChildren1Female;
    }

    public int getNumberOfDefectsOfChildren4Male() {
        return numberOfDefectsOfChildren4Male;
    }

    public void setNumberOfDefectsOfChildren4Male(int numberOfDefectsOfChildren4Male) {
        this.numberOfDefectsOfChildren4Male = numberOfDefectsOfChildren4Male;
    }

    public int getNumberOfDefectsOfChildren4Female() {
        return numberOfDefectsOfChildren4Female;
    }

    public void setNumberOfDefectsOfChildren4Female(int numberOfDefectsOfChildren4Female) {
        this.numberOfDefectsOfChildren4Female = numberOfDefectsOfChildren4Female;
    }

    public int getNumberOfDefectsOfChildren7Male() {
        return numberOfDefectsOfChildren7Male;
    }

    public void setNumberOfDefectsOfChildren7Male(int numberOfDefectsOfChildren7Male) {
        this.numberOfDefectsOfChildren7Male = numberOfDefectsOfChildren7Male;
    }

    public int getNumberOfDefectsOfChildren7Female() {
        return numberOfDefectsOfChildren7Female;
    }

    public void setNumberOfDefectsOfChildren7Female(int numberOfDefectsOfChildren7Female) {
        this.numberOfDefectsOfChildren7Female = numberOfDefectsOfChildren7Female;
    }

    public int getNumberOfDefectsOfChildren10Male() {
        return numberOfDefectsOfChildren10Male;
    }

    public void setNumberOfDefectsOfChildren10Male(int numberOfDefectsOfChildren10Male) {
        this.numberOfDefectsOfChildren10Male = numberOfDefectsOfChildren10Male;
    }

    public int getNumberOfDefectsOfChildren10Female() {
        return numberOfDefectsOfChildren10Female;
    }

    public void setNumberOfDefectsOfChildren10Female(int numberOfDefectsOfChildren10Female) {
        this.numberOfDefectsOfChildren10Female = numberOfDefectsOfChildren10Female;
    }

    public int getNumberOfDefectsOfChildrenOtherMale() {
        return numberOfDefectsOfChildrenOtherMale;
    }

    public void setNumberOfDefectsOfChildrenOtherMale(int numberOfDefectsOfChildrenOtherMale) {
        this.numberOfDefectsOfChildrenOtherMale = numberOfDefectsOfChildrenOtherMale;
    }

    public int getNumberOfDefectsOfChildrenOtherFemale() {
        return numberOfDefectsOfChildrenOtherFemale;
    }

    public void setNumberOfDefectsOfChildrenOtherFemale(int numberOfDefectsOfChildrenOtherFemale) {
        this.numberOfDefectsOfChildrenOtherFemale = numberOfDefectsOfChildrenOtherFemale;
    }

    public int getNumberOfDefectsOfChildrenMale() {
        return numberOfDefectsOfChildrenMale;
    }

    public void setNumberOfDefectsOfChildrenMale(int numberOfDefectsOfChildrenMale) {
        this.numberOfDefectsOfChildrenMale = numberOfDefectsOfChildrenMale;
    }

    public int getNumberOfDefectsOfChildrenFemale() {
        return numberOfDefectsOfChildrenFemale;
    }

    public void setNumberOfDefectsOfChildrenFemale(int numberOfDefectsOfChildrenFemale) {
        this.numberOfDefectsOfChildrenFemale = numberOfDefectsOfChildrenFemale;
    }

    public int getNumberOfDefectsOfChildrenMalePercentage() {
        return numberOfDefectsOfChildrenMalePercentage;
    }

    public void setNumberOfDefectsOfChildrenMalePercentage(int numberOfDefectsOfChildrenMalePercentage) {
        this.numberOfDefectsOfChildrenMalePercentage = numberOfDefectsOfChildrenMalePercentage;
    }

    public int getNumberOfDefectsOfChildren1FemalePercentage() {
        return numberOfDefectsOfChildren1FemalePercentage;
    }

    public void setNumberOfDefectsOfChildren1FemalePercentage(int numberOfDefectsOfChildren1FemalePercentage) {
        this.numberOfDefectsOfChildren1FemalePercentage = numberOfDefectsOfChildren1FemalePercentage;
    }

    public int getNumberGivenAdtVaccinesOfChildren1Male() {
        return numberGivenAdtVaccinesOfChildren1Male;
    }

    public void setNumberGivenAdtVaccinesOfChildren1Male(int numberGivenAdtVaccinesOfChildren1Male) {
        this.numberGivenAdtVaccinesOfChildren1Male = numberGivenAdtVaccinesOfChildren1Male;
    }

    public int getNumberGivenAdtVaccinesOfChildren1Female() {
        return numberGivenAdtVaccinesOfChildren1Female;
    }

    public void setNumberGivenAdtVaccinesOfChildren1Female(int numberGivenAdtVaccinesOfChildren1Female) {
        this.numberGivenAdtVaccinesOfChildren1Female = numberGivenAdtVaccinesOfChildren1Female;
    }

    public int getNumberGivenAdtVaccinesOfChildren4Male() {
        return numberGivenAdtVaccinesOfChildren4Male;
    }

    public void setNumberGivenAdtVaccinesOfChildren4Male(int numberGivenAdtVaccinesOfChildren4Male) {
        this.numberGivenAdtVaccinesOfChildren4Male = numberGivenAdtVaccinesOfChildren4Male;
    }

    public int getNumberGivenAdtVaccinesOfChildren4Female() {
        return numberGivenAdtVaccinesOfChildren4Female;
    }

    public void setNumberGivenAdtVaccinesOfChildren4Female(int numberGivenAdtVaccinesOfChildren4Female) {
        this.numberGivenAdtVaccinesOfChildren4Female = numberGivenAdtVaccinesOfChildren4Female;
    }

    public int getNumberGivenAdtVaccinesOfChildren7Male() {
        return numberGivenAdtVaccinesOfChildren7Male;
    }

    public void setNumberGivenAdtVaccinesOfChildren7Male(int numberGivenAdtVaccinesOfChildren7Male) {
        this.numberGivenAdtVaccinesOfChildren7Male = numberGivenAdtVaccinesOfChildren7Male;
    }

    public int getNumberGivenAdtVaccinesOfChildren7Female() {
        return numberGivenAdtVaccinesOfChildren7Female;
    }

    public void setNumberGivenAdtVaccinesOfChildren7Female(int numberGivenAdtVaccinesOfChildren7Female) {
        this.numberGivenAdtVaccinesOfChildren7Female = numberGivenAdtVaccinesOfChildren7Female;
    }

    public int getNumberGivenAdtVaccinesOfChildren10Male() {
        return numberGivenAdtVaccinesOfChildren10Male;
    }

    public void setNumberGivenAdtVaccinesOfChildren10Male(int numberGivenAdtVaccinesOfChildren10Male) {
        this.numberGivenAdtVaccinesOfChildren10Male = numberGivenAdtVaccinesOfChildren10Male;
    }

    public int getNumberGivenAdtVaccinesOfChildren10Female() {
        return numberGivenAdtVaccinesOfChildren10Female;
    }

    public void setNumberGivenAdtVaccinesOfChildren10Female(int numberGivenAdtVaccinesOfChildren10Female) {
        this.numberGivenAdtVaccinesOfChildren10Female = numberGivenAdtVaccinesOfChildren10Female;
    }

    public int getNumberGivenAdtVaccinesOfChildrenOtherMale() {
        return numberGivenAdtVaccinesOfChildrenOtherMale;
    }

    public void setNumberGivenAdtVaccinesOfChildrenOtherMale(int numberGivenAdtVaccinesOfChildrenOtherMale) {
        this.numberGivenAdtVaccinesOfChildrenOtherMale = numberGivenAdtVaccinesOfChildrenOtherMale;
    }

    public int getNumberGivenAdtVaccinesOfChildrenOtherFemale() {
        return numberGivenAdtVaccinesOfChildrenOtherFemale;
    }

    public void setNumberGivenAdtVaccinesOfChildrenOtherFemale(int numberGivenAdtVaccinesOfChildrenOtherFemale) {
        this.numberGivenAdtVaccinesOfChildrenOtherFemale = numberGivenAdtVaccinesOfChildrenOtherFemale;
    }

    public int getNumberGivenAdtVaccinesOfChildrenMale() {
        return numberGivenAdtVaccinesOfChildrenMale;
    }

    public void setNumberGivenAdtVaccinesOfChildrenMale(int numberGivenAdtVaccinesOfChildrenMale) {
        this.numberGivenAdtVaccinesOfChildrenMale = numberGivenAdtVaccinesOfChildrenMale;
    }

    public int getNumberGivenAdtVaccinesOfChildrenFemale() {
        return numberGivenAdtVaccinesOfChildrenFemale;
    }

    public void setNumberGivenAdtVaccinesOfChildrenFemale(int numberGivenAdtVaccinesOfChildrenFemale) {
        this.numberGivenAdtVaccinesOfChildrenFemale = numberGivenAdtVaccinesOfChildrenFemale;
    }

    public int getNumberGivenAdtVaccinesOfChildrenMalePercentage() {
        return numberGivenAdtVaccinesOfChildrenMalePercentage;
    }

    public void setNumberGivenAdtVaccinesOfChildrenMalePercentage(int numberGivenAdtVaccinesOfChildrenMalePercentage) {
        this.numberGivenAdtVaccinesOfChildrenMalePercentage = numberGivenAdtVaccinesOfChildrenMalePercentage;
    }

    public int getNumberGivenAdtVaccinesOfChildren1FemalePercentage() {
        return numberGivenAdtVaccinesOfChildren1FemalePercentage;
    }

    public void setNumberGivenAdtVaccinesOfChildren1FemalePercentage(int numberGivenAdtVaccinesOfChildren1FemalePercentage) {
        this.numberGivenAdtVaccinesOfChildren1FemalePercentage = numberGivenAdtVaccinesOfChildren1FemalePercentage;
    }

    public int getNumberGivenVitaminOfChildren1Male() {
        return numberGivenVitaminOfChildren1Male;
    }

    public void setNumberGivenVitaminOfChildren1Male(int numberGivenVitaminOfChildren1Male) {
        this.numberGivenVitaminOfChildren1Male = numberGivenVitaminOfChildren1Male;
    }

    public int getNumberGivenVitaminOfChildren1Female() {
        return numberGivenVitaminOfChildren1Female;
    }

    public void setNumberGivenVitaminOfChildren1Female(int numberGivenVitaminOfChildren1Female) {
        this.numberGivenVitaminOfChildren1Female = numberGivenVitaminOfChildren1Female;
    }

    public int getNumberGivenVitaminOfChildren4Male() {
        return numberGivenVitaminOfChildren4Male;
    }

    public void setNumberGivenVitaminOfChildren4Male(int numberGivenVitaminOfChildren4Male) {
        this.numberGivenVitaminOfChildren4Male = numberGivenVitaminOfChildren4Male;
    }

    public int getNumberGivenVitaminOfChildren4Female() {
        return numberGivenVitaminOfChildren4Female;
    }

    public void setNumberGivenVitaminOfChildren4Female(int numberGivenVitaminOfChildren4Female) {
        this.numberGivenVitaminOfChildren4Female = numberGivenVitaminOfChildren4Female;
    }

    public int getNumberGivenVitaminOfChildren7Male() {
        return numberGivenVitaminOfChildren7Male;
    }

    public void setNumberGivenVitaminOfChildren7Male(int numberGivenVitaminOfChildren7Male) {
        this.numberGivenVitaminOfChildren7Male = numberGivenVitaminOfChildren7Male;
    }

    public int getNumberGivenVitaminOfChildren7Female() {
        return numberGivenVitaminOfChildren7Female;
    }

    public void setNumberGivenVitaminOfChildren7Female(int numberGivenVitaminOfChildren7Female) {
        this.numberGivenVitaminOfChildren7Female = numberGivenVitaminOfChildren7Female;
    }

    public int getNumberGivenVitaminOfChildren10Male() {
        return numberGivenVitaminOfChildren10Male;
    }

    public void setNumberGivenVitaminOfChildren10Male(int numberGivenVitaminOfChildren10Male) {
        this.numberGivenVitaminOfChildren10Male = numberGivenVitaminOfChildren10Male;
    }

    public int getNumberGivenVitaminOfChildren10Female() {
        return numberGivenVitaminOfChildren10Female;
    }

    public void setNumberGivenVitaminOfChildren10Female(int numberGivenVitaminOfChildren10Female) {
        this.numberGivenVitaminOfChildren10Female = numberGivenVitaminOfChildren10Female;
    }

    public int getNumberGivenVitaminOfChildrenOtherMale() {
        return numberGivenVitaminOfChildrenOtherMale;
    }

    public void setNumberGivenVitaminOfChildrenOtherMale(int numberGivenVitaminOfChildrenOtherMale) {
        this.numberGivenVitaminOfChildrenOtherMale = numberGivenVitaminOfChildrenOtherMale;
    }

    public int getNumberGivenVitaminOfChildrenOtherFemale() {
        return numberGivenVitaminOfChildrenOtherFemale;
    }

    public void setNumberGivenVitaminOfChildrenOtherFemale(int numberGivenVitaminOfChildrenOtherFemale) {
        this.numberGivenVitaminOfChildrenOtherFemale = numberGivenVitaminOfChildrenOtherFemale;
    }

    public int getNumberGivenVitaminOfChildrenMale() {
        return numberGivenVitaminOfChildrenMale;
    }

    public void setNumberGivenVitaminOfChildrenMale(int numberGivenVitaminOfChildrenMale) {
        this.numberGivenVitaminOfChildrenMale = numberGivenVitaminOfChildrenMale;
    }

    public int getNumberGivenVitaminOfChildrenFemale() {
        return numberGivenVitaminOfChildrenFemale;
    }

    public void setNumberGivenVitaminOfChildrenFemale(int numberGivenVitaminOfChildrenFemale) {
        this.numberGivenVitaminOfChildrenFemale = numberGivenVitaminOfChildrenFemale;
    }

    public int getNumberGivenVitaminOfChildrenMalePercentage() {
        return numberGivenVitaminOfChildrenMalePercentage;
    }

    public void setNumberGivenVitaminOfChildrenMalePercentage(int numberGivenVitaminOfChildrenMalePercentage) {
        this.numberGivenVitaminOfChildrenMalePercentage = numberGivenVitaminOfChildrenMalePercentage;
    }

    public int getNumberGivenVitaminOfChildren1FemalePercentage() {
        return numberGivenVitaminOfChildren1FemalePercentage;
    }

    public void setNumberGivenVitaminOfChildren1FemalePercentage(int numberGivenVitaminOfChildren1FemalePercentage) {
        this.numberGivenVitaminOfChildren1FemalePercentage = numberGivenVitaminOfChildren1FemalePercentage;
    }

    public int getStuntingOfChildren1Male() {
        return stuntingOfChildren1Male;
    }

    public void setStuntingOfChildren1Male(int stuntingOfChildren1Male) {
        this.stuntingOfChildren1Male = stuntingOfChildren1Male;
    }

    public int getStuntingOfChildren1Female() {
        return stuntingOfChildren1Female;
    }

    public void setStuntingOfChildren1Female(int stuntingOfChildren1Female) {
        this.stuntingOfChildren1Female = stuntingOfChildren1Female;
    }

    public int getStuntingOfChildren4Male() {
        return stuntingOfChildren4Male;
    }

    public void setStuntingOfChildren4Male(int stuntingOfChildren4Male) {
        this.stuntingOfChildren4Male = stuntingOfChildren4Male;
    }

    public int getStuntingOfChildren4Female() {
        return stuntingOfChildren4Female;
    }

    public void setStuntingOfChildren4Female(int stuntingOfChildren4Female) {
        this.stuntingOfChildren4Female = stuntingOfChildren4Female;
    }

    public int getStuntingOfChildren7Male() {
        return stuntingOfChildren7Male;
    }

    public void setStuntingOfChildren7Male(int stuntingOfChildren7Male) {
        this.stuntingOfChildren7Male = stuntingOfChildren7Male;
    }

    public int getStuntingOfChildren7Female() {
        return stuntingOfChildren7Female;
    }

    public void setStuntingOfChildren7Female(int stuntingOfChildren7Female) {
        this.stuntingOfChildren7Female = stuntingOfChildren7Female;
    }

    public int getStuntingOfChildren10Male() {
        return stuntingOfChildren10Male;
    }

    public void setStuntingOfChildren10Male(int stuntingOfChildren10Male) {
        this.stuntingOfChildren10Male = stuntingOfChildren10Male;
    }

    public int getStuntingOfChildren10Female() {
        return stuntingOfChildren10Female;
    }

    public void setStuntingOfChildren10Female(int stuntingOfChildren10Female) {
        this.stuntingOfChildren10Female = stuntingOfChildren10Female;
    }

    public int getStuntingOfChildrenOtherMale() {
        return stuntingOfChildrenOtherMale;
    }

    public void setStuntingOfChildrenOtherMale(int stuntingOfChildrenOtherMale) {
        this.stuntingOfChildrenOtherMale = stuntingOfChildrenOtherMale;
    }

    public int getStuntingOfChildrenOtherFemale() {
        return stuntingOfChildrenOtherFemale;
    }

    public void setStuntingOfChildrenOtherFemale(int stuntingOfChildrenOtherFemale) {
        this.stuntingOfChildrenOtherFemale = stuntingOfChildrenOtherFemale;
    }

    public int getStuntingOfChildrenMale() {
        return stuntingOfChildrenMale;
    }

    public void setStuntingOfChildrenMale(int stuntingOfChildrenMale) {
        this.stuntingOfChildrenMale = stuntingOfChildrenMale;
    }

    public int getStuntingOfChildrenFemale() {
        return stuntingOfChildrenFemale;
    }

    public void setStuntingOfChildrenFemale(int stuntingOfChildrenFemale) {
        this.stuntingOfChildrenFemale = stuntingOfChildrenFemale;
    }

    public int getStuntingOfChildrenMalePercentage() {
        return stuntingOfChildrenMalePercentage;
    }

    public void setStuntingOfChildrenMalePercentage(int stuntingOfChildrenMalePercentage) {
        this.stuntingOfChildrenMalePercentage = stuntingOfChildrenMalePercentage;
    }

    public int getStuntingOfChildren1FemalePercentage() {
        return stuntingOfChildren1FemalePercentage;
    }

    public void setStuntingOfChildren1FemalePercentage(int stuntingOfChildren1FemalePercentage) {
        this.stuntingOfChildren1FemalePercentage = stuntingOfChildren1FemalePercentage;
    }

    public int getWastingOfChildren1Male() {
        return wastingOfChildren1Male;
    }

    public void setWastingOfChildren1Male(int wastingOfChildren1Male) {
        this.wastingOfChildren1Male = wastingOfChildren1Male;
    }

    public int getWastingOfChildren1Female() {
        return wastingOfChildren1Female;
    }

    public void setWastingOfChildren1Female(int wastingOfChildren1Female) {
        this.wastingOfChildren1Female = wastingOfChildren1Female;
    }

    public int getWastingOfChildren4Male() {
        return wastingOfChildren4Male;
    }

    public void setWastingOfChildren4Male(int wastingOfChildren4Male) {
        this.wastingOfChildren4Male = wastingOfChildren4Male;
    }

    public int getWastingOfChildren4Female() {
        return wastingOfChildren4Female;
    }

    public void setWastingOfChildren4Female(int wastingOfChildren4Female) {
        this.wastingOfChildren4Female = wastingOfChildren4Female;
    }

    public int getWastingOfChildren7Male() {
        return wastingOfChildren7Male;
    }

    public void setWastingOfChildren7Male(int wastingOfChildren7Male) {
        this.wastingOfChildren7Male = wastingOfChildren7Male;
    }

    public int getWastingOfChildren7Female() {
        return wastingOfChildren7Female;
    }

    public void setWastingOfChildren7Female(int wastingOfChildren7Female) {
        this.wastingOfChildren7Female = wastingOfChildren7Female;
    }

    public int getWastingOfChildren10Male() {
        return wastingOfChildren10Male;
    }

    public void setWastingOfChildren10Male(int wastingOfChildren10Male) {
        this.wastingOfChildren10Male = wastingOfChildren10Male;
    }

    public int getWastingOfChildren10Female() {
        return wastingOfChildren10Female;
    }

    public void setWastingOfChildren10Female(int wastingOfChildren10Female) {
        this.wastingOfChildren10Female = wastingOfChildren10Female;
    }

    public int getWastingOfChildrenOtherMale() {
        return wastingOfChildrenOtherMale;
    }

    public void setWastingOfChildrenOtherMale(int wastingOfChildrenOtherMale) {
        this.wastingOfChildrenOtherMale = wastingOfChildrenOtherMale;
    }

    public int getWastingOfChildrenOtherFemale() {
        return wastingOfChildrenOtherFemale;
    }

    public void setWastingOfChildrenOtherFemale(int wastingOfChildrenOtherFemale) {
        this.wastingOfChildrenOtherFemale = wastingOfChildrenOtherFemale;
    }

    public int getWastingOfChildrenMale() {
        return wastingOfChildrenMale;
    }

    public void setWastingOfChildrenMale(int wastingOfChildrenMale) {
        this.wastingOfChildrenMale = wastingOfChildrenMale;
    }

    public int getWastingOfChildrenFemale() {
        return wastingOfChildrenFemale;
    }

    public void setWastingOfChildrenFemale(int wastingOfChildrenFemale) {
        this.wastingOfChildrenFemale = wastingOfChildrenFemale;
    }

    public int getWastingOfChildrenMalePercentage() {
        return wastingOfChildrenMalePercentage;
    }

    public void setWastingOfChildrenMalePercentage(int wastingOfChildrenMalePercentage) {
        this.wastingOfChildrenMalePercentage = wastingOfChildrenMalePercentage;
    }

    public int getWastingOfChildren1FemalePercentage() {
        return wastingOfChildren1FemalePercentage;
    }

    public void setWastingOfChildren1FemalePercentage(int wastingOfChildren1FemalePercentage) {
        this.wastingOfChildren1FemalePercentage = wastingOfChildren1FemalePercentage;
    }

    public int getOverweightOfChildren1Male() {
        return overweightOfChildren1Male;
    }

    public void setOverweightOfChildren1Male(int overweightOfChildren1Male) {
        this.overweightOfChildren1Male = overweightOfChildren1Male;
    }

    public int getOverweightOfChildren1Female() {
        return overweightOfChildren1Female;
    }

    public void setOverweightOfChildren1Female(int overweightOfChildren1Female) {
        this.overweightOfChildren1Female = overweightOfChildren1Female;
    }

    public int getOverweightOfChildren4Male() {
        return overweightOfChildren4Male;
    }

    public void setOverweightOfChildren4Male(int overweightOfChildren4Male) {
        this.overweightOfChildren4Male = overweightOfChildren4Male;
    }

    public int getOverweightOfChildren4Female() {
        return overweightOfChildren4Female;
    }

    public void setOverweightOfChildren4Female(int overweightOfChildren4Female) {
        this.overweightOfChildren4Female = overweightOfChildren4Female;
    }

    public int getOverweightOfChildren7Male() {
        return overweightOfChildren7Male;
    }

    public void setOverweightOfChildren7Male(int overweightOfChildren7Male) {
        this.overweightOfChildren7Male = overweightOfChildren7Male;
    }

    public int getOverweightOfChildren7Female() {
        return overweightOfChildren7Female;
    }

    public void setOverweightOfChildren7Female(int overweightOfChildren7Female) {
        this.overweightOfChildren7Female = overweightOfChildren7Female;
    }

    public int getOverweightOfChildren10Male() {
        return overweightOfChildren10Male;
    }

    public void setOverweightOfChildren10Male(int overweightOfChildren10Male) {
        this.overweightOfChildren10Male = overweightOfChildren10Male;
    }

    public int getOverweightOfChildren10Female() {
        return overweightOfChildren10Female;
    }

    public void setOverweightOfChildren10Female(int overweightOfChildren10Female) {
        this.overweightOfChildren10Female = overweightOfChildren10Female;
    }

    public int getOverweightOfChildrenOtherMale() {
        return overweightOfChildrenOtherMale;
    }

    public void setOverweightOfChildrenOtherMale(int overweightOfChildrenOtherMale) {
        this.overweightOfChildrenOtherMale = overweightOfChildrenOtherMale;
    }

    public int getOverweightOfChildrenOtherFemale() {
        return overweightOfChildrenOtherFemale;
    }

    public void setOverweightOfChildrenOtherFemale(int overweightOfChildrenOtherFemale) {
        this.overweightOfChildrenOtherFemale = overweightOfChildrenOtherFemale;
    }

    public int getOverweightOfChildrenMale() {
        return overweightOfChildrenMale;
    }

    public void setOverweightOfChildrenMale(int overweightOfChildrenMale) {
        this.overweightOfChildrenMale = overweightOfChildrenMale;
    }

    public int getOverweightOfChildrenFemale() {
        return overweightOfChildrenFemale;
    }

    public void setOverweightOfChildrenFemale(int overweightOfChildrenFemale) {
        this.overweightOfChildrenFemale = overweightOfChildrenFemale;
    }

    public int getOverweightOfChildrenMalePercentage() {
        return overweightOfChildrenMalePercentage;
    }

    public void setOverweightOfChildrenMalePercentage(int overweightOfChildrenMalePercentage) {
        this.overweightOfChildrenMalePercentage = overweightOfChildrenMalePercentage;
    }

    public int getOverweightOfChildren1FemalePercentage() {
        return overweightOfChildren1FemalePercentage;
    }

    public void setOverweightOfChildren1FemalePercentage(int overweightOfChildren1FemalePercentage) {
        this.overweightOfChildren1FemalePercentage = overweightOfChildren1FemalePercentage;
    }

    public int getObesityChildren1Male() {
        return obesityChildren1Male;
    }

    public void setObesityChildren1Male(int obesityChildren1Male) {
        this.obesityChildren1Male = obesityChildren1Male;
    }

    public int getObesityChildren1Female() {
        return obesityChildren1Female;
    }

    public void setObesityChildren1Female(int obesityChildren1Female) {
        this.obesityChildren1Female = obesityChildren1Female;
    }

    public int getObesityChildren4Male() {
        return obesityChildren4Male;
    }

    public void setObesityChildren4Male(int obesityChildren4Male) {
        this.obesityChildren4Male = obesityChildren4Male;
    }

    public int getObesityChildren4Female() {
        return obesityChildren4Female;
    }

    public void setObesityChildren4Female(int obesityChildren4Female) {
        this.obesityChildren4Female = obesityChildren4Female;
    }

    public int getObesityChildren7Male() {
        return obesityChildren7Male;
    }

    public void setObesityChildren7Male(int obesityChildren7Male) {
        this.obesityChildren7Male = obesityChildren7Male;
    }

    public int getObesityChildren7Female() {
        return obesityChildren7Female;
    }

    public void setObesityChildren7Female(int obesityChildren7Female) {
        this.obesityChildren7Female = obesityChildren7Female;
    }

    public int getObesityChildren10Male() {
        return obesityChildren10Male;
    }

    public void setObesityChildren10Male(int obesityChildren10Male) {
        this.obesityChildren10Male = obesityChildren10Male;
    }

    public int getObesityChildren10Female() {
        return obesityChildren10Female;
    }

    public void setObesityChildren10Female(int obesityChildren10Female) {
        this.obesityChildren10Female = obesityChildren10Female;
    }

    public int getObesityChildrenOtherMale() {
        return obesityChildrenOtherMale;
    }

    public void setObesityChildrenOtherMale(int obesityChildrenOtherMale) {
        this.obesityChildrenOtherMale = obesityChildrenOtherMale;
    }

    public int getObesityChildrenOtherFemale() {
        return obesityChildrenOtherFemale;
    }

    public void setObesityChildrenOtherFemale(int obesityChildrenOtherFemale) {
        this.obesityChildrenOtherFemale = obesityChildrenOtherFemale;
    }

    public int getObesityChildrenMale() {
        return obesityChildrenMale;
    }

    public void setObesityChildrenMale(int obesityChildrenMale) {
        this.obesityChildrenMale = obesityChildrenMale;
    }

    public int getObesityChildrenFemale() {
        return obesityChildrenFemale;
    }

    public void setObesityChildrenFemale(int obesityChildrenFemale) {
        this.obesityChildrenFemale = obesityChildrenFemale;
    }

    public int getObesityChildrenMalePercentage() {
        return obesityChildrenMalePercentage;
    }

    public void setObesityChildrenMalePercentage(int obesityChildrenMalePercentage) {
        this.obesityChildrenMalePercentage = obesityChildrenMalePercentage;
    }

    public int getObesityChildren1FemalePercentage() {
        return obesityChildren1FemalePercentage;
    }

    public void setObesityChildren1FemalePercentage(int obesityChildren1FemalePercentage) {
        this.obesityChildren1FemalePercentage = obesityChildren1FemalePercentage;
    }

    public int getVisualDefectsChildren1Male() {
        return visualDefectsChildren1Male;
    }

    public void setVisualDefectsChildren1Male(int visualDefectsChildren1Male) {
        this.visualDefectsChildren1Male = visualDefectsChildren1Male;
    }

    public int getVisualDefectsChildren1Female() {
        return visualDefectsChildren1Female;
    }

    public void setVisualDefectsChildren1Female(int visualDefectsChildren1Female) {
        this.visualDefectsChildren1Female = visualDefectsChildren1Female;
    }

    public int getVisualDefectsChildren4Male() {
        return visualDefectsChildren4Male;
    }

    public void setVisualDefectsChildren4Male(int visualDefectsChildren4Male) {
        this.visualDefectsChildren4Male = visualDefectsChildren4Male;
    }

    public int getVisualDefectsChildren4Female() {
        return visualDefectsChildren4Female;
    }

    public void setVisualDefectsChildren4Female(int visualDefectsChildren4Female) {
        this.visualDefectsChildren4Female = visualDefectsChildren4Female;
    }

    public int getVisualDefectsChildren7Male() {
        return visualDefectsChildren7Male;
    }

    public void setVisualDefectsChildren7Male(int visualDefectsChildren7Male) {
        this.visualDefectsChildren7Male = visualDefectsChildren7Male;
    }

    public int getVisualDefectsChildren7Female() {
        return visualDefectsChildren7Female;
    }

    public void setVisualDefectsChildren7Female(int visualDefectsChildren7Female) {
        this.visualDefectsChildren7Female = visualDefectsChildren7Female;
    }

    public int getVisualDefectsChildren10Male() {
        return visualDefectsChildren10Male;
    }

    public void setVisualDefectsChildren10Male(int visualDefectsChildren10Male) {
        this.visualDefectsChildren10Male = visualDefectsChildren10Male;
    }

    public int getVisualDefectsChildren10Female() {
        return visualDefectsChildren10Female;
    }

    public void setVisualDefectsChildren10Female(int visualDefectsChildren10Female) {
        this.visualDefectsChildren10Female = visualDefectsChildren10Female;
    }

    public int getVisualDefectsChildrenOtherMale() {
        return visualDefectsChildrenOtherMale;
    }

    public void setVisualDefectsChildrenOtherMale(int visualDefectsChildrenOtherMale) {
        this.visualDefectsChildrenOtherMale = visualDefectsChildrenOtherMale;
    }

    public int getVisualDefectsChildrenOtherFemale() {
        return visualDefectsChildrenOtherFemale;
    }

    public void setVisualDefectsChildrenOtherFemale(int visualDefectsChildrenOtherFemale) {
        this.visualDefectsChildrenOtherFemale = visualDefectsChildrenOtherFemale;
    }

    public int getVisualDefectsChildrenMale() {
        return visualDefectsChildrenMale;
    }

    public void setVisualDefectsChildrenMale(int visualDefectsChildrenMale) {
        this.visualDefectsChildrenMale = visualDefectsChildrenMale;
    }

    public int getVisualDefectsChildrenFemale() {
        return visualDefectsChildrenFemale;
    }

    public void setVisualDefectsChildrenFemale(int visualDefectsChildrenFemale) {
        this.visualDefectsChildrenFemale = visualDefectsChildrenFemale;
    }

    public int getVisualDefectsChildrenMalePercentage() {
        return visualDefectsChildrenMalePercentage;
    }

    public void setVisualDefectsChildrenMalePercentage(int visualDefectsChildrenMalePercentage) {
        this.visualDefectsChildrenMalePercentage = visualDefectsChildrenMalePercentage;
    }

    public int getVisualDefectsChildren1FemalePercentage() {
        return visualDefectsChildren1FemalePercentage;
    }

    public void setVisualDefectsChildren1FemalePercentage(int visualDefectsChildren1FemalePercentage) {
        this.visualDefectsChildren1FemalePercentage = visualDefectsChildren1FemalePercentage;
    }

    public int getHearingDefectsChildren1Male() {
        return hearingDefectsChildren1Male;
    }

    public void setHearingDefectsChildren1Male(int hearingDefectsChildren1Male) {
        this.hearingDefectsChildren1Male = hearingDefectsChildren1Male;
    }

    public int getHearingDefectsChildren1Female() {
        return hearingDefectsChildren1Female;
    }

    public void setHearingDefectsChildren1Female(int hearingDefectsChildren1Female) {
        this.hearingDefectsChildren1Female = hearingDefectsChildren1Female;
    }

    public int getHearingDefectsChildren4Male() {
        return hearingDefectsChildren4Male;
    }

    public void setHearingDefectsChildren4Male(int hearingDefectsChildren4Male) {
        this.hearingDefectsChildren4Male = hearingDefectsChildren4Male;
    }

    public int getHearingDefectsChildren4Female() {
        return hearingDefectsChildren4Female;
    }

    public void setHearingDefectsChildren4Female(int hearingDefectsChildren4Female) {
        this.hearingDefectsChildren4Female = hearingDefectsChildren4Female;
    }

    public int getHearingDefectsChildren7Male() {
        return hearingDefectsChildren7Male;
    }

    public void setHearingDefectsChildren7Male(int hearingDefectsChildren7Male) {
        this.hearingDefectsChildren7Male = hearingDefectsChildren7Male;
    }

    public int getHearingDefectsChildren7Female() {
        return hearingDefectsChildren7Female;
    }

    public void setHearingDefectsChildren7Female(int hearingDefectsChildren7Female) {
        this.hearingDefectsChildren7Female = hearingDefectsChildren7Female;
    }

    public int getHearingDefectsChildren10Male() {
        return hearingDefectsChildren10Male;
    }

    public void setHearingDefectsChildren10Male(int hearingDefectsChildren10Male) {
        this.hearingDefectsChildren10Male = hearingDefectsChildren10Male;
    }

    public int getHearingDefectsChildren10Female() {
        return hearingDefectsChildren10Female;
    }

    public void setHearingDefectsChildren10Female(int hearingDefectsChildren10Female) {
        this.hearingDefectsChildren10Female = hearingDefectsChildren10Female;
    }

    public int getHearingDefectsChildrenOtherMale() {
        return hearingDefectsChildrenOtherMale;
    }

    public void setHearingDefectsChildrenOtherMale(int hearingDefectsChildrenOtherMale) {
        this.hearingDefectsChildrenOtherMale = hearingDefectsChildrenOtherMale;
    }

    public int getHearingDefectsChildrenOtherFemale() {
        return hearingDefectsChildrenOtherFemale;
    }

    public void setHearingDefectsChildrenOtherFemale(int hearingDefectsChildrenOtherFemale) {
        this.hearingDefectsChildrenOtherFemale = hearingDefectsChildrenOtherFemale;
    }

    public int getHearingDefectsChildrenMale() {
        return hearingDefectsChildrenMale;
    }

    public void setHearingDefectsChildrenMale(int hearingDefectsChildrenMale) {
        this.hearingDefectsChildrenMale = hearingDefectsChildrenMale;
    }

    public int getHearingDefectsChildrenFemale() {
        return hearingDefectsChildrenFemale;
    }

    public void setHearingDefectsChildrenFemale(int hearingDefectsChildrenFemale) {
        this.hearingDefectsChildrenFemale = hearingDefectsChildrenFemale;
    }

    public int getHearingDefectsChildrenMalePercentage() {
        return hearingDefectsChildrenMalePercentage;
    }

    public void setHearingDefectsChildrenMalePercentage(int hearingDefectsChildrenMalePercentage) {
        this.hearingDefectsChildrenMalePercentage = hearingDefectsChildrenMalePercentage;
    }

    public int getHearingDefectsChildren1FemalePercentage() {
        return hearingDefectsChildren1FemalePercentage;
    }

    public void setHearingDefectsChildren1FemalePercentage(int hearingDefectsChildren1FemalePercentage) {
        this.hearingDefectsChildren1FemalePercentage = hearingDefectsChildren1FemalePercentage;
    }

    public int getSpeechDeefctsChildren1Male() {
        return speechDeefctsChildren1Male;
    }

    public void setSpeechDeefctsChildren1Male(int speechDeefctsChildren1Male) {
        this.speechDeefctsChildren1Male = speechDeefctsChildren1Male;
    }

    public int getSpeechDeefctsChildren1Female() {
        return speechDeefctsChildren1Female;
    }

    public void setSpeechDeefctsChildren1Female(int speechDeefctsChildren1Female) {
        this.speechDeefctsChildren1Female = speechDeefctsChildren1Female;
    }

    public int getSpeechDeefctsChildren4Male() {
        return speechDeefctsChildren4Male;
    }

    public void setSpeechDeefctsChildren4Male(int speechDeefctsChildren4Male) {
        this.speechDeefctsChildren4Male = speechDeefctsChildren4Male;
    }

    public int getSpeechDeefctsChildren4Female() {
        return speechDeefctsChildren4Female;
    }

    public void setSpeechDeefctsChildren4Female(int speechDeefctsChildren4Female) {
        this.speechDeefctsChildren4Female = speechDeefctsChildren4Female;
    }

    public int getSpeechDeefctsChildren7Male() {
        return speechDeefctsChildren7Male;
    }

    public void setSpeechDeefctsChildren7Male(int speechDeefctsChildren7Male) {
        this.speechDeefctsChildren7Male = speechDeefctsChildren7Male;
    }

    public int getSpeechDeefctsChildren7Female() {
        return speechDeefctsChildren7Female;
    }

    public void setSpeechDeefctsChildren7Female(int speechDeefctsChildren7Female) {
        this.speechDeefctsChildren7Female = speechDeefctsChildren7Female;
    }

    public int getSpeechDeefctsChildren10Male() {
        return speechDeefctsChildren10Male;
    }

    public void setSpeechDeefctsChildren10Male(int speechDeefctsChildren10Male) {
        this.speechDeefctsChildren10Male = speechDeefctsChildren10Male;
    }

    public int getSpeechDeefctsChildren10Female() {
        return speechDeefctsChildren10Female;
    }

    public void setSpeechDeefctsChildren10Female(int speechDeefctsChildren10Female) {
        this.speechDeefctsChildren10Female = speechDeefctsChildren10Female;
    }

    public int getSpeechDeefctsChildrenOtherMale() {
        return speechDeefctsChildrenOtherMale;
    }

    public void setSpeechDeefctsChildrenOtherMale(int speechDeefctsChildrenOtherMale) {
        this.speechDeefctsChildrenOtherMale = speechDeefctsChildrenOtherMale;
    }

    public int getSpeechDeefctsChildrenOtherFemale() {
        return speechDeefctsChildrenOtherFemale;
    }

    public void setSpeechDeefctsChildrenOtherFemale(int speechDeefctsChildrenOtherFemale) {
        this.speechDeefctsChildrenOtherFemale = speechDeefctsChildrenOtherFemale;
    }

    public int getSpeechDeefctsChildrenMale() {
        return speechDeefctsChildrenMale;
    }

    public void setSpeechDeefctsChildrenMale(int speechDeefctsChildrenMale) {
        this.speechDeefctsChildrenMale = speechDeefctsChildrenMale;
    }

    public int getSpeechDeefctsChildrenFemale() {
        return speechDeefctsChildrenFemale;
    }

    public void setSpeechDeefctsChildrenFemale(int speechDeefctsChildrenFemale) {
        this.speechDeefctsChildrenFemale = speechDeefctsChildrenFemale;
    }

    public int getSpeechDeefctsChildrenMalePercentage() {
        return speechDeefctsChildrenMalePercentage;
    }

    public void setSpeechDeefctsChildrenMalePercentage(int speechDeefctsChildrenMalePercentage) {
        this.speechDeefctsChildrenMalePercentage = speechDeefctsChildrenMalePercentage;
    }

    public int getSpeechDeefctsChildren1FemalePercentage() {
        return speechDeefctsChildren1FemalePercentage;
    }

    public void setSpeechDeefctsChildren1FemalePercentage(int speechDeefctsChildren1FemalePercentage) {
        this.speechDeefctsChildren1FemalePercentage = speechDeefctsChildren1FemalePercentage;
    }

    public int getPallorChildren1Male() {
        return pallorChildren1Male;
    }

    public void setPallorChildren1Male(int pallorChildren1Male) {
        this.pallorChildren1Male = pallorChildren1Male;
    }

    public int getPallorChildren1Female() {
        return pallorChildren1Female;
    }

    public void setPallorChildren1Female(int pallorChildren1Female) {
        this.pallorChildren1Female = pallorChildren1Female;
    }

    public int getPallorChildren4Male() {
        return pallorChildren4Male;
    }

    public void setPallorChildren4Male(int pallorChildren4Male) {
        this.pallorChildren4Male = pallorChildren4Male;
    }

    public int getPallorChildren4Female() {
        return pallorChildren4Female;
    }

    public void setPallorChildren4Female(int pallorChildren4Female) {
        this.pallorChildren4Female = pallorChildren4Female;
    }

    public int getPallorChildren7Male() {
        return pallorChildren7Male;
    }

    public void setPallorChildren7Male(int pallorChildren7Male) {
        this.pallorChildren7Male = pallorChildren7Male;
    }

    public int getPallorChildren7Female() {
        return pallorChildren7Female;
    }

    public void setPallorChildren7Female(int pallorChildren7Female) {
        this.pallorChildren7Female = pallorChildren7Female;
    }

    public int getPallorChildren10Male() {
        return pallorChildren10Male;
    }

    public void setPallorChildren10Male(int pallorChildren10Male) {
        this.pallorChildren10Male = pallorChildren10Male;
    }

    public int getPallorChildren10Female() {
        return pallorChildren10Female;
    }

    public void setPallorChildren10Female(int pallorChildren10Female) {
        this.pallorChildren10Female = pallorChildren10Female;
    }

    public int getPallorChildrenOtherMale() {
        return pallorChildrenOtherMale;
    }

    public void setPallorChildrenOtherMale(int pallorChildrenOtherMale) {
        this.pallorChildrenOtherMale = pallorChildrenOtherMale;
    }

    public int getPallorChildrenOtherFemale() {
        return pallorChildrenOtherFemale;
    }

    public void setPallorChildrenOtherFemale(int pallorChildrenOtherFemale) {
        this.pallorChildrenOtherFemale = pallorChildrenOtherFemale;
    }

    public int getPallorChildrenMale() {
        return pallorChildrenMale;
    }

    public void setPallorChildrenMale(int pallorChildrenMale) {
        this.pallorChildrenMale = pallorChildrenMale;
    }

    public int getPallorChildrenFemale() {
        return pallorChildrenFemale;
    }

    public void setPallorChildrenFemale(int pallorChildrenFemale) {
        this.pallorChildrenFemale = pallorChildrenFemale;
    }

    public int getPallorChildrenMalePercentage() {
        return pallorChildrenMalePercentage;
    }

    public void setPallorChildrenMalePercentage(int pallorChildrenMalePercentage) {
        this.pallorChildrenMalePercentage = pallorChildrenMalePercentage;
    }

    public int getPallorChildren1FemalePercentage() {
        return pallorChildren1FemalePercentage;
    }

    public void setPallorChildren1FemalePercentage(int pallorChildren1FemalePercentage) {
        this.pallorChildren1FemalePercentage = pallorChildren1FemalePercentage;
    }

    public int getDentalCariesChildren1Male() {
        return dentalCariesChildren1Male;
    }

    public void setDentalCariesChildren1Male(int dentalCariesChildren1Male) {
        this.dentalCariesChildren1Male = dentalCariesChildren1Male;
    }

    public int getDentalCariesChildren1Female() {
        return dentalCariesChildren1Female;
    }

    public void setDentalCariesChildren1Female(int dentalCariesChildren1Female) {
        this.dentalCariesChildren1Female = dentalCariesChildren1Female;
    }

    public int getDentalCariesChildren4Male() {
        return dentalCariesChildren4Male;
    }

    public void setDentalCariesChildren4Male(int dentalCariesChildren4Male) {
        this.dentalCariesChildren4Male = dentalCariesChildren4Male;
    }

    public int getDentalCariesChildren4Female() {
        return dentalCariesChildren4Female;
    }

    public void setDentalCariesChildren4Female(int dentalCariesChildren4Female) {
        this.dentalCariesChildren4Female = dentalCariesChildren4Female;
    }

    public int getDentalCariesChildren7Male() {
        return dentalCariesChildren7Male;
    }

    public void setDentalCariesChildren7Male(int dentalCariesChildren7Male) {
        this.dentalCariesChildren7Male = dentalCariesChildren7Male;
    }

    public int getDentalCariesChildren7Female() {
        return dentalCariesChildren7Female;
    }

    public void setDentalCariesChildren7Female(int dentalCariesChildren7Female) {
        this.dentalCariesChildren7Female = dentalCariesChildren7Female;
    }

    public int getDentalCariesChildren10Male() {
        return dentalCariesChildren10Male;
    }

    public void setDentalCariesChildren10Male(int dentalCariesChildren10Male) {
        this.dentalCariesChildren10Male = dentalCariesChildren10Male;
    }

    public int getDentalCariesChildren10Female() {
        return dentalCariesChildren10Female;
    }

    public void setDentalCariesChildren10Female(int dentalCariesChildren10Female) {
        this.dentalCariesChildren10Female = dentalCariesChildren10Female;
    }

    public int getDentalCariesChildrenOtherMale() {
        return dentalCariesChildrenOtherMale;
    }

    public void setDentalCariesChildrenOtherMale(int dentalCariesChildrenOtherMale) {
        this.dentalCariesChildrenOtherMale = dentalCariesChildrenOtherMale;
    }

    public int getDentalCariesChildrenOtherFemale() {
        return dentalCariesChildrenOtherFemale;
    }

    public void setDentalCariesChildrenOtherFemale(int dentalCariesChildrenOtherFemale) {
        this.dentalCariesChildrenOtherFemale = dentalCariesChildrenOtherFemale;
    }

    public int getDentalCariesChildrenMale() {
        return dentalCariesChildrenMale;
    }

    public void setDentalCariesChildrenMale(int dentalCariesChildrenMale) {
        this.dentalCariesChildrenMale = dentalCariesChildrenMale;
    }

    public int getDentalCariesChildrenFemale() {
        return dentalCariesChildrenFemale;
    }

    public void setDentalCariesChildrenFemale(int dentalCariesChildrenFemale) {
        this.dentalCariesChildrenFemale = dentalCariesChildrenFemale;
    }

    public int getDentalCariesChildrenMalePercentage() {
        return dentalCariesChildrenMalePercentage;
    }

    public void setDentalCariesChildrenMalePercentage(int dentalCariesChildrenMalePercentage) {
        this.dentalCariesChildrenMalePercentage = dentalCariesChildrenMalePercentage;
    }

    public int getDentalCariesChildren1FemalePercentage() {
        return dentalCariesChildren1FemalePercentage;
    }

    public void setDentalCariesChildren1FemalePercentage(int dentalCariesChildren1FemalePercentage) {
        this.dentalCariesChildren1FemalePercentage = dentalCariesChildren1FemalePercentage;
    }

    public int getCalculusChildren1Male() {
        return calculusChildren1Male;
    }

    public void setCalculusChildren1Male(int calculusChildren1Male) {
        this.calculusChildren1Male = calculusChildren1Male;
    }

    public int getCalculusChildren1Female() {
        return calculusChildren1Female;
    }

    public void setCalculusChildren1Female(int calculusChildren1Female) {
        this.calculusChildren1Female = calculusChildren1Female;
    }

    public int getCalculusChildren4Male() {
        return calculusChildren4Male;
    }

    public void setCalculusChildren4Male(int calculusChildren4Male) {
        this.calculusChildren4Male = calculusChildren4Male;
    }

    public int getCalculusChildren4Female() {
        return calculusChildren4Female;
    }

    public void setCalculusChildren4Female(int calculusChildren4Female) {
        this.calculusChildren4Female = calculusChildren4Female;
    }

    public int getCalculusChildren7Male() {
        return calculusChildren7Male;
    }

    public void setCalculusChildren7Male(int calculusChildren7Male) {
        this.calculusChildren7Male = calculusChildren7Male;
    }

    public int getCalculusChildren7Female() {
        return calculusChildren7Female;
    }

    public void setCalculusChildren7Female(int calculusChildren7Female) {
        this.calculusChildren7Female = calculusChildren7Female;
    }

    public int getCalculusChildren10Male() {
        return calculusChildren10Male;
    }

    public void setCalculusChildren10Male(int calculusChildren10Male) {
        this.calculusChildren10Male = calculusChildren10Male;
    }

    public int getCalculusChildren10Female() {
        return calculusChildren10Female;
    }

    public void setCalculusChildren10Female(int calculusChildren10Female) {
        this.calculusChildren10Female = calculusChildren10Female;
    }

    public int getCalculusChildrenOtherMale() {
        return calculusChildrenOtherMale;
    }

    public void setCalculusChildrenOtherMale(int calculusChildrenOtherMale) {
        this.calculusChildrenOtherMale = calculusChildrenOtherMale;
    }

    public int getCalculusChildrenOtherFemale() {
        return calculusChildrenOtherFemale;
    }

    public void setCalculusChildrenOtherFemale(int calculusChildrenOtherFemale) {
        this.calculusChildrenOtherFemale = calculusChildrenOtherFemale;
    }

    public int getCalculusChildrenMale() {
        return calculusChildrenMale;
    }

    public void setCalculusChildrenMale(int calculusChildrenMale) {
        this.calculusChildrenMale = calculusChildrenMale;
    }

    public int getCalculusChildrenFemale() {
        return calculusChildrenFemale;
    }

    public void setCalculusChildrenFemale(int calculusChildrenFemale) {
        this.calculusChildrenFemale = calculusChildrenFemale;
    }

    public int getCalculusChildrenMalePercentage() {
        return calculusChildrenMalePercentage;
    }

    public void setCalculusChildrenMalePercentage(int calculusChildrenMalePercentage) {
        this.calculusChildrenMalePercentage = calculusChildrenMalePercentage;
    }

    public int getCalculusChildren1FemalePercentage() {
        return calculusChildren1FemalePercentage;
    }

    public void setCalculusChildren1FemalePercentage(int calculusChildren1FemalePercentage) {
        this.calculusChildren1FemalePercentage = calculusChildren1FemalePercentage;
    }

    public int getEntDefectsChildren1Male() {
        return entDefectsChildren1Male;
    }

    public void setEntDefectsChildren1Male(int entDefectsChildren1Male) {
        this.entDefectsChildren1Male = entDefectsChildren1Male;
    }

    public int getEntDefectsChildren1Female() {
        return entDefectsChildren1Female;
    }

    public void setEntDefectsChildren1Female(int entDefectsChildren1Female) {
        this.entDefectsChildren1Female = entDefectsChildren1Female;
    }

    public int getEntDefectsChildren4Male() {
        return entDefectsChildren4Male;
    }

    public void setEntDefectsChildren4Male(int entDefectsChildren4Male) {
        this.entDefectsChildren4Male = entDefectsChildren4Male;
    }

    public int getEntDefectsChildren4Female() {
        return entDefectsChildren4Female;
    }

    public void setEntDefectsChildren4Female(int entDefectsChildren4Female) {
        this.entDefectsChildren4Female = entDefectsChildren4Female;
    }

    public int getEntDefectsChildren7Male() {
        return entDefectsChildren7Male;
    }

    public void setEntDefectsChildren7Male(int entDefectsChildren7Male) {
        this.entDefectsChildren7Male = entDefectsChildren7Male;
    }

    public int getEntDefectsChildren7Female() {
        return entDefectsChildren7Female;
    }

    public void setEntDefectsChildren7Female(int entDefectsChildren7Female) {
        this.entDefectsChildren7Female = entDefectsChildren7Female;
    }

    public int getEntDefectsChildren10Male() {
        return entDefectsChildren10Male;
    }

    public void setEntDefectsChildren10Male(int entDefectsChildren10Male) {
        this.entDefectsChildren10Male = entDefectsChildren10Male;
    }

    public int getEntDefectsChildren10Female() {
        return entDefectsChildren10Female;
    }

    public void setEntDefectsChildren10Female(int entDefectsChildren10Female) {
        this.entDefectsChildren10Female = entDefectsChildren10Female;
    }

    public int getEntDefectsChildrenOtherMale() {
        return entDefectsChildrenOtherMale;
    }

    public void setEntDefectsChildrenOtherMale(int entDefectsChildrenOtherMale) {
        this.entDefectsChildrenOtherMale = entDefectsChildrenOtherMale;
    }

    public int getEntDefectsChildrenOtherFemale() {
        return entDefectsChildrenOtherFemale;
    }

    public void setEntDefectsChildrenOtherFemale(int entDefectsChildrenOtherFemale) {
        this.entDefectsChildrenOtherFemale = entDefectsChildrenOtherFemale;
    }

    public int getEntDefectsChildrenMale() {
        return entDefectsChildrenMale;
    }

    public void setEntDefectsChildrenMale(int entDefectsChildrenMale) {
        this.entDefectsChildrenMale = entDefectsChildrenMale;
    }

    public int getEntDefectsChildrenFemale() {
        return entDefectsChildrenFemale;
    }

    public void setEntDefectsChildrenFemale(int entDefectsChildrenFemale) {
        this.entDefectsChildrenFemale = entDefectsChildrenFemale;
    }

    public int getEntDefectsChildrenMalePercentage() {
        return entDefectsChildrenMalePercentage;
    }

    public void setEntDefectsChildrenMalePercentage(int entDefectsChildrenMalePercentage) {
        this.entDefectsChildrenMalePercentage = entDefectsChildrenMalePercentage;
    }

    public int getEntDefectsChildren1FemalePercentage() {
        return entDefectsChildren1FemalePercentage;
    }

    public void setEntDefectsChildren1FemalePercentage(int entDefectsChildren1FemalePercentage) {
        this.entDefectsChildren1FemalePercentage = entDefectsChildren1FemalePercentage;
    }

    public int getHeartDeceasesChildren1Male() {
        return heartDeceasesChildren1Male;
    }

    public void setHeartDeceasesChildren1Male(int heartDeceasesChildren1Male) {
        this.heartDeceasesChildren1Male = heartDeceasesChildren1Male;
    }

    public int getHeartDeceasesChildren1Female() {
        return heartDeceasesChildren1Female;
    }

    public void setHeartDeceasesChildren1Female(int heartDeceasesChildren1Female) {
        this.heartDeceasesChildren1Female = heartDeceasesChildren1Female;
    }

    public int getHeartDeceasesChildren4Male() {
        return heartDeceasesChildren4Male;
    }

    public void setHeartDeceasesChildren4Male(int heartDeceasesChildren4Male) {
        this.heartDeceasesChildren4Male = heartDeceasesChildren4Male;
    }

    public int getHeartDeceasesChildren4Female() {
        return heartDeceasesChildren4Female;
    }

    public void setHeartDeceasesChildren4Female(int heartDeceasesChildren4Female) {
        this.heartDeceasesChildren4Female = heartDeceasesChildren4Female;
    }

    public int getHeartDeceasesChildren7Male() {
        return heartDeceasesChildren7Male;
    }

    public void setHeartDeceasesChildren7Male(int heartDeceasesChildren7Male) {
        this.heartDeceasesChildren7Male = heartDeceasesChildren7Male;
    }

    public int getHeartDeceasesChildren7Female() {
        return heartDeceasesChildren7Female;
    }

    public void setHeartDeceasesChildren7Female(int heartDeceasesChildren7Female) {
        this.heartDeceasesChildren7Female = heartDeceasesChildren7Female;
    }

    public int getHeartDeceasesChildren10Male() {
        return heartDeceasesChildren10Male;
    }

    public void setHeartDeceasesChildren10Male(int heartDeceasesChildren10Male) {
        this.heartDeceasesChildren10Male = heartDeceasesChildren10Male;
    }

    public int getHeartDeceasesChildren10Female() {
        return heartDeceasesChildren10Female;
    }

    public void setHeartDeceasesChildren10Female(int heartDeceasesChildren10Female) {
        this.heartDeceasesChildren10Female = heartDeceasesChildren10Female;
    }

    public int getHeartDeceasesChildrenOtherMale() {
        return heartDeceasesChildrenOtherMale;
    }

    public void setHeartDeceasesChildrenOtherMale(int heartDeceasesChildrenOtherMale) {
        this.heartDeceasesChildrenOtherMale = heartDeceasesChildrenOtherMale;
    }

    public int getHeartDeceasesChildrenOtherFemale() {
        return heartDeceasesChildrenOtherFemale;
    }

    public void setHeartDeceasesChildrenOtherFemale(int heartDeceasesChildrenOtherFemale) {
        this.heartDeceasesChildrenOtherFemale = heartDeceasesChildrenOtherFemale;
    }

    public int getHeartDeceasesChildrenMale() {
        return heartDeceasesChildrenMale;
    }

    public void setHeartDeceasesChildrenMale(int heartDeceasesChildrenMale) {
        this.heartDeceasesChildrenMale = heartDeceasesChildrenMale;
    }

    public int getHeartDeceasesChildrenFemale() {
        return heartDeceasesChildrenFemale;
    }

    public void setHeartDeceasesChildrenFemale(int heartDeceasesChildrenFemale) {
        this.heartDeceasesChildrenFemale = heartDeceasesChildrenFemale;
    }

    public int getHeartDeceasesChildrenMalePercentage() {
        return heartDeceasesChildrenMalePercentage;
    }

    public void setHeartDeceasesChildrenMalePercentage(int heartDeceasesChildrenMalePercentage) {
        this.heartDeceasesChildrenMalePercentage = heartDeceasesChildrenMalePercentage;
    }

    public int getHeartDeceasesChildren1FemalePercentage() {
        return heartDeceasesChildren1FemalePercentage;
    }

    public void setHeartDeceasesChildren1FemalePercentage(int heartDeceasesChildren1FemalePercentage) {
        this.heartDeceasesChildren1FemalePercentage = heartDeceasesChildren1FemalePercentage;
    }

    public int getAsthmaChildren1Male() {
        return asthmaChildren1Male;
    }

    public void setAsthmaChildren1Male(int asthmaChildren1Male) {
        this.asthmaChildren1Male = asthmaChildren1Male;
    }

    public int getAsthmaChildren1Female() {
        return asthmaChildren1Female;
    }

    public void setAsthmaChildren1Female(int asthmaChildren1Female) {
        this.asthmaChildren1Female = asthmaChildren1Female;
    }

    public int getAsthmaChildren4Male() {
        return asthmaChildren4Male;
    }

    public void setAsthmaChildren4Male(int asthmaChildren4Male) {
        this.asthmaChildren4Male = asthmaChildren4Male;
    }

    public int getAsthmaChildren4Female() {
        return asthmaChildren4Female;
    }

    public void setAsthmaChildren4Female(int asthmaChildren4Female) {
        this.asthmaChildren4Female = asthmaChildren4Female;
    }

    public int getAsthmaChildren7Male() {
        return asthmaChildren7Male;
    }

    public void setAsthmaChildren7Male(int asthmaChildren7Male) {
        this.asthmaChildren7Male = asthmaChildren7Male;
    }

    public int getAsthmaChildren7Female() {
        return asthmaChildren7Female;
    }

    public void setAsthmaChildren7Female(int asthmaChildren7Female) {
        this.asthmaChildren7Female = asthmaChildren7Female;
    }

    public int getAsthmaChildren10Male() {
        return asthmaChildren10Male;
    }

    public void setAsthmaChildren10Male(int asthmaChildren10Male) {
        this.asthmaChildren10Male = asthmaChildren10Male;
    }

    public int getAsthmaChildren10Female() {
        return asthmaChildren10Female;
    }

    public void setAsthmaChildren10Female(int asthmaChildren10Female) {
        this.asthmaChildren10Female = asthmaChildren10Female;
    }

    public int getAsthmaChildrenOtherMale() {
        return asthmaChildrenOtherMale;
    }

    public void setAsthmaChildrenOtherMale(int asthmaChildrenOtherMale) {
        this.asthmaChildrenOtherMale = asthmaChildrenOtherMale;
    }

    public int getAsthmaChildrenOtherFemale() {
        return asthmaChildrenOtherFemale;
    }

    public void setAsthmaChildrenOtherFemale(int asthmaChildrenOtherFemale) {
        this.asthmaChildrenOtherFemale = asthmaChildrenOtherFemale;
    }

    public int getAsthmaChildrenMale() {
        return asthmaChildrenMale;
    }

    public void setAsthmaChildrenMale(int asthmaChildrenMale) {
        this.asthmaChildrenMale = asthmaChildrenMale;
    }

    public int getAsthmaChildrenFemale() {
        return asthmaChildrenFemale;
    }

    public void setAsthmaChildrenFemale(int asthmaChildrenFemale) {
        this.asthmaChildrenFemale = asthmaChildrenFemale;
    }

    public int getAsthmaChildrenMalePercentage() {
        return asthmaChildrenMalePercentage;
    }

    public void setAsthmaChildrenMalePercentage(int asthmaChildrenMalePercentage) {
        this.asthmaChildrenMalePercentage = asthmaChildrenMalePercentage;
    }

    public int getAsthmaChildren1FemalePercentage() {
        return asthmaChildren1FemalePercentage;
    }

    public void setAsthmaChildren1FemalePercentage(int asthmaChildren1FemalePercentage) {
        this.asthmaChildren1FemalePercentage = asthmaChildren1FemalePercentage;
    }

    public int getBehaviouralProblemsChildren1Male() {
        return behaviouralProblemsChildren1Male;
    }

    public void setBehaviouralProblemsChildren1Male(int behaviouralProblemsChildren1Male) {
        this.behaviouralProblemsChildren1Male = behaviouralProblemsChildren1Male;
    }

    public int getBehaviouralProblemsChildren1Female() {
        return behaviouralProblemsChildren1Female;
    }

    public void setBehaviouralProblemsChildren1Female(int behaviouralProblemsChildren1Female) {
        this.behaviouralProblemsChildren1Female = behaviouralProblemsChildren1Female;
    }

    public int getBehaviouralProblemsChildren4Male() {
        return behaviouralProblemsChildren4Male;
    }

    public void setBehaviouralProblemsChildren4Male(int behaviouralProblemsChildren4Male) {
        this.behaviouralProblemsChildren4Male = behaviouralProblemsChildren4Male;
    }

    public int getBehaviouralProblemsChildren4Female() {
        return behaviouralProblemsChildren4Female;
    }

    public void setBehaviouralProblemsChildren4Female(int behaviouralProblemsChildren4Female) {
        this.behaviouralProblemsChildren4Female = behaviouralProblemsChildren4Female;
    }

    public int getBehaviouralProblemsChildren7Male() {
        return behaviouralProblemsChildren7Male;
    }

    public void setBehaviouralProblemsChildren7Male(int behaviouralProblemsChildren7Male) {
        this.behaviouralProblemsChildren7Male = behaviouralProblemsChildren7Male;
    }

    public int getBehaviouralProblemsChildren7Female() {
        return behaviouralProblemsChildren7Female;
    }

    public void setBehaviouralProblemsChildren7Female(int behaviouralProblemsChildren7Female) {
        this.behaviouralProblemsChildren7Female = behaviouralProblemsChildren7Female;
    }

    public int getBehaviouralProblemsChildren10Male() {
        return behaviouralProblemsChildren10Male;
    }

    public void setBehaviouralProblemsChildren10Male(int behaviouralProblemsChildren10Male) {
        this.behaviouralProblemsChildren10Male = behaviouralProblemsChildren10Male;
    }

    public int getBehaviouralProblemsChildren10Female() {
        return behaviouralProblemsChildren10Female;
    }

    public void setBehaviouralProblemsChildren10Female(int behaviouralProblemsChildren10Female) {
        this.behaviouralProblemsChildren10Female = behaviouralProblemsChildren10Female;
    }

    public int getBehaviouralProblemsChildrenOtherMale() {
        return behaviouralProblemsChildrenOtherMale;
    }

    public void setBehaviouralProblemsChildrenOtherMale(int behaviouralProblemsChildrenOtherMale) {
        this.behaviouralProblemsChildrenOtherMale = behaviouralProblemsChildrenOtherMale;
    }

    public int getBehaviouralProblemsChildrenOtherFemale() {
        return behaviouralProblemsChildrenOtherFemale;
    }

    public void setBehaviouralProblemsChildrenOtherFemale(int behaviouralProblemsChildrenOtherFemale) {
        this.behaviouralProblemsChildrenOtherFemale = behaviouralProblemsChildrenOtherFemale;
    }

    public int getBehaviouralProblemsChildrenMale() {
        return behaviouralProblemsChildrenMale;
    }

    public void setBehaviouralProblemsChildrenMale(int behaviouralProblemsChildrenMale) {
        this.behaviouralProblemsChildrenMale = behaviouralProblemsChildrenMale;
    }

    public int getBehaviouralProblemsChildrenFemale() {
        return behaviouralProblemsChildrenFemale;
    }

    public void setBehaviouralProblemsChildrenFemale(int behaviouralProblemsChildrenFemale) {
        this.behaviouralProblemsChildrenFemale = behaviouralProblemsChildrenFemale;
    }

    public int getBehaviouralProblemsChildrenMalePercentage() {
        return behaviouralProblemsChildrenMalePercentage;
    }

    public void setBehaviouralProblemsChildrenMalePercentage(int behaviouralProblemsChildrenMalePercentage) {
        this.behaviouralProblemsChildrenMalePercentage = behaviouralProblemsChildrenMalePercentage;
    }

    public int getBehaviouralProblemsChildren1FemalePercentage() {
        return behaviouralProblemsChildren1FemalePercentage;
    }

    public void setBehaviouralProblemsChildren1FemalePercentage(int behaviouralProblemsChildren1FemalePercentage) {
        this.behaviouralProblemsChildren1FemalePercentage = behaviouralProblemsChildren1FemalePercentage;
    }

    public int getLearningDifficultiesChildren1Male() {
        return learningDifficultiesChildren1Male;
    }

    public void setLearningDifficultiesChildren1Male(int learningDifficultiesChildren1Male) {
        this.learningDifficultiesChildren1Male = learningDifficultiesChildren1Male;
    }

    public int getLearningDifficultiesChildren1Female() {
        return learningDifficultiesChildren1Female;
    }

    public void setLearningDifficultiesChildren1Female(int learningDifficultiesChildren1Female) {
        this.learningDifficultiesChildren1Female = learningDifficultiesChildren1Female;
    }

    public int getLearningDifficultiesChildren4Male() {
        return learningDifficultiesChildren4Male;
    }

    public void setLearningDifficultiesChildren4Male(int learningDifficultiesChildren4Male) {
        this.learningDifficultiesChildren4Male = learningDifficultiesChildren4Male;
    }

    public int getLearningDifficultiesChildren4Female() {
        return learningDifficultiesChildren4Female;
    }

    public void setLearningDifficultiesChildren4Female(int learningDifficultiesChildren4Female) {
        this.learningDifficultiesChildren4Female = learningDifficultiesChildren4Female;
    }

    public int getLearningDifficultiesChildren7Male() {
        return learningDifficultiesChildren7Male;
    }

    public void setLearningDifficultiesChildren7Male(int learningDifficultiesChildren7Male) {
        this.learningDifficultiesChildren7Male = learningDifficultiesChildren7Male;
    }

    public int getLearningDifficultiesChildren7Female() {
        return learningDifficultiesChildren7Female;
    }

    public void setLearningDifficultiesChildren7Female(int learningDifficultiesChildren7Female) {
        this.learningDifficultiesChildren7Female = learningDifficultiesChildren7Female;
    }

    public int getLearningDifficultiesChildren10Male() {
        return learningDifficultiesChildren10Male;
    }

    public void setLearningDifficultiesChildren10Male(int learningDifficultiesChildren10Male) {
        this.learningDifficultiesChildren10Male = learningDifficultiesChildren10Male;
    }

    public int getLearningDifficultiesChildren10Female() {
        return learningDifficultiesChildren10Female;
    }

    public void setLearningDifficultiesChildren10Female(int learningDifficultiesChildren10Female) {
        this.learningDifficultiesChildren10Female = learningDifficultiesChildren10Female;
    }

    public int getLearningDifficultiesChildrenOtherMale() {
        return learningDifficultiesChildrenOtherMale;
    }

    public void setLearningDifficultiesChildrenOtherMale(int learningDifficultiesChildrenOtherMale) {
        this.learningDifficultiesChildrenOtherMale = learningDifficultiesChildrenOtherMale;
    }

    public int getLearningDifficultiesChildrenOtherFemale() {
        return learningDifficultiesChildrenOtherFemale;
    }

    public void setLearningDifficultiesChildrenOtherFemale(int learningDifficultiesChildrenOtherFemale) {
        this.learningDifficultiesChildrenOtherFemale = learningDifficultiesChildrenOtherFemale;
    }

    public int getLearningDifficultiesChildrenMale() {
        return learningDifficultiesChildrenMale;
    }

    public void setLearningDifficultiesChildrenMale(int learningDifficultiesChildrenMale) {
        this.learningDifficultiesChildrenMale = learningDifficultiesChildrenMale;
    }

    public int getLearningDifficultiesChildrenFemale() {
        return learningDifficultiesChildrenFemale;
    }

    public void setLearningDifficultiesChildrenFemale(int learningDifficultiesChildrenFemale) {
        this.learningDifficultiesChildrenFemale = learningDifficultiesChildrenFemale;
    }

    public int getLearningDifficultiesChildrenMalePercentage() {
        return learningDifficultiesChildrenMalePercentage;
    }

    public void setLearningDifficultiesChildrenMalePercentage(int learningDifficultiesChildrenMalePercentage) {
        this.learningDifficultiesChildrenMalePercentage = learningDifficultiesChildrenMalePercentage;
    }

    public int getLearningDifficultiesChildren1FemalePercentage() {
        return learningDifficultiesChildren1FemalePercentage;
    }

    public void setLearningDifficultiesChildren1FemalePercentage(int learningDifficultiesChildren1FemalePercentage) {
        this.learningDifficultiesChildren1FemalePercentage = learningDifficultiesChildren1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem1() {
        return otherHealthProblem1;
    }

    public void setOtherHealthProblem1(HealthProblem otherHealthProblem1) {
        this.otherHealthProblem1 = otherHealthProblem1;
    }

    public int getOtherHealthProblem1Children1Male() {
        return otherHealthProblem1Children1Male;
    }

    public void setOtherHealthProblem1Children1Male(int otherHealthProblem1Children1Male) {
        this.otherHealthProblem1Children1Male = otherHealthProblem1Children1Male;
    }

    public int getOtherHealthProblem1Children1Female() {
        return otherHealthProblem1Children1Female;
    }

    public void setOtherHealthProblem1Children1Female(int otherHealthProblem1Children1Female) {
        this.otherHealthProblem1Children1Female = otherHealthProblem1Children1Female;
    }

    public int getOtherHealthProblem1Children4Male() {
        return otherHealthProblem1Children4Male;
    }

    public void setOtherHealthProblem1Children4Male(int otherHealthProblem1Children4Male) {
        this.otherHealthProblem1Children4Male = otherHealthProblem1Children4Male;
    }

    public int getOtherHealthProblem1Children4Female() {
        return otherHealthProblem1Children4Female;
    }

    public void setOtherHealthProblem1Children4Female(int otherHealthProblem1Children4Female) {
        this.otherHealthProblem1Children4Female = otherHealthProblem1Children4Female;
    }

    public int getOtherHealthProblem1Children7Male() {
        return otherHealthProblem1Children7Male;
    }

    public void setOtherHealthProblem1Children7Male(int otherHealthProblem1Children7Male) {
        this.otherHealthProblem1Children7Male = otherHealthProblem1Children7Male;
    }

    public int getOtherHealthProblem1Children7Female() {
        return otherHealthProblem1Children7Female;
    }

    public void setOtherHealthProblem1Children7Female(int otherHealthProblem1Children7Female) {
        this.otherHealthProblem1Children7Female = otherHealthProblem1Children7Female;
    }

    public int getOtherHealthProblem1Children10Male() {
        return otherHealthProblem1Children10Male;
    }

    public void setOtherHealthProblem1Children10Male(int otherHealthProblem1Children10Male) {
        this.otherHealthProblem1Children10Male = otherHealthProblem1Children10Male;
    }

    public int getOtherHealthProblem1Children10Female() {
        return otherHealthProblem1Children10Female;
    }

    public void setOtherHealthProblem1Children10Female(int otherHealthProblem1Children10Female) {
        this.otherHealthProblem1Children10Female = otherHealthProblem1Children10Female;
    }

    public int getOtherHealthProblem1ChildrenOtherMale() {
        return otherHealthProblem1ChildrenOtherMale;
    }

    public void setOtherHealthProblem1ChildrenOtherMale(int otherHealthProblem1ChildrenOtherMale) {
        this.otherHealthProblem1ChildrenOtherMale = otherHealthProblem1ChildrenOtherMale;
    }

    public int getOtherHealthProblem1ChildrenOtherFemale() {
        return otherHealthProblem1ChildrenOtherFemale;
    }

    public void setOtherHealthProblem1ChildrenOtherFemale(int otherHealthProblem1ChildrenOtherFemale) {
        this.otherHealthProblem1ChildrenOtherFemale = otherHealthProblem1ChildrenOtherFemale;
    }

    public int getOtherHealthProblem1ChildrenMale() {
        return otherHealthProblem1ChildrenMale;
    }

    public void setOtherHealthProblem1ChildrenMale(int otherHealthProblem1ChildrenMale) {
        this.otherHealthProblem1ChildrenMale = otherHealthProblem1ChildrenMale;
    }

    public int getOtherHealthProblem1ChildrenFemale() {
        return otherHealthProblem1ChildrenFemale;
    }

    public void setOtherHealthProblem1ChildrenFemale(int otherHealthProblem1ChildrenFemale) {
        this.otherHealthProblem1ChildrenFemale = otherHealthProblem1ChildrenFemale;
    }

    public int getOtherHealthProblem1ChildrenMalePercentage() {
        return otherHealthProblem1ChildrenMalePercentage;
    }

    public void setOtherHealthProblem1ChildrenMalePercentage(int otherHealthProblem1ChildrenMalePercentage) {
        this.otherHealthProblem1ChildrenMalePercentage = otherHealthProblem1ChildrenMalePercentage;
    }

    public int getOtherHealthProblem1Children1FemalePercentage() {
        return otherHealthProblem1Children1FemalePercentage;
    }

    public void setOtherHealthProblem1Children1FemalePercentage(int otherHealthProblem1Children1FemalePercentage) {
        this.otherHealthProblem1Children1FemalePercentage = otherHealthProblem1Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem2() {
        return otherHealthProblem2;
    }

    public void setOtherHealthProblem2(HealthProblem otherHealthProblem2) {
        this.otherHealthProblem2 = otherHealthProblem2;
    }

    public int getOtherHealthProblem2Children1Male() {
        return otherHealthProblem2Children1Male;
    }

    public void setOtherHealthProblem2Children1Male(int otherHealthProblem2Children1Male) {
        this.otherHealthProblem2Children1Male = otherHealthProblem2Children1Male;
    }

    public int getOtherHealthProblem2Children1Female() {
        return otherHealthProblem2Children1Female;
    }

    public void setOtherHealthProblem2Children1Female(int otherHealthProblem2Children1Female) {
        this.otherHealthProblem2Children1Female = otherHealthProblem2Children1Female;
    }

    public int getOtherHealthProblem2Children4Male() {
        return otherHealthProblem2Children4Male;
    }

    public void setOtherHealthProblem2Children4Male(int otherHealthProblem2Children4Male) {
        this.otherHealthProblem2Children4Male = otherHealthProblem2Children4Male;
    }

    public int getOtherHealthProblem2Children4Female() {
        return otherHealthProblem2Children4Female;
    }

    public void setOtherHealthProblem2Children4Female(int otherHealthProblem2Children4Female) {
        this.otherHealthProblem2Children4Female = otherHealthProblem2Children4Female;
    }

    public int getOtherHealthProblem2Children7Male() {
        return otherHealthProblem2Children7Male;
    }

    public void setOtherHealthProblem2Children7Male(int otherHealthProblem2Children7Male) {
        this.otherHealthProblem2Children7Male = otherHealthProblem2Children7Male;
    }

    public int getOtherHealthProblem2Children7Female() {
        return otherHealthProblem2Children7Female;
    }

    public void setOtherHealthProblem2Children7Female(int otherHealthProblem2Children7Female) {
        this.otherHealthProblem2Children7Female = otherHealthProblem2Children7Female;
    }

    public int getOtherHealthProblem2Children10Male() {
        return otherHealthProblem2Children10Male;
    }

    public void setOtherHealthProblem2Children10Male(int otherHealthProblem2Children10Male) {
        this.otherHealthProblem2Children10Male = otherHealthProblem2Children10Male;
    }

    public int getOtherHealthProblem2Children10Female() {
        return otherHealthProblem2Children10Female;
    }

    public void setOtherHealthProblem2Children10Female(int otherHealthProblem2Children10Female) {
        this.otherHealthProblem2Children10Female = otherHealthProblem2Children10Female;
    }

    public int getOtherHealthProblem2ChildrenOtherMale() {
        return otherHealthProblem2ChildrenOtherMale;
    }

    public void setOtherHealthProblem2ChildrenOtherMale(int otherHealthProblem2ChildrenOtherMale) {
        this.otherHealthProblem2ChildrenOtherMale = otherHealthProblem2ChildrenOtherMale;
    }

    public int getOtherHealthProblem2ChildrenOtherFemale() {
        return otherHealthProblem2ChildrenOtherFemale;
    }

    public void setOtherHealthProblem2ChildrenOtherFemale(int otherHealthProblem2ChildrenOtherFemale) {
        this.otherHealthProblem2ChildrenOtherFemale = otherHealthProblem2ChildrenOtherFemale;
    }

    public int getOtherHealthProblem2ChildrenMale() {
        return otherHealthProblem2ChildrenMale;
    }

    public void setOtherHealthProblem2ChildrenMale(int otherHealthProblem2ChildrenMale) {
        this.otherHealthProblem2ChildrenMale = otherHealthProblem2ChildrenMale;
    }

    public int getOtherHealthProblem2ChildrenFemale() {
        return otherHealthProblem2ChildrenFemale;
    }

    public void setOtherHealthProblem2ChildrenFemale(int otherHealthProblem2ChildrenFemale) {
        this.otherHealthProblem2ChildrenFemale = otherHealthProblem2ChildrenFemale;
    }

    public int getOtherHealthProblem2ChildrenMalePercentage() {
        return otherHealthProblem2ChildrenMalePercentage;
    }

    public void setOtherHealthProblem2ChildrenMalePercentage(int otherHealthProblem2ChildrenMalePercentage) {
        this.otherHealthProblem2ChildrenMalePercentage = otherHealthProblem2ChildrenMalePercentage;
    }

    public int getOtherHealthProblem2Children1FemalePercentage() {
        return otherHealthProblem2Children1FemalePercentage;
    }

    public void setOtherHealthProblem2Children1FemalePercentage(int otherHealthProblem2Children1FemalePercentage) {
        this.otherHealthProblem2Children1FemalePercentage = otherHealthProblem2Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem3() {
        return otherHealthProblem3;
    }

    public void setOtherHealthProblem3(HealthProblem otherHealthProblem3) {
        this.otherHealthProblem3 = otherHealthProblem3;
    }

    public int getOtherHealthProblem3Children1Male() {
        return otherHealthProblem3Children1Male;
    }

    public void setOtherHealthProblem3Children1Male(int otherHealthProblem3Children1Male) {
        this.otherHealthProblem3Children1Male = otherHealthProblem3Children1Male;
    }

    public int getOtherHealthProblem3Children1Female() {
        return otherHealthProblem3Children1Female;
    }

    public void setOtherHealthProblem3Children1Female(int otherHealthProblem3Children1Female) {
        this.otherHealthProblem3Children1Female = otherHealthProblem3Children1Female;
    }

    public int getOtherHealthProblem3Children4Male() {
        return otherHealthProblem3Children4Male;
    }

    public void setOtherHealthProblem3Children4Male(int otherHealthProblem3Children4Male) {
        this.otherHealthProblem3Children4Male = otherHealthProblem3Children4Male;
    }

    public int getOtherHealthProblem3Children4Female() {
        return otherHealthProblem3Children4Female;
    }

    public void setOtherHealthProblem3Children4Female(int otherHealthProblem3Children4Female) {
        this.otherHealthProblem3Children4Female = otherHealthProblem3Children4Female;
    }

    public int getOtherHealthProblem3Children7Male() {
        return otherHealthProblem3Children7Male;
    }

    public void setOtherHealthProblem3Children7Male(int otherHealthProblem3Children7Male) {
        this.otherHealthProblem3Children7Male = otherHealthProblem3Children7Male;
    }

    public int getOtherHealthProblem3Children7Female() {
        return otherHealthProblem3Children7Female;
    }

    public void setOtherHealthProblem3Children7Female(int otherHealthProblem3Children7Female) {
        this.otherHealthProblem3Children7Female = otherHealthProblem3Children7Female;
    }

    public int getOtherHealthProblem3Children10Male() {
        return otherHealthProblem3Children10Male;
    }

    public void setOtherHealthProblem3Children10Male(int otherHealthProblem3Children10Male) {
        this.otherHealthProblem3Children10Male = otherHealthProblem3Children10Male;
    }

    public int getOtherHealthProblem3Children10Female() {
        return otherHealthProblem3Children10Female;
    }

    public void setOtherHealthProblem3Children10Female(int otherHealthProblem3Children10Female) {
        this.otherHealthProblem3Children10Female = otherHealthProblem3Children10Female;
    }

    public int getOtherHealthProblem3ChildrenOtherMale() {
        return otherHealthProblem3ChildrenOtherMale;
    }

    public void setOtherHealthProblem3ChildrenOtherMale(int otherHealthProblem3ChildrenOtherMale) {
        this.otherHealthProblem3ChildrenOtherMale = otherHealthProblem3ChildrenOtherMale;
    }

    public int getOtherHealthProblem3ChildrenOtherFemale() {
        return otherHealthProblem3ChildrenOtherFemale;
    }

    public void setOtherHealthProblem3ChildrenOtherFemale(int otherHealthProblem3ChildrenOtherFemale) {
        this.otherHealthProblem3ChildrenOtherFemale = otherHealthProblem3ChildrenOtherFemale;
    }

    public int getOtherHealthProblem3ChildrenMale() {
        return otherHealthProblem3ChildrenMale;
    }

    public void setOtherHealthProblem3ChildrenMale(int otherHealthProblem3ChildrenMale) {
        this.otherHealthProblem3ChildrenMale = otherHealthProblem3ChildrenMale;
    }

    public int getOtherHealthProblem3ChildrenFemale() {
        return otherHealthProblem3ChildrenFemale;
    }

    public void setOtherHealthProblem3ChildrenFemale(int otherHealthProblem3ChildrenFemale) {
        this.otherHealthProblem3ChildrenFemale = otherHealthProblem3ChildrenFemale;
    }

    public int getOtherHealthProblem3ChildrenMalePercentage() {
        return otherHealthProblem3ChildrenMalePercentage;
    }

    public void setOtherHealthProblem3ChildrenMalePercentage(int otherHealthProblem3ChildrenMalePercentage) {
        this.otherHealthProblem3ChildrenMalePercentage = otherHealthProblem3ChildrenMalePercentage;
    }

    public int getOtherHealthProblem3Children1FemalePercentage() {
        return otherHealthProblem3Children1FemalePercentage;
    }

    public void setOtherHealthProblem3Children1FemalePercentage(int otherHealthProblem3Children1FemalePercentage) {
        this.otherHealthProblem3Children1FemalePercentage = otherHealthProblem3Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem4() {
        return otherHealthProblem4;
    }

    public void setOtherHealthProblem4(HealthProblem otherHealthProblem4) {
        this.otherHealthProblem4 = otherHealthProblem4;
    }

    public int getOtherHealthProblem4Children1Male() {
        return otherHealthProblem4Children1Male;
    }

    public void setOtherHealthProblem4Children1Male(int otherHealthProblem4Children1Male) {
        this.otherHealthProblem4Children1Male = otherHealthProblem4Children1Male;
    }

    public int getOtherHealthProblem4Children1Female() {
        return otherHealthProblem4Children1Female;
    }

    public void setOtherHealthProblem4Children1Female(int otherHealthProblem4Children1Female) {
        this.otherHealthProblem4Children1Female = otherHealthProblem4Children1Female;
    }

    public int getOtherHealthProblem4Children4Male() {
        return otherHealthProblem4Children4Male;
    }

    public void setOtherHealthProblem4Children4Male(int otherHealthProblem4Children4Male) {
        this.otherHealthProblem4Children4Male = otherHealthProblem4Children4Male;
    }

    public int getOtherHealthProblem4Children4Female() {
        return otherHealthProblem4Children4Female;
    }

    public void setOtherHealthProblem4Children4Female(int otherHealthProblem4Children4Female) {
        this.otherHealthProblem4Children4Female = otherHealthProblem4Children4Female;
    }

    public int getOtherHealthProblem4Children7Male() {
        return otherHealthProblem4Children7Male;
    }

    public void setOtherHealthProblem4Children7Male(int otherHealthProblem4Children7Male) {
        this.otherHealthProblem4Children7Male = otherHealthProblem4Children7Male;
    }

    public int getOtherHealthProblem4Children7Female() {
        return otherHealthProblem4Children7Female;
    }

    public void setOtherHealthProblem4Children7Female(int otherHealthProblem4Children7Female) {
        this.otherHealthProblem4Children7Female = otherHealthProblem4Children7Female;
    }

    public int getOtherHealthProblem4Children10Male() {
        return otherHealthProblem4Children10Male;
    }

    public void setOtherHealthProblem4Children10Male(int otherHealthProblem4Children10Male) {
        this.otherHealthProblem4Children10Male = otherHealthProblem4Children10Male;
    }

    public int getOtherHealthProblem4Children10Female() {
        return otherHealthProblem4Children10Female;
    }

    public void setOtherHealthProblem4Children10Female(int otherHealthProblem4Children10Female) {
        this.otherHealthProblem4Children10Female = otherHealthProblem4Children10Female;
    }

    public int getOtherHealthProblem4ChildrenOtherMale() {
        return otherHealthProblem4ChildrenOtherMale;
    }

    public void setOtherHealthProblem4ChildrenOtherMale(int otherHealthProblem4ChildrenOtherMale) {
        this.otherHealthProblem4ChildrenOtherMale = otherHealthProblem4ChildrenOtherMale;
    }

    public int getOtherHealthProblem4ChildrenOtherFemale() {
        return otherHealthProblem4ChildrenOtherFemale;
    }

    public void setOtherHealthProblem4ChildrenOtherFemale(int otherHealthProblem4ChildrenOtherFemale) {
        this.otherHealthProblem4ChildrenOtherFemale = otherHealthProblem4ChildrenOtherFemale;
    }

    public int getOtherHealthProblem4ChildrenMale() {
        return otherHealthProblem4ChildrenMale;
    }

    public void setOtherHealthProblem4ChildrenMale(int otherHealthProblem4ChildrenMale) {
        this.otherHealthProblem4ChildrenMale = otherHealthProblem4ChildrenMale;
    }

    public int getOtherHealthProblem4ChildrenFemale() {
        return otherHealthProblem4ChildrenFemale;
    }

    public void setOtherHealthProblem4ChildrenFemale(int otherHealthProblem4ChildrenFemale) {
        this.otherHealthProblem4ChildrenFemale = otherHealthProblem4ChildrenFemale;
    }

    public int getOtherHealthProblem4ChildrenMalePercentage() {
        return otherHealthProblem4ChildrenMalePercentage;
    }

    public void setOtherHealthProblem4ChildrenMalePercentage(int otherHealthProblem4ChildrenMalePercentage) {
        this.otherHealthProblem4ChildrenMalePercentage = otherHealthProblem4ChildrenMalePercentage;
    }

    public int getOtherHealthProblem4Children1FemalePercentage() {
        return otherHealthProblem4Children1FemalePercentage;
    }

    public void setOtherHealthProblem4Children1FemalePercentage(int otherHealthProblem4Children1FemalePercentage) {
        this.otherHealthProblem4Children1FemalePercentage = otherHealthProblem4Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem5() {
        return otherHealthProblem5;
    }

    public void setOtherHealthProblem5(HealthProblem otherHealthProblem5) {
        this.otherHealthProblem5 = otherHealthProblem5;
    }

    public int getOtherHealthProblem5Children1Male() {
        return otherHealthProblem5Children1Male;
    }

    public void setOtherHealthProblem5Children1Male(int otherHealthProblem5Children1Male) {
        this.otherHealthProblem5Children1Male = otherHealthProblem5Children1Male;
    }

    public int getOtherHealthProblem5Children1Female() {
        return otherHealthProblem5Children1Female;
    }

    public void setOtherHealthProblem5Children1Female(int otherHealthProblem5Children1Female) {
        this.otherHealthProblem5Children1Female = otherHealthProblem5Children1Female;
    }

    public int getOtherHealthProblem5Children4Male() {
        return otherHealthProblem5Children4Male;
    }

    public void setOtherHealthProblem5Children4Male(int otherHealthProblem5Children4Male) {
        this.otherHealthProblem5Children4Male = otherHealthProblem5Children4Male;
    }

    public int getOtherHealthProblem5Children4Female() {
        return otherHealthProblem5Children4Female;
    }

    public void setOtherHealthProblem5Children4Female(int otherHealthProblem5Children4Female) {
        this.otherHealthProblem5Children4Female = otherHealthProblem5Children4Female;
    }

    public int getOtherHealthProblem5Children7Male() {
        return otherHealthProblem5Children7Male;
    }

    public void setOtherHealthProblem5Children7Male(int otherHealthProblem5Children7Male) {
        this.otherHealthProblem5Children7Male = otherHealthProblem5Children7Male;
    }

    public int getOtherHealthProblem5Children7Female() {
        return otherHealthProblem5Children7Female;
    }

    public void setOtherHealthProblem5Children7Female(int otherHealthProblem5Children7Female) {
        this.otherHealthProblem5Children7Female = otherHealthProblem5Children7Female;
    }

    public int getOtherHealthProblem5Children10Male() {
        return otherHealthProblem5Children10Male;
    }

    public void setOtherHealthProblem5Children10Male(int otherHealthProblem5Children10Male) {
        this.otherHealthProblem5Children10Male = otherHealthProblem5Children10Male;
    }

    public int getOtherHealthProblem5Children10Female() {
        return otherHealthProblem5Children10Female;
    }

    public void setOtherHealthProblem5Children10Female(int otherHealthProblem5Children10Female) {
        this.otherHealthProblem5Children10Female = otherHealthProblem5Children10Female;
    }

    public int getOtherHealthProblem5ChildrenOtherMale() {
        return otherHealthProblem5ChildrenOtherMale;
    }

    public void setOtherHealthProblem5ChildrenOtherMale(int otherHealthProblem5ChildrenOtherMale) {
        this.otherHealthProblem5ChildrenOtherMale = otherHealthProblem5ChildrenOtherMale;
    }

    public int getOtherHealthProblem5ChildrenOtherFemale() {
        return otherHealthProblem5ChildrenOtherFemale;
    }

    public void setOtherHealthProblem5ChildrenOtherFemale(int otherHealthProblem5ChildrenOtherFemale) {
        this.otherHealthProblem5ChildrenOtherFemale = otherHealthProblem5ChildrenOtherFemale;
    }

    public int getOtherHealthProblem5ChildrenMale() {
        return otherHealthProblem5ChildrenMale;
    }

    public void setOtherHealthProblem5ChildrenMale(int otherHealthProblem5ChildrenMale) {
        this.otherHealthProblem5ChildrenMale = otherHealthProblem5ChildrenMale;
    }

    public int getOtherHealthProblem5ChildrenFemale() {
        return otherHealthProblem5ChildrenFemale;
    }

    public void setOtherHealthProblem5ChildrenFemale(int otherHealthProblem5ChildrenFemale) {
        this.otherHealthProblem5ChildrenFemale = otherHealthProblem5ChildrenFemale;
    }

    public int getOtherHealthProblem5ChildrenMalePercentage() {
        return otherHealthProblem5ChildrenMalePercentage;
    }

    public void setOtherHealthProblem5ChildrenMalePercentage(int otherHealthProblem5ChildrenMalePercentage) {
        this.otherHealthProblem5ChildrenMalePercentage = otherHealthProblem5ChildrenMalePercentage;
    }

    public int getOtherHealthProblem5Children1FemalePercentage() {
        return otherHealthProblem5Children1FemalePercentage;
    }

    public void setOtherHealthProblem5Children1FemalePercentage(int otherHealthProblem5Children1FemalePercentage) {
        this.otherHealthProblem5Children1FemalePercentage = otherHealthProblem5Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem6() {
        return otherHealthProblem6;
    }

    public void setOtherHealthProblem6(HealthProblem otherHealthProblem6) {
        this.otherHealthProblem6 = otherHealthProblem6;
    }

    public int getOtherHealthProblem6Children1Male() {
        return otherHealthProblem6Children1Male;
    }

    public void setOtherHealthProblem6Children1Male(int otherHealthProblem6Children1Male) {
        this.otherHealthProblem6Children1Male = otherHealthProblem6Children1Male;
    }

    public int getOtherHealthProblem6Children1Female() {
        return otherHealthProblem6Children1Female;
    }

    public void setOtherHealthProblem6Children1Female(int otherHealthProblem6Children1Female) {
        this.otherHealthProblem6Children1Female = otherHealthProblem6Children1Female;
    }

    public int getOtherHealthProblem6Children4Male() {
        return otherHealthProblem6Children4Male;
    }

    public void setOtherHealthProblem6Children4Male(int otherHealthProblem6Children4Male) {
        this.otherHealthProblem6Children4Male = otherHealthProblem6Children4Male;
    }

    public int getOtherHealthProblem6Children4Female() {
        return otherHealthProblem6Children4Female;
    }

    public void setOtherHealthProblem6Children4Female(int otherHealthProblem6Children4Female) {
        this.otherHealthProblem6Children4Female = otherHealthProblem6Children4Female;
    }

    public int getOtherHealthProblem6Children7Male() {
        return otherHealthProblem6Children7Male;
    }

    public void setOtherHealthProblem6Children7Male(int otherHealthProblem6Children7Male) {
        this.otherHealthProblem6Children7Male = otherHealthProblem6Children7Male;
    }

    public int getOtherHealthProblem6Children7Female() {
        return otherHealthProblem6Children7Female;
    }

    public void setOtherHealthProblem6Children7Female(int otherHealthProblem6Children7Female) {
        this.otherHealthProblem6Children7Female = otherHealthProblem6Children7Female;
    }

    public int getOtherHealthProblem6Children10Male() {
        return otherHealthProblem6Children10Male;
    }

    public void setOtherHealthProblem6Children10Male(int otherHealthProblem6Children10Male) {
        this.otherHealthProblem6Children10Male = otherHealthProblem6Children10Male;
    }

    public int getOtherHealthProblem6Children10Female() {
        return otherHealthProblem6Children10Female;
    }

    public void setOtherHealthProblem6Children10Female(int otherHealthProblem6Children10Female) {
        this.otherHealthProblem6Children10Female = otherHealthProblem6Children10Female;
    }

    public int getOtherHealthProblem6ChildrenOtherMale() {
        return otherHealthProblem6ChildrenOtherMale;
    }

    public void setOtherHealthProblem6ChildrenOtherMale(int otherHealthProblem6ChildrenOtherMale) {
        this.otherHealthProblem6ChildrenOtherMale = otherHealthProblem6ChildrenOtherMale;
    }

    public int getOtherHealthProblem6ChildrenOtherFemale() {
        return otherHealthProblem6ChildrenOtherFemale;
    }

    public void setOtherHealthProblem6ChildrenOtherFemale(int otherHealthProblem6ChildrenOtherFemale) {
        this.otherHealthProblem6ChildrenOtherFemale = otherHealthProblem6ChildrenOtherFemale;
    }

    public int getOtherHealthProblem6ChildrenMale() {
        return otherHealthProblem6ChildrenMale;
    }

    public void setOtherHealthProblem6ChildrenMale(int otherHealthProblem6ChildrenMale) {
        this.otherHealthProblem6ChildrenMale = otherHealthProblem6ChildrenMale;
    }

    public int getOtherHealthProblem6ChildrenFemale() {
        return otherHealthProblem6ChildrenFemale;
    }

    public void setOtherHealthProblem6ChildrenFemale(int otherHealthProblem6ChildrenFemale) {
        this.otherHealthProblem6ChildrenFemale = otherHealthProblem6ChildrenFemale;
    }

    public int getOtherHealthProblem6ChildrenMalePercentage() {
        return otherHealthProblem6ChildrenMalePercentage;
    }

    public void setOtherHealthProblem6ChildrenMalePercentage(int otherHealthProblem6ChildrenMalePercentage) {
        this.otherHealthProblem6ChildrenMalePercentage = otherHealthProblem6ChildrenMalePercentage;
    }

    public int getOtherHealthProblem6Children1FemalePercentage() {
        return otherHealthProblem6Children1FemalePercentage;
    }

    public void setOtherHealthProblem6Children1FemalePercentage(int otherHealthProblem6Children1FemalePercentage) {
        this.otherHealthProblem6Children1FemalePercentage = otherHealthProblem6Children1FemalePercentage;
    }

    public HealthProblem getOtherHealthProblem7() {
        return otherHealthProblem7;
    }

    public void setOtherHealthProblem7(HealthProblem otherHealthProblem7) {
        this.otherHealthProblem7 = otherHealthProblem7;
    }

    public int getOtherHealthProblem7Children1Male() {
        return otherHealthProblem7Children1Male;
    }

    public void setOtherHealthProblem7Children1Male(int otherHealthProblem7Children1Male) {
        this.otherHealthProblem7Children1Male = otherHealthProblem7Children1Male;
    }

    public int getOtherHealthProblem7Children1Female() {
        return otherHealthProblem7Children1Female;
    }

    public void setOtherHealthProblem7Children1Female(int otherHealthProblem7Children1Female) {
        this.otherHealthProblem7Children1Female = otherHealthProblem7Children1Female;
    }

    public int getOtherHealthProblem7Children4Male() {
        return otherHealthProblem7Children4Male;
    }

    public void setOtherHealthProblem7Children4Male(int otherHealthProblem7Children4Male) {
        this.otherHealthProblem7Children4Male = otherHealthProblem7Children4Male;
    }

    public int getOtherHealthProblem7Children4Female() {
        return otherHealthProblem7Children4Female;
    }

    public void setOtherHealthProblem7Children4Female(int otherHealthProblem7Children4Female) {
        this.otherHealthProblem7Children4Female = otherHealthProblem7Children4Female;
    }

    public int getOtherHealthProblem7Children7Male() {
        return otherHealthProblem7Children7Male;
    }

    public void setOtherHealthProblem7Children7Male(int otherHealthProblem7Children7Male) {
        this.otherHealthProblem7Children7Male = otherHealthProblem7Children7Male;
    }

    public int getOtherHealthProblem7Children7Female() {
        return otherHealthProblem7Children7Female;
    }

    public void setOtherHealthProblem7Children7Female(int otherHealthProblem7Children7Female) {
        this.otherHealthProblem7Children7Female = otherHealthProblem7Children7Female;
    }

    public int getOtherHealthProblem7Children10Male() {
        return otherHealthProblem7Children10Male;
    }

    public void setOtherHealthProblem7Children10Male(int otherHealthProblem7Children10Male) {
        this.otherHealthProblem7Children10Male = otherHealthProblem7Children10Male;
    }

    public int getOtherHealthProblem7Children10Female() {
        return otherHealthProblem7Children10Female;
    }

    public void setOtherHealthProblem7Children10Female(int otherHealthProblem7Children10Female) {
        this.otherHealthProblem7Children10Female = otherHealthProblem7Children10Female;
    }

    public int getOtherHealthProblem7ChildrenOtherMale() {
        return otherHealthProblem7ChildrenOtherMale;
    }

    public void setOtherHealthProblem7ChildrenOtherMale(int otherHealthProblem7ChildrenOtherMale) {
        this.otherHealthProblem7ChildrenOtherMale = otherHealthProblem7ChildrenOtherMale;
    }

    public int getOtherHealthProblem7ChildrenOtherFemale() {
        return otherHealthProblem7ChildrenOtherFemale;
    }

    public void setOtherHealthProblem7ChildrenOtherFemale(int otherHealthProblem7ChildrenOtherFemale) {
        this.otherHealthProblem7ChildrenOtherFemale = otherHealthProblem7ChildrenOtherFemale;
    }

    public int getOtherHealthProblem7ChildrenMale() {
        return otherHealthProblem7ChildrenMale;
    }

    public void setOtherHealthProblem7ChildrenMale(int otherHealthProblem7ChildrenMale) {
        this.otherHealthProblem7ChildrenMale = otherHealthProblem7ChildrenMale;
    }

    public int getOtherHealthProblem7ChildrenFemale() {
        return otherHealthProblem7ChildrenFemale;
    }

    public void setOtherHealthProblem7ChildrenFemale(int otherHealthProblem7ChildrenFemale) {
        this.otherHealthProblem7ChildrenFemale = otherHealthProblem7ChildrenFemale;
    }

    public int getOtherHealthProblem7ChildrenMalePercentage() {
        return otherHealthProblem7ChildrenMalePercentage;
    }

    public void setOtherHealthProblem7ChildrenMalePercentage(int otherHealthProblem7ChildrenMalePercentage) {
        this.otherHealthProblem7ChildrenMalePercentage = otherHealthProblem7ChildrenMalePercentage;
    }

    public int getOtherHealthProblem7Children1FemalePercentage() {
        return otherHealthProblem7Children1FemalePercentage;
    }

    public void setOtherHealthProblem7Children1FemalePercentage(int otherHealthProblem7Children1FemalePercentage) {
        this.otherHealthProblem7Children1FemalePercentage = otherHealthProblem7Children1FemalePercentage;
    }

    public WebUser getPhi() {
        return phi;
    }

    public void setPhi(WebUser phi) {
        this.phi = phi;
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

    public int getNumberOfDefectsOf1Male() {
        return numberOfDefectsOf1Male;
    }

    public void setNumberOfDefectsOf1Male(int numberOfDefectsOf1Male) {
        this.numberOfDefectsOf1Male = numberOfDefectsOf1Male;
    }

    public int getNumberOfDefectsOf1Female() {
        return numberOfDefectsOf1Female;
    }

    public void setNumberOfDefectsOf1Female(int numberOfDefectsOf1Female) {
        this.numberOfDefectsOf1Female = numberOfDefectsOf1Female;
    }

    public int getNumberOfDefectsOf4Male() {
        return numberOfDefectsOf4Male;
    }

    public void setNumberOfDefectsOf4Male(int numberOfDefectsOf4Male) {
        this.numberOfDefectsOf4Male = numberOfDefectsOf4Male;
    }

    public int getNumberOfDefectsOf4Female() {
        return numberOfDefectsOf4Female;
    }

    public void setNumberOfDefectsOf4Female(int numberOfDefectsOf4Female) {
        this.numberOfDefectsOf4Female = numberOfDefectsOf4Female;
    }

    public int getNumberOfDefectsOf7Male() {
        return numberOfDefectsOf7Male;
    }

    public void setNumberOfDefectsOf7Male(int numberOfDefectsOf7Male) {
        this.numberOfDefectsOf7Male = numberOfDefectsOf7Male;
    }

    public int getNumberOfDefectsOf7Female() {
        return numberOfDefectsOf7Female;
    }

    public void setNumberOfDefectsOf7Female(int numberOfDefectsOf7Female) {
        this.numberOfDefectsOf7Female = numberOfDefectsOf7Female;
    }

    public int getNumberOfDefectsOf10Male() {
        return numberOfDefectsOf10Male;
    }

    public void setNumberOfDefectsOf10Male(int numberOfDefectsOf10Male) {
        this.numberOfDefectsOf10Male = numberOfDefectsOf10Male;
    }

    public int getNumberOfDefectsOf10Female() {
        return numberOfDefectsOf10Female;
    }

    public void setNumberOfDefectsOf10Female(int numberOfDefectsOf10Female) {
        this.numberOfDefectsOf10Female = numberOfDefectsOf10Female;
    }

    public int getNumberOfDefectsOfOtherMale() {
        return numberOfDefectsOfOtherMale;
    }

    public void setNumberOfDefectsOfOtherMale(int numberOfDefectsOfOtherMale) {
        this.numberOfDefectsOfOtherMale = numberOfDefectsOfOtherMale;
    }

    public int getNumberOfDefectsOfOtherFemale() {
        return numberOfDefectsOfOtherFemale;
    }

    public void setNumberOfDefectsOfOtherFemale(int numberOfDefectsOfOtherFemale) {
        this.numberOfDefectsOfOtherFemale = numberOfDefectsOfOtherFemale;
    }

    public int getNumberOfDefectsOfMale() {
        return numberOfDefectsOfMale;
    }

    public void setNumberOfDefectsOfMale(int numberOfDefectsOfMale) {
        this.numberOfDefectsOfMale = numberOfDefectsOfMale;
    }

    public int getNumberOfDefectsOfFemale() {
        return numberOfDefectsOfFemale;
    }

    public void setNumberOfDefectsOfFemale(int numberOfDefectsOfFemale) {
        this.numberOfDefectsOfFemale = numberOfDefectsOfFemale;
    }

    public int getNumberOfDefectsOfMalePercentage() {
        return numberOfDefectsOfMalePercentage;
    }

    public void setNumberOfDefectsOfMalePercentage(int numberOfDefectsOfMalePercentage) {
        this.numberOfDefectsOfMalePercentage = numberOfDefectsOfMalePercentage;
    }

    public int getNumberOfDefectsOf1FemalePercentage() {
        return numberOfDefectsOf1FemalePercentage;
    }

    public void setNumberOfDefectsOf1FemalePercentage(int numberOfDefectsOf1FemalePercentage) {
        this.numberOfDefectsOf1FemalePercentage = numberOfDefectsOf1FemalePercentage;
    }

    public String getSchoolCensusNo() {
        return schoolCensusNo;
    }

    public void setSchoolCensusNo(String schoolCensusNo) {
        this.schoolCensusNo = schoolCensusNo;
    }

    public WebUser getCreator() {
        return creator;
    }

    public void setCreator(WebUser creator) {
        this.creator = creator;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    

}

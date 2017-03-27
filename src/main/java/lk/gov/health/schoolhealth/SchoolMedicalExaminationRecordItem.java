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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class SchoolMedicalExaminationRecordItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    SchoolMedicalExaminationRecord schoolMedicalExaminationRecord;

    int serial_no;
    String name;
    @Enumerated(EnumType.STRING)
    Sex sex;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date date_of_birth;
    int age;
    double height_cm;
    double weight_kg;
    double bmi;
    boolean stunting;
    boolean wasting;
    boolean overweight;
    String vision_left;
    String vision_right;
    String hearing_left;
    String hearing_right;
    boolean speech_defects;
    boolean pallor;
    boolean dental_caries;
    boolean calculus;
    boolean ent_defects;
    boolean heart_diseases;
    boolean bronchial_asthma;
    boolean behavioural_problems;
    boolean learning_difficulties;
    boolean pediculosis;
    boolean night_blindness;
    boolean bitot_spots;
    boolean squint;
    boolean xerophthalmia;
    boolean angular_stomatitis_or_glossitis;
    boolean fluorisis;
    boolean malocculusion;
    boolean goitre;
    boolean lymphadinopathy;
    boolean scabies;
    boolean hypo_pigmented_anaesthetic_patches;
    boolean other_skin_disorders;
    boolean orthopaedic_disorders;
    boolean lung_diseases;
    boolean other_defects;
    String other_defects_specify;
    @Lob
    String action_taken;
    boolean follow_up_visit_one_month;
    boolean follow_up_visit_three_month;
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

    public SchoolMedicalExaminationRecord getSchoolMedicalExaminationRecord() {
        return schoolMedicalExaminationRecord;
    }

    public void setSchoolMedicalExaminationRecord(SchoolMedicalExaminationRecord schoolMedicalExaminationRecord) {
        this.schoolMedicalExaminationRecord = schoolMedicalExaminationRecord;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight_cm() {
        return height_cm;
    }

    public void setHeight_cm(double height_cm) {
        this.height_cm = height_cm;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(double weight_kg) {
        this.weight_kg = weight_kg;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public boolean isStunting() {
        return stunting;
    }

    public void setStunting(boolean stunting) {
        this.stunting = stunting;
    }

    public boolean isWasting() {
        return wasting;
    }

    public void setWasting(boolean wasting) {
        this.wasting = wasting;
    }

    public boolean isOverweight() {
        return overweight;
    }

    public void setOverweight(boolean overweight) {
        this.overweight = overweight;
    }

    public String getVision_left() {
        return vision_left;
    }

    public void setVision_left(String vision_left) {
        this.vision_left = vision_left;
    }

    public String getVision_right() {
        return vision_right;
    }

    public void setVision_right(String vision_right) {
        this.vision_right = vision_right;
    }

    public String getHearing_left() {
        return hearing_left;
    }

    public void setHearing_left(String hearing_left) {
        this.hearing_left = hearing_left;
    }

    public String getHearing_right() {
        return hearing_right;
    }

    public void setHearing_right(String hearing_right) {
        this.hearing_right = hearing_right;
    }

    public boolean isSpeech_defects() {
        return speech_defects;
    }

    public void setSpeech_defects(boolean speech_defects) {
        this.speech_defects = speech_defects;
    }

    public boolean isPallor() {
        return pallor;
    }

    public void setPallor(boolean pallor) {
        this.pallor = pallor;
    }

    public boolean isDental_caries() {
        return dental_caries;
    }

    public void setDental_caries(boolean dental_caries) {
        this.dental_caries = dental_caries;
    }

    public boolean isCalculus() {
        return calculus;
    }

    public void setCalculus(boolean calculus) {
        this.calculus = calculus;
    }

    public boolean isEnt_defects() {
        return ent_defects;
    }

    public void setEnt_defects(boolean ent_defects) {
        this.ent_defects = ent_defects;
    }

    public boolean isHeart_diseases() {
        return heart_diseases;
    }

    public void setHeart_diseases(boolean heart_diseases) {
        this.heart_diseases = heart_diseases;
    }

    public boolean isBronchial_asthma() {
        return bronchial_asthma;
    }

    public void setBronchial_asthma(boolean bronchial_asthma) {
        this.bronchial_asthma = bronchial_asthma;
    }

    public boolean isBehavioural_problems() {
        return behavioural_problems;
    }

    public void setBehavioural_problems(boolean behavioural_problems) {
        this.behavioural_problems = behavioural_problems;
    }

    public boolean isLearning_difficulties() {
        return learning_difficulties;
    }

    public void setLearning_difficulties(boolean learning_difficulties) {
        this.learning_difficulties = learning_difficulties;
    }

    public boolean isPediculosis() {
        return pediculosis;
    }

    public void setPediculosis(boolean pediculosis) {
        this.pediculosis = pediculosis;
    }

    public boolean isNight_blindness() {
        return night_blindness;
    }

    public void setNight_blindness(boolean night_blindness) {
        this.night_blindness = night_blindness;
    }

    public boolean isBitot_spots() {
        return bitot_spots;
    }

    public void setBitot_spots(boolean bitot_spots) {
        this.bitot_spots = bitot_spots;
    }

    public boolean isSquint() {
        return squint;
    }

    public void setSquint(boolean squint) {
        this.squint = squint;
    }

    public boolean isXerophthalmia() {
        return xerophthalmia;
    }

    public void setXerophthalmia(boolean xerophthalmia) {
        this.xerophthalmia = xerophthalmia;
    }

    public boolean isAngular_stomatitis_or_glossitis() {
        return angular_stomatitis_or_glossitis;
    }

    public void setAngular_stomatitis_or_glossitis(boolean angular_stomatitis_or_glossitis) {
        this.angular_stomatitis_or_glossitis = angular_stomatitis_or_glossitis;
    }

    public boolean isFluorisis() {
        return fluorisis;
    }

    public void setFluorisis(boolean fluorisis) {
        this.fluorisis = fluorisis;
    }

    public boolean isMalocculusion() {
        return malocculusion;
    }

    public void setMalocculusion(boolean malocculusion) {
        this.malocculusion = malocculusion;
    }

    public boolean isGoitre() {
        return goitre;
    }

    public void setGoitre(boolean goitre) {
        this.goitre = goitre;
    }

    public boolean isLymphadinopathy() {
        return lymphadinopathy;
    }

    public void setLymphadinopathy(boolean lymphadinopathy) {
        this.lymphadinopathy = lymphadinopathy;
    }

    public boolean isScabies() {
        return scabies;
    }

    public void setScabies(boolean scabies) {
        this.scabies = scabies;
    }

    public boolean isHypo_pigmented_anaesthetic_patches() {
        return hypo_pigmented_anaesthetic_patches;
    }

    public void setHypo_pigmented_anaesthetic_patches(boolean hypo_pigmented_anaesthetic_patches) {
        this.hypo_pigmented_anaesthetic_patches = hypo_pigmented_anaesthetic_patches;
    }

    public boolean isOther_skin_disorders() {
        return other_skin_disorders;
    }

    public void setOther_skin_disorders(boolean other_skin_disorders) {
        this.other_skin_disorders = other_skin_disorders;
    }

    public boolean isOrthopaedic_disorders() {
        return orthopaedic_disorders;
    }

    public void setOrthopaedic_disorders(boolean orthopaedic_disorders) {
        this.orthopaedic_disorders = orthopaedic_disorders;
    }

    public boolean isLung_diseases() {
        return lung_diseases;
    }

    public void setLung_diseases(boolean lung_diseases) {
        this.lung_diseases = lung_diseases;
    }

    public boolean isOther_defects() {
        return other_defects;
    }

    public void setOther_defects(boolean other_defects) {
        this.other_defects = other_defects;
    }

    public String getOther_defects_specify() {
        return other_defects_specify;
    }

    public void setOther_defects_specify(String other_defects_specify) {
        this.other_defects_specify = other_defects_specify;
    }

    public String getAction_taken() {
        return action_taken;
    }

    public void setAction_taken(String action_taken) {
        this.action_taken = action_taken;
    }

    public boolean isFollow_up_visit_one_month() {
        return follow_up_visit_one_month;
    }

    public void setFollow_up_visit_one_month(boolean follow_up_visit_one_month) {
        this.follow_up_visit_one_month = follow_up_visit_one_month;
    }

    public boolean isFollow_up_visit_three_month() {
        return follow_up_visit_three_month;
    }

    public void setFollow_up_visit_three_month(boolean follow_up_visit_three_month) {
        this.follow_up_visit_three_month = follow_up_visit_three_month;
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
        if (!(object instanceof SchoolMedicalExaminationRecordItem)) {
            return false;
        }
        SchoolMedicalExaminationRecordItem other = (SchoolMedicalExaminationRecordItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.schoolhealth.SchoolMedicalExaminationRecordItem[ id=" + id + " ]";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.faces;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lk.gov.health.schoolhealth.SummeryOfSchoolMedicalInspection;

/**
 *
 * @author User
 */
@Stateless
public class SummeryOfSchoolMedicalInspectionFacade extends AbstractFacade<SummeryOfSchoolMedicalInspection> {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SummeryOfSchoolMedicalInspectionFacade() {
        super(SummeryOfSchoolMedicalInspection.class);
    }
    
}

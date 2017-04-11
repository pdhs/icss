/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lk.gov.health.schoolhealth.AreaType;
import lk.gov.health.schoolhealth.InstitutionType;

/**
 *
 * @author pdhs-sp
 */
@ManagedBean
@SessionScoped
public class EnumController {

    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }
    
    public AreaType[] getAreaTypes(){
        return AreaType.values();
    }
    
    public InstitutionType[] getInstitutionTypes(){
        return InstitutionType.values();
    }
    
    
    
    
}

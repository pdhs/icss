/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import lk.gov.health.schoolhealth.AreaType;
import lk.gov.health.schoolhealth.PrivilegeType;

/**
 *
 * @author User
 */
@Named(value = "enumController")
@ApplicationScoped
public class EnumController {

    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }

    public AreaType[] getAreaTypes() {
        return AreaType.values();
    }

    public PrivilegeType[] getPrivilegeTypes(){
        return PrivilegeType.values();
    }
    
}

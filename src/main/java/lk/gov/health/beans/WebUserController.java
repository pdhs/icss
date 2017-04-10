package lk.gov.health.beans;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import lk.gov.health.schoolhealth.WebUser;
import lk.gov.health.beans.util.JsfUtil;
import lk.gov.health.beans.util.JsfUtil.PersistAction;
import lk.gov.health.faces.WebUserFacade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;
import lk.gov.health.schoolhealth.Area;
import lk.gov.health.schoolhealth.AreaType;
import lk.gov.health.schoolhealth.Institution;
import lk.gov.health.schoolhealth.PrivilegeType;

@Named
@SessionScoped
public class WebUserController implements Serializable {

    @EJB
    private lk.gov.health.faces.WebUserFacade ejbFacade;

    @Inject
    AreaController areaController;

    private List<WebUser> items = null;
    private WebUser selected;

    List<Area> myProvinces;
    List<Area> myDistricts;
    List<Area> myMohAreas;
    List<Area> myEducationalZones;
    List<Area> myPhiAreas;
    List<Area> myAreas;
    List<PrivilegeType> myPrivilegeTypes;

    private Area loggedPhiArea;
    private Area loggedMohArea;
    private Area loggedRdhsArea;
    private Area loggedPdhsArea;
    private Institution loggedMohOffice;
    private Institution loggedRdhsOffice;
    private WebUser loggedUser;
    private PrivilegeType loggedPrivilegeType;
    private boolean logged;
    private boolean developmentStage = false;

    private String userName;
    private String password;
    private String confirmPassword;
    private Area phiArea;
    private Area mohArea;
    private Area rdhsArea;
    private Institution mohOffice;
    private Institution rdhsOffice;

    public String toAddNewUser() {
        selected = new WebUser();
        selected.setActive(true);
        return "/webUser/add_new_user";
    }

    public String saveNewUser() {
        if (userName == null) {
            JsfUtil.addErrorMessage("Enter a Username");
            return "";
        }
        if (userName.trim().equals("")) {
            JsfUtil.addErrorMessage("Enter a Username");
            return "";
        }
        if (userName.contains(" ")) {
            JsfUtil.addErrorMessage("Username can NOT contain spaces");
            return "";
        }
        if (password == null) {
            JsfUtil.addErrorMessage("Enter a Password");
            return "";
        }
        if (password.contains(" ")) {
            JsfUtil.addErrorMessage("Password can NOT contain spaces");
            return "";
        }
        if (!password.equals(confirmPassword)) {
            JsfUtil.addErrorMessage("Passwords NOT matching");
            return "";
        }
        try {
            selected.setUserName(userName);
            selected.setPassword(password);
            getFacade().create(selected);
        } catch (Exception e) {
            JsfUtil.addErrorMessage("User name already taken. Please select another username");
            return "";
        }
        JsfUtil.addSuccessMessage("User Added");
        userName = "";
        password = "";
        confirmPassword = "";
        selected = null;
        return "/webUser/add_webuser_index";
    }

    public String login() {
        makeAllLoggedVariablesNull();
        if (developmentStage) {
            loggedUser = new WebUser();
            loggedUser.setType(PrivilegeType.System_Administrator);
        } else {
            String j;
            Map m = new HashMap();
            j = "select w from WebUser w "
                    + " where upper(w.userName) = :un "
                    + " and w.password=:pw "
                    + " order by w.id desc";
            m.put("un", userName.trim().toUpperCase());
            m.put("pw", password);
            loggedUser = getFacade().findFirstBySQL(j, m);
            if (loggedUser == null) {
                JsfUtil.addErrorMessage("Wrong login details, please retry!");
                return "";
            }
            if (loggedUser.isActive() != true) {
                JsfUtil.addErrorMessage("Your account needs Activation. Please contact system administrators!");
                return "";
            }
        }
        loggedPrivilegeType = loggedUser.getType();
        fillLogginDetails();
        fillPrivilegeTypes();
        logged = true;
        return "";
    }

    public void fillPrivilegeTypes() {
        myPrivilegeTypes = new ArrayList<PrivilegeType>();
        if (developmentStage) {
            //System Level
            myPrivilegeTypes.add(PrivilegeType.System_Administrator);
            myPrivilegeTypes.add(PrivilegeType.System_Super_User);
            myPrivilegeTypes.add(PrivilegeType.Institution_Administrator);
            myPrivilegeTypes.add(PrivilegeType.Institution_Super_User);
            //Provincial Level
            myPrivilegeTypes.add(PrivilegeType.CCP_PDHS);
            myPrivilegeTypes.add(PrivilegeType.MO_PDHS);
            myPrivilegeTypes.add(PrivilegeType.PSPHI);
            myPrivilegeTypes.add(PrivilegeType.PDHS_Staff);
            //District Level
            myPrivilegeTypes.add(PrivilegeType.CCP_RDHS);
            myPrivilegeTypes.add(PrivilegeType.MO_School_Health);
            myPrivilegeTypes.add(PrivilegeType.MO_RDHS);
            myPrivilegeTypes.add(PrivilegeType.DSPHI);
            myPrivilegeTypes.add(PrivilegeType.RDHS_Staff);
            //MOH Level
            myPrivilegeTypes.add(PrivilegeType.MOH);
            myPrivilegeTypes.add(PrivilegeType.AMOH);
            myPrivilegeTypes.add(PrivilegeType.MO);
            myPrivilegeTypes.add(PrivilegeType.RMO_AMO);
            myPrivilegeTypes.add(PrivilegeType.SPHI);
            //PHI Level
            myPrivilegeTypes.add(PrivilegeType.MOH_Staff);
            myPrivilegeTypes.add(PrivilegeType.PHI);
            myPrivilegeTypes.add(PrivilegeType.PHI_Staff);
            //Guest Level
            myPrivilegeTypes.add(PrivilegeType.Guest);
            return;
        }

        switch (loggedUser.getType()) {
            //Guest Level
            case Guest:
                myPrivilegeTypes.add(PrivilegeType.Guest);
                return;
            //PHI Level
            case PHI:
            case PHI_Staff:
                myPrivilegeTypes.add(PrivilegeType.PHI_Staff);
                myPrivilegeTypes.add(PrivilegeType.PHI);
                return;
            //MOH Level
            case MOH:
            case AMOH:
            case MO:
            case RMO_AMO:
            case SPHI:
            case MOH_Staff:
                myPrivilegeTypes.add(PrivilegeType.MOH);
                myPrivilegeTypes.add(PrivilegeType.AMOH);
                myPrivilegeTypes.add(PrivilegeType.MO);
                myPrivilegeTypes.add(PrivilegeType.RMO_AMO);
                myPrivilegeTypes.add(PrivilegeType.SPHI);
                myPrivilegeTypes.add(PrivilegeType.MOH_Staff);
                return;
            //District Level
            case CCP_RDHS:
            case MO_School_Health:
            case MO_RDHS:
            case DSPHI:
            case RDHS_Staff:
                myPrivilegeTypes.add(PrivilegeType.CCP_RDHS);
                myPrivilegeTypes.add(PrivilegeType.MO_School_Health);
                myPrivilegeTypes.add(PrivilegeType.MO_RDHS);
                myPrivilegeTypes.add(PrivilegeType.DSPHI);
                myPrivilegeTypes.add(PrivilegeType.RDHS_Staff);
                return;
            //Provincial Level
            case CCP_PDHS:
            case MO_PDHS:
            case PSPHI:
            case PDHS_Staff:
                myPrivilegeTypes.add(PrivilegeType.CCP_PDHS);
                myPrivilegeTypes.add(PrivilegeType.MO_PDHS);
                myPrivilegeTypes.add(PrivilegeType.PSPHI);
                myPrivilegeTypes.add(PrivilegeType.PDHS_Staff);
                return;
            //System Level

            case System_Super_User:
            case Institution_Super_User:
                myPrivilegeTypes.add(PrivilegeType.System_Super_User);
                myPrivilegeTypes.add(PrivilegeType.Institution_Super_User);
                return;
            case Institution_Administrator:
            case System_Administrator:
                myPrivilegeTypes.add(PrivilegeType.System_Administrator);
                myPrivilegeTypes.add(PrivilegeType.Institution_Administrator);
                return;
        }
    }

    public List<PrivilegeType> getMyPrivilegeTypes() {
        return myPrivilegeTypes;
    }

    public void setMyPrivilegeTypes(List<PrivilegeType> myPrivilegeTypes) {
        this.myPrivilegeTypes = myPrivilegeTypes;
    }

    public void fillLogginDetails() {
        if (developmentStage) {
//            loggedUser = new WebUser();
//            loggedUser.setType(PrivilegeType.System_Administrator);
            myAreas = areaController.getAreas(null, null);
        }
        switch (loggedUser.getType()) {
            case PHI:
            case PHI_Staff:
                loggedPhiArea = loggedUser.getArea();
                loggedMohArea = loggedPhiArea.getParentArea();
                loggedRdhsArea = loggedMohArea.getParentArea();
                loggedPdhsArea = loggedRdhsArea.getParentArea();
                myProvinces.add(loggedPdhsArea);
                myDistricts.add(loggedRdhsArea);
                myMohAreas.add(loggedMohArea);
                myPhiAreas.add(loggedPhiArea);
                myAreas = areaController.getAreas(null, loggedPhiArea);
                myEducationalZones=areaController.getAreas(AreaType.Province, loggedPdhsArea);
                break;
            case SPHI:
            case MOH:
            case AMOH:
            case RMO_AMO:
            case MO:
            case MOH_Staff:
                loggedMohArea = loggedUser.getArea();
                loggedRdhsArea = loggedMohArea.getParentArea();
                loggedPdhsArea = loggedRdhsArea.getParentArea();
                myProvinces.add(loggedPdhsArea);
                myDistricts.add(loggedRdhsArea);
                myMohAreas.add(loggedMohArea);
                myPhiAreas = areaController.getAreas(AreaType.PHI, loggedMohArea);
                myAreas = areaController.getAreas(null, loggedMohArea);
                myEducationalZones=areaController.getAreas(AreaType.Province, loggedPdhsArea);
                break;
            case MO_RDHS:
            case CCP_RDHS:
            case RDHS_Staff:
            case DSPHI:
            case MO_School_Health:
                loggedRdhsArea = loggedUser.getArea();
                loggedPdhsArea = loggedRdhsArea.getParentArea();
                myProvinces.add(loggedPdhsArea);
                myDistricts.add(loggedRdhsArea);
                myMohAreas = areaController.getAreas(AreaType.MOH, loggedRdhsArea);
                myPhiAreas = areaController.getAreas(AreaType.PHI, loggedRdhsArea);
                myAreas = areaController.getAreas(null, loggedRdhsArea);
                myEducationalZones=areaController.getAreas(AreaType.Province, loggedPdhsArea);
                break;
            case PSPHI:
            case PDHS_Staff:
            case MO_PDHS:
            case CCP_PDHS:
                loggedPdhsArea = loggedUser.getArea();
                myProvinces.add(loggedPdhsArea);
                myDistricts = areaController.getAreas(AreaType.District, loggedPdhsArea);
                myMohAreas = areaController.getAreas(AreaType.MOH, loggedPdhsArea);
                myPhiAreas = areaController.getAreas(AreaType.PHI, loggedPdhsArea);
                myAreas = areaController.getAreas(null, loggedPdhsArea);
                myEducationalZones=areaController.getAreas(AreaType.Province, loggedPdhsArea);
                break;
            case Institution_Administrator:
            case Institution_Super_User:
            case System_Administrator:
            case System_Super_User:
                myProvinces = areaController.getAreas(AreaType.Province, null);
                myDistricts = areaController.getAreas(AreaType.District, null);
                myMohAreas = areaController.getAreas(AreaType.MOH, null);
                myPhiAreas = areaController.getAreas(AreaType.PHI, null);
                myAreas = areaController.getAreas(null, null);
                myEducationalZones=areaController.getAreas(AreaType.Province, loggedPdhsArea);
                break;
            case Guest:
                break;
        }

    }

    public boolean isCapableOfAddingPhiAreas() {
        if (developmentStage) {
            return true;
        }
        if (loggedPrivilegeType == null) {
            return false;
        }
        switch (loggedPrivilegeType) {
            case System_Administrator:
            case System_Super_User:
            case Institution_Administrator:
            case Institution_Super_User:
            case MOH:
            case MOH_Staff:
            case AMOH:
            case MO:
            case RMO_AMO:
            case PSPHI:
            case DSPHI:
            case SPHI:
            case PHI:
            case PHI_Staff:
            case RDHS_Staff:
            case PDHS_Staff:
            case MO_School_Health:
            case MO_RDHS:
            case MO_PDHS:
            case CCP_PDHS:
            case CCP_RDHS:
                return true;
            case Guest:
                return false;

        }
        return false;
    }

    public boolean isCapableOfAddingMohAreas() {
        if (developmentStage) {
            return true;
        }
        if (loggedPrivilegeType == null) {
            return false;
        }
        switch (loggedPrivilegeType) {
            case System_Administrator:
            case System_Super_User:
            case Institution_Administrator:
            case Institution_Super_User:
            case PSPHI:
            case DSPHI:
            case SPHI:
            case RDHS_Staff:
            case PDHS_Staff:
            case MO_School_Health:
            case MO_RDHS:
            case MO_PDHS:
            case CCP_PDHS:
            case CCP_RDHS:
                return true;
            case PHI:
            case PHI_Staff:
            case MOH:
            case MOH_Staff:
            case AMOH:
            case MO:
            case RMO_AMO:
            case Guest:
                return false;

        }
        return false;
    }

    public boolean isCapableOfAddingRdhsAreas() {
        if (developmentStage) {
            return true;
        }
        if (loggedPrivilegeType == null) {
            return false;
        }
        switch (loggedPrivilegeType) {
            case System_Administrator:
            case System_Super_User:
            case Institution_Administrator:
            case Institution_Super_User:
            case PSPHI:
            case PDHS_Staff:
            case MO_PDHS:
            case CCP_PDHS:
                return true;
            case CCP_RDHS:
            case MO_School_Health:
            case MO_RDHS:
            case DSPHI:
            case SPHI:
            case RDHS_Staff:
            case PHI:
            case PHI_Staff:
            case MOH:
            case MOH_Staff:
            case AMOH:
            case MO:
            case RMO_AMO:
            case Guest:
                return false;

        }
        return false;
    }

    public boolean isCapableOfAddingProvinces() {
        if (developmentStage) {
            return true;
        }
        if (loggedPrivilegeType == null) {
            return false;
        }
        switch (loggedPrivilegeType) {
            case System_Administrator:
            case System_Super_User:
                return true;
            case Institution_Administrator:
            case Institution_Super_User:
            case PSPHI:
            case PDHS_Staff:
            case MO_PDHS:
            case CCP_PDHS:
            case CCP_RDHS:
            case MO_School_Health:
            case MO_RDHS:
            case DSPHI:
            case SPHI:
            case RDHS_Staff:
            case PHI:
            case PHI_Staff:
            case MOH:
            case MOH_Staff:
            case AMOH:
            case MO:
            case RMO_AMO:
            case Guest:
                return false;

        }
        return false;
    }

    public boolean isCapableOfManagingAnyArea() {
        if (developmentStage = true) {
            return true;
        }
        if (loggedPrivilegeType == null) {
            return false;
        }
        switch (loggedPrivilegeType) {
            case System_Administrator:
            case System_Super_User:
                return true;
            case Institution_Administrator:
            case Institution_Super_User:
            case PSPHI:
            case PDHS_Staff:
            case MO_PDHS:
            case CCP_PDHS:
            case CCP_RDHS:
            case MO_School_Health:
            case MO_RDHS:
            case DSPHI:
            case SPHI:
            case RDHS_Staff:
            case PHI:
            case PHI_Staff:
            case MOH:
            case MOH_Staff:
            case AMOH:
            case MO:
            case RMO_AMO:
            case Guest:
                return false;

        }
        return false;
    }

    public String logout() {
        makeAllLoggedVariablesNull();
        logged=false;
        return "";
    }

    public void makeAllLoggedVariablesNull() {
        myProvinces = new ArrayList<Area>();
        myDistricts = new ArrayList<Area>();
        myMohAreas = new ArrayList<Area>();
        myPhiAreas = new ArrayList<Area>();
        myEducationalZones = new ArrayList<Area>();
        loggedPhiArea = null;
        loggedMohArea = null;
        loggedRdhsArea = null;
        loggedMohOffice = null;
        loggedRdhsOffice = null;
        loggedPdhsArea = null;
        loggedUser = null;
        loggedPrivilegeType = null;
        logged = false;
    }

    public WebUserController() {
    }

    public AreaController getAreaController() {
        return areaController;
    }

    public void setAreaController(AreaController areaController) {
        this.areaController = areaController;
    }

    public List<Area> getMyProvinces() {
        return myProvinces;
    }

    public void setMyProvinces(List<Area> myProvinces) {
        this.myProvinces = myProvinces;
    }

    public List<Area> getMyDistricts() {
        return myDistricts;
    }

    public void setMyDistricts(List<Area> myDistricts) {
        this.myDistricts = myDistricts;
    }

    public List<Area> getMyMohAreas() {
        return myMohAreas;
    }

    public void setMyMohAreas(List<Area> myMohAreas) {
        this.myMohAreas = myMohAreas;
    }

    public List<Area> getMyPhiAreas() {
        return myPhiAreas;
    }

    public void setMyPhiAreas(List<Area> myPhiAreas) {
        this.myPhiAreas = myPhiAreas;
    }

    public WebUser getSelected() {
        return selected;
    }

    public void setSelected(WebUser selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private WebUserFacade getFacade() {
        return ejbFacade;
    }

    public List<Area> getMyEducationalZones() {
        return myEducationalZones;
    }

    public void setMyEducationalZones(List<Area> myEducationalZones) {
        this.myEducationalZones = myEducationalZones;
    }

    
    
    public WebUser prepareCreate() {
        selected = new WebUser();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("WebUserCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("WebUserUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("WebUserDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<WebUser> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public List<WebUser> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<WebUser> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public Area getLoggedPhiArea() {
        return loggedPhiArea;
    }

    public void setLoggedPhiArea(Area loggedPhiArea) {
        this.loggedPhiArea = loggedPhiArea;
    }

    public Area getLoggedMohArea() {
        return loggedMohArea;
    }

    public void setLoggedMohArea(Area loggedMohArea) {
        this.loggedMohArea = loggedMohArea;
    }

    public Area getLoggedRdhsArea() {
        return loggedRdhsArea;
    }

    public void setLoggedRdhsArea(Area loggedRdhsArea) {
        this.loggedRdhsArea = loggedRdhsArea;
    }

    public Area getLoggedPdhsArea() {
        return loggedPdhsArea;
    }

    public void setLoggedPdhsArea(Area loggedPdhsArea) {
        this.loggedPdhsArea = loggedPdhsArea;
    }

    public Institution getLoggedMohOffice() {
        return loggedMohOffice;
    }

    public void setLoggedMohOffice(Institution loggedMohOffice) {
        this.loggedMohOffice = loggedMohOffice;
    }

    public Institution getLoggedRdhsOffice() {
        return loggedRdhsOffice;
    }

    public void setLoggedRdhsOffice(Institution loggedRdhsOffice) {
        this.loggedRdhsOffice = loggedRdhsOffice;
    }

    public WebUser getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(WebUser loggedUser) {
        this.loggedUser = loggedUser;
    }

    public PrivilegeType getLoggedPrivilegeType() {
        return loggedPrivilegeType;
    }

    public void setLoggedPrivilegeType(PrivilegeType loggedPrivilegeType) {
        this.loggedPrivilegeType = loggedPrivilegeType;
    }

    public boolean isLogged() {
        if (developmentStage == true) {
            System.out.println("development Stage ");
            return true;
        }
        System.out.println("logged = " + logged);
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public boolean isDevelopmentStage() {
        return developmentStage;
    }

    public void setDevelopmentStage(boolean developmentStage) {
        this.developmentStage = developmentStage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Area getPhiArea() {
        return phiArea;
    }

    public void setPhiArea(Area phiArea) {
        this.phiArea = phiArea;
    }

    public Area getMohArea() {
        return mohArea;
    }

    public void setMohArea(Area mohArea) {
        this.mohArea = mohArea;
    }

    public Area getRdhsArea() {
        return rdhsArea;
    }

    public void setRdhsArea(Area rdhsArea) {
        this.rdhsArea = rdhsArea;
    }

    public Institution getMohOffice() {
        return mohOffice;
    }

    public void setMohOffice(Institution mohOffice) {
        this.mohOffice = mohOffice;
    }

    public Institution getRdhsOffice() {
        return rdhsOffice;
    }

    public void setRdhsOffice(Institution rdhsOffice) {
        this.rdhsOffice = rdhsOffice;
    }

    public List<Area> getMyAreas() {
        return myAreas;
    }

    public void setMyAreas(List<Area> myAreas) {
        this.myAreas = myAreas;
    }

    @FacesConverter(forClass = WebUser.class)
    public static class WebUserControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            WebUserController controller = (WebUserController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "webUserController");
            return controller.getFacade().find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof WebUser) {
                WebUser o = (WebUser) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), WebUser.class.getName()});
                return null;
            }
        }

    }

}

package lk.gov.health.beans;

import lk.gov.health.schoolhealth.SchoolMedicalExaminationRecord;
import lk.gov.health.beans.util.JsfUtil;
import lk.gov.health.beans.util.JsfUtil.PersistAction;
import lk.gov.health.faces.SchoolMedicalExaminationRecordFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@ManagedBean(name = "schoolMedicalExaminationRecordController")
@SessionScoped
public class SchoolMedicalExaminationRecordController implements Serializable {

    @EJB
    private lk.gov.health.faces.SchoolMedicalExaminationRecordFacade ejbFacade;
    private List<SchoolMedicalExaminationRecord> items = null;
    private SchoolMedicalExaminationRecord selected;

    public SchoolMedicalExaminationRecordController() {
    }

    public SchoolMedicalExaminationRecord getSelected() {
        return selected;
    }

    public void setSelected(SchoolMedicalExaminationRecord selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private SchoolMedicalExaminationRecordFacade getFacade() {
        return ejbFacade;
    }

    public SchoolMedicalExaminationRecord prepareCreate() {
        selected = new SchoolMedicalExaminationRecord();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("SchoolMedicalExaminationRecordCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("SchoolMedicalExaminationRecordUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("SchoolMedicalExaminationRecordDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<SchoolMedicalExaminationRecord> getItems() {
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

    public List<SchoolMedicalExaminationRecord> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<SchoolMedicalExaminationRecord> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = SchoolMedicalExaminationRecord.class)
    public static class SchoolMedicalExaminationRecordControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            SchoolMedicalExaminationRecordController controller = (SchoolMedicalExaminationRecordController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "schoolMedicalExaminationRecordController");
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
            if (object instanceof SchoolMedicalExaminationRecord) {
                SchoolMedicalExaminationRecord o = (SchoolMedicalExaminationRecord) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), SchoolMedicalExaminationRecord.class.getName()});
                return null;
            }
        }

    }

}

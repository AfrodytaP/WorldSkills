package AfrodytaPudlo;

import java.io.Serializable;

// class extends Person class and implements Serializable
public class Admin extends Person implements Serializable{
    private boolean isAdmin;

    //constructor 
    public Admin(boolean isAdmin, String iD, String firstName, String surname, String telephone, String password, String confirmPassword, String role) {
        super(iD, firstName, surname, telephone, password, confirmPassword, role);
        this.isAdmin = isAdmin;
    }

    
    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    
    
    
}

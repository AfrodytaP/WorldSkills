
package AfrodytaPudlo;

import java.io.Serializable;

//class implements Serializable
public class College implements Serializable{
    private String collegeName;

    //constructor
    public College(String collegeName) {
        this.collegeName = collegeName;
    }
    
    //getters and setters 
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
}

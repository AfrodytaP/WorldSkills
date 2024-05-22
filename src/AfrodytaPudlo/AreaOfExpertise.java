package AfrodytaPudlo;

import java.io.Serializable;


public enum AreaOfExpertise implements Serializable {
    Option1("Software Development"),
    Option2("Networking"),
    Option3("Web Design");

    public String areaName;
    
    AreaOfExpertise(String areaName){
        this.areaName = areaName;
    }
    
    public String getAreaName(){
        return this.areaName;
    }
    
    @Override
    public String toString(){
        return this.areaName;
    }
}

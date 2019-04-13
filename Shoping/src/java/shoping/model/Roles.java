package shoping.model;
// Generated Apr 12, 2019 8:45:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles  implements java.io.Serializable {


     private int id;
     private String name;
     private String status;
     private Set users = new HashSet(0);

    public Roles() {
    }

	
    public Roles(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public Roles(int id, String name, String status, Set users) {
       this.id = id;
       this.name = name;
       this.status = status;
       this.users = users;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}



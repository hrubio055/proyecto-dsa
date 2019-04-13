package shoping.model;
// Generated Apr 12, 2019 8:45:46 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ordes generated by hbm2java
 */
public class Ordes  implements java.io.Serializable {


     private int id;
     private User user;
     private String status;
     private Set orderDetailses = new HashSet(0);

    public Ordes() {
    }

	
    public Ordes(int id, User user, String status) {
        this.id = id;
        this.user = user;
        this.status = status;
    }
    public Ordes(int id, User user, String status, Set orderDetailses) {
       this.id = id;
       this.user = user;
       this.status = status;
       this.orderDetailses = orderDetailses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}


package shoping.model;
// Generated Apr 12, 2019 8:45:46 PM by Hibernate Tools 4.3.1



/**
 * Characteristics generated by hbm2java
 */
public class Characteristics  implements java.io.Serializable {


     private int id;
     private Products products;
     private int ram;
     private int disk;
     private String processor;
     private String screen;

    public Characteristics() {
    }

    public Characteristics(int id, Products products, int ram, int disk, String processor, String screen) {
       this.id = id;
       this.products = products;
       this.ram = ram;
       this.disk = disk;
       this.processor = processor;
       this.screen = screen;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public int getRam() {
        return this.ram;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getDisk() {
        return this.disk;
    }
    
    public void setDisk(int disk) {
        this.disk = disk;
    }
    public String getProcessor() {
        return this.processor;
    }
    
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getScreen() {
        return this.screen;
    }
    
    public void setScreen(String screen) {
        this.screen = screen;
    }




}



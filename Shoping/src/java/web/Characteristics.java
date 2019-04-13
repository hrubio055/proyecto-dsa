/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "characteristics")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Characteristics.findAll", query = "SELECT c FROM Characteristics c")
    , @NamedQuery(name = "Characteristics.findById", query = "SELECT c FROM Characteristics c WHERE c.id = :id")
    , @NamedQuery(name = "Characteristics.findByRam", query = "SELECT c FROM Characteristics c WHERE c.ram = :ram")
    , @NamedQuery(name = "Characteristics.findByDisk", query = "SELECT c FROM Characteristics c WHERE c.disk = :disk")
    , @NamedQuery(name = "Characteristics.findByProcessor", query = "SELECT c FROM Characteristics c WHERE c.processor = :processor")
    , @NamedQuery(name = "Characteristics.findByScreen", query = "SELECT c FROM Characteristics c WHERE c.screen = :screen")})
public class Characteristics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "RAM")
    private int ram;
    @Basic(optional = false)
    @Column(name = "Disk")
    private int disk;
    @Basic(optional = false)
    @Column(name = "processor")
    private String processor;
    @Basic(optional = false)
    @Column(name = "screen")
    private String screen;
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products productId;

    public Characteristics() {
    }

    public Characteristics(Integer id) {
        this.id = id;
    }

    public Characteristics(Integer id, int ram, int disk, String processor, String screen) {
        this.id = id;
        this.ram = ram;
        this.disk = disk;
        this.processor = processor;
        this.screen = screen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Characteristics)) {
            return false;
        }
        Characteristics other = (Characteristics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Characteristics[ id=" + id + " ]";
    }
    
}

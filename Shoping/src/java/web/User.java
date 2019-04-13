/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    , @NamedQuery(name = "User.findByEncryptedPassword", query = "SELECT u FROM User u WHERE u.encryptedPassword = :encryptedPassword")
    , @NamedQuery(name = "User.findByRememberCreateAt", query = "SELECT u FROM User u WHERE u.rememberCreateAt = :rememberCreateAt")
    , @NamedQuery(name = "User.findByUserName", query = "SELECT u FROM User u WHERE u.userName = :userName")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "encrypted_password")
    private String encryptedPassword;
    @Column(name = "remember_create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rememberCreateAt;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<LikeProducts> likeProductsCollection;
    @JoinColumn(name = "id_role", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Roles idRole;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Ordes> ordesCollection;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String email, String encryptedPassword, String userName) {
        this.id = id;
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public Date getRememberCreateAt() {
        return rememberCreateAt;
    }

    public void setRememberCreateAt(Date rememberCreateAt) {
        this.rememberCreateAt = rememberCreateAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonbTransient
    public Collection<LikeProducts> getLikeProductsCollection() {
        return likeProductsCollection;
    }

    public void setLikeProductsCollection(Collection<LikeProducts> likeProductsCollection) {
        this.likeProductsCollection = likeProductsCollection;
    }

    public Roles getIdRole() {
        return idRole;
    }

    public void setIdRole(Roles idRole) {
        this.idRole = idRole;
    }

    @JsonbTransient
    public Collection<Ordes> getOrdesCollection() {
        return ordesCollection;
    }

    public void setOrdesCollection(Collection<Ordes> ordesCollection) {
        this.ordesCollection = ordesCollection;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.User[ id=" + id + " ]";
    }
    
}

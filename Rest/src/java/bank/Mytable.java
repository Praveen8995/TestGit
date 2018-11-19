/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author praveen
 */
@Entity
@Table(name = "mytable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mytable.findAll", query = "SELECT m FROM Mytable m")
    , @NamedQuery(name = "Mytable.findByIfsc", query = "SELECT m FROM Mytable m WHERE m.ifsc = :ifsc")
    , @NamedQuery(name = "Mytable.findByBankId", query = "SELECT m FROM Mytable m WHERE m.bankId = :bankId")
    , @NamedQuery(name = "Mytable.findByBranch", query = "SELECT m FROM Mytable m WHERE m.branch = :branch")
    , @NamedQuery(name = "Mytable.findByAddress", query = "SELECT m FROM Mytable m WHERE m.address = :address")
    , @NamedQuery(name = "Mytable.findByCity", query = "SELECT m FROM Mytable m WHERE m.city = :city")
    , @NamedQuery(name = "Mytable.findByDistrict", query = "SELECT m FROM Mytable m WHERE m.district = :district")
    , @NamedQuery(name = "Mytable.findByState", query = "SELECT m FROM Mytable m WHERE m.state = :state")
    , @NamedQuery(name = "Mytable.findByBankName", query = "SELECT m FROM Mytable m WHERE m.bankName = :bankName")})
public class Mytable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ifsc")
    private String ifsc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bank_id")
    private int bankId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 74)
    @Column(name = "branch")
    private String branch;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 195)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "district")
    private String district;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 49)
    @Column(name = "bank_name")
    private String bankName;

    public Mytable() {
    }

    public Mytable(String ifsc) {
        this.ifsc = ifsc;
    }

    public Mytable(String ifsc, int bankId, String branch, String address, String city, String district, String state, String bankName) {
        this.ifsc = ifsc;
        this.bankId = bankId;
        this.branch = branch;
        this.address = address;
        this.city = city;
        this.district = district;
        this.state = state;
        this.bankName = bankName;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ifsc != null ? ifsc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mytable)) {
            return false;
        }
        Mytable other = (Mytable) object;
        if ((this.ifsc == null && other.ifsc != null) || (this.ifsc != null && !this.ifsc.equals(other.ifsc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bank.Mytable[ ifsc=" + ifsc + " ]";
    }
    
}

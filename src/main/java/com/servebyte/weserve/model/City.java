/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hp
 */

@Entity
@Table(name = "city")
public class City implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "city_name", nullable = false, unique = true)
    private String cityName;
    
   
    @Column(name = "created_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    
    @Column(name = "updated_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    
    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JsonIgnoreProperties({ "city"})
    private Set<ServiceProvider> serviceProviders;

    public City() {
    }

    public City(String cityName, Date createdTime, Date updatedTime) {
        this.cityName = cityName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public City(long id, String cityName, Date createdTime, Date updatedTime, Set<ServiceProvider> serviceProviders) {
        this.id = id;
        this.cityName = cityName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.serviceProviders = serviceProviders;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Set<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(Set<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
    
    

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", cityName=" + cityName + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + '}';
    }
    
    
}

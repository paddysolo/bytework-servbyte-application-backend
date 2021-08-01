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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.lang.Nullable;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "service_provider")
public class ServiceProvider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "restaurant_name", nullable = false)
    private String restaurantName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    
    @Column(name = "logoUrl", nullable = true)
    private String logoUrl;

    
    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "city_id", nullable = true)
    @Nullable
    @JoinTable(
            name = "service_provider_city",
            joinColumns = @JoinColumn(name = "service_provider_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id"))
    @JsonIgnoreProperties({"serviceProviders"})
    private City city;
    
    
    @OneToMany(mappedBy = "serviceProvider", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JsonIgnoreProperties({ "serviceProvider"})
    private Set<Meal> meals;
    

    @Column(name = "created_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Column(name = "updated_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    public ServiceProvider() {
    }

    public ServiceProvider(String restaurantName, String email, String phoneNumber, String logoUrl, City city, Set<Meal> meals, Date createdTime, Date updatedTime) {
        this.restaurantName = restaurantName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.logoUrl = logoUrl;
        this.city = city;
        this.meals = meals;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

 

 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "ServiceProvider{" + "id=" + id + ", restaurantName=" + restaurantName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", logoUrl=" + logoUrl + ", city=" + city + ", meals=" + meals + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + '}';
    }

    
    

    
}

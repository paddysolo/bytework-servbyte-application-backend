/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.lang.Nullable;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "meal")
public class Meal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "meal_name", nullable = false)
    private String mealName;

    @Column(name = "picture_url", nullable = false)
    private String pictureUrl;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "preparation_time", nullable = false)
    private int preparationTime;

    @Lob
    @Column(name = "description", columnDefinition = "LONGTEXT",nullable = false)
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "service_provider_id", nullable = true)
    @Nullable
    @JoinTable(
            name = "meal_service_provider",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "service_provider_id"))
    @JsonIgnoreProperties({"meals"})
    private ServiceProvider serviceProvider;

    @Column(name = "created_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Column(name = "updated_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    public Meal() {
    }

    public Meal(String mealName, String pictureUrl, BigDecimal price, int preparationTime, String description, ServiceProvider serviceProvider, Date createdTime, Date updatedTime) {
        this.mealName = mealName;
        this.pictureUrl = pictureUrl;
        this.price = price;
        this.preparationTime = preparationTime;
        this.description = description;
        this.serviceProvider = serviceProvider;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
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

    @Override
    public String toString() {
        return "Meal{" + "id=" + id + ", mealName=" + mealName + ", pictureUrl=" + pictureUrl + ", price=" + price + ", preparationTime=" + preparationTime + ", description=" + description + ", serviceProvider=" + serviceProvider + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + '}';
    }
    
    
}

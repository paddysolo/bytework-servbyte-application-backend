/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "service_category")
public class ServiceCategory implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    
   
    @Column(name = "created_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    
    @Column(name = "updated_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    public ServiceCategory() {
    }

    public ServiceCategory(String name, Date createdTime, Date updatedTime) {
        this.name = name;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "ServiceCategory{" + "id=" + id + ", name=" + name + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + '}';
    }
    
    
}

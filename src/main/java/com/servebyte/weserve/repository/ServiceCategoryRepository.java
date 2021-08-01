/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servebyte.weserve.model.ServiceCategory;

/**
 *
 * @author Hp
 */
public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Long>  {
    
}

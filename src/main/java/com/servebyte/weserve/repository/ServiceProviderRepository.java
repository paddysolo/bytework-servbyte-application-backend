/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.repository;

import com.servebyte.weserve.model.ServiceProvider;
import com.servebyte.weserve.model.City;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hp
 */
public interface ServiceProviderRepository  extends JpaRepository<ServiceProvider, Long>{
    List<ServiceProvider> findByCity(City city);
}

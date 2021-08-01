/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.controller;

import com.servebyte.weserve.response.DefaultResponses;
import com.servebyte.weserve.service.WebService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hp
 */
@RestController
@CrossOrigin
@RequestMapping("web")
public class WebController {

    private static final Logger L = LogManager.getLogger(WebController.class);

    @Autowired
    WebService webService;

    @GetMapping("getServiceCategories")
    public ResponseEntity getServiceCategories() {
        try {
            return webService.getServiceCategories();
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching service categories"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }

    @GetMapping("getCities")
    public ResponseEntity getCities() {
        try {
            return webService.getCities();
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching cities"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }

    @GetMapping("getServiceProviders")
    public ResponseEntity getServiceProviders() {
        try {
            return webService.getServiceProvider();
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching service providers"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }

    @GetMapping("getMeals")
    public ResponseEntity getMeals() {
        try {
            return webService.getMeals();
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching meals"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }

    @GetMapping("getServiceProviderByCity/{cityId}")
    public ResponseEntity getServiceProviderByCity(@PathVariable("cityId") long cityId) {
        try {
            return webService.findServiceProviderByCity(cityId);
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching service provider by city"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }

    @GetMapping("getMealsByServiceProvider/{serviceProviderId}")
    public ResponseEntity getMealsByServiceProvider(@PathVariable("serviceProviderId") long serviceProviderId) {
        try {
            return webService.findMealsByServiceProvider(serviceProviderId);
        } catch (Exception e) {
            L.error("Error during processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(DefaultResponses.response500("Error fetching meals by service provider"
                            + "  Error Case: " + e.getClass().getName()));
        }
    }
    
     @GetMapping("verifyPayment/{refNumber}/{mealId}")
    public ResponseEntity verifyPayment(@PathVariable("refNumber") String refNumber,@PathVariable("mealId") String mealId) {
        try {
            return ResponseEntity.ok(webService.verifyPayment(refNumber,mealId));
        } catch (Exception e) {
            L.error("Error During Processing", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(DefaultResponses.response500(e.getMessage()));
        }
    }
}

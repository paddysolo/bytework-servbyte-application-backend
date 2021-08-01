/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.service;

import com.servebyte.weserve.dto.VerifypaymentOutputDTO;
import com.servebyte.weserve.model.City;
import com.servebyte.weserve.model.Meal;
import com.servebyte.weserve.model.ServiceCategory;
import com.servebyte.weserve.model.ServiceProvider;
import com.servebyte.weserve.repository.CityRepository;
import com.servebyte.weserve.repository.MealRepository;
import com.servebyte.weserve.repository.ServiceCategoryRepository;
import com.servebyte.weserve.repository.ServiceProviderRepository;
import com.servebyte.weserve.response.ApiResponse;
import com.servebyte.weserve.response.DefaultResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Hp
 */
@Service
public class WebService {

    @Autowired
    private ServiceCategoryRepository serviceCategoryRepo;

    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private ServiceProviderRepository serviceProviderRepo;

    @Autowired
    private MealRepository mealRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weserve.secretkey}")
    private String SECRETKEY;
    @Value("${weserve.verifyApi}")
    private String VERIFYAPI;

    public ResponseEntity getServiceCategories() {
        List<ServiceCategory> serviceCategories = serviceCategoryRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Service Categories", serviceCategories));
    }

    public ResponseEntity getCities() {
        List<City> cities = cityRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Cities", cities));
    }

    public ResponseEntity getServiceProvider() {
        List<ServiceProvider> serviceProvider = serviceProviderRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Service Provider", serviceProvider));
    }

    public ResponseEntity findServiceProviderByCity(long cityId) {
        Optional<City> city = cityRepo.findById(cityId);
        List<ServiceProvider> serviceProviderByCity = serviceProviderRepo.findByCity(city.get());
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Service Provider in "
                + serviceProviderByCity.get(0).getCity().getCityName() + " State", serviceProviderByCity));
    }

    public ResponseEntity getMeals() {
        List<Meal> meals = mealRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Meals", meals));
    }

    public ResponseEntity findMealsByServiceProvider(long serviceProviderId) {
        Optional<ServiceProvider> serviceProvider = serviceProviderRepo.findById(serviceProviderId);
        List<Meal> mealByServiceProvider = mealRepo.findByServiceProvider(serviceProvider.get());
        return ResponseEntity.status(HttpStatus.OK).body(DefaultResponses.response200("Successfully Fetched All Meal by  "
                + serviceProvider.get().getRestaurantName(), mealByServiceProvider));
    }

    public ApiResponse verifyPayment(String refNumb, String mealId) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + SECRETKEY);

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<VerifypaymentOutputDTO> response = restTemplate.exchange(VERIFYAPI + refNumb, HttpMethod.GET, entity, VerifypaymentOutputDTO.class);

//        if (response.getBody().isStatus()) {
            //send mail to customer about the order
//        }
        return DefaultResponses.response200("Transfer Initiated", response);
    }
}

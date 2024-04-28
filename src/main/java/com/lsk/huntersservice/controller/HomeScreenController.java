package com.lsk.huntersservice.controller;


import com.lsk.huntersservice.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeScreenController{


    @Autowired
    HomeService homeService;


    @PostMapping("/home")
    public String getHomeScreenDetails(@RequestBody String protection){
        return homeService.getHomeScreenDetails(protection);
    }

    @PostMapping("/housing/search")
    public String searchHome(@RequestBody String housingDetails){
        return "";
    }
}
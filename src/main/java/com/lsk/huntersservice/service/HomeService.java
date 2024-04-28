package com.lsk.huntersservice.service;

import com.lsk.huntersservice.dao.HomeScreenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    HomeScreenDao homeScreenDao;

    public String getHomeScreenDetails(String protection){
        return homeScreenDao.getHomeScreenDetails();
    }


}

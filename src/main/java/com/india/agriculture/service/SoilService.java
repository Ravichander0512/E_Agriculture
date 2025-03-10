package com.india.agriculture.service;

import com.india.agriculture.model.Soil;
import com.india.agriculture.repository.SoilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoilService {

    @Autowired
    private SoilRepository soilRepository;

    public List<Soil> getSoils(){
        return soilRepository.findAll();
    }

    public Soil saveSoil(Soil soil) {
        return soilRepository.save(soil);
    }
}

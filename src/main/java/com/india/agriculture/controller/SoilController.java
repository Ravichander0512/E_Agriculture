package com.india.agriculture.controller;

import com.india.agriculture.model.Soil;
import com.india.agriculture.service.SoilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/soil")
@RestController
public class SoilController {

    @Autowired
    private SoilService soilService;

    @GetMapping
    public ResponseEntity<List<Soil>> getSoils(){
        return new ResponseEntity<>(soilService.getSoils(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Soil> saveSoil(@RequestBody Soil soil){
        return new ResponseEntity<>(soilService.saveSoil(soil),HttpStatus.CREATED);
    }
}

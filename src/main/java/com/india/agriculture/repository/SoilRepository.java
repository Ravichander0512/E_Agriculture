package com.india.agriculture.repository;

import com.india.agriculture.model.Soil;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoilRepository extends MongoRepository<Soil,String> {
}

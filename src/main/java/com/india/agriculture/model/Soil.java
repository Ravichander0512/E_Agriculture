package com.india.agriculture.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SOIL")
@Setter
@Getter
@ToString
public class Soil {
    @Id
    private String id;

    private String name;

    private String type;

}

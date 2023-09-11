package com.jay.tacocloud.entity;

import com.jay.tacocloud.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {

    private String id;

    private String name;

    private Type type;

}

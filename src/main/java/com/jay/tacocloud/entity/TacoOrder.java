package com.jay.tacocloud.entity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {

    @NotBlank(message = "delivery name is required")
    private String deliveryName;

    @NotBlank(message = "delivery street is required")
    private String deliveryStreet;

    @NotBlank(message = "delivery city is required")
    private String deliveryCity;

    @NotBlank(message = "delivery state is required")
    private String deliveryState;

    @NotBlank(message = "delivery zip is required")
    private String deliveryZip;

    @CreditCardNumber(message = "not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])(/)([2-9][0-9])$", message = "must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "invalid cvv")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }

}

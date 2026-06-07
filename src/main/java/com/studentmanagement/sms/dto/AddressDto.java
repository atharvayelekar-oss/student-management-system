package com.studentmanagement.sms.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Long id;

    private String type;

    private String city;

    private String state;

    private String country;
}
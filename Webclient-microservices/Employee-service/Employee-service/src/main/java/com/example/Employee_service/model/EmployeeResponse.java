package com.example.Employee_service.model;


//import com.example.Employee_service.response.AddressResponse;

import com.example.Employee_service.response.AddressResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String age;




    private AddressResponse addressResponse;
}
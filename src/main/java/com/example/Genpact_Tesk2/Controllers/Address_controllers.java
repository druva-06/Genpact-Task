package com.example.Genpact_Tesk2.Controllers;


import com.example.Genpact_Tesk2.DTOs.RequestDTOs.AddressRequestDto;
import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Services.Address_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class Address_controllers {

    @Autowired
    Address_Service addressService;

    @PostMapping("/add_address")
    public String add_address(@RequestBody AddressRequestDto address){
        addressService.add_address(address);
        return "successfully added into DB";
    }

}

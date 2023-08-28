package com.example.Genpact_Tesk2.Services;


import com.example.Genpact_Tesk2.DTOs.RequestDTOs.AddressRequestDto;
import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Entitys.Org;
import com.example.Genpact_Tesk2.Repositorys.Address_Repository;
import com.example.Genpact_Tesk2.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_Service {

    @Autowired
    Address_Repository addressRepository;

    @Autowired
    Org_Repository orgRepository;


    public void add_address(AddressRequestDto addressRequestDto) {
        Org org = orgRepository.findById(addressRequestDto.getOrg_id()).get();

        Address address = new Address();
        address.setCity(addressRequestDto.getCity());
        address.setState(addressRequestDto.getState());
        address.setCountry(addressRequestDto.getCountry());

        org.getAddressList().add(address);

        address.setOrg(org);

        addressRepository.save(address);
    }
}

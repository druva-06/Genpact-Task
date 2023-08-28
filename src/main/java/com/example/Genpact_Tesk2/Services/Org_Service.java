package com.example.Genpact_Tesk2.Services;


import com.example.Genpact_Tesk2.DTOs.ResponseDTOs.AddressResponseDto;
import com.example.Genpact_Tesk2.DTOs.ResponseDTOs.OrgDetailsResponseDto;
import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Entitys.Org;
import com.example.Genpact_Tesk2.Repositorys.Address_Repository;
import com.example.Genpact_Tesk2.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class Org_Service {

    @Autowired
    Org_Repository orgRepository;

    @Autowired
    Address_Repository addressRepository;
    public void add_org(Org org) {
        orgRepository.save(org);
    }

    public List<OrgDetailsResponseDto> org_all_branches() {

        List<OrgDetailsResponseDto> orgDetailsResponseDtoList = new ArrayList<>();

        List<Integer> orgIdList = addressRepository.findDistinctOrgId();
        for(Integer orgId: orgIdList){

            List<Address> addressList = addressRepository.findAddressByOrgId(orgId);
            System.out.println(orgId);
            List<AddressResponseDto>  addressResponseDtoList = new ArrayList<>();
            OrgDetailsResponseDto orgDetailsResponseDto = new OrgDetailsResponseDto();

            for(Address address: addressList){
                AddressResponseDto addressResponseDto = new AddressResponseDto();
                addressResponseDto.setCity(address.getCity());
                addressResponseDto.setState(address.getState());
                addressResponseDto.setCountry(address.getCountry());
                addressResponseDtoList.add(addressResponseDto);
            }

            System.out.println(addressResponseDtoList);

            orgDetailsResponseDto.setName(orgRepository.findById(orgId).get().getName());
            orgDetailsResponseDto.setAddressResponseDtoList(addressResponseDtoList);

            orgDetailsResponseDtoList.add(orgDetailsResponseDto);
        }

        return orgDetailsResponseDtoList;
    }
}

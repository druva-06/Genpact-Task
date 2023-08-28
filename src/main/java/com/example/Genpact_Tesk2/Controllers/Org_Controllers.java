package com.example.Genpact_Tesk2.Controllers;


import com.example.Genpact_Tesk2.DTOs.ResponseDTOs.OrgDetailsResponseDto;
import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Entitys.Org;
import com.example.Genpact_Tesk2.Services.Org_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class Org_Controllers {

    @Autowired
    Org_Service orgService;

    @PostMapping("/add_org")
    public String add_org(@RequestBody Org org){

        orgService.add_org(org);
        return "Org added into DB";
    }

    @GetMapping("/org_all_branches")
    public List<OrgDetailsResponseDto> org_all_ranches(){
        return orgService.org_all_branches();
    }
}

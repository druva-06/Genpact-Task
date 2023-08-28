package com.example.Genpact_Tesk2.Repositorys;


import com.example.Genpact_Tesk2.Entitys.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Address_Repository extends JpaRepository<Address,Integer> {
    @Query(value = "select DISTINCT(org_id) from address",nativeQuery = true)
    List<Integer> findDistinctOrgId();

    @Query(value = "select * from address where org_id=:org_id",nativeQuery = true)
    List<Address> findAddressByOrgId(Integer org_id);
}

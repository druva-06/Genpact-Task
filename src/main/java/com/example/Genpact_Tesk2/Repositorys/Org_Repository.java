package com.example.Genpact_Tesk2.Repositorys;

import com.example.Genpact_Tesk2.Entitys.Org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Org_Repository extends JpaRepository<Org,Integer> {

}

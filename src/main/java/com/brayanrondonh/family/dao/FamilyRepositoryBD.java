package com.brayanrondonh.family.dao;

import com.brayanrondonh.family.dto.Family;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FamilyRepositoryBD extends JpaRepository<Family, Long>
{
    public List<Family> findByfirstName(String firstName);
    public List<Family> findBydni(String dni);
    public List<Family> findByemail(String email);
}

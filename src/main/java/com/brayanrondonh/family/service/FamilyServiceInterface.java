package com.brayanrondonh.family.service;

import com.brayanrondonh.family.dto.Family;
import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation;

import java.util.List;

public interface FamilyServiceInterface
{
    public void insertFamily(Family family);
    public List<Family> findAllFamily();
    public List<Family> findByfirstName(String firstName);
    public List<Family> findBydni(String dni);
    public List<Family> findByemail(String email);
    public void updateFamily(Family family);
    public void deleteFamily(long id);
}

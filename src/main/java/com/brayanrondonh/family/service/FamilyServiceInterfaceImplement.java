package com.brayanrondonh.family.service;

import com.brayanrondonh.family.dao.FamilyRepositoryBD;
import com.brayanrondonh.family.dto.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceInterfaceImplement implements FamilyServiceInterface
{
    @Autowired
    FamilyRepositoryBD dao;

    public void insertFamily(Family family)
    {
        dao.save(family);
    }

    public List<Family> findAllFamily()
    {
        return dao.findAll();
    }

    public List<Family> findByfirstName(String firstName)
    {
        return dao.findByfirstName(firstName);
    }

    public List<Family> findBydni(String dni)
    {
        return dao.findBydni(dni);
    }

    public List<Family> findByemail(String email)
    {
        return dao.findByemail(email);
    }

    public void updateFamily(Family family)
    {
        dao.save(family);
    }

    public void deleteFamily(long id)
    {
        dao.deleteById(id);
    }
}

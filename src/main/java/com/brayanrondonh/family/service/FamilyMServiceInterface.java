package com.brayanrondonh.family.service;

import com.brayanrondonh.family.dto.FamilyM;
import java.util.List;

public interface FamilyMServiceInterface
{
    public FamilyM insertByFamilyM(FamilyM familyM);
    public List<FamilyM> findAllFamilyM();
    public FamilyM updateByFamilyM(FamilyM familyM);
    public void deleteByFamilyM(String id);
}

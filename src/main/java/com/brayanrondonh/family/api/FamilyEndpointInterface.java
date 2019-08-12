package com.brayanrondonh.family.api;

import com.brayanrondonh.family.dto.Family;
import java.util.List;

public interface FamilyEndpointInterface
{
    public void insert(Family family);
    public List<Family> findAllFamily();
    public void update(Family family);
    public void delete(long id);
}

package com.brayanrondonh.family.dao;

import com.brayanrondonh.family.dto.FamilyM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepositoryBDM extends MongoRepository<FamilyM, String> {}

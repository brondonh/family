package com.brayanrondonh.family.dao;

import com.brayanrondonh.family.dto.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepositoryBD extends JpaRepository<Family, Long> {}

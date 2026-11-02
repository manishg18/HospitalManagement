package com.smsk.hospitalmanagement.repository;

import com.smsk.hospitalmanagement.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRep extends JpaRepository<patient,Long>
{

}

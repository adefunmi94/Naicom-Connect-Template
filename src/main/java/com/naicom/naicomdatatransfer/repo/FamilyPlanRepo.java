package com.naicom.naicomdatatransfer.repo;

import com.naicom.naicomdatatransfer.model.FamilyPlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyPlanRepo extends JpaRepository<FamilyPlan, Long> {

}

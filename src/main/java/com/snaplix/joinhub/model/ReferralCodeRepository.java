package com.snaplix.joinhub.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralCodeRepository extends JpaRepository<ReferralCode, Long>{

    ReferralCode findByCategory(String category);
}
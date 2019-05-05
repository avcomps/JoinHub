package com.snaplix.joinhub.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferralCodeService {

    @Autowired
    ReferralCodeRepository repository;

    public List<ReferralCode> getAll(){
        return repository.findAll();
    }
}
package com.romero.myboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romero.myboard.entity.BbsEntity;

public interface BbsRepository extends JpaRepository<BbsEntity, Long>{
    
    
}

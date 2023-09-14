package com.romero.myboard.service;

import org.springframework.stereotype.Service;

import com.romero.myboard.dto.BbsDto;
import com.romero.myboard.entity.BbsEntity;
import com.romero.myboard.repository.BbsRepository;

import lombok.RequiredArgsConstructor;

// dto ==> entity
// entity ==> dto

@Service
@RequiredArgsConstructor
public class BbsService {
    
    private final BbsRepository bbsRepository;

    public void save(BbsDto bbsDto){

        BbsEntity bbsEntity = BbsEntity.toSavEntity(bbsDto);
        bbsRepository.save(bbsEntity);
    }

}

package com.romero.myboard.entity;


import com.romero.myboard.dto.BbsDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="bbs_table")
public class BbsEntity extends TimesEntity{
    @Id // pk 컬럼 지정, 필수 값
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long seq;

    @Column(length = 30)
    private String bbsWriter;

    @Column(length = 30)
    private String bbsPass;

    @Column(length = 500)
    private String bbsTitle;

    @Column(length = 1000)  //(columnDefinition = "TEXT")
    private String bbsContents;
    
    @Column
    private int bbsHits;

    public static BbsEntity toSavEntity(BbsDto bbsDto){
        BbsEntity bbsEntity = new BbsEntity();
        bbsEntity.setBbsWriter(bbsDto.getBbsWriter());
        bbsEntity.setBbsPass(bbsDto.getBbsPass());
        bbsEntity.setBbsTitle(bbsDto.getBbsTitle());
        bbsEntity.setBbsContents(bbsDto.getBbsContents());
        bbsEntity.setBbsHits(0);
        return bbsEntity;
    }

}

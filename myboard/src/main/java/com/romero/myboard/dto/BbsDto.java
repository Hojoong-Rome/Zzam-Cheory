package com.romero.myboard.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BbsDto {
    private Long seq;
    private String bbsWriter;
    private String bbsPass;
    private String bbsTitle;
    private String bbsContents;
    private int bbsHits;
    private LocalDateTime bbsCreatedTime;
    private LocalDateTime bbsUpdatedTime;
}

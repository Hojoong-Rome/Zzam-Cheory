package com.romero.myboard.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class TimesEntity {
    
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime bbsCreatedTime;

    @CreationTimestamp
    @Column(insertable = false)
    private LocalDateTime bbsUpdatedTime;

}

package com.company.ticketservice.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntityModel implements Serializable {
    @CreatedDate
    private Date createdAt;
    private Date updatedAt;
}

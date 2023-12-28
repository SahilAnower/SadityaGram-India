package com.sahil.sadityaGram.backend.entity.base;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntityAudit extends BaseEntity implements Serializable {
    @Column (name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}

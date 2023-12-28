package com.sahil.sadityaGram.backend.entity;

import com.sahil.sadityaGram.backend.entity.base.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "post")
public class Post extends BaseEntityAudit {
    // many to one mapping with media
    private String description;
    // likes
    // comments
}

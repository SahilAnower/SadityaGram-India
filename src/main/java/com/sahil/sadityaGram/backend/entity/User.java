package com.sahil.sadityaGram.backend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sahil.sadityaGram.backend.entity.base.BaseEntityAudit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
@EqualsAndHashCode (callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "user")
public class User extends BaseEntityAudit {
    private String name;
    private String image;
    private String pronouns;
    private String bio;
    private String gender;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @JsonFormat (pattern = "yyyy-MM-dd")
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private String username;
    private String email;
    private String phone;
    private String password;
    @Column(name = "encoded_password")
    private String encodedPassword;
}

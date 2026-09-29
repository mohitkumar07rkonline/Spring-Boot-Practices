package com.security.practices.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "reg_form")
public class RegFormEntity {
    @Id
    private int id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "email_id", nullable = false, unique = true)
    @Email
    private String emailId;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "mobile_number", nullable = false, unique = true)
    private String mobileNumber;

    @Column(name = "address", nullable = false)
    private String address;
}

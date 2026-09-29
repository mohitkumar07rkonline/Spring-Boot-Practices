package com.security.practices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LoginPageEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String emailId;

    @Column(name = "password", nullable = false)
    private String password;
}

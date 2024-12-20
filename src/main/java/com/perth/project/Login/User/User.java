package com.perth.project.Login.User;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "identification", uniqueConstraints = { @UniqueConstraint(columnNames = { "identification" }) })
public class User implements UserDetails {

    @Id
    @GeneratedValue
    Integer ID;
    @Basic
    @Column(nullable = false)
    String username;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String identification;
    String profile;
    String area;
    String email;
    Integer failedAttemps;
    Boolean blockedAccount;
    @Enumerated(EnumType.STRING)
    Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority((role.name())));
    }

}

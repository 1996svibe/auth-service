package com.example.auth.domain.request;

import com.example.auth.domain.entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String name;
    private String number;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}

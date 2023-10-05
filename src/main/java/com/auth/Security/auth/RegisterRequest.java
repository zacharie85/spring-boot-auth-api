package com.auth.Security.auth;

import com.auth.Security.user.Gender;
import com.auth.Security.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    private Gender gender;
    private LocalDateTime created_at;
}

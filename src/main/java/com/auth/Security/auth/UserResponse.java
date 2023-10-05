package com.auth.Security.auth;

import com.auth.Security.user.Gender;
import com.auth.Security.user.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ietf.jgss.GSSName;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    @JsonProperty("last_name")
    private  String last_name;
    @JsonProperty("first_name")
    private  String first_name;
    @JsonProperty("email")
    private  String email;
    @JsonProperty("role")
    private Role role;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("created_at")
    private LocalDateTime created_at;
}

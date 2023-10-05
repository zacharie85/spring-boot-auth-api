package com.auth.Security.auth;

import com.auth.Security.user.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}

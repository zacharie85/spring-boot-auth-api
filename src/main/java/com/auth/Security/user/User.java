package com.auth.Security.user;

import com.auth.Security.token.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "_user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique",columnNames = "email")
        }
)
public class User implements UserDetails {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Integer id;
    private  String last_name;
    private  String first_name;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String email;
    private  String password;
    @OneToMany(mappedBy = "user")
    private List<Token> tokens;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(
            name = "created_at",
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
    )
    private LocalDateTime created_at;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getAuthorities();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

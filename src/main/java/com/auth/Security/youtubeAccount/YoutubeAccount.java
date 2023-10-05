package com.auth.Security.youtubeAccount;

import com.auth.Security.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "YoutubeAccount")
@Table(name = "youtube_account")
public class YoutubeAccount {
    @EmbeddedId
    private YoutubeAccountId id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name="user_profile_id",
            foreignKey = @ForeignKey(
                    name = "user_profile_fk"
            )
    )
    private User user;
    @Column(
            name = "created_at",
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
    )
    private LocalDateTime created_at;

}

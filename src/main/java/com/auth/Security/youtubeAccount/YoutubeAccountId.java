package com.auth.Security.youtubeAccount;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
public class YoutubeAccountId  implements Serializable {
    @Column(name = "user_profile_id")
    private Integer userProfileId;

    public YoutubeAccountId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    public YoutubeAccountId() {
    }

    public void setUserProfileId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YoutubeAccountId that = (YoutubeAccountId) o;
        return Objects.equals(userProfileId,that.userProfileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId);
    }
}

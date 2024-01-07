package org.andrewkydev.api.database.models;


import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @SerializedName(value = "id")
    private Integer id;


    @Column(name = "nickname")
    @SerializedName(value = "nickname")
    private String nickname;

    @Column(name = "creation_date")
    @SerializedName(value = "creation_date")
    private LocalDateTime creationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @SerializedName(value = "user_statistic")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private UserStatistic userStatistic;


    @OneToOne(cascade = CascadeType.ALL)
    @SerializedName(value = "auth_information")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private AuthInformation authInformation;


    public User() {

    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public User setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;

    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;

    }

    public String getNickname() {
        return nickname;
    }

    public void setUserStatistic(UserStatistic userStatistic) {
        this.userStatistic = userStatistic;
    }

    public UserStatistic getUserStatistic() {
        return userStatistic;
    }

    public void setAuthInformation(AuthInformation authInformation) {
        this.authInformation = authInformation;
    }

    public AuthInformation getAuthInformation() {
        return authInformation;
    }

    @Override
    public String toString() {
        return "User [" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", creationDate=" + creationDate +
                ", userStatistic=" + userStatistic +
                ", authInformation=" + authInformation +
                ']';
    }
}

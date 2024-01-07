package org.andrewkydev.api.database.models;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

@Entity
@Table(name = "user_statistic")
public class UserStatistic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @SerializedName(value = "id")
    private Integer id;

    @Column(name = "block_placed")
    @SerializedName(value = "block_placed")
    Integer blockPlaced;

    @Column(name = "block_broken")
    @SerializedName(value = "block_broken")
    Integer blocksBroken;

    @Column(name = "playing_time")
    @SerializedName(value = "playing_time")
    Integer playingTime;

    public UserStatistic() {
    }

    public UserStatistic setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setBlockPlaced(Integer blockPlaced) {
        this.blockPlaced = blockPlaced;
    }

    public Integer getBlockPlaced() {
        return blockPlaced;
    }

    public void setBlocksBroken(Integer blocksBroken) {
        this.blocksBroken = blocksBroken;
    }

    public Integer getBlocksBroken() {
        return blocksBroken;
    }

    public void setPlayingTime(Integer playingTime) {
        this.playingTime = playingTime;
    }

    public Integer getPlayingTime() {
        return playingTime;
    }

    @Override
    public String toString() {
        return "UserStatistic [" +
                "id=" + id +
                ", blockPlaced=" + blockPlaced +
                ", blocksBroken=" + blocksBroken +
                ", playingTime=" + playingTime +
                ']';
    }
}

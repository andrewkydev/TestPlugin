package org.andrewkydev.api.database.models;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

@Entity
@Table(name = "auth_information")
public class AuthInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @SerializedName(value = "id")
    private Integer id;

    @Column(name = "email")
    @SerializedName(value = "email")
    private String email;

    @Column(name = "last_ip")
    @SerializedName(value = "last_ip")
    private String lastIp;

    @Column(name = "previous_ip")
    @SerializedName(value = "previous_ip")
    private String previous_ip;

    public AuthInformation() {
    }

    public AuthInformation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AuthInformation setLastIp(String lastIp) {
        this.lastIp = lastIp;
        return this;

    }

    public String getLastIp() {
        return lastIp;
    }

    public AuthInformation setEmail(String email) {
        this.email = email;
        return this;

    }

    public String getEmail() {
        return email;
    }

    public AuthInformation setPrevious_ip(String previous_ip) {
        this.previous_ip = previous_ip;
        return this;
    }

    public String getPrevious_ip() {
        return previous_ip;
    }
}

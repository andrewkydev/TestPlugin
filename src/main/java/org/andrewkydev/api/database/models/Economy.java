package org.andrewkydev.api.database.models;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name = "economy")
public class Economy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @SerializedName(value = "id")
    private Integer id;

    @Column(name = "money")
    @SerializedName(value = "money")
    private BigInteger money;

    @Column(name = "bank_money")
    @SerializedName(value = "bank_money")
    private BigInteger bankMoney;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ecId")
    @SerializedName(value = "ecId")
    private Set<EconomyTransactions> economyTransactions;

    public Economy() {
    }

    public Economy setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Economy setBankMoney(BigInteger bankMoney) {
        this.bankMoney = bankMoney;
        return this;
    }

    public BigInteger getBankMoney() {
        return bankMoney;
    }

    public Economy setEconomyTransactions(Set<EconomyTransactions> economyTransactions) {
        this.economyTransactions = economyTransactions;
        return this;
    }

    public Set<EconomyTransactions> getEconomyTransactions() {
        return economyTransactions;
    }

    public Economy setMoney(BigInteger money) {
        this.money = money;
        return this;
    }

    public BigInteger getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Economy [" +
                "id=" + id +
                ", money=" + money +
                ", bankMoney=" + bankMoney +
                ", economyTransactions=" + economyTransactions +
                ']';
    }
}

package org.andrewkydev.api.database.models;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "economy_transactons")
public class EconomyTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @SerializedName(value = "id")
    private Integer id;

    @Column(name = "amount")
    @SerializedName(value = "amount")
    private BigInteger amount;

    @Column(name = "transaction_date")
    @SerializedName(value = "transaction_date")
    private LocalDateTime transactionDate;

    @OneToOne(cascade = CascadeType.ALL)
    @SerializedName(value = "recipientId")
    @JoinColumn(name = "recipientId", referencedColumnName = "id")
    private User recipientId;

    public EconomyTransactions() {
    }

    public EconomyTransactions setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public EconomyTransactions setRecipientId(User recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    public User getRecipientId() {
        return recipientId;
    }

    public EconomyTransactions setAmount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public EconomyTransactions setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String toString() {
        return "EconomyTransactions [" +
                "id=" + id +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", recipientId=" + recipientId +
                ']';
    }
}

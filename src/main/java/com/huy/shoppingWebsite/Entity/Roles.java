package com.huy.shoppingWebsite.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Roles")
public class Roles {
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "role")
    private String role;
    public Roles(){}
    public Roles(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "account=" + account +
                ", role='" + role + '\'' +
                '}';
    }
}

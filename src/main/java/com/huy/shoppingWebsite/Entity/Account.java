package com.huy.shoppingWebsite.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
@Table(name="Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_id")
    private AccountInformation accountInformation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @OneToMany(mappedBy = "account",
            cascade = CascadeType.ALL
    )
    private List<Roles> roles;
    public Account(){}
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Add method for bidirectional relationship
    public void add(Roles role){
        if (roles == null){
            roles = new ArrayList<>();
        }
        roles.add(role);
        role.setAccount(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountInformation=" + accountInformation +
                ", roles=" + roles +
                '}';
    }
}

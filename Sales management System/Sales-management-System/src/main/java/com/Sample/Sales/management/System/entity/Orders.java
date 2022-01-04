package com.Sample.Sales.management.System.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int oid;
    @Column
    private Integer uid;
    @Column
    private int amount;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",referencedColumnName = "uid")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "spare_parts_id",referencedColumnName = "id")
    private List<Spare_Parts> spare_parts;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Spare_Parts> getSpare_parts() {
        return spare_parts;
    }

    public void setSpare_parts(List<Spare_Parts> spare_parts) {
        this.spare_parts = spare_parts;
    }
}

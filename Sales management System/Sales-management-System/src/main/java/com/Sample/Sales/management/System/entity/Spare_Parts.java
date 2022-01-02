package com.Sample.Sales.management.System.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spare_parts")
public class Spare_Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String Spare_parts_name;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id",referencedColumnName = "oid")
    private List<Orders> orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "spare_parts_types_id",referencedColumnName = "st_id")
    private Spare_Parts_types spare_parts_types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpare_parts_name() {
        return Spare_parts_name;
    }

    public void setSpare_parts_name(String spare_parts_name) {
        Spare_parts_name = spare_parts_name;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Spare_Parts_types getSpare_parts_types() {
        return spare_parts_types;
    }

    public void setSpare_parts_types(Spare_Parts_types spare_parts_types) {
        this.spare_parts_types = spare_parts_types;
    }
}

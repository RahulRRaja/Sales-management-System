package com.Sample.Sales.management.System.entity;

import javax.persistence.*;

@Entity(name = "spare_parts_types")
@Table(name = "spare_parts_types")
public class Spare_Parts_types {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private Integer st_id;
@Column
private String Spare_Parts_types_name;

    public Integer getSt_id() {
        return st_id;
    }

    public void setSt_id(Integer st_id) {
        this.st_id = st_id;
    }

    public String getSpare_Parts_types_name() {
        return Spare_Parts_types_name;
    }

    public void setSpare_Parts_types_name(String spare_Parts_types_name) {
        Spare_Parts_types_name = spare_Parts_types_name;
    }
}

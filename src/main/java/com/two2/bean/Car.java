package com.two2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ca")
public class Car {
    @Id
    @GeneratedValue
    private int cid;
    @Column(length = 20)
    private  String canme;
    @Column(length = 20)
    private  String color;
    @Column(length = 50)
    @FlywayDataSource
    private  String product_date;
}

package com.nelju.invoicesapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private Long id;
    private String name;
    private int quantity;
    private float price;
    private float total;
//    @ManyToOne
//    @JoinColumn(name="invoice_id", nullable=false)
//    private Invoice invoice;
}

package com.nelju.invoicesapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import .CascadeType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "INVOICE")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    private String createdAt;
    private String paymentDue;
    private String description;
    private int paymentTerms;
    private String clientName;
    private String clientEmail;
    private String status;
    private float total;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_address_id", referencedColumnName = "invoice_id")
    private SenderAddress senderAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "server_address_id", referencedColumnName = "invoice_id")
    private ClientAddress clientAddress;
    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ci_fk", referencedColumnName = "id")
    private Set<Item> items;
}

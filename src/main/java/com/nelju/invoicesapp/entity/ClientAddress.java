package com.nelju.invoicesapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@EnableAutoConfiguration
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT_ADDRESS")
public class ClientAddress {
    @Id
    @Column(name = "invoice_id")
    public Long id;
    public String street;
    public String city;
    public String postCode;
    public String country;
    @OneToOne
    @MapsId
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}

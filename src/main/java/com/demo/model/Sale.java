package com.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Sale {
    @Id
    @SequenceGenerator(
            name = "sale_sequence",
            sequenceName = "sale_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "sale_sequence"
    )
    private int id;
    @Column(nullable = false)
    private LocalDate date;

    @OneToOne
    @JoinColumn(name="id_client", referencedColumnName="ID", nullable = false)
    private Client client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

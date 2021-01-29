package com.demo.model;

import javax.persistence.*;

@Entity
@Table
public class SaleDetail {
    @Id
    @SequenceGenerator(
            name = "saleDetail_sequence",
            sequenceName = "saleDetail_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "saleDetail_sequence"
    )
    private int id;
    @Column(nullable = false)
    private Integer quantity;

    @OneToOne
    @JoinColumn(name="id_sale", referencedColumnName="ID", nullable = false)
    private Sale sale;

    @OneToOne
    @JoinColumn(name="id_product", referencedColumnName="ID", nullable = false)
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package com.teknologiinformasi.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private Double harga;
    private String deskripsi;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Double getHarga() {
        return harga;
    }
    
    public void setHarga(Double harga) {
        this.harga = harga;
    }

     public String getDeskripsi() {
       return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
       this.deskripsi = deskripsi;
    }
}
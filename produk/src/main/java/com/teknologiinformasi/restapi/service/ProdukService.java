package com.teknologiinformasi.restapi.service;

import com.teknologiinformasi.restapi.model.Produk;
import com.teknologiinformasi.restapi.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdukService {
    
    @Autowired
    private ProdukRepository produkRepository;
    
    public List<Produk> getAllProduk() {
        return produkRepository.findAll();
    }
    
    public Optional<Produk> getProdukById(Long id) {
        return produkRepository.findById(id);
    }
    
    public Produk createProduk(Produk produk) {
        return produkRepository.save(produk);
    }
    
    public Produk updateProduk(Long id, Produk produkDetails) {
        Produk produk = produkRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produk not found with id: " + id));
            
        produk.setNama(produkDetails.getNama());
        produk.setHarga(produkDetails.getHarga());
        
        return produkRepository.save(produk);
    }
    
    public void deleteProduk(Long id) {
        Produk produk = produkRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produk not found with id: " + id));
            
        produkRepository.delete(produk);
    }
}
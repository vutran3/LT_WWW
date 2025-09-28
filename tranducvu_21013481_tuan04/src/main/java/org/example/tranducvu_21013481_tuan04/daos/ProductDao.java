package org.example.tranducvu_21013481_tuan04.daos;

import org.example.tranducvu_21013481_tuan04.entities.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> findAll();
    public Product getById(int id);
    public void addProduct(Product p);
}

package model.dao;

import java.sql.Connection;
import java.util.List;

import model.entities.Seller;

public class SellerDao {

    public SellerDao(Connection connection) {
    }

    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    public Seller findById(Integer id);

    List<Seller> findAll();
}

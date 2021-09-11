package com.dsvendas.BIP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsvendas.BIP.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller,Long> {

}

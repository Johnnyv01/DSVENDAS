package com.dsvendas.BIP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsvendas.BIP.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale,Long> {

}

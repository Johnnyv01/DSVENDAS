package com.dsvendas.BIP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dsvendas.BIP.dto.SaleSuccesDTO;
import com.dsvendas.BIP.dto.SaleSumDTO;
import com.dsvendas.BIP.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale,Long> {
 
	@Query("SELECT new com.dsvendas.BIP.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) "
			+"FROM Sale AS obj GROUP BY	obj.seller")
	List<SaleSumDTO> amountGroupBySeller();

@Query("SELECT new com.dsvendas.BIP.dto.SaleSuccesDTO(obj.seller,SUM(obj.visited), SUM(obj.deals)) "
		+"FROM Sale AS obj GROUP BY	obj.seller")
List<SaleSuccesDTO> succesGroupBySeller();
}


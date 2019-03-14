package com.fyle.banks.repository;

import com.fyle.banks.model.BankBranchesModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankBranchesRepository extends JpaRepository<BankBranchesModel, String> {
	
	@Query(value = "SELECT branch FROM bank_branches WHERE bank_name = ? and city = ?",nativeQuery = true)
	List<String> getBranchDetails(String bankName,String city);
	
	BankBranchesModel getBankByIfsc(String ifsc);
}
 
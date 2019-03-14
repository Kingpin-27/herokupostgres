package com.fyle.banks.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import lombok.Data;

@Data
@Entity
@Table(name = "bank_branches")
public class BankBranchesModel {
	
	@Column(name = "bank_id")
    private Long bankId;
	
	@Id
	private String ifsc;
	
	@Column(name = "bank_name")
	private String bankName;
	
    private String branch;
    private String address;
    private String city; 
    private String district;
    private String state;
}
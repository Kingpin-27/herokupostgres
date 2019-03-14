package com.fyle.banks.controller;

import com.fyle.banks.model.BankBranchesModel;
import com.fyle.banks.repository.BankBranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private BankBranchesRepository repository;

    @GetMapping("/fetchAll")
    public List<BankBranchesModel> getAllDtls() {
        return repository.findAll();
    }

    @GetMapping("/fetchDtl/{ifsc}")
    public BankBranchesModel getBankByIfsc(@PathVariable String ifsc) {
        return repository.getBankByIfsc(ifsc);
    }
    
    @GetMapping("/fetchBranches/{bankName}/{city}")
    public List<String> getBranches(@PathVariable String bankName,@PathVariable String city) {
        return repository.getBranchDetails(bankName, city);
    }
}

package com.bt.ms.im.ngpos.dbclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.ms.im.ngpos.dbclient.entity.dto.GetAccountCatgDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetAccountTypeDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCreditDefaultDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDlrAccCtgDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPrintingCategoryDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetSSAcctCategoryDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetValidationRuleSetDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetWwwEnabledIndDto;
import com.bt.ms.im.ngpos.dbclient.repository.AccountTypesRepository;


@SpringBootApplication(scanBasePackages = { "com.bt.ms.im.ngpos.dbclient" }, exclude = { SecurityAutoConfiguration.class })
@RestController

public class DbClient {
	
	@Autowired
	AccountTypesRepository accounttypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbClient.class, args);
	}
	@GetMapping(value = "/test/accounttype")
	public void getAccountType() {
		List<GetAccountCatgDto> accounttype = accounttypeRepository.findAccountCatgByAtAccountType("High");
		accounttype.stream().forEach(i -> {
			System.out.println(i.getAtAccountType());
			System.out.println(i.getAtAccountCategory());
			
			
		});
		
		List<GetWwwEnabledIndDto> accounttype1 = accounttypeRepository.findWwwEnabledIndDtoByAtAccountType("Low");
		accounttype1.stream().forEach(i -> {
			System.out.println(i.getwwwEnabled());
		});
		List<GetDlrAccCtgDto> accounttype2 = accounttypeRepository.findDlrAccCtgDtoByAtAccountType("Low");
		accounttype2.stream().forEach(i -> {
			System.out.println(i.getatAccountCategory());
		});
		
		List<GetCreditDefaultDto> accounttype3 = accounttypeRepository.findCreditDefaultByAtAccountType("Low");
		accounttype3.stream().forEach(i -> {
			System.out.println(i.getatAccountCategory());
			System.out.println(i.getatCrdtResExpPrd());
			System.out.println(i.getatCreditVetType());
			System.out.println(i.getatCreFudManCrd());
			System.out.println(i.getatDefCreditClass());
			
		});
		
		List<GetSSAcctCategoryDto> accounttype4 = accounttypeRepository.findSSAcctCategoryByWwwEnabled("Y");
		accounttype4.stream().forEach(i -> {
			System.out.println(i.getatAccountCategory());
			System.out.println(i.getatAccountType());
			System.out.println(i.getatAccountTypeDesc());
			System.out.println(i.getatAllowCollMigPreInd());
			
			
		});
		
		List<GetAccountTypeDetailsDto> accounttype5 = accounttypeRepository.findAccountTypeDetailsByAtAccountType("Low");
		accounttype5.stream().forEach(i -> {
			System.out.println(i.getatDocumentType());
			System.out.println(i.getatDefCustValue());
			System.out.println(i.getatColBureauReportInd());
			
		});
		
		List<GetPrintingCategoryDto> accounttype6 = accounttypeRepository.findPrintingCategoryByAtAccountType("Low");
		accounttype6.stream().forEach(i -> {
			System.out.println(i.getatPrintingCategory());
		});
		
		List<GetValidationRuleSetDto> accounttype7 = accounttypeRepository.findValidationRuleSetByAtAccountType("Low");
		accounttype7.stream().forEach(i -> {
			System.out.println(i.getccVldRuleSet());
		});
		
		

	}}

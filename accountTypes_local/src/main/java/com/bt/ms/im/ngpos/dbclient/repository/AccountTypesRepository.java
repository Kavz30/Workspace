package com.bt.ms.im.ngpos.dbclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bt.ms.im.ngpos.dbclient.entity.AccountTypes;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetAccountCatgDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetAccountTypeDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCreditDefaultDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDlrAccCtgDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPrintingCategoryDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetSSAcctCategoryDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetValidationRuleSetDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetWwwEnabledIndDto;



@Transactional(timeout=3)
@Repository

public interface AccountTypesRepository  extends JpaRepository<AccountTypes, String>{

	List<GetAccountCatgDto> findAccountCatgByAtAccountType(String acccountType);
	
	List<GetWwwEnabledIndDto> findWwwEnabledIndDtoByAtAccountType(String accountType);
	
	List<GetDlrAccCtgDto> findDlrAccCtgDtoByAtAccountType(String accountType);
	
	List<GetCreditDefaultDto> findCreditDefaultByAtAccountType(String accountType);
	
	List<GetSSAcctCategoryDto> findSSAcctCategoryByWwwEnabled(String wwwEnabled);
	
	List<GetAccountTypeDetailsDto> findAccountTypeDetailsByAtAccountType(String accountType);
	
	List<GetPrintingCategoryDto> findPrintingCategoryByAtAccountType(String accountType);
	
	List<GetValidationRuleSetDto> findValidationRuleSetByAtAccountType(String accountType);
}

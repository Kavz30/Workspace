package com.bt.ms.im.ngpos.dbclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bt.ms.im.ngpos.dbclient.entity.DealerGroups;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCntrctStatusDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerGroupsInfoDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerOtpDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerProofDataDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDepAgreementIndDto;



@Transactional(timeout=3)
@Repository

public interface DealerGroupsRepository extends JpaRepository<DealerGroups, String> {
	
	List<GetDepAgreementIndDto> findDepAgreementIndByDealerGroup(String dealerCode);
	
	List<GetDealerGroupsInfoDto> findDealerGroupsInfoByDealerGroup(String dealerCode);
	
	List<GetDealerProofDataDto> findDealerProofDataDtoByDealerGroup(String dealerCode);
	
	List<GetCntrctStatusDto> findCntrctStatusByDealerGroup(String dealerCode);
	
	List<GetDealerDetailsDto> findDealerDetailsByDealerGroup(String dealerCode);
	
	List<GetDealerOtpDetailsDto> findDealerOtpDetailsByDealerGroup(String dealerCode);
	
	

}

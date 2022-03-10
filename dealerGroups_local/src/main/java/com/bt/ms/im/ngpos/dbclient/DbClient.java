package com.bt.ms.im.ngpos.dbclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCntrctStatusDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerGroupsInfoDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerOtpDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDealerProofDataDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetDepAgreementIndDto;
import com.bt.ms.im.ngpos.dbclient.repository.DealerGroupsRepository;

@SpringBootApplication(scanBasePackages = { "com.bt.ms.im.ngpos.dbclient" }, exclude = { SecurityAutoConfiguration.class })
@RestController
public class DbClient {
	
	@Autowired
	DealerGroupsRepository dealerGroupRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbClient.class, args);
	}
	
	@GetMapping(value = "/test/dealergroup")
	public void getDealerGroup() {
		List<GetDepAgreementIndDto> dealergroup = dealerGroupRepository.findDepAgreementIndByDealerGroup("High");
		dealergroup.stream().forEach(i -> {
			System.out.println(i.getdepositAgreementInd());
			});
		
		List<GetDealerGroupsInfoDto> dealergroup1 = dealerGroupRepository.findDealerGroupsInfoByDealerGroup("High");
		dealergroup1.stream().forEach(i -> {
			System.out.println(i.getwebPasswd());
			System.out.println(i.getcopInd());
			System.out.println(i.getwebSecFlg());
			System.out.println(i.getdctRoute());
		});
		
		List<GetDealerProofDataDto> dealergroup2 = dealerGroupRepository.findDealerProofDataDtoByDealerGroup("High");
		dealergroup2.stream().forEach(i -> {
			System.out.println(i.getavsInd());
			System.out.println(i.getproofReqInd());
			
			
		});
		
		List<GetCntrctStatusDto> dealergroup3 = dealerGroupRepository.findCntrctStatusByDealerGroup("High");
		dealergroup3.stream().forEach(i -> {
			System.out.println(i.getdefCntrctStatus());
			
			
			
		});
		
		List<GetDealerDetailsDto> dealergroup4 = dealerGroupRepository.findDealerDetailsByDealerGroup("High");
		dealergroup4.stream().forEach(i -> {
			System.out.println(i.getdealerGroup());
			System.out.println(i.getbranchCodeInd());
			
	});
		
		List<GetDealerOtpDetailsDto> dealergroup5 = dealerGroupRepository.findDealerOtpDetailsByDealerGroup("High");
		dealergroup5.stream().forEach(i -> {
			System.out.println(i.getotpReq());
			System.out.println(i.getapprovalReq());
			System.out.println(i.getpinPeriod());

			
	});



	}}

package com.bt.ms.im.ngpos.dbclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.ms.im.ngpos.dbclient.entity.dto.GetBuynetPaymentSubTypeDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCV2LengthsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCardTypesDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCrdCardOffLineIndDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCv2LengthDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPaymentSubTypeDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPaymentSubTypeDto;
import com.bt.ms.im.ngpos.dbclient.repository.PaymentSubTypeRepository;

@SpringBootApplication(scanBasePackages = { "com.bt.ms.im.ngpos.dbclient" }, exclude = { SecurityAutoConfiguration.class })
@RestController

public class PaymentSubtype1LocalApplication {
	
	@Autowired
	PaymentSubTypeRepository paymentSubtypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaymentSubtype1LocalApplication.class, args);
	}
	
	@GetMapping(value = "/test/paymentsubtype")
	public void getpaymentsubtype() {
		List<GetCV2LengthsDto> paymentsubtype = paymentSubtypeRepository.findCV2LengthsByOrderByPstDescp();
		
	paymentsubtype.stream().forEach(i -> {
			System.out.println(i.getccCv2Length());
			System.out.println(i.getpymSubType());
			
			
		});
	
	List<GetCardTypesDto> paymentsubtype1 = paymentSubtypeRepository.findCardTypesByOrderByPstDescp();
	
	paymentsubtype1.stream().forEach(i -> {
		System.out.println(i.getccExpDateInd());
		System.out.println(i.getccIssueDateInd());
		System.out.println(i.getpstDescp());
			
	});
	
List<GetCrdCardOffLineIndDto> paymentsubtype2 = paymentSubtypeRepository.findCrdCardOffLineByPymTypeAndPymSubType("s", "B");
	
	paymentsubtype2.stream().forEach(i -> {
		System.out.println(i.getccOfflineInd());
		
});
	
List<GetCv2LengthDto> paymentsubtype3 = paymentSubtypeRepository.findCv2LengthByPymTypeAndPymSubType("s", "B");
	
	paymentsubtype3.stream().forEach(i -> {
		System.out.println(i.getccCv2Length());
		
});
List<GetPaymentSubTypeDto> paymentsubtype4 = paymentSubtypeRepository.findPaymentSubTypeByPymTypeAndPymSubType("s", "B");
	
	paymentsubtype4.stream().forEach(i -> {
		System.out.println(i.getccExpDateInd());
		System.out.println(i.getccIssueDateInd());
		
});
List<GetPaymentSubTypeDetailsDto> paymentsubtype5 = paymentSubtypeRepository.findPaymentSubTypeDetailsByPymSubType("B");
	
	paymentsubtype5.stream().forEach(i -> {
		System.out.println(i.getccExpDateInd());
		System.out.println(i.getccIssueDateInd());
		
});
List<GetBuynetPaymentSubTypeDto> paymentsubtype6 = paymentSubtypeRepository.findBuynetPaymentSubTypeByPymTypeAndBnCardtype("s", "kav");
	
	paymentsubtype6.stream().forEach(i -> {
		System.out.println(i.getccExpDateInd());
		System.out.println(i.getccIssueDateInd());
		
});


}}

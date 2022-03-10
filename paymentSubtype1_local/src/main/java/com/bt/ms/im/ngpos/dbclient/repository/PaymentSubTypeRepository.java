package com.bt.ms.im.ngpos.dbclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bt.ms.im.ngpos.dbclient.entity.PaymentSubType;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetBuynetPaymentSubTypeDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCV2LengthsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCardTypesDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCrdCardOffLineIndDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetCv2LengthDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPaymentSubTypeDetailsDto;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetPaymentSubTypeDto;

@Transactional(timeout=3)
@Repository
public interface PaymentSubTypeRepository extends JpaRepository <PaymentSubType,String >{
	
	List<GetCV2LengthsDto> findCV2LengthsByOrderByPstDescp();
	
	List<GetCardTypesDto> findCardTypesByOrderByPstDescp();
	
	List<GetCrdCardOffLineIndDto> findCrdCardOffLineByPymTypeAndPymSubType(String paymentType, String paymentSubType);
	
	List<GetCv2LengthDto> findCv2LengthByPymTypeAndPymSubType(String pymType, String crtCrdType);

	List<GetPaymentSubTypeDto> findPaymentSubTypeByPymTypeAndPymSubType(String paymentType, String paymentSubType);
	
	List<GetPaymentSubTypeDetailsDto> findPaymentSubTypeDetailsByPymSubType(String ccType);
	
	List<GetBuynetPaymentSubTypeDto> findBuynetPaymentSubTypeByPymTypeAndBnCardtype(String paymentType, String paymentSubType);
}

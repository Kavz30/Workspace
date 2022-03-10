package com.bt.ms.im.ngpos.dbclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_SUB_TYPE")
public class PaymentSubType {
	
	@Id
	@Column(name="PYM_TYPE")
	private String pymType;
	
	@Column(name="PYM_SUB_TYPE")
	private String pymSubType ;
	
	@Column(name="PST_DESC")
	private String pstDescp  ;
	

	@Column(name="CC_ISSUE_DATE_IND")
	private String ccIssueDateInd  ;

	@Column(name="CC_EXP_DATE_IND")
	private String ccExpDateInd  ;
	
	@Column(name="CC_ISSUE_NO_IND ")
	private String ccIssueNoInd  ;
	
	@Column(name="CC_CV2_LENGTH")
	private double ccCv2Length  ;
	
	@Column(name="CC_OFFLINE_IND")
	private String ccOfflineInd  ;
	
	@Column(name="BN_CARDTYPE")
	private String bnCardtype  ;
	

	@Column(name="CC_DEBIT")
	private String ccDebit  ;

}

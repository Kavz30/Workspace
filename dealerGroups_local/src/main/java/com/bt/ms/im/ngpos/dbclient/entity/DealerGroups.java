package com.bt.ms.im.ngpos.dbclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEALER_GROUPS")
public class DealerGroups {
	
	@Id
	@Column(name="DEALER_GROUP")
	private String dealerGroup;
	
	@Column(name="DEPOSIT_AGREEMENT_IND")
	private String depositAgreementInd;
	
	@Column(name="PROOF_REQ_IND")
	private String proofReqInd;
	
	@Column(name="DEF_CNTRCT_STATUS")
	private String defCntrctStatus ;
	
	@Column(name="BRANCH_CODE_IND")
	private String branchCodeInd  ;
	
	@Column(name="WEB_PASSWD")
	private String webPasswd ;
	
	@Column(name="COP_IND")
	private String copInd ;
	
	@Column(name="AVS_IND")
	private String avsInd ;
	
	@Column(name="DCT_ROUTE")
	private String dctRoute ;
	
	@Column(name="WEB_SEC_FLG")
	private String webSecFlg  ;
	
	@Column(name="OTP_REQ")
	private String otpReq  ;
	
	@Column(name="APPROVAL_REQ")
	private String approvalReq ;
	
	@Column(name="PIN_PERIOD")
	private String pinPeriod ;
	
}

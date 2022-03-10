package com.bt.ms.im.ngpos.dbclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account_Types")
public class AccountTypes {
	@Id
	@Column(name="AT_ACCOUNT_TYPE")
	private String atAccountType;
	
	@Column(name="AT_ACCOUNT_CATEGORY")
	private String atAccountCategory;
	
	@Column(name="AT_DOCUMENT_TYPE  ")
	private String atDocumentType;
	
	@Column(name="AT_DEF_CUST_VALUE")
	private String atDefCustValue;
	
	@Column(name="AT_COL_BUREAU_REPORT_IND ")
	private String atColBureauReportInd;
	
	@Column(name="AT_CREDIT_VET_TYPE")
	private String atCreditVetType;
	
	@Column(name="AT_CRDT_RES_EXP_PRD")
	private double atCrdtResExpPrd;
	
	@Column(name="AT_DEF_CREDIT_CLASS")
	private String atDefCreditClass;
	
	@Column(name="AT_CRE_FUP_MAN_CRD")
	private String atCreFudManCrd;
	
	@Column(name="CC_VLD_RULE_SET")
	private String ccVldRuleSet;
	
	@Column(name="AT_ACCOUNT_TYPE_DESC")
	private String atAccountTypeDesc;
	
	@Column(name="AT_ALLOW_COLL_MIG_PRE_IND")
	private String atAllowCollMigPreInd;
	
	@Column(name="WWW_ENABLED")
	private String wwwEnabled;
	
	@Column(name="AT_PRINTING_CATEGORY")
	private String atPrintingCategory;

}

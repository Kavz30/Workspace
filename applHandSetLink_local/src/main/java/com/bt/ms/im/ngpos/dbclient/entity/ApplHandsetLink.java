package com.bt.ms.im.ngpos.dbclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPL_HANDSET_LINK")
public class ApplHandsetLink {
	

	@Id
	@Column(name="APPLICATION_TYPE")
	private String applicationType;
	
	@Column(name="HANDSET_OPTION")
	private String handSetOption;
	
	@Column(name="ALLOWED_PP_RCOC_OPTION")
	private String allowedPpRcocOption;
	
}

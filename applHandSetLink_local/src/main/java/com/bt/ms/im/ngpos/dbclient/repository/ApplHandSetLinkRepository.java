package com.bt.ms.im.ngpos.dbclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bt.ms.im.ngpos.dbclient.entity.ApplHandsetLink;
import com.bt.ms.im.ngpos.dbclient.entity.dto.GetApplicationHandsetInfoDto;

@Transactional(timeout=3)
@Repository

public interface ApplHandSetLinkRepository extends JpaRepository<ApplHandsetLink, String> {
	
	List<GetApplicationHandsetInfoDto> findApplicationHandsetInfoByApplicationTypeAndHandSetOption(String appType, String handsetOption);
	
	

}

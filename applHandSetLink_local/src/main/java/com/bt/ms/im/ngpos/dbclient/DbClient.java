package com.bt.ms.im.ngpos.dbclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.ms.im.ngpos.dbclient.entity.dto.GetApplicationHandsetInfoDto;

import com.bt.ms.im.ngpos.dbclient.repository.ApplHandSetLinkRepository;

@SpringBootApplication(scanBasePackages = { "com.bt.ms.im.ngpos.dbclient" }, exclude = { SecurityAutoConfiguration.class })
@RestController

public class DbClient {
	
	@Autowired
	ApplHandSetLinkRepository applHandSetLinkRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbClient.class, args);
	}
	
	@GetMapping(value = "/test/applhandsetlink")
	public void getApplHandSetlink() {
		List<GetApplicationHandsetInfoDto> applhandset = applHandSetLinkRepository.findApplicationHandsetInfoByApplicationTypeAndHandSetOption("High",
				"B");
		applhandset.stream().forEach(i -> {
			System.out.println(i.getallowedPpRcocOption());
			
		});

}}

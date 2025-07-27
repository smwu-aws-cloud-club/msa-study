package com.k8s.msa_prj_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaPrjServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaPrjServerApplication.class, args);
	}

}

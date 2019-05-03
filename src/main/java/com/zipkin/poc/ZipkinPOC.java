package com.zipkin.poc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication(scanBasePackages = "com.zipkin")
@EnableZipkinServer
public class ZipkinPOC {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinPOC.class, args);
	}
}


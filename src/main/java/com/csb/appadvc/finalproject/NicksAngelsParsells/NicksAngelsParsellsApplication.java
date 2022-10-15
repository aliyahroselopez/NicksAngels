package com.csb.appadvc.finalproject.NicksAngelsParsells;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NicksAngelsParsellsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NicksAngelsParsellsApplication.class, args);
	}

}

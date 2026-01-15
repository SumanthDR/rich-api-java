package com.rich.rich_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class RichApiApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(RichApiApplication.class, args);
	}
}
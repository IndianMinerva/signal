package com.signal.signal;

import com.signal.signal.signal.SignalRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PreDestroy;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class SignalProcessorApp {

	@Autowired
	private SignalRegister signalRegister;

	@Autowired
	private ApplicationContext applicationContext;


	public static void main(String[] args) {
		SpringApplication.run(SignalProcessorApp.class, args);
	}

	@PreDestroy
	public void destroy() {
		System.out.println(signalRegister.signalMap(applicationContext));
	}

}

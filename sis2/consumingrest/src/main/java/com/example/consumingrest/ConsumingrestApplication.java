package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.consumingrest.domain.entity.Quote;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingrestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingrestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingrestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			Quote quote = restTemplate.getForObject(
					"http://localhost:8080/api/random",Quote.class
			);
			log.info(quote.toString());
		};
	}


}

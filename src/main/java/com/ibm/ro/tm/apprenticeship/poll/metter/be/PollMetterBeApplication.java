package com.ibm.ro.tm.apprenticeship.poll.metter.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.ibm.ro.tm.apprenticeship.poll.metter.controller.AnswerController;
import com.ibm.ro.tm.apprenticeship.poll.metter.controller.PollController;
import com.ibm.ro.tm.apprenticeship.poll.metter.controller.UserController;
import com.ibm.ro.tm.apprenticeship.poll.metter.service.AnswerService;
import com.ibm.ro.tm.apprenticeship.poll.metter.service.PollService;
import com.ibm.ro.tm.apprenticeship.poll.metter.service.UserService;

@SpringBootApplication
@ComponentScan(basePackageClasses = { UserController.class, AnswerController.class ,
		PollController.class, SwaggerConfiguration.class, UserService.class, AnswerService.class, PollService.class })
@EntityScan(basePackages = { "com.ibm.ro.tm.apprenticeship.poll.metter.entity"  })
@EnableJpaRepositories(basePackages = { "com.ibm.ro.tm.apprenticeship.poll.metter.repository"  })

public class PollMetterBeApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(PollMetterBeApplication.class, args);		
	}
//
//    @Bean(name = "c1")
//    CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
//        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3306"));
//        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Acces-Control-Allow-Origin", "Content-Type", "Accept",
//                "Authorization", "Origin, Accept", "X-Request-With", "Acces-Control-Request-Method", "Acces-Control-Request-Headers"));
//
//        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Acces-Control-Allow-Origin",
//                "Authorization", "Acces-Control-Allow-Credentials"));
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//        return new CorsFilter();
//    }
}

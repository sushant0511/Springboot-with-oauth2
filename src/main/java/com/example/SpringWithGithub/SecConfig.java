package com.example.SpringWithGithub;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecConfig 
{
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		
		http
		   .authorizeHttpRequests((authz)->authz
				   .anyRequest().authenticated())
		   .oauth2Login();
		return http.build();
		   
	}

}

package com.example.demo.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WSC {
	@Override
	
	protected void configure(HttpSecurity http) throws Exception{

		
		http
		.csrf().
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
				.anyRequest().authenticated()
				.and()
			//.formLogin().and()
			.httpBasic();
	}
	
		
}

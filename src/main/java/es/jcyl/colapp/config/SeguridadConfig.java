package es.jcyl.colapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter {
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

		   http.httpBasic().disable(); 
		  
	        http.authorizeRequests()
	            .antMatchers("/**","/inicio").permitAll()
	            .antMatchers("/h2/**").permitAll();
	        
	        http.headers()
	            .frameOptions().disable();
	    }

}

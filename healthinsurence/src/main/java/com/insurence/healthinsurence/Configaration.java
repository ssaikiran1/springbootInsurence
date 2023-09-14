package com.insurence.healthinsurence;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class Configaration {
	public DataSource ds;

	public Configaration(DataSource ds) {
		this.ds = ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		return new JdbcTemplate(ds);
	}
}

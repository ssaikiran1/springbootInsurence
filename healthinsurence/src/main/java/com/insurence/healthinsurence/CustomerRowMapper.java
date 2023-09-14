package com.insurence.healthinsurence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c = new Customer();
		c.setId(rs.getInt(1));
		c.setFirstName(rs.getString(2));
		c.setFirstName(rs.getString(3));
		c.setDateOfBirth(rs.getDate(4));
		c.setAddress(rs.getString(5));
		c.setGender(rs.getString(6));
		c.setCreateDate(rs.getDate(7));
		c.setAadharNumber(rs.getLong(8));
		c.setStatus(rs.getString(9));
		return c;
	}

}

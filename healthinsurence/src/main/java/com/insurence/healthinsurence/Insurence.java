package com.insurence.healthinsurence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Insurence implements InsurenceRepository {

	public JdbcTemplate jd;

	@Autowired
	public Insurence(JdbcTemplate jd) {
		this.jd = jd;

	}

	@Override
	public List<Customer> getAllCustomers() {

		return jd.query("select * from sai_customers", new CustomerRowMapper());
	}

	@Override
	public List<InsurencePackages> getAllPackages() {
		return jd.query("select * from sai_InsurancePackages", new InsurencePackagesRowMapper());
	}

	@Override
	public int addUser(Customer c) {

		return jd.update(
				"insert into sai_customers (cust_fname,cust_lname,cust_dob,cust_address,cust_gender,cust_aadhar) values(?,?,?,?,?,?)",
				c.getFirstName(), c.getLastName(), c.getDateOfBirth(), c.getAddress(), c.getGender(),
				c.getAadharNumber());

	}

}

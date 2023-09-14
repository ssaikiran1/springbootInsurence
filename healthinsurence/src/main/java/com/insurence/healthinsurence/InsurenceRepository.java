package com.insurence.healthinsurence;

import java.util.List;

public interface InsurenceRepository {
	public List<Customer> getAllCustomers();

	public List<InsurencePackages> getAllPackages();

	public int addUser(Customer c);
}

package pl.mibdbz.springdemo.dao;

import java.util.List;

import pl.mibdbz.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}

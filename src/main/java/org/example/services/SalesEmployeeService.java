package org.example.services;

import org.example.daos.SalesEmployeeDao;

import java.util.List;

public class SalesEmployeeService {

	SalesEmployeeDao salesEmployeeDao;

	public SalesEmployeeService(SalesEmployeeDao salesEmployeeDao) {
		this.salesEmployeeDao = salesEmployeeDao;
	}

	public List<SalesEmployeeResponse>
}

package com.infra.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	
	public List<Company> getCompanies() {
		//return Arrays.asList(new Company("Infra","Mumbai",1000));
		List<Company> companyList = new ArrayList<>();
		companyDao.findAll().forEach(companyList::add);
		return companyList;
	}
	
	public Company createCompany(Company company) {
		return companyDao.save(company);
	}
}

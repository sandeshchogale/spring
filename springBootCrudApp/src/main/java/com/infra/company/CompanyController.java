package com.infra.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/companies")
	public List<Company> getCompanies() {
		
		//return companyList;
		//return Arrays.asList(new Company("Infra","Mumbai",1000));
		return companyService.getCompanies();
	}
	
	//@RequestMapping("/addCompany")
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	@ResponseBody
	public Company addCompany(@RequestBody Company comp) {
		
		//return companyList;
		//return Arrays.asList(new Company("Infra","Mumbai",1000));
		return companyService.createCompany(comp);
	}
}

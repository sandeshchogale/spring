package com.infra.company;

import org.springframework.data.repository.CrudRepository;

public interface CompanyDao extends CrudRepository<Company, String> {

}

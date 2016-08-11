package com.inveitix.register.repositories;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.inveitix.register.models.Organization;

@Transactional
public interface OrganizationDao extends CrudRepository<Organization, Long>{
	
}

package com.inveitix.register.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inveitix.register.models.Organization;
import com.inveitix.register.repositories.OrganizationDao;

@CrossOrigin(origins = "*")
@RestController
public class RegistrationController {

	@RequestMapping(value = "/app/root/**", method = RequestMethod.GET)
	public String registerForm(Model model) {
		model.addAttribute("organization", new Organization());
		return "index.html";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Organization> registerSubmit(@RequestBody Organization organization) {
		create(organization);
		return new ResponseEntity<Organization>(organization, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<Organization> getAllOrganizations(Model model) {
        return (List<Organization>) organizationDao.findAll();
    }

	@RequestMapping(value = "organization", method = RequestMethod.GET)
	public ModelAndView organizations() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("organizations", organizationDao.findAll());
		return mav;
	}

	@ModelAttribute("/organizations")
	public List<Organization> allOrganizations() {
		return (List<Organization>) organizationDao.findAll();
	}


	@RequestMapping("/create")
	@ResponseBody
	public String create(Organization organization) {
		try {
			organizationDao.save(organization);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "result";
	}

	@Autowired
	private OrganizationDao organizationDao;
}

package com.inveitix.register.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.inveitix.register.models.Organization;
import com.inveitix.register.repositories.OrganizationDao;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(Model model) {
		model.addAttribute("organization", new Organization());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerSubmit(@ModelAttribute Organization organization, Model model) {
		model.addAttribute("organization", organization);
		create(organization);
		return "result";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getAllOrganizations(Model model) {
        model.addAttribute("organizations", organizationDao.findAll());
        return "list";
    }

	@RequestMapping(value = "organization", method = RequestMethod.GET)
	public ModelAndView organizations() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("organizations", organizationDao.findAll());
		return mav;
	}

	@ModelAttribute("organizations")
	public List<Organization> messages() {
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

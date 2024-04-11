package com.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.proj.entity.Employee;
import com.proj.service.EmpService;

import jakarta.servlet.http.HttpSession;


//import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String home(Model m)
	{
	   List<Employee> emp=service.getAllEmp();
	   m.addAttribute("emp",emp);
		return "index";
	}
	@GetMapping("/addemp")
	public String addEmpForm()
	{
		return "add_emp";
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e,HttpSession session) {
	    System.out.println(e);
	    service.addEmp(e);
	    if (session.getAttribute("msgDisplayed") == null) {
	        session.setAttribute("msg", "Employee Added Successfully");
	        session.setAttribute("msgDisplayed", true);
	       
	    }
	   // session.removeAttribute("msg");
	    
	   // session.setAttribute("msg","Emp Data Added Successfully");
	   // session.removeAttribute("msg");
	    //model.addAttribute("msg", "Employee Added Successfully");
	    return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int  id,Model m)
	{
		Employee e=service.getEmpById(id);
		m.addAttribute("emp",e);
		return "edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session)
	{
		service.addEmp(e);
		session.setAttribute("msg","Emp Data Update Successfully");
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session)
	{
		service.deleteEmp(id);
		session.setAttribute("msg","Emp Data Deleted Successfully");
		return "redirect:/";
	}
//	public String empRegister(@ModelAttribute Employee e,HttpSession session)
//	{
//		System.out.println(e);
//		service.addEmp(e);
//		session.setAttribute("msg", "Employee Added Sucessfully");
//		return "redirect:/";
//		
//	}-->

}

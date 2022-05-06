package com.megh.techhub.dev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megh.techhub.dev.models.Users;
import com.megh.techhub.dev.services.UsersService;

@RestController
@RequestMapping(path = "/users")
public class UsersControllers {

	@Autowired
	UsersService usersService;
	
	@GetMapping("/list")
	public List<Users> listar(){
		return usersService.findAll();
	}
	

}

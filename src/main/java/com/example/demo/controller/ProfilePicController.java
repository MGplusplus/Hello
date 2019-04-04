package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.submodel.ICompProfilePic;
import com.example.demo.service.ProfilePicService;

@RestController
@RequestMapping("/profile/image")
public class ProfilePicController {

	@Autowired
	private ProfilePicService profilePicService;
	
	@RequestMapping("/{personId}")
	@CrossOrigin("http://localhost:4200")
	public ICompProfilePic fetchCompImage(@PathVariable int personId)
	{
		return profilePicService.fetchCompImage(personId);
	}
}

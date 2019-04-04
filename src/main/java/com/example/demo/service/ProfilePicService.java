package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.submodel.ICompProfilePic;
import com.example.demo.repository.IProfilePicRepository;

@Component
public class ProfilePicService {

	@Autowired
	private IProfilePicRepository profilePicRepository;
	
	public ICompProfilePic fetchCompImage(int personId) {
		return profilePicRepository.findFirstByPersonId(personId);
	}

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProfilePic;
import com.example.demo.model.submodel.ICompProfilePic;

public interface IProfilePicRepository extends JpaRepository<ProfilePic, Integer>{
	
	ICompProfilePic findFirstByPersonId(int i);

}

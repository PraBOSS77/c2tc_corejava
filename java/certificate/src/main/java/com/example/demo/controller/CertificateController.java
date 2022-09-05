package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Certificate;
import com.example.demo.repository.CertificateRepository;

@RestController
@RequestMapping("/api/v1")
public class CertificateController {
	@Autowired
	private CertificateRepository certificateRepository;
	@GetMapping("/certificates")
	
	
	public List<Certificate> getAllcertificates(){
		return certificateRepository.findAll();
	}
}

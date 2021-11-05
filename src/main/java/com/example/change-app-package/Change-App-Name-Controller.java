package com.example.change-app-package;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Change-App-Name-Controller {

	@RequestMapping("/")
	public String index() {
		return "Getting started api";
	}

}
package com.generation.cohorteioc.controllers;

@RestController
public class HolaMundo {
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo desde Springboot";
	}
}

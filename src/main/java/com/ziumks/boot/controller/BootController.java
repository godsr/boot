package com.ziumks.boot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ziumks.boot.dao.BootDAO;
import com.ziumks.boot.mapper.BootMapper;

@Controller	
public class BootController {
	@Autowired
	private BootMapper mapper;
	@Autowired
	private BootDAO dao;

	private static final Logger logger = LogManager.getLogger(BootController.class);

	@GetMapping("/")
	public String list(Model model) {
		logger.info("user: ", dao.adminList());
		model.addAttribute("user", dao.adminList());
		return "index";
	}
}

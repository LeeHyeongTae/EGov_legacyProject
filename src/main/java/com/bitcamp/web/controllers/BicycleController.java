package com.bitcamp.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bicycle")
@Controller
public class BicycleController {
	private static final Logger log = LoggerFactory.getLogger(BicycleController.class);
	@GetMapping("/list")
	public String bicycleList() {
		log.info("BicycleController - list");
		return "bicycle/BicycleList.tiles";
	}
	
	@GetMapping("/history")
	public String history() {
		log.info("BicycleController - history");
		return "bicycle/History.tiles";
	}
	
	@GetMapping("/infomation")
	public String infomation() {
		log.info("BicycleController - infomation");
		return "bicycle/Infomation.tiles";
	}
	
	@GetMapping("/intro")
	public String intro() {
		log.info("BicycleController - intro");
		return "bicycle/Intro.tiles";
	}
	
	@GetMapping("/link")
	public String link() {
		log.info("BicycleController - link");
		return "main/Link.tiles";
	}
	
	@GetMapping("/board")
	public String board() {
		log.info("BicycleController - board");
		return "bicycle/board.tiles";
	}
}

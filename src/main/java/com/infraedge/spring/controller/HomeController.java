package com.infraedge.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infraedge.spring.model.Color;

@RestController
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/colors", method = RequestMethod.GET)
	public ResponseEntity<List<Color>> home(Locale locale, Model model) {
		List<Color> colors = new ArrayList<>();
		Color color = new Color("White ","#FFFFFF");
		colors.add(color);
		color = new Color("Blue  ","#0000FF");
		colors.add(color);
		color = new Color("Red  ","#FF0000");
		colors.add(color);
		colors.add(color);
		color = new Color("Green   ","#00FF00");
		colors.add(color);
		return new ResponseEntity<List<Color>>(colors, HttpStatus.OK);
	}

	
}

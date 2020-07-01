package com.infraedge.spring.model;

public class Color {
	private String colorName;
	private String colorRGBCode;

	
	public Color(String colorName, String colorRGBCode) {
		super();
		this.colorName = colorName;
		this.colorRGBCode = colorRGBCode;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorRGBCode() {
		return colorRGBCode;
	}

	public void setColorRGBCode(String colorRGBCode) {
		this.colorRGBCode = colorRGBCode;
	}

}

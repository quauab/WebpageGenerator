package com.gmail.ichglauben.pagegenerator;

import java.util.ArrayList;
import java.util.List;

import com.gmail.ichglauben.pagegenerator.core.WebpageGenerator;

public class App {
	public static void main(String[] args) {
		WebpageGenerator gen = new WebpageGenerator();
		
		// head elements
		String[] headElements = new String[] {
				"<script src=\"url1\"></script>",
				"<script src=\"url2\"></script>",
				"<title>Deez Nuts</title>"
		};		

		// header settings		
		List<String> headerInnerHtml = new ArrayList<String>() {};
		
		String[] headerInnerText = new String[] {};
		
		String[] headerElements = new String[] {};
		
		String header = gen.makeHeader(headerInnerHtml, headerInnerText, headerElements);
		
		
		// bottom script and link tags
		String[] bottomElements = new String[] {
				"<link src=\"url88\" rel=\"stylesheet\" />",
				"<script src=\"url3\"></script>",
				"<script src=\"url44\"></script>"
		};
		
		// body inner html and child elements
		List<String> bodySettings = new ArrayList<String>();
		bodySettings.add("class=\"container\"");
		
		String bodyElements[] = new String[] {};
		
		String head = gen.makeHead(headElements);
		String body = gen.makeBody(bodySettings,bodyElements);
		String[] page = gen.makePage(head, body, bottomElements);
		
		for (String p:page) {
			println(p);
		}
	}
	
	static void print(Object o) {
		System.out.println(String.valueOf(o));
	}
	
	static void println(Object o) {
		System.out.println(String.valueOf(o));
	}
	
}

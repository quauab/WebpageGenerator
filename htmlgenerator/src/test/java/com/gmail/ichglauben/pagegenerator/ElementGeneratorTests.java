package com.gmail.ichglauben.pagegenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gmail.ichglauben.pagegenerator.core.ElementGenerator;
import com.gmail.ichglauben.pagegenerator.core.utils.CustomClass;
import com.gmail.ichglauben.pagegenerator.core.utils.GlobalConstants;
import com.gmail.ichglauben.textfilewriter.core.concretes.TextfileOverwriter;

public class ElementGeneratorTests extends CustomClass {
	ElementGenerator gen;
	String ud = GlobalConstants.USRDIR;
	String uh = GlobalConstants.USRHOME;
		
	@Test
	public void testPageGenerator() throws IOException {
		gen = new ElementGenerator();
		
		// head elements
		String[] headElements = new String[] {
				"<script src=\"url1\"></script>",
				"<script src=\"url2\"></script>",
				"<title>HTML Generator</title>"
		};		

		// body header settings		
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
		
		// body tag settings
		List<String> bodySettings = new ArrayList<String>();
			bodySettings.add("class=\"container\"");
		
		// body child elements
		String bodyElements[] = new String[] {};
		
		// page components
		String head = gen.makeHead(headElements);
		String body = gen.makeBody(bodySettings,bodyElements);
		String page = gen.makePage(head, body, bottomElements);
		
		String[]pageB = page.split("<br>");
		List<String> newPage = new ArrayList<String>();
		
		for (String p:pageB) {
			println(p);
			newPage.add(p);
		}
		
		TextfileOverwriter.overwrite(ud + "log", newPage, ".html");
	}

}

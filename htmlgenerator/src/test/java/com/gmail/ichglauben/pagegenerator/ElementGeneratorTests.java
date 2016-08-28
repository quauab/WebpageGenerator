package com.gmail.ichglauben.pagegenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gmail.ichglauben.pagegenerator.core.WebpageGenerator;
import com.gmail.ichglauben.pagegenerator.core.utils.CustomClass;
import com.gmail.ichglauben.pagegenerator.core.utils.GlobalConstants;
import com.gmail.ichglauben.textfilewriter.core.concretes.TextfileOverwriter;

public class ElementGeneratorTests extends CustomClass {
	WebpageGenerator gen;
	String ud = GlobalConstants.USRDIR;
	String uh = GlobalConstants.USRHOME;
	
	@Test
	public void testPageGenerator() throws IOException {
		gen = new WebpageGenerator();
		
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
		
		TextfileOverwriter.overwrite(uh + "log1", newPage, ".html");
	}
		
	@Test
	public void testBootStrapPageGenerator() throws IOException {
		gen = new WebpageGenerator();
		
		// head elements
		String[] headElements = new String[] {
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">",
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>",
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>",
				"<title>HTML Generator</title>"
		};		

		// navigation bar		
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">" +
						"<div class=\"container-fluid\">" +
							"<div class=\"navbar-header\">" +
								"<span class=\"navbar-brand\" id=\"navbarheadertop\">Report</span>" +
							"</div>" +
							"<ul class=\"nav navbar-nav\">" +
								"<li><a id=\"about\" class=\"noanchor\" href=\"#\">About</a></li>" +
								"<li><a id=\"map\" class=\"anchor\" href=\"map.html\">Map</a></li>" +
							"</ul>" +					
						"</div>" +
					"</nav>";
		
		// main content
		String content = "<main class=\"content\" id=\"content\">" +
				"<div class=\"row\">" +	
					"<div class=\"col-sm-3\">" +
						"<div class=\"jumbotron\"></div>" +
					"</div>" +
					"<div class=\"col-sm-9\">" +
						"<div class=\"jumbotron\"></div>" +
					"</div>" +
				"</div>";		
		
		// bottom script and link tags
		String[] bottomElements = new String[] {
				"<link rel=\"stylesheet\" href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/quauab/css/style_a.css\">"				
		};
		
		// body tag settings
		List<String> bodySettings = new ArrayList<String>();
			bodySettings.add("class=\"container\"");
		
		// body child elements
		String bodyElements[] = new String[] {nav,content};
		
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
		
		TextfileOverwriter.overwrite(uh + "log2", newPage, ".html");
	}

	@Test
	public void testBootStrapPageGeneratorNullArgument() throws IOException {
		gen = new WebpageGenerator();
		
		// head elements
		String[] headElements = new String[] {
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">",
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>",
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>",
				"<title>HTML Generator</title>"
		};		

		// navigation bar		
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">" +
						"<div class=\"container-fluid\">" +
							"<div class=\"navbar-header\">" +
								"<span class=\"navbar-brand\" id=\"navbarheadertop\">Report</span>" +
							"</div>" +
							"<ul class=\"nav navbar-nav\">" +
								"<li><a id=\"about\" class=\"noanchor\" href=\"#\">About</a></li>" +
								"<li><a id=\"map\" class=\"anchor\" href=\"map.html\">Map</a></li>" +
							"</ul>" +					
						"</div>" +
					"</nav>";
		
		// main content
		String content = "<main class=\"content\" id=\"content\">" +
				"<div class=\"row\">" +	
					"<div class=\"col-sm-3\">" +
						"<div class=\"jumbotron\"></div>" +
					"</div>" +
					"<div class=\"col-sm-9\">" +
						"<div class=\"jumbotron\"></div>" +
					"</div>" +
				"</div>";		
		
		// bottom script and link tags
		String[] bottomElements = new String[] {
				"<link rel=\"stylesheet\" href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/quauab/css/style_a.css\">"				
		};
		
		// body tag settings
		List<String> bodySettings = new ArrayList<String>();
			bodySettings.add("class=\"container\"");
		
		// body child elements
		String bodyElements[] = new String[] {nav,content};
		
		// page components
		String head = gen.makeHead(headElements);
		String body = gen.makeBody(bodySettings,bodyElements);
		String page = gen.makePage(head, body, null);
		
		String[]pageB = page.split("<br>");
		List<String> newPage = new ArrayList<String>();
		
		for (String p:pageB) {
			println(p);
			newPage.add(p);
		}
		
		TextfileOverwriter.overwrite(uh + "log3", newPage, ".html");
	}
}

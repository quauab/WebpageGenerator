package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;

public class GenericBootStrapPageGenerator {
	ElementGenerator eg = new ElementGenerator();
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
	String content = "<main class=\"content\" id=\"content\">" +
			"<div class=\"row\">" +	
				"<div class=\"col-sm-3\">" +
					"<div class=\"jumbotron\"></div>" +
				"</div>" +
				"<div class=\"col-sm-9\">" +
					"<div class=\"jumbotron\"></div>" +
				"</div>" +
			"</div>";
	String[] bottomElements = new String[] {
			"<link rel=\"stylesheet\" href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/quauab/css/style_a.css\">"				
	};
	String bodyElements[] = new String[] {nav,content};
	
	public String buildPage(String[] content, String[] bottomElements, String pageTitle) {
		List<String> bodySettings = new ArrayList<String>();
		bodySettings.add("class=\"container\"");
		
		List<String> pageHead = new ArrayList<String>();
		pageHead.add("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
		pageHead.add("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
		pageHead.add("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");

		if (null != pageTitle && pageTitle.length() > 0)
			pageHead.add("<title>" + pageTitle + "</title>");
		
		String head = eg.makeHead(pageHead);
		
		String body = eg.makeBody(bodySettings, content);
		
		String page = eg.makePage(head, body, bottomElements);

		return page;
	}
	
	public String buildPage() {
		List<String> bodySettings = new ArrayList<String>();
		bodySettings.add("class=\"container\"");
		
		String head = eg.makeHead(new String[] {
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">",
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>",
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>",
				"<title>HTML Generator</title>"
		});
		
		String body = eg.makeBody(bodySettings, bodyElements);
		
		String page = eg.makePage(head, body, bottomElements);

		return page;
	}
	
	private String buildRow(int []cols,String[]contents) {
		String row = "";
				
		
		return row;
	}
	
	public String toString() { return "BootStrap Page Generator"; }
}

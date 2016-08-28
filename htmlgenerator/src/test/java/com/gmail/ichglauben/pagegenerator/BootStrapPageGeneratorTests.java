package com.gmail.ichglauben.pagegenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gmail.ichglauben.pagegenerator.core.GenericBootStrapPageGenerator;
import com.gmail.ichglauben.pagegenerator.core.utils.CustomClass;
import com.gmail.ichglauben.pagegenerator.core.utils.GlobalConstants;
import com.gmail.ichglauben.textfilewriter.core.concretes.TextfileOverwriter;

public class BootStrapPageGeneratorTests extends CustomClass {
	GenericBootStrapPageGenerator gbpg;
	String uh = GlobalConstants.USRHOME;
	
	@Test
	public void testBuildPageNoArgsMethod() throws IOException {
		gbpg = new GenericBootStrapPageGenerator();
		
		List<String> data = new ArrayList<String>();
		
		for (String s:gbpg.buildPage().split("<br>")) {
			data.add(s);
		}
		
		TextfileOverwriter.overwrite(uh + "bootstrappage", data, ".html");
	}
	
	@Test
	public void testBuildPageContentArgs() throws IOException {
		gbpg = new GenericBootStrapPageGenerator();
		
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">"
				+ "<div class=\"container-fluid\">" + "<div class=\"navbar-header\">"
				+ "<span class=\"navbar-brand\" id=\"navbarheadertop\">BootStrap Page Generator Test</span>" + "</div>"
				+ "<ul class=\"nav navbar-nav\">"
				+ "<li><a target=\"_blank\" id=\"about\" class=\"anchor\" href=\"http://docs.oracle.com/javase/tutorial/index.html\">Java Tutorials</a></li>"
				+ "</ul></div></nav>";

		String[] content = new String[] { nav,"<main class=\"content\" id=\"content\">" + "<div class=\"row\">"
				+ "<div class=\"col-sm-12\">" + "<div class=\"jumbotron\">" + "<h3 id=\"header\">"
				+ "BootStrap Generated Page</h3>" + "</div>" + "</div>" + "</div>" };
		
		String[] bottomElements = new String[] {
				"<link href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/resources/java/css/style_a.css\" rel=\"stylesheet\"/>" };
		
		List<String> data = new ArrayList<String>();
		
		for (String s : gbpg.buildPage(content, bottomElements, "BootStrap Page").split("<br>")) {
			data.add(s);
		}
		
		TextfileOverwriter.overwrite(uh + "index", data, ".html");
	}

}

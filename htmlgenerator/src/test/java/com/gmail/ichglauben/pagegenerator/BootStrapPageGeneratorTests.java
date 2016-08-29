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
	public void testBuildPage() throws IOException {
		gbpg = new GenericBootStrapPageGenerator();
		
		// head tag
		String[] pageHead = new String[] {
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">",
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>",
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>",
				"<title>testBuildPageAllContent</title>"
		};
		
		// body property settings
		String[] bodySettings = new String[] {"class=\"container\""};
		
		// body content
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">"
				+ "<div class=\"container-fluid\">" + "<div class=\"navbar-header\">"
				+ "<span class=\"navbar-brand\" id=\"navbarheadertop\">Sample Report Page</span>" + "</div>"
				+ "<ul class=\"nav navbar-nav\">"
				+ "<li><a target=\"_blank\" id=\"about\" class=\"anchor\" href=\"http://docs.oracle.com/javase/tutorial/index.html\">Java Tutorials</a></li>"
				+ "</ul></div></nav>";
		
		String main = "<main class=\"content\" id=\"content\">" +
				"<div class=\"row\">" + "<div class=\"col-sm-12\">" +
				"<div class=\"jumbotron\">" + "<h2 id=\"header\">" + "JUnit Version 4.12</h2><ul>";

		String className = "<li><b>Test Class Name:</b> " + getClass().getSimpleName() + "</li>";
		String classCanonicalName = "<li><b>Test Class Canonical Name:</b> " + getClass().getCanonicalName() + "</li>";
		String classLoader = "<li><b>Test Class Loader:</b> " + getClass().getClassLoader().toString() + "</li>";
		String classType = "<li><b>Test Class Type:</b> " + getClass().getTypeName() + "</li>";
		String classUnderTest = "<li><b>Class Under Test:</b> " + gbpg.getClass().getSimpleName() + "</li>";
		String testMethod = "<li class=\"large\"><b>Test Method:</b> testBuildPage</li>";
		
		main += className + classCanonicalName + classLoader + classType + classUnderTest + testMethod +  "</ul></div></div</div></main>";

		String[] content = new String[] { nav, main };
		
		// bottom elements
		String[] bottomElements = new String[] {
				"<link href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/resources/java/css/style_a.css\" rel=\"stylesheet\"/>" 				
		};

		List<String> data = new ArrayList<String>();

		for (String s : gbpg.buildPage(pageHead, bodySettings, content, bottomElements).split("<br>")) {
			data.add(s);
		}

		TextfileOverwriter.overwrite(uh + "testbuildpageallcontent", data, ".html");		
	}
}

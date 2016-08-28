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
	public void testBuildPageContentArgsMethod() throws IOException {
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
	
	@Test
	public void testGenericBootStrapPageGenerator() throws IOException {
		gbpg = new GenericBootStrapPageGenerator();
		
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">"
				+ "<div class=\"container-fluid\">" + "<div class=\"navbar-header\">"
				+ "<span class=\"navbar-brand\" id=\"navbarheadertop\">Sample Report Page</span>" + "</div>"
				+ "<ul class=\"nav navbar-nav\">"
				+ "<li><a target=\"_blank\" id=\"about\" class=\"anchor\" href=\"http://docs.oracle.com/javase/tutorial/index.html\">Java Tutorials</a></li>"
				+ "</ul></div></nav>";
		
		String main = "<main class=\"content\" id=\"content\">" +
				"<div class=\"row\">" + "<div class=\"col-sm-12\">" +
				"<div class=\"jumbotron\">" + "<h3 id=\"header\">" + "JUnit Version 4.12</h3><ul>";

		String className = "<li><b>Test Class Name:</b> " + getClass().getSimpleName() + "</li>";
		String classCanonicalName = "<li><b>Test Class Canonical Name:</b> " + getClass().getCanonicalName() + "</li>";
		String classLoader = "<li><b>Test Class Loader:</b> " + getClass().getClassLoader().toString() + "</li>";
		String classType = "<li><b>Test Class Type:</b> " + getClass().getTypeName() + "</li>";
		String classUnderTest = "<li><b>Class Under Test:</b> " + gbpg.getClass().getSimpleName() + "</li>";
		
		main += className + classCanonicalName + classLoader + classType + classUnderTest + "</ul></div></div</div></main>";

		String[] content = new String[] { nav, main };
		
		String[] bottomElements = new String[] {
				"<link href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/resources/java/css/style_a.css\" rel=\"stylesheet\"/>" };
		
		List<String> data = new ArrayList<String>();
		
		for (String s : gbpg.buildPage(content, bottomElements, "JUnit Test").split("<br>")) {
			data.add(s);
		}
		
		TextfileOverwriter.overwrite(uh + "report", data, ".html");
	}

}

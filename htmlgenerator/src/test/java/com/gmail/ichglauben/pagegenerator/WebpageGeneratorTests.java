package com.gmail.ichglauben.pagegenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gmail.ichglauben.pagegenerator.core.WebpageGenerator;
import com.gmail.ichglauben.pagegenerator.core.utils.CustomClass;
import com.gmail.ichglauben.pagegenerator.core.utils.GlobalConstants;
import com.gmail.ichglauben.textfilewriter.core.concretes.TextfileOverwriter;

public class WebpageGeneratorTests extends CustomClass {
	WebpageGenerator wg;
	String ud = GlobalConstants.USRDIR;
	String uh = GlobalConstants.USRHOME;
	
	@Test
	public void testMakPage() throws IOException {
		wg = new WebpageGenerator();

		// head children elements
		String[] pageHead = new String[] {
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">",
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>",
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>",
				"<title>testMakePage</title>"
		};
		
		// body tag properties settings
		String[] bodySettings = new String[] {"class=\"container\""};
		
		// body content elements
		String nav = "<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\"><br>"
				+ "<div class=\"container-fluid\">" + "<div class=\"navbar-header\"><br>"
				+ "<span class=\"navbar-brand\" id=\"navbarheadertop\">Sample Report Page</span><br>" + "</div><br>"
				+ "<ul class=\"nav navbar-nav\"><br>"
				+ "<li><a target=\"_blank\" id=\"about\" class=\"anchor\" href=\"http://docs.oracle.com/javase/tutorial/index.html\">Java Tutorials</a></li><br>"
				+ "</ul><br></div><br></nav>";
		
		String main = "<main class=\"content\" id=\"content\"><br>" +
				"<div class=\"row\"><br>" + "<div class=\"col-sm-12\"><br>" +
				"<div class=\"jumbotron\"><br>" + "<h2 id=\"header\"><br>" + "JUnit Version 4.12</h2><br><ul><br>";

		String className = "<li><b>Test Class Name:</b> " + getClass().getSimpleName() + "</li><br>";
		String classCanonicalName = "<li><b>Test Class Canonical Name:</b> " + getClass().getCanonicalName() + "</li><br>";
		String classLoader = "<li><b>Test Class Loader:</b> " + getClass().getClassLoader().toString() + "</li><br>";
		String classType = "<li><b>Test Class Type:</b> " + getClass().getTypeName() + "</li><br>";
		String classUnderTest = "<li><b>Class Under Test:</b> " + wg.getClass().getSimpleName() + "</li><br>";
		String testMethod = "<li class=\"large\"><b>Test Method:</b> testMakePage</li><br>";
		
		main += className + classCanonicalName + classLoader + classType + classUnderTest + testMethod +  "</ul><br></div><br></div><br></div><br></main><br>";

		String[] content = new String[] { nav, main };
		
		// extra links & scripts
		String[] bottomElements = new String[] {
				"<link href=\"https://dl.dropboxusercontent.com/u/50203839/web/sites/resources/java/css/style_a.css\" rel=\"stylesheet\"/>" 				
		};

		List<String> data = new ArrayList<String>();
		
		for (String s:wg.makePage(wg.makeHead(pageHead), wg.makeBody(bodySettings, content), bottomElements).split("<br>")) {
			data.add(s);
		}

		TextfileOverwriter.overwrite(uh + "testMakePage", data, ".html");
	}
	
}

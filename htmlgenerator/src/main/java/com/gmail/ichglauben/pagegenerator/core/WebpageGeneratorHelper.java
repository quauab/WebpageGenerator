package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;

public class WebpageGeneratorHelper {
	WebpageGenerator wg = new WebpageGenerator();
	
	/**Returns page String The built web page.
	 * @param pageHead String array The head tag's children elements
	 * @param bodySettings String array The body tag's property settings
	 * @param content String array The body's children elements
	 * @param bottomElements String array html tags inserted before the end html tag*/
	public String buildPage(String[] pageHead, String[] bodySettings, String[] content, String[] bottomElements) {		
		String head = wg.makeHead(pageHead);
		
		String body = wg.makeBody(bodySettings, content);
		
		String page = wg.makePage(head, body, bottomElements);

		return page;
	}
	
	public String toString() { return "BootStrap Page Generator"; }
}

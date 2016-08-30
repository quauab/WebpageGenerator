package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;
/**Generate web page mark-up.
 * @see com.gmail.ichglauben.pagegenerator.core.WebpageGenerator*/
public class WebpageGeneratorHelper {
	WebpageGenerator wg = new WebpageGenerator();
	
	/**Single default constructor*/
	public WebpageGeneratorHelper() {
		super();
	}

	/**@param pageHead String array The head tag's children elements
	 * @param bodySettings String array The body tag's property settings
	 * @param content String array The body's children elements
	 * @param bottomElements String array link and script tags inserted after the body end tag
	 * @return page String The web page mark-up*/
	public String[] buildPage(String[] pageHead, String[] bodySettings, String[] content, String[] bottomElements) {		
		String head = wg.makeHead(pageHead);
		
		String body = wg.makeBody(bodySettings, content);
		
		return wg.makePage(head, body, bottomElements);
	}
	
	public String toString() { return "Webpage Generator's Helper Class"; }
}

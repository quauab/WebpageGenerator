package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;
/**Generate HTML elements that make up a web page, with content. Generic enough to apply any JavaScript framework.*/
public class WebpageGenerator {
	/**Single default constructor*/
	public WebpageGenerator() {
		super();
	}
	
	/**Creates and returns an HTML element. Notice the escaped double quotes.
	 * @param elementStart String e.g. <div or <p or <br or <span etc.
	 * @param elementStartClose e.g. > character
	 * @param elementEnd e.g. </div> or </p> or </span> etc.
	 * @param properties String array e.g. class=\"class-name\" or id=\"identification\" or data-role=\"heading\"
	 * @param innerText String plain text
	 * @param children String array A list of elements to embed
	 * @return newElement The constructed HTML element*/
	public String makeElement(String elementStart, String elementStartClose, String elementEnd, String[] properties, String innerText, String[] children) {
		String newElement = " ";
		
		if (null != elementStart && !elementStart.isEmpty())
			newElement = elementStart;
		
		if (null != properties && properties.length > 0) {
			int i = 0;
			for (String p:properties) {
				if (i < (properties.length - 1)) {
					newElement += p + " ";
				} else {
					newElement += p;
				}
			}
		}
		
		newElement += elementStartClose;
		
		if (null != innerText && !innerText.isEmpty()) {
			newElement += innerText + "<br>";
		}
		
		newElement += "<br>";
		
		if (null != children && children.length > 0) {
			int i = 0;
			for (String c:children) {
				if (i < (children.length - 1)) {
					newElement += c + "<br>";
				} else {
					newElement += c;
				}
			}
		}
		
		newElement += elementEnd;
		
		newElement += "<br>";
		
		return newElement;
	}
	
	/**Returns a head element.
	 * @param elements String[] The head element's children
	 * @return String head*/
	public String makeHead(String[]elements) {
		String head = "<head><br>";
		head += "<meta charset=\"UTF-8\"><br>";
		head += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><br>";		
		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.length - 1)) {
					head += item + "<br>";
				} else {
					head += item;
				}
				i++;
			}
		}
		head += "<br></head>";		
		return head;
	}
	
	/**Returns a head element.
	 * @param elements String List The head element's children
	 * @return String head*/
	public String makeHead(List<String>elements) {
		String head = "<head><br>";
		head += "<meta charset=\"UTF-8\"><br>";
		head += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><br>";		
		if (null != elements && elements.size() > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.size() - 1)) {
					head += item + "<br>";
				} else {
					head += item;
				}
				i++;
			}
		}
		head += "<br></head>";		
		return head;
	}
	
	/**Returns a body element.
	 * @param innerHtml String List The body's property settings
	 * @param elements String[] The body elements
	 * @return String body*/
	public String makeBody(List<String> innerHtml, String[]elements) {
		String body = "<body ";		
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.size() - 1)) {
					body += item + " ";
				} else {
					body += item;
				}
				i++;
			}
		}		
		body += "><br>";		
		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.length - 1)) {
					body += item + "<br>";
				} else {
					body += item;
				}
				i++;
			}
		}		
		body += "<br></body>";		
		return body;
	}
	
	/**Returns a body element.
	 * @param innerHtml String[] The body's property settings
	 * @param elements String[] The body elements
	 * @return String body*/
	public String makeBody(String[] innerHtml, String[]elements) {
		String body = "<body ";		
		if (null != innerHtml && innerHtml.length > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.length - 1)) {
					body += item + " ";
				} else {
					body += item;
				}
				i++;
			}
		}		
		body += "><br>";		
		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.length - 1)) {
					body += item + "<br>";
				} else {
					body += item;
				}
				i++;
			}
		}		
		body += "<br></body>";		
		return body;
	}
	
	/**Returns a page element.
	 * @param head String The head tag contents
	 * @param body String The body tag contents and body property settings
	 * @param last String array Extra links and script tags after closing body tag
	 * @return page String The web page mark-up*/
	public String[] makePage(String head, String body, String[] last) {
		String page = "<!DOCTYPE html><br>";
		page += "<html><br>";		
		if (null != head && head.length() > 0)
			page += head + "<br>";		
		if (null != body && body.length() > 0)
			page += body + "<br>";		
		if (null != last && last.length > 0) {
			int i = 0;
			for (String item:last) {
				if (i < (last.length - 1)) {
					page += item + "<br>";
				} else {
					page += item;
				}
				i++;
			}
		}		
		page += "<br></html>";		
		return page.split("<br>");
	}
	
	public String toString() { return "Webpage Generator"; }
}

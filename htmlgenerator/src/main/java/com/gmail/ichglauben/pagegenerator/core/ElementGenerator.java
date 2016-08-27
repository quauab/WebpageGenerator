package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;

public class ElementGenerator {
	
	public ElementGenerator() {}
	
	/**Returns innerHtml settings.
	 * @param String id
	 * @param String classSetting
	 * @return List<String> settings*/
	public List<String> makeInnerHtml(String id, String classSetting) {
		List<String> settings = new ArrayList<String>();
		
		if (null != id && id.length() > 0) {
			settings.add(id);
		}
		
		if (null != classSetting && classSetting.length() > 0) {
			settings.add(classSetting);
		}
		
		return settings;
	}
	
	/**Returns a div element.
	 * @param String[] innerHtml
	 * @param String[] innerText
	 * @param String[] elements
	 * @return String div*/
	public String makeDiv(List<String> innerHtml, String[]innerText, String[]elements) {
		String div = "<div ";
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item : innerHtml) {
				if (i < (innerHtml.size() - 1)) {
					div += item + " ";
				} else {
					div += item;
				}
				i++;
			}
		}

		div += "><br>";

		if (null != innerText && innerText.length > 0) {
			int i = 0;
			for (String item : innerText) {
				if (i < (innerText.length - 1)) {
					div += item + "<br>";
				} else {
					div += item;
				}
				i++;
			}
		}
		
		div += "<br>";

		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item : elements) {
				if (i < (elements.length - 1)) {
					div += item + "<br>";
				} else {
					div += item;
				}
				i++;
			}
		}

		div += "</div>";

		return div;
	}

	/**Returns a div element.
	 * @param List<String> innerHtml
	 * @param String[] innerText
	 * @param String[] elements
	 * @return String div*/
	public String makeHeader(List<String> innerHtml, String[]innerText, String[]elements) {
		String header = "<header ";
		
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.size() - 1)) {
					header += item + " ";
				} else {
					header += item;
				}
				i++;
			}
		}
		
		header += "><br>";
		
		if (null != innerText && innerText.length > 0) {
			int i = 0;
			for (String item:innerText) {
				if (i < (innerText.length - 1)) {
					header += item + "<br>";
				} else {
					header += item;
				}
				i++;
			}
		}
		
		header += "<br>";
		
		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.length - 1)) {
					header += item + "<br>";
				} else {
					header += item;
				}
				i++;
			}
		}
		
		header += "</header>";
		
		return header;
	}
	
	/**Returns a header element.
	 * @param List<String> innerHtml
	 * @param String[] innerText
	 * @return String header*/
	public String makeParagraph(List<String> innerHtml, String[]innerText) {
		String para = "<p ";
		
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.size() - 1)) {
					para += item + " ";
				} else {
					para += item;
				}
				i++;
			}
		}
		
		para += "><br>";
		
		if (null != innerText && innerText.length > 0) {
			int i = 0;
			for (String item:innerText) {
				if (i < (innerText.length - 1)) {
					para += "<br>" + item + "<br>";
				} else {
					para += item;
				}
				i++;
			}
		}
		
		para += "<br></p>";
		
		return para;
	}
	
	/**Returns a span element.
	 * @param List<String> innerHtml
	 * @param String[] innerText
	 * @param String[] elements
	 * @return String span*/
	public String makeSpan(List<String> innerHtml, String[]innerText, String[]elements) {
		String span = "<span ";
		
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.size() - 1)) {
					span += item + " ";
				} else {
					span += item;
				}
				i++;
			}
		}
		
		span += "><br>";
		
		if (null != innerText && innerText.length > 0) {
			int i = 0;
			for (String item:innerText) {
				if (i < (innerText.length - 1)) {
					span += item + "<br>";
				} else {
					span += item;
				}
				i++;
			}
		}
		
		span += "<br>";
		
		if (null != elements && elements.length > 0) {
			int i = 0;
			for (String item:elements) {
				if (i < (elements.length - 1)) {
					span += item + "<br>";
				} else {
					span += item;
				}
				i++;
			}
		}
		
		span += "<br></span>";
		
		return span;
	}
	
	/**Returns a head element.
	 * @param String[] elements
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
	
	/**Returns a body element.
	 * @param List<String> innerHtml
	 * @param String[] elements
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
	
	/**Returns a page element.
	 * @param String[] elements
	 * @return String page*/
	public String makePage(String head, String body, String[] last) {
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
			}
		}
		
		
		page += "</html>";
		
		return page;
	}
	
}

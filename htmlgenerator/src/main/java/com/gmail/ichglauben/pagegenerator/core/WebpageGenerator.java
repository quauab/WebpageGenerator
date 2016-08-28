package com.gmail.ichglauben.pagegenerator.core;

import java.util.ArrayList;
import java.util.List;

public class WebpageGenerator {
	
	public WebpageGenerator() {}
	
	/**Returns a div element.
	 * @param innerHtml String List The div's property settings
	 * @param innerText String[] The div's text node children
	 * @param elements String[] The div's children elements
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
	 * @param innerHtml String[] The div's property settings
	 * @param innerText String[] The div's text node children
	 * @param elements String[] The div's children elements
	 * @return String div*/
	public String makeDiv(String[] innerHtml, String[]innerText, String[]elements) {
		String div = "<div ";
		if (null != innerHtml && innerHtml.length > 0) {
			int i = 0;
			for (String item : innerHtml) {
				if (i < (innerHtml.length - 1)) {
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
	 * @param innerHtml String List The header element's property settings
	 * @param innerText String[] The header's text node children
	 * @param elements String[] The header's children elements
	 * @return String div*/
	public String makeHeader(List<String> innerHtml, String[]innerText, String[]elements) {
		String div = "<div ";
		
		if (null != innerHtml && innerHtml.size() > 0) {
			int i = 0;
			for (String item:innerHtml) {
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
			for (String item:innerText) {
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
			for (String item:elements) {
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
	 * @param innerHtml String[] The header element's property settings
	 * @param innerText String[] The header's text node children
	 * @param elements String[] The header's children elements
	 * @return String div*/
	public String makeHeader(String[] innerHtml, String[]innerText, String[]elements) {
		String div = "<div ";
		
		if (null != innerHtml && innerHtml.length > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.length - 1)) {
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
			for (String item:innerText) {
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
			for (String item:elements) {
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
	
	/**Returns a header element.
	 * @param innerHtml String List The paragraph element's property settings
	 * @param innerText String[] The paragraph element's text node children
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
	
	/**Returns a header element.
	 * @param innerHtml String[] The paragraph element's property settings
	 * @param innerText String[] The paragraph element's text node children
	 * @return String header*/
	public String makeParagraph(String[] innerHtml, String[]innerText) {
		String para = "<p ";
		
		if (null != innerHtml && innerHtml.length > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.length - 1)) {
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
	 * @param innerHtml String List The span's property settings
	 * @param innerText  String[] The sapn's text node children
	 * @param elements String[] The span's children
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
	
	/**Returns a span element.
	 * @param innerHtml String[] The span's property settings
	 * @param innerText  String[] The sapn's text node children
	 * @param elements String[] The span's children
	 * @return String span*/
	public String makeSpan(String[] innerHtml, String[]innerText, String[]elements) {
		String span = "<span ";
		
		if (null != innerHtml && innerHtml.length > 0) {
			int i = 0;
			for (String item:innerHtml) {
				if (i < (innerHtml.length - 1)) {
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

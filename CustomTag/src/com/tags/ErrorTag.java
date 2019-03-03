package com.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ErrorTag extends TagSupport{
	private String property;

	public void setProperty(String property) {
		this.property = property;
	}
	@Override
	public int doEndTag() throws JspException {
		Object err = pageContext.findAttribute(property);
		System.out.println(err);
		if(err != null) {
			JspWriter out = pageContext.getOut();
			try {
				out.write("<font color='red'>"+err+"</font>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return super.doEndTag();
	}
}

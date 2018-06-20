package com.wavelabs.ctag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class KasiTag extends SimpleTagSupport{

	public void doTag() throws JspException,IOException
	{
		JspWriter out = getJspContext().getOut();
		out.print("Hello! Welcome to Kasi's Tag!!");
	}
	
}

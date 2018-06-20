package com.wavelabs.ctag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class MessageTag extends SimpleTagSupport
{
	String message;
	
	public void doTag() throws JspException,IOException
	{
		JspWriter out = getJspContext().getOut();
		//out.print("Hello! Good Morning!!");
		out.print(message);
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
}

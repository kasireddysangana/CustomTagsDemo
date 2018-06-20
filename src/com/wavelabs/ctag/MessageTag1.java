package com.wavelabs.ctag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class MessageTag1 extends BodyTagSupport
{
	int count=0;
	String mycolor;
	String myfont;
	String mysize;
	String repeatFor;
	public void setMycolor(String mycolor) {this.mycolor=mycolor;}
	public void setMyfont(String myfont) {this.myfont=myfont;}
	public void setMysize(String mysize) {this.mysize=mysize;}
	public void setRepeatFor(String repeatFor) { this.repeatFor = repeatFor;}
	
	
	public int doAfterBody() throws JspException
	{
		BodyContent bc = getBodyContent();
		String strbc = bc.getString();
		try {
			JspWriter out = bc.getEnclosingWriter();
			for(int i=1;i<=Integer.parseInt(repeatFor);i++) {
				System.out.println("<p style='color:"+mycolor+";font-size:"+mysize+";font-family:"+myfont+"'>"+strbc+"</p>");
				out.print("<p style='color:"+mycolor+";font-size:"+mysize+";font-family:"+myfont+"'>"+strbc+"</p>");
			}
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return SKIP_BODY;
	}
}

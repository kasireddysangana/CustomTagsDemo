package com.wavelabs.ctag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;
import com.wavelabs.entity.Employee;

public class DisplayEmployeeTag extends SimpleTagSupport
{
	Employee emp;
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	
	public void doTag() throws JspException, IOException
	{
		JspWriter out = getJspContext().getOut();
		
		out.print("This is Atrribut Demo <br> <hr>");
		out.print("Empid : " + emp.getEmpid());
		out.print("<br>");
		out.print("Ename : " + emp.getEname());
		out.print("<br>");
		out.print("Salary : " + emp.getSalary());
		out.print("<br>");
		out.print("Deptno : " + emp.getDeptno());
		out.print("<br>");
	}
}

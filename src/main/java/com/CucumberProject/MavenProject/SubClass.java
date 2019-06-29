package com.CucumberProject.MavenProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubClass extends ParentClass{

	public void methodA()
	{
		System.out.println("From Sub Class ,Method A");
	}
	
	public void methodC()
	{
		System.out.println("From Sub Class ,Method c");
	}
	
	public static void main(String[] args)
	{
		ParentClass p= new SubClass();
		SubClass s= new SubClass();
		s.methodA();
		s.methodB();
		s.methodC();
		p.methodA();
		p.methodB();
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});
		
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names.toString());
		
		
		
	}
	
}

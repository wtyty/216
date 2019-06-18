package edu.chinasoft.day18_01;
/**
 * @author cjgong
 * @date ÉÏÎç10:24:57
 * @version  1.0
 * TODO :
 */

public class Student {
	private boolean age;
	private int name;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(boolean age, int name) {
		super();
		this.age = age;
		this.name = name;
	}


	public boolean isAge() {
		return age;
	}


	public void setAge(boolean age) {
		this.age = age;
	}


	public int getName() {
		return name;
	}


	public void setName(int name) {
		this.name = name;
	}
	
	

}

package edu.chinasoft.day18_04;
/**
 * @author cjgong
 * @date 下午12:04:40
 * @version  1.0
 * TODO :
 */

public class Student {
	private int age;
	private String name;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 * 该方法为析构函数，在对象删除之前执行
	 */
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("学生："+this.name+"被删除。");
	}
	
	

}

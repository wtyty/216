package edu.chinasoft.day18_02;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cjgong
 * @date 上午10:54:04
 * @version  1.0
 * TODO :
 */

public class Teacher02Test {

	@Test
	public void test01() {
		new Teacher02();
	}
	
	@Test
	public void test02() {
		Teacher02 instance01 = Teacher02.getInstance();
		Teacher02 instance02 = Teacher02.getInstance();
		System.out.println("是否为同一个对象：  "+(instance01==instance02?"同一个对象":"不同对象")+"。");
	}

}

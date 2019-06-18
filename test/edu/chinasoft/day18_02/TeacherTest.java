package edu.chinasoft.day18_02;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cjgong
 * @date 上午10:49:32
 * @version  1.0
 * TODO :
 */

public class TeacherTest {

	@Test
	public void test01() {
		Teacher teacher01 = new Teacher();
		Teacher teacher02 = new Teacher();
		System.out.println("是不是同一个对象："+(teacher01==teacher02?"同一个对象":"不是同一个对象")+"。");
	}

}

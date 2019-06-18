package edu.chinasoft.day18_05;

import java.io.IOException;

/**
 * @author cjgong
 * @date 下午2:08:58
 * @version  1.0
 * TODO :
 */

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
	}

	public static void test01() throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();     //获取runtime对象
		Process exec = runtime.exec("notepad.exe");     //通过runtime对象调用notepad程序
		Thread.sleep(5*1000);                       //让记事本程序停留5秒
		exec.destroy();                             //关闭记事本程序
	}

}

package edu.chinasoft.day18_05;

import java.io.IOException;

/**
 * @author cjgong
 * @date ����2:08:58
 * @version  1.0
 * TODO :
 */

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
	}

	public static void test01() throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();     //��ȡruntime����
		Process exec = runtime.exec("notepad.exe");     //ͨ��runtime�������notepad����
		Thread.sleep(5*1000);                       //�ü��±�����ͣ��5��
		exec.destroy();                             //�رռ��±�����
	}

}

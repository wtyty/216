package edu.chinasoft.day18_04;
/**
 * @author cjgong
 * @date ����12:05:16
 * @version  1.0
 * TODO :
 */

public class Test {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");

		// ��������
		Student xiaoming = new Student(19, "xiaoming");
		Student xiaowu = new Student(19, "xiaowu");
		Student xiaohong = new Student(19, "xiaohong");


		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");

		// ɾ������
		xiaoming = null;
		xiaohong = null;
		xiaowu = null;

		
		//ɾ������󣬶�����һ��   �÷�������Ŀ�����У����Ƽ�ʹ�á�
		System.gc();
		runtime.gc();     //����jdk���Ի����ڴ棬����jdk��һ�����ϻ����ڴ棬Ҳ�п��ܹ���ʱ������ڴ档
		
		
		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");
	}
	

}

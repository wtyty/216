package edu.chinasoft.day18_03;

/**
 * @author cjgong
 * @date ����11:29:41
 * @version 1.0 TODO :
 */

public class Test02 {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");

		// ��������
		byte[] byteForArray01 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray02 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray03 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray04 = new byte[4 * 1024 * 1024]; // 4k

		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");

		// ɾ������
		byteForArray01 = null;
		byteForArray02 = null;
		byteForArray03 = null;
		byteForArray04 = null;
		
		//ɾ������󣬶�����һ��   �÷�������Ŀ�����У����Ƽ�ʹ�á�
		System.gc();
		runtime.gc();     //����jdk���Ի����ڴ棬����jdk��һ�����ϻ����ڴ棬Ҳ�п��ܹ���ʱ������ڴ档
		
		
		System.out.println("�ڴ��������jdk���ڴ�Ϊ��" + (runtime.totalMemory() / 1024 / 1024) + "MB��");
		System.out.println("��ǰjdk������ڴ�Ϊ��" + (runtime.freeMemory() / 1024 / 1024) + "MB��");

	}

}

package edu.chinasoft.day18_07;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date ����3:27:32
 * @version 1.0 TODO :
 */

public class Test01 {
	public static void main(String[] args) throws IOException {

		test05();

	}
	/**
	 * TODO 
	 * Ŀ¼�Ѿ����ڣ��ͻᴴ�����ɹ���
	 * Ŀ¼����Ϊ windows�ؼ��֣�Ҳ�ᴴ�����ɹ�
	 */
	public static void test05() {
		String path = "file01/con/file03";
		File file = new File(path);

		boolean result = file.mkdirs();
		System.out.println("Ŀ¼�Ƿ񴴽��ɹ���" + (result ? "�ɹ�!" : "���ɹ���") + "��");
	}


	public static void test04() {
		String path = "file01/file02/file03";
		File file = new File(path);
		if (file.exists()) {
			System.out.println("��Ŀ¼�Ѿ����ڣ�����Ҫ������");
		} else {
			boolean result = file.mkdirs();
			System.out.println("Ŀ¼�Ƿ񴴽��ɹ���" + (result ? "�ɹ�!" : "���ɹ���") + "��");
		}
	}

	/**
	 * TODO ����һ��Ŀ¼�������Ƿ���Ŀ¼����
	 * 
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {

		File file = new File(path);
		if (file.exists()) { // ����true����ʾ����
			System.out.println("��Ŀ¼�Ѿ����ڣ�����Ҫ������");
		} else { // ��ʾ������
			File fileParent = file.getParentFile(); // ��ȡ����Ŀ¼�Ķ���
			if (fileParent.exists()) {
				file.mkdir(); // ����Ŀ¼
			} else {
				test03(fileParent.getCanonicalPath()); // �������ڸ��׵�Ŀ¼
				file.mkdir(); // ����Ŀ¼
			}

		}
	}

	/**
	 * TODO ����һ��Ŀ¼����Ŀ¼���븸��Ŀ¼����
	 */
	public static void test02() {
		String path = "file01/file02/file03";
		File file = new File(path);
		if (file.exists()) { // ����true����ʾ����
			System.out.println("��Ŀ¼�Ѿ����ڣ�����Ҫ������");
		} else { // ��ʾ������
			if (file.getParentFile().exists()) { // ����Ŀ¼����
				// ����·������ʾ��Ŀ¼
				boolean result = file.mkdir();
				System.out.println("Ŀ¼������" + (result ? "�ɹ�" : "ʧ��") + "��");
			} else {
				System.out.println("��Ŀ¼�ĸ���Ŀ¼�����ڣ�����Ҫ�ȴ�������Ŀ¼��");
			}

		}

	}

	/**
	 * TODO ����mkdir������˵�� �����������Ŀ¼���ڣ��ͻᴴ��ʧ�ܡ� Ŀ¼����Ϊwindows����ϵͳ�Ĺؼ��֡� ��Ŀ¼�����ڵģ�Ҳ�������ɹ���
	 * 
	 */
	public static void test01() {
		String path = "file01/file02/file03";
		File file = new File(path);
		// ����·������ʾ��Ŀ¼
		boolean result = file.mkdir();
		System.out.println("Ŀ¼������" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

}

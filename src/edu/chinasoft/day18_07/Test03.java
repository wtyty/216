package edu.chinasoft.day18_07;

import java.io.File;

/**
 * @author cjgong
 * @date ����5:24:37
 * @version 1.0 TODO :
 */

public class Test03 {
	public static void main(String[] args) {
		test03();

	}

	public static void test04(String pathForSrc, String pathForTarget) {
		// Ŀ�������Ѿ����ڣ��ͻ��ƶ�ʧ��
		// Ŀ¼���ݵĸ�Ŀ¼�����ڣ�Ҳ���ƶ�ʧ��
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);
		if (fileSrc.exists()) {
			if (fileTarget.exists()) {
				System.out.println("Ŀ���ļ�|Ŀ¼�Ѿ����ӣ�����Ҫ�ƶ�");

			} else {
				File parentFile = fileTarget.getParentFile();
				if (!parentFile.exists()) { // �������Ŀ¼�����ڣ��ȴ����ø�Ŀ¼
					parentFile.mkdirs();
				}
				boolean result = fileSrc.renameTo(fileTarget);
				System.out.println("�޸��Ƿ�ɹ���" + (result ? "�ɹ�" : "ʧ��") + "��");
			}

		} else {
			System.out.println("���ƶ����ļ�|Ŀ¼������!");
		}

	}

	public static void test03() {
		// Ŀ�������Ѿ����ڣ��ͻ��ƶ�ʧ��
		// Ŀ¼���ݵĸ�Ŀ¼�����ڣ�Ҳ���ƶ�ʧ��

		String pathForSrc = "file01/file02/file03/file04/test01.txt";
		String pathForTarget = "file01/file02/file03/file06/test01.txt";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("�޸��Ƿ�ɹ���" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

	public static void test02() {
		String pathForSrc = "file01/file02/file03/file051";
		String pathForTarget = "file01/file02/file03/file05";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("�޸��Ƿ�ɹ���" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

	public static void test01() {
		String pathForSrc = "file01/file02/file03/test01.txt";
		String pathForTarget = "file01/file02/file03/test02.txt";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("�޸��Ƿ�ɹ���" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

}

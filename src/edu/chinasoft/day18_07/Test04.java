package edu.chinasoft.day18_07;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date ����5:39:16
 * @version 1.0 TODO :
 */

public class Test04 {
	public static void main(String[] args) throws IOException {
		test03("file01/file02/file03");
	}

	/**
	 * TODO
	 * 
	 * @param path
	 *            ���ܸ�Ŀ¼�£��Ƿ������ݣ�����Ҫɾ��
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				boolean result = file.delete();
				System.out.println("�ļ���" + file.getCanonicalPath() + "ɾ���Ƿ�ɹ�:" + (result ? "�ɹ�" : "ʧ��") + "��");
			} else {
				File[] listFiles = file.listFiles(); // ��ȡ��Ŀ¼����Ŀ¼
				if (listFiles.length == 0) {
					boolean result = file.delete();
					System.out.println("Ŀ¼��" + file.getCanonicalPath() + "ɾ���Ƿ�ɹ�:" + (result ? "�ɹ�" : "ʧ��") + "��");
				} else {
					for (File element : listFiles) {
						test03(element.getCanonicalPath());
					}
					boolean result = file.delete();
					System.out.println("Ŀ¼��" + file.getCanonicalPath() + "ɾ���Ƿ�ɹ�:" + (result ? "�ɹ�" : "ʧ��") + "��");

				}

			}

		} else {
			System.out.println("���ļ�����Ŀ¼�����ڣ�����ʵ��ɾ�����ܣ�");
		}

	}

	/**
	 * TODO ��ɾ����Ŀ¼������ Ŀ¼����������ɾ��
	 * 
	 */
	public static void test02() {
		String path = "D:\\190103code\\day18_01\\file01\\file02\\file03\\file06";
		File file = new File(path);
		boolean result = file.delete();
		System.out.println("ɾ���Ƿ�ɹ�:" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

	/**
	 * TODO ��Ҫɾ�����ļ������ڡ� �����������ڲ������ļ�Ҳɾ������
	 * 
	 */
	public static void test01() {
		String path = "D:\\190103code\\day18_01\\file01\\file02\\file03\\test01.doc";
		File file = new File(path);
		boolean result = file.delete();
		System.out.println("ɾ���Ƿ�ɹ�:" + (result ? "�ɹ�" : "ʧ��") + "��");
	}

}

package edu.chinasoft.day18_08;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date ����3:53:03
 * @version  1.0
 * TODO :
 */

public class Test01 {
	/**
	 * TODO
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	
		test04();
		
		
		
	}
	public static void test04() throws IOException {
		File filePath = new File("file01/file02/file03");
		File file = File.createTempFile("cjgong01", ".temp", filePath);
		System.out.println("��ʱ�ļ��ľ���·��Ϊ��"+file.getCanonicalPath()+"��");
	}
	

	/**
	 * TODO
	 * @throws IOException
	 * �ڵ�ǰ����ϵͳ����ʱĿ¼�£�C:\Users\Administrator\AppData\Local\Temp��������һ����ʱ�ļ�
	 * ����ʱ�ļ���ǰ׺�ͺ�׺��Ҫͨ������ָ��
	 */
	public static void test03() throws IOException {
		File file = File.createTempFile("cjgong01", ".temp");
		System.out.println("��ʱ�ļ��ľ���·��Ϊ��"+file.getCanonicalPath()+"��");
	}
	
	
	public static void test02() throws IOException {
		String path="file01/file02/file03/file04/test01.txt";
		File file = new File(path);
		if(file.exists()) {
			System.out.println("�ļ��Ѿ����ڣ�����Ҫ�ٴ���");
		}else {
			File parentFile = file.getParentFile();
			if(!parentFile.exists()) {
				parentFile.mkdirs();   //�����ø���Ŀ¼
			}
			boolean result = file.createNewFile();
			System.out.println("�ļ��Ƿ񴴽��ɹ�:"+(result?"�����ɹ�":"�������ɹ�")+"��");
		}	

	}

	/**
	 * TODO
	 * @throws IOException
	 * ���ļ��Ѿ�����
	 * ���ļ��ĸ���Ŀ¼������
	 * �ļ�������Ϊwindows �Ĺؼ���
	 */
	public static void test01() throws IOException {
		String path="file01/file02/file03/con.txt";
		File file = new File(path);
		boolean result = file.createNewFile();
		System.out.println("�ļ��Ƿ񴴽��ɹ�:"+(result?"�����ɹ�":"�������ɹ�")+"��");
	}

}

package edu.chinasoft.day18_06;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date ����2:36:05
 * @version  1.0
 * TODO :
 */

public class Test01 {
	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		String path="file"+File.separator+"�½��ı��ĵ� (5).txt";
		File file = new File(path);
		System.out.println("�ļ�������Ϊ��" +file.getName()+"��");
	}
	public static void test05() throws IOException {
		String path="file/�½��ı��ĵ� (5).txt";
		File file = new File(path);
		System.out.println("�ļ�������Ϊ��" +file.getName()+"��");
	}
	public static void test04() throws IOException {
		String path="D:\\190103code\\day18_01\\file\\�½��ı��ĵ� (5).txt";
		File file = new File(path);
		System.out.println("�ļ�������Ϊ��" +file.getName()+"��");
	}
	public static void test03() throws IOException {
		String path=".";          //��ʾ��ǰ·��
		File file = new File(path);
		System.out.println("����·��Ϊ��"+file.getCanonicalPath()+"��");
	}
	public static void test02() {
		String path="C:/�½��ı��ĵ� (5).txt";
		File file = new File(path);
		System.out.println("�ļ�������Ϊ��" +file.getName()+"��");
	}
	public static void test01() {
		String path="C:\\�½��ı��ĵ� (5).txt";
		File file = new File(path);
		System.out.println("�ļ�������Ϊ��" +file.getName()+"��");
	}

}

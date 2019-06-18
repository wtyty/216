package edu.chinasoft.day18_06;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date 下午2:36:05
 * @version  1.0
 * TODO :
 */

public class Test01 {
	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		String path="file"+File.separator+"新建文本文档 (5).txt";
		File file = new File(path);
		System.out.println("文件的名字为：" +file.getName()+"。");
	}
	public static void test05() throws IOException {
		String path="file/新建文本文档 (5).txt";
		File file = new File(path);
		System.out.println("文件的名字为：" +file.getName()+"。");
	}
	public static void test04() throws IOException {
		String path="D:\\190103code\\day18_01\\file\\新建文本文档 (5).txt";
		File file = new File(path);
		System.out.println("文件的名字为：" +file.getName()+"。");
	}
	public static void test03() throws IOException {
		String path=".";          //表示当前路径
		File file = new File(path);
		System.out.println("绝对路径为："+file.getCanonicalPath()+"。");
	}
	public static void test02() {
		String path="C:/新建文本文档 (5).txt";
		File file = new File(path);
		System.out.println("文件的名字为：" +file.getName()+"。");
	}
	public static void test01() {
		String path="C:\\新建文本文档 (5).txt";
		File file = new File(path);
		System.out.println("文件的名字为：" +file.getName()+"。");
	}

}

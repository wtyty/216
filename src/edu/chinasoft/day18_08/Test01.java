package edu.chinasoft.day18_08;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date 下午3:53:03
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
		System.out.println("临时文件的绝对路径为："+file.getCanonicalPath()+"。");
	}
	

	/**
	 * TODO
	 * @throws IOException
	 * 在当前操作系统的临时目录下（C:\Users\Administrator\AppData\Local\Temp），创建一个临时文件
	 * 该临时文件的前缀和后缀需要通过代码指定
	 */
	public static void test03() throws IOException {
		File file = File.createTempFile("cjgong01", ".temp");
		System.out.println("临时文件的绝对路径为："+file.getCanonicalPath()+"。");
	}
	
	
	public static void test02() throws IOException {
		String path="file01/file02/file03/file04/test01.txt";
		File file = new File(path);
		if(file.exists()) {
			System.out.println("文件已经存在，不需要再创建");
		}else {
			File parentFile = file.getParentFile();
			if(!parentFile.exists()) {
				parentFile.mkdirs();   //创建好父亲目录
			}
			boolean result = file.createNewFile();
			System.out.println("文件是否创建成功:"+(result?"创建成功":"创建不成功")+"。");
		}	

	}

	/**
	 * TODO
	 * @throws IOException
	 * 该文件已经存在
	 * 该文件的父亲目录不存在
	 * 文件的名字为windows 的关键字
	 */
	public static void test01() throws IOException {
		String path="file01/file02/file03/con.txt";
		File file = new File(path);
		boolean result = file.createNewFile();
		System.out.println("文件是否创建成功:"+(result?"创建成功":"创建不成功")+"。");
	}

}

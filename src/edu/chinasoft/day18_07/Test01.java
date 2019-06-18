package edu.chinasoft.day18_07;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date 下午3:27:32
 * @version 1.0 TODO :
 */

public class Test01 {
	public static void main(String[] args) throws IOException {

		test05();

	}
	/**
	 * TODO 
	 * 目录已经存在，就会创建不成功过
	 * 目录名字为 windows关键字，也会创建不成功
	 */
	public static void test05() {
		String path = "file01/con/file03";
		File file = new File(path);

		boolean result = file.mkdirs();
		System.out.println("目录是否创建成功：" + (result ? "成功!" : "不成功！") + "。");
	}


	public static void test04() {
		String path = "file01/file02/file03";
		File file = new File(path);
		if (file.exists()) {
			System.out.println("该目录已经存在，不需要创建！");
		} else {
			boolean result = file.mkdirs();
			System.out.println("目录是否创建成功：" + (result ? "成功!" : "不成功！") + "。");
		}
	}

	/**
	 * TODO 创建一个目录，不管是否父亲目录存在
	 * 
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {

		File file = new File(path);
		if (file.exists()) { // 返回true，表示存在
			System.out.println("该目录已经存在，不需要创建！");
		} else { // 表示不存在
			File fileParent = file.getParentFile(); // 获取父亲目录的对象
			if (fileParent.exists()) {
				file.mkdir(); // 创建目录
			} else {
				test03(fileParent.getCanonicalPath()); // 创建关于父亲的目录
				file.mkdir(); // 创建目录
			}

		}
	}

	/**
	 * TODO 创建一个目录，该目录必须父亲目录存在
	 */
	public static void test02() {
		String path = "file01/file02/file03";
		File file = new File(path);
		if (file.exists()) { // 返回true，表示存在
			System.out.println("该目录已经存在，不需要创建！");
		} else { // 表示不存在
			if (file.getParentFile().exists()) { // 父亲目录存在
				// 创建路径所表示的目录
				boolean result = file.mkdir();
				System.out.println("目录创建：" + (result ? "成功" : "失败") + "。");
			} else {
				System.out.println("该目录的父亲目录不存在，必须要先创建父亲目录！");
			}

		}

	}

	/**
	 * TODO 对于mkdir方法来说： 如果所创建的目录存在，就会创建失败。 目录名字为windows操作系统的关键字。 父目录不存在的，也创建不成功。
	 * 
	 */
	public static void test01() {
		String path = "file01/file02/file03";
		File file = new File(path);
		// 创建路径所表示的目录
		boolean result = file.mkdir();
		System.out.println("目录创建：" + (result ? "成功" : "失败") + "。");
	}

}

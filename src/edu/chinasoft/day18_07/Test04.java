package edu.chinasoft.day18_07;

import java.io.File;
import java.io.IOException;

/**
 * @author cjgong
 * @date 下午5:39:16
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
	 *            不管该目录下，是否有内容，都需要删除
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				boolean result = file.delete();
				System.out.println("文件：" + file.getCanonicalPath() + "删除是否成功:" + (result ? "成功" : "失败") + "。");
			} else {
				File[] listFiles = file.listFiles(); // 获取该目录的子目录
				if (listFiles.length == 0) {
					boolean result = file.delete();
					System.out.println("目录：" + file.getCanonicalPath() + "删除是否成功:" + (result ? "成功" : "失败") + "。");
				} else {
					for (File element : listFiles) {
						test03(element.getCanonicalPath());
					}
					boolean result = file.delete();
					System.out.println("目录：" + file.getCanonicalPath() + "删除是否成功:" + (result ? "成功" : "失败") + "。");

				}

			}

		} else {
			System.out.println("该文件或者目录不存在，不能实现删除功能！");
		}

	}

	/**
	 * TODO 所删除的目录不存在 目录下有内容是删除
	 * 
	 */
	public static void test02() {
		String path = "D:\\190103code\\day18_01\\file01\\file02\\file03\\file06";
		File file = new File(path);
		boolean result = file.delete();
		System.out.println("删除是否成功:" + (result ? "成功" : "失败") + "。");
	}

	/**
	 * TODO 所要删除的文件不存在。 其他程序正在操作的文件也删除不了
	 * 
	 */
	public static void test01() {
		String path = "D:\\190103code\\day18_01\\file01\\file02\\file03\\test01.doc";
		File file = new File(path);
		boolean result = file.delete();
		System.out.println("删除是否成功:" + (result ? "成功" : "失败") + "。");
	}

}

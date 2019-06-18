package edu.chinasoft.day18_07;

import java.io.File;

/**
 * @author cjgong
 * @date 下午5:24:37
 * @version 1.0 TODO :
 */

public class Test03 {
	public static void main(String[] args) {
		test03();

	}

	public static void test04(String pathForSrc, String pathForTarget) {
		// 目标内容已经存在，就会移动失败
		// 目录内容的父目录不存在，也会移动失败
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);
		if (fileSrc.exists()) {
			if (fileTarget.exists()) {
				System.out.println("目标文件|目录已经车子，不需要移动");

			} else {
				File parentFile = fileTarget.getParentFile();
				if (!parentFile.exists()) { // 如果父亲目录不存在，先创建好父目录
					parentFile.mkdirs();
				}
				boolean result = fileSrc.renameTo(fileTarget);
				System.out.println("修改是否成功：" + (result ? "成功" : "失败") + "。");
			}

		} else {
			System.out.println("所移动的文件|目录不存在!");
		}

	}

	public static void test03() {
		// 目标内容已经存在，就会移动失败
		// 目录内容的父目录不存在，也会移动失败

		String pathForSrc = "file01/file02/file03/file04/test01.txt";
		String pathForTarget = "file01/file02/file03/file06/test01.txt";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("修改是否成功：" + (result ? "成功" : "失败") + "。");
	}

	public static void test02() {
		String pathForSrc = "file01/file02/file03/file051";
		String pathForTarget = "file01/file02/file03/file05";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("修改是否成功：" + (result ? "成功" : "失败") + "。");
	}

	public static void test01() {
		String pathForSrc = "file01/file02/file03/test01.txt";
		String pathForTarget = "file01/file02/file03/test02.txt";
		File fileSrc = new File(pathForSrc);
		File fileTarget = new File(pathForTarget);

		boolean result = fileSrc.renameTo(fileTarget);
		System.out.println("修改是否成功：" + (result ? "成功" : "失败") + "。");
	}

}

package edu.chinasoft.day18_03;

/**
 * @author cjgong
 * @date 上午11:29:41
 * @version 1.0 TODO :
 */

public class Test02 {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");

		// 创建对象
		byte[] byteForArray01 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray02 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray03 = new byte[4 * 1024 * 1024]; // 4k
		byte[] byteForArray04 = new byte[4 * 1024 * 1024]; // 4k

		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");

		// 删除对象
		byteForArray01 = null;
		byteForArray02 = null;
		byteForArray03 = null;
		byteForArray04 = null;
		
		//删除对象后，多运行一会   该方法在项目开发中，不推荐使用。
		System.gc();
		runtime.gc();     //告诉jdk可以回收内存，但是jdk不一定马上回收内存，也有可能过段时间回收内存。
		
		
		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");

	}

}

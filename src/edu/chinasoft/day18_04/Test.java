package edu.chinasoft.day18_04;
/**
 * @author cjgong
 * @date 下午12:05:16
 * @version  1.0
 * TODO :
 */

public class Test {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");

		// 创建对象
		Student xiaoming = new Student(19, "xiaoming");
		Student xiaowu = new Student(19, "xiaowu");
		Student xiaohong = new Student(19, "xiaohong");


		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");

		// 删除对象
		xiaoming = null;
		xiaohong = null;
		xiaowu = null;

		
		//删除对象后，多运行一会   该方法在项目开发中，不推荐使用。
		System.gc();
		runtime.gc();     //告诉jdk可以回收内存，但是jdk不一定马上回收内存，也有可能过段时间回收内存。
		
		
		System.out.println("内存条分配给jdk的内存为：" + (runtime.totalMemory() / 1024 / 1024) + "MB。");
		System.out.println("当前jdk里空闲内存为：" + (runtime.freeMemory() / 1024 / 1024) + "MB。");
	}
	

}

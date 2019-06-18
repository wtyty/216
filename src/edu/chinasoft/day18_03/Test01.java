package edu.chinasoft.day18_03;
/**
 * @author cjgong
 * @date 上午11:25:33
 * @version  1.0
 * TODO :
 */

public class Test01 {
	public static void main(String[] args) {
		//返回Runtime对象（通过单例设计模式）
		Runtime runtime = Runtime.getRuntime();
		long totalMemory = runtime.totalMemory();    //-Xms
		long maxMemory = runtime.maxMemory();        //- Xmx
		System.out.println("选项-Xms的值为："+totalMemory/1024/1024+"M。");
		System.out.println("选项- Xmx的值为"+maxMemory/1024/1024+"M。");
	}

}

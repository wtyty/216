package edu.chinasoft.day18_03;
/**
 * @author cjgong
 * @date ����11:25:33
 * @version  1.0
 * TODO :
 */

public class Test01 {
	public static void main(String[] args) {
		//����Runtime����ͨ���������ģʽ��
		Runtime runtime = Runtime.getRuntime();
		long totalMemory = runtime.totalMemory();    //-Xms
		long maxMemory = runtime.maxMemory();        //- Xmx
		System.out.println("ѡ��-Xms��ֵΪ��"+totalMemory/1024/1024+"M��");
		System.out.println("ѡ��- Xmx��ֵΪ"+maxMemory/1024/1024+"M��");
	}

}

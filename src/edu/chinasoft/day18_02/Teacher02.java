package edu.chinasoft.day18_02;
/**
 * @author cjgong
 * @date ����10:53:24
 * @version  1.0
 * TODO :
 */

public class Teacher02 {
	
	
	//����1������
	private  static Teacher02 instance=new Teacher02();

	private Teacher02() {   //��֤ʹ���߲����������ط�ʹ��
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * TODO
	 * @return'
	 *  �÷���������public,�������������κεط�ʹ��
	 *  ���ڸ��಻���������ط��ֶ���������ͨ�����ù��캯���������Ը÷����������෽����
	 *  �÷������뷵��ʱ��ǰ�����
	 *
	 */
	public  static Teacher02  getInstance() {
		
		
		return instance;
	} 
	

}

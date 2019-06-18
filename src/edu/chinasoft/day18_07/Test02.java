package edu.chinasoft.day18_07;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author cjgong
 * @date ����4:10:42
 * @version 1.0 TODO :
 */

public class Test02 {
	public static void main(String[] args) throws IOException {
		File[] listRoots = File.listRoots();     //��ʾwindonswϵͳ������д��̷�
		for(File element:listRoots) {
			System.out.println("���̷���"+element.getCanonicalPath()+"��");
		}
		
		
		
	}
	
	/*
	 * TODO ��ʾĿ¼�����з����������ļ���
	 * 
	 * @throws IOException
	 */
	public static void test05(String path) throws IOException {
		// ��ѯһ��Ŀ¼����Ŀ¼

		File file = new File(path);
		if (file.exists()) {
			  File[] fileArray = file.listFiles(new FilenameFilter() {

					/* (non-Javadoc)
					 * dir�����ڴ����ļ�������Ŀ¼
					 * name:���ڴ����ļ�������
					 */
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						boolean result=false;
						
						if(name.startsWith("Test")&&name.endsWith(".java")) {
							result=true;
						}
						return result;
					}
		        	
		        });
			  
			  for(File element:fileArray) {
				  System.out.println("�ļ���"+element.getCanonicalPath()+"��");
				  
			  }
			  
			  File[] dirForArray = file.listFiles();    //��ȡ��Ŀ¼
			  for(File element:dirForArray) {
				  if(element.isDirectory()) {
					  test05(element.getCanonicalPath());
				  }
				  
			  }
			  
			  
			  
			  
			  
			  
			  

		} else {
			System.out.println("��Ŀ¼�����ڣ�û�취�����Ŀ¼�������!");
		}

	}
	
	
	
	
	/**
	 * TODO ���˲�ѯ��ֻ�����ڵ�ǰĿ¼����Ŀ¼��ʾ�����������ļ�
	 * 
	 * @throws IOException
	 */
	public static void test04(String path) throws IOException {
		// ��ѯһ��Ŀ¼����Ŀ¼

		File file = new File(path);
        File[] listFiles = file.listFiles(new FilenameFilter() {

			/* (non-Javadoc)
			 * dir�����ڴ����ļ�������Ŀ¼
			 * name:���ڴ����ļ�������
			 */
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				boolean result=false;
				
				if(name.startsWith("Test")&&name.endsWith(".java")) {
					result=true;
				}
				return result;
			}
        	
        });
        
        for(File element:listFiles) {
        	System.out.println("�ļ���"+element.getCanonicalPath()+"��");
        }
        
        

	}
	
	
	
	
	
	
	

	/**
	 * TODO ֻ����ʾĿ¼����Ŀ¼���ļ���·����
	 * 
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {
		// ��ѯһ��Ŀ¼����Ŀ¼

		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("�ļ���" + file.getCanonicalPath() + "��");
			} else {
				File[] fileArray = file.listFiles();
				if (fileArray.length == 0) { // û�ж���Ŀ¼
					System.out.println("Ŀ¼��" + file.getCanonicalPath() + "��");

				} else {
					System.out.println("Ŀ¼��" + file.getCanonicalPath() + "��");
					for (File element : fileArray) {
						test03(element.getCanonicalPath());

					}
				}

			}

		} else {
			System.out.println("��Ŀ¼�����ڣ�û�취�����Ŀ¼�������!");
		}

	}

	/**
	 * TODO ֻ����ʾĿ¼����Ŀ¼���ļ���·����
	 * 
	 * @throws IOException
	 */
	public static void test02() throws IOException {
		// ��ѯһ��Ŀ¼����Ŀ¼
		String path = "D:\\190103code\\day18_01\\file";
		File file = new File(path);
		File[] fileArray = file.listFiles();

		for (File element : fileArray) {

			System.out.println("����Ŀ¼|�ļ�Ϊ��" + element.getCanonicalPath() + "��");
		}

	}

	/**
	 * TODO ֻ����ʾĿ¼����Ŀ¼���ļ������֡�
	 */
	public static void test01() {
		// ��ѯһ��Ŀ¼����Ŀ¼
		String path = "D:\\190103code\\day18_01\\file";
		File file = new File(path);
		String[] filePathForArray = file.list();

		for (String element : filePathForArray) {
			System.out.println("����Ŀ¼|�ļ�Ϊ��" + element + "��");

		}
	}

}

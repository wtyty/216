package edu.chinasoft.day18_07;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author cjgong
 * @date 下午4:10:42
 * @version 1.0 TODO :
 */

public class Test02 {
	public static void main(String[] args) throws IOException {
		File[] listRoots = File.listRoots();     //显示windonsw系统里的所有磁盘符
		for(File element:listRoots) {
			System.out.println("磁盘符："+element.getCanonicalPath()+"。");
		}
		
		
		
	}
	
	/*
	 * TODO 显示目录下所有符合条件的文件。
	 * 
	 * @throws IOException
	 */
	public static void test05(String path) throws IOException {
		// 查询一个目录下子目录

		File file = new File(path);
		if (file.exists()) {
			  File[] fileArray = file.listFiles(new FilenameFilter() {

					/* (non-Javadoc)
					 * dir：正在处理文件所处的目录
					 * name:正在处理文件的名字
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
				  System.out.println("文件："+element.getCanonicalPath()+"。");
				  
			  }
			  
			  File[] dirForArray = file.listFiles();    //获取子目录
			  for(File element:dirForArray) {
				  if(element.isDirectory()) {
					  test05(element.getCanonicalPath());
				  }
				  
			  }
			  
			  
			  
			  
			  
			  
			  

		} else {
			System.out.println("该目录不存在，没办法输出该目录里的内容!");
		}

	}
	
	
	
	
	/**
	 * TODO 过滤查询。只正对于当前目录的子目录显示符合条件的文件
	 * 
	 * @throws IOException
	 */
	public static void test04(String path) throws IOException {
		// 查询一个目录下子目录

		File file = new File(path);
        File[] listFiles = file.listFiles(new FilenameFilter() {

			/* (non-Javadoc)
			 * dir：正在处理文件所处的目录
			 * name:正在处理文件的名字
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
        	System.out.println("文件："+element.getCanonicalPath()+"。");
        }
        
        

	}
	
	
	
	
	
	
	

	/**
	 * TODO 只会显示目录下子目录和文件的路径。
	 * 
	 * @throws IOException
	 */
	public static void test03(String path) throws IOException {
		// 查询一个目录下子目录

		File file = new File(path);
		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("文件：" + file.getCanonicalPath() + "。");
			} else {
				File[] fileArray = file.listFiles();
				if (fileArray.length == 0) { // 没有儿子目录
					System.out.println("目录：" + file.getCanonicalPath() + "。");

				} else {
					System.out.println("目录：" + file.getCanonicalPath() + "。");
					for (File element : fileArray) {
						test03(element.getCanonicalPath());

					}
				}

			}

		} else {
			System.out.println("该目录不存在，没办法输出该目录里的内容!");
		}

	}

	/**
	 * TODO 只会显示目录下子目录和文件的路径。
	 * 
	 * @throws IOException
	 */
	public static void test02() throws IOException {
		// 查询一个目录下子目录
		String path = "D:\\190103code\\day18_01\\file";
		File file = new File(path);
		File[] fileArray = file.listFiles();

		for (File element : fileArray) {

			System.out.println("儿子目录|文件为：" + element.getCanonicalPath() + "。");
		}

	}

	/**
	 * TODO 只会显示目录下子目录和文件的名字。
	 */
	public static void test01() {
		// 查询一个目录下子目录
		String path = "D:\\190103code\\day18_01\\file";
		File file = new File(path);
		String[] filePathForArray = file.list();

		for (String element : filePathForArray) {
			System.out.println("儿子目录|文件为：" + element + "。");

		}
	}

}

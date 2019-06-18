package edu.chinasoft.day18_08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

/**
 * @author cjgong
 * @date ÏÂÎç6:01:35
 * @version  1.0
 * TODO :
 */

public class Test04 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test04 window = new Test04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u5220\u9664\u6587\u4EF6");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String path = "file01\\file02\\test01.txt";
				File file = new File(path);
				file.deleteOnExit();
				
			}
		});
		button.setBounds(191, 66, 95, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5173\u95ED\u7A0B\u5E8F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(191, 135, 95, 25);
		frame.getContentPane().add(button_1);
	}

}

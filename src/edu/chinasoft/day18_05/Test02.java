package edu.chinasoft.day18_05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author cjgong
 * @date 下午2:21:43
 * @version  1.0
 * TODO :
 */

public class Test02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test02 window = new Test02();
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
	public Test02() {
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
		
		JButton button = new JButton("\u5173\u95ED\u7A0B\u5E8F\u7684\u8FD0\u884C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Runtime runtime = Runtime.getRuntime();
				//0为正常退出     非0为异常退出
				runtime.exit(0);
				
				
				
			}
		});
		button.setBounds(101, 53, 186, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5173\u95ED\u7A0B\u5E8F\u7684\u8FD0\u884C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(101, 134, 173, 25);
		frame.getContentPane().add(button_1);
	}
}

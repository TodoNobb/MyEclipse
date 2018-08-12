package runtime.test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RuntimeFrmeTest2 extends JFrame {
	//定义窗口中的组件
	private JButton open;
	private JButton close;
	private JButton exit;
	private JPanel pn;
	private Process rss=null;
	//构造方法中进行初始化界面
	public RuntimeFrmeTest2() {
		JButton open=new JButton("打开录像专家");
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Runtime rt=Runtime.getRuntime();
				try {
					rss=rt.exec("D:\\Program Files\\tlxsoft\\屏幕录像专家 共享版 V2013\\屏录专家.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		JButton close= new JButton("关闭录像专家");
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rss!=null) {
					rss.destroy();
					rss=null;
				}
				else {
					JOptionPane.showMessageDialog(null, "还没有该程序的进程运行！");
				}
				
			}
			
		});
		JButton exit=new JButton("退出程序");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		pn=new JPanel();
		pn.add(open);
		pn.add(close);
		pn.add(exit);
		
		this.add(pn);//没有指定方位，则放在中间并且占据周围。
		this.setTitle("Runtime类功能测试");
		this.setSize(400,300);
		this.setLocation(200,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		//图像界面中，main方法中的代码越少越好
		new RuntimeFrmeTest2();
		
	}
	

}

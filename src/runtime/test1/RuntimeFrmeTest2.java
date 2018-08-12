package runtime.test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RuntimeFrmeTest2 extends JFrame {
	//���崰���е����
	private JButton open;
	private JButton close;
	private JButton exit;
	private JPanel pn;
	private Process rss=null;
	//���췽���н��г�ʼ������
	public RuntimeFrmeTest2() {
		JButton open=new JButton("��¼��ר��");
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Runtime rt=Runtime.getRuntime();
				try {
					rss=rt.exec("D:\\Program Files\\tlxsoft\\��Ļ¼��ר�� ����� V2013\\��¼ר��.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		JButton close= new JButton("�ر�¼��ר��");
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rss!=null) {
					rss.destroy();
					rss=null;
				}
				else {
					JOptionPane.showMessageDialog(null, "��û�иó���Ľ������У�");
				}
				
			}
			
		});
		JButton exit=new JButton("�˳�����");
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
		
		this.add(pn);//û��ָ����λ��������м䲢��ռ����Χ��
		this.setTitle("Runtime�๦�ܲ���");
		this.setSize(400,300);
		this.setLocation(200,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		//ͼ������У�main�����еĴ���Խ��Խ��
		new RuntimeFrmeTest2();
		
	}
	

}

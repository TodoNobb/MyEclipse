package runtime.test1;

import java.io.IOException;

public class RuntimeTest1 {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("cpu:"+rt.availableProcessors());
		System.out.println("�����ڴ棺"+rt.freeMemory());
		System.out.println("�������ڴ棺"+rt.maxMemory());
		System.out.println("�ܵ��ڴ棺"+rt.totalMemory());
		
		//Runtime�Ķ�����Ե���exec����������һ����ǰ��������ϵͳ�еĳ��򣬱����
		try {
			rt.exec("D:\\Program Files\\tlxsoft\\��Ļ¼��ר�� ����� V2013\\��¼ר��.exe");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

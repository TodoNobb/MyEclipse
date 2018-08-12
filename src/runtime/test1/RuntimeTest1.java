package runtime.test1;

import java.io.IOException;

public class RuntimeTest1 {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("cpu:"+rt.availableProcessors());
		System.out.println("可用内存："+rt.freeMemory());
		System.out.println("最大可用内存："+rt.maxMemory());
		System.out.println("总的内存："+rt.totalMemory());
		
		//Runtime的对象可以调用exec方法，调用一个当前宿主操作系统中的程序，比如打开
		try {
			rt.exec("D:\\Program Files\\tlxsoft\\屏幕录像专家 共享版 V2013\\屏录专家.exe");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

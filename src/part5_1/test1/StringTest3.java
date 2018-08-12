package part5_1.test1;
import java.io.*;
public class StringTest3 {
	public static void main(String[] args) {
		//比较字符串内容是否相等，决不能使用==
		/*
		String str1="book";
		String str2="book";
		System.out.println(str1.equals(str2));
		*/
		
		String str3="2001001.jpg,2001002.jpg,2001003.gif,2001004.png";
		String[] arr1=str3.split(",");
		System.out.println(arr1.length);
		for(String sr:arr1) {
			System.out.println(sr);
		}
 		
		//模拟删除网站服务器上的图片文件
		//String delFileUrl="D:\\imgupload";
		for(int i=0;i<arr1.length;i++) {
			String delFileUrl="D:\\imgupload";
			delFileUrl=delFileUrl+"\\"+arr1[i];
			File f=new File(delFileUrl);
			//如果文件存在，则删除
			if(f.exists()) {
				f.delete();
			}
			System.out.println(delFileUrl);
		}
		System.out.println("任务完成。");
		
	}

}

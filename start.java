package main;

import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class start implements Runnable{
	
	@Override
    public void run() {
        while (true) {
            System.out.println("���� �����尡 �������Դϴ�.");

            try {
            	
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception�߻��� while �� ����� 
            }
        }
        
    }
/*
	public static void main(String[] args) throws AWTException {
		Thread th = new Thread(new start());
        // ���󾲷���� ����
        th.setDaemon(true);
        // �����带 ����
        th.start();

        // ���� �����尡 1�ʵڿ� ����ǵ��� ����. 
        // ���󾲷���� �ٸ� �����尡 ��� ����Ǹ� �ڵ�����.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.println("���� �����尡 ����˴ϴ�. ");    
		
		
		
		
		
		SystemClipboard asd = new SystemClipboard();
		Robot robot = new Robot();
		SystemClipboard.copy("helo");
		 
	
		 System.out.println(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_C);
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale locale = Locale.KOREA;
        System.out.println("getCountry : " + locale.getCountry());
        System.out.println("getDefault : " + Locale.getDefault());
        System.out.println("getDisplayCountry(Locale.US) : " + locale.getDisplayCountry(Locale.US));
        System.out.println("getDisplayCountry : " + locale.getDisplayCountry());
        System.out.println("getDisplayLanguage(Locale.US) : " + locale.getDisplayLanguage(Locale.US));
        System.out.println("getDisplayLanguage : " + locale.getDisplayLanguage());
        System.out.println("getDisplayName : " + locale.getDisplayName());
        System.out.println("getDisplayName(Locale.US) : " + locale.getDisplayName(Locale.US));
        System.out.println("getLanguage : " + locale.getLanguage());
        System.out.println("toString : " + locale.toString());
        
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(clipboard);
		if(contents != null)
		{
		     try {
		    	 Robot robot = new Robot();
		          String typingString = (String)(contents.getTransferData(
		DataFlavor.stringFlavor));
		         System.out.println(typingString);
		         for(int i=0;i<typingString.length();i++) {
		        	 robot.delay(100);
		        	
		        	 char charkey = typingString.charAt(i);
		        	 int int_charkey = (int)charkey;
		        	 System.out.println((int)charkey);

		        	 //robot.keyPress(21);
		        	 //robot.keyRelease(21);
		        	 /*
		        	 robot.keyPress(KeyEvent.VK_ALT);
		        	 robot.keyPress(KeyEvent.VK_SHIFT);
		        	 robot.delay(10);
		        	 robot.keyRelease(KeyEvent.VK_ALT);
		        	 robot.keyRelease(KeyEvent.VK_SHIFT); */
		        	 
		        	 robot.keyPress(KeyEvent.VK_A);
		        	 robot.delay(10);
		        	 robot.keyRelease(KeyEvent.VK_A);
		        	
		         } 
		     } catch (Exception e) {}
		}
	}
}

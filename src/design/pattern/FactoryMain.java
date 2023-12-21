package design.pattern;

import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      System.out.println("Hello Design Pattern");
      
//      OS os = new Windows();
//      os.spec();
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getInstance("closed");
		os.spec();
	}

}

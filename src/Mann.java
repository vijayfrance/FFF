import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.exc.MyBusinessException;

public class Mann implements Runnable{
	int x;
	int y;
	
	
	

	public static void main(String[] args) {
		Mann n18 = new Mann();
		Thread n = new Thread(n18);
				Thread n1 = new Thread(n18);
				n.start();
				n1.start();
	}

	@Override
	public void run() {

		for(int i = 0; i< 10;i ++) {
			
			synchronized(this){
				
				x =10;
				y =10;
				
			}
			System.out.println( x + " " + y);
			
		}
		
		
	
		
	}

}

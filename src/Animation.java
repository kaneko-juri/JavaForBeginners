
public class Animation extends MyFrame{
	public void run() {
		
		/*練習問題 5-1
		int x = 30;
		int y = 200;
		
		while(y >= 30) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			y -= 5;
			sleep(0.1);
		}
		
		while (x >= 30) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x += 5;
			sleep(0.1);
		}
		*/
		
		
		/*練習問題 5-2
		int x = 30;
		int y = 30;
		
		while (x <= 150) {
			
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x += 5;
			y += 5;
			sleep(0.1);
		}
		
		while (x >= 30) {
			
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x -= 5;
			sleep(0.1);
		}
		
		while (x <= 150) {
			
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x += 5;
			y -= 5;
			sleep(0.1);
		}
		*/	
		
		/*練習問題 5-3
		int x = 30;
		
		for (int i = 0; i < 3; i++) {
			
			while (x <= 150) {
				
				clear();
				setColor(0,128,0);
				fillOval(x,50,50,50);
				x += 5;
				sleep(0.1);
			}
			
			while(x >= 30) {
				
				clear();
				setColor(0,128,0);
				fillOval(x,50,50,50);
				x -= 5;
				sleep(0.1);
			}
		}*/
		
		/*5-EX
		int x = 30;
		int y = 50;
		
		while(true) {
			while(x <= 200) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x += 5;
				sleep(0.1);
			}
			
			while(y <= 200) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				y += 5;
				sleep(0.1);
			}
			
			while(x >= 30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x -= 5;
				sleep(0.1);
			}
			
			while(y >= 50) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				y -= 5;
				sleep(0.1);
			}
			
		}*/
		
		
		//5-EX2
		int x = 30;
		int y = 50;
		
		while(true) {
			while(x <= 100) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x += 5;
				sleep(0.1);
			}
			
			for (int i = 0; i < 50; i += 5)
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y+i,50,50);
				sleep(0.1);
			}
			
			y += 50;
			
			while(x >= 30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x -= 5;
				sleep(0.1);
			}
			
			for (int i = 0; i < 50; i += 5)
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y+i,50,50);
				sleep(0.1);
			}
			
			y += 50;
		}
		
		
	}
	
	
	
	
		

}



public class Practice4 extends MyFrame {
	public void run() {
		
		int a = 30;
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		for ( int i = 0; i < 20; i++) {
			
			if (i < 11) {
				
				setColor(x,y,z);
				x += 19;
				y += 19;
				z += 19;
				
				fillRect(a,100,10,100);
				a += 20;
			}
			else {
				
				setColor(x,y,z);
				x -= 19;
				y -= 19;
				z -= 19;
				
				fillRect(a,100,10,100);
				a += 20;
				
				
				
				
			}
		}
		
		
		
		
		
	}
	

}

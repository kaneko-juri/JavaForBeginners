import java.util.Vector;

public class CarObject extends MyFrame {
	
	public void run() {
		
		Vector<Car> cars = new Vector<Car>();
		
		for (int i = 0; i < 5; i++) {
			
			int y = 50 + i * 150;
			int vx = i + 1;
			
			cars.add(new Car(0,y,vx,0));
			
		}
		
		for (int i = 0; i < 100; i++) {
			
			clear();
			
			for (int j = 0; j < cars.size(); j++) {
				
				cars.get(j).draw(this);
				cars.get(j).move();
				
			}
			
			sleep(0.1);
			
		}
		
		
		
		
		}


}

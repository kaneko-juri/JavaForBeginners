
public class Car {

	int x,y,vx,vy;
	
	public Car (int x, int y, int vx, int vy) {
		
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		
	}
	
	public void draw (MyFrame frame) {
		
		frame.fillRect(x, y, 200, 45);
		frame.fillRect(x+50, y-30, 100, 50);
		frame.fillOval(x, y+45, 50, 50);
		frame.fillOval(x+150, y+45, 50, 50);
		
	}
	
	public void move() {
		
		x += vx;
		y += vy;
	}
	
}

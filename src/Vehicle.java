
public class Vehicle {

	int x,y,vx,vy;
	
	public Vehicle(int x, int y, int vx, int vy) {
		
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy =vy;
		
	}
	
	public void move(MyFrame frame) {
		
		x += vx;
		y += vy;
		
		
	}
	
	
	public void draw(MyFrame frame) {
		// TODO 自動生成されたメソッド・スタブ
		
	}








	
	
}

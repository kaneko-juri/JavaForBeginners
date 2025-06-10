
public class Train extends Vehicle{
	
	public Train(int x, int y, int vx, int vy) {
		
		super(x,y,vx,vy);
		
	}
	
	public void draw(MyFrame frame) {
		
		frame.fillRect(x, y+20, 100, 30);
		frame.fillOval(x+5, y+50, 10, 10);
		frame.fillOval(x+15, y+50, 10, 10);
		frame.fillOval(x+75, y+50, 10, 10);
		frame.fillOval(x+85, y+50, 10, 10);
		
	}
	
	
}

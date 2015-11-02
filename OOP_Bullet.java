package TankGame;

public class Bullet {

	private int x;
	private int y;
	
	private int Speed = 2;
	
	private int direction;
	
	Bullet(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return Speed;
	}
	
	public void updateX(int x){
		this.x += x;
	}
	
	public void updateY(int y){
		this.y += y;
	}	
	
	public void destroy(){
		x = - 100;
		y = - 100;
	}

}

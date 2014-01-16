import info.gridworld.actor.Bug;
public class CircleBug extends Bug {
	private int radius = 0;
	public CircleBug(int radiusLength) {
		this.radius = radiusLength;
	}
	public void act(){
		if (canMove()) {
			for (int i = 0; i < radius; i++) {
				move();
			}
			turn();
			
		}else{
			turn();
		}
	}
}
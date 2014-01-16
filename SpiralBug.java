import info.gridworld.actor.Bug;
public class SpiralBug extends Bug {
	private int size = 0;
	private int steps = 0;
	public SpiralBug(int startSize){
		size = startSize;
	}
	public void act(){
		if (steps < size && canMove()) {
		    move();
		    steps++;
		}
		else {
		    turn();
		    turn();
		    steps = 0;
		    size++;
		}
	}
}
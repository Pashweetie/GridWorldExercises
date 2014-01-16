import info.gridworld.actor.Bug;
public class ZBug extends Bug {
	private int size = 0;
	private int steps = 0;
	private int times = 0;
	public ZBug(int zLength){
		size = zLength;
		turn();
		turn();
	}
	public void act(){
		if(times < 3){
			if (steps < size && canMove()) {
				move();
				steps++;
			}else if(times == 1 && steps >= size && canMove()){
				turn();
				turn();
				turn();
				turn();
				turn();
				times++;
				steps = 0;
			}else{
				turn();
				turn();
				turn();
				times++;
				steps = 0;
			}			
		}		
	}
}
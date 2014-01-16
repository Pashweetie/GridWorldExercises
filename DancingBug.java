import info.gridworld.actor.Bug;
import java.util.ArrayList;
public class DancingBug extends Bug {
	private int turns = 0;
	private int step = 0;
	private int[] dance;
	public DancingBug(int[] dance){	
		this.dance = dance;
	}
	public void act(){
		if(step<dance.length){
			turn(dance[step]);
			move();
			step++;
		}else if(step>=dance.length){
			step = 0;
		}else{
			super.act();
		}
	}
	public void turn(int times){
		for (int i =0; i<times; i++ ) {
			turn();
		}
	}
}
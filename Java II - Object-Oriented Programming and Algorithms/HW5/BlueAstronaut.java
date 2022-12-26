import java.util.*;
public class BlueAstronaut extends Player implements Crewmate{
	private int numTasks;
	private int taskSpeed;



	public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed){
		super(name, susLevel);
		this.numTasks = numTasks;
		this.taskSpeed = taskSpeed;
	}

	public BlueAstronaut(String name) {
		super(name, 15);
		this.numTasks = 6;
		this.taskSpeed = 10;
	}



	@Override
	public void emergencyMeeting() {
        if (!this.isFrozen()) {
            Player[] pl = Player.getPlayers();
            Arrays.sort(pl);
            int i = pl.length - 1;
            for (; i > 0; i--) {
                if (pl[i].getSusLevel() != pl[i - 1].getSusLevel() && pl[i] != this) {
                    if (!pl[i].isFrozen()) {
                        pl[i].setFrozen(true);
                        break;
                    }
                } else if (pl[i].getSusLevel() == pl[i - 1].getSusLevel() && !pl[i].isFrozen() && !pl[i - 1].isFrozen())
                    return;
            }
            if (i == 0 && !pl[0].isFrozen() && pl[0] != this)
                pl[0].setFrozen(true);
            this.gameOver();
        }
    }
	
	@Override
	public void completeTask(){
		

			if(this.isFrozen() == false) {
				if(this.taskSpeed > 20) {
					this.setnumTasks(this.getnumTasks() - 2);
						if(this.getnumTasks() < 0){
							this.setnumTasks(0);
							System.out.println("I have completed all my tasks");
							this.setSusLevel(this.getSusLevel()*1/2);
						}
				}
				else{
					this.setnumTasks(getnumTasks() - 1);
						if(this.getnumTasks() < 0){
							this.setnumTasks(0);
							System.out.println("I have completed all my tasks");
							this.setSusLevel(this.getSusLevel()*1/2);
						}
				}
				
			}
			else{return;}
	}

	public boolean equals(Object o) {
        if (o instanceof BlueAstronaut) {
            BlueAstronaut blueastro = (BlueAstronaut) o;
            return this.getName().equals(blueastro.getName()) && this.isFrozen() == blueastro.isFrozen()
                    && this.getSusLevel() == blueastro.getSusLevel();
        }
        return false;
    }

    
	public String toString() {
        if (this.getSusLevel() > 15)
            return (super.toString() + " I have " + this.numTasks + " left over.").toUpperCase();
        return super.toString() + " I have " + this.numTasks + " left over.";
    }

	public int getnumTasks(){
		return this.numTasks;
	}

	public void setnumTasks(int numTasks){
		this.numTasks = numTasks;
	}

	
}
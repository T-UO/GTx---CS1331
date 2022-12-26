import java.util.*;
public class RedAstronaut extends Player implements Impostor{


	private int default_susLevel;
	private String default_skill;

	private String skill;


	public RedAstronaut(String name, int susLevel, String skill) {
		super(name, susLevel);
		// setName(name);
		// setSusLevel(susLevel);
		this.skill = skill;
	}

	public RedAstronaut(String name) {
		super(name, 15);
		skill = "experienced";
	}

	@Override
	public void freeze(Player p) {
		
		if(p instanceof Impostor){
			return;
		}
		else if(this instanceof Impostor && this.isFrozen() == true){
			return;
		}
		else if(p.isFrozen() == true){
			return;
		}
		else if(this.getSusLevel() < p.getSusLevel()){
			p.setFrozen(true);
		}
		else{
			this.setSusLevel(getSusLevel()*2);
		}


		// if(p instanceof Impostor == true && this.isFrozen() == true && p.isFrozen() == true){
		// 	return;
		// }
		// else{
		// 	if(this.getSusLevel() < p.getSusLevel()){
		// 		p.setFrozen(true);
		// 	}
		// 	else{
		// 		this.setSusLevel(this.getSusLevel()*2);
		// 	}
		// }

		gameOver();
	}

	@Override
	public void sabotage(Player p) {
		
				if(p instanceof Impostor != true && p.isFrozen() == false && this.isFrozen() == false && this.getSusLevel() < 20) {
					
						p.setSusLevel(p.getSusLevel()*3/2);
					}
					else if (p instanceof Impostor != true && p.isFrozen() == false && this.isFrozen() == false && this.getSusLevel() > 20) {
						p.setSusLevel(p.getSusLevel()*5/4);
						}
						else{
									
							System.out.println("It is not possible to sabotage another Impostor, and an Impostor that is frozen cannot sabotaged.");
						}
		
	}

	
	public boolean equals(Object o) {
        if (o instanceof RedAstronaut) {
            RedAstronaut redastro = (RedAstronaut) o;
            return this.getName().equals(redastro.getName()) && this.isFrozen() == redastro.isFrozen()
                    && this.getSusLevel() == redastro.getSusLevel();
        }
        return false;
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

	
	public String toString() {
       if (this.getSusLevel() > 15)
            return (super.toString() + " I am an " + this.skill + " player!").toUpperCase();
        return super.toString() + " I am an " + this.skill + " player!";
    }

    public void emergencyMeetingTest(){
    	if(this.isFrozen() == false){
    		Player[] unfrozen_players = getPlayers();
    		Arrays.sort(unfrozen_players);
    	}
    }

}
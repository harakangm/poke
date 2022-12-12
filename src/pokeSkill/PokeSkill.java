package pokeSkill;

import java.util.ArrayList;

import PokemonInter.Poke;
import trainer.Trainer;

public class PokeSkill {
	private String skillName;
	private int hitRate;
	private int damage;
	
	
	public void skillRun(Trainer t) {
	
		int hit = (int)((Math.random() * 100) + 1);
		
		if(hit <= hitRate) {
			t.getHavPoke();
		}else {
			
		}
		
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getHitRate() {
		return hitRate;
	}

	public void setHitRate(int hitRate) {
		this.hitRate = hitRate;
	}
	
	
}

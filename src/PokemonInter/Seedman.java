package PokemonInter;

import pokeSkill.PokeSkill;

public class Seedman extends Poke{

	public Seedman(String subname) {
		setName("이상해씨");
		setHp(50);
		super.setPokesubName(subname);
	}

	@Override
	public void plusHp() {
		int LvHp = getHp() + 10;
		setHp(LvHp);	
	}

	@Override
	public void addSkill(PokeSkill skill) {
		super.skill.add(skill);		
	}

}

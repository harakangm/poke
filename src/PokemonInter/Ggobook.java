package PokemonInter;

import pokeSkill.PokeSkill;

public class Ggobook extends Poke{

	public Ggobook(String subname) {
		setName("꼬북이");
		setHp(45);
		super.setPokesubName(subname);
	}

	@Override
	public void plusHp() {
		int LvHp = getHp() + 8;
		setHp(LvHp);		
	}

	@Override
	public void addSkill(PokeSkill skill) {
		super.skill.add(skill);
		
	}

}

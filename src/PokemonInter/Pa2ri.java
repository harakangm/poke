package PokemonInter;

import pokeSkill.PokeSkill;

public class Pa2ri extends Poke{

	public Pa2ri(String pokeName) {
		setName("파이리");
		setHp(47);
		super.setPokesubName(pokeName);
	}

	@Override
	public void plusHp() {
		int LvHp = getHp() + 9;
		setHp(LvHp);	
	}

	@Override
	public void addSkill(PokeSkill skill) {
		super.skill.add(skill);
	}

}

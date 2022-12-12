package trainer;

import java.util.*;


import PokemonInter.Poke;

public class Trainer {
	private ArrayList<Poke> havPoke = new ArrayList<>();
	private String TrainerName;
	StringBuilder builder = new StringBuilder();
	
	public Trainer(String TrainerName) {
		this.TrainerName = TrainerName;
	}
	
	//배열에 포켓몬추가
	public void addpokemon(Poke poke) {
		if(havPoke.size() <= 6) {
			havPoke.add(poke);
		}else {
			System.out.println("현재 소유 포켓몬이 6마리 입니다.");
		}
	}
	
	//현재 소유 중인 포켓몬을 보여줌
	public String showAllPoke() {
	
		for (Poke poke : havPoke) {
			builder.append(" | ");
			builder.append(poke.getPokeName() + " 별명 : " + poke.getPokesubName());
			builder.append(" | " + "\n");
		}
		
		return builder.toString();
	}
	
	//스트링빌더 초기화
	public void resetbuilder() {
		builder.setLength(0);
	}

	public ArrayList<Poke> getHavPoke() {
		return havPoke;
	}

	public String getTrainerName() {
		return TrainerName;
	}
	
	


	
	
}

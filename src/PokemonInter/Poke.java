package PokemonInter;

import java.util.ArrayList;
import java.util.HashMap;

import pokeSkill.PokeSkill;
import 상수.Constant;

public abstract class Poke {
	private String pokeName;
	private String pokesubName;
	private int pokeLv;
	private int currentHp;
	//현재 경험치
	private int exp;
	ArrayList<PokeSkill> skill = new ArrayList<>();
	StringBuilder bulider = new StringBuilder();
	
	//종료후 경험치 체크
	public void checkExp() {
		if (Constant.LVEXP == exp) {
			levelUp();
		}else {
			exp += 10;
		}
	}
	
	
	//레벨업
	public void levelUp() {	
		pokeLv++;
		plusHp();
	}
	
	//스킬 배우기
	public void learnSk(PokeSkill sk) {
		skill.add(sk);
	}
	
	//가지고 있는 모든 기술 출력
	public String showAllSkill() {
		bulider.append(pokeName);
		for(PokeSkill pokeskill : skill) {
			//기술명중률이 인트라서
			String changenum = Integer.toString(pokeskill.getHitRate());
			bulider.append(" \n ");
			bulider.append(" | ");
			bulider.append(pokeskill.getSkillName());
			bulider.append(" | ");
			bulider.append("명중률 : " + changenum);
		}
		
		return bulider.toString();
	}
	
	
	//레벨업시에 추가되는 체력
	public abstract void plusHp();
	//현재 스킬을 키값(기술명) 나머지정보(배열)의 형식으로 저장해줌
	public abstract void addSkill(PokeSkill skill);	
	
	
	
	
	public void setName(String pokeName) {
		this.pokeName = pokeName; 
	}
	
	public void setHp(int currentHp) {
		this.currentHp = currentHp;
	}
	
	public int getHp() {
		return currentHp;
	}


	public String getPokeName() {
		return pokeName;
	}


	public String getPokesubName() {
		return pokesubName;
	}


	public void setPokesubName(String pokesubName) {
		this.pokesubName = pokesubName;
	}


	public int getExp() {
		return exp;
	}


	
	
	
}

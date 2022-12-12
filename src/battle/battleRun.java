package battle;

import java.util.*;
import PokemonInter.*;
import pokeSkill.*;
import trainer.Trainer;

public class battleRun {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Trainer> tINFO = new ArrayList<Trainer>();
	
	public static void main(String[] args) {
		
	
		while(true) {
			createTrainer ();
			
			showTrainer();				
		}
	
		
	}
	//트레이너 생성
	public static void createTrainer () {
		System.out.println("트레이너 이름 입력하세요");
		String put = sc.next();
		Trainer trainer = new Trainer(put);

		
		boolean check = true;
		while (check) {
			try {
				System.out.println("스타팅 포켓몬을 선택 하세요");
				System.out.println("1.파이리 | 2.꼬북이 | 3.이상해씨");
				int put2 = sc.nextInt();
				System.out.println("포켓몬의 별명을 정해주세요");
				String put3 = sc.next();
				if(creatStartingPoke(put2,put3) != null) {
					trainer.addpokemon(creatStartingPoke(put2,put3));
					//리스트에 추가
					tINFO.add(trainer);
				}
				check = false;
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력해주세요");
				sc.nextLine();
			}
			
		}

	}
	
	//트레이너의 정보와 소유 포켓몬 보기
	public static void showTrainer() {
		for (Trainer tr : tINFO) {
			System.out.println("===================================");
			System.out.println("트레이너 명 : " + tr.getTrainerName());
			System.out.println("");
			System.out.println("==============소유중인 포켓몬===============");
			System.out.println(tr.showAllPoke());
			System.out.println("");
			System.out.println("");
			tr.resetbuilder();
		}
	}
	
	//스타팅 포켓몬 생성
	static Poke creatStartingPoke(int put2,String name){
		Poke crPoke = null;
			if (put2 < 4 && put2 > 0) {
				if(put2 == 1) {
					crPoke = new Pa2ri(name);
				}else if(put2 == 2) {
					crPoke = new Ggobook(name);
				}else {
					crPoke = new Seedman(name);
				}
			} else {
				System.out.println("세마리 중에서 선택 해주세요");
				
			}	
	
		return crPoke;
	}
	
	
}

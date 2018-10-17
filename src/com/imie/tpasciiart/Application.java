package com.imie.tpasciiart;

import com.imie.tpasciiart.alphabets.MonAlphabet;
import com.imie.tpasciiart.alphabets.VotreAlphabet;
import com.imie.tpasciiart.manager.AsciiManager;
import com.imie.tpasciiart.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] message;
		VotreAlphabet alphabet = new VotreAlphabet();
		MonAlphabet mon_alphabet = new MonAlphabet();
		AsciiManager manager = new AsciiManager(alphabet);
		AsciiManager manager_alpha = new AsciiManager(mon_alphabet);
		System.out.println("Quel message veux-tu voir ?");
		String to_show = ScannerProvider.getInstance().getScanner().nextLine();
		message = manager.getAsciiTranslation(to_show);
		for(int i = 0; i < alphabet.getH(); i++){
			System.out.println(message[i]);
		}
		message = manager_alpha.getAsciiTranslation(to_show);
		for(int i = 0; i < mon_alphabet.getH(); i++){
			System.out.println(message[i]);
		}	
	}

}

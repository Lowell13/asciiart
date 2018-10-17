package com.imie.tpasciiart;

import com.imie.tpasciiart.alphabets.VotreAlphabet;
import com.imie.tpasciiart.manager.AsciiManager;
import com.imie.tpasciiart.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] message;
		VotreAlphabet alphabet = new VotreAlphabet();
		AsciiManager manager = new AsciiManager(alphabet);
		message = manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		for(int i = 0; i < 5; i++){
			System.out.println(message[i]);
		}
			
	}

}

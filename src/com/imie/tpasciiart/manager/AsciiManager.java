package com.imie.tpasciiart.manager;

import com.imie.tpasciiart.alphabets.DefaultAlphabet;

public class AsciiManager {
	
	private DefaultAlphabet alphabet;
	
	public String[] getAsciiTranslation(String message)
	{
        int w = alphabet.getW();
        int h = alphabet.getH();
        String T = message;

        char tabT[] = T.toCharArray();
        int sizeT = T.length();
        
        String[] to_show = new String[h];
        
        for (int i = 0; i < h; i++) {
            String ROW = alphabet.getDatas()[i];
            to_show[i] = new String();

                for (int k = 0; k < sizeT; k++)
                {
                    if (tabT[k] >= 'a' && tabT[k] <= 'z')
                    {
                        to_show[i] += (ROW.substring(((tabT[k] - 'a') * w), ((tabT[k] - 'a') * w + w)));
                    }
                    else if (tabT[k] >= 'A' && tabT[k] <= 'Z')
                    {
                        to_show[i] += (ROW.substring(((tabT[k] - 'A') * w), ((tabT[k] - 'A') * w + w)));
                    }
                    else
                        to_show[i] += (ROW.substring((26 * w), (26 * w + w)));
                }
        }
        return to_show;
	}
	
	public AsciiManager(DefaultAlphabet alphabet)
	{
		this.alphabet = alphabet;
	}
	
}

// alt Shift S pour le raccourci pour les getteurs et setteurs
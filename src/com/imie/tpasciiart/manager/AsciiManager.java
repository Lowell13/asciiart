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
                    if (tabT[k] >= 65 && tabT[k] <= 90)
                    {
                        to_show[i] += (ROW.substring(((tabT[k] - 65) * w), ((tabT[k] - 65) * w + w)));
                    }
                    else if (tabT[k] >= 97 && tabT[k] <= 122)
                    {
                        to_show[i] += (ROW.substring(((tabT[k] - 97) * w), ((tabT[k] - 97) * w + w)));
                    }
                    else
                        to_show[i] += (ROW.substring((26 * w), (26 * w + w)));
                }
                //to_show[i] += "\n";
        }
        return to_show;
	}
	
	public AsciiManager(DefaultAlphabet alphabet)
	{
		this.alphabet = alphabet;
	}
	
}

// alt Shift S pour le raccourci pour les getteurs et setteurs
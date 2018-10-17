package com.imie.tpasciiart.alphabets;

public abstract class DefaultAlphabet {
	private int w;
	private int h;
	private String datas[];
	
	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public String[] getDatas() {
		return datas;
	}

	public DefaultAlphabet(int h, int w, String datas[])
	{
		this.h = h;
		this.w = w;
		this.datas = datas;
	}
}

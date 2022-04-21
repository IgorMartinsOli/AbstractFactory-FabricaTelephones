package com.mycompany.fabricasmartphones;

public class FabricaApple implements FabricaSmartPhones  {

	@Override
	public phoneIntermediario criarPhoneHumilde() {
		// TODO Auto-generated method stub
		return new IPhoneSE();
	}

	@Override
	public phoneTopdeLinha criarPhonedeRico() {
		// TODO Auto-generated method stub
		return  new iPhoneXSMAX();
	}
	
	

}

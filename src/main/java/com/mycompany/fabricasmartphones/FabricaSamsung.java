package com.mycompany.fabricasmartphones;

public class FabricaSamsung implements FabricaSmartPhones{

	@Override
	public phoneIntermediario criarPhoneHumilde() {
		// TODO Auto-generated method stub
		return  new GalaxyGranPrime();
	}

	@Override
	public phoneTopdeLinha criarPhonedeRico() {
		// TODO Auto-generated method stub
		return new GalaxyS10();
	}
	
			

}

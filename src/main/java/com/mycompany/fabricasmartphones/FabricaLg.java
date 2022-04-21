package com.mycompany.fabricasmartphones;

public class FabricaLg implements FabricaSmartPhones {

	@Override
	public phoneIntermediario criarPhoneHumilde() {
		// TODO Auto-generated method stub
		return new k10();
	}

	@Override
	public phoneTopdeLinha criarPhonedeRico() {
		// TODO Auto-generated method stub
		return new Q6();
	}
}

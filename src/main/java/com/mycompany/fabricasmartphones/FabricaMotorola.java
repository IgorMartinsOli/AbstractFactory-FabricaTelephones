package com.mycompany.fabricasmartphones;

public class FabricaMotorola implements FabricaSmartPhones{

	@Override
	public phoneIntermediario criarPhoneHumilde() {
		// TODO Auto-generated method stub
		return new MotoC();
	}

	@Override
	public phoneTopdeLinha criarPhonedeRico() {
		// TODO Auto-generated method stub
		return new MotoZ3();
	}
	

}

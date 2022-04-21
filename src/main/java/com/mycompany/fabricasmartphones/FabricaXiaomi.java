package com.mycompany.fabricasmartphones;

public class FabricaXiaomi implements FabricaSmartPhones {

	@Override
	public phoneIntermediario criarPhoneHumilde() {
		// TODO Auto-generated method stub
		return  new XiaomiRedmi4A();
	}

	@Override
	public phoneTopdeLinha criarPhonedeRico() {
		// TODO Auto-generated method stub
		return new XiaomiRedmi6();
	}

}

package com.mycompany.fabricasmartphones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("------------------------");
//		FabricaSmartPhones fabrica = new FabricaSamsung();
//		phoneIntermediario phone1 = new GalaxyGranPrime();
//		phoneTopdeLinha phone2 = new GalaxyS10();
//		phone1.exibirInfoHumilde();
//		phone2.exibirInfoTopdeLinha();
//		System.out.println("------------------------");
		
		

		System.out.println("------------------------");
		FabricaSmartPhones fabrica2 = new FabricaApple();
		phoneIntermediario phonea = fabrica2.criarPhoneHumilde();
		phoneTopdeLinha phoneb = fabrica2.criarPhonedeRico();
		phonea.exibirInfoHumilde();
		phoneb.exibirInfoTopdeLinha();
		
		System.out.println("------------------------");
		FabricaSmartPhones fabrica3 = new FabricaSamsung();
		phoneIntermediario phones = fabrica3.criarPhoneHumilde();
		phoneTopdeLinha phonesb = fabrica3.criarPhonedeRico();
		phones.exibirInfoHumilde();
		phonesb.exibirInfoTopdeLinha();
		
		System.out.println("------------------------");
		FabricaSmartPhones fabrica4 = new FabricaMotorola();
		phoneIntermediario phonem = fabrica4.criarPhoneHumilde();
		phoneTopdeLinha phonemb = fabrica4.criarPhonedeRico();
		phonem.exibirInfoHumilde();
		phonemb.exibirInfoTopdeLinha();
		
		System.out.println("------------------------");
		
		FabricaSmartPhones fabrica5 = new FabricaLg();
		phoneIntermediario phonel = fabrica5.criarPhoneHumilde();
		phoneTopdeLinha phonelb = fabrica5.criarPhonedeRico();
		phonel.exibirInfoHumilde();
		phonelb.exibirInfoTopdeLinha();
		
		
		System.out.println("------------------------");
		
		FabricaSmartPhones fab6 = new FabricaXiaomi();
		phoneIntermediario phonee6 = fab6.criarPhoneHumilde();
		phoneTopdeLinha phonexx = fab6.criarPhonedeRico();
		phonee6.exibirInfoHumilde();
		phonexx.exibirInfoTopdeLinha();
		
	}

}

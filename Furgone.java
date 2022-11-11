package com.adecco.veicolo;

public class Furgone extends VeicoloAMotore {
	
	private int capCarico;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FURGONE"+super.toString()+"CARICO MAX"+this.capCarico;
	}
	
	
	
	
	
	public Furgone() {
		this(200);
	}
	public Furgone(int capcarico) {
		setCapCarico(capcarico);
	}


	@Override
	public int getAnMatr() {
		// TODO Auto-generated method stub
		return super.getAnMatr();
	}
	@Override
	public void setAnMatr(int anMatr) {
		// TODO Auto-generated method stub
		super.setAnMatr(anMatr);
	}
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}
	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}
	@Override
	public String getTipoAlim() {
		// TODO Auto-generated method stub
		return super.getTipoAlim();
	}
	@Override
	public void setTipoAlim(String tipoAlim) {
		// TODO Auto-generated method stub
		super.setTipoAlim(tipoAlim);
	}
	@Override
	public int getCilindrata() {
		// TODO Auto-generated method stub
		return super.getCilindrata();
	}
	@Override
	public void setCilindrata(int cilindrata) {
		// TODO Auto-generated method stub
		super.setCilindrata(cilindrata);
		
	}
	//--.CAPCARICO
	public int getCapCarico() {
		return capCarico;
	}
	public void setCapCarico(int capCarico) {
		// dichiariamo che la capacità di carico e 1000 o inferiore di 1000
		this.capCarico = capCarico <= 1000? capCarico: 1000;
		
	
	}

}

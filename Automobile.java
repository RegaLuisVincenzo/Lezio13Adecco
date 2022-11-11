package com.adecco.veicolo;

public class Automobile extends VeicoloAMotore {
	
	
	private  int numPorte;

	
	
//---------------------------------
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+numPorte+"int numPorte";
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
//---------------------------------
	public Automobile() {
		this(5);
	}
	
	public Automobile(int numPorte) {
		
		setNumPorte(numPorte);
	}
	
//-----------------------------------
	
	//---get--set
	int getNumPorte() {
		return numPorte;
	}
	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
		
		if (numPorte==  5 || numPorte == 3)
			this.numPorte = numPorte;
		else
			numPorte = 5;
	}
	
	

}

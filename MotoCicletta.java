package com.adecco.veicolo;

public class MotoCicletta  extends VeicoloAMotore{
	
	private String tipologia;
	
	private int numTemMot;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+tipologia+"String tipologia"+numTemMot+"int numTemMot";
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
	
	
	public MotoCicletta() {
		this("kawasaki", 4);
	}
	public MotoCicletta(String tipologia, int numTemMot) {
		setTipologia(tipologia);
		setNumTemMot(numTemMot);
		
	}
	
//----------------------------------	


	//---TIPOLOGIA	
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
//---NUMTEMMOT 	
	public int getNumTemMot() {
		return numTemMot;
	}
	public void setNumTemMot(int numTemMot) {
		this.numTemMot = numTemMot;
	}

}

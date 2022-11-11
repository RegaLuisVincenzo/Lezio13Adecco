package com.adecco.veicolo;


public class VeicoloAMotore  {

	private int anMatr;

	private String marca;
	
	private String tipoAlim;

	private int cilindrata;
	
	
	public VeicoloAMotore() {
		this(2015,"ford","benzina",350);
	}
	
	private VeicoloAMotore(int anMAtr, String marca, String tipoAlim, int cilindrata ) {
		setAnMatr(anMAtr);
		setMarca(marca);
		setTipoAlim(tipoAlim);
		setCilindrata(cilindrata);	
	}
	
	
	
	@Override
	public String toString() {
		return "VeicoloAMotore [anMatr=" + anMatr + ", marca=" + marca + ", tipoAlim=" + tipoAlim + ", cilindrata="
				+ cilindrata + "]";
	}

	//---ANMATR
	public int getAnMatr() {
		return anMatr;
	}

	public void setAnMatr(int anMatr) {
		this.anMatr = anMatr;
	}

//---MARCA

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
//---CILINDRATA

		public int getCilindrata() {
			return cilindrata;
		}

		public void setCilindrata(int cilindrata) {
			this.cilindrata = cilindrata;
		}
	
//---TIPOALIM
	public String getTipoAlim() {
		return tipoAlim;
	}
	public void setTipoAlim(String tipoAlim) {
		this.tipoAlim = tipoAlim;
		
//DICHIARIAMO CHE VOGLIAMO LA BENZINA 		
		switch (tipoAlim) {
		case "benzina":
			this.tipoAlim="benzina";
			break;
		
		case "diesel":
			this.tipoAlim="diesel";
			break;
		
		case "e-tron":
			this.tipoAlim="e-tron";
			break;
		case "metano":
			this.tipoAlim="metano";
			break;
			
		case "gps":
			this.tipoAlim="gpl";
			break;
		default:
			this.tipoAlim="benzina";
			break;
		}
	}



}

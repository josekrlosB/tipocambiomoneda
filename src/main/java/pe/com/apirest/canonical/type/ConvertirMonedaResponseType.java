package pe.com.apirest.canonical.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConvertirMonedaResponseType {

	private double monto;
	private double montoTipoCambio;
	private String monedaOrigen;
	private String monedaDestino;
	private double tipoCambio;
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getMontoTipoCambio() {
		return montoTipoCambio;
	}
	public void setMontoTipoCambio(double montoTipoCambio) {
		this.montoTipoCambio = montoTipoCambio;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	

}

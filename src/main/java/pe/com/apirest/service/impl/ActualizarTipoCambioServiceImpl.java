package pe.com.apirest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.com.apirest.canonical.request.ActualizarTipoCambioRequest;
import pe.com.apirest.canonical.response.ActualizarTipoCambioResponse;
import pe.com.apirest.canonical.type.ActualizarTipoCambioResponseType;
import pe.com.apirest.repository.entity.Conversion;
import pe.com.apirest.repository.service.ConversionService;
import pe.com.apirest.service.ActualizarTipoCambioService;

@Component
public class ActualizarTipoCambioServiceImpl implements ActualizarTipoCambioService {

	@Autowired
	private ConversionService conversionService;

	private void ini() {

		List<Conversion> lstConv = conversionService.getConversion();

		if (lstConv.size() == 0) {
			Conversion conv1 = new Conversion();
			conv1.setOrigen("PEN");
			conv1.setDestino("USD");
			conv1.setValor(3.5);

			Conversion conv2 = new Conversion();
			conv2.setOrigen("USD");
			conv2.setDestino("PEN");
			conv2.setValor(0.25);

			conversionService.saveConversion(conv1);
			conversionService.saveConversion(conv2);
		}
	}

	@Override
	public ActualizarTipoCambioResponse actualizarTipoCambio(ActualizarTipoCambioRequest request) {

		this.ini();

		ActualizarTipoCambioResponse response = new ActualizarTipoCambioResponse();
		ActualizarTipoCambioResponseType type = new ActualizarTipoCambioResponseType();

		this.actualizarValor(request.getActualizarTipoCambioRequest().getMonedaOrigen(),
				request.getActualizarTipoCambioRequest().getMonedaDestino(),
				request.getActualizarTipoCambioRequest().getMonto());
		double tipoCambio = this.obtenerValor(request.getActualizarTipoCambioRequest().getMonedaOrigen(),
				request.getActualizarTipoCambioRequest().getMonedaDestino());

		String mensaje = request.getActualizarTipoCambioRequest().getMonedaOrigen() + " -> "
				+ request.getActualizarTipoCambioRequest().getMonedaDestino() + " = " + tipoCambio;

		type.setRespuesta(mensaje);
		response.setActualizarTipoCambioResponse(type);

		return response;
	}

	private void actualizarValor(String origen, String destino, double valor) {
		List<Conversion> lstConv = conversionService.getConversion();
		for (Conversion conversion : lstConv) {
			if (conversion.getOrigen().equals(origen) && conversion.getDestino().equals(destino)) {
				Conversion conv =  new Conversion();
				conv.setValor(valor);
				conversionService.updaConversion(conv, conversion.getId());
			}
		}
	}

	private double obtenerValor(String origen, String destino) {
		List<Conversion> lstConv = conversionService.getConversion();
		double valor = 0;
		for (Conversion conversion : lstConv) {
			if (conversion.getOrigen().equals(origen) && conversion.getDestino().equals(destino)) {
				valor = conversion.getValor();
			}
		}
		return valor;
	}
}
package pe.com.apirest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.apirest.canonical.request.ConvertirMonedaRequest;
import pe.com.apirest.canonical.response.ConvertirMonedaResponse;
import pe.com.apirest.canonical.type.ConvertirMonedaResponseType;
import pe.com.apirest.repository.entity.Conversion;
import pe.com.apirest.repository.service.ConversionService;
import pe.com.apirest.service.ConvertirMonedaService;

@Component
public class ConvertirMonedaServiceImpl implements ConvertirMonedaService {

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
	public ConvertirMonedaResponse convertirMoneda(ConvertirMonedaRequest request) {

		this.ini();

		ConvertirMonedaResponse response = new ConvertirMonedaResponse();
		ConvertirMonedaResponseType type = new ConvertirMonedaResponseType();

		double tipoCambio = this.obtenerValor(request.getConvertirMonedaRequest().getMonedaOrigen(),
				request.getConvertirMonedaRequest().getMonedaDestino());

		double resultado = request.getConvertirMonedaRequest().getMonto() * tipoCambio;

		type.setMonto(request.getConvertirMonedaRequest().getMonto());
		type.setMontoTipoCambio(resultado);
		type.setMonedaOrigen(request.getConvertirMonedaRequest().getMonedaOrigen());
		type.setMonedaDestino(request.getConvertirMonedaRequest().getMonedaDestino());
		type.setTipoCambio(tipoCambio);
		response.setConvertirMonedaResponse(type);

		return response;
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
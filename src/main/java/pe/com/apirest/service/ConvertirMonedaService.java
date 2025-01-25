package pe.com.apirest.service;

import pe.com.apirest.canonical.request.ConvertirMonedaRequest;
import pe.com.apirest.canonical.response.ConvertirMonedaResponse;

public interface ConvertirMonedaService {

	ConvertirMonedaResponse convertirMoneda(ConvertirMonedaRequest request);

}

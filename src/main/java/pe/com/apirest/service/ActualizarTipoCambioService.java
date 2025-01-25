package pe.com.apirest.service;

import pe.com.apirest.canonical.request.ActualizarTipoCambioRequest;
import pe.com.apirest.canonical.response.ActualizarTipoCambioResponse;

public interface ActualizarTipoCambioService {

	ActualizarTipoCambioResponse actualizarTipoCambio(ActualizarTipoCambioRequest request);

}

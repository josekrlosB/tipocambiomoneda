package pe.com.apirest.controller;

import java.text.MessageFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;

import pe.com.apirest.canonical.request.ActualizarTipoCambioRequest;
import pe.com.apirest.canonical.request.ConvertirMonedaRequest;
import pe.com.apirest.canonical.response.ActualizarTipoCambioResponse;
import pe.com.apirest.canonical.response.ConvertirMonedaResponse;
import pe.com.apirest.common.util.Constantes;
import pe.com.apirest.service.ActualizarTipoCambioService;
import pe.com.apirest.service.ConvertirMonedaService;

@RestController
@RequestMapping(Constantes.BASE_PATH)
public class TipoCambioController {

	private static final Logger logger = LoggerFactory.getLogger(TipoCambioController.class);

	@Autowired
	private ActualizarTipoCambioService actualizarTipoCambioService;
	
	@Autowired
	private ConvertirMonedaService convertirMonedaService;


	@PostMapping(value = Constantes.PATHMETODO_convertirMoneda, consumes = Constantes.APPLICATION, produces = Constantes.APPLICATION)
	public ConvertirMonedaResponse convertirMoneda(
			@RequestBody ConvertirMonedaRequest request) throws JsonProcessingException {
		long tiempoInicio = System.currentTimeMillis();
		ConvertirMonedaResponse response = new ConvertirMonedaResponse();
		try {
			response = convertirMonedaService.convertirMoneda(request);
		} catch (Exception e) {
			logger.error(Constantes.SEPARADOR_TRES_LLAVES, Constantes.ERROR_EXCEPTION, e);
		} finally {
			logger.info(MessageFormat.format(Constantes.TIPO_TOTAL_PROCESO,
					(System.currentTimeMillis() - tiempoInicio)));
		}
		return response;
	}

	
	@PostMapping(value = Constantes.PATHMETODO_actualizarTipoCambio, consumes = Constantes.APPLICATION, produces = Constantes.APPLICATION)
	public ActualizarTipoCambioResponse actualizarTrazabilidad(
			@RequestBody ActualizarTipoCambioRequest request) throws JsonProcessingException {
		long tiempoInicio = System.currentTimeMillis();
		ActualizarTipoCambioResponse response = new ActualizarTipoCambioResponse();
		try {
			response = actualizarTipoCambioService.actualizarTipoCambio(request);
		} catch (Exception e) {
			logger.error(Constantes.SEPARADOR_TRES_LLAVES, Constantes.ERROR_EXCEPTION, e);
		} finally {
			logger.info(MessageFormat.format(Constantes.TIPO_TOTAL_PROCESO,
					(System.currentTimeMillis() - tiempoInicio)));
		}
		return response;
	}
	
}

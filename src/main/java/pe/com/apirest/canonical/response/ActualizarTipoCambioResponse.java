package pe.com.apirest.canonical.response;

import lombok.Getter;
import lombok.Setter;
import pe.com.apirest.canonical.type.ActualizarTipoCambioResponseType;

@Getter
@Setter
public class ActualizarTipoCambioResponse {
	
	private ActualizarTipoCambioResponseType actualizarTipoCambioResponse;

	public ActualizarTipoCambioResponseType getActualizarTipoCambioResponse() {
		return actualizarTipoCambioResponse;
	}

	public void setActualizarTipoCambioResponse(ActualizarTipoCambioResponseType actualizarTipoCambioResponse) {
		this.actualizarTipoCambioResponse = actualizarTipoCambioResponse;
	}

	
	
}

package pe.com.apirest.canonical.response;

import lombok.Getter;
import lombok.Setter;
import pe.com.apirest.canonical.type.ConvertirMonedaResponseType;

@Getter
@Setter
public class ConvertirMonedaResponse {
	
	private ConvertirMonedaResponseType convertirMonedaResponse;

	public ConvertirMonedaResponseType getConvertirMonedaResponse() {
		return convertirMonedaResponse;
	}

	public void setConvertirMonedaResponse(ConvertirMonedaResponseType convertirMonedaResponse) {
		this.convertirMonedaResponse = convertirMonedaResponse;
	}

	
	
}

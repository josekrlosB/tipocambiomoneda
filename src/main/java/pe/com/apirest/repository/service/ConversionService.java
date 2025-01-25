package pe.com.apirest.repository.service;

import java.util.List;

import pe.com.apirest.repository.entity.Conversion;

public interface ConversionService {
	
	public Conversion saveConversion(Conversion conversion);
	
	public List<Conversion> getConversion();
	
	public Conversion updaConversion(Conversion conversion, Long id);

}

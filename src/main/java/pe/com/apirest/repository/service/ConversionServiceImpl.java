package pe.com.apirest.repository.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.apirest.repository.dao.ConversionDao;
import pe.com.apirest.repository.entity.Conversion;

@Service
public class ConversionServiceImpl implements ConversionService {

	@Autowired
	private ConversionDao conversionDao;

	@Override
	public Conversion saveConversion(Conversion conversion) {
		return conversionDao.save(conversion);
	}
	
	@Override
	public List<Conversion> getConversion() {
		return (List<Conversion>) conversionDao.findAll();
	}
	
	@Override
	public Conversion updaConversion(Conversion conversion, Long id) {
		Conversion conList = conversionDao.findById(id).get();

		if (Objects.nonNull(conversion.getOrigen()) && !"".equalsIgnoreCase(conversion.getOrigen())) {
			conList.setOrigen(conversion.getOrigen());
		}

		if (Objects.nonNull(conversion.getDestino()) && !"".equalsIgnoreCase(conversion.getDestino())) {
			conList.setDestino(conversion.getDestino());
		}

		if (Objects.nonNull(conversion.getValor())) {
			conList.setValor(conversion.getValor());
		}

		return conversionDao.save(conList);
	}

}

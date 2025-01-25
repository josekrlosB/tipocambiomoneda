package pe.com.apirest.repository.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.apirest.repository.entity.Conversion;

@Repository
public interface ConversionDao extends CrudRepository<Conversion, Long> {

}

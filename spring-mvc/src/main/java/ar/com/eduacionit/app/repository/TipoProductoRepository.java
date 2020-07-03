package ar.com.eduacionit.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.eduacionit.app.domain.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long>{

}

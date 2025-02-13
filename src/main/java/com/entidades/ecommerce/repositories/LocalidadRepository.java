package com.entidades.ecommerce.repositories;

import com.entidades.ecommerce.domain.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long>{
    List<Localidad> findByProvinciaId(Long id);
}

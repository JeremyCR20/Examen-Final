package com.jeremy.infraccionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremy.infraccionservice.entity.Infraccion;


public interface InfraccionRepository extends JpaRepository<Infraccion, Integer> {

}

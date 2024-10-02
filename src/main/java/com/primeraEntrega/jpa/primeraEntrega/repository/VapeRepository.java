package com.primeraEntrega.jpa.primeraEntrega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.primeraEntrega.jpa.primeraEntrega.model.Vape;


@Repository
public interface VapeRepository extends JpaRepository<Vape, Long> {
}

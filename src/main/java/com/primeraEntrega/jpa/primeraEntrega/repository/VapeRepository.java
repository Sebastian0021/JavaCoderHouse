package com.primeraEntrega.jpa.primeraEntrega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.primeraEntrega.jpa.primeraEntrega.model.Vape;

// import java.util.List;

@Repository
public interface VapeRepository extends JpaRepository<Vape, Long> {


}

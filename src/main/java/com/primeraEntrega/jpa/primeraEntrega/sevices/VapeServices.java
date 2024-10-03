package com.primeraEntrega.jpa.primeraEntrega.sevices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeraEntrega.jpa.primeraEntrega.model.Vape;
import com.primeraEntrega.jpa.primeraEntrega.repository.VapeRepository;

@Service
public class VapeServices {

    @Autowired
    private VapeRepository VapeRepository;

	public void createVape(Vape vape) {
        this.VapeRepository.save(vape);
	}

	public void createVapes(List<Vape> vapes) {
        this.VapeRepository.saveAll(vapes);
	}

	public Vape getVapeById(long id) {
		return VapeRepository.findById(id).orElse(null);
	}

	public List<Vape> getVapes() {
		return VapeRepository.findAll();
	}
	
}

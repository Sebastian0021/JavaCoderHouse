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
		return VapeRepository.findById(id).orElseThrow(() -> new RuntimeException("Vape not found"));
	}

	public List<Vape> getVapes() {
		return VapeRepository.findAll();
	}

	public void updateVapeById(long id, Vape vape){
		Vape v = this.getVapeById(id);

		v.setName(vape.getName());
		v.setDescription(vape.getDescription());
		v.setPrice(vape.getPrice());
		v.setStock(vape.getStock());
		v.setBrand(vape.getBrand());
		v.setFlavor(vape.getFlavor());
		v.setPuffs(vape.getPuffs());

		VapeRepository.save(v);
	}

	public Vape deleteVapeById(long id) {
		Vape v = this.getVapeById(id);
		VapeRepository.delete(v);
		return v;
	}
	
}

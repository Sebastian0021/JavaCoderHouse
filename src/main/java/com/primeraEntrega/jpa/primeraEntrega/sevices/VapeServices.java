package com.primeraEntrega.jpa.primeraEntrega.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeraEntrega.jpa.primeraEntrega.repository.VapeRepository;

@Service
public class VapeServices {

    @Autowired
    private VapeRepository vapeRepository;

    public void findById(long id){
        vapeRepository.findById(id);
    }
}

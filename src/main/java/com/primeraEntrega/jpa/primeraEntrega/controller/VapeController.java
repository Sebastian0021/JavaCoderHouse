package com.primeraEntrega.jpa.primeraEntrega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeraEntrega.jpa.primeraEntrega.model.Vape;
import com.primeraEntrega.jpa.primeraEntrega.sevices.VapeServices;

@RestController
@RequestMapping("/vapes")
public class VapeController {

    @Autowired
    private VapeServices vapeServices;

    @GetMapping("/all")
    public List<Vape> getAllVapes() {
        return this.vapeServices.getVapes();
    }

    @PostMapping("/create")
    public ResponseEntity<?> agregarPersona(@RequestBody Vape vape) {
        this.vapeServices.createVape(vape);
        return ResponseEntity.ok(vape);
    }
}

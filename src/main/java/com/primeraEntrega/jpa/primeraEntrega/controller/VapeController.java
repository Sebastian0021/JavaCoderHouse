package com.primeraEntrega.jpa.primeraEntrega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.primeraEntrega.jpa.primeraEntrega.model.Vape;
import com.primeraEntrega.jpa.primeraEntrega.sevices.VapeServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/vapes")
public class VapeController {

    @Autowired
    private VapeServices vapeServices;

    @GetMapping("get/all")
    public List<Vape> getAllVapes() {
        return this.vapeServices.getVapes();
    }

    @GetMapping("get/{id}")
    public Vape getVapeById(@PathVariable Long id) {
        return this.vapeServices.getVapeById(id); 
    }

    @PostMapping("/create")
    public ResponseEntity<?> agregarPersona(@RequestBody Vape vape) {
        this.vapeServices.createVape(vape);
        return ResponseEntity.ok(vape);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateVape(@RequestBody Vape vape,@PathVariable Long id) {
        this.vapeServices.updateVapeById(id, vape);
        return ResponseEntity.ok(vape);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVape(@PathVariable Long id) {
        this.vapeServices.deleteVapeById(id);
        return ResponseEntity.noContent().build();
    }
    
}

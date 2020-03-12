package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CupomController {
    @Autowired
    CupomService cupomService;

    @GetMapping("/cupom")
    public ResponseEntity findByIdAndDtVenda(Cupom cupom){
        return ResponseEntity.ok().body(cupomService.findByIdAndDtVenda(cupom.getIdCupom(),cupom.getDtVenda()));
    }

    @PostMapping("/cupom")
    public ResponseEntity save(@RequestBody Cupom cupom){
        return ResponseEntity.ok().body(cupomService.save(cupom));
    }
}

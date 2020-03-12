package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;

@Service("CupomService")
public class CupomService {

    @Autowired
    private CupomRepository cumpoRepository;
    public ResponseEntity findByIdAndDtVenda(@PathParam("idCupom") Long idCupom, @PathParam("dtVenda") String dtVenda){
        if(idCupom!=null && dtVenda !=null){
            return ResponseEntity.ok().body(cumpoRepository.findByIdCupomAndDtVenda(idCupom, dtVenda));
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity save(Cupom cupom){
        return ResponseEntity.ok().body(cumpoRepository.save(cupom));
    }
}

package br.edu.ifspcjo.ads.web2.cartorio.controller;

import br.edu.ifspcjo.ads.web2.cartorio.domain.model.Cidadao;
import br.edu.ifspcjo.ads.web2.cartorio.domain.service.CidadaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

    @Autowired
    private CidadaoService service;

    @GetMapping
    public ResponseEntity<List<Cidadao>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Cidadao> criar(@Valid @RequestBody Cidadao cidadao) {
        return ResponseEntity.ok(service.salvar(cidadao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidadao> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cidadao> atualizar(@PathVariable Long id, @Valid @RequestBody Cidadao cidadao) {
        if (!service.existePorId(id)) {
            return ResponseEntity.notFound().build();
        }
        cidadao.setId(id);
        return ResponseEntity.ok(service.salvar(cidadao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!service.existePorId(id)) {
            return ResponseEntity.notFound().build();
        }
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

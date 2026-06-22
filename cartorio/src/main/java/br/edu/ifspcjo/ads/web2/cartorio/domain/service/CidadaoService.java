package br.edu.ifspcjo.ads.web2.cartorio.domain.service;

import br.edu.ifspcjo.ads.web2.cartorio.domain.repository.CidadaoRepository;
import br.edu.ifspcjo.ads.web2.cartorio.domain.model.Cidadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CidadaoService {

    @Autowired
    private CidadaoRepository repository;

    public List<Cidadao> listarTodos() {
        return repository.findAll();
    }

    public Cidadao salvar(Cidadao cidadao) {
        return repository.save(cidadao);
    }

    public Optional<Cidadao> buscarPorId(Long id) {
    return repository.findById(id);
    }

    public boolean existePorId(Long id) {
    return repository.existsById(id);
    }

    public void excluir(Long id) {
    repository.deleteById(id);
    }
}
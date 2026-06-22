package br.edu.ifspcjo.ads.web2.cartorio.domain.repository;

import br.edu.ifspcjo.ads.web2.cartorio.domain.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}
package br.edu.ifspcjo.ads.web2.cartorio.domain.repository;

// O caminho correto agora inclui "domain" antes de "repository"
import br.edu.ifspcjo.ads.web2.cartorio.domain.model.Cidadao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {
}
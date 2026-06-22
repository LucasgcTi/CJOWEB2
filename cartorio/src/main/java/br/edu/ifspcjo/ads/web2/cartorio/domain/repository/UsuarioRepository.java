package br.edu.ifspcjo.ads.web2.cartorio.domain.repository;

import br.edu.ifspcjo.ads.web2.cartorio.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
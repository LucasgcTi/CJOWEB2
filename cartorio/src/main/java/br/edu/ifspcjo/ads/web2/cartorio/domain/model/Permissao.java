package br.edu.ifspcjo.ads.web2.cartorio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_permissao")
@Data
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;
}
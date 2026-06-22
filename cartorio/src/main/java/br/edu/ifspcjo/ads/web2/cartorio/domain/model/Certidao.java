package br.edu.ifspcjo.ads.web2.cartorio.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "tb_certidao")
@Data
public class Certidao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo; // Nascimento, Casamento, Óbito

    private LocalDate dataEmissao;

    @ManyToOne
    @JoinColumn(name = "cidadao_id")
    private Cidadao cidadao;
}
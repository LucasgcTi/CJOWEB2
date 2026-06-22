package br.edu.ifspcjo.ads.web2.cartorio.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank; // Import necessário
import org.hibernate.validator.constraints.br.CPF; // Import necessário
import lombok.Data;

@Entity
@Table(name = "tb_cidadao")
@Data
public class Cidadao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Column(nullable = false, unique = true)
    @CPF(message = "CPF inválido")
    private String cpf;
}
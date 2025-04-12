package com.example.SmartAcademy.models.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private String telefone;

    private String email;

    @ManyToOne
    @JoinColumn(name = "plano_id")
    private Plano plano;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Treino> treinos;

    @ManyToMany(mappedBy = "clientes")
    private List<Aula> aulas;

    // Getters e Setters

    // toString(), equals() e hashCode() se quiser
}

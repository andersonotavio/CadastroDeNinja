package com.otavioweb.cadastroDeNinja.Missoes;

import com.otavioweb.cadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Uma missão pode ter muitos ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}

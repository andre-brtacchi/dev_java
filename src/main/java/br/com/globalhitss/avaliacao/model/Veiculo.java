package br.com.globalhitss.avaliacao.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;


@Entity
@Table
@Getter
@Setter
public class Veiculo implements Serializable {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,length = 10)
    private BigInteger id;


    @Column(length = 30)
    private String modelo;

    @Column(length = 10)
    private String placa;
}

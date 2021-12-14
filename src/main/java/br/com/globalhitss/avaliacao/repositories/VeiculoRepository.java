package br.com.globalhitss.avaliacao.repositories;

import br.com.globalhitss.avaliacao.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigInteger;

public interface VeiculoRepository extends JpaRepository<Veiculo, BigInteger> {
}

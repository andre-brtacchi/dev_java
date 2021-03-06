package br.com.globalhitss.avaliacao.controller;

import br.com.globalhitss.avaliacao.model.Veiculo;
import br.com.globalhitss.avaliacao.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class VeiculoController {
    @Autowired
    private VeiculoRepository repository;

    @GetMapping(path="/api/veiculos")
    public List<Veiculo> listaVeiculos(){
        return repository.findAll();
    }

    @GetMapping(path="/api/veiculo/{id}")
    public Veiculo consultarVeiculoUnico(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }

    @PostMapping(path = "/api/veiculo/salvar")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    @DeleteMapping("/api/veiculo")
    public void deletaVeiculo(@RequestBody Veiculo veiculo){
        repository.delete(veiculo);
    }

    @DeleteMapping("/api/veiculo/{id}")
    public void deleteById(@PathVariable("id") Long id){
        Veiculo veiculo=consultarVeiculoUnico(id);
        repository.delete(veiculo);
    }

    @PutMapping("/api/veiculo")
    public Veiculo atualizaVeiculo(@RequestBody Veiculo veiculo){
        return repository.save(veiculo);
    }
}

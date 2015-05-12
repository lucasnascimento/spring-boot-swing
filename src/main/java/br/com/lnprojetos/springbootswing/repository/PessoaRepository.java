package br.com.lnprojetos.springbootswing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.lnprojetos.springbootswing.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
	
	List<Pessoa> findByNome(String nome);

}

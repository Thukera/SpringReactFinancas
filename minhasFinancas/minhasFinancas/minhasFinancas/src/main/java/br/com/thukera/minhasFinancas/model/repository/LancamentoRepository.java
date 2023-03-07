package br.com.thukera.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thukera.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}

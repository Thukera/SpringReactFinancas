package br.com.thukera.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thukera.minhasFinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

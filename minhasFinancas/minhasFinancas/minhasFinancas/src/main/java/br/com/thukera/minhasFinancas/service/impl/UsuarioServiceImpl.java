package br.com.thukera.minhasFinancas.service.impl;

import br.com.thukera.minhasFinancas.model.entity.Usuario;
import br.com.thukera.minhasFinancas.model.repository.UsuarioRepository;
import br.com.thukera.minhasFinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

		private UsuarioRepository repository;

		public UsuarioServiceImpl(UsuarioRepository repository) {
			super();
			this.repository = repository;
		}

		@Override
		public Usuario autenticar(String email, String senha) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Usuario salvarUsuario(Usuario usuario) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void validarEmail(String email) {
			// TODO Auto-generated method stub
			
		}
	
}

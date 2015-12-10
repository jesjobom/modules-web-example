package com.jesjobom.base.manager;

import com.jesjobom.base.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Implementação base do gerenciamento de usuários
 *
 * @author Jairton Junior
 */
@Component
public class UsuarioManagerBaseImpl implements UsuarioManager {

	@Override
	public List<Usuario> buscarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario(1, "Manuel da Padaria", "UsuarioManagerBaseImpl", true));
		usuarios.add(new Usuario(2, "Carlos do Táxi", "UsuarioManagerBaseImpl", false));
		usuarios.add(new Usuario(3, "Antonieta do Butiquim", "UsuarioManagerBaseImpl", true));
		
		return usuarios;
	}
}

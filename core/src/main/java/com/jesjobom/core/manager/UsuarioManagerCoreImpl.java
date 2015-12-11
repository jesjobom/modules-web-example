package com.jesjobom.core.manager;

import com.jesjobom.base.manager.UsuarioManager;
import com.jesjobom.base.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Implementação core do gerenciamento de usuários.
 * 
 * Por estar anotado com @Primary, será a implementação injetada em atributos 
 * definidos pela interface UsuarioManager.
 * 
 * @author jesjobom
 */
@Primary
@Component
public class UsuarioManagerCoreImpl implements UsuarioManager {

	@Override
	public List<Usuario> buscarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario(1, "Manuel da Padaria", "UsuarioManagerBaseImpl", true));
		usuarios.add(new Usuario(3, "Antonieta do Butiquim", "UsuarioManagerBaseImpl", true));
		
		return usuarios;
	}
}

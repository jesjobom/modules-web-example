package com.jesjobom.base.manager;

import com.jesjobom.base.model.Usuario;
import java.util.List;

/**
 * Interface para a injeção das implementações via tipo
 *
 * @author jesjobom
 */
public interface UsuarioManager {
	
	List<Usuario> buscarUsuarios();
}

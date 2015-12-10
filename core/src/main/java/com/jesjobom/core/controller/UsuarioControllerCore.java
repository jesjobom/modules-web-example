package com.jesjobom.core.controller;

import com.jesjobom.base.manager.UsuarioManager;
import com.jesjobom.base.model.Usuario;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controlador base para usuários
 *
 * @author jesjobom
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioControllerCore {
	
	@Autowired
	private UsuarioManager usuarioManager;
	
	@ResponseBody
	@RequestMapping(value = "/lista", params = "ativo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Usuario> buscarUsuariosAtivos() {
		return usuarioManager.buscarUsuarios();
	}
}

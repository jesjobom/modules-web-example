package com.jesjobom.base.controller;

import com.jesjobom.base.manager.UsuarioManagerBaseImpl;
import com.jesjobom.base.model.Usuario;
import java.util.List;
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
public class UsuarioController {
	
	@Autowired
	private UsuarioManagerBaseImpl usuarioManagerBaseImpl;
	
	@ResponseBody
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> buscarUsuarios() {
		return usuarioManagerBaseImpl.buscarUsuarios();
	}
}

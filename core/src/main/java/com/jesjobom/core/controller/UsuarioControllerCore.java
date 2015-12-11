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
 * Objetiva a demonstração da especialização de controlador (de mapeamento de 
 * requisição) e da especialização de interface injetável através de múltiplas
 * implementações.
 * 
 * @author jesjobom
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioControllerCore {
	
	/**
	 * Nesta implementação do controlador a injeção do manager é feita pela
	 * interface, ou seja, dentre as implementações disponíveis será escolhido
	 * o singleton anotado com @Primary.
	 */
	@Autowired
	private UsuarioManager usuarioManager;
	
	/**
	 * Novo mapeamento para "sobrescrever" o mapeamento original (do Base).<br/>
	 * 
	 * Não é uma sobrescrita real, pois isso não é possível em mapeamentos. 
	 * Se trata, na verdade, de um mapeamento semelhante ao original, adicionando
	 * apenas um parâmetro a mais.
	 * 
	 * Assim, caso esse novo mapeamento (/lista?ativo=true) não esteja 
	 * disponível, o mapeamento antigo ainda funcionará, pois considerará o
	 * parâmetro "ativo" como sendo opcional.
	 * 
	 * @return 
	 */
	@ResponseBody
	@RequestMapping(value = "/lista", params = "ativo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Usuario> buscarUsuariosAtivos() {
		return usuarioManager.buscarUsuarios();
	}
}

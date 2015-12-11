package com.jesjobom.base.controller;

import com.jesjobom.base.manager.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controlador para a obtenção da data atual
 *
 * @author jesjobom
 */
@Controller
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private DataManager dataManager;
	
	@ResponseBody
	@RequestMapping("/")
	public String obtemDataAtual() {
		return dataManager.obtemDataAtual();
	}
}

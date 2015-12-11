package com.jesjobom.web.manager;

import com.jesjobom.base.manager.DataManagerBaseImpl;
import java.util.Date;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Especialização do gerenciador de datas do Base. 
 * 
 * Especializa um comportamento do módulo Base através de uma mínima intervenção 
 * no Web.
 * 
 * Apenas extende a implementação existente, ou seja, não precisaria reimplementar 
 * todos os métodos da interface.
 *
 * @author jesjobom
 */
@Primary
@Component
public class DataManagerWebImpl extends DataManagerBaseImpl {

	@Override
	public String obtemDataAtual() {
		return formataHora(new Date(), DATA_HORA_PATTERN);
	}
}

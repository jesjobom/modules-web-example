package com.jesjobom.base.manager;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * Implementação do manager para operações em datas.
 *
 * @author jesjobom
 */
@Component
public class DataManagerBaseImpl implements DataManager {

	protected final String DATA_PATTERN = "dd/MM/yyyy";
	
	protected final String DATA_HORA_PATTERN = "dd/MM/yyyy HH:mm";
	
	protected String formataHora(Date data, String pattern) {
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		return formater.format(data);
	}
	
	@Override
	public String obtemDataAtual() {
		return formataHora(new Date(), DATA_PATTERN);
	}
}

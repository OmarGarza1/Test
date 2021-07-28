package com.test.testMav.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.testMav.controller.Data;

@RestController
@RequestMapping(path = "/rest")
public class rest {

	@GetMapping(path = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Data getData(@RequestParam(name = "msn") String message) {
		Data datos = new Data();
		datos.setCode(200);
		datos.setStatus(true);
		datos.setMensaje("Se recibio " + message);
		return datos;
	}
	
}

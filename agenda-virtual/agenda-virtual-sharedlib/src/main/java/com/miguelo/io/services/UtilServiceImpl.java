package com.miguelo.io.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Override
	public String saludo() {
		// TODO Auto-generated method stub
		return this.message;
	}

}

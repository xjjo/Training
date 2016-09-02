package com.modifier.xprotected.base;

import java.math.BigDecimal;

public class Movil {
	
	
	protected BigDecimal getCantidadPuertas(){
		return new BigDecimal(0);
	}
	
	public BigDecimal getPrecio(){
		return   getCantidadPuertas().multiply(new BigDecimal(1)); 
	}
}

package com.modifier.xprotected.extended;

import java.math.BigDecimal;

import com.modifier.xprotected.base.Movil;

public class Auto extends Movil{
	
	@Override
	protected BigDecimal getCantidadPuertas(){
		return new BigDecimal(5);
	}
	
	public BigDecimal getPrecio(){
		return   super.getPrecio().multiply(new BigDecimal(2)); 
	}
}

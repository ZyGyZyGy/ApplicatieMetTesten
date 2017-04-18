package be.vdab.entities;

import java.math.BigDecimal;

public class Rekening {

    private BigDecimal saldo = BigDecimal.ZERO;

    public void storten(BigDecimal bedrag) {
	saldo = saldo.add(bedrag);
    }

    public BigDecimal getSaldo() {
	return saldo;
    }

    
    
    
    // eerst test case + tests schrijven (met minimale implementatie in de te testen class)
    
    // public void storten(BigDecimal bedrag) { 
    // throw new UnsupportedOperationException();
    // }
    //
    // public BigDecimal getSaldo() {
    // throw new UnsupportedOperationException();
    // }

}

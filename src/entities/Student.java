package entities;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	public String checkPass() {
		
		double notaFinal = notaFinal();
		double calculo = (100*60.00)/100;
		if(notaFinal()>=calculo){
			return "PASS";
		}else {
			return "FAILED"  
			+"\n" 
			+ "MISSING " + String.format("%.2f", (calculo-notaFinal)) + " POINTS";
		}
			
	}
}

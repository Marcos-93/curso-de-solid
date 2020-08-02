package br.com.solid.srp;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new DezOuVintePorcento());
	
	private RegradeCalculo regra;

	Cargo(RegradeCalculo regra) {
		this.regra = regra;
	}
	public RegradeCalculo getRegra() {
		return regra;
	}
}

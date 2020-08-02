package br.com.solid.acoplamento_coesao;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {
	public void executa(NotaFiscal nf) {
		System.out.println(String.format("envia email da nf %d",nf.getId()));
	}
}

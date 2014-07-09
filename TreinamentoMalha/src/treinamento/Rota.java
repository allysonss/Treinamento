package treinamento;

public class Rota {

	private String local, grupamento, loteMin, validade;
	
	public Rota(String local, String grupamento, String loteMin, String validade) {
		setLocal(local);
		setGrupamento(grupamento);
		setLoteMin(loteMin);
		setValidade(validade);
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		if (local != null && local != "") {
			this.local = local;
		}
	}

	public String getGrupamento() {
		return grupamento;
	}

	public void setGrupamento(String grupamento) {
		if (grupamento != null && grupamento != "") {
			this.grupamento = grupamento;
		}
	}

	public String getLoteMin() {
		return loteMin;
	}

	public void setLoteMin(String loteMin) {
		if (loteMin != null && loteMin != "") {
			this.loteMin = loteMin;
		}
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		if (validade != null && validade != "") {
			this.validade = validade;
		}
	}
}

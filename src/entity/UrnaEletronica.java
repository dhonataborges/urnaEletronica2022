package entity;

public class UrnaEletronica {

	private String cargo;

	private Integer numeroCandidato;

	public void verificaCargo() {

		if (this.numeroCandidato.equals(22)) {
			System.out.println(" Jair Bolsonaro");

		} else if (this.numeroCandidato.equals(30)) {
			System.out.println(" Zema\n");

		} else if (this.numeroCandidato.equals(200)) {
			System.out.println(" Cleitinho\n ");

		} else if (this.numeroCandidato.equals(9090)) {
			System.out.println(" Elismar Prado\n");

		} else if (this.numeroCandidato.equals(90900)) {
			System.out.println(" Weliton Prado\n");

		} else {
			System.err.println("Número não possue candidato vinculado!");
			
		}
		
	}

	public UrnaEletronica() {

	}

	public UrnaEletronica(String cargo, Integer numeroCandidato) {
		this.cargo = cargo;
		this.numeroCandidato = numeroCandidato;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getNumeroCandidato() {
		return numeroCandidato;
	}

	public void setNumeroCandidato(Integer numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}

}

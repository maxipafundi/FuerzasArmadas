package edu.unlam.pb2;

public class Vehiculo {

	private Integer codigo;
	
	
	public Vehiculo(Integer codigo) {
		
		this.codigo = codigo;
	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())
			//return false;//
		Vehiculo other = (Vehiculo) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	


	
	
	
}

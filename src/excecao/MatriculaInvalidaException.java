package excecao;

import javax.servlet.ServletException;

public class MatriculaInvalidaException extends ServletException {

	public MatriculaInvalidaException(){
		super("A matricula informada é invalida");
	}

	public MatriculaInvalidaException(String msg){
		super(msg);
		
	}
}

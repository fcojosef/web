package excecao;
import javax.servlet.ServletException;

public class NomeInvalidoException extends ServletException{

	public NomeInvalidoException() {
		super("O nome informado é invalido");
	}
		
	public NomeInvalidoException(String msg){
		super(msg);
	}
	}


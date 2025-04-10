import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "pedro_1@gmail.com";
		String password = "123456";
		
		Pattern subtextoPadrao = Pattern.compile("[a-zA-Z0-9_#-]{1}[a-zA-Z0-9_#-]+@gmail.com");
		Pattern padraoSenha = Pattern.compile("[0-9]{6}");
		
		Matcher combina = subtextoPadrao.matcher(texto);
		Matcher combina2 = padraoSenha.matcher(password);
		
		if(combina.matches()) {
			System.out.println("Validado!");
			
		}else{
			System.out.println("Não validado!");
		}
		// git add .
		// git commit -m "Realizado ReGex"
		// git pushh -u origin main

	}

}

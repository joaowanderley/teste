import java.util.Scanner;

public class verificaSenha {

  public static void main(String[] args) {
    boolean senhainValida = true;
    String nome, senha;
    String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+()_!@#$%^&*.,?]).{6,}+$";

    do {
      Scanner scNome = new Scanner(System.in);
      Scanner scSenha = new Scanner(System.in);

      System.out.print("Digite seu nome: ");
      nome = scNome.next();

      System.out.print("Digite sua senha: ");
      senha = scSenha.next();

      if (senha.matches(regex)) {
        System.out.print("Usuario '" + nome + "' cadastrado com sucesso");
        senhainValida = false;
      } else {
        System.out.println("A senha precisa ter 6 caracteres com no minimo: \n" +
            "1 letra maiscula, \n" +
            "1 letra minuscula, \n" +
            "1 numero \n" +
            "1 caractere especial\n" +
            "Tente Novamente!");
        senhainValida = true;
      }

    } while (senhainValida);
  }
}

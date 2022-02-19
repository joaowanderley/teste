package dto;

import java.util.Scanner;

public class Usuario {
  model.Usuario usuario = new model.Usuario();
  public void cadastraUsuario() {
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
        usuario.setNome(nome);
        usuario.setSenha(senha);
        System.out.println("Usuario cadastrado: " +usuario);
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
      verificaTamanhoSenha();
    } while (senhainValida);
  }

  private void verificaTamanhoSenha() {
    char[] myChars = usuario.getSenha().toCharArray();
    for (int i=0; i<myChars.length; i++){
      if(myChars.length > 5){
        System.out.println("Senha maior que 5 caracteres");
      }
    }
  }
}

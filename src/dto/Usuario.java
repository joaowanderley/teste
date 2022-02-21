package dto;

import java.util.Scanner;
import java.util.logging.Logger;

public class Usuario {
  private boolean senhaValida = false;
  model.Usuario usuario = new model.Usuario();

  public model.Usuario cadastraUsuario() {
    do {
      Scanner scNome = new Scanner(System.in);
      Scanner scSenha = new Scanner(System.in);

      System.out.print("Digite seu nome: ");
      usuario.setNome(scNome.next());

      System.out.print("Digite sua senha: ");
      usuario.setSenha(scSenha.next());

      validarSenha();
      return usuario;
    } while (senhaValida);
  }

  private void validarSenha() {
    try {
      verificaTamanhoSenha();
      verificaSeTemNumero();
      verificaSeTemLetraMinuscula();
      verificaSeTemLetraMaiuscula();
      verificaSeTemCaractereEspecial();
      senhaValida = true;
    } catch (Exception e) {
      senhaValida = false;
    }
  }

  private void verificaTamanhoSenha() {
    String senha = usuario.getSenha();
    if (senha.length() < 5) {
      System.out.println("A senha precisa ser maior do que 6 caracteres");
    }
  }

  private boolean verificaSeTemLetraMaiuscula() {
    boolean caracterMaisculo;
    char[] caracteres = usuario.getSenha().toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
      caracterMaisculo = Character.isUpperCase(caracteres[i]);
      if (caracterMaisculo) {
        return true;
      }
    }
    System.out.println("A senha precisa ter no mínimo uma letra maiúscula");
    return false;
  }

  private boolean verificaSeTemNumero() {
    boolean caracterNumerico;
    char[] caracteres = usuario.getSenha().toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
      caracterNumerico = Character.isDigit(caracteres[i]);
      if (caracterNumerico) {
        return true;
      }
    }
    System.out.println("A senha precisa ter no mínimo um numero");
    return false;
  }

  private boolean verificaSeTemLetraMinuscula() {
    boolean caracterMinusculo;
    char[] caracteres = usuario.getSenha().toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
      caracterMinusculo = Character.isLowerCase(caracteres[i]);
      if (caracterMinusculo) {
        return true;
      }
    }
    System.out.println("A senha precisa ter no minimo uma letra minuscula");
    return false;
  }

  private boolean verificaSeTemCaractereEspecial() {
    char[] caracteresEspeciais = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
    char[] caracteres = usuario.getSenha().toCharArray();
    for (int i = 0; i < caracteres.length; i++) {
      for (int j = 0; j < caracteresEspeciais.length; j++) {
        if (caracteres[i] == caracteresEspeciais[j]) {
          return true;
        }
      }
    }
    System.out.println("A senha precisa ter no minimo um caractere especial");
    return false;
  }
}

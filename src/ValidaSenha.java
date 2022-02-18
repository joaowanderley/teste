public class ValidaSenha {
  public static void main(String[] args) {
    String senha = "Joao@123";
    String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*.,?]).{6,}+$";

    boolean senhaValida = senha.matches(regex);

    if (senhaValida) {
      System.out.print("Senha valida");
    } else {
      System.out.print("A senha precisa ter 6 caracteres com no minimo: \n" +
          "1 letra maiscula, \n" +
          "1 letra minuscula, \n" +
          "1 numero \n" +
          "1 caractere especial");
    }
  }
}

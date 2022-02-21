import dto.Usuario;

public class MainApplication {

  public static void main(String[] args) {

    Usuario usuario = new Usuario();
    usuario.cadastraUsuario();
    System.out.println(usuario.cadastraUsuario());
  }
}

/*
La contrasenia debe tener al menos 8 caracteres de largo y usar al menos una minuscula o mayuscul y un numero
no puede tener espacios
no puede tener mas de 64 caracteres
 */
public class PasswordIntermedia extends Password{

    public PasswordIntermedia() {
        super("^(?=.*[0-9])(?=.*[a-zA-Z])(?=\\S+$).{8,64}");
    }

}

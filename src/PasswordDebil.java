/*
La contrasenia debe tener al menos 6 caracteres de largo y usar al menos una minuscula o mayuscula
no puede tener espacios
no puede tener mas de 64 caracteres
 */
public class PasswordDebil extends Password{

    public PasswordDebil() {
        super("^(?=.*[a-zA-Z])(?=\\S+$).{6,64}");
    }

}

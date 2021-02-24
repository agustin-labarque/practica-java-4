/*
La contrasenia debe tener al menos 8 caracteres de largo
usar al menos una minuscula
usar al menos una mayuscula
usar un caracter especial entre "@#$%^&+="
no puede tener un espacio
no puede tener mas de 64 caracteres
 */
public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}");
    }


}

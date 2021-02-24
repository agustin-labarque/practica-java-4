public class Main {

    public static void main(String[] args){
        Password pwd = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}");
        probarPwd(pwd, "23Febde2@13");

        Password pwdFuerte = new PasswordFuerte();
        probarPwd(pwdFuerte, "23Febde2@13");
        probarPwd(pwdFuerte, "23Febde2013"); //falla, no hay caracteres especiales

        Password pwdIntermedia = new PasswordIntermedia();
        probarPwd(pwdIntermedia, "23Febde2@13");
        probarPwd(pwdIntermedia, "23febde2013");
        probarPwd(pwdIntermedia, "veintitresdefebrero"); //falla, falta un numero

        Password pwdDebil = new PasswordDebil();
        probarPwd(pwdDebil, "23Febde2@13");
        probarPwd(pwdDebil, "23febde2013");
        probarPwd(pwdDebil, "veintitresdefebrero");
    }

    private static void probarPwd(Password pwd, String pass) {
        try {
            System.out.println(pwd.setValue(pass));
        } catch (InvalidPasswordException e) {
            System.out.println("la contraseña no es lo suficiente buena");
            e.printStackTrace();
        }
    }
}

public class Password {

    private String regex;
    private String pwd;

    public Password(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public boolean setValue(String pwd) throws InvalidPasswordException {
        if(pwd.matches(regex)){
            this.pwd = pwd;
            return true;
        }else{
            throw new InvalidPasswordException();
        }
    }
}

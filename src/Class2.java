public class Class2 {

    private static final String VALID_CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";


    public static boolean allValidate (String login, String password, String confirmPassword){
        try {
            chek(login,password,confirmPassword);
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void chek (String login,
                              String password,
                              String confirmPassword) throws WrongLoginExeption,WrongPasswordExeption{
        if (!validate(login)){
            throw new WrongLoginExeption("Login is incorrect");
        } if (!validate(password)){
            throw new WrongPasswordExeption("Password is incorrect");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordExeption("confirm password is not correct");
        }
    }

    private static boolean validate(String s){
        if (s.length()>20){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}

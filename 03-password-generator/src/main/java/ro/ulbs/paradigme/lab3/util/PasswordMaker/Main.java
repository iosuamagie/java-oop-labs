import ro.ulbs.paradigme.lab3.util.PasswordMaker.PasswordMaker;

public static void main(String[] args) {
    PasswordMaker passwordMaker = PasswordMaker.getInstance("parola");
    String randomPassword = passwordMaker.getPassword();
    System.out.println("Parola este:" + randomPassword);
}

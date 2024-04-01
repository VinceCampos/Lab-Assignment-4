class LogIn{
    private static String ValidPassword = "password";
    private int logInAttempts;

    public LogIn(){
        this.logInAttempts = 0;
    }

    public void logAccess(String password) throws MaxLogAttemptsException, InvalidPasswordException{
        if (logInAttempts >= 3-1){
            throw new MaxLogAttemptsException("Maximum login attempts has been used");
        }
        if (!password.equals(ValidPassword)){
            logInAttempts++;
            throw new InvalidPasswordException("Invalid Password");
        }
        logInAttempts = 0;
        System.out.println("Login successful!");
        System.out.println("You've been logged in!");
    }
}
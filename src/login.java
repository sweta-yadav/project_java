 class login {
    private final String ID="admin123";
    private final String Password="mart9876@1234";

    public boolean aunthenticate(String id,String password){
        return id.equals(ID)&& password.equals(Password);

    }

}

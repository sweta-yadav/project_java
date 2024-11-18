 class login {
    private final String ID="admin";
    private final String Password="123";

    public boolean aunthenticate(String id,String password){
        return id.equals(ID)&& password.equals(Password);

    }

}

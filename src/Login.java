package RestoPBO;
public class Login {
    private String user;
    private String pw_user;
    private String admin;
    private String pw_admin;

    public Login() {
        this.user = "Nanda";
        this.pw_user = "Nanda123";
        this.admin = "admin";
        this.pw_admin = "admin";
    }

    public Login(String user, String pw_user, String admin, String pw_admin) {
        this.user = user;
        this.pw_user = pw_user;
        this.admin = admin;
        this.pw_admin = pw_admin;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public void setPw_user(String pw_user) {
        this.pw_user = pw_user;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    public void setPw_admin(String pw_admin) {
        this.pw_admin = pw_admin;
    }

    public String getUser() {
        return this.user;
    }

    public String getPw_user() {
        return this.pw_user;
    }

    public String getAdmin() {
        return this.admin;
    }

    public String getPw_admin() {
        return this.pw_admin;
    }
}



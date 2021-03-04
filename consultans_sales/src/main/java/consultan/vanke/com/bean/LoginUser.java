package consultan.vanke.com.bean;

public class LoginUser {
    private String username;
    private String pwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public LoginUser(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public LoginUser() {
    }
}

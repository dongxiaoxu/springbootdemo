package site.dongxiaoxu.springbootdemo.config;

public class UserInfo {

    private String userName;

    private String displayName;

    private String userId;

    public UserInfo(String userName, String displayName, String userId) {
        this.userName = userName;
        this.displayName = displayName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

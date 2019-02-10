public class ConnectSql {
    private String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
    private String userName = "root";
    private String passWord = "root";
    private String classForName = "com.mysql.jdbc.Driver";

    public String getURL() {
        return URL;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getClassForName() {
        return classForName;
    }
}

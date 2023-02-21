package clase05A;

public class UserInfo {
  private String userEmail;
  private String accessedDriveDocUrl;

  public UserInfo(String userEmail, String accessedDriveDocUrl) {
    this.userEmail = userEmail;
    this.accessedDriveDocUrl = accessedDriveDocUrl;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getAccessedDriveDocUrl() {
    return accessedDriveDocUrl;
  }

  public void setAccessedDriveDocUrl(String accessedDriveDocUrl) {
    this.accessedDriveDocUrl = accessedDriveDocUrl;
  }

  @Override
  public String toString() {
    return "UserInfo {" +
            "userEmail='" + userEmail + '\'' +
            ", accessedDriveDocUrl='" + accessedDriveDocUrl + '\'' +
            '}';
  }
}

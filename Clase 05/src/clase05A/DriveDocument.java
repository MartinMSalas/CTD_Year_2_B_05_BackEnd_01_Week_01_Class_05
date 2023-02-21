package clase05A;

import java.util.List;

public class DriveDocument {
  private int id;
  private String content;
  private String url;
  private List<String> userEmailsWithAccess;

  public DriveDocument(int id, String content, String url, List<String> userEmailsWithAccess) {
    this.id = id;
    this.content = content;
    this.url = url;
    this.userEmailsWithAccess = userEmailsWithAccess;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public List<String> getUserEmailsWithAccess() {
    return userEmailsWithAccess;
  }

  public void setUserEmailsWithAccess(List<String> userEmailsWithAccess) {
    this.userEmailsWithAccess = userEmailsWithAccess;
  }
}

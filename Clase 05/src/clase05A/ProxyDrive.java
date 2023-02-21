package clase05A;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ProxyDrive implements DocumentProvider{
  private List<UserInfo> userDocumentsList = new ArrayList<>();
  private Drive drive;

  public List<UserInfo> getUserDocumentsList() {
    return userDocumentsList;
  }

  public void setUserDocumentsList(List<UserInfo> userDocumentsList) {
    this.userDocumentsList = userDocumentsList;
  }

  public ProxyDrive(Drive drive) {
    this.drive = drive;
  }

  @Override
  public DriveDocument provideDocument(String url, String email) {
    DriveDocument response = drive.provideDocument(url,email);
    if (response != null) {
      UserInfo ui = new UserInfo(email, url);
      userDocumentsList.add(ui);
      response = drive.provideDocument(url,email);
    }
    return response;


  }
}

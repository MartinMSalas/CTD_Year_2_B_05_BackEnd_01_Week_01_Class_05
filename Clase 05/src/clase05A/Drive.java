package clase05A;

import java.util.List;

public class Drive implements DocumentProvider {

  private List<DriveDocument> driveDocuments;

  public Drive(List<DriveDocument> driveDocuments) {
    this.driveDocuments = driveDocuments;
  }

  @Override
  public DriveDocument provideDocument(String url, String email) {
    for (DriveDocument document:driveDocuments
         ) {
      if (document.getUrl() == url){
        for (String emailsWithAccess:document.getUserEmailsWithAccess()
             ) {
          if(emailsWithAccess.equals(email)){
            return document;
          }
        }
      }
    }

    return null;
  }
}

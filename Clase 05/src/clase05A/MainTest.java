package clase05A;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
Pensemos en una aplicación al estilo Google Drive, un servicio que nos trae documentos. Para acceder al mismo, debemos enviarle una url y un email. Los documentos están compuestos por una id, una url, un contenido y una lista de usuarios autorizados a verlo. Queremos registrar quiénes acceden a los documentos. ¿Cómo resolverías este problema aplicando el patrón proxy?
 */
class MainTest {

 
  @Test
  public void testProxyDriveDocumentAccessRecorded(){
    // Given

    List<String> userWithAccess = new ArrayList<>(List.of("a@a.com.ar","b@b.com.ar","c@c.com.ar"));
    DriveDocument driveDocument = new DriveDocument(01,"I am a drive document used for testing","asd.com.ar",userWithAccess);
    List<DriveDocument> driveDocuments = new ArrayList<>(List.of(driveDocument));
    Drive drive = new Drive(driveDocuments);
    ProxyDrive proxyDrive01 = new ProxyDrive(drive);

    proxyDrive01.provideDocument("asd.com.ar","a@a.com.ar");
    String expectedMessage = "UserInfo {userEmail='a@a.com.ar', accessedDriveDocUrl='asd.com.ar'}";
    // When
    String obtainedMessage = proxyDrive01.getUserDocumentsList().get(0).toString();

    // Then
    Assertions.assertEquals(expectedMessage,obtainedMessage);
  }
  @Test
  public void testFindADocument(){
    List<String> userWithAccess = new ArrayList<>(List.of("a@a.com.ar","b@b.com.ar","c@c.com.ar"));
    DriveDocument driveDocument = new DriveDocument(01,"I am a drive document used for testing","asd.com.ar",userWithAccess);
    List<DriveDocument> driveDocuments = new ArrayList<>(List.of(driveDocument));
    Drive drive = new Drive(driveDocuments);
    String expectedMessage = "I am a drive document used for testing";
    // When
    String obtainedMessage = drive.provideDocument("asd.com.ar","a@a.com.ar").getContent();
    // Then
    Assertions.assertEquals(expectedMessage,obtainedMessage);

  }
  @Test
  public void testProxyFindADocument(){
    List<String> userWithAccess = new ArrayList<>(List.of("a@a.com.ar","b@b.com.ar","c@c.com.ar"));
    DriveDocument driveDocument = new DriveDocument(01,"I am a drive document used for testing","asd.com.ar",userWithAccess);
    List<DriveDocument> driveDocuments = new ArrayList<>(List.of(driveDocument));
    Drive drive = new Drive(driveDocuments);
    String expectedMessage = "I am a drive document used for testing";
    ProxyDrive proxyDrive01 = new ProxyDrive(drive);
    // When
    String obtainedMessage =     proxyDrive01.provideDocument("asd.com.ar","a@a.com.ar").getContent();
    // Then
    Assertions.assertEquals(expectedMessage,obtainedMessage);

  }

}
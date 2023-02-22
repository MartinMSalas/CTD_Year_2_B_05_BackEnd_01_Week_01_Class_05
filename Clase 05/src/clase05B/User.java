package clase05B;
/*
//Declaración del enumeración de status

enum Status {PUBLICADO, BORRADOR,CANCELADO}

Class Main {

     Public static void main (String args[]){
     Status estado = Status.PUBLICADO;
     if (estado = Status. CANCELADO){
        //Ya declarado el enum, aquí dentro se puede escribir el código del programa
         que se necesite.
     }
  }
}

 */

public class User {
  private Type type;
  private int id;
  private DownloadService downloadService;

  public User(Type type, int id, DownloadService downloadService) {
    this.type = type;
    this.id = id;
    this.downloadService = downloadService;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public DownloadService getDownloadService() {
    return downloadService;
  }

  public void setDownloadService(DownloadService downloadService) {
    this.downloadService = downloadService;
  }
}

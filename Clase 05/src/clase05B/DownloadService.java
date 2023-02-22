package clase05B;

public class DownloadService implements Descarga{
  private Spotify spotify;

  public DownloadService(Spotify spotify) {
    this.spotify = spotify;
  }

  public Spotify getSpotify() {
    return spotify;
  }

  public void setSpotify(Spotify spotify) {
    this.spotify = spotify;
  }

  @Override
  public Song downloadSong(int idSong, Type userType) {
    Song result = null;
    if (userType == Type.Premiun){
      result = spotify.downloadSong(idSong, userType);
    }

    return result;
  }
}

package clase05B;

import java.util.List;

public class Spotify implements Descarga {

  private List<Song> songList;

  public Spotify(List<Song> songList) {
    this.songList = songList;
  }

  public List<Song> getSongList() {
    return songList;
  }

  public void setSongList(List<Song> songList) {
    this.songList = songList;
  }

  @Override
  public Song downloadSong(int idSong, Type userType) {
    Song result = null;
    if(checkUserType(userType)){
      for (Song song: songList
           ) {
        if(song.getId()== idSong){
          result = song;
        }
      }
    }

    return result;
  }
  private boolean checkUserType(Type userType){
    boolean result = false;
    if(userType == Type.Premiun)
      result = true;
    return result;
  }
}

package clase05B;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*

 */
enum Type {Free, Premiun}
class MainTest {

  @Test
  public void testUserDownloadSong(){
    // Given
    Song song01 = new Song(1,"lalala");
    Song song02 = new Song(2,"lelele");
    Song song03 = new Song(3,"lilili");
    List<Song> songList = new ArrayList<>(List.of(song01,song02,song03));
    Spotify spotify01 = new Spotify(songList);
    DownloadService downloadService01 = new DownloadService(spotify01);
    User user01 = new User(Type.Premiun,707,downloadService01);
    String expectedMessage = "lalala";
    // When
    Song obtainedSong = user01.getDownloadService().downloadSong(1, user01.getType());
    // Then
    Assertions.assertEquals(expectedMessage,obtainedSong.getContent());
  }
  @Test
  public void testUserCantDownloadSong(){
    // Given
    Song song01 = new Song(1,"lalala");
    Song song02 = new Song(2,"lelele");
    Song song03 = new Song(3,"lilili");
    List<Song> songList = new ArrayList<>(List.of(song01,song02,song03));
    Spotify spotify01 = new Spotify(songList);
    DownloadService downloadService01 = new DownloadService(spotify01);
    User user01 = new User(Type.Free,707,downloadService01);
    String expectedMessage = "lalala";
    // When
    Song obtainedSong = user01.getDownloadService().downloadSong(1, user01.getType());
    // Then
    Assertions.assertTrue(obtainedSong==null);

  }


}
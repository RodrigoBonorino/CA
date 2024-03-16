/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject2.playlistapp;

/**
 *
 * @author Rodrigo
 */
public class PlaylistApp {
    public static void main(String[] args) {
       
        MusicManager musicManager = new MusicManager();

        
        musicManager.createPlaylist("Liked Songs");
        musicManager.createPlaylist("Rock Playlist");
        musicManager.createPlaylist("Pop Playlist");

        
        Song song1 = new Song("Song 1", "Artist 1", "Rock");
        Song song2 = new Song("Song 2", "Artist 2", "Pop");
        Song song3 = new Song("Song 3", "Artist 3", "Rock");
        Song song4 = new Song("Song 4", "Artist 4", "Pop");

        Playlist likedSongsPlaylist = musicManager.getPlaylistByName("Liked Songs");
        Playlist rockPlaylist = musicManager.getPlaylistByName("Rock Playlist");
        Playlist popPlaylist = musicManager.getPlaylistByName("Pop Playlist");

        musicManager.addSongToPlaylist(song1, likedSongsPlaylist);
        musicManager.addSongToPlaylist(song2, likedSongsPlaylist);
        musicManager.addSongToPlaylist(song3, likedSongsPlaylist);
        musicManager.addSongToPlaylist(song4, likedSongsPlaylist);

        
        System.out.println("Number of songs in Liked Songs playlist: " + likedSongsPlaylist.getNumberOfSongs());
        System.out.println("Number of songs in Rock Playlist: " + rockPlaylist.getNumberOfSongs());
        System.out.println("Number of songs in Pop Playlist: " + popPlaylist.getNumberOfSongs());

        
        musicManager.removeSongFromPlaylist(song2, likedSongsPlaylist);
        System.out.println("Number of songs in Liked Songs playlist after removing a song: " + likedSongsPlaylist.getNumberOfSongs());
    }
}


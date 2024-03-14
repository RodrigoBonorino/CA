/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2.playlistapp;

/**
 *
 * @author Rodrigo
 */
import java.util.ArrayList;

public class MusicManager {
    private final ArrayList<Playlist> playlists;

    // Constructor
    public MusicManager() {
        this.playlists = new ArrayList<>();
    }

    
    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
    }

   
    public void addSongToPlaylist(Song song, Playlist playlist) {
        playlist.addSong(song);
    }

    
    public void removeSongFromPlaylist(Song song, Playlist playlist) {
        playlist.removeSong(song);
    }


    public int getNumberOfPlaylists() {
        return playlists.size();
    }

    
    public Playlist getPlaylistByName(String name){
        for(Playlist playlist : playlists){
            if (!playlist.getName().equals(name)){
            } else {
                return playlist;
            }
        }
        return null; // Return null
    }

    
}


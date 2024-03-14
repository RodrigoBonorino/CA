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

public class Playlist {
    private final String name;
    private final ArrayList<Song> songs;

    // Constructor
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Add song
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove song from playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Obtain number of songs from Playlist
    public int getNumberOfSongs() {
        return songs.size();
    }

    // Obtain all songs from playlist
    public ArrayList<Song> getAllSongs() {
        return songs;
    }

    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

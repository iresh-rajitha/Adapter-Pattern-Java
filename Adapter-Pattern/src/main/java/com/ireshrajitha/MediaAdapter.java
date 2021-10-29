package com.ireshrajitha;

import com.ireshrajitha.unknown.AdvancedMediaPlayer;
import com.ireshrajitha.unknown.Mp4Player;
import com.ireshrajitha.unknown.VLCPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String format){
        if (format.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VLCPlayer();
        }else if (format.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    public void play(String format, String filename) {
        if (format.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(filename);
        }else if (format.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}

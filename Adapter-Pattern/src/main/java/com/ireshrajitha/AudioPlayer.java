package com.ireshrajitha;

public class AudioPlayer implements MediaPlayer{
    public void play(String format, String filename) {
        if(format.equalsIgnoreCase("mp3")){
            System.out.println("Playing Mp3 file : "+ filename);
        }else if(format.equalsIgnoreCase("vlc")||format.equalsIgnoreCase("mp4")){
            MediaAdapter mediaAdapter = new MediaAdapter(format);
            mediaAdapter.play(format, filename);
        }else {
            System.out.println(filename + " File doesn't support");
        }
    }
}

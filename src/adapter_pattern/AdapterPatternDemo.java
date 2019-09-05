package adapter_pattern;

import adapter_pattern.concrete.AudioPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "noah wanitaku.mp3");
        audioPlayer.play("mp4", "demo iklan.mp4");
        audioPlayer.play("vlc", "video korea.vlc");
        audioPlayer.play("avi", "movie gundala.avi");
    }
}

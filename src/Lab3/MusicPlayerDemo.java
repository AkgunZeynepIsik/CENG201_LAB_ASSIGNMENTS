package Lab3;

public class MusicPlayerDemo {
    public static void main(String[] args){
        MusicPlayList playlist=new MusicPlayList();
        playlist.addSong("Shape of You-Ed Sheeran");
        playlist.addSong("Save Me-BTS");
        playlist.addSong("Snap-Manifest");
        playlist.addSong("like JENNIE-Ed JENNIE");
        System.out.println("=== PLAYLIST ===");
        playlist.displayPlayList();
        System.out.println();
        System.out.println("=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();
        System.out.println("=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        System.out.println();
        System.out.println("=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlayList();
        System.out.println();

        System.out.println("=== AFTER REMOVING Snap SONG ===");
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlayList();


    }
}

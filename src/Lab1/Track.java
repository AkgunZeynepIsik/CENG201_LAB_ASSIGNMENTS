package Lab1;
 public class Track {
     private String title;
     private String artist;
     private int durationSeconds;
     private boolean isExplicit;

       //constructor
        public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
            this.title = title;
            this.artist = artist;
            if (durationSeconds < 0) {
                System.out.println("Warning: Invalid duration. Setting to 0.");
                this.durationSeconds = 0;
            } else {
                this.durationSeconds = durationSeconds;
            }
            this.isExplicit = isExplicit;
        }

        //another constructor
        public Track(String title, String artist) {
            this(title, artist, 0, false);
        }

        //cons.
        public Track(String title) {
            this(title, "Unknown Artist");
        }

        //default constructor
        public Track() {
            this("Unknown Title");
        }
        //getter methods
        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getDurationSeconds() {
            return durationSeconds;
        }

        public boolean isExplicit() {
            return isExplicit;
        }


        public String getDurationFormatted() {
            int minutes = durationSeconds / 60;
            int seconds = durationSeconds % 60;
            return String.format("%d:%02d", minutes, seconds);
        }
        //overriding and toString class.Printing for a clear output

        @Override
        public String toString() {
            String result = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
            if (isExplicit) {
                result += " [EXPLICIT]";
            }
            return result;
        }
    }



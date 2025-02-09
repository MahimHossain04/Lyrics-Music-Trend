import java.util.concurrent.TimeUnit;

public class PrintLyrics {
    public static void main(String[] args) throws InterruptedException {
        printLyrics();
    }

    public static void printLyrics() throws InterruptedException {
        String[] lines = {
            "So I'ma love you every night like it's the last night",
            "Like it's the last night",
            "If the world was ending",
            "I'd wanna be next to you",
            "If the party was over",
            "And our time on Earth was through",
            "I'd wanna hold you just for a while",
            "And die with a smile",
            "If the world was ending",
            "I'd wanna be next to you",
            "Right next to you"
        };

        double[] delays = {0.6, 0.7, 1.0, 4.6, 1.0, 3.6, 1.7, 2.0, 0.9, 1.2, 0.5};

        for (int i = 0; i < lines.length; i++) {
            for (char ch : lines[i].toCharArray()) {
                System.out.print(ch);
                System.out.flush();
                TimeUnit.MILLISECONDS.sleep(100);
            }
            TimeUnit.SECONDS.sleep((long) delays[i]);
            System.out.println();
        }
    }
}

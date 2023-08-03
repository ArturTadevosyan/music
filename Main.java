public class Main {
    public static void main(String[] args) {
        Pianist pianist = new Pianist();
        pianist.playing();

        BassGuitarist bg = new BassGuitarist();
        bg.playing();

        ClassicalGuitarist cg = new ClassicalGuitarist();
        cg.playing();
        cg.playingMozart();
    }
}

package adaptadores;

/**
 *
 * @author finfanterodal
 */
public class MP3 implements MediaPlayer {

    /**
     * Método implementado de MediaPlayer que reproducirá video en fomato mp3.
     * @param filename
     */
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
    
}

package adaptadores;

/**
 *
 * @author finfanterodal
 */
public class MP4 implements MediaPackage {

    /**
     *  Método implementado de MediaPackage que reproducirá video en fomato mp4.
     * @param filename
     */
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
    
}

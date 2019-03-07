package adaptadores;

/**
 *
 * @author finfanterodal
 */
public class VLC implements MediaPackage{

    /**
     *  Método implementado de MediaPackage que reproducirá video en fomato VCL.
     * @param filename
     */
    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
    
}

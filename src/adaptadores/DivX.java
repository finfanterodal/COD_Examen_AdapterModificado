package adaptadores;

/**
 *
 * @author finfanterodal
 */
public class DivX implements MediaDivX {

    /**
     *  Método implementado de MediaPackage que reproducirá video en fomato DivX.
     * @param filename
     */
    @Override
    public void playFilm(String filename) {
        System.out.println("Playing DivX File " + filename);
    }

}

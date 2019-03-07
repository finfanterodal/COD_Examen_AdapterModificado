package adaptadores;

/**
 *
 * @author finfanterodal
 */
public class Adaptadores {

    /**
     * Main en el que instanciamos los objetos.
     * @param args
     */
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        player = new FormatAdapter(new DivX());
        player.play("file.DivX");
    }

    private static class FormatAdapter implements MediaPlayer {
        //Atributo aux que nos ayudará en el adapter a diferenciar si un elemento es de MediaPackage o de MediaDivX.
        private int aux=0;       
        //Instanciamos un elemento de cada interfaz.
        private MediaPackage media;
        private MediaDivX mediad;
        
        //Hacemos un constructor para la interfaz MediaPackage.
        public FormatAdapter(MediaPackage m) {
             this.aux=0;
             this.media = m;
        }
        //Hacemos un constructor para la interfaz MediaDivX.
        public FormatAdapter(MediaDivX m) {
            this.aux=1;
            this.mediad = m;
        }

        /*
        * Método que nos sirve para adaptar las interfaces y poder utilizar la de MediaPlayer.
        */
        
        @Override
        public void play(String filename) {   
           try{
            System.out.print("Using Adapter --> ");
            if (aux==0){
            media.playFile(filename);
            }else if(aux==1){
            mediad.playFilm(filename);
            }
        }catch(NullPointerException e){
               System.out.println(e.getMessage());
        }

    }
    }}

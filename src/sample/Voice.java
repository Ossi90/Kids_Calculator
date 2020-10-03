package sample;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Voice {
    Path currentRelativePath = Paths.get("");
    String path = currentRelativePath.toAbsolutePath().toString();
    Media voice;
    MediaPlayer mediaPlayer;

    public Voice (Float value, String operation ){

    }

    public Voice (Float value){

    }

    public Voice (){


    }

    public void readOperator(String operator){
        voice = new Media(new File(path+"\\src\\sample\\Voice_Clips\\"+operator+".m4a").toURI().toString());
        activadeVoiceMedia(voice);
    }

    public void readOperation(String number){
        voice = new Media(new File(path+"\\src\\sample\\Voice_Clips\\"+number+".m4a").toURI().toString());
        activadeVoiceMedia(voice);
    }

    public void readOutcome(Float value){
        double x = (double) value;

        int number = (int)Math.floor(x);
        voice = new Media(new File(path+"\\src\\sample\\Voice_Clips\\"+number+".m4a").toURI().toString());
        activadeVoiceMedia(voice);
    }

    public void activadeVoiceMedia(Media voice){
        mediaPlayer = new MediaPlayer(voice);
        mediaPlayer.setAutoPlay(true);

    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AudioTestAfterRefactoring {
    @Test void adjustVolumesTest() {
        Audio audio = new Audio();
        audio.setAudioVolume(1);
        audio.setBGMVolume(0.5);
        audio.setSoundVolume(0.5);
        
        // 1. audioVolume

    }
}

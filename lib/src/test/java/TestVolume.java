import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestVolume {
    @Test
    void test() {
        Audio audio = new Audio();

        audio.setSoundVolume(0.7);
        audio.setBGMVolume(0.5);

        // 全体ボリュームを80.0に設定
        audio.setAudioVolume(80.0);

        assertEquals(audio.getAudioVolume(), 80.0, 0.001);
        assertEquals(audio.getOutputSoundVolume(), 56.0, 0.001);
        assertEquals(audio.getOutputBGMVolume(), 40.0, 0.001);

        // 全体ボリュームを60.0に設定
        audio.setAudioVolume(60.0);
        assertEquals(audio.getAudioVolume(), 60.0, 0.001);
        assertEquals(audio.getOutputSoundVolume(), 42.0, 0.001);
        assertEquals(audio.getOutputBGMVolume(), 30.0, 0.001);
    }
}

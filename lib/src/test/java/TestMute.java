import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMute {
    @Test
    void test() {
        Audio audio = new Audio();
        audio.setAudioVolume(80.0);
        audio.setSoundVolume(0.7);
        audio.setBGMVolume(0.5);

        assertEquals(audio.getAudioVolume(), 80.0, 0.001);
        assertEquals(audio.getOutputSoundVolume(), 56.0, 0.001);
        assertEquals(audio.getOutputBGMVolume(), 40.0, 0.001);

        // ミュートを設定
        //audio.setMute(true);
        assertEquals(audio.getAudioVolume(), 80.0, 0.001);
        assertEquals(audio.getOutputSoundVolume(), 0.0, 0.001);
        assertEquals(audio.getOutputBGMVolume(), 0.0, 0.001);

        // ミュートを解除
        // audio.setMute(false);
        assertEquals(audio.getAudioVolume(), 80.0, 0.001);
        assertEquals(audio.getOutputSoundVolume(), 56.0, 0.001);
        assertEquals(audio.getOutputBGMVolume(), 40.0, 0.001);
    }
}

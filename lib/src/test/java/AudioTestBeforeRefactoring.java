import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AudioTestBeforeRefactoring {
    @Test void adjustVolumesTest() {
        Audio audio = new Audio();

        double curAudioVolume = 1.0;
        double curBGMVolume = 0.5;
        double curSoundVolume = 0.6;

        audio.setAudioVolume(curAudioVolume);
        audio.setBGMVolume(curBGMVolume);
        audio.setSoundVolume(curSoundVolume);

        // 0. Check current volumes.
        assertEquals(curAudioVolume, audio.getAudioVolume());
        assertEquals(curBGMVolume, audio.getBGMVolume());
        assertEquals(curSoundVolume, audio.getSoundVolume());

        assertEquals(curBGMVolume, audio.getOutputBGMVolume());
        assertEquals(curSoundVolume, audio.getOutputSoundVolume());

        // 1. Changing the value of "AudioVolume" affects other values.
        audio.setAudioVolume(0.5);
        assertEquals(0.5 * curBGMVolume, audio.getOutputBGMVolume());
        assertEquals(0.5 * curSoundVolume, audio.getOutputSoundVolume());

        // 2. the value of "BGMVolume" affects only the value of "OutputBGMVolume".
        audio.setBGMVolume(1.0);
        curAudioVolume = audio.getAudioVolume();
        assertEquals(curAudioVolume * audio.getBGMVolume(), audio.getOutputBGMVolume());
        assertEquals(curAudioVolume * curSoundVolume, audio.getOutputSoundVolume());

        // 3. The value of "SEVolume" affects only the value of "OutputSEVolume".
        audio.setSoundVolume(1.0);
        curBGMVolume = audio.getBGMVolume();
        assertEquals(curAudioVolume * curBGMVolume, audio.getOutputBGMVolume());
        assertEquals(curAudioVolume * audio.getSoundVolume(), audio.getOutputSoundVolume());
    }
}

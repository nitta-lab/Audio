import java.util.*;

public class OutputSoundVolume {
	private AudioVolume audioVolume;
	private SoundVolume soundVolume;
	public OutputSoundVolume(AudioVolume audioVolume, SoundVolume soundVolume) {
		this.audioVolume = audioVolume;
		this.soundVolume = soundVolume;
	}
	public double getValue() {
		return (this.audioVolume.getValue()*this.soundVolume.getValue());
	}
}
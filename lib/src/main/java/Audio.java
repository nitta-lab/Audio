import java.util.*;

public class Audio {
	private BGMVolume BGMVolume;
	private SoundVolume soundVolume;
	private AudioVolume audioVolume;
	private OutputSoundVolume outputSoundVolume;
	private OutputBGMVolume outputBGMVolume;
	public Audio() {
		this.BGMVolume = new BGMVolume();
		this.soundVolume = new SoundVolume();
		this.audioVolume = new AudioVolume();
		this.outputSoundVolume = new OutputSoundVolume(audioVolume, soundVolume);
		this.outputBGMVolume = new OutputBGMVolume(audioVolume, BGMVolume);
	}
	public double getBGMVolume() {
		return BGMVolume.getValue();
	}
	public void setVolume(double volume) {
		this.BGMVolume.setVolume(volume);
		this.soundVolume.setVolume(volume);
		this.audioVolume.setVolume(volume);
	}
	public double getSoundVolume() {
		return soundVolume.getValue();
	}
	public double getAudioVolume() {
		return audioVolume.getValue();
	}
	public double getOutputSoundVolume() {
		return outputSoundVolume.getValue();
	}
	public double getOutputBGMVolume() {
		return outputBGMVolume.getValue();
	}
}
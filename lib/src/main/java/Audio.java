import java.util.*;

public class Audio {
	private BGMVolume BGMVolume;
	private SoundVolume soundVolume;
	private AudioVolume audioVolume;
	private OutputBGMVolume outputBGMVolume;
	private OutputSoundVolume outputSoundVolume;
	public Audio() {
		this.BGMVolume = new BGMVolume();
		this.soundVolume = new SoundVolume();
		this.audioVolume = new AudioVolume();
		this.outputBGMVolume = new OutputBGMVolume(BGMVolume, audioVolume);
		this.outputSoundVolume = new OutputSoundVolume(audioVolume, soundVolume);
	}
	public double getBGMVolume() {
		return BGMVolume.getValue();
	}
	public void setBGMVolume(double volume) {
		this.BGMVolume.setBGMVolume(volume);
	}
	public double getSoundVolume() {
		return soundVolume.getValue();
	}
	public void setSoundVolume(double volume) {
		this.soundVolume.setSoundVolume(volume);
	}
	public double getAudioVolume() {
		return audioVolume.getValue();
	}
	public void setAudioVolume(double volume) {
		this.audioVolume.setAudioVolume(volume);
	}
	public double getOutputBGMVolume() {
		return outputBGMVolume.getValue();
	}
	public double getOutputSoundVolume() {
		return outputSoundVolume.getValue();
	}
}
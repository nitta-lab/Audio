import java.util.*;

public class OutputBGMVolume {
	private AudioVolume audioVolume;
	private BGMVolume BGMVolume;
	public OutputBGMVolume(AudioVolume audioVolume, BGMVolume BGMVolume) {
		this.audioVolume = audioVolume;
		this.BGMVolume = BGMVolume;
	}
	public double getValue() {
		return (this.audioVolume.getValue()*this.BGMVolume.getValue());
	}
}
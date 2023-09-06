import java.util.*;

public class OutputBGMVolume {
	private BGMVolume BGMVolume;
	private AudioVolume audioVolume;
	public OutputBGMVolume(BGMVolume BGMVolume, AudioVolume audioVolume) {
		this.BGMVolume = BGMVolume;
		this.audioVolume = audioVolume;
	}
	public double getValue() {
		return (this.audioVolume.getValue()*this.BGMVolume.getValue());
	}
}
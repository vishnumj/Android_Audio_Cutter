package com.example.audio_trimmer;

public class Util {
	public static int secondsToFrames(double seconds, int mSampleRate,
			int mSamplesPerFrame) {
		return (int) (1.0 * seconds * mSampleRate / mSamplesPerFrame + 0.5);
	}
}

AndroidAudioTrimmer
===================

A Library that helps to trim Audio Files in Android

This is a simple Android Library that trims audio file by seconds.

I was in search for one but ended up with no luck.

So with the help of RingDroid i made a library that just get the job done.

It works with AAC / MP3 / WAV / AMR


USAGE :



	CheapSoundFile cheapSoundFile = CheapSoundFile.create(in_file_path,listner);

	int mSampleRate = cheapSoundFile.getSampleRate();

	int mSamplesPerFrame = cheapSoundFile.getSamplesPerFrame();

	int startFrame = Utilities.secondsToFrames(5.0,mSampleRate, mSamplesPerFrame);

	int endFrame = Utilities.secondsToFrames(30.0, mSampleRate,mSamplesPerFrame);

	cheapSoundFile.WriteFile(outfile_path, startFrame, endFrame-startFrame);

	final CheapSoundFile.ProgressListener listener = new CheapSoundFile.ProgressListener() {
		public boolean reportProgress(double frac) {
		
		return true; 
		}
	};


 

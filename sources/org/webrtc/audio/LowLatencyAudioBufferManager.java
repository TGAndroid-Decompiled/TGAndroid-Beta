package org.webrtc.audio;

import android.media.AudioTrack;
import android.os.Build;
import org.webrtc.Logging;

class LowLatencyAudioBufferManager {
    private static final String TAG = "LowLatencyAudioBufferManager";
    private int prevUnderrunCount = 0;
    private int ticksUntilNextDecrease = 10;
    private boolean keepLoweringBufferSize = true;
    private int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount;
        int bufferSizeInFrames;
        int bufferSizeInFrames2;
        if (Build.VERSION.SDK_INT >= 26) {
            underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.prevUnderrunCount) {
                if (this.bufferIncreaseCounter < 5) {
                    bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                    int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames2;
                    Logging.d("LowLatencyAudioBufferManager", "Underrun detected! Increasing AudioTrack buffer size from " + bufferSizeInFrames2 + " to " + playbackRate);
                    audioTrack.setBufferSizeInFrames(playbackRate);
                    this.bufferIncreaseCounter = this.bufferIncreaseCounter + 1;
                }
                this.keepLoweringBufferSize = false;
                this.prevUnderrunCount = underrunCount;
            } else {
                if (!this.keepLoweringBufferSize) {
                    return;
                }
                int i = this.ticksUntilNextDecrease - 1;
                this.ticksUntilNextDecrease = i;
                if (i > 0) {
                    return;
                }
                int playbackRate2 = audioTrack.getPlaybackRate() / 100;
                bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                int max = Math.max(playbackRate2, bufferSizeInFrames - playbackRate2);
                if (max != bufferSizeInFrames) {
                    Logging.d("LowLatencyAudioBufferManager", "Lowering AudioTrack buffer size from " + bufferSizeInFrames + " to " + max);
                    audioTrack.setBufferSizeInFrames(max);
                }
            }
            this.ticksUntilNextDecrease = 10;
        }
    }
}

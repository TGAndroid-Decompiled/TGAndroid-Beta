package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    private class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override
        public void run() {
            StringBuilder sb;
            int i;
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                sb = new StringBuilder();
                sb.append("STREAM_RING stream volume: ");
                sb.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                sb.append(" (max=");
                i = this.maxRingVolume;
            } else {
                if (mode != 3) {
                    return;
                }
                sb = new StringBuilder();
                sb.append("VOICE_CALL stream volume: ");
                sb.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                sb.append(" (max=");
                i = this.maxVoiceCallVolume;
            }
            sb.append(i);
            sb.append(")");
            Logging.d("VolumeLogger", sb.toString());
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logging.d("VolumeLogger", "start" + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.d("VolumeLogger", "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer("WebRtcVolumeLevelLoggerThread");
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        Logging.d("VolumeLogger", "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}

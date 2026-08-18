package org.webrtc.voiceengine;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.WebRtcAudioRecord$$ExternalSyntheticApiModelOutline19;

public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecord Instance = null;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private int captureType;
    private AudioRecord deviceAudioRecord;
    private ByteBuffer deviceByteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;
    private int requestedSampleRate = 48000;
    private int requestedChannels = 1;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeDataIsRecorded(int i, long j);

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public byte[] getData() {
            return this.data;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            System.nanoTime();
            while (this.keepAlive) {
                int i = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                int i2 = WebRtcAudioRecord.this.deviceAudioRecord != null ? WebRtcAudioRecord.this.deviceAudioRecord.read(WebRtcAudioRecord.this.deviceByteBuffer, WebRtcAudioRecord.this.deviceByteBuffer.capacity()) : 0;
                if (i == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (i == i2) {
                        WebRtcAudioRecord.this.deviceByteBuffer.position(0);
                        WebRtcAudioRecord.this.byteBuffer.position(0);
                        for (int i3 = 0; i3 < i / 2; i3++) {
                            int i4 = i3 * 2;
                            int i5 = WebRtcAudioRecord.this.byteBuffer.getShort(i4) + (WebRtcAudioRecord.this.deviceByteBuffer.getShort(i4) / 10);
                            if (i5 > 32767) {
                                i5 = 32767;
                            }
                            if (i5 < -32768) {
                                i5 = -32768;
                            }
                            WebRtcAudioRecord.this.byteBuffer.putShort(i4, (short) i5);
                        }
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            webRtcAudioRecord.nativeDataIsRecorded(i, webRtcAudioRecord.nativeAudioRecord);
                        } catch (UnsatisfiedLinkError e) {
                            FileLog.e(e);
                            this.keepAlive = false;
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + i;
                    Logging.e("WebRtcAudioRecord", str);
                    if (i == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e2) {
                Logging.e("WebRtcAudioRecord", "AudioRecord.stop failed: " + e2.getMessage());
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioRecord", "stopThread");
            this.keepAlive = false;
        }
    }

    WebRtcAudioRecord(long j, int i) {
        Logging.d("WebRtcAudioRecord", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
        this.captureType = i;
        if (i == 2 && Instance == null) {
            Instance = this;
        }
    }

    private void onDestroy() {
        stopDeviceAudioRecord();
        if (Instance == this) {
            Instance = null;
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d("WebRtcAudioRecord", "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d("WebRtcAudioRecord", "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private int initRecording(int i, int i2) {
        WebRtcAudioEffects webRtcAudioEffects;
        if (this.captureType == 1 && Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        this.requestedSampleRate = i;
        this.requestedChannels = i2;
        Logging.d("WebRtcAudioRecord", "initRecording(sampleRate=" + i + ", channels=" + i2 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i3);
        this.byteBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        Logging.d("WebRtcAudioRecord", "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int iChannelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, iChannelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        Logging.d("WebRtcAudioRecord", "AudioRecord.getMinBufferSize: " + minBufferSize);
        int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        Logging.d("WebRtcAudioRecord", "bufferSizeInBytes: " + iMax);
        if (this.captureType == 1) {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    MediaProjection mediaProjection = VideoCapturerDevice.getMediaProjection();
                    if (mediaProjection == null) {
                        return -1;
                    }
                    WebRtcAudioRecord$$ExternalSyntheticApiModelOutline4.m();
                    AudioPlaybackCaptureConfiguration.Builder builderM = WebRtcAudioRecord$$ExternalSyntheticApiModelOutline3.m(mediaProjection);
                    builderM.addMatchingUsage(1);
                    builderM.addMatchingUsage(14);
                    builderM.addMatchingUsage(0);
                    WebRtcAudioRecord$$ExternalSyntheticApiModelOutline5.m();
                    AudioRecord.Builder builderM2 = WebRtcAudioRecord$$ExternalSyntheticApiModelOutline19.m();
                    builderM2.setAudioPlaybackCaptureConfig(builderM.build());
                    builderM2.setAudioFormat(new AudioFormat.Builder().setChannelMask(iChannelCountToConfiguration).setSampleRate(i).setEncoding(2).build());
                    builderM2.setBufferSizeInBytes(iMax);
                    this.audioRecord = builderM2.build();
                } catch (Throwable th) {
                    reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th.getMessage());
                    releaseAudioResources(false);
                    return -1;
                }
            }
        } else {
            try {
                this.audioRecord = new AudioRecord(audioSource, i, iChannelCountToConfiguration, 2, iMax);
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
                releaseAudioResources(false);
                return -1;
            }
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || audioRecord.getState() != 1) {
            reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
            releaseAudioResources(false);
            return -1;
        }
        if (this.captureType == 0 && (webRtcAudioEffects = this.effects) != null) {
            webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
        }
        logMainParameters();
        logMainParametersExtended();
        return i3;
    }

    public void initDeviceAudioRecord(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.requestedChannels * 2 * (this.requestedSampleRate / 100));
        this.deviceByteBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        int iChannelCountToConfiguration = channelCountToConfiguration(this.requestedChannels);
        int minBufferSize = AudioRecord.getMinBufferSize(this.requestedSampleRate, iChannelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return;
        }
        int iMax = Math.max(minBufferSize * 2, this.deviceByteBuffer.capacity());
        try {
            WebRtcAudioRecord$$ExternalSyntheticApiModelOutline4.m();
            AudioPlaybackCaptureConfiguration.Builder builderM = WebRtcAudioRecord$$ExternalSyntheticApiModelOutline3.m(mediaProjection);
            builderM.addMatchingUsage(1);
            builderM.addMatchingUsage(14);
            WebRtcAudioRecord$$ExternalSyntheticApiModelOutline5.m();
            AudioRecord.Builder builderM2 = WebRtcAudioRecord$$ExternalSyntheticApiModelOutline19.m();
            builderM2.setAudioPlaybackCaptureConfig(builderM.build());
            builderM2.setAudioFormat(new AudioFormat.Builder().setChannelMask(iChannelCountToConfiguration).setSampleRate(this.requestedSampleRate).setEncoding(2).build());
            builderM2.setBufferSizeInBytes(iMax);
            AudioRecord audioRecordBuild = builderM2.build();
            this.deviceAudioRecord = audioRecordBuild;
            if (audioRecordBuild == null || audioRecordBuild.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources(true);
                return;
            }
            try {
                this.deviceAudioRecord.startRecording();
                if (this.deviceAudioRecord.getRecordingState() != 3) {
                    reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.deviceAudioRecord.getRecordingState());
                }
            } catch (IllegalStateException e) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            }
        } catch (Throwable th) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th.getMessage());
            releaseAudioResources(true);
        }
    }

    public void stopDeviceAudioRecord() {
        AudioRecord audioRecord = this.deviceAudioRecord;
        if (audioRecord == null) {
            return;
        }
        try {
            audioRecord.stop();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        releaseAudioResources(true);
    }

    private boolean startRecording() {
        Logging.d("WebRtcAudioRecord", "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.d("WebRtcAudioRecord", "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        try {
            this.audioRecord.stop();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        releaseAudioResources(false);
        return true;
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioRecord", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.d("WebRtcAudioRecord", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static synchronized void setAudioSource(int i) {
        Logging.w("WebRtcAudioRecord", "Audio source is changed from: " + audioSource + " to " + i);
        audioSource = i;
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.w("WebRtcAudioRecord", "setMicrophoneMute(" + z + ")");
        microphoneMute = z;
    }

    private void releaseAudioResources(boolean z) {
        Logging.d("WebRtcAudioRecord", "releaseAudioResources " + z);
        if (z) {
            AudioRecord audioRecord = this.deviceAudioRecord;
            if (audioRecord != null) {
                audioRecord.release();
                this.deviceAudioRecord = null;
                return;
            }
            return;
        }
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            audioRecord2.release();
            this.audioRecord = null;
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e("WebRtcAudioRecord", "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e("WebRtcAudioRecord", "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public void reportWebRtcAudioRecordError(String str) {
        Logging.e("WebRtcAudioRecord", "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }
}

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
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecord Instance = null;
    private static final String TAG = "WebRtcAudioRecord";
    private static volatile WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
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

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override
        public void run() {
            int i;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (WebRtcAudioRecord.this.deviceAudioRecord != null) {
                    i = WebRtcAudioRecord.this.deviceAudioRecord.read(WebRtcAudioRecord.this.deviceByteBuffer, WebRtcAudioRecord.this.deviceByteBuffer.capacity());
                } else {
                    i = 0;
                }
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (read == i) {
                        WebRtcAudioRecord.this.deviceByteBuffer.position(0);
                        WebRtcAudioRecord.this.byteBuffer.position(0);
                        for (int i2 = 0; i2 < read / 2; i2++) {
                            int i3 = i2 << 1;
                            int i4 = (WebRtcAudioRecord.this.deviceByteBuffer.getShort(i3) / 10) + WebRtcAudioRecord.this.byteBuffer.getShort(i3);
                            if (i4 > 32767) {
                                i4 = 32767;
                            }
                            if (i4 < -32768) {
                                i4 = -32768;
                            }
                            WebRtcAudioRecord.this.byteBuffer.putShort(i3, (short) i4);
                        }
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                        } catch (UnsatisfiedLinkError e) {
                            cc4.g(e, true);
                            this.keepAlive = false;
                        }
                    }
                    WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback = WebRtcAudioRecord.audioSamplesReadyCallback;
                    if (webRtcAudioRecordSamplesReadyCallback != null) {
                        webRtcAudioRecordSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity()), 0));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e("WebRtcAudioRecord", str);
                    if (read == -3) {
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

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j, int i) {
        Logging.d("WebRtcAudioRecord", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
        this.captureType = i;
        if (i == 2 && Instance == null) {
            Instance = this;
        }
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        hz6.e("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i) {
        if (i == 1) {
            return 16;
        }
        return 12;
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

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        WebRtcAudioEffects webRtcAudioEffects;
        if (this.captureType != 1 || Build.VERSION.SDK_INT >= 29) {
            this.requestedSampleRate = i;
            this.requestedChannels = i2;
            Logging.d("WebRtcAudioRecord", "initRecording(sampleRate=" + i + ", channels=" + i2 + ")");
            if (this.audioRecord != null) {
                reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                return -1;
            }
            int i3 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 << 1) * i3);
            this.byteBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            Logging.d("WebRtcAudioRecord", "byteBuffer.capacity: " + this.byteBuffer.capacity());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                Logging.d("WebRtcAudioRecord", "AudioRecord.getMinBufferSize: " + minBufferSize);
                int max = Math.max(minBufferSize << 1, this.byteBuffer.capacity());
                Logging.d("WebRtcAudioRecord", "bufferSizeInBytes: " + max);
                if (this.captureType == 1) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            MediaProjection mediaProjection = VideoCapturerDevice.getMediaProjection();
                            if (mediaProjection != null) {
                                vk1.r();
                                AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
                                builder.addMatchingUsage(1);
                                builder.addMatchingUsage(14);
                                builder.addMatchingUsage(0);
                                AudioRecord.Builder builder2 = new AudioRecord.Builder();
                                builder2.setAudioPlaybackCaptureConfig(builder.build());
                                builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(i).setEncoding(2).build());
                                builder2.setBufferSizeInBytes(max);
                                this.audioRecord = builder2.build();
                            }
                        } catch (Throwable th) {
                            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th.getMessage());
                            releaseAudioResources(false);
                            return -1;
                        }
                    }
                } else {
                    try {
                        this.audioRecord = new AudioRecord(audioSource, i, channelCountToConfiguration, 2, max);
                    } catch (IllegalArgumentException e) {
                        reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
                        releaseAudioResources(false);
                        return -1;
                    }
                }
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord != null && audioRecord.getState() == 1) {
                    if (this.captureType == 0 && (webRtcAudioEffects = this.effects) != null) {
                        webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    return i3;
                }
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources(false);
                return -1;
            }
            reportWebRtcAudioRecordInitError(uh9.k(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return -1;
        }
        return -1;
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioRecord", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        Logging.d("WebRtcAudioRecord", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeDataIsRecorded(int i, long j);

    private void onDestroy() {
        stopDeviceAudioRecord();
        if (Instance == this) {
            Instance = null;
        }
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

    public void reportWebRtcAudioRecordError(String str) {
        Logging.e("WebRtcAudioRecord", "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
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

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            Logging.w("WebRtcAudioRecord", "Audio source is changed from: " + audioSource + " to " + i);
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.w("WebRtcAudioRecord", "setMicrophoneMute(" + z + ")");
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.d("WebRtcAudioRecord", "startRecording");
        if (this.audioRecord != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
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
        boolean z;
        Logging.d("WebRtcAudioRecord", "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
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
            cc4.g(th, true);
        }
        releaseAudioResources(false);
        return true;
    }

    public void initDeviceAudioRecord(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT >= 29) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.requestedSampleRate / 100) * (this.requestedChannels << 1));
            this.deviceByteBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            int channelCountToConfiguration = channelCountToConfiguration(this.requestedChannels);
            int minBufferSize = AudioRecord.getMinBufferSize(this.requestedSampleRate, channelCountToConfiguration, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                int max = Math.max(minBufferSize << 1, this.deviceByteBuffer.capacity());
                try {
                    vk1.r();
                    AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
                    builder.addMatchingUsage(1);
                    builder.addMatchingUsage(14);
                    AudioRecord.Builder builder2 = new AudioRecord.Builder();
                    builder2.setAudioPlaybackCaptureConfig(builder.build());
                    builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(this.requestedSampleRate).setEncoding(2).build());
                    builder2.setBufferSizeInBytes(max);
                    AudioRecord build = builder2.build();
                    this.deviceAudioRecord = build;
                    if (build != null && build.getState() == 1) {
                        try {
                            this.deviceAudioRecord.startRecording();
                            if (this.deviceAudioRecord.getRecordingState() != 3) {
                                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state :" + this.deviceAudioRecord.getRecordingState());
                                return;
                            }
                            return;
                        } catch (IllegalStateException e) {
                            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
                            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e.getMessage());
                            return;
                        }
                    }
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources(true);
                    return;
                } catch (Throwable th) {
                    reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th.getMessage());
                    releaseAudioResources(true);
                    return;
                }
            }
            reportWebRtcAudioRecordInitError(uh9.k(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
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
            cc4.g(th, true);
        }
        releaseAudioResources(true);
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

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public AudioSamples(AudioRecord audioRecord, byte[] bArr, int i) {
            this(audioRecord, bArr);
        }
    }
}

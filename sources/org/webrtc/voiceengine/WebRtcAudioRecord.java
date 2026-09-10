package org.webrtc.voiceengine;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Process;
import hc.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.telegram.messenger.FileLog;
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

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override
        public void run() {
            int i10;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (WebRtcAudioRecord.this.deviceAudioRecord != null) {
                    i10 = WebRtcAudioRecord.this.deviceAudioRecord.read(WebRtcAudioRecord.this.deviceByteBuffer, WebRtcAudioRecord.this.deviceByteBuffer.capacity());
                } else {
                    i10 = 0;
                }
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (read == i10) {
                        WebRtcAudioRecord.this.deviceByteBuffer.position(0);
                        WebRtcAudioRecord.this.byteBuffer.position(0);
                        for (int i11 = 0; i11 < read / 2; i11++) {
                            int i12 = i11 * 2;
                            int i13 = (WebRtcAudioRecord.this.deviceByteBuffer.getShort(i12) / 10) + WebRtcAudioRecord.this.byteBuffer.getShort(i12);
                            if (i13 > 32767) {
                                i13 = 32767;
                            }
                            if (i13 < -32768) {
                                i13 = -32768;
                            }
                            WebRtcAudioRecord.this.byteBuffer.putShort(i12, (short) i13);
                        }
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                        } catch (UnsatisfiedLinkError e) {
                            FileLog.e(e);
                            this.keepAlive = false;
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
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
            } catch (IllegalStateException e7) {
                Logging.e("WebRtcAudioRecord", "AudioRecord.stop failed: " + e7.getMessage());
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioRecord", "stopThread");
            this.keepAlive = false;
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

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

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
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

    public WebRtcAudioRecord(long j3, int i10) {
        Logging.d("WebRtcAudioRecord", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j3;
        this.effects = WebRtcAudioEffects.create();
        this.captureType = i10;
        if (i10 == 2 && Instance == null) {
            Instance = this;
        }
    }

    private static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i10) {
        if (i10 == 1) {
            return 16;
        }
        return 12;
    }

    private boolean enableBuiltInAEC(boolean z10) {
        Logging.d("WebRtcAudioRecord", "enableBuiltInAEC(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z10);
    }

    private boolean enableBuiltInNS(boolean z10) {
        Logging.d("WebRtcAudioRecord", "enableBuiltInNS(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z10);
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i10, int i11) {
        WebRtcAudioEffects webRtcAudioEffects;
        if (this.captureType != 1 || Build.VERSION.SDK_INT >= 29) {
            this.requestedSampleRate = i10;
            this.requestedChannels = i11;
            Logging.d("WebRtcAudioRecord", "initRecording(sampleRate=" + i10 + ", channels=" + i11 + ")");
            if (this.audioRecord != null) {
                reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                return -1;
            }
            int i12 = i10 / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 2 * i12);
            this.byteBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            Logging.d("WebRtcAudioRecord", "byteBuffer.capacity: " + this.byteBuffer.capacity());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int channelCountToConfiguration = channelCountToConfiguration(i11);
            int minBufferSize = AudioRecord.getMinBufferSize(i10, channelCountToConfiguration, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                Logging.d("WebRtcAudioRecord", "AudioRecord.getMinBufferSize: " + minBufferSize);
                int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                Logging.d("WebRtcAudioRecord", "bufferSizeInBytes: " + max);
                if (this.captureType == 1) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            MediaProjection mediaProjection = VideoCapturerDevice.getMediaProjection();
                            if (mediaProjection != null) {
                                AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
                                builder.addMatchingUsage(1);
                                builder.addMatchingUsage(14);
                                builder.addMatchingUsage(0);
                                AudioRecord.Builder builder2 = new AudioRecord.Builder();
                                builder2.setAudioPlaybackCaptureConfig(builder.build());
                                builder2.setAudioFormat(new AudioFormat.Builder().setChannelMask(channelCountToConfiguration).setSampleRate(i10).setEncoding(2).build());
                                builder2.setBufferSizeInBytes(max);
                                this.audioRecord = builder2.build();
                            }
                        } catch (Throwable th2) {
                            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th2.getMessage());
                            releaseAudioResources(false);
                            return -1;
                        }
                    }
                } else {
                    try {
                        this.audioRecord = new AudioRecord(audioSource, i10, channelCountToConfiguration, 2, max);
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
                    return i12;
                }
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources(false);
                return -1;
            }
            reportWebRtcAudioRecordInitError(b.j(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return -1;
        }
        return -1;
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioRecord", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.d("WebRtcAudioRecord", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j3);

    public native void nativeDataIsRecorded(int i10, long j3);

    private void onDestroy() {
        stopDeviceAudioRecord();
        if (Instance == this) {
            Instance = null;
        }
    }

    private void releaseAudioResources(boolean z10) {
        Logging.d("WebRtcAudioRecord", "releaseAudioResources " + z10);
        if (z10) {
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

    public static synchronized void setAudioSource(int i10) {
        synchronized (WebRtcAudioRecord.class) {
            Logging.w("WebRtcAudioRecord", "Audio source is changed from: " + audioSource + " to " + i10);
            audioSource = i10;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z10) {
        Logging.w("WebRtcAudioRecord", "setMicrophoneMute(" + z10 + ")");
        microphoneMute = z10;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        boolean z10;
        boolean z11;
        Logging.d("WebRtcAudioRecord", "startRecording");
        if (this.audioRecord != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        if (this.audioThread == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z10;
        Logging.d("WebRtcAudioRecord", "stopRecording");
        if (this.audioThread != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        releaseAudioResources(false);
        return true;
    }

    public void initDeviceAudioRecord(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT >= 29) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((this.requestedSampleRate / 100) * this.requestedChannels * 2);
            this.deviceByteBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
            int channelCountToConfiguration = channelCountToConfiguration(this.requestedChannels);
            int minBufferSize = AudioRecord.getMinBufferSize(this.requestedSampleRate, channelCountToConfiguration, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                int max = Math.max(minBufferSize * 2, this.deviceByteBuffer.capacity());
                try {
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
                } catch (Throwable th2) {
                    reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + th2.getMessage());
                    releaseAudioResources(true);
                    return;
                }
            }
            reportWebRtcAudioRecordInitError(b.j(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
        }
    }

    public void stopDeviceAudioRecord() {
        AudioRecord audioRecord = this.deviceAudioRecord;
        if (audioRecord == null) {
            return;
        }
        try {
            audioRecord.stop();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        releaseAudioResources(true);
    }
}

package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;
public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final int audioFormat;
    private final AudioManager audioManager;
    private AudioRecord audioRecord;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override
        public void run() {
            boolean z;
            AudioTimestamp audioTimestamp;
            long j;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioRecordExternal", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            if (Build.VERSION.SDK_INT >= 24) {
                audioTimestamp = new AudioTimestamp();
            } else {
                audioTimestamp = null;
            }
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        if (Build.VERSION.SDK_INT >= 24 && WebRtcAudioRecord.this.audioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j = audioTimestamp.nanoTime;
                        } else {
                            j = 0;
                        }
                        long j2 = j;
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, read, j2);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e("WebRtcAudioRecordExternal", str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
                }
            } catch (IllegalStateException e) {
                Logging.e("WebRtcAudioRecordExternal", "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioRecordExternal", "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            w26.j("HW AEC not supported");
            throw null;
        } else if (z2 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            w26.j("HW NS not supported");
            throw null;
        } else {
            this.context = context;
            this.executor = scheduledExecutorService;
            this.audioManager = audioManager;
            this.audioSource = i;
            this.audioFormat = i2;
            this.errorCallback = audioRecordErrorCallback;
            this.stateCallback = audioRecordStateCallback;
            this.audioSamplesReadyCallback = samplesReadyCallback;
            this.isAcousticEchoCancelerSupported = z;
            this.isNoiseSuppressorSupported = z2;
            Logging.d("WebRtcAudioRecordExternal", "ctor" + WebRtcAudioUtils.getThreadInfo());
        }
    }

    public static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        fi7.g("Expected condition to be true");
    }

    private static String audioStateToString(int i) {
        if (i != 0) {
            if (i != 1) {
                return "INVALID";
            }
            return "STOP";
        }
        return "START";
    }

    private int channelCountToConfiguration(int i) {
        if (i == 1) {
            return 16;
        }
        return 12;
    }

    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        if (audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType()) {
            return true;
        }
        return false;
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        Logging.d("WebRtcAudioRecordExternal", "createAudioRecordOnLowerThanM");
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    private static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        Logging.d("WebRtcAudioRecordExternal", "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    public void doAudioRecordStateCallback(int i) {
        Logging.d("WebRtcAudioRecordExternal", "doAudioRecordStateCallback: " + audioStateToString(i));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e("WebRtcAudioRecordExternal", "Invalid audio state");
            }
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d("WebRtcAudioRecordExternal", "enableBuiltInAEC(" + z + ")");
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d("WebRtcAudioRecordExternal", "enableBuiltInNS(" + z + ")");
        return this.effects.setNS(z);
    }

    private static int getBytesPerSample(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        w26.j(de9.k(i, "Bad audio format "));
                        return 0;
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    private int initRecording(int i, int i2) {
        Logging.d("WebRtcAudioRecordExternal", "initRecording(sampleRate=" + i + ", channels=" + i2 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d("WebRtcAudioRecordExternal", "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.d("WebRtcAudioRecordExternal", "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize << 1, this.byteBuffer.capacity());
            Logging.d("WebRtcAudioRecordExternal", "bufferSizeInBytes: " + max);
            try {
                this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, i, channelCountToConfiguration, this.audioFormat, max);
                this.audioSourceMatchesRecordingSessionRef.set(null);
                AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                if (audioDeviceInfo != null) {
                    setPreferredDevice(audioDeviceInfo);
                }
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord != null && audioRecord.getState() == 1) {
                    this.effects.enable(this.audioRecord.getAudioSessionId());
                    logMainParameters();
                    logMainParametersExtended();
                    int logRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
                    if (logRecordingConfigurations != 0) {
                        Logging.w("WebRtcAudioRecordExternal", "Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
                    }
                    return i3;
                }
                reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                releaseAudioResources();
                return -1;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioRecordInitError(de9.k(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
        return -1;
    }

    public String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.d("WebRtcAudioRecordExternal", "audio record has changed");
        return "Scheduled task is done";
    }

    private static boolean logActiveRecordingConfigs(int i, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.d("WebRtcAudioRecordExternal", "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioRecordingConfiguration c = fyb.c(audioRecordingConfiguration);
            StringBuilder sb = new StringBuilder("  client audio source=");
            sb.append(WebRtcAudioUtils.audioSourceToString(c.getClientAudioSource()));
            sb.append(", client session id=");
            sb.append(c.getClientAudioSessionId());
            sb.append(" (");
            sb.append(i);
            sb.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = c.getFormat();
            sb.append(format.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(format.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb.append(", sample rate=");
            sb.append(format.getSampleRate());
            sb.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = c.getClientFormat();
            sb.append(clientFormat.getChannelCount());
            sb.append(", channel index mask=");
            sb.append(clientFormat.getChannelIndexMask());
            sb.append(", channel mask=");
            sb.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb.append(", encoding=");
            sb.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb.append(", sample rate=");
            sb.append(clientFormat.getSampleRate());
            sb.append("\n");
            AudioDeviceInfo audioDevice = c.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb.append("  AudioDevice: type=");
                sb.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb.append(", id=");
                sb.append(audioDevice.getId());
            }
            Logging.d("WebRtcAudioRecordExternal", sb.toString());
        }
        return true;
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioRecordExternal", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        Logging.d("WebRtcAudioRecordExternal", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z) {
        if (Build.VERSION.SDK_INT < 24) {
            Logging.w("WebRtcAudioRecordExternal", "AudioManager#getActiveRecordingConfigurations() requires N or higher");
            return 0;
        } else if (audioRecord == null) {
            return 0;
        } else {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
            int size = activeRecordingConfigurations.size();
            Logging.d("WebRtcAudioRecordExternal", "Number of active recording sessions: " + size);
            if (size > 0) {
                logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
                if (z) {
                    this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
                }
            }
            return size;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public native void nativeDataIsRecorded(long j, int i, long j2);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                int andIncrement = WebRtcAudioRecord.nextSchedulerId.getAndIncrement();
                int andIncrement2 = atomicInteger.getAndIncrement();
                newThread.setName("WebRtcAudioRecordScheduler-" + andIncrement + "-" + andIncrement2);
                return newThread;
            }
        });
    }

    private void releaseAudioResources() {
        Logging.d("WebRtcAudioRecordExternal", "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    public void reportWebRtcAudioRecordError(String str) {
        Logging.e("WebRtcAudioRecordExternal", "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e("WebRtcAudioRecordExternal", "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e("WebRtcAudioRecordExternal", "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(AudioRecord audioRecord) {
        Logging.d("WebRtcAudioRecordExternal", "scheduleLogRecordingConfigurationsTask");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        p63 p63Var = new p63(this, audioRecord, (byte) 4);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(p63Var, 100L, TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.d("WebRtcAudioRecordExternal", "startRecording");
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
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask(this.audioRecord);
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z;
        Logging.d("WebRtcAudioRecordExternal", "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e("WebRtcAudioRecordExternal", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    private static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioRecordingConfiguration c = fyb.c(audioRecordingConfiguration);
            AudioDeviceInfo audioDevice = c.getAudioDevice();
            if (audioDevice != null && c.getClientAudioSource() == i && c.getClientAudioSessionId() == i2 && c.getClientFormat().getEncoding() == audioFormat.getEncoding() && c.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && c.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && c.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && c.getFormat().getEncoding() != 0 && c.getFormat().getSampleRate() > 0 && (c.getFormat().getChannelMask() != 0 || c.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.d("WebRtcAudioRecordExternal", "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e("WebRtcAudioRecordExternal", "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isAudioConfigVerified() {
        if (this.audioSourceMatchesRecordingSessionRef.get() != null) {
            return true;
        }
        return false;
    }

    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool == null) {
            Logging.w("WebRtcAudioRecordExternal", "Audio configuration has not yet been verified");
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setMicrophoneMute(boolean z) {
        Logging.w("WebRtcAudioRecordExternal", "setMicrophoneMute(" + z + ")");
        this.microphoneMute = z;
    }

    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    public boolean setNoiseSuppressorEnabled(boolean z) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e("WebRtcAudioRecordExternal", "Noise suppressor is not supported.");
            return false;
        }
        Logging.w("WebRtcAudioRecordExternal", "SetNoiseSuppressorEnabled(" + z + ")");
        return this.effects.toggleNS(z);
    }

    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Integer num;
        StringBuilder sb = new StringBuilder("setPreferredDevice ");
        if (audioDeviceInfo != null) {
            num = Integer.valueOf(audioDeviceInfo.getId());
        } else {
            num = null;
        }
        sb.append(num);
        Logging.d("WebRtcAudioRecordExternal", sb.toString());
        this.preferredDevice = audioDeviceInfo;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && !audioRecord.setPreferredDevice(audioDeviceInfo)) {
            Logging.e("WebRtcAudioRecordExternal", "setPreferredDevice failed");
        }
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }
}

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
import com.google.firebase.messaging.h;
import j7.l1;
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
import org.telegram.ui.xx0;
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

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override
        public void run() {
            boolean z10;
            AudioTimestamp audioTimestamp;
            long j10;
            Process.setThreadPriority(-19);
            Logging.d("WebRtcAudioRecordExternal", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebRtcAudioRecord.assertTrue(z10);
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
                            j10 = audioTimestamp.nanoTime;
                        } else {
                            j10 = 0;
                        }
                        long j11 = j10;
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, read, j11);
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
            } catch (IllegalStateException e10) {
                Logging.e("WebRtcAudioRecordExternal", "AudioRecord.stop failed: " + e10.getMessage());
            }
        }

        public void stopThread() {
            Logging.d("WebRtcAudioRecordExternal", "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    public static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private static String audioStateToString(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return "INVALID";
            }
            return "STOP";
        }
        return "START";
    }

    private int channelCountToConfiguration(int i10) {
        if (i10 == 1) {
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

    private static AudioRecord createAudioRecordOnLowerThanM(int i10, int i11, int i12, int i13, int i14) {
        Logging.d("WebRtcAudioRecordExternal", "createAudioRecordOnLowerThanM");
        return new AudioRecord(i10, i11, i12, i13, i14);
    }

    private static AudioRecord createAudioRecordOnMOrHigher(int i10, int i11, int i12, int i13, int i14) {
        Logging.d("WebRtcAudioRecordExternal", "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i10).setAudioFormat(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i11).setChannelMask(i12).build()).setBufferSizeInBytes(i14).build();
    }

    public void doAudioRecordStateCallback(int i10) {
        Logging.d("WebRtcAudioRecordExternal", "doAudioRecordStateCallback: " + audioStateToString(i10));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i10 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i10 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e("WebRtcAudioRecordExternal", "Invalid audio state");
            }
        }
    }

    private boolean enableBuiltInAEC(boolean z10) {
        Logging.d("WebRtcAudioRecordExternal", "enableBuiltInAEC(" + z10 + ")");
        return this.effects.setAEC(z10);
    }

    private boolean enableBuiltInNS(boolean z10) {
        Logging.d("WebRtcAudioRecordExternal", "enableBuiltInNS(" + z10 + ")");
        return this.effects.setNS(z10);
    }

    private static int getBytesPerSample(int i10) {
        int i11 = 1;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    if (i10 != 13) {
                        throw new IllegalArgumentException(l1.k(i10, "Bad audio format "));
                    }
                }
            }
            return i11;
        }
        return 2;
    }

    private int initRecording(int i10, int i11) {
        Logging.d("WebRtcAudioRecordExternal", "initRecording(sampleRate=" + i10 + ", channels=" + i11 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i12 = i10 / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i11 * i12);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d("WebRtcAudioRecordExternal", "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = AudioRecord.getMinBufferSize(i10, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.d("WebRtcAudioRecordExternal", "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.d("WebRtcAudioRecordExternal", "bufferSizeInBytes: " + max);
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, i10, channelCountToConfiguration, this.audioFormat, max);
                    this.audioSourceMatchesRecordingSessionRef.set(null);
                    AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                    if (audioDeviceInfo != null) {
                        setPreferredDevice(audioDeviceInfo);
                    }
                } else {
                    this.audioRecord = createAudioRecordOnLowerThanM(this.audioSource, i10, channelCountToConfiguration, this.audioFormat, max);
                    this.audioSourceMatchesRecordingSessionRef.set(null);
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
                    return i12;
                }
                reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                releaseAudioResources();
                return -1;
            } catch (IllegalArgumentException e10) {
                e = e10;
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioRecordInitError(l1.k(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
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

    private static boolean logActiveRecordingConfigs(int i10, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.d("WebRtcAudioRecordExternal", "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioRecordingConfiguration a2 = xx0.a(audioRecordingConfiguration);
            StringBuilder sb2 = new StringBuilder("  client audio source=");
            sb2.append(WebRtcAudioUtils.audioSourceToString(a2.getClientAudioSource()));
            sb2.append(", client session id=");
            sb2.append(a2.getClientAudioSessionId());
            sb2.append(" (");
            sb2.append(i10);
            sb2.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = a2.getFormat();
            sb2.append(format.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(format.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(format.getSampleRate());
            sb2.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = a2.getClientFormat();
            sb2.append(clientFormat.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(clientFormat.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(clientFormat.getSampleRate());
            sb2.append("\n");
            AudioDeviceInfo audioDevice = a2.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb2.append("  AudioDevice: type=");
                sb2.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb2.append(", id=");
                sb2.append(audioDevice.getId());
            }
            Logging.d("WebRtcAudioRecordExternal", sb2.toString());
        }
        return true;
    }

    private void logMainParameters() {
        Logging.d("WebRtcAudioRecordExternal", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.d("WebRtcAudioRecordExternal", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z10) {
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
                if (z10) {
                    this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
                }
            }
            return size;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j10, ByteBuffer byteBuffer);

    public native void nativeDataIsRecorded(long j10, int i10, long j11);

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
        h hVar = new h(1, this, audioRecord);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(hVar, 100L, TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        boolean z10;
        boolean z11;
        Logging.d("WebRtcAudioRecordExternal", "startRecording");
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
                JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode = JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask(this.audioRecord);
            return true;
        } catch (IllegalStateException e10) {
            JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode2 = JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e10.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z10;
        Logging.d("WebRtcAudioRecordExternal", "stopRecording");
        if (this.audioThread != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
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

    private static boolean verifyAudioConfig(int i10, int i11, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioRecordingConfiguration a2 = xx0.a(audioRecordingConfiguration);
            AudioDeviceInfo audioDevice = a2.getAudioDevice();
            if (audioDevice != null && a2.getClientAudioSource() == i10 && a2.getClientAudioSessionId() == i11 && a2.getClientFormat().getEncoding() == audioFormat.getEncoding() && a2.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && a2.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && a2.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && a2.getFormat().getEncoding() != 0 && a2.getFormat().getSampleRate() > 0 && (a2.getFormat().getChannelMask() != 0 || a2.getFormat().getChannelIndexMask() != 0)) {
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

    public void setMicrophoneMute(boolean z10) {
        Logging.w("WebRtcAudioRecordExternal", "setMicrophoneMute(" + z10 + ")");
        this.microphoneMute = z10;
    }

    public void setNativeAudioRecord(long j10) {
        this.nativeAudioRecord = j10;
    }

    public boolean setNoiseSuppressorEnabled(boolean z10) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e("WebRtcAudioRecordExternal", "Noise suppressor is not supported.");
            return false;
        }
        Logging.w("WebRtcAudioRecordExternal", "SetNoiseSuppressorEnabled(" + z10 + ")");
        return this.effects.toggleNS(z10);
    }

    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Integer num;
        StringBuilder sb2 = new StringBuilder("setPreferredDevice ");
        if (audioDeviceInfo != null) {
            num = Integer.valueOf(audioDeviceInfo.getId());
        } else {
            num = null;
        }
        sb2.append(num);
        Logging.d("WebRtcAudioRecordExternal", sb2.toString());
        this.preferredDevice = audioDeviceInfo;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && !audioRecord.setPreferredDevice(audioDeviceInfo)) {
            Logging.e("WebRtcAudioRecordExternal", "setPreferredDevice failed");
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i10, int i11, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z10, boolean z11) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z10 && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z11 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i10;
        this.audioFormat = i11;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z10;
        this.isNoiseSuppressorSupported = z11;
        Logging.d("WebRtcAudioRecordExternal", "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}

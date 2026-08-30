package org.webrtc;

import android.content.Context;
import android.os.Process;
import java.util.List;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibrary;
import org.webrtc.PeerConnection;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;
public class PeerConnectionFactory {
    private static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    private static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    @Deprecated
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static ThreadInfo staticNetworkThread;
    private static ThreadInfo staticSignalingThread;
    private static ThreadInfo staticWorkerThread;
    private long nativeFactory;
    private volatile ThreadInfo networkThread;
    private volatile ThreadInfo signalingThread;
    private volatile ThreadInfo workerThread;

    public static class Builder {
        private AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        private AudioDeviceModule audioDeviceModule;
        private AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private AudioProcessingFactory audioProcessingFactory;
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private NetEqFactoryFactory neteqFactoryFactory;
        private NetworkControllerFactoryFactory networkControllerFactoryFactory;
        private NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;
        private Options options;
        private VideoDecoderFactory videoDecoderFactory;
        private VideoEncoderFactory videoEncoderFactory;

        public PeerConnectionFactory createPeerConnectionFactory() {
            long createNative;
            long createNative2;
            long createNativeNetworkControllerFactory;
            long createNativeNetworkStatePredictorFactory;
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            if (this.audioDeviceModule == null) {
                this.audioDeviceModule = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext()).createAudioDeviceModule();
            }
            Context applicationContext = ContextUtils.getApplicationContext();
            Options options = this.options;
            long nativeAudioDeviceModulePointer = this.audioDeviceModule.getNativeAudioDeviceModulePointer();
            long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
            long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
            VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
            VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
            AudioProcessingFactory audioProcessingFactory = this.audioProcessingFactory;
            long j10 = 0;
            if (audioProcessingFactory == null) {
                createNative = 0;
            } else {
                createNative = audioProcessingFactory.createNative();
            }
            FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface = this.fecControllerFactoryFactory;
            if (fecControllerFactoryFactoryInterface == null) {
                createNative2 = 0;
            } else {
                createNative2 = fecControllerFactoryFactoryInterface.createNative();
            }
            NetworkControllerFactoryFactory networkControllerFactoryFactory = this.networkControllerFactoryFactory;
            if (networkControllerFactoryFactory == null) {
                createNativeNetworkControllerFactory = 0;
            } else {
                createNativeNetworkControllerFactory = networkControllerFactoryFactory.createNativeNetworkControllerFactory();
            }
            NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory = this.networkStatePredictorFactoryFactory;
            if (networkStatePredictorFactoryFactory == null) {
                createNativeNetworkStatePredictorFactory = 0;
            } else {
                createNativeNetworkStatePredictorFactory = networkStatePredictorFactoryFactory.createNativeNetworkStatePredictorFactory();
            }
            NetEqFactoryFactory netEqFactoryFactory = this.neteqFactoryFactory;
            if (netEqFactoryFactory != null) {
                j10 = netEqFactoryFactory.createNativeNetEqFactory();
            }
            return PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext, options, nativeAudioDeviceModulePointer, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory, videoDecoderFactory, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, j10);
        }

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory) {
            if (audioDecoderFactoryFactory != null) {
                this.audioDecoderFactoryFactory = audioDecoderFactoryFactory;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
            this.audioDeviceModule = audioDeviceModule;
            return this;
        }

        public Builder setAudioEncoderFactoryFactory(AudioEncoderFactoryFactory audioEncoderFactoryFactory) {
            if (audioEncoderFactoryFactory != null) {
                this.audioEncoderFactoryFactory = audioEncoderFactoryFactory;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory != null) {
                this.audioProcessingFactory = audioProcessingFactory;
                return this;
            }
            throw new NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setNetEqFactoryFactory(NetEqFactoryFactory netEqFactoryFactory) {
            this.neteqFactoryFactory = netEqFactoryFactory;
            return this;
        }

        public Builder setNetworkControllerFactoryFactory(NetworkControllerFactoryFactory networkControllerFactoryFactory) {
            this.networkControllerFactoryFactory = networkControllerFactoryFactory;
            return this;
        }

        public Builder setNetworkStatePredictorFactoryFactory(NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory) {
            this.networkStatePredictorFactoryFactory = networkStatePredictorFactoryFactory;
            return this;
        }

        public Builder setOptions(Options options) {
            this.options = options;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
            this.videoDecoderFactory = videoDecoderFactory;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
            this.videoEncoderFactory = videoEncoderFactory;
            return this;
        }

        private Builder() {
            this.audioEncoderFactoryFactory = new BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new BuiltinAudioDecoderFactoryFactory();
        }
    }

    public static class InitializationOptions {
        final Context applicationContext;
        final boolean enableInternalTracer;
        final String fieldTrials;
        Loggable loggable;
        Logging.Severity loggableSeverity;
        final NativeLibraryLoader nativeLibraryLoader;
        final String nativeLibraryName;

        public static class Builder {
            private final Context applicationContext;
            private boolean enableInternalTracer;
            private Loggable loggable;
            private Logging.Severity loggableSeverity;
            private String fieldTrials = "";
            private NativeLibraryLoader nativeLibraryLoader = new NativeLibrary.DefaultLoader();
            private String nativeLibraryName = "jingle_peerconnection_so";

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public InitializationOptions createInitializationOptions() {
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
            }

            public Builder setEnableInternalTracer(boolean z4) {
                this.enableInternalTracer = z4;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setInjectableLogger(Loggable loggable, Logging.Severity severity) {
                this.loggable = loggable;
                this.loggableSeverity = severity;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.nativeLibraryLoader = nativeLibraryLoader;
                return this;
            }

            public Builder setNativeLibraryName(String str) {
                this.nativeLibraryName = str;
                return this;
            }
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        private InitializationOptions(Context context, String str, boolean z4, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z4;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }
    }

    public static class Options {
        public static final int ADAPTER_TYPE_ANY = 32;
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask;

        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    public static class ThreadInfo {
        final Thread thread;
        final int tid;

        private ThreadInfo(Thread thread, int i10) {
            this.thread = thread;
            this.tid = i10;
        }

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }
    }

    public PeerConnectionFactory(long j10) {
        checkInitializeHasBeenCalled();
        if (j10 != 0) {
            this.nativeFactory = j10;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void checkInitializeHasBeenCalled() {
        if (NativeLibrary.isLoaded() && ContextUtils.getApplicationContext() != null) {
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory != 0) {
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory has been disposed.");
    }

    public static String fieldTrialsFindFullName(String str) {
        if (NativeLibrary.isLoaded()) {
            return nativeFindFieldTrialsFullName(str);
        }
        return "";
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            Logging.injectLoggable(loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
            return;
        }
        Logging.d("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.deleteInjectedLoggable();
        nativeDeleteLoggable();
    }

    @Deprecated
    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    private static native long nativeCreateAudioSource(long j10, MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j10, String str, long j11);

    private static native long nativeCreateLocalMediaStream(long j10, String str);

    private static native long nativeCreatePeerConnection(long j10, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j11, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j10, long j11, long j12, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j13, long j14, long j15, long j16, long j17);

    private static native long nativeCreateVideoSource(long j10, boolean z4, boolean z10);

    private static native long nativeCreateVideoTrack(long j10, String str, long j11);

    private static native void nativeDeleteLoggable();

    private static native String nativeFindFieldTrialsFullName(String str);

    private static native void nativeFreeFactory(long j10);

    private static native long nativeGetNativePeerConnectionFactory(long j10);

    private static native RtpCapabilities nativeGetRtpReceiverCapabilities(long j10, MediaStreamTrack.MediaType mediaType);

    private static native RtpCapabilities nativeGetRtpSenderCapabilities(long j10, MediaStreamTrack.MediaType mediaType);

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i10);

    private static native void nativePrintStackTrace(int i10);

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j10, int i10, int i11);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStopAecDump(long j10);

    private static native void nativeStopInternalTracingCapture();

    private void onNetworkThreadReady() {
        this.networkThread = ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        Logging.d("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.signalingThread = ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        Logging.d("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.workerThread = ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        Logging.d("PeerConnectionFactory", "onWorkerThreadReady");
    }

    private static void printStackTrace(ThreadInfo threadInfo, boolean z4) {
        if (threadInfo != null) {
            String name = threadInfo.thread.getName();
            StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.w("PeerConnectionFactory", name + " stacktrace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.w("PeerConnectionFactory", stackTraceElement.toString());
                }
            }
            if (z4) {
                Logging.w("PeerConnectionFactory", "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                Logging.w("PeerConnectionFactory", "pid: " + Process.myPid() + ", tid: " + threadInfo.tid + ", name: " + name + "  >>> WebRTC <<<");
                nativePrintStackTrace(threadInfo.tid);
            }
        }
    }

    @Deprecated
    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeAudioSource()));
    }

    public MediaStream createLocalMediaStream(String str) {
        checkPeerConnectionFactoryExists();
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    @Deprecated
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    public PeerConnection createPeerConnectionInternal(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new PeerConnection(nativeCreatePeerConnection);
    }

    public VideoSource createVideoSource(boolean z4, boolean z10) {
        checkPeerConnectionFactoryExists();
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z4, z10));
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeVideoTrackSource()));
    }

    public void dispose() {
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        this.nativeFactory = 0L;
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public RtpCapabilities getRtpReceiverCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpReceiverCapabilities(this.nativeFactory, mediaType);
    }

    public RtpCapabilities getRtpSenderCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpSenderCapabilities(this.nativeFactory, mediaType);
    }

    public void printInternalStackTraces(boolean z4) {
        printStackTrace(this.signalingThread, z4);
        printStackTrace(this.workerThread, z4);
        printStackTrace(this.networkThread, z4);
    }

    public boolean startAecDump(int i10, int i11) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i10, i11);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    @Deprecated
    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, mediaConstraints, observer);
    }

    public VideoSource createVideoSource(boolean z4) {
        return createVideoSource(z4, true);
    }

    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, observer);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        return createPeerConnection(rTCConfiguration, (MediaConstraints) null, observer);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }
}

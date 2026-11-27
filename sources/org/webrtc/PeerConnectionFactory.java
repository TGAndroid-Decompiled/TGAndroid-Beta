package org.webrtc;

import android.content.Context;
import android.os.Process;
import java.util.List;
import org.webrtc.Environment;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibrary;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoSource;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;
public class PeerConnectionFactory {
    private static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    @Deprecated
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static ThreadInfo staticNetworkThread;
    private static ThreadInfo staticSignalingThread;
    private static ThreadInfo staticWorkerThread;
    private final NativeLifecycleLock lifecycleLock;
    private volatile ThreadInfo networkThread;
    private volatile ThreadInfo signalingThread;
    private volatile ThreadInfo workerThread;

    public interface Natives {
        long createAudioSource(long j, MediaConstraints mediaConstraints);

        long createAudioTrack(long j, String str, long j2);

        long createLocalMediaStream(long j, String str);

        long createPeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

        PeerConnectionFactory createPeerConnectionFactory(Context context, Options options, long j, long j2, long j3, long j4, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j5, long j6, long j7, long j8, long j9, long j10);

        long createVideoSource(long j, boolean z, boolean z2);

        long createVideoTrack(long j, String str, long j2);

        void deleteLoggable();

        void freeFactory(long j);

        long getNativePeerConnectionFactory(long j);

        RtpCapabilities getRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType);

        RtpCapabilities getRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType);

        void initializeAndroidGlobals();

        void initializeFieldTrials(String str);

        void initializeInternalTracer();

        void injectLoggable(JNILogging jNILogging, int i);

        void printStackTrace(int i);

        void shutdownInternalTracer();

        boolean startAecDump(long j, int i, int i2);

        boolean startInternalTracingCapture(String str);

        void stopAecDump(long j);

        void stopInternalTracingCapture();
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

        private ThreadInfo(Thread thread, int i) {
            this.thread = thread;
            this.tid = i;
        }

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }
    }

    public PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j != 0) {
            this.lifecycleLock = new NativeLifecycleLock("PeerConnectionFactory", j);
        } else {
            xi4.l("Failed to initialize PeerConnectionFactory!");
            throw null;
        }
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static void checkInitializeHasBeenCalled() {
        if (NativeLibrary.isLoaded() && ContextUtils.getApplicationContext() != null) {
            return;
        }
        grb.i("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
    }

    public static VideoTrack h(VideoSource videoSource, String str, long j) {
        return lambda$createVideoTrack$4(videoSource, str, j);
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        PeerConnectionFactoryJni.get().initializeAndroidGlobals();
        PeerConnectionFactoryJni.get().initializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            Logging.injectLoggable(loggable, initializationOptions.loggableSeverity);
            PeerConnectionFactoryJni.get().injectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
            return;
        }
        Logging.d("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.deleteInjectedLoggable();
        PeerConnectionFactoryJni.get().deleteLoggable();
    }

    @Deprecated
    public static void initializeFieldTrials(String str) {
        PeerConnectionFactoryJni.get().initializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        PeerConnectionFactoryJni.get().initializeInternalTracer();
    }

    public static AudioTrack l(AudioSource audioSource, String str, long j) {
        return lambda$createAudioTrack$7(audioSource, str, j);
    }

    public static AudioSource lambda$createAudioSource$5(MediaConstraints mediaConstraints, long j) {
        return new AudioSource(PeerConnectionFactoryJni.get().createAudioSource(j, mediaConstraints));
    }

    public static AudioTrack lambda$createAudioTrack$6(long j, String str, long j2) {
        return new AudioTrack(PeerConnectionFactoryJni.get().createAudioTrack(j, str, j2));
    }

    public static AudioTrack lambda$createAudioTrack$7(AudioSource audioSource, String str, long j) {
        return (AudioTrack) audioSource.lifecycleLock.call(new r48(j, str, (byte) 0));
    }

    public static MediaStream lambda$createLocalMediaStream$1(String str, long j) {
        return new MediaStream(PeerConnectionFactoryJni.get().createLocalMediaStream(j, str));
    }

    public static PeerConnection lambda$createPeerConnectionInternal$0(PeerConnection.Observer observer, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, SSLCertificateVerifier sSLCertificateVerifier, long j) {
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long createPeerConnection = PeerConnectionFactoryJni.get().createPeerConnection(j, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (createPeerConnection == 0) {
            return null;
        }
        return new PeerConnection(createPeerConnection);
    }

    public static VideoSource lambda$createVideoSource$2(boolean z, boolean z2, long j) {
        return new VideoSource(PeerConnectionFactoryJni.get().createVideoSource(j, z, z2));
    }

    public static VideoTrack lambda$createVideoTrack$3(long j, String str, long j2) {
        return new VideoTrack(PeerConnectionFactoryJni.get().createVideoTrack(j, str, j2));
    }

    public static VideoTrack lambda$createVideoTrack$4(VideoSource videoSource, String str, long j) {
        return (VideoTrack) videoSource.lifecycleLock.call(new r48(j, str, (byte) 1));
    }

    public static void lambda$dispose$12(long j) {
        PeerConnectionFactoryJni.get().freeFactory(j);
    }

    public static Long lambda$getNativePeerConnectionFactory$13(long j) {
        return Long.valueOf(PeerConnectionFactoryJni.get().getNativePeerConnectionFactory(j));
    }

    public static RtpCapabilities lambda$getRtpReceiverCapabilities$8(MediaStreamTrack.MediaType mediaType, long j) {
        return PeerConnectionFactoryJni.get().getRtpReceiverCapabilities(j, mediaType);
    }

    public static RtpCapabilities lambda$getRtpSenderCapabilities$9(MediaStreamTrack.MediaType mediaType, long j) {
        return PeerConnectionFactoryJni.get().getRtpSenderCapabilities(j, mediaType);
    }

    public static Boolean lambda$startAecDump$10(int i, int i2, long j) {
        return Boolean.valueOf(PeerConnectionFactoryJni.get().startAecDump(j, i, i2));
    }

    public static void lambda$stopAecDump$11(long j) {
        PeerConnectionFactoryJni.get().stopAecDump(j);
    }

    public static PeerConnection m(PeerConnection.Observer observer, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, SSLCertificateVerifier sSLCertificateVerifier, long j) {
        return lambda$createPeerConnectionInternal$0(observer, rTCConfiguration, mediaConstraints, sSLCertificateVerifier, j);
    }

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

    private static void printStackTrace(ThreadInfo threadInfo, boolean z) {
        if (threadInfo != null) {
            String name = threadInfo.thread.getName();
            StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.w("PeerConnectionFactory", name + " stacktrace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.w("PeerConnectionFactory", stackTraceElement.toString());
                }
            }
            if (z) {
                Logging.w("PeerConnectionFactory", "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                Logging.w("PeerConnectionFactory", "pid: " + Process.myPid() + ", tid: " + threadInfo.tid + ", name: " + name + "  >>> WebRTC <<<");
                PeerConnectionFactoryJni.get().printStackTrace(threadInfo.tid);
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
        PeerConnectionFactoryJni.get().shutdownInternalTracer();
    }

    public static boolean startInternalTracingCapture(String str) {
        return PeerConnectionFactoryJni.get().startInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        PeerConnectionFactoryJni.get().stopInternalTracingCapture();
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        return (AudioSource) this.lifecycleLock.call(new jz7(mediaConstraints, (byte) 1));
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        return (AudioTrack) this.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new rm6(audioSource, str, (byte) 25));
    }

    public MediaStream createLocalMediaStream(String str) {
        return (MediaStream) this.lifecycleLock.call(new y94(str, (byte) 3));
    }

    @Deprecated
    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, mediaConstraints, observer);
    }

    public PeerConnection createPeerConnectionInternal(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        return (PeerConnection) this.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new pt(observer, rTCConfiguration, mediaConstraints, sSLCertificateVerifier, (byte) 18));
    }

    public VideoSource createVideoSource(final boolean z, final boolean z2) {
        return (VideoSource) this.lifecycleLock.call(new NativeLifecycleLock.NativePointerCallable() {
            @Override
            public final Object call(long j) {
                VideoSource lambda$createVideoSource$2;
                lambda$createVideoSource$2 = PeerConnectionFactory.lambda$createVideoSource$2(z, z2, j);
                return lambda$createVideoSource$2;
            }
        });
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        return (VideoTrack) this.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new rm6(videoSource, str, (byte) 26));
    }

    public void dispose() {
        this.lifecycleLock.dispose(new ku7((byte) 15));
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
    }

    public long getNativeOwnedFactoryAndThreads() {
        return this.lifecycleLock.getNativePointer();
    }

    public long getNativePeerConnectionFactory() {
        return ((Long) this.lifecycleLock.call(new ku7((byte) 14))).longValue();
    }

    public RtpCapabilities getRtpReceiverCapabilities(MediaStreamTrack.MediaType mediaType) {
        return (RtpCapabilities) this.lifecycleLock.call(new q48(mediaType, (byte) 0));
    }

    public RtpCapabilities getRtpSenderCapabilities(MediaStreamTrack.MediaType mediaType) {
        return (RtpCapabilities) this.lifecycleLock.call(new q48(mediaType, (byte) 1));
    }

    public void printInternalStackTraces(boolean z) {
        printStackTrace(this.signalingThread, z);
        printStackTrace(this.workerThread, z);
        printStackTrace(this.networkThread, z);
    }

    public boolean startAecDump(int i, int i2) {
        return ((Boolean) this.lifecycleLock.call(new ml0(i, i2, (byte) 6))).booleanValue();
    }

    public void stopAecDump() {
        this.lifecycleLock.runIfAlive(new ku7((byte) 16));
    }

    @Deprecated
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    public VideoSource createVideoSource(boolean z) {
        return createVideoSource(z, true);
    }

    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, observer);
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
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity, 0);
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            @Deprecated
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

        private InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        public InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity, int i) {
            this(context, str, z, nativeLibraryLoader, str2, loggable, severity);
        }
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        return createPeerConnection(rTCConfiguration, (MediaConstraints) null, observer);
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }

    public static class Builder {
        private AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        private AudioDeviceModule audioDeviceModule;
        private AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private AudioFrameProcessor audioFrameProcessor;
        private AudioProcessingFactory audioProcessingFactory;
        private final Environment.Builder envBuilder;
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private NetEqFactoryFactory neteqFactoryFactory;
        private NetworkControllerFactoryFactory networkControllerFactoryFactory;
        private NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;
        private Options options;
        private VideoDecoderFactory videoDecoderFactory;
        private VideoEncoderFactory videoEncoderFactory;

        private Builder() {
            this.envBuilder = Environment.builder();
            this.audioEncoderFactoryFactory = new BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new BuiltinAudioDecoderFactoryFactory();
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            Environment environment;
            Natives natives;
            long createNative;
            long createNative2;
            long createNativeNetworkControllerFactory;
            long createNativeNetworkStatePredictorFactory;
            long createNativeNetEqFactory;
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            Environment build = this.envBuilder.build();
            try {
                if (this.audioDeviceModule == null) {
                    this.audioDeviceModule = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext()).createAudioDeviceModule();
                }
                Natives natives2 = PeerConnectionFactoryJni.get();
                Context applicationContext = ContextUtils.getApplicationContext();
                Options options = this.options;
                long ref = build.ref();
                long j = this.audioDeviceModule.getNative(build.ref());
                long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
                long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
                VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
                VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
                AudioProcessingFactory audioProcessingFactory = this.audioProcessingFactory;
                long j2 = 0;
                if (audioProcessingFactory == null) {
                    environment = build;
                    natives = natives2;
                    createNative = 0;
                } else {
                    environment = build;
                    natives = natives2;
                    try {
                        createNative = audioProcessingFactory.createNative(environment.ref());
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (environment != null) {
                            try {
                                environment.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
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
                if (netEqFactoryFactory == null) {
                    createNativeNetEqFactory = 0;
                } else {
                    createNativeNetEqFactory = netEqFactoryFactory.createNativeNetEqFactory();
                }
                AudioFrameProcessor audioFrameProcessor = this.audioFrameProcessor;
                if (audioFrameProcessor != null) {
                    j2 = audioFrameProcessor.getNativeAudioFrameProcessor();
                }
                PeerConnectionFactory createPeerConnectionFactory = natives.createPeerConnectionFactory(applicationContext, options, ref, j, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory, videoDecoderFactory, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, createNativeNetEqFactory, j2);
                environment.close();
                return createPeerConnectionFactory;
            } catch (Throwable th4) {
                th = th4;
                environment = build;
            }
        }

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory) {
            if (audioDecoderFactoryFactory != null) {
                this.audioDecoderFactoryFactory = audioDecoderFactoryFactory;
                return this;
            }
            lq5.j("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
            return null;
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
            lq5.j("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
            return null;
        }

        public Builder setAudioFrameProcessor(AudioFrameProcessor audioFrameProcessor) {
            this.audioFrameProcessor = audioFrameProcessor;
            return this;
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory != null) {
                this.audioProcessingFactory = audioProcessingFactory;
                return this;
            }
            p3d.h("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
            return null;
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setFieldTrials(String str) {
            this.envBuilder.setFieldTrials(str);
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

        public Builder(int i) {
            this();
        }
    }
}

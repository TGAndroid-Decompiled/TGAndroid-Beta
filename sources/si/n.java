package si;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class n implements t {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;
    public long H;
    public int I;
    public volatile long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public long Y;
    public final x f46734a;
    public final long f46735b;
    public final int f46736c;
    public final int d;
    public final int e;
    public final o f46737f;
    public final d f46738g;
    public MediaCodec f46743m;
    public MediaCodec f46744n;
    public AudioRecord f46745o;
    public Surface f46746p;
    public Thread f46747q;
    public Thread f46748r;
    public e f46749s;
    public e f46750t;
    public volatile boolean f46751u;
    public boolean v;
    public volatile long f46753x;
    public boolean f46754y;
    public boolean f46755z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f46739i = new ArrayList();
    public final AudioTimestamp f46740j = new AudioTimestamp();
    public final long[] f46741k = new long[256];
    public final long[] f46742l = new long[256];
    public volatile long f46752w = Long.MAX_VALUE;

    public n(x xVar, long j10, int i10, int i11, int i12, o oVar, d dVar) {
        this.f46734a = xVar;
        this.f46735b = j10;
        this.f46736c = i10;
        this.d = i11;
        this.e = i12;
        this.f46737f = oVar;
        this.f46738g = dVar;
    }

    public static String g(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j10 + ".." + j11;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize * 4, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f46744n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f46737f.b("audio encoder configure: codec=" + this.f46744n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f46744n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f46745o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f46736c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f46743m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f46737f.b("video encoder configure: codec=" + this.f46743m.getName() + ", format=" + createVideoFormat);
            this.f46743m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f46746p = this.f46743m.createInputSurface();
            return;
        }
        throw new IOException(a1.g.n(i11, " fps", i0.a.m("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f46744n.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f46744n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f46752w) {
                    this.U++;
                    this.V++;
                } else if (this.X) {
                    this.E++;
                    this.C += bufferInfo.size;
                    i(false, bufferInfo);
                    r(false, outputBuffer, bufferInfo);
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    int position = outputBuffer.position();
                    int limit = outputBuffer.limit();
                    try {
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(outputBuffer).flip();
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                        this.f46739i.add(new m(allocateDirect, bufferInfo2));
                        long j11 = this.J;
                        if (j11 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j11) {
                            d(j11, false);
                        }
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z11 = false;
            }
            z10 |= z11;
            this.f46744n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f46744n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.f46744n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j10, boolean z10) {
        ArrayList arrayList = this.f46739i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((m) arrayList.get(i10)).f46730b.presentationTimeUs >= j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 < 0) {
                if (!z10) {
                    return;
                }
                i10 = arrayList.size() - 1;
            } else if (i10 > 0 && j10 - ((m) arrayList.get(i10 - 1)).f46730b.presentationTimeUs <= ((m) arrayList.get(i10)).f46730b.presentationTimeUs - j10) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            m mVar = (m) arrayList.get(i10);
            this.Y = mVar.f46730b.presentationTimeUs - j10;
            while (i10 < arrayList.size()) {
                m mVar2 = (m) arrayList.get(i10);
                ByteBuffer byteBuffer = mVar2.f46729a;
                MediaCodec.BufferInfo bufferInfo = mVar2.f46730b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                r(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder t10 = a1.g.t(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(mVar.f46730b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.Y);
            this.f46737f.b(t10.toString());
        }
    }

    public final boolean e() {
        if (this.J != Long.MIN_VALUE && this.K != Long.MIN_VALUE && this.L != Long.MIN_VALUE && this.M != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void f(Thread thread) {
        if (thread != null) {
            try {
                thread.join(5000L);
                if (thread.isAlive()) {
                    o oVar = this.f46737f;
                    oVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void h(long j10) {
        int i10;
        long j11 = this.f46753x;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i10 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f46741k[i10] != j10);
        long nanoTime = System.nanoTime() - this.f46742l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f46737f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j10 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.J == Long.MIN_VALUE) {
                this.J = j10;
            }
            long j11 = this.K;
            if (j11 != Long.MIN_VALUE && j10 < j11) {
                this.Q++;
            }
            this.K = Math.max(j11, j10);
            if ((bufferInfo.flags & 1) != 0) {
                this.P++;
                long j12 = this.N;
                if (j12 != Long.MIN_VALUE) {
                    this.O = Math.max(this.O, j10 - j12);
                }
                this.N = j10;
                return;
            }
            return;
        }
        if (this.L == Long.MIN_VALUE) {
            this.L = j10;
        }
        long j13 = this.M;
        if (j13 != Long.MIN_VALUE && j10 < j13) {
            this.R++;
        }
        this.M = Math.max(j13, j10);
    }

    public final void j() {
        this.f46754y = false;
        this.f46755z = false;
        this.f46749s = null;
        this.f46750t = null;
        AudioRecord audioRecord = this.f46745o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f46745o = null;
        }
        Surface surface = this.f46746p;
        if (surface != null) {
            surface.release();
            this.f46746p = null;
        }
        MediaCodec mediaCodec = this.f46743m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f46744n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f46744n = null;
        this.f46743m = null;
        this.f46748r = null;
        this.f46747q = null;
    }

    public final void k(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f46737f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            l2.f fVar = this.f46738g.f46587a;
            ((t0) fVar.f15837b).f46791i.post(new p2.b(25, fVar, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.f46754y && this.f46755z) {
                    if (this.f46751u) {
                        return this.f46752w;
                    }
                    this.f46751u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f46752w = max;
                    AudioRecord audioRecord = this.f46745o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f46737f.a("AudioRecord stop failed", e);
                        }
                    }
                    o oVar = this.f46737f;
                    oVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.f46751u = false;
        this.v = false;
        this.f46752w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f46753x = 0L;
        this.F = 0;
        this.H = 0L;
        this.G = 0L;
        this.K = Long.MIN_VALUE;
        this.J = Long.MIN_VALUE;
        this.M = Long.MIN_VALUE;
        this.L = Long.MIN_VALUE;
        this.N = Long.MIN_VALUE;
        this.O = 0L;
        this.P = 0;
        this.R = 0;
        this.Q = 0;
        this.T = 0;
        this.S = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = Long.MIN_VALUE;
        this.f46749s = null;
        this.f46750t = null;
        this.f46739i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        o oVar = this.f46737f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f46745o;
            AudioTimestamp audioTimestamp = this.f46740j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                oVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        oVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void o(MediaFormat mediaFormat, boolean z10) {
        int remaining;
        String str;
        if (z10) {
            try {
                if (mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") && mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    int i10 = 0;
                    if (byteBuffer == null) {
                        remaining = 0;
                    } else {
                        remaining = byteBuffer.remaining();
                    }
                    if (byteBuffer2 != null) {
                        i10 = byteBuffer2.remaining();
                    }
                    this.I = remaining + i10;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f46734a.l(mediaFormat, z10);
        o oVar = this.f46737f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        oVar.b(sb2.toString());
    }

    public final synchronized void p(e eVar, e eVar2) {
        if (this.f46755z) {
            return;
        }
        if (this.f46754y) {
            try {
                this.f46744n.start();
                this.f46745o.startRecording();
                if (this.f46745o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f46749s = eVar;
                    this.f46750t = eVar2;
                    this.f46755z = true;
                    o oVar = this.f46737f;
                    oVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f46735b + ", audioSessionId=" + this.f46745o.getAudioSessionId());
                    this.f46747q = new Thread(new Runnable(this) {
                        public final n f46725b;

                        {
                            this.f46725b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j10;
                            long j11;
                            long j12;
                            String str;
                            long j13;
                            long j14;
                            int i10 = r2;
                            n nVar = this.f46725b;
                            nVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = nVar.f46743m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                nVar.o(nVar.f46743m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < nVar.f46752w) {
                                                        nVar.D++;
                                                        nVar.B += bufferInfo.size;
                                                        nVar.i(true, bufferInfo);
                                                        nVar.h(bufferInfo.presentationTimeUs);
                                                        nVar.r(true, nVar.f46743m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        nVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                nVar.f46743m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!nVar.f46751u) {
                                                nVar.k(e);
                                                return;
                                            } else {
                                                nVar.f46737f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j17 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j10 = 10000;
                                        } else {
                                            j10 = 0;
                                        }
                                        try {
                                            z12 = nVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = nVar.f46744n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (nVar.f46751u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = nVar.f46744n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = nVar.f46745o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = nVar.S + 1;
                                                                    nVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    nVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = nVar.n(i12);
                                                                    o oVar2 = nVar.f46737f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j12 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    oVar2.b(sb2.toString());
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (nVar) {
                                                                    if (nVar.f46749s != null && !nVar.f46751u) {
                                                                        e eVar3 = nVar.f46749s;
                                                                        nVar.f46749s = null;
                                                                        nVar.f46737f.b("audio capture ready; waiting for common A/V start frame");
                                                                        eVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j15 = j11;
                                                        }
                                                    }
                                                }
                                                j11 = j15;
                                                j15 = j11;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!nVar.f46751u) {
                                                nVar.k(e7);
                                                return;
                                            } else {
                                                nVar.f46737f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f46748r = new Thread(new Runnable(this) {
                        public final n f46725b;

                        {
                            this.f46725b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j10;
                            long j11;
                            long j12;
                            String str;
                            long j13;
                            long j14;
                            int i10 = r2;
                            n nVar = this.f46725b;
                            nVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = nVar.f46743m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                nVar.o(nVar.f46743m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < nVar.f46752w) {
                                                        nVar.D++;
                                                        nVar.B += bufferInfo.size;
                                                        nVar.i(true, bufferInfo);
                                                        nVar.h(bufferInfo.presentationTimeUs);
                                                        nVar.r(true, nVar.f46743m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        nVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                nVar.f46743m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!nVar.f46751u) {
                                                nVar.k(e);
                                                return;
                                            } else {
                                                nVar.f46737f.a("video drain failed while stopping", e);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j17 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j10 = 10000;
                                        } else {
                                            j10 = 0;
                                        }
                                        try {
                                            z12 = nVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = nVar.f46744n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (nVar.f46751u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = nVar.f46744n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = nVar.f46745o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = nVar.S + 1;
                                                                    nVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    nVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = nVar.n(i12);
                                                                    o oVar2 = nVar.f46737f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(n10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j12 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    oVar2.b(sb2.toString());
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                nVar.f46744n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (nVar) {
                                                                    if (nVar.f46749s != null && !nVar.f46751u) {
                                                                        e eVar3 = nVar.f46749s;
                                                                        nVar.f46749s = null;
                                                                        nVar.f46737f.b("audio capture ready; waiting for common A/V start frame");
                                                                        eVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j15 = j11;
                                                        }
                                                    }
                                                }
                                                j11 = j15;
                                                j15 = j11;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!nVar.f46751u) {
                                                nVar.k(e7);
                                                return;
                                            } else {
                                                nVar.f46737f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f46747q.start();
                    this.f46748r.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e) {
                j();
                throw e;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void q() {
        long j10;
        long j11;
        long j12;
        long j13;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Long valueOf5;
        String valueOf6;
        l();
        synchronized (this) {
            try {
                if (this.f46754y && !this.v) {
                    if (!this.f46755z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f46743m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f46737f.a("video encoder EOS failed", e);
                    }
                    f(this.f46747q);
                    f(this.f46748r);
                    Object obj = "n/a";
                    if (e()) {
                        j10 = this.L - this.J;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    if (e()) {
                        j11 = this.M - this.K;
                    } else {
                        j11 = Long.MIN_VALUE;
                    }
                    long j14 = this.J;
                    long j15 = this.K;
                    if (j14 != Long.MIN_VALUE && j15 > j14) {
                        j12 = j15 - j14;
                    } else {
                        j12 = 0;
                    }
                    long j16 = this.L;
                    long j17 = this.M;
                    if (j16 != Long.MIN_VALUE && j17 > j16) {
                        j13 = j17 - j16;
                    } else {
                        j13 = 0;
                    }
                    o oVar = this.f46737f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.D);
                    sb2.append(", videoBytes=");
                    sb2.append(this.B);
                    sb2.append(", videoPts=");
                    long j18 = j13;
                    sb2.append(g(this.J, this.K));
                    sb2.append(", actualVideoBitrate=");
                    long j19 = this.B;
                    if (j12 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j19 * 8000000) / j12);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.P);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.O);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.Q);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.E);
                    sb2.append(", audioBytes=");
                    sb2.append(this.C);
                    sb2.append(", audioPts=");
                    sb2.append(g(this.L, this.M));
                    sb2.append(", actualAudioBitrate=");
                    long j20 = this.C;
                    if (j18 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j20 * 8000000) / j18);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.R);
                    sb2.append(", avStartDeltaUs=");
                    if (j10 == Long.MIN_VALUE) {
                        valueOf3 = "n/a";
                    } else {
                        valueOf3 = String.valueOf(j10);
                    }
                    sb2.append(valueOf3);
                    sb2.append(", avEndDeltaUs=");
                    if (j11 == Long.MIN_VALUE) {
                        valueOf4 = "n/a";
                    } else {
                        valueOf4 = String.valueOf(j11);
                    }
                    sb2.append(valueOf4);
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.S);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.T);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.U);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.V);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.W);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.f46752w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f46752w);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j21 = this.Y;
                    if (j21 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j21);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.F;
                    if (i10 != 0) {
                        obj = Float.valueOf((((float) this.G) / i10) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.H) / 1000000.0f);
                    oVar.b(sb2.toString());
                    j();
                }
            } finally {
            }
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        if (byteBuffer == null) {
            return;
        }
        if (z10) {
            try {
                int i11 = this.I;
                if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                    bufferInfo.offset += i11;
                    bufferInfo.size = i10 - i11;
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f46734a.o(z10, byteBuffer, bufferInfo, this.f46735b);
    }
}

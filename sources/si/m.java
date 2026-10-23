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
import com.google.android.gms.internal.play_billing.k3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.w0;
public final class m implements s {
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
    public final w f47146a;
    public final long f47147b;
    public final int f47148c;
    public final int d;
    public final int e;
    public final n f47149f;
    public final c f47150g;
    public MediaCodec f47155m;
    public MediaCodec f47156n;
    public AudioRecord f47157o;
    public Surface f47158p;
    public Thread f47159q;
    public Thread f47160r;
    public d f47161s;
    public d f47162t;
    public volatile boolean f47163u;
    public boolean v;
    public volatile long f47165x;
    public boolean f47166y;
    public boolean f47167z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f47151i = new ArrayList();
    public final AudioTimestamp f47152j = new AudioTimestamp();
    public final long[] f47153k = new long[256];
    public final long[] f47154l = new long[256];
    public volatile long f47164w = Long.MAX_VALUE;

    public m(w wVar, long j10, int i10, int i11, int i12, n nVar, c cVar) {
        this.f47146a = wVar;
        this.f47147b = j10;
        this.f47148c = i10;
        this.d = i11;
        this.e = i12;
        this.f47149f = nVar;
        this.f47150g = cVar;
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
            this.f47156n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f47149f.b("audio encoder configure: codec=" + this.f47156n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f47156n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f47157o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f47148c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f47155m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f47149f.b("video encoder configure: codec=" + this.f47155m.getName() + ", format=" + createVideoFormat);
            this.f47155m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f47158p = this.f47155m.createInputSurface();
            return;
        }
        throw new IOException(a1.g.n(i11, " fps", k3.k("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f47156n.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f47156n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f47164w) {
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
                        this.f47151i.add(new l(allocateDirect, bufferInfo2));
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
            this.f47156n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f47156n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            o(this.f47156n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j10, boolean z10) {
        ArrayList arrayList = this.f47151i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((l) arrayList.get(i10)).f47142b.presentationTimeUs >= j10) {
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
            } else if (i10 > 0 && j10 - ((l) arrayList.get(i10 - 1)).f47142b.presentationTimeUs <= ((l) arrayList.get(i10)).f47142b.presentationTimeUs - j10) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            l lVar = (l) arrayList.get(i10);
            this.Y = lVar.f47142b.presentationTimeUs - j10;
            while (i10 < arrayList.size()) {
                l lVar2 = (l) arrayList.get(i10);
                ByteBuffer byteBuffer = lVar2.f47141a;
                MediaCodec.BufferInfo bufferInfo = lVar2.f47142b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                r(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder t10 = a1.g.t(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(lVar.f47142b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.Y);
            this.f47149f.b(t10.toString());
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
                    n nVar = this.f47149f;
                    nVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void h(long j10) {
        int i10;
        long j11 = this.f47165x;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i10 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f47153k[i10] != j10);
        long nanoTime = System.nanoTime() - this.f47154l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f47149f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
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
        this.f47166y = false;
        this.f47167z = false;
        this.f47161s = null;
        this.f47162t = null;
        AudioRecord audioRecord = this.f47157o;
        if (audioRecord != null) {
            audioRecord.release();
            this.f47157o = null;
        }
        Surface surface = this.f47158p;
        if (surface != null) {
            surface.release();
            this.f47158p = null;
        }
        MediaCodec mediaCodec = this.f47155m;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f47156n;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f47156n = null;
        this.f47155m = null;
        this.f47160r = null;
        this.f47159q = null;
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
        this.f47149f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            w0 w0Var = this.f47150g.f46998a;
            ((u0) w0Var.f14874b).f47254i.post(new p2.b(27, w0Var, runtimeException));
        }
    }

    public final long l() {
        synchronized (this) {
            try {
                if (this.f47166y && this.f47167z) {
                    if (this.f47163u) {
                        return this.f47164w;
                    }
                    this.f47163u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f47164w = max;
                    AudioRecord audioRecord = this.f47157o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f47149f.a("AudioRecord stop failed", e);
                        }
                    }
                    n nVar = this.f47149f;
                    nVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void m() {
        this.f47163u = false;
        this.v = false;
        this.f47164w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f47165x = 0L;
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
        this.f47161s = null;
        this.f47162t = null;
        this.f47151i.clear();
    }

    public final long n(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        n nVar = this.f47149f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f47157o;
            AudioTimestamp audioTimestamp = this.f47152j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                nVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        nVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
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
        this.f47146a.l(mediaFormat, z10);
        n nVar = this.f47149f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        nVar.b(sb2.toString());
    }

    public final synchronized void p(d dVar, d dVar2) {
        if (this.f47167z) {
            return;
        }
        if (this.f47166y) {
            try {
                this.f47156n.start();
                this.f47157o.startRecording();
                if (this.f47157o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f47161s = dVar;
                    this.f47162t = dVar2;
                    this.f47167z = true;
                    n nVar = this.f47149f;
                    nVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f47147b + ", audioSessionId=" + this.f47157o.getAudioSessionId());
                    this.f47159q = new Thread(new Runnable(this) {
                        public final m f47131b;

                        {
                            this.f47131b = this;
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
                            m mVar = this.f47131b;
                            mVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = mVar.f47155m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                mVar.o(mVar.f47155m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < mVar.f47164w) {
                                                        mVar.D++;
                                                        mVar.B += bufferInfo.size;
                                                        mVar.i(true, bufferInfo);
                                                        mVar.h(bufferInfo.presentationTimeUs);
                                                        mVar.r(true, mVar.f47155m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        mVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                mVar.f47155m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!mVar.f47163u) {
                                                mVar.k(e);
                                                return;
                                            } else {
                                                mVar.f47149f.a("video drain failed while stopping", e);
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
                                            z12 = mVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = mVar.f47156n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (mVar.f47163u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = mVar.f47156n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = mVar.f47157o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = mVar.S + 1;
                                                                    mVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    mVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = mVar.n(i12);
                                                                    n nVar2 = mVar.f47149f;
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
                                                                    nVar2.b(sb2.toString());
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (mVar) {
                                                                    if (mVar.f47161s != null && !mVar.f47163u) {
                                                                        d dVar3 = mVar.f47161s;
                                                                        mVar.f47161s = null;
                                                                        mVar.f47149f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
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
                                            if (!mVar.f47163u) {
                                                mVar.k(e7);
                                                return;
                                            } else {
                                                mVar.f47149f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f47160r = new Thread(new Runnable(this) {
                        public final m f47131b;

                        {
                            this.f47131b = this;
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
                            m mVar = this.f47131b;
                            mVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = mVar.f47155m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                mVar.o(mVar.f47155m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < mVar.f47164w) {
                                                        mVar.D++;
                                                        mVar.B += bufferInfo.size;
                                                        mVar.i(true, bufferInfo);
                                                        mVar.h(bufferInfo.presentationTimeUs);
                                                        mVar.r(true, mVar.f47155m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        mVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                mVar.f47155m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e) {
                                            if (!mVar.f47163u) {
                                                mVar.k(e);
                                                return;
                                            } else {
                                                mVar.f47149f.a("video drain failed while stopping", e);
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
                                            z12 = mVar.c(bufferInfo2, j10);
                                            if (!z12) {
                                                int dequeueInputBuffer = mVar.f47156n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (mVar.f47163u) {
                                                        if (j16 == j15) {
                                                            j14 = 0;
                                                        } else {
                                                            j14 = j16 + ((1000000 * j17) / 48000);
                                                        }
                                                        mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = mVar.f47156n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j11 = j15;
                                                            int read = mVar.f47157o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = mVar.S + 1;
                                                                    mVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    mVar.T++;
                                                                }
                                                                if (j16 == j11) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j16 == j11) {
                                                                    long n10 = mVar.n(i12);
                                                                    n nVar2 = mVar.f47149f;
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
                                                                    nVar2.b(sb2.toString());
                                                                    j16 = n10;
                                                                } else {
                                                                    j12 = 48000;
                                                                }
                                                                mVar.f47156n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                j17 += i12;
                                                                synchronized (mVar) {
                                                                    if (mVar.f47161s != null && !mVar.f47163u) {
                                                                        d dVar3 = mVar.f47161s;
                                                                        mVar.f47161s = null;
                                                                        mVar.f47149f.b("audio capture ready; waiting for common A/V start frame");
                                                                        dVar3.run();
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
                                            if (!mVar.f47163u) {
                                                mVar.k(e7);
                                                return;
                                            } else {
                                                mVar.f47149f.a("audio capture failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f47159q.start();
                    this.f47160r.start();
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
                if (this.f47166y && !this.v) {
                    if (!this.f47167z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f47155m.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f47149f.a("video encoder EOS failed", e);
                    }
                    f(this.f47159q);
                    f(this.f47160r);
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
                    n nVar = this.f47149f;
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
                    if (this.f47164w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f47164w);
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
                    nVar.b(sb2.toString());
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
        this.f47146a.o(z10, byteBuffer, bufferInfo, this.f47147b);
    }
}

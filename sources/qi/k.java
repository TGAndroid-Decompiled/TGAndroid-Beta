package qi;

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
public final class k implements o {
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
    public final s f46770a;
    public final long f46771b;
    public final int f46772c;
    public final int d;
    public final int f46773e;
    public final l f46774f;
    public final b f46775g;
    public MediaCodec f46780m;
    public MediaCodec f46781n;
    public AudioRecord f46782o;
    public Surface f46783p;
    public Thread f46784q;
    public Thread f46785r;
    public c f46786s;
    public c f46787t;
    public volatile boolean f46788u;
    public boolean v;
    public volatile long f46790x;
    public boolean f46791y;
    public boolean f46792z;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ArrayList f46776i = new ArrayList();
    public final AudioTimestamp f46777j = new AudioTimestamp();
    public final long[] f46778k = new long[256];
    public final long[] f46779l = new long[256];
    public volatile long f46789w = Long.MAX_VALUE;

    public k(s sVar, long j3, int i10, int i11, int i12, l lVar, b bVar) {
        this.f46770a = sVar;
        this.f46771b = j3;
        this.f46772c = i10;
        this.d = i11;
        this.f46773e = i12;
        this.f46774f = lVar;
        this.f46775g = bVar;
    }

    public static String g(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j3 + ".." + j10;
    }

    public static void k(MediaCodec mediaCodec, l lVar, String str) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (RuntimeException e7) {
                lVar.a(str.concat(" codec stop failed"), e7);
            }
            try {
                mediaCodec.release();
            } catch (RuntimeException e10) {
                lVar.a(str.concat(" codec release failed"), e10);
            }
        }
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize * 4, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f46781n = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f46774f.b("audio encoder configure: codec=" + this.f46781n.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f46781n.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f46782o = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f46772c;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.d);
        int i11 = this.f46773e;
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f46780m = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i11)) {
            this.f46774f.b("video encoder configure: codec=" + this.f46780m.getName() + ", format=" + createVideoFormat);
            this.f46780m.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f46783p = this.f46780m.createInputSurface();
            return;
        }
        throw new IOException(a1.g.o(i11, " fps", hg.c.m("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean c(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f46781n.dequeueOutputBuffer(bufferInfo, j3);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f46781n.getOutputBuffer(dequeueOutputBuffer)) != null) {
                if (bufferInfo.presentationTimeUs >= this.f46789w) {
                    this.U++;
                    this.V++;
                } else if (this.X) {
                    this.E++;
                    this.C += bufferInfo.size;
                    i(false, bufferInfo);
                    s(false, outputBuffer, bufferInfo);
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
                        this.f46776i.add(new j(allocateDirect, bufferInfo2));
                        long j10 = this.J;
                        if (j10 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j10) {
                            d(j10, false);
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
            this.f46781n.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f46781n.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            p(this.f46781n.getOutputFormat(), false);
        }
        if (z10 && !this.X && this.J != Long.MIN_VALUE) {
            d(this.J, true);
        }
        return z10;
    }

    public final void d(long j3, boolean z10) {
        ArrayList arrayList = this.f46776i;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((j) arrayList.get(i10)).f46766b.presentationTimeUs >= j3) {
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
            } else if (i10 > 0 && j3 - ((j) arrayList.get(i10 - 1)).f46766b.presentationTimeUs <= ((j) arrayList.get(i10)).f46766b.presentationTimeUs - j3) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.U++;
            }
            j jVar = (j) arrayList.get(i10);
            this.Y = jVar.f46766b.presentationTimeUs - j3;
            while (i10 < arrayList.size()) {
                j jVar2 = (j) arrayList.get(i10);
                ByteBuffer byteBuffer = jVar2.f46765a;
                MediaCodec.BufferInfo bufferInfo = jVar2.f46766b;
                this.E++;
                this.C += bufferInfo.size;
                i(false, bufferInfo);
                s(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.X = true;
            StringBuilder u10 = a1.g.u(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            u10.append(jVar.f46766b.presentationTimeUs);
            u10.append(", deltaUs=");
            u10.append(this.Y);
            this.f46774f.b(u10.toString());
        }
    }

    public final boolean e() {
        if (this.J != Long.MIN_VALUE && this.K != Long.MIN_VALUE && this.L != Long.MIN_VALUE && this.M != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean f(Thread thread, long j3) {
        if (thread == null) {
            return true;
        }
        try {
            thread.join(j3);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        boolean isAlive = thread.isAlive();
        boolean z10 = !isAlive;
        if (isAlive) {
            this.f46774f.b("encoder thread did not stop: " + thread.getName());
        }
        return z10;
    }

    public final void h(long j3) {
        int i10;
        long j10 = this.f46790x;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i10 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f46778k[i10] != j3);
        long nanoTime = System.nanoTime() - this.f46779l[i10];
        this.F++;
        this.G += nanoTime;
        this.H = Math.max(this.H, nanoTime);
        if (this.F % 30 == 0) {
            this.f46774f.b("codec latency: average=" + ((((float) this.G) / this.F) / 1000000.0f) + " ms, max=" + (((float) this.H) / 1000000.0f) + " ms");
        }
    }

    public final void i(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.J == Long.MIN_VALUE) {
                this.J = j3;
            }
            long j10 = this.K;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.Q++;
            }
            this.K = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.P++;
                long j11 = this.N;
                if (j11 != Long.MIN_VALUE) {
                    this.O = Math.max(this.O, j3 - j11);
                }
                this.N = j3;
                return;
            }
            return;
        }
        if (this.L == Long.MIN_VALUE) {
            this.L = j3;
        }
        long j12 = this.M;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.R++;
        }
        this.M = Math.max(j12, j3);
    }

    public final void j() {
        this.f46791y = false;
        this.f46792z = false;
        this.f46786s = null;
        this.f46787t = null;
        AudioRecord audioRecord = this.f46782o;
        this.f46782o = null;
        l lVar = this.f46774f;
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (RuntimeException e7) {
                lVar.a("AudioRecord release failed", e7);
            }
        }
        Surface surface = this.f46783p;
        this.f46783p = null;
        if (surface != null) {
            try {
                surface.release();
            } catch (RuntimeException e10) {
                lVar.a("video input surface release failed", e10);
            }
        }
        MediaCodec mediaCodec = this.f46780m;
        MediaCodec mediaCodec2 = this.f46781n;
        this.f46781n = null;
        this.f46780m = null;
        k(mediaCodec, lVar, "video");
        k(mediaCodec2, lVar, "audio");
    }

    public final void l(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f46774f.a(sb2.toString(), runtimeException);
        if (this.h.compareAndSet(false, true)) {
            k2.g0 g0Var = this.f46775g.f46669a;
            ((p0) g0Var.f14466b).f46859j.post(new p2.b(12, g0Var, runtimeException));
        }
    }

    public final long m() {
        synchronized (this) {
            try {
                if (this.f46791y && this.f46792z) {
                    if (this.f46788u) {
                        return this.f46789w;
                    }
                    this.f46788u = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.A) / 1000);
                    this.f46789w = max;
                    AudioRecord audioRecord = this.f46782o;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e7) {
                            this.f46774f.a("AudioRecord stop failed", e7);
                        }
                    }
                    l lVar = this.f46774f;
                    lVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void n() {
        this.f46788u = false;
        this.v = false;
        this.f46789w = Long.MAX_VALUE;
        this.A = 0L;
        this.C = 0L;
        this.B = 0L;
        this.E = 0;
        this.D = 0;
        this.f46790x = 0L;
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
        this.f46786s = null;
        this.f46787t = null;
        this.f46776i.clear();
    }

    public final long o(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.A) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        l lVar = this.f46774f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f46782o;
            AudioTimestamp audioTimestamp = this.f46777j;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.A) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                lVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.A) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        lVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void p(MediaFormat mediaFormat, boolean z10) {
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
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        }
        this.f46770a.l(mediaFormat, z10);
        l lVar = this.f46774f;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        lVar.b(sb2.toString());
    }

    public final synchronized void q(c cVar, c cVar2) {
        if (this.f46792z) {
            return;
        }
        if (this.f46791y) {
            try {
                this.f46781n.start();
                this.f46782o.startRecording();
                if (this.f46782o.getRecordingState() == 3) {
                    this.A = SystemClock.elapsedRealtimeNanos();
                    this.f46786s = cVar;
                    this.f46787t = cVar2;
                    this.f46792z = true;
                    l lVar = this.f46774f;
                    lVar.b("audio and video recording started: timeOriginNs=" + this.A + ", timelineOffsetUs=" + this.f46771b + ", audioSessionId=" + this.f46782o.getAudioSessionId());
                    this.f46784q = new Thread(new Runnable(this) {
                        public final k f46761b;

                        {
                            this.f46761b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i10 = r2;
                            k kVar = this.f46761b;
                            kVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = kVar.f46780m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                kVar.p(kVar.f46780m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < kVar.f46789w) {
                                                        kVar.D++;
                                                        kVar.B += bufferInfo.size;
                                                        kVar.i(true, bufferInfo);
                                                        kVar.h(bufferInfo.presentationTimeUs);
                                                        kVar.s(true, kVar.f46780m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        kVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                kVar.f46780m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!kVar.f46788u) {
                                                kVar.l(e7);
                                                return;
                                            } else {
                                                kVar.f46774f.a("video drain failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j16 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = 0;
                                        }
                                        try {
                                            z12 = kVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = kVar.f46781n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (kVar.f46788u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = kVar.f46781n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = kVar.f46782o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = kVar.S + 1;
                                                                    kVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    kVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long o9 = kVar.o(i12);
                                                                    l lVar2 = kVar.f46774f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(o9);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    lVar2.b(sb2.toString());
                                                                    j15 = o9;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (kVar) {
                                                                    if (kVar.f46786s != null && !kVar.f46788u) {
                                                                        c cVar3 = kVar.f46786s;
                                                                        kVar.f46786s = null;
                                                                        kVar.f46774f.b("audio capture ready; waiting for common A/V start frame");
                                                                        cVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j14 = j10;
                                                        }
                                                    }
                                                }
                                                j10 = j14;
                                                j14 = j10;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e10) {
                                            if (!kVar.f46788u) {
                                                kVar.l(e10);
                                                return;
                                            } else {
                                                kVar.f46774f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f46785r = new Thread(new Runnable(this) {
                        public final k f46761b;

                        {
                            this.f46761b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z10;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i10 = r2;
                            k kVar = this.f46761b;
                            kVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            int dequeueOutputBuffer = kVar.f46780m.dequeueOutputBuffer(bufferInfo, 10000L);
                                            if (dequeueOutputBuffer == -2) {
                                                kVar.p(kVar.f46780m.getOutputFormat(), true);
                                            } else if (dequeueOutputBuffer >= 0) {
                                                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    if (bufferInfo.presentationTimeUs < kVar.f46789w) {
                                                        kVar.D++;
                                                        kVar.B += bufferInfo.size;
                                                        kVar.i(true, bufferInfo);
                                                        kVar.h(bufferInfo.presentationTimeUs);
                                                        kVar.s(true, kVar.f46780m.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                    } else {
                                                        kVar.W++;
                                                    }
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                kVar.f46780m.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            }
                                        } catch (RuntimeException e7) {
                                            if (!kVar.f46788u) {
                                                kVar.l(e7);
                                                return;
                                            } else {
                                                kVar.f46774f.a("video drain failed while stopping", e7);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z13 = false;
                                    long j16 = 0;
                                    while (!z12) {
                                        if (z13) {
                                            j3 = 10000;
                                        } else {
                                            j3 = 0;
                                        }
                                        try {
                                            z12 = kVar.c(bufferInfo2, j3);
                                            if (!z12) {
                                                int dequeueInputBuffer = kVar.f46781n.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (kVar.f46788u) {
                                                        if (j15 == j14) {
                                                            j13 = 0;
                                                        } else {
                                                            j13 = j15 + ((1000000 * j16) / 48000);
                                                        }
                                                        kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                        z13 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = kVar.f46781n.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j10 = j14;
                                                            int read = kVar.f46782o.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = kVar.S + 1;
                                                                    kVar.S = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    kVar.T++;
                                                                }
                                                                if (j15 == j10) {
                                                                    j12 = 0;
                                                                } else {
                                                                    j12 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j15 == j10) {
                                                                    long o9 = kVar.o(i12);
                                                                    l lVar2 = kVar.f46774f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(o9);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j11 = 48000;
                                                                    if (Build.VERSION.SDK_INT >= 24) {
                                                                        str = "AudioTimestamp";
                                                                    } else {
                                                                        str = "read completion";
                                                                    }
                                                                    sb2.append(str);
                                                                    lVar2.b(sb2.toString());
                                                                    j15 = o9;
                                                                } else {
                                                                    j11 = 48000;
                                                                }
                                                                kVar.f46781n.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                j16 += i12;
                                                                synchronized (kVar) {
                                                                    if (kVar.f46786s != null && !kVar.f46788u) {
                                                                        c cVar3 = kVar.f46786s;
                                                                        kVar.f46786s = null;
                                                                        kVar.f46774f.b("audio capture ready; waiting for common A/V start frame");
                                                                        cVar3.run();
                                                                    }
                                                                }
                                                            }
                                                            j14 = j10;
                                                        }
                                                    }
                                                }
                                                j10 = j14;
                                                j14 = j10;
                                            } else {
                                                return;
                                            }
                                        } catch (RuntimeException e10) {
                                            if (!kVar.f46788u) {
                                                kVar.l(e10);
                                                return;
                                            } else {
                                                kVar.f46774f.a("audio capture failed while stopping", e10);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f46784q.start();
                    this.f46785r.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e7) {
                j();
                throw e7;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void r() {
        long j3;
        long j10;
        long j11;
        long j12;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        Long valueOf5;
        String valueOf6;
        m();
        synchronized (this) {
            try {
                if (this.f46791y && !this.v) {
                    if (!this.f46792z) {
                        j();
                        return;
                    }
                    this.v = true;
                    try {
                        this.f46780m.signalEndOfInputStream();
                    } catch (IllegalStateException e7) {
                        this.f46774f.a("video encoder EOS failed", e7);
                    }
                    boolean f7 = f(this.f46784q, 5000L);
                    boolean f10 = f(this.f46785r, 5000L);
                    if (!f7 || !f10) {
                        this.f46774f.b("forcing encoder shutdown: videoStopped=" + f7 + ", audioStopped=" + f10);
                        j();
                        boolean f11 = f7 | f(this.f46784q, 1000L);
                        boolean f12 = f10 | f(this.f46785r, 1000L);
                        if (!f11 || !f12) {
                            l(new IllegalStateException("Encoder threads did not stop after codec release"));
                        }
                    }
                    Object obj = "n/a";
                    if (e()) {
                        j3 = this.L - this.J;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (e()) {
                        j10 = this.M - this.K;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.J;
                    long j14 = this.K;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.L;
                    long j16 = this.M;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    l lVar = this.f46774f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.D);
                    sb2.append(", videoBytes=");
                    sb2.append(this.B);
                    sb2.append(", videoPts=");
                    long j17 = j12;
                    sb2.append(g(this.J, this.K));
                    sb2.append(", actualVideoBitrate=");
                    long j18 = this.B;
                    if (j11 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j18 * 8000000) / j11);
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
                    long j19 = this.C;
                    if (j17 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j19 * 8000000) / j17);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.R);
                    sb2.append(", avStartDeltaUs=");
                    if (j3 == Long.MIN_VALUE) {
                        valueOf3 = "n/a";
                    } else {
                        valueOf3 = String.valueOf(j3);
                    }
                    sb2.append(valueOf3);
                    sb2.append(", avEndDeltaUs=");
                    if (j10 == Long.MIN_VALUE) {
                        valueOf4 = "n/a";
                    } else {
                        valueOf4 = String.valueOf(j10);
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
                    if (this.f46789w == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.f46789w);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j20 = this.Y;
                    if (j20 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j20);
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
                    lVar.b(sb2.toString());
                    j();
                    this.f46784q = null;
                    this.f46785r = null;
                }
            } finally {
            }
        }
    }

    public final void s(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
            } catch (IOException e7) {
                throw new IllegalStateException(e7);
            }
        }
        this.f46770a.n(z10, byteBuffer, bufferInfo, this.f46771b);
    }
}

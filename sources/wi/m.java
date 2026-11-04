package wi;

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
public final class m implements r {
    public boolean A;
    public volatile long C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public long L;
    public long M;
    public int N;
    public volatile long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final w f57946a;
    public int f57947a0;
    public final long f57948b;
    public int f57949b0;
    public final int f57950c;
    public boolean f57951c0;
    public final int d;
    public long f57952d0;
    public final int f57953e;
    public final n f57954f;
    public final c f57955g;
    public final c h;
    public MediaCodec f57961n;
    public MediaCodec f57962o;
    public AudioRecord f57963p;
    public Surface f57964q;
    public Thread f57965r;
    public Thread f57966s;
    public d f57967t;
    public d f57968u;
    public volatile boolean v;
    public volatile boolean f57969w;
    public volatile boolean f57970x;
    public boolean f57971y;
    public int f57972z;
    public final AtomicBoolean f57956i = new AtomicBoolean();
    public final ArrayList f57957j = new ArrayList();
    public final AudioTimestamp f57958k = new AudioTimestamp();
    public final long[] f57959l = new long[256];
    public final long[] f57960m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public m(w wVar, long j10, int i3, int i10, int i11, n nVar, c cVar, c cVar2) {
        this.f57946a = wVar;
        this.f57948b = j10;
        this.f57950c = i3;
        this.d = i10;
        this.f57953e = i11;
        this.f57954f = nVar;
        this.f57955g = cVar;
        this.h = cVar2;
    }

    public static MediaFormat c(int i3, int i10, int i11) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i3, i3);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i10);
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        int remaining;
        int i3 = 0;
        if (!mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") || mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") != 1) {
            return 0;
        }
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
        if (byteBuffer == null) {
            remaining = 0;
        } else {
            remaining = byteBuffer.remaining();
        }
        if (byteBuffer2 != null) {
            i3 = byteBuffer2.remaining();
        }
        return remaining + i3;
    }

    public static String k(long j10, long j11) {
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
            this.f57962o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f57954f.b("audio encoder configure: codec=" + this.f57962o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f57962o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f57963p = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i3 = this.f57950c;
        int i10 = this.d;
        int i11 = this.f57953e;
        MediaFormat c2 = c(i3, i10, i11);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f57961n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i3, i3) && videoCapabilities.areSizeAndRateSupported(i3, i3, i11)) {
            this.f57954f.b("video encoder configure: codec=" + this.f57961n.getName() + ", format=" + c2);
            this.f57961n.configure(c2, (Surface) null, (MediaCrypto) null, 1);
            this.f57964q = this.f57961n.createInputSurface();
            return;
        }
        throw new IOException(a1.g.o(i11, " fps", com.google.android.recaptcha.internal.a.m("Video encoder does not support ", i3, "x", i3, " at ")));
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f57962o.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f57962o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.f57970x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.f57947a0++;
                } else if (this.f57951c0) {
                    this.J++;
                    this.H += bufferInfo.size;
                    m(false, bufferInfo);
                    v(false, outputBuffer, bufferInfo);
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
                        this.f57957j.add(new l(allocateDirect, bufferInfo2));
                        long j11 = this.O;
                        if (j11 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j11) {
                            e(j11, false);
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
            this.f57962o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f57962o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.f57962o.getOutputFormat(), false);
        }
        if (z10 && !this.f57951c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z10;
    }

    public final void e(long j10, boolean z10) {
        ArrayList arrayList = this.f57957j;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (true) {
                if (i3 < arrayList.size()) {
                    if (((l) arrayList.get(i3)).f57942b.presentationTimeUs >= j10) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 < 0) {
                if (!z10) {
                    return;
                }
                i3 = arrayList.size() - 1;
            } else if (i3 > 0 && j10 - ((l) arrayList.get(i3 - 1)).f57942b.presentationTimeUs <= ((l) arrayList.get(i3)).f57942b.presentationTimeUs - j10) {
                i3--;
            }
            for (int i10 = 0; i10 < i3; i10++) {
                this.Z++;
            }
            l lVar = (l) arrayList.get(i3);
            this.f57952d0 = lVar.f57942b.presentationTimeUs - j10;
            while (i3 < arrayList.size()) {
                l lVar2 = (l) arrayList.get(i3);
                ByteBuffer byteBuffer = lVar2.f57941a;
                MediaCodec.BufferInfo bufferInfo = lVar2.f57942b;
                this.J++;
                this.H += bufferInfo.size;
                m(false, bufferInfo);
                v(false, byteBuffer, bufferInfo);
                i3++;
            }
            arrayList.clear();
            this.f57951c0 = true;
            StringBuilder t10 = a1.g.t(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(lVar.f57942b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.f57952d0);
            this.f57954f.b(t10.toString());
        }
    }

    public final boolean g() {
        if (this.O != Long.MIN_VALUE && this.P != Long.MIN_VALUE && this.Q != Long.MIN_VALUE && this.R != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void h(Thread thread, long j10) {
        if (thread != null) {
            try {
                thread.join(j10);
                if (thread.isAlive()) {
                    n nVar = this.f57954f;
                    nVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.f57967t != null && !this.v) {
                d dVar = this.f57967t;
                this.f57967t = null;
                this.f57954f.b("audio capture ready; waiting for common A/V start frame");
                dVar.run();
            }
        }
    }

    public final void j() {
        boolean z10;
        synchronized (this) {
            try {
                z10 = true;
                int i3 = this.f57972z - 1;
                this.f57972z = i3;
                if (!this.A || i3 != 0) {
                    z10 = false;
                }
                if (z10) {
                    this.A = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f57954f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j10) {
        int i3;
        long j11 = this.C;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i3 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f57959l[i3] != j10);
        long nanoTime = System.nanoTime() - this.f57960m[i3];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f57954f.b("codec latency: average=" + ((((float) this.L) / this.K) / 1000000.0f) + " ms, max=" + (((float) this.M) / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z10, MediaCodec.BufferInfo bufferInfo) {
        long j10 = bufferInfo.presentationTimeUs;
        if (z10) {
            if (this.O == Long.MIN_VALUE) {
                this.O = j10;
            }
            long j11 = this.P;
            if (j11 != Long.MIN_VALUE && j10 < j11) {
                this.V++;
            }
            this.P = Math.max(j11, j10);
            if ((bufferInfo.flags & 1) != 0) {
                this.U++;
                long j12 = this.S;
                if (j12 != Long.MIN_VALUE) {
                    this.T = Math.max(this.T, j10 - j12);
                }
                this.S = j10;
                return;
            }
            return;
        }
        if (this.Q == Long.MIN_VALUE) {
            this.Q = j10;
        }
        long j13 = this.R;
        if (j13 != Long.MIN_VALUE && j10 < j13) {
            this.W++;
        }
        this.R = Math.max(j13, j10);
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.f57967t = null;
        this.f57968u = null;
        AudioRecord audioRecord = this.f57963p;
        if (audioRecord != null) {
            audioRecord.release();
            this.f57963p = null;
        }
        Surface surface = this.f57964q;
        if (surface != null) {
            surface.release();
            this.f57964q = null;
        }
        MediaCodec mediaCodec = this.f57961n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f57962o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f57962o = null;
        this.f57961n = null;
        this.f57966s = null;
        this.f57965r = null;
    }

    public final void o(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f57954f.a(sb2.toString(), runtimeException);
        if (this.f57956i.compareAndSet(false, true)) {
            this.f57955g.a(runtimeException);
        }
    }

    public final long p() {
        synchronized (this) {
            try {
                if (this.D && this.E) {
                    if (this.v) {
                        return this.B;
                    }
                    this.v = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.F) / 1000);
                    this.B = max;
                    AudioRecord audioRecord = this.f57963p;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e10) {
                            this.f57954f.a("AudioRecord stop failed", e10);
                        }
                    }
                    n nVar = this.f57954f;
                    nVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void q() {
        this.v = false;
        this.f57969w = false;
        this.f57970x = false;
        this.f57971y = false;
        this.f57972z = 0;
        this.A = false;
        this.B = Long.MAX_VALUE;
        this.F = 0L;
        this.H = 0L;
        this.G = 0L;
        this.J = 0;
        this.I = 0;
        this.C = 0L;
        this.K = 0;
        this.M = 0L;
        this.L = 0L;
        this.P = Long.MIN_VALUE;
        this.O = Long.MIN_VALUE;
        this.R = Long.MIN_VALUE;
        this.Q = Long.MIN_VALUE;
        this.S = Long.MIN_VALUE;
        this.T = 0L;
        this.U = 0;
        this.W = 0;
        this.V = 0;
        this.Y = 0;
        this.X = 0;
        this.Z = 0;
        this.f57947a0 = 0;
        this.f57949b0 = 0;
        this.f57951c0 = false;
        this.f57952d0 = Long.MIN_VALUE;
        this.f57967t = null;
        this.f57968u = null;
        this.f57957j.clear();
    }

    public final long r(int i3) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i3 * 1000000) / 48000));
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f57954f;
        if (i10 >= 24) {
            AudioRecord audioRecord = this.f57963p;
            AudioTimestamp audioTimestamp = this.f57958k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                nVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        nVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z10) {
        String str;
        if (z10) {
            try {
                this.N = f(mediaFormat);
                w wVar = this.f57946a;
                int i3 = this.f57953e;
                synchronized (wVar) {
                    wVar.f58115s = i3;
                }
            } catch (t e10) {
                if (!this.f57970x) {
                    this.f57970x = true;
                    this.f57954f.a("recording segment rejected; earlier segments are kept", e10);
                    this.h.a(e10);
                    return;
                }
                return;
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        n nVar = this.f57954f;
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
        this.f57946a.n(mediaFormat, z10);
    }

    public final synchronized void t(d dVar, d dVar2) {
        if (this.E) {
            return;
        }
        if (this.D) {
            try {
                this.f57962o.start();
                this.f57963p.startRecording();
                if (this.f57963p.getRecordingState() == 3) {
                    this.F = SystemClock.elapsedRealtimeNanos();
                    this.f57967t = dVar;
                    this.f57968u = dVar2;
                    this.E = true;
                    n nVar = this.f57954f;
                    nVar.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.f57948b + ", audioSessionId=" + this.f57963p.getAudioSessionId());
                    this.f57965r = new Thread(new Runnable(this) {
                        public final m f57930b;

                        {
                            this.f57930b = this;
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
                            int i3 = r2;
                            m mVar = this.f57930b;
                            mVar.getClass();
                            switch (i3) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e10) {
                                                if (!mVar.v) {
                                                    mVar.o(e10);
                                                } else {
                                                    mVar.f57954f.a("video drain failed while stopping", e10);
                                                }
                                            }
                                            if (!mVar.f57969w) {
                                                int dequeueOutputBuffer = mVar.f57961n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    mVar.s(mVar.f57961n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        if (bufferInfo.presentationTimeUs < mVar.B) {
                                                            mVar.I++;
                                                            mVar.G += bufferInfo.size;
                                                            mVar.m(true, bufferInfo);
                                                            mVar.l(bufferInfo.presentationTimeUs);
                                                            mVar.v(true, mVar.f57961n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            mVar.f57949b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    mVar.f57961n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                mVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            mVar.j();
                                            throw th2;
                                        }
                                    }
                                    mVar.j();
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
                                        try {
                                            try {
                                                if (!mVar.f57969w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = mVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = mVar.f57962o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (mVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = mVar.f57962o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = mVar.f57963p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i10 = mVar.X + 1;
                                                                            mVar.X = i10;
                                                                            if (read == -6 || i10 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            mVar.Y++;
                                                                        }
                                                                        if (j16 == j11) {
                                                                            j13 = 0;
                                                                        } else {
                                                                            j13 = j16 + ((1000000 * j17) / 48000);
                                                                        }
                                                                        mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i11 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r5 = mVar.r(i11);
                                                                            n nVar2 = mVar.f57954f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r5);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i11);
                                                                            sb2.append(", timestampSource=");
                                                                            j12 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            nVar2.b(sb2.toString());
                                                                            j16 = r5;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, i11 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i11;
                                                                        mVar.i();
                                                                    }
                                                                    j15 = j11;
                                                                }
                                                            }
                                                        }
                                                        j11 = j15;
                                                        j15 = j11;
                                                    }
                                                }
                                            } catch (RuntimeException e11) {
                                                if (!mVar.v) {
                                                    mVar.o(e11);
                                                } else {
                                                    mVar.f57954f.a("audio capture failed while stopping", e11);
                                                }
                                            }
                                            mVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            mVar.j();
                                            throw th3;
                                        }
                                    }
                                    mVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f57966s = new Thread(new Runnable(this) {
                        public final m f57930b;

                        {
                            this.f57930b = this;
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
                            int i3 = r2;
                            m mVar = this.f57930b;
                            mVar.getClass();
                            switch (i3) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e10) {
                                                if (!mVar.v) {
                                                    mVar.o(e10);
                                                } else {
                                                    mVar.f57954f.a("video drain failed while stopping", e10);
                                                }
                                            }
                                            if (!mVar.f57969w) {
                                                int dequeueOutputBuffer = mVar.f57961n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    mVar.s(mVar.f57961n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        if (bufferInfo.presentationTimeUs < mVar.B) {
                                                            mVar.I++;
                                                            mVar.G += bufferInfo.size;
                                                            mVar.m(true, bufferInfo);
                                                            mVar.l(bufferInfo.presentationTimeUs);
                                                            mVar.v(true, mVar.f57961n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            mVar.f57949b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    mVar.f57961n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                mVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            mVar.j();
                                            throw th2;
                                        }
                                    }
                                    mVar.j();
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
                                        try {
                                            try {
                                                if (!mVar.f57969w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = mVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = mVar.f57962o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (mVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = mVar.f57962o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = mVar.f57963p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i10 = mVar.X + 1;
                                                                            mVar.X = i10;
                                                                            if (read == -6 || i10 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            mVar.Y++;
                                                                        }
                                                                        if (j16 == j11) {
                                                                            j13 = 0;
                                                                        } else {
                                                                            j13 = j16 + ((1000000 * j17) / 48000);
                                                                        }
                                                                        mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i11 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r5 = mVar.r(i11);
                                                                            n nVar2 = mVar.f57954f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r5);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i11);
                                                                            sb2.append(", timestampSource=");
                                                                            j12 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            nVar2.b(sb2.toString());
                                                                            j16 = r5;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        mVar.f57962o.queueInputBuffer(dequeueInputBuffer, 0, i11 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i11;
                                                                        mVar.i();
                                                                    }
                                                                    j15 = j11;
                                                                }
                                                            }
                                                        }
                                                        j11 = j15;
                                                        j15 = j11;
                                                    }
                                                }
                                            } catch (RuntimeException e11) {
                                                if (!mVar.v) {
                                                    mVar.o(e11);
                                                } else {
                                                    mVar.f57954f.a("audio capture failed while stopping", e11);
                                                }
                                            }
                                            mVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            mVar.j();
                                            throw th3;
                                        }
                                    }
                                    mVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f57972z = 2;
                    this.f57965r.start();
                    this.f57966s.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e10) {
                n();
                throw e10;
            }
        }
        throw new IllegalStateException("Recorder is not prepared");
    }

    public final void u() {
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
        p();
        synchronized (this) {
            try {
                if (this.D && !this.f57971y) {
                    if (!this.E) {
                        n();
                        return;
                    }
                    this.f57971y = true;
                    try {
                        this.f57961n.signalEndOfInputStream();
                    } catch (IllegalStateException e10) {
                        this.f57954f.a("video encoder EOS failed", e10);
                    }
                    h(this.f57965r, 5000L);
                    h(this.f57966s, 5000L);
                    Object obj = "n/a";
                    if (g()) {
                        j10 = this.Q - this.O;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    if (g()) {
                        j11 = this.R - this.P;
                    } else {
                        j11 = Long.MIN_VALUE;
                    }
                    long j14 = this.O;
                    long j15 = this.P;
                    if (j14 != Long.MIN_VALUE && j15 > j14) {
                        j12 = j15 - j14;
                    } else {
                        j12 = 0;
                    }
                    long j16 = this.Q;
                    long j17 = this.R;
                    if (j16 != Long.MIN_VALUE && j17 > j16) {
                        j13 = j17 - j16;
                    } else {
                        j13 = 0;
                    }
                    n nVar = this.f57954f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.I);
                    sb2.append(", videoBytes=");
                    sb2.append(this.G);
                    sb2.append(", videoPts=");
                    long j18 = j12;
                    sb2.append(k(this.O, this.P));
                    sb2.append(", actualVideoBitrate=");
                    long j19 = this.G;
                    if (j18 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j19 * 8000000) / j18);
                    }
                    sb2.append(valueOf);
                    sb2.append(", keyframes=");
                    sb2.append(this.U);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.T);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.V);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.J);
                    sb2.append(", audioBytes=");
                    sb2.append(this.H);
                    sb2.append(", audioPts=");
                    sb2.append(k(this.Q, this.R));
                    sb2.append(", actualAudioBitrate=");
                    long j20 = this.H;
                    if (j13 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j20 * 8000000) / j13);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.W);
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
                    sb2.append(this.X);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.Y);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Z);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.f57947a0);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.f57949b0);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.B == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.B);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j21 = this.f57952d0;
                    if (j21 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j21);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i3 = this.K;
                    if (i3 != 0) {
                        obj = Float.valueOf((((float) this.L) / i3) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.M) / 1000000.0f);
                    nVar.b(sb2.toString());
                    synchronized (this) {
                        try {
                            if (this.f57972z > 0) {
                                this.f57969w = true;
                            }
                        } finally {
                        }
                    }
                    if (this.f57969w) {
                        h(this.f57965r, 1000L);
                        h(this.f57966s, 1000L);
                    }
                    synchronized (this) {
                        try {
                            if (this.f57972z > 0) {
                                this.A = true;
                                this.f57954f.b("codec release deferred until encoder threads exit: running=" + this.f57972z);
                                return;
                            }
                            n();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void v(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i3;
        if (byteBuffer != null && !this.f57970x) {
            if (z10) {
                try {
                    int i10 = this.N;
                    if (i10 > 0 && (bufferInfo.flags & 1) != 0 && (i3 = bufferInfo.size) > i10) {
                        bufferInfo.offset += i10;
                        bufferInfo.size = i3 - i10;
                    }
                } catch (IOException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            this.f57946a.q(z10, byteBuffer, bufferInfo, this.f57948b);
        }
    }
}

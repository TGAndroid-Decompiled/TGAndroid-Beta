package vi;

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
    public final w f50525a;
    public int f50526a0;
    public final long f50527b;
    public int f50528b0;
    public final int f50529c;
    public boolean f50530c0;
    public final int d;
    public long f50531d0;
    public final int e;
    public final n f50532f;
    public final c f50533g;
    public final c h;
    public MediaCodec f50539n;
    public MediaCodec f50540o;
    public AudioRecord f50541p;
    public Surface f50542q;
    public Thread f50543r;
    public Thread f50544s;
    public d f50545t;
    public d f50546u;
    public volatile boolean v;
    public volatile boolean f50547w;
    public volatile boolean f50548x;
    public boolean f50549y;
    public int f50550z;
    public final AtomicBoolean f50534i = new AtomicBoolean();
    public final ArrayList f50535j = new ArrayList();
    public final AudioTimestamp f50536k = new AudioTimestamp();
    public final long[] f50537l = new long[256];
    public final long[] f50538m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public m(w wVar, long j10, int i10, int i11, int i12, n nVar, c cVar, c cVar2) {
        this.f50525a = wVar;
        this.f50527b = j10;
        this.f50529c = i10;
        this.d = i11;
        this.e = i12;
        this.f50532f = nVar;
        this.f50533g = cVar;
        this.h = cVar2;
    }

    public static MediaFormat c(int i10, int i11, int i12) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i10);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i11);
        createVideoFormat.setInteger("frame-rate", i12);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        int remaining;
        int i10 = 0;
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
            i10 = byteBuffer2.remaining();
        }
        return remaining + i10;
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
            this.f50540o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f50532f.b("audio encoder configure: codec=" + this.f50540o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f50540o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f50541p = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i10 = this.f50529c;
        int i11 = this.d;
        int i12 = this.e;
        MediaFormat c10 = c(i10, i11, i12);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f50539n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i10, i10) && videoCapabilities.areSizeAndRateSupported(i10, i10, i12)) {
            this.f50532f.b("video encoder configure: codec=" + this.f50539n.getName() + ", format=" + c10);
            this.f50539n.configure(c10, (Surface) null, (MediaCrypto) null, 1);
            this.f50542q = this.f50539n.createInputSurface();
            return;
        }
        throw new IOException(a1.g.n(i12, " fps", c3.h0.n("Video encoder does not support ", i10, "x", i10, " at ")));
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j10) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f50540o.dequeueOutputBuffer(bufferInfo, j10);
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f50540o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.f50548x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.f50526a0++;
                } else if (this.f50530c0) {
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
                        this.f50535j.add(new l(allocateDirect, bufferInfo2));
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
            this.f50540o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f50540o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.f50540o.getOutputFormat(), false);
        }
        if (z10 && !this.f50530c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z10;
    }

    public final void e(long j10, boolean z10) {
        ArrayList arrayList = this.f50535j;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((l) arrayList.get(i10)).f50515b.presentationTimeUs >= j10) {
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
            } else if (i10 > 0 && j10 - ((l) arrayList.get(i10 - 1)).f50515b.presentationTimeUs <= ((l) arrayList.get(i10)).f50515b.presentationTimeUs - j10) {
                i10--;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                this.Z++;
            }
            l lVar = (l) arrayList.get(i10);
            this.f50531d0 = lVar.f50515b.presentationTimeUs - j10;
            while (i10 < arrayList.size()) {
                l lVar2 = (l) arrayList.get(i10);
                ByteBuffer byteBuffer = lVar2.f50514a;
                MediaCodec.BufferInfo bufferInfo = lVar2.f50515b;
                this.J++;
                this.H += bufferInfo.size;
                m(false, bufferInfo);
                v(false, byteBuffer, bufferInfo);
                i10++;
            }
            arrayList.clear();
            this.f50530c0 = true;
            StringBuilder t10 = a1.g.t(j10, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t10.append(lVar.f50515b.presentationTimeUs);
            t10.append(", deltaUs=");
            t10.append(this.f50531d0);
            this.f50532f.b(t10.toString());
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
                    n nVar = this.f50532f;
                    nVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.f50545t != null && !this.v) {
                d dVar = this.f50545t;
                this.f50545t = null;
                this.f50532f.b("audio capture ready; waiting for common A/V start frame");
                dVar.run();
            }
        }
    }

    public final void j() {
        boolean z10;
        synchronized (this) {
            try {
                z10 = true;
                int i10 = this.f50550z - 1;
                this.f50550z = i10;
                if (!this.A || i10 != 0) {
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
            this.f50532f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j10) {
        int i10;
        long j11 = this.C;
        long max = Math.max(0L, j11 - 256);
        do {
            j11--;
            if (j11 >= max) {
                i10 = (int) (j11 % 256);
            } else {
                return;
            }
        } while (this.f50537l[i10] != j10);
        long nanoTime = System.nanoTime() - this.f50538m[i10];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f50532f.b("codec latency: average=" + ((((float) this.L) / this.K) / 1000000.0f) + " ms, max=" + (((float) this.M) / 1000000.0f) + " ms");
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
        this.f50545t = null;
        this.f50546u = null;
        AudioRecord audioRecord = this.f50541p;
        if (audioRecord != null) {
            audioRecord.release();
            this.f50541p = null;
        }
        Surface surface = this.f50542q;
        if (surface != null) {
            surface.release();
            this.f50542q = null;
        }
        MediaCodec mediaCodec = this.f50539n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f50540o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f50540o = null;
        this.f50539n = null;
        this.f50544s = null;
        this.f50543r = null;
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
        this.f50532f.a(sb2.toString(), runtimeException);
        if (this.f50534i.compareAndSet(false, true)) {
            this.f50533g.a(runtimeException);
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
                    AudioRecord audioRecord = this.f50541p;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e) {
                            this.f50532f.a("AudioRecord stop failed", e);
                        }
                    }
                    n nVar = this.f50532f;
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
        this.f50547w = false;
        this.f50548x = false;
        this.f50549y = false;
        this.f50550z = 0;
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
        this.f50526a0 = 0;
        this.f50528b0 = 0;
        this.f50530c0 = false;
        this.f50531d0 = Long.MIN_VALUE;
        this.f50545t = null;
        this.f50546u = null;
        this.f50535j.clear();
    }

    public final long r(int i10) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i10 * 1000000) / 48000));
        int i11 = Build.VERSION.SDK_INT;
        n nVar = this.f50532f;
        if (i11 >= 24) {
            AudioRecord audioRecord = this.f50541p;
            AudioTimestamp audioTimestamp = this.f50536k;
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
                w wVar = this.f50525a;
                int i10 = this.e;
                synchronized (wVar) {
                    wVar.f50677s = i10;
                }
            } catch (t e) {
                if (!this.f50548x) {
                    this.f50548x = true;
                    this.f50532f.a("recording segment rejected; earlier segments are kept", e);
                    this.h.a(e);
                    return;
                }
                return;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        n nVar = this.f50532f;
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
        this.f50525a.n(mediaFormat, z10);
    }

    public final synchronized void t(d dVar, d dVar2) {
        if (this.E) {
            return;
        }
        if (this.D) {
            try {
                this.f50540o.start();
                this.f50541p.startRecording();
                if (this.f50541p.getRecordingState() == 3) {
                    this.F = SystemClock.elapsedRealtimeNanos();
                    this.f50545t = dVar;
                    this.f50546u = dVar2;
                    this.E = true;
                    n nVar = this.f50532f;
                    nVar.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.f50527b + ", audioSessionId=" + this.f50541p.getAudioSessionId());
                    this.f50543r = new Thread(new Runnable(this) {
                        public final m f50510b;

                        {
                            this.f50510b = this;
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
                            m mVar = this.f50510b;
                            mVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!mVar.v) {
                                                    mVar.o(e);
                                                } else {
                                                    mVar.f50532f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!mVar.f50547w) {
                                                int dequeueOutputBuffer = mVar.f50539n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    mVar.s(mVar.f50539n.getOutputFormat(), true);
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
                                                            mVar.v(true, mVar.f50539n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            mVar.f50528b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    mVar.f50539n.releaseOutputBuffer(dequeueOutputBuffer, false);
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
                                                if (!mVar.f50547w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = mVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = mVar.f50540o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (mVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = mVar.f50540o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = mVar.f50541p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i11 = mVar.X + 1;
                                                                            mVar.X = i11;
                                                                            if (read == -6 || i11 >= 3) {
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
                                                                        mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i12 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r6 = mVar.r(i12);
                                                                            n nVar2 = mVar.f50532f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r6);
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
                                                                            j16 = r6;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i12;
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
                                            } catch (RuntimeException e10) {
                                                if (!mVar.v) {
                                                    mVar.o(e10);
                                                } else {
                                                    mVar.f50532f.a("audio capture failed while stopping", e10);
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
                    this.f50544s = new Thread(new Runnable(this) {
                        public final m f50510b;

                        {
                            this.f50510b = this;
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
                            m mVar = this.f50510b;
                            mVar.getClass();
                            switch (i10) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z11 = false;
                                    while (!z11) {
                                        try {
                                            try {
                                            } catch (RuntimeException e) {
                                                if (!mVar.v) {
                                                    mVar.o(e);
                                                } else {
                                                    mVar.f50532f.a("video drain failed while stopping", e);
                                                }
                                            }
                                            if (!mVar.f50547w) {
                                                int dequeueOutputBuffer = mVar.f50539n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    mVar.s(mVar.f50539n.getOutputFormat(), true);
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
                                                            mVar.v(true, mVar.f50539n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            mVar.f50528b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    mVar.f50539n.releaseOutputBuffer(dequeueOutputBuffer, false);
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
                                                if (!mVar.f50547w) {
                                                    if (z13) {
                                                        j10 = 10000;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    z12 = mVar.d(bufferInfo2, j10);
                                                    if (!z12) {
                                                        int dequeueInputBuffer = mVar.f50540o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (mVar.v) {
                                                                if (j16 == j15) {
                                                                    j14 = 0;
                                                                } else {
                                                                    j14 = j16 + ((1000000 * j17) / 48000);
                                                                }
                                                                mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, j14, 4);
                                                                z13 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = mVar.f50540o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j11 = j15;
                                                                    int read = mVar.f50541p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i11 = mVar.X + 1;
                                                                            mVar.X = i11;
                                                                            if (read == -6 || i11 >= 3) {
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
                                                                        mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 0);
                                                                    } else {
                                                                        int i12 = read / 2;
                                                                        if (j16 == j11) {
                                                                            long r6 = mVar.r(i12);
                                                                            n nVar2 = mVar.f50532f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r6);
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
                                                                            j16 = r6;
                                                                        } else {
                                                                            j12 = 48000;
                                                                        }
                                                                        mVar.f50540o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j16 + ((1000000 * j17) / j12), 0);
                                                                        j17 += i12;
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
                                            } catch (RuntimeException e10) {
                                                if (!mVar.v) {
                                                    mVar.o(e10);
                                                } else {
                                                    mVar.f50532f.a("audio capture failed while stopping", e10);
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
                    this.f50550z = 2;
                    this.f50543r.start();
                    this.f50544s.start();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord");
            } catch (RuntimeException e) {
                n();
                throw e;
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
                if (this.D && !this.f50549y) {
                    if (!this.E) {
                        n();
                        return;
                    }
                    this.f50549y = true;
                    try {
                        this.f50539n.signalEndOfInputStream();
                    } catch (IllegalStateException e) {
                        this.f50532f.a("video encoder EOS failed", e);
                    }
                    h(this.f50543r, 5000L);
                    h(this.f50544s, 5000L);
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
                    n nVar = this.f50532f;
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
                    sb2.append(this.f50526a0);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.f50528b0);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.B == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.B);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j21 = this.f50531d0;
                    if (j21 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j21);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i10 = this.K;
                    if (i10 != 0) {
                        obj = Float.valueOf((((float) this.L) / i10) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.M) / 1000000.0f);
                    nVar.b(sb2.toString());
                    synchronized (this) {
                        try {
                            if (this.f50550z > 0) {
                                this.f50547w = true;
                            }
                        } finally {
                        }
                    }
                    if (this.f50547w) {
                        h(this.f50543r, 1000L);
                        h(this.f50544s, 1000L);
                    }
                    synchronized (this) {
                        try {
                            if (this.f50550z > 0) {
                                this.A = true;
                                this.f50532f.b("codec release deferred until encoder threads exit: running=" + this.f50550z);
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
        int i10;
        if (byteBuffer != null && !this.f50548x) {
            if (z10) {
                try {
                    int i11 = this.N;
                    if (i11 > 0 && (bufferInfo.flags & 1) != 0 && (i10 = bufferInfo.size) > i11) {
                        bufferInfo.offset += i11;
                        bufferInfo.size = i10 - i11;
                    }
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            this.f50525a.q(z10, byteBuffer, bufferInfo, this.f50527b);
        }
    }
}

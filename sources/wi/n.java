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
public final class n implements t {
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
    public final y f57991a;
    public int f57992a0;
    public final long f57993b;
    public int f57994b0;
    public final int f57995c;
    public boolean f57996c0;
    public final int d;
    public long f57997d0;
    public final int f57998e;
    public final o f57999f;
    public final c f58000g;
    public final c h;
    public MediaCodec f58006n;
    public MediaCodec f58007o;
    public AudioRecord f58008p;
    public Surface f58009q;
    public Thread f58010r;
    public Thread f58011s;
    public d f58012t;
    public d f58013u;
    public volatile boolean v;
    public volatile boolean f58014w;
    public volatile boolean f58015x;
    public boolean f58016y;
    public int f58017z;
    public final AtomicBoolean f58001i = new AtomicBoolean();
    public final ArrayList f58002j = new ArrayList();
    public final AudioTimestamp f58003k = new AudioTimestamp();
    public final long[] f58004l = new long[256];
    public final long[] f58005m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public n(y yVar, long j3, int i7, int i10, int i11, o oVar, c cVar, c cVar2) {
        this.f57991a = yVar;
        this.f57993b = j3;
        this.f57995c = i7;
        this.d = i10;
        this.f57998e = i11;
        this.f57999f = oVar;
        this.f58000g = cVar;
        this.h = cVar2;
    }

    public static MediaFormat c(int i7, int i10, int i11) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i7);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i10);
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        int remaining;
        int i7 = 0;
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
            i7 = byteBuffer2.remaining();
        }
        return remaining + i7;
    }

    public static String k(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j3 + ".." + j10;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize > 0) {
            int max = Math.max(minBufferSize * 4, 16384);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("max-input-size", max);
            this.f58007o = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f57999f.b("audio encoder configure: codec=" + this.f58007o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
            this.f58007o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
            this.f58008p = audioRecord;
            if (audioRecord.getState() == 1) {
                return;
            }
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
        throw new IllegalStateException("Unsupported audio recording configuration");
    }

    public final void b() {
        int i7 = this.f57995c;
        int i10 = this.d;
        int i11 = this.f57998e;
        MediaFormat c10 = c(i7, i10, i11);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.f58006n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (videoCapabilities.isSizeSupported(i7, i7) && videoCapabilities.areSizeAndRateSupported(i7, i7, i11)) {
            this.f57999f.b("video encoder configure: codec=" + this.f58006n.getName() + ", format=" + c10);
            this.f58006n.configure(c10, (Surface) null, (MediaCrypto) null, 1);
            this.f58009q = this.f58006n.createInputSurface();
            return;
        }
        throw new IOException(a8.p0.n(i11, " fps", jg.g.o("Video encoder does not support ", i7, "x", i7, " at ")));
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.f58007o.dequeueOutputBuffer(bufferInfo, j3);
        boolean z9 = false;
        while (true) {
            boolean z10 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.f58007o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.f58015x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.f57992a0++;
                } else if (this.f57996c0) {
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
                        this.f58002j.add(new m(allocateDirect, bufferInfo2));
                        long j10 = this.O;
                        if (j10 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j10) {
                            e(j10, false);
                        }
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z10 = false;
            }
            z9 |= z10;
            this.f58007o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f58007o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.f58007o.getOutputFormat(), false);
        }
        if (z9 && !this.f57996c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z9;
    }

    public final void e(long j3, boolean z9) {
        ArrayList arrayList = this.f58002j;
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            while (true) {
                if (i7 < arrayList.size()) {
                    if (((m) arrayList.get(i7)).f57987b.presentationTimeUs >= j3) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 < 0) {
                if (!z9) {
                    return;
                }
                i7 = arrayList.size() - 1;
            } else if (i7 > 0 && j3 - ((m) arrayList.get(i7 - 1)).f57987b.presentationTimeUs <= ((m) arrayList.get(i7)).f57987b.presentationTimeUs - j3) {
                i7--;
            }
            for (int i10 = 0; i10 < i7; i10++) {
                this.Z++;
            }
            m mVar = (m) arrayList.get(i7);
            this.f57997d0 = mVar.f57987b.presentationTimeUs - j3;
            while (i7 < arrayList.size()) {
                m mVar2 = (m) arrayList.get(i7);
                ByteBuffer byteBuffer = mVar2.f57986a;
                MediaCodec.BufferInfo bufferInfo = mVar2.f57987b;
                this.J++;
                this.H += bufferInfo.size;
                m(false, bufferInfo);
                v(false, byteBuffer, bufferInfo);
                i7++;
            }
            arrayList.clear();
            this.f57996c0 = true;
            StringBuilder t6 = a8.p0.t(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
            t6.append(mVar.f57987b.presentationTimeUs);
            t6.append(", deltaUs=");
            t6.append(this.f57997d0);
            this.f57999f.b(t6.toString());
        }
    }

    public final boolean g() {
        if (this.O != Long.MIN_VALUE && this.P != Long.MIN_VALUE && this.Q != Long.MIN_VALUE && this.R != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void h(Thread thread, long j3) {
        if (thread != null) {
            try {
                thread.join(j3);
                if (thread.isAlive()) {
                    o oVar = this.f57999f;
                    oVar.b("encoder thread did not stop: " + thread.getName());
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.f58012t != null && !this.v) {
                d dVar = this.f58012t;
                this.f58012t = null;
                this.f57999f.b("audio capture ready; waiting for common A/V start frame");
                dVar.run();
            }
        }
    }

    public final void j() {
        boolean z9;
        synchronized (this) {
            try {
                z9 = true;
                int i7 = this.f58017z - 1;
                this.f58017z = i7;
                if (!this.A || i7 != 0) {
                    z9 = false;
                }
                if (z9) {
                    this.A = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            this.f57999f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j3) {
        int i7;
        long j10 = this.C;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 >= max) {
                i7 = (int) (j10 % 256);
            } else {
                return;
            }
        } while (this.f58004l[i7] != j3);
        long nanoTime = System.nanoTime() - this.f58005m[i7];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f57999f.b("codec latency: average=" + ((((float) this.L) / this.K) / 1000000.0f) + " ms, max=" + (((float) this.M) / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z9, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (z9) {
            if (this.O == Long.MIN_VALUE) {
                this.O = j3;
            }
            long j10 = this.P;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.V++;
            }
            this.P = Math.max(j10, j3);
            if ((bufferInfo.flags & 1) != 0) {
                this.U++;
                long j11 = this.S;
                if (j11 != Long.MIN_VALUE) {
                    this.T = Math.max(this.T, j3 - j11);
                }
                this.S = j3;
                return;
            }
            return;
        }
        if (this.Q == Long.MIN_VALUE) {
            this.Q = j3;
        }
        long j12 = this.R;
        if (j12 != Long.MIN_VALUE && j3 < j12) {
            this.W++;
        }
        this.R = Math.max(j12, j3);
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.f58012t = null;
        this.f58013u = null;
        AudioRecord audioRecord = this.f58008p;
        if (audioRecord != null) {
            audioRecord.release();
            this.f58008p = null;
        }
        Surface surface = this.f58009q;
        if (surface != null) {
            surface.release();
            this.f58009q = null;
        }
        MediaCodec mediaCodec = this.f58006n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.f58007o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.f58007o = null;
        this.f58006n = null;
        this.f58011s = null;
        this.f58010r = null;
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
        this.f57999f.a(sb2.toString(), runtimeException);
        if (this.f58001i.compareAndSet(false, true)) {
            this.f58000g.a(runtimeException);
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
                    AudioRecord audioRecord = this.f58008p;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e10) {
                            this.f57999f.a("AudioRecord stop failed", e10);
                        }
                    }
                    o oVar = this.f57999f;
                    oVar.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void q() {
        this.v = false;
        this.f58014w = false;
        this.f58015x = false;
        this.f58016y = false;
        this.f58017z = 0;
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
        this.f57992a0 = 0;
        this.f57994b0 = 0;
        this.f57996c0 = false;
        this.f57997d0 = Long.MIN_VALUE;
        this.f58012t = null;
        this.f58013u = null;
        this.f58002j.clear();
    }

    public final long r(int i7) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i7 * 1000000) / 48000));
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f57999f;
        if (i10 >= 24) {
            AudioRecord audioRecord = this.f58008p;
            AudioTimestamp audioTimestamp = this.f58003k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                oVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        oVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z9) {
        String str;
        if (z9) {
            try {
                this.N = f(mediaFormat);
                y yVar = this.f57991a;
                int i7 = this.f57998e;
                synchronized (yVar) {
                    yVar.f58165s = i7;
                }
            } catch (v e10) {
                if (!this.f58015x) {
                    this.f58015x = true;
                    this.f57999f.a("recording segment rejected; earlier segments are kept", e10);
                    this.h.a(e10);
                    return;
                }
                return;
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        o oVar = this.f57999f;
        StringBuilder sb2 = new StringBuilder();
        if (z9) {
            str = "video";
        } else {
            str = "audio";
        }
        sb2.append(str);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        oVar.b(sb2.toString());
        this.f57991a.n(mediaFormat, z9);
    }

    public final synchronized void t(d dVar, d dVar2) {
        if (this.E) {
            return;
        }
        if (this.D) {
            try {
                this.f58007o.start();
                this.f58008p.startRecording();
                if (this.f58008p.getRecordingState() == 3) {
                    this.F = SystemClock.elapsedRealtimeNanos();
                    this.f58012t = dVar;
                    this.f58013u = dVar2;
                    this.E = true;
                    o oVar = this.f57999f;
                    oVar.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.f57993b + ", audioSessionId=" + this.f58008p.getAudioSessionId());
                    this.f58010r = new Thread(new Runnable(this) {
                        public final n f57975b;

                        {
                            this.f57975b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z9;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i7 = r2;
                            n nVar = this.f57975b;
                            nVar.getClass();
                            switch (i7) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z10 = false;
                                    while (!z10) {
                                        try {
                                            try {
                                            } catch (RuntimeException e10) {
                                                if (!nVar.v) {
                                                    nVar.o(e10);
                                                } else {
                                                    nVar.f57999f.a("video drain failed while stopping", e10);
                                                }
                                            }
                                            if (!nVar.f58014w) {
                                                int dequeueOutputBuffer = nVar.f58006n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    nVar.s(nVar.f58006n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        if (bufferInfo.presentationTimeUs < nVar.B) {
                                                            nVar.I++;
                                                            nVar.G += bufferInfo.size;
                                                            nVar.m(true, bufferInfo);
                                                            nVar.l(bufferInfo.presentationTimeUs);
                                                            nVar.v(true, nVar.f58006n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            nVar.f57994b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    nVar.f58006n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                nVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            nVar.j();
                                            throw th2;
                                        }
                                    }
                                    nVar.j();
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z11 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = 0;
                                    while (!z11) {
                                        try {
                                            try {
                                                if (!nVar.f58014w) {
                                                    if (z12) {
                                                        j3 = 10000;
                                                    } else {
                                                        j3 = 0;
                                                    }
                                                    z11 = nVar.d(bufferInfo2, j3);
                                                    if (!z11) {
                                                        int dequeueInputBuffer = nVar.f58007o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (nVar.v) {
                                                                if (j15 == j14) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                                z12 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = nVar.f58007o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j10 = j14;
                                                                    int read = nVar.f58008p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i10 = nVar.X + 1;
                                                                            nVar.X = i10;
                                                                            if (read == -6 || i10 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            nVar.Y++;
                                                                        }
                                                                        if (j15 == j10) {
                                                                            j12 = 0;
                                                                        } else {
                                                                            j12 = j15 + ((1000000 * j16) / 48000);
                                                                        }
                                                                        nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                                    } else {
                                                                        int i11 = read / 2;
                                                                        if (j15 == j10) {
                                                                            long r10 = nVar.r(i11);
                                                                            o oVar2 = nVar.f57999f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r10);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i11);
                                                                            sb2.append(", timestampSource=");
                                                                            j11 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            oVar2.b(sb2.toString());
                                                                            j15 = r10;
                                                                        } else {
                                                                            j11 = 48000;
                                                                        }
                                                                        nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, i11 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                        j16 += i11;
                                                                        nVar.i();
                                                                    }
                                                                    j14 = j10;
                                                                }
                                                            }
                                                        }
                                                        j10 = j14;
                                                        j14 = j10;
                                                    }
                                                }
                                            } catch (RuntimeException e11) {
                                                if (!nVar.v) {
                                                    nVar.o(e11);
                                                } else {
                                                    nVar.f57999f.a("audio capture failed while stopping", e11);
                                                }
                                            }
                                            nVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            nVar.j();
                                            throw th3;
                                        }
                                    }
                                    nVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoVideoEncoder");
                    this.f58011s = new Thread(new Runnable(this) {
                        public final n f57975b;

                        {
                            this.f57975b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z9;
                            long j3;
                            long j10;
                            long j11;
                            String str;
                            long j12;
                            long j13;
                            int i7 = r2;
                            n nVar = this.f57975b;
                            nVar.getClass();
                            switch (i7) {
                                case 0:
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    boolean z10 = false;
                                    while (!z10) {
                                        try {
                                            try {
                                            } catch (RuntimeException e10) {
                                                if (!nVar.v) {
                                                    nVar.o(e10);
                                                } else {
                                                    nVar.f57999f.a("video drain failed while stopping", e10);
                                                }
                                            }
                                            if (!nVar.f58014w) {
                                                int dequeueOutputBuffer = nVar.f58006n.dequeueOutputBuffer(bufferInfo, 10000L);
                                                if (dequeueOutputBuffer == -2) {
                                                    nVar.s(nVar.f58006n.getOutputFormat(), true);
                                                } else if (dequeueOutputBuffer >= 0) {
                                                    if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        if (bufferInfo.presentationTimeUs < nVar.B) {
                                                            nVar.I++;
                                                            nVar.G += bufferInfo.size;
                                                            nVar.m(true, bufferInfo);
                                                            nVar.l(bufferInfo.presentationTimeUs);
                                                            nVar.v(true, nVar.f58006n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                                        } else {
                                                            nVar.f57994b0++;
                                                        }
                                                    }
                                                    if ((bufferInfo.flags & 4) != 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    nVar.f58006n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                }
                                            } else {
                                                nVar.j();
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            nVar.j();
                                            throw th2;
                                        }
                                    }
                                    nVar.j();
                                    return;
                                default:
                                    Process.setThreadPriority(-16);
                                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                                    long j14 = Long.MIN_VALUE;
                                    boolean z11 = false;
                                    long j15 = Long.MIN_VALUE;
                                    boolean z12 = false;
                                    long j16 = 0;
                                    while (!z11) {
                                        try {
                                            try {
                                                if (!nVar.f58014w) {
                                                    if (z12) {
                                                        j3 = 10000;
                                                    } else {
                                                        j3 = 0;
                                                    }
                                                    z11 = nVar.d(bufferInfo2, j3);
                                                    if (!z11) {
                                                        int dequeueInputBuffer = nVar.f58007o.dequeueInputBuffer(10000L);
                                                        if (dequeueInputBuffer >= 0) {
                                                            if (nVar.v) {
                                                                if (j15 == j14) {
                                                                    j13 = 0;
                                                                } else {
                                                                    j13 = j15 + ((1000000 * j16) / 48000);
                                                                }
                                                                nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, j13, 4);
                                                                z12 = true;
                                                            } else {
                                                                ByteBuffer inputBuffer = nVar.f58007o.getInputBuffer(dequeueInputBuffer);
                                                                if (inputBuffer == null) {
                                                                    nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                                } else {
                                                                    inputBuffer.clear();
                                                                    j10 = j14;
                                                                    int read = nVar.f58008p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                                    if (read <= 0) {
                                                                        if (read < 0) {
                                                                            int i10 = nVar.X + 1;
                                                                            nVar.X = i10;
                                                                            if (read == -6 || i10 >= 3) {
                                                                                throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                            }
                                                                        } else {
                                                                            nVar.Y++;
                                                                        }
                                                                        if (j15 == j10) {
                                                                            j12 = 0;
                                                                        } else {
                                                                            j12 = j15 + ((1000000 * j16) / 48000);
                                                                        }
                                                                        nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12, 0);
                                                                    } else {
                                                                        int i11 = read / 2;
                                                                        if (j15 == j10) {
                                                                            long r10 = nVar.r(i11);
                                                                            o oVar2 = nVar.f57999f;
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("first audio input: basePtsUs=");
                                                                            sb2.append(r10);
                                                                            sb2.append(", frames=");
                                                                            sb2.append(i11);
                                                                            sb2.append(", timestampSource=");
                                                                            j11 = 48000;
                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                str = "AudioTimestamp";
                                                                            } else {
                                                                                str = "read completion";
                                                                            }
                                                                            sb2.append(str);
                                                                            oVar2.b(sb2.toString());
                                                                            j15 = r10;
                                                                        } else {
                                                                            j11 = 48000;
                                                                        }
                                                                        nVar.f58007o.queueInputBuffer(dequeueInputBuffer, 0, i11 * 2, j15 + ((1000000 * j16) / j11), 0);
                                                                        j16 += i11;
                                                                        nVar.i();
                                                                    }
                                                                    j14 = j10;
                                                                }
                                                            }
                                                        }
                                                        j10 = j14;
                                                        j14 = j10;
                                                    }
                                                }
                                            } catch (RuntimeException e11) {
                                                if (!nVar.v) {
                                                    nVar.o(e11);
                                                } else {
                                                    nVar.f57999f.a("audio capture failed while stopping", e11);
                                                }
                                            }
                                            nVar.j();
                                            return;
                                        } catch (Throwable th3) {
                                            nVar.j();
                                            throw th3;
                                        }
                                    }
                                    nVar.j();
                                    return;
                            }
                        }
                    }, "RoundVideoAudioEncoder");
                    this.f58017z = 2;
                    this.f58010r.start();
                    this.f58011s.start();
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
        p();
        synchronized (this) {
            try {
                if (this.D && !this.f58016y) {
                    if (!this.E) {
                        n();
                        return;
                    }
                    this.f58016y = true;
                    try {
                        this.f58006n.signalEndOfInputStream();
                    } catch (IllegalStateException e10) {
                        this.f57999f.a("video encoder EOS failed", e10);
                    }
                    h(this.f58010r, 5000L);
                    h(this.f58011s, 5000L);
                    Object obj = "n/a";
                    if (g()) {
                        j3 = this.Q - this.O;
                    } else {
                        j3 = Long.MIN_VALUE;
                    }
                    if (g()) {
                        j10 = this.R - this.P;
                    } else {
                        j10 = Long.MIN_VALUE;
                    }
                    long j13 = this.O;
                    long j14 = this.P;
                    if (j13 != Long.MIN_VALUE && j14 > j13) {
                        j11 = j14 - j13;
                    } else {
                        j11 = 0;
                    }
                    long j15 = this.Q;
                    long j16 = this.R;
                    if (j15 != Long.MIN_VALUE && j16 > j15) {
                        j12 = j16 - j15;
                    } else {
                        j12 = 0;
                    }
                    o oVar = this.f57999f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.I);
                    sb2.append(", videoBytes=");
                    sb2.append(this.G);
                    sb2.append(", videoPts=");
                    long j17 = j11;
                    sb2.append(k(this.O, this.P));
                    sb2.append(", actualVideoBitrate=");
                    long j18 = this.G;
                    if (j17 <= 0) {
                        valueOf = "n/a";
                    } else {
                        valueOf = String.valueOf((j18 * 8000000) / j17);
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
                    long j19 = this.H;
                    if (j12 <= 0) {
                        valueOf2 = "n/a";
                    } else {
                        valueOf2 = String.valueOf((j19 * 8000000) / j12);
                    }
                    sb2.append(valueOf2);
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.W);
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
                    sb2.append(this.X);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.Y);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Z);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.f57992a0);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.f57994b0);
                    sb2.append(", stopPresentationTimeUs=");
                    if (this.B == Long.MAX_VALUE) {
                        valueOf5 = "n/a";
                    } else {
                        valueOf5 = Long.valueOf(this.B);
                    }
                    sb2.append(valueOf5);
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j20 = this.f57997d0;
                    if (j20 == Long.MIN_VALUE) {
                        valueOf6 = "n/a";
                    } else {
                        valueOf6 = String.valueOf(j20);
                    }
                    sb2.append(valueOf6);
                    sb2.append(", codecLatencyAvgMs=");
                    int i7 = this.K;
                    if (i7 != 0) {
                        obj = Float.valueOf((((float) this.L) / i7) / 1000000.0f);
                    }
                    sb2.append(obj);
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(((float) this.M) / 1000000.0f);
                    oVar.b(sb2.toString());
                    synchronized (this) {
                        try {
                            if (this.f58017z > 0) {
                                this.f58014w = true;
                            }
                        } finally {
                        }
                    }
                    if (this.f58014w) {
                        h(this.f58010r, 1000L);
                        h(this.f58011s, 1000L);
                    }
                    synchronized (this) {
                        try {
                            if (this.f58017z > 0) {
                                this.A = true;
                                this.f57999f.b("codec release deferred until encoder threads exit: running=" + this.f58017z);
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

    public final void v(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7;
        if (byteBuffer != null && !this.f58015x) {
            if (z9) {
                try {
                    int i10 = this.N;
                    if (i10 > 0 && (bufferInfo.flags & 1) != 0 && (i7 = bufferInfo.size) > i10) {
                        bufferInfo.offset += i10;
                        bufferInfo.size = i7 - i10;
                    }
                } catch (IOException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            this.f57991a.q(z9, byteBuffer, bufferInfo, this.f57993b);
        }
    }
}

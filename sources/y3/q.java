package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import d5.d0;
import d5.f0;
import h3.t0;
import h3.u0;
import j3.r0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public abstract class q extends h3.e {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public t0 A;
    public long A0;
    public l3.e B;
    public long B0;
    public l3.e C;
    public int C0;
    public MediaCrypto D;
    public boolean E;
    public final long F;
    public float G;
    public float H;
    public k I;
    public t0 J;
    public MediaFormat K;
    public boolean L;
    public float M;
    public ArrayDeque N;
    public p O;
    public n P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final j f49514a;
    public boolean f49515a0;
    public final r f49516b;
    public h f49517b0;
    public final float f49518c;
    public long f49519c0;
    public final k3.i d;
    public int f49520d0;
    public final k3.i f49521e;
    public int f49522e0;
    public final k3.i f49523f;
    public ByteBuffer f49524f0;
    public boolean f49525g0;
    public final g h;
    public boolean f49526h0;
    public boolean f49527i0;
    public boolean f49528j0;
    public boolean f49529k0;
    public boolean f49530l0;
    public int m0;
    public final d0 f49531n;
    public int f49532n0;
    public int f49533o0;
    public boolean f49534p0;
    public boolean f49535q0;
    public final ArrayList f49536r;
    public boolean f49537r0;
    public final MediaCodec.BufferInfo f49538s;
    public long f49539s0;
    public long f49540t0;
    public boolean f49541u0;
    public final long[] v;
    public boolean f49542v0;
    public final long[] f49543w;
    public boolean f49544w0;
    public final long[] f49545x;
    public boolean f49546x0;
    public t0 f49547y;
    public h3.n f49548y0;
    public k3.f f49549z0;

    public q(int i9, j jVar, float f10) {
        super(i9);
        this.f49514a = jVar;
        this.f49516b = r.f49550b;
        this.f49518c = f10;
        this.d = new k3.i(0, 0);
        this.f49521e = new k3.i(0, 0);
        this.f49523f = new k3.i(2, 0);
        ?? iVar = new k3.i(2, 0);
        iVar.f49496s = 32;
        this.h = iVar;
        ?? obj = new Object();
        obj.f4340c = new long[10];
        obj.d = new Object[10];
        this.f49531n = obj;
        this.f49536r = new ArrayList();
        this.f49538s = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = -9223372036854775807L;
        this.v = new long[10];
        this.f49543w = new long[10];
        this.f49545x = new long[10];
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        iVar.c(0);
        iVar.f14608b.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.m0 = 0;
        this.f49520d0 = -1;
        this.f49522e0 = -1;
        this.f49519c0 = -9223372036854775807L;
        this.f49539s0 = -9223372036854775807L;
        this.f49540t0 = -9223372036854775807L;
        this.f49532n0 = 0;
        this.f49533o0 = 0;
    }

    public abstract void A();

    public final void B() {
        int i9 = this.f49533o0;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    this.f49542v0 = true;
                    F();
                    return;
                }
                E();
                r();
                return;
            }
            h();
            O();
            return;
        }
        h();
    }

    public abstract boolean C(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j12, boolean z10, boolean z11, t0 t0Var);

    public final boolean D(int i9) {
        u0 formatHolder = getFormatHolder();
        k3.i iVar = this.d;
        iVar.clear();
        int readSource = readSource(formatHolder, iVar, i9 | 4);
        if (readSource == -5) {
            w(formatHolder);
            return true;
        } else if (readSource == -4 && iVar.isEndOfStream()) {
            this.f49541u0 = true;
            B();
            return false;
        } else {
            return false;
        }
    }

    public final void E() {
        try {
            k kVar = this.I;
            if (kVar != null) {
                kVar.release();
                this.f49549z0.f14598b++;
                v(this.P.f49505a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.I = null;
            try {
                MediaCrypto mediaCrypto2 = this.D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void G() {
        this.f49520d0 = -1;
        this.f49521e.f14608b = null;
        this.f49522e0 = -1;
        this.f49524f0 = null;
        this.f49519c0 = -9223372036854775807L;
        this.f49535q0 = false;
        this.f49534p0 = false;
        this.Y = false;
        this.Z = false;
        this.f49525g0 = false;
        this.f49526h0 = false;
        this.f49536r.clear();
        this.f49539s0 = -9223372036854775807L;
        this.f49540t0 = -9223372036854775807L;
        h hVar = this.f49517b0;
        if (hVar != null) {
            hVar.f49497a = 0L;
            hVar.f49498b = 0L;
            hVar.f49499c = false;
        }
        this.f49532n0 = 0;
        this.f49533o0 = 0;
        this.m0 = this.f49530l0 ? 1 : 0;
    }

    public final void H() {
        G();
        this.f49548y0 = null;
        this.f49517b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.f49537r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f49515a0 = false;
        this.f49530l0 = false;
        this.m0 = 0;
        this.E = false;
    }

    public final void I(l3.e eVar) {
        r0.D(this.B, eVar);
        this.B = eVar;
    }

    public final void J(long j10) {
        this.B0 = j10;
        if (j10 != -9223372036854775807L) {
            y();
        }
    }

    public boolean K(n nVar) {
        return true;
    }

    public boolean L(t0 t0Var) {
        return false;
    }

    public abstract int M(r rVar, t0 t0Var);

    public final boolean N(t0 t0Var) {
        if (f0.f4349a >= 23 && this.I != null && this.f49533o0 != 3 && getState() != 0) {
            float l10 = l(this.H, getStreamFormats());
            float f10 = this.M;
            if (f10 != l10) {
                if (l10 == -1.0f) {
                    if (this.f49534p0) {
                        this.f49532n0 = 1;
                        this.f49533o0 = 3;
                        return false;
                    }
                    E();
                    r();
                    return false;
                } else if (f10 != -1.0f || l10 > this.f49518c) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", l10);
                    this.I.setParameters(bundle);
                    this.M = l10;
                }
            }
        }
        return true;
    }

    public final void O() {
        try {
            MediaCrypto mediaCrypto = this.D;
            n(this.C).getClass();
            mediaCrypto.setMediaDrmSession(null);
            I(this.C);
            this.f49532n0 = 0;
            this.f49533o0 = 0;
        } catch (MediaCryptoException e10) {
            throw createRendererException(e10, this.f49547y, 6006);
        }
    }

    public final void P(long j10) {
        Object obj;
        d0 d0Var = this.f49531n;
        synchronized (d0Var) {
            obj = null;
            while (d0Var.f4339b > 0 && j10 - ((long[]) d0Var.f4340c)[d0Var.f4338a] >= 0) {
                obj = d0Var.f();
            }
        }
        t0 t0Var = (t0) obj;
        if (t0Var == null && this.L) {
            t0Var = (t0) this.f49531n.e();
        }
        if (t0Var != null) {
            this.A = t0Var;
        } else if (!this.L || this.A == null) {
            return;
        }
        x(this.A, this.K);
        this.L = false;
    }

    public final boolean a(long j10, long j11) {
        g gVar;
        d5.a.i(!this.f49542v0);
        g gVar2 = this.h;
        int i9 = gVar2.f49495r;
        if (i9 > 0) {
            gVar = gVar2;
            if (C(j10, j11, null, gVar2.f14608b, this.f49522e0, 0, i9, gVar2.d, gVar2.isDecodeOnly(), gVar2.isEndOfStream(), this.A)) {
                z(gVar.f49494n);
                gVar.clear();
            } else {
                return false;
            }
        } else {
            gVar = gVar2;
        }
        if (this.f49541u0) {
            this.f49542v0 = true;
            return false;
        }
        boolean z10 = this.f49528j0;
        k3.i iVar = this.f49523f;
        if (z10) {
            d5.a.i(gVar.e(iVar));
            this.f49528j0 = false;
        }
        if (this.f49529k0) {
            if (gVar.f49495r > 0) {
                return true;
            }
            d();
            this.f49529k0 = false;
            r();
            if (!this.f49527i0) {
                return false;
            }
        }
        d5.a.i(!this.f49541u0);
        u0 formatHolder = getFormatHolder();
        iVar.clear();
        while (true) {
            iVar.clear();
            int readSource = readSource(formatHolder, iVar, 0);
            if (readSource != -5) {
                if (readSource != -4) {
                    if (readSource != -3) {
                        throw new IllegalStateException();
                    }
                } else if (iVar.isEndOfStream()) {
                    this.f49541u0 = true;
                    break;
                } else {
                    if (this.f49544w0) {
                        t0 t0Var = this.f49547y;
                        t0Var.getClass();
                        this.A = t0Var;
                        x(t0Var, null);
                        this.f49544w0 = false;
                    }
                    iVar.d();
                    if (!gVar.e(iVar)) {
                        this.f49528j0 = true;
                        break;
                    }
                }
            } else {
                w(formatHolder);
                break;
            }
        }
        if (gVar.f49495r > 0) {
            gVar.d();
        }
        if (gVar.f49495r <= 0 && !this.f49541u0 && !this.f49529k0) {
            return false;
        }
        return true;
    }

    public abstract k3.l b(n nVar, t0 t0Var, t0 t0Var2);

    public l c(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void d() {
        this.f49529k0 = false;
        this.h.clear();
        this.f49523f.clear();
        this.f49528j0 = false;
        this.f49527i0 = false;
    }

    public final boolean e() {
        if (this.f49534p0) {
            this.f49532n0 = 1;
            if (!this.S && !this.U) {
                this.f49533o0 = 2;
                return true;
            }
            this.f49533o0 = 3;
            return false;
        }
        O();
        return true;
    }

    public final boolean f(long j10, long j11) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean C;
        boolean z12;
        int d;
        boolean z13;
        boolean z14;
        int i9 = this.f49522e0;
        MediaCodec.BufferInfo bufferInfo2 = this.f49538s;
        if (i9 < 0) {
            if (this.V && this.f49535q0) {
                try {
                    d = this.I.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    B();
                    if (this.f49542v0) {
                        E();
                    }
                }
            } else {
                d = this.I.d(bufferInfo2);
            }
            if (d < 0) {
                if (d == -2) {
                    this.f49537r0 = true;
                    MediaFormat outputFormat = this.I.getOutputFormat();
                    if (this.Q != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.Z = true;
                        return true;
                    }
                    if (this.X) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    this.K = outputFormat;
                    this.L = true;
                    return true;
                }
                if (this.f49515a0 && (this.f49541u0 || this.f49532n0 == 2)) {
                    B();
                    return false;
                }
                return false;
            } else if (this.Z) {
                this.Z = false;
                this.I.releaseOutputBuffer(d, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                B();
                return false;
            } else {
                this.f49522e0 = d;
                ByteBuffer outputBuffer = this.I.getOutputBuffer(d);
                this.f49524f0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f49524f0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j12 = this.f49539s0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j12;
                    }
                }
                long j13 = bufferInfo2.presentationTimeUs;
                ArrayList arrayList = this.f49536r;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        if (((Long) arrayList.get(i10)).longValue() == j13) {
                            arrayList.remove(i10);
                            z13 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                this.f49525g0 = z13;
                long j14 = this.f49540t0;
                long j15 = bufferInfo2.presentationTimeUs;
                if (j14 == j15) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f49526h0 = z14;
                P(j15);
            }
        }
        if (this.V && this.f49535q0) {
            try {
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    C = C(j10, j11, this.I, this.f49524f0, this.f49522e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f49525g0, this.f49526h0, this.A);
                } catch (IllegalStateException unused2) {
                    B();
                    if (this.f49542v0) {
                        E();
                        return z10;
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            C = C(j10, j11, this.I, this.f49524f0, this.f49522e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f49525g0, this.f49526h0, this.A);
        }
        if (C) {
            z(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f49522e0 = -1;
            this.f49524f0 = null;
            if (!z12) {
                return z11;
            }
            B();
            return z10;
        }
        return z10;
    }

    public final boolean g() {
        q qVar;
        boolean z10;
        long j10;
        int i9;
        k kVar = this.I;
        if (kVar != null && this.f49532n0 != 2 && !this.f49541u0) {
            if (this.f49520d0 < 0) {
                int c10 = kVar.c();
                this.f49520d0 = c10;
                if (c10 >= 0) {
                    this.f49521e.f14608b = this.I.getInputBuffer(c10);
                    this.f49521e.clear();
                }
            }
            if (this.f49532n0 == 1) {
                if (!this.f49515a0) {
                    this.f49535q0 = true;
                    this.I.a(0L, this.f49520d0, 0, 4);
                    this.f49520d0 = -1;
                    this.f49521e.f14608b = null;
                }
                this.f49532n0 = 2;
                return false;
            } else if (this.Y) {
                this.Y = false;
                this.f49521e.f14608b.put(D0);
                this.I.a(0L, this.f49520d0, 38, 0);
                this.f49520d0 = -1;
                this.f49521e.f14608b = null;
                this.f49534p0 = true;
                return true;
            } else {
                if (this.m0 == 1) {
                    for (int i10 = 0; i10 < this.J.D.size(); i10++) {
                        this.f49521e.f14608b.put((byte[]) this.J.D.get(i10));
                    }
                    this.m0 = 2;
                }
                int position = this.f49521e.f14608b.position();
                u0 formatHolder = getFormatHolder();
                try {
                    int readSource = readSource(formatHolder, this.f49521e, 0);
                    if (hasReadStreamToEnd()) {
                        this.f49540t0 = this.f49539s0;
                    }
                    if (readSource != -3) {
                        if (readSource == -5) {
                            if (this.m0 == 2) {
                                this.f49521e.clear();
                                this.m0 = 1;
                            }
                            w(formatHolder);
                            return true;
                        } else if (this.f49521e.isEndOfStream()) {
                            if (this.m0 == 2) {
                                this.f49521e.clear();
                                this.m0 = 1;
                            }
                            this.f49541u0 = true;
                            if (!this.f49534p0) {
                                B();
                                return false;
                            }
                            try {
                                if (!this.f49515a0) {
                                    this.f49535q0 = true;
                                    this.I.a(0L, this.f49520d0, 0, 4);
                                    this.f49520d0 = -1;
                                    this.f49521e.f14608b = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e10) {
                                throw createRendererException(e10, this.f49547y, f0.q(e10.getErrorCode()));
                            }
                        } else {
                            if (!this.f49534p0 && !this.f49521e.isKeyFrame()) {
                                this.f49521e.clear();
                                if (this.m0 == 2) {
                                    this.m0 = 1;
                                    return true;
                                }
                            } else {
                                boolean flag = this.f49521e.getFlag(1073741824);
                                if (flag) {
                                    k3.d dVar = this.f49521e.f14607a;
                                    if (position == 0) {
                                        dVar.getClass();
                                    } else {
                                        if (dVar.d == null) {
                                            int[] iArr = new int[1];
                                            dVar.d = iArr;
                                            dVar.f14595i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = dVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.R && !flag) {
                                    ByteBuffer byteBuffer = this.f49521e.f14608b;
                                    int position2 = byteBuffer.position();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = i11 + 1;
                                        if (i13 < position2) {
                                            int i14 = byteBuffer.get(i11) & 255;
                                            if (i12 == 3) {
                                                if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                                    duplicate.position(i11 - 3);
                                                    duplicate.limit(position2);
                                                    byteBuffer.position(0);
                                                    byteBuffer.put(duplicate);
                                                    break;
                                                }
                                            } else if (i14 == 0) {
                                                i12++;
                                            }
                                            if (i14 != 0) {
                                                i12 = 0;
                                            }
                                            i11 = i13;
                                        } else {
                                            byteBuffer.clear();
                                            break;
                                        }
                                    }
                                    if (this.f49521e.f14608b.position() != 0) {
                                        this.R = false;
                                    }
                                }
                                k3.i iVar = this.f49521e;
                                long j11 = iVar.d;
                                h hVar = this.f49517b0;
                                if (hVar != null) {
                                    t0 t0Var = this.f49547y;
                                    if (hVar.f49498b == 0) {
                                        hVar.f49497a = j11;
                                    }
                                    if (!hVar.f49499c) {
                                        ByteBuffer byteBuffer2 = iVar.f14608b;
                                        byteBuffer2.getClass();
                                        int i15 = 0;
                                        for (int i16 = 0; i16 < 4; i16++) {
                                            i15 = (i15 << 8) | (byteBuffer2.get(i16) & 255);
                                        }
                                        int i17 = j3.b.i(i15);
                                        if (i17 == -1) {
                                            hVar.f49499c = true;
                                            hVar.f49498b = 0L;
                                            hVar.f49497a = iVar.d;
                                            d5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                            j11 = iVar.d;
                                        } else {
                                            z10 = flag;
                                            long max = hVar.f49497a + Math.max(0L, ((hVar.f49498b - 529) * 1000000) / t0Var.P);
                                            hVar.f49498b += i17;
                                            j11 = max;
                                            long j12 = this.f49539s0;
                                            h hVar2 = this.f49517b0;
                                            t0 t0Var2 = this.f49547y;
                                            hVar2.getClass();
                                            long max2 = Math.max(j12, Math.max(0L, ((hVar2.f49498b - 529) * 1000000) / t0Var2.P) + hVar2.f49497a);
                                            qVar = this;
                                            qVar.f49539s0 = max2;
                                            j10 = j11;
                                        }
                                    }
                                    z10 = flag;
                                    long j122 = this.f49539s0;
                                    h hVar22 = this.f49517b0;
                                    t0 t0Var22 = this.f49547y;
                                    hVar22.getClass();
                                    long max22 = Math.max(j122, Math.max(0L, ((hVar22.f49498b - 529) * 1000000) / t0Var22.P) + hVar22.f49497a);
                                    qVar = this;
                                    qVar.f49539s0 = max22;
                                    j10 = j11;
                                } else {
                                    qVar = this;
                                    z10 = flag;
                                    j10 = j11;
                                }
                                if (qVar.f49521e.isDecodeOnly()) {
                                    qVar.f49536r.add(Long.valueOf(j10));
                                }
                                if (qVar.f49544w0) {
                                    d0 d0Var = qVar.f49531n;
                                    t0 t0Var3 = qVar.f49547y;
                                    synchronized (d0Var) {
                                        if (d0Var.f4339b > 0) {
                                            if (j10 <= ((long[]) d0Var.f4340c)[((d0Var.f4338a + i9) - 1) % ((Object[]) d0Var.d).length]) {
                                                d0Var.b();
                                            }
                                        }
                                        d0Var.c();
                                        int i18 = d0Var.f4338a;
                                        int i19 = d0Var.f4339b;
                                        Object[] objArr = (Object[]) d0Var.d;
                                        int length = (i18 + i19) % objArr.length;
                                        ((long[]) d0Var.f4340c)[length] = j10;
                                        objArr[length] = t0Var3;
                                        d0Var.f4339b = i19 + 1;
                                    }
                                    qVar.f49544w0 = false;
                                }
                                qVar.f49539s0 = Math.max(qVar.f49539s0, j10);
                                qVar.f49521e.d();
                                if (qVar.f49521e.hasSupplementalData()) {
                                    qVar.p(qVar.f49521e);
                                }
                                qVar.onQueueInputBuffer(qVar.f49521e);
                                try {
                                    if (z10) {
                                        qVar.I.e(qVar.f49520d0, qVar.f49521e.f14607a, j10);
                                    } else {
                                        qVar.I.a(j10, qVar.f49520d0, qVar.f49521e.f14608b.limit(), 0);
                                    }
                                    qVar.f49520d0 = -1;
                                    qVar.f49521e.f14608b = null;
                                    qVar.f49534p0 = true;
                                    qVar.m0 = 0;
                                    qVar.f49549z0.f14599c++;
                                    return true;
                                } catch (MediaCodec.CryptoException e11) {
                                    throw qVar.createRendererException(e11, qVar.f49547y, f0.q(e11.getErrorCode()));
                                }
                            }
                            return true;
                        }
                    }
                } catch (k3.h e12) {
                    t(e12);
                    D(0);
                    h();
                    return true;
                }
            }
        }
        return false;
    }

    public final void h() {
        try {
            this.I.flush();
        } finally {
            G();
        }
    }

    public final boolean i() {
        boolean z10;
        if (this.I == null) {
            return false;
        }
        int i9 = this.f49533o0;
        if (i9 != 3 && !this.S && ((!this.T || this.f49537r0) && (!this.U || !this.f49535q0))) {
            if (i9 == 2) {
                int i10 = f0.f4349a;
                if (i10 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                if (i10 >= 23) {
                    try {
                        O();
                    } catch (h3.n e10) {
                        d5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        E();
                        return true;
                    }
                }
            }
            h();
            return false;
        }
        E();
        return true;
    }

    @Override
    public boolean isEnded() {
        return this.f49542v0;
    }

    @Override
    public boolean isReady() {
        if (this.f49547y != null) {
            if (!isSourceReady() && this.f49522e0 < 0) {
                if (this.f49519c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f49519c0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final List j(boolean z10) {
        t0 t0Var = this.f49547y;
        r rVar = this.f49516b;
        ArrayList m10 = m(rVar, t0Var, z10);
        if (m10.isEmpty() && z10) {
            ArrayList m11 = m(rVar, this.f49547y, false);
            if (!m11.isEmpty()) {
                d5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f49547y.B + ", but no secure decoder available. Trying to proceed with " + m11 + ".");
            }
            return m11;
        }
        return m10;
    }

    public boolean k() {
        return false;
    }

    public abstract float l(float f10, t0[] t0VarArr);

    public abstract ArrayList m(r rVar, t0 t0Var, boolean z10);

    public final l3.j n(l3.e eVar) {
        k3.b y10 = eVar.y();
        if (y10 != null && !(y10 instanceof l3.j)) {
            throw createRendererException(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + y10), this.f49547y, 6001);
        }
        return (l3.j) y10;
    }

    public abstract i o(n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10);

    @Override
    public void onDisabled() {
        this.f49547y = null;
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        this.C0 = 0;
        i();
    }

    @Override
    public void onPositionReset(long j10, boolean z10) {
        int i9;
        this.f49541u0 = false;
        this.f49542v0 = false;
        this.f49546x0 = false;
        if (this.f49527i0) {
            this.h.clear();
            this.f49523f.clear();
            this.f49528j0 = false;
        } else if (i()) {
            r();
        }
        d0 d0Var = this.f49531n;
        synchronized (d0Var) {
            i9 = d0Var.f4339b;
        }
        if (i9 > 0) {
            this.f49544w0 = true;
        }
        this.f49531n.b();
        int i10 = this.C0;
        if (i10 != 0) {
            J(this.f49543w[i10 - 1]);
            this.A0 = this.v[this.C0 - 1];
            this.C0 = 0;
        }
    }

    public abstract void onQueueInputBuffer(k3.i iVar);

    @Override
    public void onReset() {
        try {
            d();
            E();
        } finally {
            r0.D(this.C, null);
            this.C = null;
        }
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.B0 == -9223372036854775807L) {
            if (this.A0 != -9223372036854775807L) {
                z10 = false;
            }
            d5.a.i(z10);
            this.A0 = j10;
            J(j11);
            return;
        }
        int i9 = this.C0;
        long[] jArr = this.f49543w;
        if (i9 == jArr.length) {
            d5.a.K("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.C0 - 1]);
        } else {
            this.C0 = i9 + 1;
        }
        int i10 = this.C0;
        this.v[i10 - 1] = j10;
        jArr[i10 - 1] = j11;
        long j12 = this.f49539s0;
        this.f49545x[i10 - 1] = j12;
    }

    public final void q(y3.n r27, android.media.MediaCrypto r28) {
        throw new UnsupportedOperationException("Method not decompiled: y3.q.q(y3.n, android.media.MediaCrypto):void");
    }

    public final void r() {
        t0 t0Var;
        if (this.I == null && !this.f49527i0 && (t0Var = this.f49547y) != null) {
            if (this.C == null && L(t0Var)) {
                t0 t0Var2 = this.f49547y;
                d();
                String str = t0Var2.B;
                boolean equals = "audio/mp4a-latm".equals(str);
                g gVar = this.h;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    gVar.getClass();
                    gVar.f49496s = 1;
                } else {
                    gVar.getClass();
                    gVar.f49496s = 32;
                }
                this.f49527i0 = true;
                return;
            }
            I(this.C);
            String str2 = this.f49547y.B;
            l3.e eVar = this.B;
            if (eVar != null) {
                if (this.D == null) {
                    n(eVar);
                    if (this.B.x() == null) {
                        return;
                    }
                }
                if (l3.j.f16640a) {
                    int j10 = this.B.j();
                    if (j10 != 1) {
                        if (j10 != 4) {
                            return;
                        }
                    } else {
                        l3.d x10 = this.B.x();
                        x10.getClass();
                        throw createRendererException(x10, this.f49547y, x10.f16636a);
                    }
                }
            }
            try {
                s(this.D, this.E);
            } catch (p e10) {
                throw createRendererException(e10, this.f49547y, 4001);
            }
        }
    }

    @Override
    public final void render(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: y3.q.render(long, long):void");
    }

    public final void s(android.media.MediaCrypto r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: y3.q.s(android.media.MediaCrypto, boolean):void");
    }

    @Override
    public void setPlaybackSpeed(float f10, float f11) {
        this.G = f10;
        this.H = f11;
        N(this.J);
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        try {
            return M(this.f49516b, t0Var);
        } catch (t e10) {
            throw createRendererException(e10, t0Var, 4002);
        }
    }

    @Override
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public abstract void t(Exception exc);

    public abstract void u(long j10, long j11, String str);

    public abstract void v(String str);

    public k3.l w(h3.u0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: y3.q.w(h3.u0):k3.l");
    }

    public abstract void x(t0 t0Var, MediaFormat mediaFormat);

    public void z(long j10) {
        while (this.C0 != 0) {
            long[] jArr = this.f49545x;
            if (j10 >= jArr[0]) {
                long[] jArr2 = this.v;
                this.A0 = jArr2[0];
                long[] jArr3 = this.f49543w;
                J(jArr3[0]);
                int i9 = this.C0 - 1;
                this.C0 = i9;
                System.arraycopy(jArr2, 1, jArr2, 0, i9);
                System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
                System.arraycopy(jArr, 1, jArr, 0, this.C0);
                A();
            } else {
                return;
            }
        }
    }

    public void F() {
    }

    public void y() {
    }

    public void p(k3.i iVar) {
    }
}

package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import d5.e0;
import d5.g0;
import f9.y;
import h3.t0;
import h3.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.telegram.ui.Cells.pa;

public abstract class q extends h3.e {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public t0 A;
    public long A0;
    public l3.f B;
    public long B0;
    public l3.f C;
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

    public final j f49504a;

    public boolean f49505a0;

    public final r f49506b;

    public h f49507b0;

    public final float f49508c;

    public long f49509c0;
    public final k3.i d;

    public int f49510d0;

    public final k3.i f49511e;

    public int f49512e0;

    public final k3.i f49513f;

    public ByteBuffer f49514f0;

    public boolean f49515g0;
    public final g h;

    public boolean f49516h0;

    public boolean f49517i0;

    public boolean f49518j0;

    public boolean f49519k0;

    public boolean f49520l0;
    public int m0;

    public final e0 f49521n;

    public int f49522n0;

    public int f49523o0;

    public boolean f49524p0;

    public boolean f49525q0;

    public final ArrayList f49526r;

    public boolean f49527r0;

    public final MediaCodec.BufferInfo f49528s;

    public long f49529s0;

    public long f49530t0;

    public boolean f49531u0;
    public final long[] v;

    public boolean f49532v0;

    public final long[] f49533w;

    public boolean f49534w0;

    public final long[] f49535x;

    public boolean f49536x0;

    public t0 f49537y;

    public h3.n f49538y0;

    public k3.f f49539z0;

    public q(int i10, j jVar, float f10) {
        super(i10);
        this.f49504a = jVar;
        this.f49506b = r.f49540b;
        this.f49508c = f10;
        this.d = new k3.i(0, 0);
        this.f49511e = new k3.i(0, 0);
        this.f49513f = new k3.i(2, 0);
        g gVar = new g(2, 0);
        gVar.f49486s = 32;
        this.h = gVar;
        e0 e0Var = new e0();
        e0Var.f4790c = new long[10];
        e0Var.d = new Object[10];
        this.f49521n = e0Var;
        this.f49526r = new ArrayList();
        this.f49528s = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = -9223372036854775807L;
        this.v = new long[10];
        this.f49533w = new long[10];
        this.f49535x = new long[10];
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        gVar.b(0);
        gVar.f14429b.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.m0 = 0;
        this.f49510d0 = -1;
        this.f49512e0 = -1;
        this.f49509c0 = -9223372036854775807L;
        this.f49529s0 = -9223372036854775807L;
        this.f49530t0 = -9223372036854775807L;
        this.f49522n0 = 0;
        this.f49523o0 = 0;
    }

    public abstract void A();

    public final void B() throws h3.n {
        int i10 = this.f49523o0;
        if (i10 == 1) {
            h();
            return;
        }
        if (i10 == 2) {
            h();
            O();
        } else if (i10 != 3) {
            this.f49532v0 = true;
            F();
        } else {
            E();
            r();
        }
    }

    public abstract boolean C(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t0 t0Var);

    public final boolean D(int i10) throws h3.n {
        u0 formatHolder = getFormatHolder();
        k3.i iVar = this.d;
        iVar.clear();
        int source = readSource(formatHolder, iVar, i10 | 4);
        if (source == -5) {
            w(formatHolder);
            return true;
        }
        if (source != -4 || !iVar.isEndOfStream()) {
            return false;
        }
        this.f49531u0 = true;
        B();
        return false;
    }

    public final void E() {
        try {
            k kVar = this.I;
            if (kVar != null) {
                kVar.release();
                this.f49539z0.f14419b++;
                v(this.P.f49495a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.D = null;
                I(null);
                H();
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
                this.D = null;
                I(null);
                H();
            }
        }
    }

    public void G() {
        this.f49510d0 = -1;
        this.f49511e.f14429b = null;
        this.f49512e0 = -1;
        this.f49514f0 = null;
        this.f49509c0 = -9223372036854775807L;
        this.f49525q0 = false;
        this.f49524p0 = false;
        this.Y = false;
        this.Z = false;
        this.f49515g0 = false;
        this.f49516h0 = false;
        this.f49526r.clear();
        this.f49529s0 = -9223372036854775807L;
        this.f49530t0 = -9223372036854775807L;
        h hVar = this.f49507b0;
        if (hVar != null) {
            hVar.f49487a = 0L;
            hVar.f49488b = 0L;
            hVar.f49489c = false;
        }
        this.f49522n0 = 0;
        this.f49523o0 = 0;
        this.m0 = this.f49520l0 ? 1 : 0;
    }

    public final void H() {
        G();
        this.f49538y0 = null;
        this.f49507b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.f49527r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f49505a0 = false;
        this.f49520l0 = false;
        this.m0 = 0;
        this.E = false;
    }

    public final void I(l3.f fVar) {
        i0.a.D(this.B, fVar);
        this.B = fVar;
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
        if (g0.f4795a >= 23 && this.I != null && this.f49523o0 != 3 && getState() != 0) {
            float fL = l(this.H, getStreamFormats());
            float f10 = this.M;
            if (f10 != fL) {
                if (fL == -1.0f) {
                    if (this.f49524p0) {
                        this.f49522n0 = 1;
                        this.f49523o0 = 3;
                        return false;
                    }
                    E();
                    r();
                    return false;
                }
                if (f10 != -1.0f || fL > this.f49508c) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fL);
                    this.I.setParameters(bundle);
                    this.M = fL;
                }
            }
        }
        return true;
    }

    public final void O() throws h3.n {
        try {
            MediaCrypto mediaCrypto = this.D;
            n(this.C).getClass();
            mediaCrypto.setMediaDrmSession(null);
            I(this.C);
            this.f49522n0 = 0;
            this.f49523o0 = 0;
        } catch (MediaCryptoException e9) {
            throw createRendererException(e9, this.f49537y, 6006);
        }
    }

    public final void P(long j10) {
        Object objF;
        e0 e0Var = this.f49521n;
        synchronized (e0Var) {
            objF = null;
            while (e0Var.f4789b > 0 && j10 - ((long[]) e0Var.f4790c)[e0Var.f4788a] >= 0) {
                objF = e0Var.f();
            }
        }
        t0 t0Var = (t0) objF;
        if (t0Var == null && this.L) {
            t0Var = (t0) this.f49521n.e();
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
        d5.a.i(!this.f49532v0);
        g gVar2 = this.h;
        int i10 = gVar2.f49485r;
        if (i10 > 0) {
            gVar = gVar2;
            if (!C(j10, j11, null, gVar2.f14429b, this.f49512e0, 0, i10, gVar2.d, gVar2.isDecodeOnly(), gVar2.isEndOfStream(), this.A)) {
                return false;
            }
            z(gVar.f49484n);
            gVar.clear();
        } else {
            gVar = gVar2;
        }
        if (this.f49531u0) {
            this.f49532v0 = true;
            return false;
        }
        boolean z10 = this.f49518j0;
        k3.i iVar = this.f49513f;
        if (z10) {
            d5.a.i(gVar.e(iVar));
            this.f49518j0 = false;
        }
        if (this.f49519k0) {
            if (gVar.f49485r > 0) {
                return true;
            }
            d();
            this.f49519k0 = false;
            r();
            if (!this.f49517i0) {
                return false;
            }
        }
        d5.a.i(!this.f49531u0);
        u0 formatHolder = getFormatHolder();
        iVar.clear();
        while (true) {
            iVar.clear();
            int source = readSource(formatHolder, iVar, 0);
            if (source == -5) {
                w(formatHolder);
                break;
            }
            if (source != -4) {
                if (source == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (iVar.isEndOfStream()) {
                this.f49531u0 = true;
                break;
            }
            if (this.f49534w0) {
                t0 t0Var = this.f49537y;
                t0Var.getClass();
                this.A = t0Var;
                x(t0Var, null);
                this.f49534w0 = false;
            }
            iVar.d();
            if (!gVar.e(iVar)) {
                this.f49518j0 = true;
                break;
            }
        }
        if (gVar.f49485r > 0) {
            gVar.d();
        }
        return gVar.f49485r > 0 || this.f49531u0 || this.f49519k0;
    }

    public abstract k3.l b(n nVar, t0 t0Var, t0 t0Var2);

    public l c(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void d() {
        this.f49519k0 = false;
        this.h.clear();
        this.f49513f.clear();
        this.f49518j0 = false;
        this.f49517i0 = false;
    }

    public final boolean e() throws h3.n {
        if (!this.f49524p0) {
            O();
            return true;
        }
        this.f49522n0 = 1;
        if (this.S || this.U) {
            this.f49523o0 = 3;
            return false;
        }
        this.f49523o0 = 2;
        return true;
    }

    public final boolean f(long j10, long j11) throws h3.n {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean zC;
        int iD;
        boolean z12;
        int i10 = this.f49512e0;
        MediaCodec.BufferInfo bufferInfo2 = this.f49528s;
        if (i10 < 0) {
            if (this.V && this.f49525q0) {
                try {
                    iD = this.I.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    B();
                    if (this.f49532v0) {
                        E();
                    }
                }
            } else {
                iD = this.I.d(bufferInfo2);
            }
            if (iD < 0) {
                if (iD != -2) {
                    if (this.f49505a0 && (this.f49531u0 || this.f49522n0 == 2)) {
                        B();
                        return false;
                    }
                    return false;
                }
                this.f49527r0 = true;
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
            if (this.Z) {
                this.Z = false;
                this.I.releaseOutputBuffer(iD, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                B();
                return false;
            }
            this.f49512e0 = iD;
            ByteBuffer outputBuffer = this.I.getOutputBuffer(iD);
            this.f49514f0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f49514f0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.f49529s0;
                if (j12 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f49526r;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z12 = false;
                    break;
                }
                if (((Long) arrayList.get(i11)).longValue() == j13) {
                    arrayList.remove(i11);
                    z12 = true;
                    break;
                }
                i11++;
            }
            this.f49515g0 = z12;
            long j14 = this.f49530t0;
            long j15 = bufferInfo2.presentationTimeUs;
            this.f49516h0 = j14 == j15;
            P(j15);
        }
        if (this.V && this.f49525q0) {
            try {
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    zC = C(j10, j11, this.I, this.f49514f0, this.f49512e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f49515g0, this.f49516h0, this.A);
                } catch (IllegalStateException unused2) {
                    B();
                    if (!this.f49532v0) {
                        return z10;
                    }
                    E();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            zC = C(j10, j11, this.I, this.f49514f0, this.f49512e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f49515g0, this.f49516h0, this.A);
        }
        if (!zC) {
            return z10;
        }
        z(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0;
        this.f49512e0 = -1;
        this.f49514f0 = null;
        if (!z13) {
            return z11;
        }
        B();
        return z10;
    }

    public final boolean g() throws h3.n {
        int iPosition;
        u0 formatHolder;
        int source;
        boolean flag;
        k3.i iVar;
        long j10;
        h hVar;
        q qVar;
        long j11;
        e0 e0Var;
        t0 t0Var;
        int i10;
        t0 t0Var2;
        ByteBuffer byteBuffer;
        int i11;
        int i12;
        int i13;
        ByteBuffer byteBuffer2;
        int iPosition2;
        int i14;
        int i15;
        int i16;
        int i17;
        k3.d dVar;
        int i18;
        k kVar = this.I;
        if (kVar != null && this.f49522n0 != 2 && !this.f49531u0) {
            if (this.f49510d0 < 0) {
                int iC = kVar.c();
                this.f49510d0 = iC;
                if (iC >= 0) {
                    this.f49511e.f14429b = this.I.getInputBuffer(iC);
                    this.f49511e.clear();
                    if (this.f49522n0 == 1) {
                        if (!this.f49505a0) {
                            this.f49525q0 = true;
                            this.I.a(0L, this.f49510d0, 0, 4);
                            this.f49510d0 = -1;
                            this.f49511e.f14429b = null;
                        }
                        this.f49522n0 = 2;
                        return false;
                    }
                    if (this.Y) {
                        this.Y = false;
                        this.f49511e.f14429b.put(D0);
                        this.I.a(0L, this.f49510d0, 38, 0);
                        this.f49510d0 = -1;
                        this.f49511e.f14429b = null;
                        this.f49524p0 = true;
                        return true;
                    }
                    if (this.m0 == 1) {
                        for (i18 = 0; i18 < this.J.D.size(); i18++) {
                            this.f49511e.f14429b.put((byte[]) this.J.D.get(i18));
                        }
                        this.m0 = 2;
                    }
                    iPosition = this.f49511e.f14429b.position();
                    formatHolder = getFormatHolder();
                    try {
                        source = readSource(formatHolder, this.f49511e, 0);
                        if (hasReadStreamToEnd()) {
                            this.f49530t0 = this.f49529s0;
                        }
                        if (source != -3) {
                            if (source == -5) {
                                if (this.m0 == 2) {
                                    this.f49511e.clear();
                                    this.m0 = 1;
                                }
                                w(formatHolder);
                                return true;
                            }
                            if (this.f49511e.isEndOfStream()) {
                                if (!this.f49524p0 || this.f49511e.isKeyFrame()) {
                                    flag = this.f49511e.getFlag(1073741824);
                                    if (flag) {
                                        dVar = this.f49511e.f14428a;
                                        if (iPosition == 0) {
                                            dVar.getClass();
                                        } else {
                                            if (dVar.d == null) {
                                                int[] iArr = new int[1];
                                                dVar.d = iArr;
                                                dVar.f14416i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = dVar.d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    if (this.R && !flag) {
                                        byteBuffer2 = this.f49511e.f14429b;
                                        iPosition2 = byteBuffer2.position();
                                        i14 = 0;
                                        i15 = 0;
                                        while (true) {
                                            i16 = i14 + 1;
                                            if (i16 >= iPosition2) {
                                                byteBuffer2.clear();
                                                break;
                                            }
                                            i17 = byteBuffer2.get(i14) & 255;
                                            if (i15 == 3) {
                                                if (i17 == 1 && (byteBuffer2.get(i16) & 31) == 7) {
                                                    ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                                                    byteBufferDuplicate.position(i14 - 3);
                                                    byteBufferDuplicate.limit(iPosition2);
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.put(byteBufferDuplicate);
                                                    break;
                                                }
                                            } else if (i17 == 0) {
                                                i15++;
                                            }
                                            if (i17 != 0) {
                                                i15 = 0;
                                            }
                                            i14 = i16;
                                        }
                                        if (this.f49511e.f14429b.position() != 0) {
                                            this.R = false;
                                        }
                                    }
                                    iVar = this.f49511e;
                                    j10 = iVar.d;
                                    hVar = this.f49507b0;
                                    if (hVar != null) {
                                        t0Var2 = this.f49537y;
                                        if (hVar.f49488b == 0) {
                                            hVar.f49487a = j10;
                                        }
                                        if (!hVar.f49489c) {
                                            byteBuffer = iVar.f14429b;
                                            byteBuffer.getClass();
                                            i12 = 0;
                                            for (i11 = 0; i11 < 4; i11++) {
                                                i12 = (i12 << 8) | (byteBuffer.get(i11) & 255);
                                            }
                                            i13 = j3.b.i(i12);
                                            if (i13 == -1) {
                                                hVar.f49489c = true;
                                                hVar.f49488b = 0L;
                                                hVar.f49487a = iVar.d;
                                                d5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                                j10 = iVar.d;
                                            } else {
                                                long jMax = hVar.f49487a + Math.max(0L, ((hVar.f49488b - 529) * 1000000) / ((long) t0Var2.P));
                                                hVar.f49488b += (long) i13;
                                                j10 = jMax;
                                            }
                                        }
                                        long j12 = this.f49529s0;
                                        h hVar2 = this.f49507b0;
                                        t0 t0Var3 = this.f49537y;
                                        hVar2.getClass();
                                        long jMax2 = Math.max(j12, Math.max(0L, ((hVar2.f49488b - 529) * 1000000) / t0Var3.P) + hVar2.f49487a);
                                        qVar = this;
                                        qVar.f49529s0 = jMax2;
                                        j11 = j10;
                                    } else {
                                        qVar = this;
                                        flag = flag;
                                        j11 = j10;
                                    }
                                    if (qVar.f49511e.isDecodeOnly()) {
                                        qVar.f49526r.add(Long.valueOf(j11));
                                    }
                                    if (qVar.f49534w0) {
                                        e0Var = qVar.f49521n;
                                        t0Var = qVar.f49537y;
                                        synchronized (e0Var) {
                                            i10 = e0Var.f4789b;
                                            if (i10 > 0) {
                                                if (j11 <= ((long[]) e0Var.f4790c)[((e0Var.f4788a + i10) - 1) % ((Object[]) e0Var.d).length]) {
                                                    e0Var.b();
                                                }
                                            }
                                            e0Var.c();
                                            int i19 = e0Var.f4788a;
                                            int i20 = e0Var.f4789b;
                                            Object[] objArr = (Object[]) e0Var.d;
                                            int length = (i19 + i20) % objArr.length;
                                            ((long[]) e0Var.f4790c)[length] = j11;
                                            objArr[length] = t0Var;
                                            e0Var.f4789b = i20 + 1;
                                        }
                                        qVar.f49534w0 = false;
                                    }
                                    qVar.f49529s0 = Math.max(qVar.f49529s0, j11);
                                    qVar.f49511e.d();
                                    if (qVar.f49511e.hasSupplementalData()) {
                                        qVar.p(qVar.f49511e);
                                    }
                                    qVar.onQueueInputBuffer(qVar.f49511e);
                                    try {
                                        if (flag) {
                                            qVar.I.e(qVar.f49510d0, qVar.f49511e.f14428a, j11);
                                        } else {
                                            qVar.I.a(j11, qVar.f49510d0, qVar.f49511e.f14429b.limit(), 0);
                                        }
                                        qVar.f49510d0 = -1;
                                        qVar.f49511e.f14429b = null;
                                        qVar.f49524p0 = true;
                                        qVar.m0 = 0;
                                        qVar.f49539z0.f14420c++;
                                        return true;
                                    } catch (MediaCodec.CryptoException e9) {
                                        throw qVar.createRendererException(e9, qVar.f49537y, g0.q(e9.getErrorCode()));
                                    }
                                }
                                this.f49511e.clear();
                                if (this.m0 == 2) {
                                    this.m0 = 1;
                                    return true;
                                }
                                return true;
                            }
                            if (this.m0 == 2) {
                                this.f49511e.clear();
                                this.m0 = 1;
                            }
                            this.f49531u0 = true;
                            if (!this.f49524p0) {
                                B();
                                return false;
                            }
                            try {
                                if (this.f49505a0) {
                                    this.f49525q0 = true;
                                    this.I.a(0L, this.f49510d0, 0, 4);
                                    this.f49510d0 = -1;
                                    this.f49511e.f14429b = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e10) {
                                throw createRendererException(e10, this.f49537y, g0.q(e10.getErrorCode()));
                            }
                        }
                    } catch (k3.h e11) {
                        t(e11);
                        D(0);
                        h();
                        return true;
                    }
                }
            } else {
                if (this.f49522n0 == 1) {
                    if (!this.f49505a0) {
                        this.f49525q0 = true;
                        this.I.a(0L, this.f49510d0, 0, 4);
                        this.f49510d0 = -1;
                        this.f49511e.f14429b = null;
                    }
                    this.f49522n0 = 2;
                    return false;
                }
                if (this.Y) {
                    this.Y = false;
                    this.f49511e.f14429b.put(D0);
                    this.I.a(0L, this.f49510d0, 38, 0);
                    this.f49510d0 = -1;
                    this.f49511e.f14429b = null;
                    this.f49524p0 = true;
                    return true;
                }
                if (this.m0 == 1) {
                    while (i18 < this.J.D.size()) {
                        this.f49511e.f14429b.put((byte[]) this.J.D.get(i18));
                    }
                    this.m0 = 2;
                }
                iPosition = this.f49511e.f14429b.position();
                formatHolder = getFormatHolder();
                source = readSource(formatHolder, this.f49511e, 0);
                if (hasReadStreamToEnd()) {
                    this.f49530t0 = this.f49529s0;
                }
                if (source != -3) {
                    if (source == -5) {
                        if (this.m0 == 2) {
                            this.f49511e.clear();
                            this.m0 = 1;
                        }
                        w(formatHolder);
                        return true;
                    }
                    if (this.f49511e.isEndOfStream()) {
                        if (this.f49524p0) {
                            flag = this.f49511e.getFlag(1073741824);
                            if (flag) {
                                dVar = this.f49511e.f14428a;
                                if (iPosition == 0) {
                                    dVar.getClass();
                                } else {
                                    if (dVar.d == null) {
                                        int[] iArr3 = new int[1];
                                        dVar.d = iArr3;
                                        dVar.f14416i.numBytesOfClearData = iArr3;
                                    }
                                    int[] iArr4 = dVar.d;
                                    iArr4[0] = iArr4[0] + iPosition;
                                }
                            }
                            if (this.R) {
                                byteBuffer2 = this.f49511e.f14429b;
                                iPosition2 = byteBuffer2.position();
                                i14 = 0;
                                i15 = 0;
                                while (true) {
                                    i16 = i14 + 1;
                                    if (i16 >= iPosition2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    i17 = byteBuffer2.get(i14) & 255;
                                    if (i15 == 3) {
                                        if (i17 == 1) {
                                            ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                                            byteBufferDuplicate2.position(i14 - 3);
                                            byteBufferDuplicate2.limit(iPosition2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(byteBufferDuplicate2);
                                            break;
                                        }
                                    } else if (i17 == 0) {
                                        i15++;
                                    }
                                    if (i17 != 0) {
                                        i15 = 0;
                                    }
                                    i14 = i16;
                                }
                                if (this.f49511e.f14429b.position() != 0) {
                                    this.R = false;
                                }
                            }
                            iVar = this.f49511e;
                            j10 = iVar.d;
                            hVar = this.f49507b0;
                            if (hVar != null) {
                                t0Var2 = this.f49537y;
                                if (hVar.f49488b == 0) {
                                    hVar.f49487a = j10;
                                }
                                if (!hVar.f49489c) {
                                    byteBuffer = iVar.f14429b;
                                    byteBuffer.getClass();
                                    i12 = 0;
                                    while (i11 < 4) {
                                        i12 = (i12 << 8) | (byteBuffer.get(i11) & 255);
                                    }
                                    i13 = j3.b.i(i12);
                                    if (i13 == -1) {
                                        hVar.f49489c = true;
                                        hVar.f49488b = 0L;
                                        hVar.f49487a = iVar.d;
                                        d5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        j10 = iVar.d;
                                    } else {
                                        long jMax3 = hVar.f49487a + Math.max(0L, ((hVar.f49488b - 529) * 1000000) / ((long) t0Var2.P));
                                        hVar.f49488b += (long) i13;
                                        j10 = jMax3;
                                    }
                                }
                                long j13 = this.f49529s0;
                                h hVar3 = this.f49507b0;
                                t0 t0Var4 = this.f49537y;
                                hVar3.getClass();
                                long jMax4 = Math.max(j13, Math.max(0L, ((hVar3.f49488b - 529) * 1000000) / t0Var4.P) + hVar3.f49487a);
                                qVar = this;
                                qVar.f49529s0 = jMax4;
                                j11 = j10;
                            } else {
                                qVar = this;
                                flag = flag;
                                j11 = j10;
                            }
                            if (qVar.f49511e.isDecodeOnly()) {
                                qVar.f49526r.add(Long.valueOf(j11));
                            }
                            if (qVar.f49534w0) {
                                e0Var = qVar.f49521n;
                                t0Var = qVar.f49537y;
                                synchronized (e0Var) {
                                    i10 = e0Var.f4789b;
                                    if (i10 > 0) {
                                        if (j11 <= ((long[]) e0Var.f4790c)[((e0Var.f4788a + i10) - 1) % ((Object[]) e0Var.d).length]) {
                                            e0Var.b();
                                        }
                                    }
                                    e0Var.c();
                                    int i110 = e0Var.f4788a;
                                    int i21 = e0Var.f4789b;
                                    Object[] objArr2 = (Object[]) e0Var.d;
                                    int length2 = (i110 + i21) % objArr2.length;
                                    ((long[]) e0Var.f4790c)[length2] = j11;
                                    objArr2[length2] = t0Var;
                                    e0Var.f4789b = i21 + 1;
                                    qVar.f49534w0 = false;
                                }
                            }
                            qVar.f49529s0 = Math.max(qVar.f49529s0, j11);
                            qVar.f49511e.d();
                            if (qVar.f49511e.hasSupplementalData()) {
                                qVar.p(qVar.f49511e);
                            }
                            qVar.onQueueInputBuffer(qVar.f49511e);
                            if (flag) {
                                qVar.I.e(qVar.f49510d0, qVar.f49511e.f14428a, j11);
                            } else {
                                qVar.I.a(j11, qVar.f49510d0, qVar.f49511e.f14429b.limit(), 0);
                            }
                            qVar.f49510d0 = -1;
                            qVar.f49511e.f14429b = null;
                            qVar.f49524p0 = true;
                            qVar.m0 = 0;
                            qVar.f49539z0.f14420c++;
                            return true;
                        }
                        flag = this.f49511e.getFlag(1073741824);
                        if (flag) {
                            dVar = this.f49511e.f14428a;
                            if (iPosition == 0) {
                                dVar.getClass();
                            } else {
                                if (dVar.d == null) {
                                    int[] iArr5 = new int[1];
                                    dVar.d = iArr5;
                                    dVar.f14416i.numBytesOfClearData = iArr5;
                                }
                                int[] iArr6 = dVar.d;
                                iArr6[0] = iArr6[0] + iPosition;
                            }
                        }
                        if (this.R) {
                            byteBuffer2 = this.f49511e.f14429b;
                            iPosition2 = byteBuffer2.position();
                            i14 = 0;
                            i15 = 0;
                            while (true) {
                                i16 = i14 + 1;
                                if (i16 >= iPosition2) {
                                    byteBuffer2.clear();
                                    break;
                                }
                                i17 = byteBuffer2.get(i14) & 255;
                                if (i15 == 3) {
                                    if (i17 == 1) {
                                        ByteBuffer byteBufferDuplicate3 = byteBuffer2.duplicate();
                                        byteBufferDuplicate3.position(i14 - 3);
                                        byteBufferDuplicate3.limit(iPosition2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(byteBufferDuplicate3);
                                        break;
                                    }
                                } else if (i17 == 0) {
                                    i15++;
                                }
                                if (i17 != 0) {
                                    i15 = 0;
                                }
                                i14 = i16;
                            }
                            if (this.f49511e.f14429b.position() != 0) {
                                this.R = false;
                            }
                        }
                        iVar = this.f49511e;
                        j10 = iVar.d;
                        hVar = this.f49507b0;
                        if (hVar != null) {
                            t0Var2 = this.f49537y;
                            if (hVar.f49488b == 0) {
                                hVar.f49487a = j10;
                            }
                            if (!hVar.f49489c) {
                                byteBuffer = iVar.f14429b;
                                byteBuffer.getClass();
                                i12 = 0;
                                while (i11 < 4) {
                                    i12 = (i12 << 8) | (byteBuffer.get(i11) & 255);
                                }
                                i13 = j3.b.i(i12);
                                if (i13 == -1) {
                                    hVar.f49489c = true;
                                    hVar.f49488b = 0L;
                                    hVar.f49487a = iVar.d;
                                    d5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    j10 = iVar.d;
                                } else {
                                    long jMax5 = hVar.f49487a + Math.max(0L, ((hVar.f49488b - 529) * 1000000) / ((long) t0Var2.P));
                                    hVar.f49488b += (long) i13;
                                    j10 = jMax5;
                                }
                            }
                            long j14 = this.f49529s0;
                            h hVar4 = this.f49507b0;
                            t0 t0Var5 = this.f49537y;
                            hVar4.getClass();
                            long jMax6 = Math.max(j14, Math.max(0L, ((hVar4.f49488b - 529) * 1000000) / t0Var5.P) + hVar4.f49487a);
                            qVar = this;
                            qVar.f49529s0 = jMax6;
                            j11 = j10;
                        } else {
                            qVar = this;
                            flag = flag;
                            j11 = j10;
                        }
                        if (qVar.f49511e.isDecodeOnly()) {
                            qVar.f49526r.add(Long.valueOf(j11));
                        }
                        if (qVar.f49534w0) {
                            e0Var = qVar.f49521n;
                            t0Var = qVar.f49537y;
                            synchronized (e0Var) {
                                i10 = e0Var.f4789b;
                                if (i10 > 0) {
                                    if (j11 <= ((long[]) e0Var.f4790c)[((e0Var.f4788a + i10) - 1) % ((Object[]) e0Var.d).length]) {
                                        e0Var.b();
                                    }
                                }
                                e0Var.c();
                                int i111 = e0Var.f4788a;
                                int i22 = e0Var.f4789b;
                                Object[] objArr3 = (Object[]) e0Var.d;
                                int length3 = (i111 + i22) % objArr3.length;
                                ((long[]) e0Var.f4790c)[length3] = j11;
                                objArr3[length3] = t0Var;
                                e0Var.f4789b = i22 + 1;
                                qVar.f49534w0 = false;
                            }
                        }
                        qVar.f49529s0 = Math.max(qVar.f49529s0, j11);
                        qVar.f49511e.d();
                        if (qVar.f49511e.hasSupplementalData()) {
                            qVar.p(qVar.f49511e);
                        }
                        qVar.onQueueInputBuffer(qVar.f49511e);
                        if (flag) {
                            qVar.I.e(qVar.f49510d0, qVar.f49511e.f14428a, j11);
                        } else {
                            qVar.I.a(j11, qVar.f49510d0, qVar.f49511e.f14429b.limit(), 0);
                        }
                        qVar.f49510d0 = -1;
                        qVar.f49511e.f14429b = null;
                        qVar.f49524p0 = true;
                        qVar.m0 = 0;
                        qVar.f49539z0.f14420c++;
                        return true;
                        return true;
                    }
                    if (this.m0 == 2) {
                        this.f49511e.clear();
                        this.m0 = 1;
                    }
                    this.f49531u0 = true;
                    if (!this.f49524p0) {
                        B();
                        return false;
                    }
                    if (this.f49505a0) {
                        this.f49525q0 = true;
                        this.I.a(0L, this.f49510d0, 0, 4);
                        this.f49510d0 = -1;
                        this.f49511e.f14429b = null;
                        return false;
                    }
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
        if (this.I == null) {
            return false;
        }
        int i10 = this.f49523o0;
        if (i10 == 3 || this.S || ((this.T && !this.f49527r0) || (this.U && this.f49525q0))) {
            E();
            return true;
        }
        if (i10 == 2) {
            int i11 = g0.f4795a;
            d5.a.i(i11 >= 23);
            if (i11 >= 23) {
                try {
                    O();
                } catch (h3.n e9) {
                    d5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e9);
                    E();
                    return true;
                }
            }
        }
        h();
        return false;
    }

    @Override
    public boolean isEnded() {
        return this.f49532v0;
    }

    @Override
    public boolean isReady() {
        if (this.f49537y == null) {
            return false;
        }
        if (isSourceReady() || this.f49512e0 >= 0) {
            return true;
        }
        return this.f49509c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f49509c0;
    }

    public final List j(boolean z10) {
        t0 t0Var = this.f49537y;
        r rVar = this.f49506b;
        ArrayList arrayListM = m(rVar, t0Var, z10);
        if (!arrayListM.isEmpty() || !z10) {
            return arrayListM;
        }
        ArrayList arrayListM2 = m(rVar, this.f49537y, false);
        if (!arrayListM2.isEmpty()) {
            d5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f49537y.B + ", but no secure decoder available. Trying to proceed with " + arrayListM2 + ".");
        }
        return arrayListM2;
    }

    public boolean k() {
        return false;
    }

    public abstract float l(float f10, t0[] t0VarArr);

    public abstract ArrayList m(r rVar, t0 t0Var, boolean z10);

    public final l3.k n(l3.f fVar) throws h3.n {
        k3.b bVarY = fVar.y();
        if (bVarY == null || (bVarY instanceof l3.k)) {
            return (l3.k) bVarY;
        }
        throw createRendererException(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + bVarY), this.f49537y, 6001);
    }

    public abstract i o(n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10);

    @Override
    public void onDisabled() {
        this.f49537y = null;
        this.A0 = -9223372036854775807L;
        J(-9223372036854775807L);
        this.C0 = 0;
        i();
    }

    @Override
    public void onPositionReset(long j10, boolean z10) {
        int i10;
        this.f49531u0 = false;
        this.f49532v0 = false;
        this.f49536x0 = false;
        if (this.f49517i0) {
            this.h.clear();
            this.f49513f.clear();
            this.f49518j0 = false;
        } else if (i()) {
            r();
        }
        e0 e0Var = this.f49521n;
        synchronized (e0Var) {
            i10 = e0Var.f4789b;
        }
        if (i10 > 0) {
            this.f49534w0 = true;
        }
        this.f49521n.b();
        int i11 = this.C0;
        if (i11 != 0) {
            J(this.f49533w[i11 - 1]);
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
            i0.a.D(this.C, null);
            this.C = null;
        }
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        if (this.B0 == -9223372036854775807L) {
            d5.a.i(this.A0 == -9223372036854775807L);
            this.A0 = j10;
            J(j11);
            return;
        }
        int i10 = this.C0;
        long[] jArr = this.f49533w;
        if (i10 == jArr.length) {
            d5.a.K("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.C0 - 1]);
        } else {
            this.C0 = i10 + 1;
        }
        int i11 = this.C0;
        this.v[i11 - 1] = j10;
        jArr[i11 - 1] = j11;
        this.f49535x[i11 - 1] = this.f49529s0;
    }

    public final void q(n nVar, MediaCrypto mediaCrypto) {
        int i10;
        boolean z10;
        boolean z11;
        char c10;
        String string;
        String str = nVar.f49495a;
        int i11 = g0.f4795a;
        float fL = i11 < 23 ? -1.0f : l(this.H, getStreamFormats());
        if (fL <= this.f49508c) {
            fL = -1.0f;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i iVarO = o(nVar, this.f49537y, mediaCrypto, fL);
        if (i11 >= 31) {
            o.a(iVarO, getPlayerId());
        }
        try {
            d5.a.c("createCodec:" + str);
            this.I = this.f49504a.t1(iVarO);
            d5.a.q();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (nVar.d(this.f49537y)) {
                jElapsedRealtime2 = jElapsedRealtime2;
                fL = fL;
                jElapsedRealtime = jElapsedRealtime;
            } else {
                t0 t0Var = this.f49537y;
                if (t0Var == null) {
                    string = "null";
                } else {
                    String str2 = t0Var.f8185b;
                    String str3 = t0Var.f8186c;
                    int i12 = t0Var.P;
                    int i13 = t0Var.O;
                    float f10 = t0Var.I;
                    int i14 = t0Var.H;
                    int i15 = t0Var.G;
                    l3.d dVar = t0Var.E;
                    String str4 = t0Var.f8190r;
                    int i16 = t0Var.f8189n;
                    int i17 = t0Var.d;
                    int i18 = t0Var.f8187e;
                    StringBuilder sbO = com.google.android.recaptcha.internal.a.o("id=");
                    sbO.append(t0Var.f8184a);
                    sbO.append(", mimeType=");
                    sbO.append(t0Var.B);
                    int i19 = -1;
                    if (i16 != -1) {
                        sbO.append(", bitrate=");
                        sbO.append(i16);
                    }
                    if (str4 != null) {
                        sbO.append(", codecs=");
                        sbO.append(str4);
                    }
                    if (dVar != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i20 = 0;
                        c10 = ',';
                        while (i20 < dVar.d) {
                            UUID uuid = dVar.f15390a[i20].f15387b;
                            if (uuid.equals(h3.h.f7867b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(h3.h.f7868c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(h3.h.f7869e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(h3.h.d)) {
                                linkedHashSet.add("widevine");
                            } else {
                                if (uuid.equals(h3.h.f7866a)) {
                                    linkedHashSet.add("universal");
                                } else {
                                    linkedHashSet.add("unknown (" + uuid + ")");
                                }
                                i20++;
                                dVar = dVar;
                            }
                            i20++;
                            dVar = dVar;
                        }
                        sbO.append(", drm=[");
                        new y(String.valueOf(',')).a(sbO, linkedHashSet);
                        sbO.append(']');
                        i19 = -1;
                    } else {
                        c10 = ',';
                    }
                    if (i15 != i19 && i14 != i19) {
                        sbO.append(", res=");
                        sbO.append(i15);
                        sbO.append("x");
                        sbO.append(i14);
                    }
                    if (f10 != -1.0f) {
                        sbO.append(", fps=");
                        sbO.append(f10);
                    }
                    if (i13 != -1) {
                        sbO.append(", channels=");
                        sbO.append(i13);
                    }
                    if (i12 != -1) {
                        sbO.append(", sample_rate=");
                        sbO.append(i12);
                    }
                    if (str3 != null) {
                        sbO.append(", language=");
                        sbO.append(str3);
                    }
                    if (str2 != null) {
                        sbO.append(", label=");
                        sbO.append(str2);
                    }
                    if (i17 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i17 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i17 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i17 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbO.append(", selectionFlags=[");
                        new y(String.valueOf(c10)).a(sbO, arrayList);
                        sbO.append("]");
                    }
                    if (i18 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i18 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i18 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i18 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i18 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i18 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i18 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i18 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i18 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i18 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i18 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i18 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i18 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i18 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i18 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i18 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sbO.append(", roleFlags=[");
                        new y(String.valueOf(c10)).a(sbO, arrayList2);
                        sbO.append("]");
                    }
                    string = sbO.toString();
                }
                Locale locale = Locale.US;
                d5.a.K("MediaCodecRenderer", pa.j("Format exceeds selected codec's capabilities [", string, ", ", str, "]"));
            }
            this.P = nVar;
            this.M = fL;
            this.J = this.f49537y;
            int i21 = g0.f4795a;
            if (i21 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str5 = g0.d;
                if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                    i10 = 2;
                } else if (i21 < 24) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if (i21 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i10 = 0;
            } else {
                String str6 = g0.f4796b;
                if ("flounder".equals(str6) || "flounder_lte".equals(str6) || "grouper".equals(str6) || "tilapia".equals(str6)) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            }
            this.Q = i10;
            this.R = i21 < 21 && this.J.D.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.S = i21 < 18 || (i21 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i21 == 19 && g0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.T = i21 == 29 && "c2.android.aac.decoder".equals(str);
            if (i21 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i21 <= 19) {
                    String str7 = g0.f4796b;
                    z10 = ("hb2000".equals(str7) || "stvm8".equals(str7)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.U = z10;
            this.V = i21 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i21 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(g0.f4797c)) {
                String str8 = g0.f4796b;
                if (str8.startsWith("baffin") || str8.startsWith("grand") || str8.startsWith("fortuna") || str8.startsWith("gprimelte") || str8.startsWith("j2y18lte") || str8.startsWith("ms01")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            this.W = z11;
            this.X = i21 <= 18 && this.J.O == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            this.f49505a0 = (i21 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i21 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i21 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(g0.f4797c) && "AFTS".equals(g0.d) && nVar.f49499f) || k()));
            this.I.getClass();
            if ("c2.android.mp3.decoder".equals(str)) {
                this.f49507b0 = new h();
            }
            if (getState() == 2) {
                this.f49509c0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f49539z0.f14418a++;
            u(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th) {
            d5.a.q();
            throw th;
        }
    }

    public final void r() {
        t0 t0Var;
        if (this.I != null || this.f49517i0 || (t0Var = this.f49537y) == null) {
            return;
        }
        if (this.C == null && L(t0Var)) {
            t0 t0Var2 = this.f49537y;
            d();
            String str = t0Var2.B;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            g gVar = this.h;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.f49486s = 32;
            } else {
                gVar.getClass();
                gVar.f49486s = 1;
            }
            this.f49517i0 = true;
            return;
        }
        I(this.C);
        String str2 = this.f49537y.B;
        l3.f fVar = this.B;
        if (fVar != null) {
            if (this.D == null) {
                n(fVar);
                if (this.B.x() == null) {
                    return;
                }
            }
            if (l3.k.f15397a) {
                int iP = this.B.p();
                if (iP == 1) {
                    l3.e eVarX = this.B.x();
                    eVarX.getClass();
                    throw createRendererException(eVarX, this.f49537y, eVarX.f15393a);
                }
                if (iP != 4) {
                    return;
                }
            }
        }
        try {
            s(this.D, this.E);
        } catch (p e9) {
            throw createRendererException(e9, this.f49537y, 4001);
        }
    }

    @Override
    public final void render(long j10, long j11) throws h3.n {
        boolean z10 = false;
        if (this.f49536x0) {
            this.f49536x0 = false;
            B();
        }
        h3.n nVar = this.f49538y0;
        if (nVar != null) {
            this.f49538y0 = null;
            throw nVar;
        }
        try {
            if (this.f49532v0) {
                F();
                return;
            }
            if (this.f49537y != null || D(2)) {
                r();
                if (this.f49517i0) {
                    d5.a.c("bypassRender");
                    while (a(j10, j11)) {
                    }
                    d5.a.q();
                } else if (this.I != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    d5.a.c("drainAndFeed");
                    while (f(j10, j11)) {
                        long j12 = this.F;
                        if (!(j12 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j12)) {
                            break;
                        }
                    }
                    while (g()) {
                        long j13 = this.F;
                        if (!(j13 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j13)) {
                            break;
                        }
                    }
                    d5.a.q();
                } else {
                    this.f49539z0.d += skipSource(j10);
                    D(1);
                }
                synchronized (this.f49539z0) {
                }
            }
        } catch (IllegalStateException e9) {
            int i10 = g0.f4795a;
            if (i10 < 21 || !(e9 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e9.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e9;
                }
            }
            t(e9);
            if (i10 >= 21) {
                if (e9 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e9).isRecoverable() : false) {
                    z10 = true;
                }
            }
            if (z10) {
                E();
            }
            throw createRendererException(c(e9, this.P), this.f49537y, z10, 4003);
        }
    }

    public final void s(MediaCrypto mediaCrypto, boolean z10) throws p {
        p pVar;
        String str;
        p pVar2;
        String diagnosticInfo;
        if (this.N == null) {
            try {
                List listJ = j(z10);
                this.N = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listJ;
                if (!arrayList.isEmpty()) {
                    this.N.add((n) arrayList.get(0));
                }
                this.O = null;
            } catch (t e9) {
                throw new p(this.f49537y, e9, z10, -49998);
            }
        }
        if (this.N.isEmpty()) {
            throw new p(this.f49537y, null, z10, -49999);
        }
        n nVar = (n) this.N.peekFirst();
        while (this.I == null) {
            n nVar2 = (n) this.N.peekFirst();
            if (!K(nVar2)) {
                return;
            }
            try {
                q(nVar2, mediaCrypto);
            } catch (Exception e10) {
                if (nVar2 != nVar) {
                    throw e10;
                }
                try {
                    d5.a.K("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    q(nVar2, mediaCrypto);
                } catch (Exception e11) {
                    d5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e11);
                    this.N.removeFirst();
                    t0 t0Var = this.f49537y;
                    String str2 = "Decoder init failed: " + nVar2.f49495a + ", " + t0Var;
                    String str3 = t0Var.B;
                    if (g0.f4795a >= 21) {
                        if (e11 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    pVar = new p(str2, e11, str3, z10, nVar2, str);
                    t(pVar);
                    pVar2 = this.O;
                    if (pVar2 == null) {
                        this.O = pVar;
                    } else {
                        this.O = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f49501a, pVar2.f49502b, pVar2.f49503c, pVar2.d);
                    }
                    if (!this.N.isEmpty()) {
                        throw this.O;
                    }
                }
                d5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e11);
                this.N.removeFirst();
                t0 t0Var2 = this.f49537y;
                String str4 = "Decoder init failed: " + nVar2.f49495a + ", " + t0Var2;
                String str5 = t0Var2.B;
                if (g0.f4795a >= 21) {
                    if (e11 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                pVar = new p(str4, e11, str5, z10, nVar2, str);
                t(pVar);
                pVar2 = this.O;
                if (pVar2 == null) {
                    this.O = pVar;
                } else {
                    this.O = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f49501a, pVar2.f49502b, pVar2.f49503c, pVar2.d);
                }
                if (!this.N.isEmpty()) {
                    throw this.O;
                }
            }
        }
        this.N = null;
    }

    @Override
    public void setPlaybackSpeed(float f10, float f11) {
        this.G = f10;
        this.H = f11;
        N(this.J);
    }

    @Override
    public final int supportsFormat(t0 t0Var) throws h3.n {
        try {
            return M(this.f49506b, t0Var);
        } catch (t e9) {
            throw createRendererException(e9, t0Var, 4002);
        }
    }

    @Override
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public abstract void t(Exception exc);

    public abstract void u(long j10, long j11, String str);

    public abstract void v(String str);

    public k3.l w(u0 u0Var) {
        boolean z10 = true;
        this.f49534w0 = true;
        t0 t0Var = u0Var.f8207b;
        t0Var.getClass();
        if (t0Var.B == null) {
            throw createRendererException(new IllegalArgumentException(), t0Var, 4005);
        }
        l3.f fVar = u0Var.f8206a;
        i0.a.D(this.C, fVar);
        this.C = fVar;
        this.f49537y = t0Var;
        if (this.f49517i0) {
            this.f49519k0 = true;
            return null;
        }
        k kVar = this.I;
        if (kVar == null) {
            this.N = null;
            r();
            return null;
        }
        n nVar = this.P;
        t0 t0Var2 = this.J;
        l3.f fVar2 = this.B;
        if (fVar2 != fVar) {
            if (fVar != null && fVar2 != null && fVar.d().equals(fVar2.d()) && g0.f4795a >= 23) {
                UUID uuid = h3.h.f7869e;
                if (!uuid.equals(fVar2.d()) && !uuid.equals(fVar.d())) {
                    n(fVar);
                }
            }
            if (this.f49524p0) {
                this.f49522n0 = 1;
                this.f49523o0 = 3;
            } else {
                E();
                r();
            }
            return new k3.l(nVar.f49495a, t0Var2, t0Var, 0, 128);
        }
        int i10 = 0;
        boolean z11 = this.C != this.B;
        d5.a.i(!z11 || g0.f4795a >= 23);
        k3.l lVarB = b(nVar, t0Var2, t0Var);
        int i11 = lVarB.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (N(t0Var)) {
                        this.J = t0Var;
                        if (z11 && !e()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (N(t0Var)) {
                    this.f49520l0 = true;
                    this.m0 = 1;
                    int i12 = this.Q;
                    if (i12 != 2 && (i12 != 1 || t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                        z10 = false;
                    }
                    this.Y = z10;
                    this.J = t0Var;
                    if (z11 && !e()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (N(t0Var)) {
                this.J = t0Var;
                if (z11) {
                    if (!e()) {
                        i10 = 2;
                    }
                } else if (this.f49524p0) {
                    this.f49522n0 = 1;
                    if (this.S || this.U) {
                        this.f49523o0 = 3;
                        i10 = 2;
                    } else {
                        this.f49523o0 = 1;
                    }
                }
            } else {
                i10 = 16;
            }
        } else if (this.f49524p0) {
            this.f49522n0 = 1;
            this.f49523o0 = 3;
        } else {
            E();
            r();
        }
        return (i11 == 0 || (this.I == kVar && this.f49523o0 != 3)) ? lVarB : new k3.l(nVar.f49495a, t0Var2, t0Var, 0, i10);
    }

    public abstract void x(t0 t0Var, MediaFormat mediaFormat);

    public void z(long j10) {
        while (this.C0 != 0) {
            long[] jArr = this.f49535x;
            if (j10 < jArr[0]) {
                return;
            }
            long[] jArr2 = this.v;
            this.A0 = jArr2[0];
            long[] jArr3 = this.f49533w;
            J(jArr3[0]);
            int i10 = this.C0 - 1;
            this.C0 = i10;
            System.arraycopy(jArr2, 1, jArr2, 0, i10);
            System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
            System.arraycopy(jArr, 1, jArr, 0, this.C0);
            A();
        }
    }

    public void F() {
    }

    public void y() {
    }

    public void p(k3.i iVar) {
    }
}

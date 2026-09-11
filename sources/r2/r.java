package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import e2.a0;
import e2.d0;
import i2.m1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k2.i0;
import n4.y;
import u2.b1;
import v7.z7;
public abstract class r extends i2.f {
    public static final byte[] W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public final k I;
    public long I0;
    public final i J;
    public boolean J0;
    public final float K;
    public boolean K0;
    public final h2.g L;
    public boolean L0;
    public final h2.g M;
    public boolean M0;
    public final h2.g N;
    public i2.o N0;
    public final g O;
    public i2.h O0;
    public final MediaCodec.BufferInfo P;
    public q P0;
    public final ArrayDeque Q;
    public long Q0;
    public final i0 R;
    public boolean R0;
    public b2.s S;
    public boolean S0;
    public b2.s T;
    public boolean T0;
    public n2.g U;
    public long U0;
    public n2.g V;
    public long V0;
    public i2.i0 W;
    public MediaCrypto X;
    public final long Y;
    public float Z;
    public float f44848a0;
    public l f44849b0;
    public b2.s f44850c0;
    public MediaFormat f44851d0;
    public boolean f44852e0;
    public float f44853f0;
    public ArrayDeque f44854g0;
    public p f44855h0;
    public o f44856i0;
    public int f44857j0;
    public boolean f44858k0;
    public boolean f44859l0;
    public boolean m0;
    public boolean f44860n0;
    public boolean f44861o0;
    public boolean f44862p0;
    public long f44863q0;
    public long f44864r0;
    public int f44865s0;
    public int f44866t0;
    public ByteBuffer f44867u0;
    public boolean f44868v0;
    public boolean f44869w0;
    public boolean f44870x0;
    public boolean f44871y0;
    public boolean f44872z0;

    public r(int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.f44826b;
        this.I = kVar;
        this.J = iVar;
        this.K = f7;
        this.L = new h2.g(0, 0);
        this.M = new h2.g(0, 0);
        this.N = new h2.g(2, 0);
        ?? gVar = new h2.g(2, 0);
        gVar.f44823x = 32;
        this.O = gVar;
        this.P = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f44848a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.P0 = q.f44844e;
        gVar.l(0);
        gVar.f10847e.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f14599a = c2.h.f4156a;
        obj.f14601c = 0;
        obj.f14600b = 2;
        this.R = obj;
        this.f44853f0 = -1.0f;
        this.f44857j0 = 0;
        this.B0 = 0;
        this.f44865s0 = -1;
        this.f44866t0 = -1;
        this.f44864r0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44863q0 = -9223372036854775807L;
        this.C0 = 0;
        this.D0 = 0;
        this.O0 = new Object();
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    @Override
    public final int A() {
        return 8;
    }

    public final boolean B(long j3, long j10) {
        g gVar;
        int i10;
        int i11;
        int i12;
        byte b10;
        e2.d.g(!this.K0);
        g gVar2 = this.O;
        if (gVar2.o()) {
            ByteBuffer byteBuffer = gVar2.f10847e;
            int i13 = this.f44866t0;
            int i14 = gVar2.f44822w;
            long j11 = gVar2.h;
            boolean S = S(this.f11502w, gVar2.v);
            boolean c10 = gVar2.c(4);
            b2.s sVar = this.T;
            sVar.getClass();
            gVar = gVar2;
            if (g0(j3, j10, null, byteBuffer, i13, 0, i14, j11, S, c10, sVar)) {
                c0(gVar.v);
                gVar.i();
            } else {
                return false;
            }
        } else {
            gVar = gVar2;
        }
        if (this.J0) {
            this.K0 = true;
            return false;
        }
        ?? r22 = 0;
        boolean z10 = this.f44871y0;
        h2.g gVar3 = this.N;
        if (z10) {
            e2.d.g(gVar.n(gVar3));
            this.f44871y0 = false;
        }
        if (this.f44872z0) {
            if (gVar.o()) {
                return true;
            }
            this.f44870x0 = false;
            k0();
            this.f44872z0 = false;
            T();
            if (!this.f44870x0) {
                return false;
            }
        }
        e2.d.g(!this.J0);
        y yVar = this.f11496c;
        yVar.A();
        gVar3.i();
        while (true) {
            gVar3.i();
            int v = v(yVar, gVar3, r22);
            if (v != -5) {
                if (v != -4) {
                    if (v == -3) {
                        if (k()) {
                            this.I0 = this.H0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (gVar3.c(4)) {
                    this.J0 = true;
                    this.I0 = this.H0;
                    break;
                } else {
                    this.H0 = Math.max(this.H0, gVar3.h);
                    if (k() || this.M.c(536870912)) {
                        this.I0 = this.H0;
                    }
                    byte[] bArr = null;
                    if (this.L0) {
                        b2.s sVar2 = this.S;
                        sVar2.getClass();
                        this.T = sVar2;
                        if (Objects.equals(sVar2.f2370r, "audio/opus") && !this.T.f2373u.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.T.f2373u.get(r22);
                            int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            b2.r a2 = this.T.a();
                            a2.L = i15;
                            this.T = new b2.s(a2);
                        }
                        a0(this.T, null);
                        this.L0 = r22;
                    }
                    gVar3.m();
                    b2.s sVar3 = this.T;
                    if (sVar3 != null && Objects.equals(sVar3.f2370r, "audio/opus")) {
                        if (gVar3.c(268435456)) {
                            gVar3.f10846c = this.T;
                            Q(gVar3);
                        }
                        if (this.f11502w - gVar3.h <= 80000) {
                            List list = this.T.f2373u;
                            i0 i0Var = this.R;
                            i0Var.getClass();
                            gVar3.f10847e.getClass();
                            if (gVar3.f10847e.limit() - gVar3.f10847e.position() != 0) {
                                if (i0Var.f14600b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r22);
                                }
                                ByteBuffer byteBuffer2 = gVar3.f10847e;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i16 = limit - position;
                                int i17 = (i16 + 255) / 255;
                                int i18 = i17 + 27 + i16;
                                if (i0Var.f14600b == 2) {
                                    if (bArr != null) {
                                        i10 = bArr.length + 28;
                                    } else {
                                        i10 = 47;
                                    }
                                    i18 = i10 + 44 + i18;
                                } else {
                                    i10 = 0;
                                }
                                if (i0Var.f14599a.capacity() < i18) {
                                    i0Var.f14599a = ByteBuffer.allocate(i18).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    i0Var.f14599a.clear();
                                }
                                ByteBuffer byteBuffer3 = i0Var.f14599a;
                                if (i0Var.f14600b == 2) {
                                    if (bArr != null) {
                                        i0.a(byteBuffer3, 0L, 0, 1, true);
                                        i12 = limit;
                                        byteBuffer3.put(z7.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i11 = i10;
                                        byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i11 = i10;
                                        i12 = limit;
                                        byteBuffer3.put(i0.d);
                                    }
                                    byteBuffer3.put(i0.f14598e);
                                } else {
                                    i11 = i10;
                                    i12 = limit;
                                }
                                byte b11 = byteBuffer2.get(0);
                                if (byteBuffer2.limit() > 1) {
                                    b10 = byteBuffer2.get(1);
                                } else {
                                    b10 = 0;
                                }
                                int k10 = i0Var.f14601c + ((int) ((c3.b.k(b11, b10) * 48000) / 1000000));
                                i0Var.f14601c = k10;
                                i0.a(byteBuffer3, k10, i0Var.f14600b, i17, false);
                                for (int i19 = 0; i19 < i17; i19++) {
                                    if (i16 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i16 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i16);
                                        i16 = 0;
                                    }
                                }
                                int i20 = i12;
                                while (position < i20) {
                                    byteBuffer3.put(byteBuffer2.get(position));
                                    position++;
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (i0Var.f14600b == 2) {
                                    byteBuffer3.putInt(i11 + 66, d0.n(byteBuffer3.arrayOffset() + i11 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                i0Var.f14600b++;
                                i0Var.f14599a = byteBuffer3;
                                gVar3.i();
                                gVar3.l(i0Var.f14599a.remaining());
                                gVar3.f10847e.put(i0Var.f14599a);
                                gVar3.m();
                            }
                        }
                    }
                    if (gVar.o()) {
                        long j12 = this.f11502w;
                        if (S(j12, gVar.v) != S(j12, gVar3.h)) {
                            break;
                        }
                    }
                    if (!gVar.n(gVar3)) {
                        break;
                    }
                    r22 = 0;
                }
            } else {
                Z(yVar);
                break;
            }
        }
        this.f44871y0 = true;
        if (gVar.o()) {
            gVar.m();
        }
        if (!gVar.o() && !this.J0 && !this.f44872z0) {
            return false;
        }
        return true;
    }

    public abstract i2.i C(o oVar, b2.s sVar, b2.s sVar2);

    public n D(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean E() {
        if (this.E0) {
            this.C0 = 1;
            if (this.f44859l0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = 2;
            return true;
        }
        w0();
        return true;
    }

    public final boolean F(long j3, long j10) {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean z12;
        boolean z13;
        boolean g02;
        boolean z14;
        int h;
        l lVar = this.f44849b0;
        lVar.getClass();
        int i10 = this.f44866t0;
        MediaCodec.BufferInfo bufferInfo2 = this.P;
        if (i10 < 0) {
            if (this.m0 && this.F0) {
                try {
                    h = lVar.h(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.K0) {
                        i0();
                    }
                }
            } else {
                h = lVar.h(bufferInfo2);
            }
            if (h < 0) {
                if (h == -2) {
                    this.G0 = true;
                    l lVar2 = this.f44849b0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f44857j0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f44861o0 = true;
                        return true;
                    }
                    this.f44851d0 = outputFormat;
                    this.f44852e0 = true;
                    return true;
                }
                if (this.f44862p0 && (this.J0 || this.C0 == 2)) {
                    f0();
                }
                long j11 = this.f44863q0;
                if (j11 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j11 + 100 < System.currentTimeMillis()) {
                        f0();
                        return false;
                    }
                }
                return false;
            } else if (this.f44861o0) {
                this.f44861o0 = false;
                lVar.c(h);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            } else {
                this.f44866t0 = h;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(h);
                this.f44867u0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f44867u0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                x0(bufferInfo2.presentationTimeUs);
            }
        }
        long j12 = bufferInfo2.presentationTimeUs;
        if (j12 < this.f11502w) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44868v0 = z10;
        long j13 = this.I0;
        if (j13 != -9223372036854775807L && j13 <= j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44869w0 = z11;
        if (this.T0) {
            long j14 = this.U0;
            if (j14 != -9223372036854775807L && j12 <= j14) {
                this.T0 = false;
                this.U0 = -9223372036854775807L;
            } else {
                this.U0 = j12;
                this.f44868v0 = true;
                this.f44869w0 = false;
            }
        }
        if (this.m0 && this.F0) {
            try {
                ByteBuffer byteBuffer = this.f44867u0;
                int i11 = this.f44866t0;
                int i12 = bufferInfo2.flags;
                boolean z15 = this.f44868v0;
                boolean z16 = this.f44869w0;
                b2.s sVar = this.T;
                sVar.getClass();
                bufferInfo = bufferInfo2;
                z12 = false;
                z13 = true;
                try {
                    g02 = g0(j3, j10, lVar, byteBuffer, i11, i12, 1, j12, z15, z16, sVar);
                } catch (IllegalStateException unused2) {
                    f0();
                    if (this.K0) {
                        i0();
                        return z12;
                    }
                    return z12;
                }
            } catch (IllegalStateException unused3) {
                z12 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z12 = false;
            z13 = true;
            ByteBuffer byteBuffer2 = this.f44867u0;
            int i13 = this.f44866t0;
            int i14 = bufferInfo.flags;
            boolean z17 = this.f44868v0;
            boolean z18 = this.f44869w0;
            b2.s sVar2 = this.T;
            sVar2.getClass();
            g02 = g0(j3, j10, lVar, byteBuffer2, i13, i14, 1, j12, z17, z18, sVar2);
        }
        if (g02) {
            c0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14 && this.F0 && this.f44869w0) {
                this.h.getClass();
                this.f44863q0 = System.currentTimeMillis();
            }
            this.f44866t0 = -1;
            this.f44867u0 = null;
            if (!z14) {
                return z13;
            }
            f0();
            return z12;
        }
        return z12;
    }

    public final boolean G() {
        l lVar = this.f44849b0;
        if (lVar == null || this.C0 == 2 || this.J0) {
            return false;
        }
        int i10 = this.f44865s0;
        h2.g gVar = this.M;
        if (i10 < 0) {
            int g10 = lVar.g();
            this.f44865s0 = g10;
            if (g10 < 0) {
                return false;
            }
            gVar.f10847e = lVar.getInputBuffer(g10);
            gVar.i();
        }
        if (this.C0 == 1) {
            if (!this.f44862p0) {
                this.F0 = true;
                lVar.a(0L, this.f44865s0, 0, 4);
                this.f44865s0 = -1;
                gVar.f10847e = null;
            }
            this.C0 = 2;
            return false;
        } else if (this.f44860n0) {
            this.f44860n0 = false;
            ByteBuffer byteBuffer = gVar.f10847e;
            byteBuffer.getClass();
            byteBuffer.put(W0);
            lVar.a(0L, this.f44865s0, 38, 0);
            this.f44865s0 = -1;
            gVar.f10847e = null;
            this.E0 = true;
            return true;
        } else {
            if (this.B0 == 1) {
                int i11 = 0;
                while (true) {
                    b2.s sVar = this.f44850c0;
                    sVar.getClass();
                    if (i11 >= sVar.f2373u.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = gVar.f10847e;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f44850c0.f2373u.get(i11));
                    i11++;
                }
                this.B0 = 2;
            }
            ByteBuffer byteBuffer3 = gVar.f10847e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            y yVar = this.f11496c;
            yVar.A();
            try {
                int v = v(yVar, gVar, 0);
                if (v == -3) {
                    if (!k()) {
                        return false;
                    }
                    this.I0 = this.H0;
                    return false;
                } else if (v == -5) {
                    if (this.B0 == 2) {
                        gVar.i();
                        this.B0 = 1;
                    }
                    Z(yVar);
                    return true;
                } else if (gVar.c(4)) {
                    this.I0 = this.H0;
                    if (this.B0 == 2) {
                        gVar.i();
                        this.B0 = 1;
                    }
                    this.J0 = true;
                    if (!this.E0) {
                        f0();
                        return false;
                    } else if (this.f44862p0) {
                        return false;
                    } else {
                        this.F0 = true;
                        lVar.a(0L, this.f44865s0, 0, 4);
                        this.f44865s0 = -1;
                        gVar.f10847e = null;
                        return false;
                    }
                } else {
                    if (!this.E0 && !gVar.c(1)) {
                        gVar.i();
                        if (this.B0 == 2) {
                            this.B0 = 1;
                            return true;
                        }
                    } else if (!p0(gVar)) {
                        boolean c10 = gVar.c(1073741824);
                        if (c10) {
                            h2.c cVar = gVar.d;
                            if (position == 0) {
                                cVar.getClass();
                            } else {
                                if (cVar.d == null) {
                                    int[] iArr = new int[1];
                                    cVar.d = iArr;
                                    cVar.f10844i.numBytesOfClearData = iArr;
                                }
                                int[] iArr2 = cVar.d;
                                iArr2[0] = iArr2[0] + position;
                            }
                        }
                        long j3 = gVar.h;
                        if (this.L0) {
                            ArrayDeque arrayDeque = this.Q;
                            if (!arrayDeque.isEmpty()) {
                                a0 a0Var = ((q) arrayDeque.peekLast()).d;
                                b2.s sVar2 = this.S;
                                sVar2.getClass();
                                a0Var.a(sVar2, j3);
                            } else {
                                a0 a0Var2 = this.P0.d;
                                b2.s sVar3 = this.S;
                                sVar3.getClass();
                                a0Var2.a(sVar3, j3);
                            }
                            this.L0 = false;
                        }
                        this.H0 = Math.max(this.H0, j3);
                        if (k() || gVar.c(536870912)) {
                            this.I0 = this.H0;
                        }
                        gVar.m();
                        if (gVar.c(268435456)) {
                            Q(gVar);
                        }
                        e0(gVar);
                        int K = K(gVar);
                        if (Build.VERSION.SDK_INT < 34 || (K & 32) == 0) {
                            m1 m1Var = this.d;
                            m1Var.getClass();
                            if (!m1Var.f11644b) {
                                this.V0 = Math.max(this.V0, gVar.h);
                            }
                        }
                        if (c10) {
                            lVar.b(this.f44865s0, gVar.d, j3, K);
                        } else {
                            int i12 = this.f44865s0;
                            ByteBuffer byteBuffer4 = gVar.f10847e;
                            byteBuffer4.getClass();
                            lVar.a(j3, i12, byteBuffer4.limit(), K);
                        }
                        this.f44865s0 = -1;
                        gVar.f10847e = null;
                        this.E0 = true;
                        this.B0 = 0;
                        this.O0.f11574c++;
                        return true;
                    }
                    return true;
                }
            } catch (h2.f e7) {
                W(e7);
                h0(0);
                H();
                return true;
            }
        }
    }

    public final void H() {
        try {
            l lVar = this.f44849b0;
            e2.d.h(lVar);
            lVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean I() {
        if (this.f44849b0 != null) {
            if (s0()) {
                i0();
                return true;
            } else if (q0()) {
                H();
                return false;
            } else {
                long j3 = this.V0;
                if (j3 != -9223372036854775807L && this.f11502w <= j3 && this.Q0 < j3) {
                    this.T0 = true;
                    this.V0 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    public final List J(boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        i iVar = this.J;
        ArrayList N = N(iVar, sVar, z10);
        if (N.isEmpty() && z10) {
            ArrayList N2 = N(iVar, sVar, false);
            if (!N2.isEmpty()) {
                e2.a.n("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f2370r + ", but no secure decoder available. Trying to proceed with " + N2 + ".");
            }
            return N2;
        }
        return N;
    }

    public int K(h2.g gVar) {
        return 0;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f7, b2.s sVar, b2.s[] sVarArr);

    public abstract ArrayList N(i iVar, b2.s sVar, boolean z10);

    public long O(long j3, long j10) {
        return super.g(j3, j10);
    }

    public abstract com.google.firebase.messaging.n P(o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7);

    public abstract void Q(h2.g gVar);

    public final void R(r2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.R(r2.o, android.media.MediaCrypto):void");
    }

    public final boolean S(long j3, long j10) {
        if (j10 < j3) {
            b2.s sVar = this.T;
            if (sVar == null || !Objects.equals(sVar.f2370r, "audio/opus") || j3 - j10 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        b2.s sVar = this.S;
        sVar.getClass();
        if (this.f44854g0 == null) {
            try {
                List J = J(z10);
                this.f44854g0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) J;
                if (!arrayList.isEmpty()) {
                    this.f44854g0.add((o) arrayList.get(0));
                }
                this.f44855h0 = null;
            } catch (t e7) {
                throw new p(sVar, e7, z10, -49998);
            }
        }
        if (!this.f44854g0.isEmpty()) {
            ArrayDeque arrayDeque = this.f44854g0;
            arrayDeque.getClass();
            while (this.f44849b0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!V(sVar) || !r0(oVar)) {
                    return;
                }
                try {
                    R(oVar, mediaCrypto);
                } catch (Exception e10) {
                    e2.a.o("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e10);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f44831a + ", " + sVar;
                    String str3 = sVar.f2370r;
                    if (e10 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e10).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e10, str3, z10, oVar, str);
                    W(pVar);
                    p pVar2 = this.f44855h0;
                    if (pVar2 == null) {
                        this.f44855h0 = pVar;
                    } else {
                        this.f44855h0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f44841a, pVar2.f44842b, pVar2.f44843c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f44855h0;
                    }
                }
            }
            this.f44854g0 = null;
            return;
        }
        throw new p(sVar, null, z10, -49999);
    }

    public boolean V(b2.s sVar) {
        return true;
    }

    public abstract void W(Exception exc);

    public abstract void X(long j3, long j10, String str);

    public abstract void Y(String str);

    public i2.i Z(n4.y r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.Z(n4.y):i2.i");
    }

    public abstract void a0(b2.s sVar, MediaFormat mediaFormat);

    public void c0(long j3) {
        this.Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (!arrayDeque.isEmpty() && j3 >= ((q) arrayDeque.peek()).f44845a) {
                q qVar = (q) arrayDeque.poll();
                qVar.getClass();
                o0(qVar);
                d0();
            } else {
                return;
            }
        }
    }

    public abstract void d0();

    public final void f0() {
        int i10 = this.D0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.K0 = true;
                    j0();
                    return;
                }
                i0();
                T();
                return;
            }
            H();
            w0();
            return;
        }
        H();
    }

    @Override
    public final long g(long j3, long j10) {
        return O(j3, j10);
    }

    public abstract boolean g0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar);

    public final boolean h0(int i10) {
        y yVar = this.f11496c;
        yVar.A();
        h2.g gVar = this.L;
        gVar.i();
        int v = v(yVar, gVar, i10 | 4);
        if (v == -5) {
            Z(yVar);
            return true;
        } else if (v == -4 && gVar.c(4)) {
            this.J0 = true;
            f0();
            return false;
        } else {
            return false;
        }
    }

    public final void i0() {
        try {
            l lVar = this.f44849b0;
            if (lVar != null) {
                lVar.release();
                this.O0.f11573b++;
                o oVar = this.f44856i0;
                oVar.getClass();
                Y(oVar.f44831a);
            }
            this.f44849b0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f44849b0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void j0();

    public final void k0() {
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44872z0 = false;
        this.O.i();
        this.N.i();
        this.f44871y0 = false;
        i0 i0Var = this.R;
        i0Var.getClass();
        i0Var.f14599a = c2.h.f4156a;
        i0Var.f14601c = 0;
        i0Var.f14600b = 2;
    }

    public void l0() {
        this.f44865s0 = -1;
        this.M.f10847e = null;
        this.f44866t0 = -1;
        this.f44867u0 = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44864r0 = -9223372036854775807L;
        this.F0 = false;
        this.f44863q0 = -9223372036854775807L;
        this.E0 = false;
        this.f44860n0 = false;
        this.f44861o0 = false;
        this.f44868v0 = false;
        this.f44869w0 = false;
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = this.A0 ? 1 : 0;
        this.T0 = false;
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    @Override
    public boolean m() {
        boolean e7;
        boolean z10;
        if (this.S != null) {
            if (k()) {
                e7 = this.f11504y;
            } else {
                b1 b1Var = this.f11500r;
                b1Var.getClass();
                e7 = b1Var.e();
            }
            if (!e7) {
                if (this.f44866t0 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (this.f44864r0 != -9223372036854775807L) {
                        this.h.getClass();
                        if (SystemClock.elapsedRealtime() < this.f44864r0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void m0() {
        l0();
        this.N0 = null;
        this.f44854g0 = null;
        this.f44856i0 = null;
        this.f44850c0 = null;
        this.f44851d0 = null;
        this.f44852e0 = false;
        this.G0 = false;
        this.f44853f0 = -1.0f;
        this.f44857j0 = 0;
        this.f44858k0 = false;
        this.f44859l0 = false;
        this.m0 = false;
        this.f44862p0 = false;
        this.A0 = false;
        this.B0 = 0;
    }

    @Override
    public void n() {
        this.S = null;
        o0(q.f44844e);
        this.Q.clear();
        if (this.f44870x0) {
            this.f44870x0 = false;
            k0();
            return;
        }
        I();
    }

    public final void n0(n2.g gVar) {
        i2.g.D(this.U, gVar);
        this.U = gVar;
    }

    public final void o0(q qVar) {
        this.P0 = qVar;
        if (qVar.f44847c != -9223372036854775807L) {
            this.R0 = true;
            b0();
        }
    }

    @Override
    public void p(long j3, boolean z10) {
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.f44870x0) {
            k0();
        } else if (I()) {
            T();
        }
        if (this.P0.d.i() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.Q.clear();
    }

    public boolean p0(h2.g gVar) {
        return false;
    }

    public boolean q0() {
        return true;
    }

    public boolean r0(o oVar) {
        return true;
    }

    public boolean s0() {
        boolean z10;
        int i10 = this.D0;
        if (i10 == 3 || ((this.f44858k0 && !this.G0) || (this.f44859l0 && this.F0))) {
            return true;
        }
        if (i10 == 2) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 >= 23) {
                try {
                    w0();
                    return false;
                } catch (i2.o e7) {
                    e2.a.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean t0(b2.s sVar) {
        return false;
    }

    @Override
    public void u(b2.s[] r12, long r13, long r15, u2.f0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.u(b2.s[], long, long, u2.f0):void");
    }

    public abstract int u0(i iVar, b2.s sVar);

    public final boolean v0(b2.s sVar) {
        if (Build.VERSION.SDK_INT >= 23 && this.f44849b0 != null && this.D0 != 3 && this.f11499n != 0) {
            float f7 = this.f44848a0;
            sVar.getClass();
            b2.s[] sVarArr = this.f11501s;
            sVarArr.getClass();
            float M = M(f7, sVar, sVarArr);
            float f10 = this.f44853f0;
            if (f10 != M) {
                if (M == -1.0f) {
                    if (this.E0) {
                        this.C0 = 1;
                        this.D0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                } else if (f10 != -1.0f || M > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", M);
                    l lVar = this.f44849b0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f44853f0 = M;
                }
            }
        }
        return true;
    }

    @Override
    public void w(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.w(long, long):void");
    }

    public final void w0() {
        n2.g gVar = this.V;
        gVar.getClass();
        h2.a h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).f16412b);
            } catch (MediaCryptoException e7) {
                throw c(e7, this.S, false, 6006);
            }
        }
        n0(this.V);
        this.C0 = 0;
        this.D0 = 0;
    }

    public final void x0(long j3) {
        b2.s sVar = (b2.s) this.P0.d.g(j3);
        if (sVar == null && this.R0 && this.f44851d0 != null) {
            sVar = (b2.s) this.P0.d.f();
        }
        if (sVar != null) {
            this.T = sVar;
        } else if (!this.f44852e0 || this.T == null) {
            return;
        }
        b2.s sVar2 = this.T;
        sVar2.getClass();
        a0(sVar2, this.f44851d0);
        this.f44852e0 = false;
        this.R0 = false;
    }

    @Override
    public void y(float f7, float f10) {
        this.Z = f7;
        this.f44848a0 = f10;
        v0(this.f44850c0);
    }

    @Override
    public final int z(b2.s sVar) {
        try {
            return u0(this.J, sVar);
        } catch (t e7) {
            throw c(e7, sVar, false, 4002);
        }
    }

    public void b0() {
    }

    public void e0(h2.g gVar) {
    }
}

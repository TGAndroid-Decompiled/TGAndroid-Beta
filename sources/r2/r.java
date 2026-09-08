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
    public final h2.h L;
    public boolean L0;
    public final h2.h M;
    public boolean M0;
    public final h2.h N;
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
    public float f44876a0;
    public l f44877b0;
    public b2.s f44878c0;
    public MediaFormat f44879d0;
    public boolean f44880e0;
    public float f44881f0;
    public ArrayDeque f44882g0;
    public p f44883h0;
    public o f44884i0;
    public int f44885j0;
    public boolean f44886k0;
    public boolean f44887l0;
    public boolean m0;
    public boolean f44888n0;
    public boolean f44889o0;
    public boolean f44890p0;
    public long f44891q0;
    public long f44892r0;
    public int f44893s0;
    public int f44894t0;
    public ByteBuffer f44895u0;
    public boolean f44896v0;
    public boolean f44897w0;
    public boolean f44898x0;
    public boolean f44899y0;
    public boolean f44900z0;

    public r(int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.f44854b;
        this.I = kVar;
        this.J = iVar;
        this.K = f7;
        this.L = new h2.h(0, 0);
        this.M = new h2.h(0, 0);
        this.N = new h2.h(2, 0);
        ?? hVar = new h2.h(2, 0);
        hVar.v = 32;
        this.O = hVar;
        this.P = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f44876a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.P0 = q.f44872e;
        hVar.b(0);
        hVar.f10876c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f14625a = c2.h.f4183a;
        obj.f14627c = 0;
        obj.f14626b = 2;
        this.R = obj;
        this.f44881f0 = -1.0f;
        this.f44885j0 = 0;
        this.B0 = 0;
        this.f44893s0 = -1;
        this.f44894t0 = -1;
        this.f44892r0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44891q0 = -9223372036854775807L;
        this.C0 = 0;
        this.D0 = 0;
        this.O0 = new Object();
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    @Override
    public final int A(b2.s sVar) {
        try {
            return v0(this.J, sVar);
        } catch (t e7) {
            throw c(e7, sVar, false, 4002);
        }
    }

    @Override
    public final int B() {
        return 8;
    }

    public final boolean C(long j3, long j10) {
        g gVar;
        int i10;
        int i11;
        int i12;
        byte b10;
        e2.d.g(!this.K0);
        g gVar2 = this.O;
        if (gVar2.g()) {
            ByteBuffer byteBuffer = gVar2.f10876c;
            int i13 = this.f44894t0;
            int i14 = gVar2.f44851s;
            long j11 = gVar2.f10877e;
            boolean T = T(this.f11528w, gVar2.f44850r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            b2.s sVar = this.T;
            sVar.getClass();
            gVar = gVar2;
            if (h0(j3, j10, null, byteBuffer, i13, 0, i14, j11, T, isEndOfStream, sVar)) {
                d0(gVar.f44850r);
                gVar.clear();
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
        ?? r12 = 0;
        boolean z10 = this.f44899y0;
        h2.h hVar = this.N;
        if (z10) {
            e2.d.g(gVar.f(hVar));
            this.f44899y0 = false;
        }
        if (this.f44900z0) {
            if (gVar.g()) {
                return true;
            }
            this.f44898x0 = false;
            l0();
            this.f44900z0 = false;
            U();
            if (!this.f44898x0) {
                return false;
            }
        }
        e2.d.g(!this.J0);
        y yVar = this.f11522c;
        yVar.A();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(yVar, hVar, r12);
            if (w10 != -5) {
                if (w10 != -4) {
                    if (w10 == -3) {
                        if (k()) {
                            this.I0 = this.H0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (hVar.isEndOfStream()) {
                    this.J0 = true;
                    this.I0 = this.H0;
                    break;
                } else {
                    this.H0 = Math.max(this.H0, hVar.f10877e);
                    if (k() || this.M.isLastSample()) {
                        this.I0 = this.H0;
                    }
                    byte[] bArr = null;
                    if (this.L0) {
                        b2.s sVar2 = this.S;
                        sVar2.getClass();
                        this.T = sVar2;
                        if (Objects.equals(sVar2.f2397r, "audio/opus") && !this.T.f2400u.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.T.f2400u.get(r12);
                            int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            b2.r a2 = this.T.a();
                            a2.L = i15;
                            this.T = new b2.s(a2);
                        }
                        b0(this.T, null);
                        this.L0 = r12;
                    }
                    hVar.c();
                    b2.s sVar3 = this.T;
                    if (sVar3 != null && Objects.equals(sVar3.f2397r, "audio/opus")) {
                        if (hVar.hasSupplementalData()) {
                            hVar.f10874a = this.T;
                            R(hVar);
                        }
                        if (this.f11528w - hVar.f10877e <= 80000) {
                            List list = this.T.f2400u;
                            i0 i0Var = this.R;
                            i0Var.getClass();
                            hVar.f10876c.getClass();
                            if (hVar.f10876c.limit() - hVar.f10876c.position() != 0) {
                                if (i0Var.f14626b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r12);
                                }
                                ByteBuffer byteBuffer2 = hVar.f10876c;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i16 = limit - position;
                                int i17 = (i16 + 255) / 255;
                                int i18 = i17 + 27 + i16;
                                if (i0Var.f14626b == 2) {
                                    if (bArr != null) {
                                        i10 = bArr.length + 28;
                                    } else {
                                        i10 = 47;
                                    }
                                    i18 = i10 + 44 + i18;
                                } else {
                                    i10 = 0;
                                }
                                if (i0Var.f14625a.capacity() < i18) {
                                    i0Var.f14625a = ByteBuffer.allocate(i18).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    i0Var.f14625a.clear();
                                }
                                ByteBuffer byteBuffer3 = i0Var.f14625a;
                                if (i0Var.f14626b == 2) {
                                    if (bArr != null) {
                                        i0.a(byteBuffer3, 0L, 0, 1, true);
                                        i12 = limit;
                                        byteBuffer3.put(z7.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i11 = position;
                                        byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i11 = position;
                                        i12 = limit;
                                        byteBuffer3.put(i0.d);
                                    }
                                    byteBuffer3.put(i0.f14624e);
                                } else {
                                    i11 = position;
                                    i12 = limit;
                                }
                                byte b11 = byteBuffer2.get(0);
                                if (byteBuffer2.limit() > 1) {
                                    b10 = byteBuffer2.get(1);
                                } else {
                                    b10 = 0;
                                }
                                int k10 = i0Var.f14627c + ((int) ((c3.b.k(b11, b10) * 48000) / 1000000));
                                i0Var.f14627c = k10;
                                i0.a(byteBuffer3, k10, i0Var.f14626b, i17, false);
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
                                for (int i21 = i11; i21 < i20; i21++) {
                                    byteBuffer3.put(byteBuffer2.get(i21));
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (i0Var.f14626b == 2) {
                                    byteBuffer3.putInt(i10 + 66, d0.n(byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                i0Var.f14626b++;
                                i0Var.f14625a = byteBuffer3;
                                hVar.clear();
                                hVar.b(i0Var.f14625a.remaining());
                                hVar.f10876c.put(i0Var.f14625a);
                                hVar.c();
                            }
                        }
                    }
                    if (gVar.g()) {
                        long j12 = this.f11528w;
                        if (T(j12, gVar.f44850r) != T(j12, hVar.f10877e)) {
                            break;
                        }
                    }
                    if (!gVar.f(hVar)) {
                        break;
                    }
                    r12 = 0;
                }
            } else {
                a0(yVar);
                break;
            }
        }
        this.f44899y0 = true;
        if (gVar.g()) {
            gVar.c();
        }
        if (!gVar.g() && !this.J0 && !this.f44900z0) {
            return false;
        }
        return true;
    }

    public abstract i2.i D(o oVar, b2.s sVar, b2.s sVar2);

    public n E(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean F() {
        if (this.E0) {
            this.C0 = 1;
            if (this.f44887l0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = 2;
            return true;
        }
        x0();
        return true;
    }

    public final boolean G(long j3, long j10) {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean z12;
        boolean z13;
        boolean h02;
        boolean z14;
        int h;
        l lVar = this.f44877b0;
        lVar.getClass();
        int i10 = this.f44894t0;
        MediaCodec.BufferInfo bufferInfo2 = this.P;
        if (i10 < 0) {
            if (this.m0 && this.F0) {
                try {
                    h = lVar.h(bufferInfo2);
                } catch (IllegalStateException unused) {
                    g0();
                    if (this.K0) {
                        j0();
                    }
                }
            } else {
                h = lVar.h(bufferInfo2);
            }
            if (h < 0) {
                if (h == -2) {
                    this.G0 = true;
                    l lVar2 = this.f44877b0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f44885j0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f44889o0 = true;
                        return true;
                    }
                    this.f44879d0 = outputFormat;
                    this.f44880e0 = true;
                    return true;
                }
                if (this.f44890p0 && (this.J0 || this.C0 == 2)) {
                    g0();
                }
                long j11 = this.f44891q0;
                if (j11 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j11 + 100 < System.currentTimeMillis()) {
                        g0();
                        return false;
                    }
                }
                return false;
            } else if (this.f44889o0) {
                this.f44889o0 = false;
                lVar.c(h);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                g0();
                return false;
            } else {
                this.f44894t0 = h;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(h);
                this.f44895u0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo2.offset);
                    this.f44895u0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                y0(bufferInfo2.presentationTimeUs);
            }
        }
        long j12 = bufferInfo2.presentationTimeUs;
        if (j12 < this.f11528w) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44896v0 = z10;
        long j13 = this.I0;
        if (j13 != -9223372036854775807L && j13 <= j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44897w0 = z11;
        if (this.T0) {
            long j14 = this.U0;
            if (j14 != -9223372036854775807L && j12 <= j14) {
                this.T0 = false;
                this.U0 = -9223372036854775807L;
            } else {
                this.U0 = j12;
                this.f44896v0 = true;
                this.f44897w0 = false;
            }
        }
        if (this.m0 && this.F0) {
            try {
                ByteBuffer byteBuffer = this.f44895u0;
                int i11 = this.f44894t0;
                int i12 = bufferInfo2.flags;
                boolean z15 = this.f44896v0;
                boolean z16 = this.f44897w0;
                b2.s sVar = this.T;
                sVar.getClass();
                bufferInfo = bufferInfo2;
                z12 = false;
                z13 = true;
                try {
                    h02 = h0(j3, j10, lVar, byteBuffer, i11, i12, 1, j12, z15, z16, sVar);
                } catch (IllegalStateException unused2) {
                    g0();
                    if (this.K0) {
                        j0();
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
            ByteBuffer byteBuffer2 = this.f44895u0;
            int i13 = this.f44894t0;
            int i14 = bufferInfo.flags;
            boolean z17 = this.f44896v0;
            boolean z18 = this.f44897w0;
            b2.s sVar2 = this.T;
            sVar2.getClass();
            h02 = h0(j3, j10, lVar, byteBuffer2, i13, i14, 1, j12, z17, z18, sVar2);
        }
        if (h02) {
            d0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14 && this.F0 && this.f44897w0) {
                this.h.getClass();
                this.f44891q0 = System.currentTimeMillis();
            }
            this.f44894t0 = -1;
            this.f44895u0 = null;
            if (!z14) {
                return z13;
            }
            g0();
            return z12;
        }
        return z12;
    }

    public final boolean H() {
        l lVar = this.f44877b0;
        if (lVar == null || this.C0 == 2 || this.J0) {
            return false;
        }
        int i10 = this.f44893s0;
        h2.h hVar = this.M;
        if (i10 < 0) {
            int g10 = lVar.g();
            this.f44893s0 = g10;
            if (g10 < 0) {
                return false;
            }
            hVar.f10876c = lVar.getInputBuffer(g10);
            hVar.clear();
        }
        if (this.C0 == 1) {
            if (!this.f44890p0) {
                this.F0 = true;
                lVar.a(0L, this.f44893s0, 0, 4);
                this.f44893s0 = -1;
                hVar.f10876c = null;
            }
            this.C0 = 2;
            return false;
        } else if (this.f44888n0) {
            this.f44888n0 = false;
            ByteBuffer byteBuffer = hVar.f10876c;
            byteBuffer.getClass();
            byteBuffer.put(W0);
            lVar.a(0L, this.f44893s0, 38, 0);
            this.f44893s0 = -1;
            hVar.f10876c = null;
            this.E0 = true;
            return true;
        } else {
            if (this.B0 == 1) {
                int i11 = 0;
                while (true) {
                    b2.s sVar = this.f44878c0;
                    sVar.getClass();
                    if (i11 >= sVar.f2400u.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = hVar.f10876c;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f44878c0.f2400u.get(i11));
                    i11++;
                }
                this.B0 = 2;
            }
            ByteBuffer byteBuffer3 = hVar.f10876c;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            y yVar = this.f11522c;
            yVar.A();
            try {
                int w10 = w(yVar, hVar, 0);
                if (w10 == -3) {
                    if (!k()) {
                        return false;
                    }
                    this.I0 = this.H0;
                    return false;
                } else if (w10 == -5) {
                    if (this.B0 == 2) {
                        hVar.clear();
                        this.B0 = 1;
                    }
                    a0(yVar);
                    return true;
                } else if (hVar.isEndOfStream()) {
                    this.I0 = this.H0;
                    if (this.B0 == 2) {
                        hVar.clear();
                        this.B0 = 1;
                    }
                    this.J0 = true;
                    if (!this.E0) {
                        g0();
                        return false;
                    } else if (this.f44890p0) {
                        return false;
                    } else {
                        this.F0 = true;
                        lVar.a(0L, this.f44893s0, 0, 4);
                        this.f44893s0 = -1;
                        hVar.f10876c = null;
                        return false;
                    }
                } else {
                    if (!this.E0 && !hVar.isKeyFrame()) {
                        hVar.clear();
                        if (this.B0 == 2) {
                            this.B0 = 1;
                            return true;
                        }
                    } else if (!q0(hVar)) {
                        boolean flag = hVar.getFlag(1073741824);
                        if (flag) {
                            h2.d dVar = hVar.f10875b;
                            if (position == 0) {
                                dVar.getClass();
                            } else {
                                if (dVar.d == null) {
                                    int[] iArr = new int[1];
                                    dVar.d = iArr;
                                    dVar.f10872i.numBytesOfClearData = iArr;
                                }
                                int[] iArr2 = dVar.d;
                                iArr2[0] = iArr2[0] + position;
                            }
                        }
                        long j3 = hVar.f10877e;
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
                        if (k() || hVar.isLastSample()) {
                            this.I0 = this.H0;
                        }
                        hVar.c();
                        if (hVar.hasSupplementalData()) {
                            R(hVar);
                        }
                        f0(hVar);
                        int L = L(hVar);
                        if (Build.VERSION.SDK_INT < 34 || (L & 32) == 0) {
                            m1 m1Var = this.d;
                            m1Var.getClass();
                            if (!m1Var.f11670b) {
                                this.V0 = Math.max(this.V0, hVar.f10877e);
                            }
                        }
                        if (flag) {
                            lVar.b(this.f44893s0, hVar.f10875b, j3, L);
                        } else {
                            int i12 = this.f44893s0;
                            ByteBuffer byteBuffer4 = hVar.f10876c;
                            byteBuffer4.getClass();
                            lVar.a(j3, i12, byteBuffer4.limit(), L);
                        }
                        this.f44893s0 = -1;
                        hVar.f10876c = null;
                        this.E0 = true;
                        this.B0 = 0;
                        this.O0.f11600c++;
                        return true;
                    }
                    return true;
                }
            } catch (h2.g e7) {
                X(e7);
                i0(0);
                I();
                return true;
            }
        }
    }

    public final void I() {
        try {
            l lVar = this.f44877b0;
            e2.d.h(lVar);
            lVar.flush();
        } finally {
            m0();
        }
    }

    public final boolean J() {
        if (this.f44877b0 != null) {
            if (t0()) {
                j0();
                return true;
            } else if (r0()) {
                I();
                return false;
            } else {
                long j3 = this.V0;
                if (j3 != -9223372036854775807L && this.f11528w <= j3 && this.Q0 < j3) {
                    this.T0 = true;
                    this.V0 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    public final List K(boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        i iVar = this.J;
        ArrayList O = O(iVar, sVar, z10);
        if (O.isEmpty() && z10) {
            ArrayList O2 = O(iVar, sVar, false);
            if (!O2.isEmpty()) {
                e2.a.n("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f2397r + ", but no secure decoder available. Trying to proceed with " + O2 + ".");
            }
            return O2;
        }
        return O;
    }

    public int L(h2.h hVar) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f7, b2.s sVar, b2.s[] sVarArr);

    public abstract ArrayList O(i iVar, b2.s sVar, boolean z10);

    public long P(long j3, long j10) {
        return super.g(j3, j10);
    }

    public abstract com.google.firebase.messaging.n Q(o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7);

    public abstract void R(h2.h hVar);

    public final void S(r2.o r13, android.media.MediaCrypto r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.S(r2.o, android.media.MediaCrypto):void");
    }

    public final boolean T(long j3, long j10) {
        if (j10 < j3) {
            b2.s sVar = this.T;
            if (sVar == null || !Objects.equals(sVar.f2397r, "audio/opus") || j3 - j10 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        b2.s sVar = this.S;
        sVar.getClass();
        if (this.f44882g0 == null) {
            try {
                List K = K(z10);
                this.f44882g0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) K;
                if (!arrayList.isEmpty()) {
                    this.f44882g0.add((o) arrayList.get(0));
                }
                this.f44883h0 = null;
            } catch (t e7) {
                throw new p(sVar, e7, z10, -49998);
            }
        }
        if (!this.f44882g0.isEmpty()) {
            ArrayDeque arrayDeque = this.f44882g0;
            arrayDeque.getClass();
            while (this.f44877b0 == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!W(sVar) || !s0(oVar)) {
                    return;
                }
                try {
                    S(oVar, mediaCrypto);
                } catch (Exception e10) {
                    e2.a.o("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e10);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + oVar.f44859a + ", " + sVar;
                    String str3 = sVar.f2397r;
                    if (e10 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e10).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e10, str3, z10, oVar, str);
                    X(pVar);
                    p pVar2 = this.f44883h0;
                    if (pVar2 == null) {
                        this.f44883h0 = pVar;
                    } else {
                        this.f44883h0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f44869a, pVar2.f44870b, pVar2.f44871c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f44883h0;
                    }
                }
            }
            this.f44882g0 = null;
            return;
        }
        throw new p(sVar, null, z10, -49999);
    }

    public boolean W(b2.s sVar) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(long j3, long j10, String str);

    public abstract void Z(String str);

    public i2.i a0(n4.y r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.a0(n4.y):i2.i");
    }

    public abstract void b0(b2.s sVar, MediaFormat mediaFormat);

    public void d0(long j3) {
        this.Q0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (!arrayDeque.isEmpty() && j3 >= ((q) arrayDeque.peek()).f44873a) {
                q qVar = (q) arrayDeque.poll();
                qVar.getClass();
                p0(qVar);
                e0();
            } else {
                return;
            }
        }
    }

    public abstract void e0();

    @Override
    public final long g(long j3, long j10) {
        return P(j3, j10);
    }

    public final void g0() {
        int i10 = this.D0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.K0 = true;
                    k0();
                    return;
                }
                j0();
                U();
                return;
            }
            I();
            x0();
            return;
        }
        I();
    }

    public abstract boolean h0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar);

    public final boolean i0(int i10) {
        y yVar = this.f11522c;
        yVar.A();
        h2.h hVar = this.L;
        hVar.clear();
        int w10 = w(yVar, hVar, i10 | 4);
        if (w10 == -5) {
            a0(yVar);
            return true;
        } else if (w10 == -4 && hVar.isEndOfStream()) {
            this.J0 = true;
            g0();
            return false;
        } else {
            return false;
        }
    }

    public final void j0() {
        try {
            l lVar = this.f44877b0;
            if (lVar != null) {
                lVar.release();
                this.O0.f11599b++;
                o oVar = this.f44884i0;
                oVar.getClass();
                Z(oVar.f44859a);
            }
            this.f44877b0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f44877b0 = null;
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

    public abstract void k0();

    public final void l0() {
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44900z0 = false;
        this.O.clear();
        this.N.clear();
        this.f44899y0 = false;
        i0 i0Var = this.R;
        i0Var.getClass();
        i0Var.f14625a = c2.h.f4183a;
        i0Var.f14627c = 0;
        i0Var.f14626b = 2;
    }

    @Override
    public boolean m() {
        if (this.S != null) {
            if (!n() && this.f44894t0 < 0) {
                if (this.f44892r0 != -9223372036854775807L) {
                    this.h.getClass();
                    if (SystemClock.elapsedRealtime() < this.f44892r0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void m0() {
        this.f44893s0 = -1;
        this.M.f10876c = null;
        this.f44894t0 = -1;
        this.f44895u0 = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.f44892r0 = -9223372036854775807L;
        this.F0 = false;
        this.f44891q0 = -9223372036854775807L;
        this.E0 = false;
        this.f44888n0 = false;
        this.f44889o0 = false;
        this.f44896v0 = false;
        this.f44897w0 = false;
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = this.A0 ? 1 : 0;
        this.T0 = false;
        this.U0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
    }

    public final void n0() {
        m0();
        this.N0 = null;
        this.f44882g0 = null;
        this.f44884i0 = null;
        this.f44878c0 = null;
        this.f44879d0 = null;
        this.f44880e0 = false;
        this.G0 = false;
        this.f44881f0 = -1.0f;
        this.f44885j0 = 0;
        this.f44886k0 = false;
        this.f44887l0 = false;
        this.m0 = false;
        this.f44890p0 = false;
        this.A0 = false;
        this.B0 = 0;
    }

    @Override
    public void o() {
        this.S = null;
        p0(q.f44872e);
        this.Q.clear();
        if (this.f44898x0) {
            this.f44898x0 = false;
            l0();
            return;
        }
        J();
    }

    public final void o0(n2.g gVar) {
        i2.g.D(this.U, gVar);
        this.U = gVar;
    }

    public final void p0(q qVar) {
        this.P0 = qVar;
        if (qVar.f44875c != -9223372036854775807L) {
            this.R0 = true;
            c0();
        }
    }

    @Override
    public void q(long j3, boolean z10) {
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        if (this.f44898x0) {
            l0();
        } else if (J()) {
            U();
        }
        if (this.P0.d.i() > 0) {
            this.L0 = true;
        }
        this.P0.d.c();
        this.Q.clear();
    }

    public boolean q0(h2.h hVar) {
        return false;
    }

    public boolean r0() {
        return true;
    }

    public boolean s0(o oVar) {
        return true;
    }

    public boolean t0() {
        boolean z10;
        int i10 = this.D0;
        if (i10 == 3 || ((this.f44886k0 && !this.G0) || (this.f44887l0 && this.F0))) {
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
                    x0();
                    return false;
                } catch (i2.o e7) {
                    e2.a.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean u0(b2.s sVar) {
        return false;
    }

    @Override
    public void v(b2.s[] r12, long r13, long r15, u2.f0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.v(b2.s[], long, long, u2.f0):void");
    }

    public abstract int v0(i iVar, b2.s sVar);

    public final boolean w0(b2.s sVar) {
        if (Build.VERSION.SDK_INT >= 23 && this.f44877b0 != null && this.D0 != 3 && this.f11525n != 0) {
            float f7 = this.f44876a0;
            sVar.getClass();
            b2.s[] sVarArr = this.f11527s;
            sVarArr.getClass();
            float N = N(f7, sVar, sVarArr);
            float f10 = this.f44881f0;
            if (f10 != N) {
                if (N == -1.0f) {
                    if (this.E0) {
                        this.C0 = 1;
                        this.D0 = 3;
                        return false;
                    }
                    j0();
                    U();
                    return false;
                } else if (f10 != -1.0f || N > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", N);
                    l lVar = this.f44877b0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f44881f0 = N;
                }
            }
        }
        return true;
    }

    @Override
    public void x(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.x(long, long):void");
    }

    public final void x0() {
        n2.g gVar = this.V;
        gVar.getClass();
        h2.b h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).f16439b);
            } catch (MediaCryptoException e7) {
                throw c(e7, this.S, false, 6006);
            }
        }
        o0(this.V);
        this.C0 = 0;
        this.D0 = 0;
    }

    public final void y0(long j3) {
        b2.s sVar = (b2.s) this.P0.d.g(j3);
        if (sVar == null && this.R0 && this.f44879d0 != null) {
            sVar = (b2.s) this.P0.d.f();
        }
        if (sVar != null) {
            this.T = sVar;
        } else if (!this.f44880e0 || this.T == null) {
            return;
        }
        b2.s sVar2 = this.T;
        sVar2.getClass();
        b0(sVar2, this.f44879d0);
        this.f44880e0 = false;
        this.R0 = false;
    }

    @Override
    public void z(float f7, float f10) {
        this.Z = f7;
        this.f44876a0 = f10;
        w0(this.f44878c0);
    }

    public void c0() {
    }

    public void f0(h2.h hVar) {
    }
}

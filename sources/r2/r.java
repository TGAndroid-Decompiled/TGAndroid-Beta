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
import i2.j0;
import i2.n1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k2.i0;
import n4.y;
import v7.x7;
public abstract class r extends i2.f {
    public static final byte[] V0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public long G0;
    public long H0;
    public final k I;
    public boolean I0;
    public final i J;
    public boolean J0;
    public final float K;
    public boolean K0;
    public final h2.h L;
    public boolean L0;
    public final h2.h M;
    public i2.n M0;
    public final h2.h N;
    public i2.g N0;
    public final g O;
    public q O0;
    public final MediaCodec.BufferInfo P;
    public long P0;
    public final ArrayDeque Q;
    public boolean Q0;
    public final i0 R;
    public boolean R0;
    public b2.s S;
    public boolean S0;
    public b2.s T;
    public long T0;
    public n2.g U;
    public long U0;
    public n2.g V;
    public j0 W;
    public MediaCrypto X;
    public final long Y;
    public float Z;
    public float f47135a0;
    public l f47136b0;
    public b2.s f47137c0;
    public MediaFormat f47138d0;
    public boolean f47139e0;
    public float f47140f0;
    public ArrayDeque f47141g0;
    public p f47142h0;
    public o f47143i0;
    public int f47144j0;
    public boolean f47145k0;
    public boolean f47146l0;
    public boolean m0;
    public boolean f47147n0;
    public boolean f47148o0;
    public long f47149p0;
    public long f47150q0;
    public int f47151r0;
    public int f47152s0;
    public ByteBuffer f47153t0;
    public boolean f47154u0;
    public boolean f47155v0;
    public boolean f47156w0;
    public boolean f47157x0;
    public boolean f47158y0;
    public boolean f47159z0;

    public r(int i10, k kVar, float f7) {
        super(i10);
        i iVar = i.f47113b;
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
        this.f47135a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.O0 = q.f47131e;
        hVar.b(0);
        hVar.f10983c.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f14487a = c2.h.f4010a;
        obj.f14489c = 0;
        obj.f14488b = 2;
        this.R = obj;
        this.f47140f0 = -1.0f;
        this.f47144j0 = 0;
        this.A0 = 0;
        this.f47151r0 = -1;
        this.f47152s0 = -1;
        this.f47150q0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.f47149p0 = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 0;
        this.N0 = new Object();
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    @Override
    public final int A(b2.s sVar) {
        try {
            return u0(this.J, sVar);
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
        e2.d.g(!this.J0);
        g gVar2 = this.O;
        if (gVar2.f()) {
            ByteBuffer byteBuffer = gVar2.f10983c;
            int i13 = this.f47152s0;
            int i14 = gVar2.f47110s;
            long j11 = gVar2.f10984e;
            boolean S = S(this.f11650w, gVar2.f47109r);
            boolean isEndOfStream = gVar2.isEndOfStream();
            b2.s sVar = this.T;
            sVar.getClass();
            gVar = gVar2;
            if (g0(j3, j10, null, byteBuffer, i13, 0, i14, j11, S, isEndOfStream, sVar)) {
                c0(gVar.f47109r);
                gVar.clear();
            }
            return false;
        }
        gVar = gVar2;
        if (this.I0) {
            this.J0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.f47157x0;
        h2.h hVar = this.N;
        if (z10) {
            e2.d.g(gVar.e(hVar));
            this.f47157x0 = false;
        }
        if (this.f47158y0) {
            if (gVar.f()) {
                return true;
            }
            this.f47156w0 = false;
            k0();
            this.f47158y0 = false;
            T();
            if (!this.f47156w0) {
                return false;
            }
        }
        e2.d.g(!this.I0);
        y yVar = this.f11644c;
        yVar.f();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(yVar, hVar, r12);
            if (w10 != -5) {
                if (w10 != -4) {
                    if (w10 == -3) {
                        if (k()) {
                            this.H0 = this.G0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (hVar.isEndOfStream()) {
                    this.I0 = true;
                    this.H0 = this.G0;
                    break;
                } else {
                    this.G0 = Math.max(this.G0, hVar.f10984e);
                    if (k() || this.M.isLastSample()) {
                        this.H0 = this.G0;
                    }
                    byte[] bArr = null;
                    if (this.K0) {
                        b2.s sVar2 = this.S;
                        sVar2.getClass();
                        this.T = sVar2;
                        if (Objects.equals(sVar2.f3641r, "audio/opus") && !this.T.f3644u.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.T.f3644u.get(r12);
                            int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            b2.r a2 = this.T.a();
                            a2.L = i15;
                            this.T = new b2.s(a2);
                        }
                        a0(this.T, null);
                        this.K0 = r12;
                    }
                    hVar.c();
                    b2.s sVar3 = this.T;
                    if (sVar3 != null && Objects.equals(sVar3.f3641r, "audio/opus")) {
                        if (hVar.hasSupplementalData()) {
                            hVar.f10981a = this.T;
                            Q(hVar);
                        }
                        if (this.f11650w - hVar.f10984e <= 80000) {
                            List list = this.T.f3644u;
                            i0 i0Var = this.R;
                            i0Var.getClass();
                            hVar.f10983c.getClass();
                            if (hVar.f10983c.limit() - hVar.f10983c.position() != 0) {
                                if (i0Var.f14488b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r12);
                                }
                                ByteBuffer byteBuffer2 = hVar.f10983c;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i16 = limit - position;
                                int i17 = (i16 + 255) / 255;
                                int i18 = i17 + 27 + i16;
                                if (i0Var.f14488b == 2) {
                                    if (bArr != null) {
                                        i10 = bArr.length + 28;
                                    } else {
                                        i10 = 47;
                                    }
                                    i18 = i10 + 44 + i18;
                                } else {
                                    i10 = r12;
                                }
                                if (i0Var.f14487a.capacity() < i18) {
                                    i0Var.f14487a = ByteBuffer.allocate(i18).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    i0Var.f14487a.clear();
                                }
                                ByteBuffer byteBuffer3 = i0Var.f14487a;
                                if (i0Var.f14488b == 2) {
                                    if (bArr != null) {
                                        i0.a(byteBuffer3, 0L, 0, 1, true);
                                        i12 = limit;
                                        byteBuffer3.put(x7.a(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i11 = position;
                                        byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i11 = position;
                                        i12 = limit;
                                        byteBuffer3.put(i0.d);
                                    }
                                    byteBuffer3.put(i0.f14486e);
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
                                int k10 = i0Var.f14489c + ((int) ((c3.b.k(b11, b10) * 48000) / 1000000));
                                i0Var.f14489c = k10;
                                i0.a(byteBuffer3, k10, i0Var.f14488b, i17, false);
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
                                if (i0Var.f14488b == 2) {
                                    byteBuffer3.putInt(i10 + 66, d0.n(byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                } else {
                                    byteBuffer3.putInt(22, d0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                                }
                                i0Var.f14488b++;
                                i0Var.f14487a = byteBuffer3;
                                hVar.clear();
                                hVar.b(i0Var.f14487a.remaining());
                                hVar.f10983c.put(i0Var.f14487a);
                                hVar.c();
                            }
                        }
                    }
                    if (gVar.f()) {
                        long j12 = this.f11650w;
                        if (S(j12, gVar.f47109r) != S(j12, hVar.f10984e)) {
                            break;
                        }
                    }
                    if (!gVar.e(hVar)) {
                        break;
                    }
                    r12 = 0;
                }
            } else {
                Z(yVar);
                break;
            }
        }
        this.f47157x0 = true;
        if (gVar.f()) {
            gVar.c();
        }
        if (!gVar.f() && !this.I0 && !this.f47158y0) {
            return false;
        }
        return true;
    }

    public abstract i2.h D(o oVar, b2.s sVar, b2.s sVar2);

    public n E(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean F() {
        if (this.D0) {
            this.B0 = 1;
            if (this.f47146l0) {
                this.C0 = 3;
                return false;
            }
            this.C0 = 2;
            return true;
        }
        w0();
        return true;
    }

    public final boolean G(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        l lVar = this.f47136b0;
        lVar.getClass();
        int i10 = this.f47152s0;
        MediaCodec.BufferInfo bufferInfo = this.P;
        if (i10 < 0) {
            int h = lVar.h(bufferInfo);
            if (h < 0) {
                if (h == -2) {
                    this.F0 = true;
                    l lVar2 = this.f47136b0;
                    lVar2.getClass();
                    MediaFormat outputFormat = lVar2.getOutputFormat();
                    if (this.f47144j0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f47147n0 = true;
                        return true;
                    }
                    this.f47138d0 = outputFormat;
                    this.f47139e0 = true;
                    return true;
                }
                if (this.f47148o0 && (this.I0 || this.B0 == 2)) {
                    f0();
                }
                long j11 = this.f47149p0;
                if (j11 != -9223372036854775807L) {
                    this.h.getClass();
                    if (j11 + 100 < System.currentTimeMillis()) {
                        f0();
                        return false;
                    }
                }
                return false;
            } else if (this.f47147n0) {
                this.f47147n0 = false;
                lVar.c(h);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                f0();
                return false;
            } else {
                this.f47152s0 = h;
                ByteBuffer outputBuffer = lVar.getOutputBuffer(h);
                this.f47153t0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(bufferInfo.offset);
                    this.f47153t0.limit(bufferInfo.offset + bufferInfo.size);
                }
                x0(bufferInfo.presentationTimeUs);
            }
        }
        long j12 = bufferInfo.presentationTimeUs;
        if (j12 < this.f11650w) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47154u0 = z10;
        long j13 = this.H0;
        if (j13 != -9223372036854775807L && j13 <= j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47155v0 = z11;
        if (this.S0) {
            long j14 = this.T0;
            if (j14 != -9223372036854775807L && j12 <= j14) {
                this.S0 = false;
                this.T0 = -9223372036854775807L;
            } else {
                this.T0 = j12;
                this.f47154u0 = true;
                this.f47155v0 = false;
            }
        }
        ByteBuffer byteBuffer = this.f47153t0;
        int i11 = this.f47152s0;
        int i12 = bufferInfo.flags;
        boolean z13 = this.f47154u0;
        boolean z14 = this.f47155v0;
        b2.s sVar = this.T;
        sVar.getClass();
        if (!g0(j3, j10, lVar, byteBuffer, i11, i12, 1, j12, z13, z14, sVar)) {
            return false;
        }
        c0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && this.E0 && this.f47155v0) {
            this.h.getClass();
            this.f47149p0 = System.currentTimeMillis();
        }
        this.f47152s0 = -1;
        this.f47153t0 = null;
        if (!z12) {
            return true;
        }
        f0();
        return false;
    }

    public final boolean H() {
        l lVar = this.f47136b0;
        if (lVar != null && this.B0 != 2 && !this.I0) {
            int i10 = this.f47151r0;
            h2.h hVar = this.M;
            if (i10 < 0) {
                int g10 = lVar.g();
                this.f47151r0 = g10;
                if (g10 >= 0) {
                    hVar.f10983c = lVar.getInputBuffer(g10);
                    hVar.clear();
                }
            }
            if (this.B0 == 1) {
                if (!this.f47148o0) {
                    this.E0 = true;
                    lVar.a(0L, this.f47151r0, 0, 4);
                    this.f47151r0 = -1;
                    hVar.f10983c = null;
                }
                this.B0 = 2;
                return false;
            } else if (this.m0) {
                this.m0 = false;
                ByteBuffer byteBuffer = hVar.f10983c;
                byteBuffer.getClass();
                byteBuffer.put(V0);
                lVar.a(0L, this.f47151r0, 38, 0);
                this.f47151r0 = -1;
                hVar.f10983c = null;
                this.D0 = true;
                return true;
            } else {
                if (this.A0 == 1) {
                    int i11 = 0;
                    while (true) {
                        b2.s sVar = this.f47137c0;
                        sVar.getClass();
                        if (i11 >= sVar.f3644u.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = hVar.f10983c;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.f47137c0.f3644u.get(i11));
                        i11++;
                    }
                    this.A0 = 2;
                }
                ByteBuffer byteBuffer3 = hVar.f10983c;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                y yVar = this.f11644c;
                yVar.f();
                try {
                    int w10 = w(yVar, hVar, 0);
                    if (w10 == -3) {
                        if (k()) {
                            this.H0 = this.G0;
                            return false;
                        }
                    } else if (w10 == -5) {
                        if (this.A0 == 2) {
                            hVar.clear();
                            this.A0 = 1;
                        }
                        Z(yVar);
                        return true;
                    } else if (hVar.isEndOfStream()) {
                        this.H0 = this.G0;
                        if (this.A0 == 2) {
                            hVar.clear();
                            this.A0 = 1;
                        }
                        this.I0 = true;
                        if (!this.D0) {
                            f0();
                            return false;
                        } else if (!this.f47148o0) {
                            this.E0 = true;
                            lVar.a(0L, this.f47151r0, 0, 4);
                            this.f47151r0 = -1;
                            hVar.f10983c = null;
                            return false;
                        }
                    } else {
                        if (!this.D0 && !hVar.isKeyFrame()) {
                            hVar.clear();
                            if (this.A0 == 2) {
                                this.A0 = 1;
                                return true;
                            }
                        } else if (!p0(hVar)) {
                            boolean flag = hVar.getFlag(1073741824);
                            if (flag) {
                                h2.d dVar = hVar.f10982b;
                                if (position == 0) {
                                    dVar.getClass();
                                } else {
                                    if (dVar.d == null) {
                                        int[] iArr = new int[1];
                                        dVar.d = iArr;
                                        dVar.f10979i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = dVar.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            long j3 = hVar.f10984e;
                            if (this.K0) {
                                ArrayDeque arrayDeque = this.Q;
                                if (!arrayDeque.isEmpty()) {
                                    a0 a0Var = ((q) arrayDeque.peekLast()).d;
                                    b2.s sVar2 = this.S;
                                    sVar2.getClass();
                                    a0Var.a(sVar2, j3);
                                } else {
                                    a0 a0Var2 = this.O0.d;
                                    b2.s sVar3 = this.S;
                                    sVar3.getClass();
                                    a0Var2.a(sVar3, j3);
                                }
                                this.K0 = false;
                            }
                            this.G0 = Math.max(this.G0, j3);
                            if (k() || hVar.isLastSample()) {
                                this.H0 = this.G0;
                            }
                            hVar.c();
                            if (hVar.hasSupplementalData()) {
                                Q(hVar);
                            }
                            e0(hVar);
                            int L = L(hVar);
                            if (Build.VERSION.SDK_INT < 34 || (L & 32) == 0) {
                                n1 n1Var = this.d;
                                n1Var.getClass();
                                if (!n1Var.f11802b) {
                                    this.U0 = Math.max(this.U0, hVar.f10984e);
                                }
                            }
                            if (flag) {
                                lVar.b(this.f47151r0, hVar.f10982b, j3, L);
                            } else {
                                int i12 = this.f47151r0;
                                ByteBuffer byteBuffer4 = hVar.f10983c;
                                byteBuffer4.getClass();
                                lVar.a(j3, i12, byteBuffer4.limit(), L);
                            }
                            this.f47151r0 = -1;
                            hVar.f10983c = null;
                            this.D0 = true;
                            this.A0 = 0;
                            this.N0.f11694c++;
                            return true;
                        }
                        return true;
                    }
                } catch (h2.g e7) {
                    W(e7);
                    h0(0);
                    I();
                    return true;
                }
            }
        }
        return false;
    }

    public final void I() {
        try {
            l lVar = this.f47136b0;
            e2.d.h(lVar);
            lVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean J() {
        if (this.f47136b0 != null) {
            if (s0()) {
                i0();
                return true;
            } else if (q0()) {
                I();
                return false;
            } else {
                long j3 = this.U0;
                if (j3 != -9223372036854775807L && this.f11650w <= j3 && this.P0 < j3) {
                    this.S0 = true;
                    this.U0 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    public final List K(boolean z10) {
        b2.s sVar = this.S;
        sVar.getClass();
        i iVar = this.J;
        ArrayList N = N(iVar, sVar, z10);
        if (N.isEmpty() && z10) {
            ArrayList N2 = N(iVar, sVar, false);
            if (!N2.isEmpty()) {
                e2.a.n("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f3641r + ", but no secure decoder available. Trying to proceed with " + N2 + ".");
            }
            return N2;
        }
        return N;
    }

    public int L(h2.h hVar) {
        return 0;
    }

    public abstract float M(float f7, b2.s sVar, b2.s[] sVarArr);

    public abstract ArrayList N(i iVar, b2.s sVar, boolean z10);

    public long O(long j3, long j10) {
        return super.g(j3, j10);
    }

    public abstract com.google.firebase.messaging.n P(o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7);

    public abstract void Q(h2.h hVar);

    public final void R(r2.o r12, android.media.MediaCrypto r13) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.R(r2.o, android.media.MediaCrypto):void");
    }

    public final boolean S(long j3, long j10) {
        if (j10 < j3) {
            b2.s sVar = this.T;
            if (sVar == null || !Objects.equals(sVar.f3641r, "audio/opus") || j3 - j10 > 80000) {
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
        if (this.f47141g0 == null) {
            try {
                List K = K(z10);
                this.f47141g0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) K;
                if (!arrayList.isEmpty()) {
                    this.f47141g0.add((o) arrayList.get(0));
                }
                this.f47142h0 = null;
            } catch (t e7) {
                throw new p(sVar, e7, z10, -49998);
            }
        }
        if (!this.f47141g0.isEmpty()) {
            ArrayDeque arrayDeque = this.f47141g0;
            arrayDeque.getClass();
            while (this.f47136b0 == null) {
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
                    String str2 = "Decoder init failed: " + oVar.f47118a + ", " + sVar;
                    String str3 = sVar.f3641r;
                    if (e10 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e10).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    p pVar = new p(str2, e10, str3, z10, oVar, str);
                    W(pVar);
                    p pVar2 = this.f47142h0;
                    if (pVar2 == null) {
                        this.f47142h0 = pVar;
                    } else {
                        this.f47142h0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f47128a, pVar2.f47129b, pVar2.f47130c, pVar2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f47142h0;
                    }
                }
            }
            this.f47141g0 = null;
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

    public i2.h Z(n4.y r13) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.Z(n4.y):i2.h");
    }

    public abstract void a0(b2.s sVar, MediaFormat mediaFormat);

    public void c0(long j3) {
        this.P0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (!arrayDeque.isEmpty() && j3 >= ((q) arrayDeque.peek()).f47132a) {
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
        int i10 = this.C0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.J0 = true;
                    j0();
                    return;
                }
                i0();
                T();
                return;
            }
            I();
            w0();
            return;
        }
        I();
    }

    @Override
    public final long g(long j3, long j10) {
        return O(j3, j10);
    }

    public abstract boolean g0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar);

    public final boolean h0(int i10) {
        y yVar = this.f11644c;
        yVar.f();
        h2.h hVar = this.L;
        hVar.clear();
        int w10 = w(yVar, hVar, i10 | 4);
        if (w10 == -5) {
            Z(yVar);
            return true;
        } else if (w10 == -4 && hVar.isEndOfStream()) {
            this.I0 = true;
            f0();
            return false;
        } else {
            return false;
        }
    }

    public final void i0() {
        try {
            l lVar = this.f47136b0;
            if (lVar != null) {
                lVar.release();
                this.N0.f11693b++;
                o oVar = this.f47143i0;
                oVar.getClass();
                Y(oVar.f47118a);
            }
            this.f47136b0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f47136b0 = null;
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
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.f47158y0 = false;
        this.O.clear();
        this.N.clear();
        this.f47157x0 = false;
        i0 i0Var = this.R;
        i0Var.getClass();
        i0Var.f14487a = c2.h.f4010a;
        i0Var.f14489c = 0;
        i0Var.f14488b = 2;
    }

    public void l0() {
        this.f47151r0 = -1;
        this.M.f10983c = null;
        this.f47152s0 = -1;
        this.f47153t0 = null;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.f47150q0 = -9223372036854775807L;
        this.E0 = false;
        this.f47149p0 = -9223372036854775807L;
        this.D0 = false;
        this.m0 = false;
        this.f47147n0 = false;
        this.f47154u0 = false;
        this.f47155v0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = this.f47159z0 ? 1 : 0;
        this.S0 = false;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    @Override
    public boolean m() {
        if (this.S != null) {
            if (!n() && this.f47152s0 < 0) {
                if (this.f47150q0 != -9223372036854775807L) {
                    this.h.getClass();
                    if (SystemClock.elapsedRealtime() < this.f47150q0) {
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

    public final void m0() {
        l0();
        this.M0 = null;
        this.f47141g0 = null;
        this.f47143i0 = null;
        this.f47137c0 = null;
        this.f47138d0 = null;
        this.f47139e0 = false;
        this.F0 = false;
        this.f47140f0 = -1.0f;
        this.f47144j0 = 0;
        this.f47145k0 = false;
        this.f47146l0 = false;
        this.f47148o0 = false;
        this.f47159z0 = false;
        this.A0 = 0;
    }

    public final void n0(n2.g gVar) {
        hg.c.D(this.U, gVar);
        this.U = gVar;
    }

    @Override
    public void o() {
        this.S = null;
        o0(q.f47131e);
        this.Q.clear();
        if (this.f47156w0) {
            this.f47156w0 = false;
            k0();
            return;
        }
        J();
    }

    public final void o0(q qVar) {
        this.O0 = qVar;
        if (qVar.f47134c != -9223372036854775807L) {
            this.Q0 = true;
            b0();
        }
    }

    public boolean p0(h2.h hVar) {
        return false;
    }

    @Override
    public void q(long j3, boolean z10) {
        this.I0 = false;
        this.J0 = false;
        this.L0 = false;
        if (this.f47156w0) {
            k0();
        } else if (J()) {
            T();
        }
        if (this.O0.d.m() > 0) {
            this.K0 = true;
        }
        this.O0.d.c();
        this.Q.clear();
    }

    public boolean q0() {
        return true;
    }

    public boolean r0(o oVar) {
        return true;
    }

    public boolean s0() {
        int i10 = this.C0;
        if (i10 == 3 || ((this.f47145k0 && !this.F0) || (this.f47146l0 && this.E0))) {
            return true;
        }
        if (i10 == 2) {
            try {
                w0();
                return false;
            } catch (i2.n e7) {
                e2.a.o("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                return true;
            }
        }
        return false;
    }

    public boolean t0(b2.s sVar) {
        return false;
    }

    public abstract int u0(i iVar, b2.s sVar);

    @Override
    public void v(b2.s[] r12, long r13, long r15, u2.f0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.v(b2.s[], long, long, u2.f0):void");
    }

    public final boolean v0(b2.s sVar) {
        if (this.f47136b0 != null && this.C0 != 3 && this.f11647n != 0) {
            float f7 = this.f47135a0;
            sVar.getClass();
            b2.s[] sVarArr = this.f11649s;
            sVarArr.getClass();
            float M = M(f7, sVar, sVarArr);
            float f10 = this.f47140f0;
            if (f10 != M) {
                if (M == -1.0f) {
                    if (this.D0) {
                        this.B0 = 1;
                        this.C0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                } else if (f10 != -1.0f || M > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", M);
                    l lVar = this.f47136b0;
                    lVar.getClass();
                    lVar.setParameters(bundle);
                    this.f47140f0 = M;
                }
            }
        }
        return true;
    }

    public final void w0() {
        n2.g gVar = this.V;
        gVar.getClass();
        h2.b h = gVar.h();
        if (h instanceof n2.r) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((n2.r) h).f16279b);
            } catch (MediaCryptoException e7) {
                throw c(e7, this.S, false, 6006);
            }
        }
        n0(this.V);
        this.B0 = 0;
        this.C0 = 0;
    }

    @Override
    public void x(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: r2.r.x(long, long):void");
    }

    public final void x0(long j3) {
        b2.s sVar = (b2.s) this.O0.d.i(j3);
        if (sVar == null && this.Q0 && this.f47138d0 != null) {
            sVar = (b2.s) this.O0.d.h();
        }
        if (sVar != null) {
            this.T = sVar;
        } else if (!this.f47139e0 || this.T == null) {
            return;
        }
        b2.s sVar2 = this.T;
        sVar2.getClass();
        a0(sVar2, this.f47138d0);
        this.f47139e0 = false;
        this.Q0 = false;
    }

    @Override
    public void z(float f7, float f10) {
        this.Z = f7;
        this.f47135a0 = f10;
        v0(this.f47137c0);
    }

    public void b0() {
    }

    public void e0(h2.h hVar) {
    }
}

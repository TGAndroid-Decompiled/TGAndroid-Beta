package r2;

import a8.ha;
import a8.ja;
import android.net.Uri;
import c8.q0;
import e2.u;
import h2.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m4.d0;
public final class i extends y2.l {
    public static final AtomicInteger f55794d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final j2.h G;
    public final j2.m H;
    public final b I;
    public final boolean J;
    public final boolean K;
    public final k0 L;
    public final c M;
    public final List N;
    public final e2.r O;
    public final t3.h P;
    public final x Q;
    public final boolean R;
    public final boolean S;
    public b T;
    public q U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public i0 Z;
    public boolean f55795a0;
    public long f55796b0;
    public boolean f55797c0;
    public final int f55798w;
    public final int f55799x;
    public final Uri f55800y;

    public i(c cVar, j2.h hVar, j2.m mVar, u uVar, boolean z10, j2.h hVar2, j2.m mVar2, boolean z11, Uri uri, List list, int i7, Object obj, long j3, long j10, long j11, int i10, boolean z12, int i11, boolean z13, boolean z14, k0 k0Var, e2.r rVar, b bVar, t3.h hVar3, x xVar, boolean z15, boolean z16, m2.j jVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11);
        long j12;
        boolean z17;
        this.R = z10;
        this.F = i10;
        if (z12) {
            j12 = j10 - j3;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f55796b0 = j12;
        this.f55799x = i11;
        this.H = mVar2;
        this.G = hVar2;
        if (mVar2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.W = z17;
        this.S = z11;
        this.f55800y = uri;
        this.J = z14;
        this.L = k0Var;
        this.K = z13;
        this.M = cVar;
        this.N = list;
        this.O = rVar;
        this.I = bVar;
        this.P = hVar3;
        this.Q = xVar;
        this.f55797c0 = z15;
        this.E = z16;
        g0 g0Var = i0.f13686b;
        this.Z = s1.f13749e;
        this.f55798w = f55794d0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i7;
        if (ha.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i7 = byteArray.length - 16;
        } else {
            i7 = 0;
        }
        System.arraycopy(byteArray, i7, bArr, (16 - byteArray.length) + i7, byteArray.length - i7);
        return bArr;
    }

    @Override
    public final void D() {
        this.X = true;
    }

    @Override
    public final void a() {
        b bVar;
        this.U.getClass();
        if (this.T == null && (bVar = this.I) != null) {
            f3.o a10 = bVar.f55762a.a();
            if ((a10 instanceof d0) || (a10 instanceof z3.h)) {
                this.T = this.I;
                this.W = false;
            }
        }
        j2.m mVar = this.H;
        j2.h hVar = this.G;
        if (this.W) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.S);
            this.V = 0;
            this.W = false;
        }
        if (!this.X) {
            if (!this.K) {
                d(this.f60121r, this.f60116b, this.R);
            }
            this.Y = !this.X;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(j2.h hVar, j2.m mVar, boolean z10) {
        j2.m b10;
        boolean z11;
        long j3;
        boolean z12;
        if (z10) {
            if (this.V != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = z12;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.V);
            z11 = false;
        }
        try {
            f3.l h = h(hVar, b10);
            if (z11) {
                h.g(this.V, false);
            }
            do {
                try {
                    if (this.X) {
                        break;
                    }
                } catch (EOFException e10) {
                    if ((this.d.f10439f & 16384) != 0) {
                        this.T.f55762a.d(0L, 0L);
                        j3 = h.d;
                    } else {
                        throw e10;
                    }
                }
            } while (this.T.f55762a.f(h, b.f55761f) == 0);
            j3 = h.d;
            this.V = (int) (j3 - mVar.f16806e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            q0.a(hVar);
            throw th2;
        }
        q0.a(hVar);
    }

    public final int f(int i7) {
        ja.p(!this.f55797c0);
        if (i7 >= this.Z.size()) {
            return 0;
        }
        return ((Integer) this.Z.get(i7)).intValue();
    }

    public final boolean g() {
        if (this.f55796b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final f3.l h(j2.h r34, j2.m r35) {
        throw new UnsupportedOperationException("Method not decompiled: r2.i.h(j2.h, j2.m):f3.l");
    }
}

package r2;

import a8.ga;
import a8.ia;
import android.net.Uri;
import c8.p0;
import e2.u;
import h2.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m4.e0;
public final class j extends y2.l {
    public static final AtomicInteger f54221c0 = new AtomicInteger();
    public final boolean D;
    public final int E;
    public final j2.h F;
    public final j2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final k0 K;
    public final c L;
    public final List M;
    public final e2.r N;
    public final t3.h O;
    public final x P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public i0 Y;
    public boolean Z;
    public long f54222a0;
    public boolean f54223b0;
    public final int f54224w;
    public final int f54225x;
    public final Uri f54226y;

    public j(c cVar, j2.h hVar, j2.m mVar, u uVar, boolean z9, j2.h hVar2, j2.m mVar2, boolean z10, Uri uri, List list, int i7, Object obj, long j3, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, k0 k0Var, e2.r rVar, b bVar, t3.h hVar3, x xVar, boolean z14, boolean z15, m2.j jVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11);
        long j12;
        boolean z16;
        this.Q = z9;
        this.E = i10;
        if (z11) {
            j12 = j10 - j3;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f54222a0 = j12;
        this.f54225x = i11;
        this.G = mVar2;
        this.F = hVar2;
        if (mVar2 != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.V = z16;
        this.R = z10;
        this.f54226y = uri;
        this.I = z13;
        this.K = k0Var;
        this.J = z12;
        this.L = cVar;
        this.M = list;
        this.N = rVar;
        this.H = bVar;
        this.O = hVar3;
        this.P = xVar;
        this.f54223b0 = z14;
        this.D = z15;
        g0 g0Var = i0.f14329b;
        this.Y = t1.f14397e;
        this.f54224w = f54221c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i7;
        if (ga.c(str).startsWith("0x")) {
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
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            f3.o a10 = bVar.f54188a.a();
            if ((a10 instanceof e0) || (a10 instanceof z3.h)) {
                this.S = this.H;
                this.V = false;
            }
        }
        j2.m mVar = this.G;
        j2.h hVar = this.F;
        if (this.V) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.R);
            this.U = 0;
            this.V = false;
        }
        if (!this.W) {
            if (!this.J) {
                d(this.f58811r, this.f58806b, this.Q);
            }
            this.X = !this.W;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(j2.h hVar, j2.m mVar, boolean z9) {
        j2.m b10;
        boolean z10;
        long j3;
        boolean z11;
        if (z9) {
            if (this.U != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 = z11;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.U);
            z10 = false;
        }
        try {
            f3.l h = h(hVar, b10);
            if (z10) {
                h.j(this.U, false);
            }
            do {
                try {
                    if (this.W) {
                        break;
                    }
                } catch (EOFException e10) {
                    if ((this.d.f10603f & 16384) != 0) {
                        this.S.f54188a.d(0L, 0L);
                        j3 = h.d;
                    } else {
                        throw e10;
                    }
                }
            } while (this.S.f54188a.f(h, b.f54187f) == 0);
            j3 = h.d;
            this.U = (int) (j3 - mVar.f16449e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            p0.a(hVar);
            throw th2;
        }
        p0.a(hVar);
    }

    public final int f(int i7) {
        ia.p(!this.f54223b0);
        if (i7 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i7)).intValue();
    }

    public final boolean g() {
        if (this.f54222a0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final f3.l h(j2.h r34, j2.m r35) {
        throw new UnsupportedOperationException("Method not decompiled: r2.j.h(j2.h, j2.m):f3.l");
    }

    @Override
    public final void q0() {
        this.W = true;
    }
}

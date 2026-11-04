package q2;

import android.net.Uri;
import b8.uc;
import b8.xb;
import b8.zb;
import d2.v;
import g2.l0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l4.d0;
public final class j extends x2.l {
    public static final AtomicInteger f53700d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final i2.h G;
    public final i2.n H;
    public final b I;
    public final boolean J;
    public final boolean K;
    public final l0 L;
    public final c M;
    public final List N;
    public final d2.s O;
    public final s3.h P;
    public final y Q;
    public final boolean R;
    public final boolean S;
    public b T;
    public q U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public i0 Z;
    public boolean f53701a0;
    public long f53702b0;
    public boolean f53703c0;
    public final int f53704w;
    public final int f53705x;
    public final Uri f53706y;

    public j(c cVar, i2.h hVar, i2.n nVar, v vVar, boolean z10, i2.h hVar2, i2.n nVar2, boolean z11, Uri uri, List list, int i3, Object obj, long j10, long j11, long j12, int i10, boolean z12, int i11, boolean z13, boolean z14, l0 l0Var, d2.s sVar, b bVar, s3.h hVar3, y yVar, boolean z15, boolean z16, l2.k kVar) {
        super(hVar, nVar, vVar, i3, obj, j10, j11, j12);
        long j13;
        boolean z17;
        this.R = z10;
        this.F = i10;
        if (z12) {
            j13 = j11 - j10;
        } else {
            j13 = -9223372036854775807L;
        }
        this.f53702b0 = j13;
        this.f53705x = i11;
        this.H = nVar2;
        this.G = hVar2;
        if (nVar2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.W = z17;
        this.S = z11;
        this.f53706y = uri;
        this.J = z14;
        this.L = l0Var;
        this.K = z13;
        this.M = cVar;
        this.N = list;
        this.O = sVar;
        this.I = bVar;
        this.P = hVar3;
        this.Q = yVar;
        this.f53703c0 = z15;
        this.E = z16;
        g0 g0Var = i0.f12083b;
        this.Z = s1.f12146e;
        this.f53704w = f53700d0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i3;
        if (xb.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i3 = byteArray.length - 16;
        } else {
            i3 = 0;
        }
        System.arraycopy(byteArray, i3, bArr, (16 - byteArray.length) + i3, byteArray.length - i3);
        return bArr;
    }

    @Override
    public final void X1() {
        this.X = true;
    }

    @Override
    public final void a() {
        b bVar;
        this.U.getClass();
        if (this.T == null && (bVar = this.I) != null) {
            e3.o a10 = bVar.f53667a.a();
            if ((a10 instanceof d0) || (a10 instanceof y3.i)) {
                this.T = this.I;
                this.W = false;
            }
        }
        i2.n nVar = this.H;
        i2.h hVar = this.G;
        if (this.W) {
            hVar.getClass();
            nVar.getClass();
            d(hVar, nVar, this.S);
            this.V = 0;
            this.W = false;
        }
        if (!this.X) {
            if (!this.K) {
                d(this.f58154r, this.f58149b, this.R);
            }
            this.Y = !this.X;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(i2.h hVar, i2.n nVar, boolean z10) {
        i2.n b10;
        boolean z11;
        long j10;
        boolean z12;
        if (z10) {
            if (this.V != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = z12;
            b10 = nVar;
        } else {
            b10 = nVar.b(this.V);
            z11 = false;
        }
        try {
            e3.l h = h(hVar, b10);
            if (z11) {
                h.g(this.V, false);
            }
            do {
                try {
                    if (this.X) {
                        break;
                    }
                } catch (EOFException e10) {
                    if ((this.d.f8477f & 16384) != 0) {
                        this.T.f53667a.d(0L, 0L);
                        j10 = h.d;
                    } else {
                        throw e10;
                    }
                }
            } while (this.T.f53667a.f(h, b.f53666f) == 0);
            j10 = h.d;
            this.V = (int) (j10 - nVar.f14567e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            uc.a(hVar);
            throw th2;
        }
        uc.a(hVar);
    }

    public final int f(int i3) {
        zb.p(!this.f53703c0);
        if (i3 >= this.Z.size()) {
            return 0;
        }
        return ((Integer) this.Z.get(i3)).intValue();
    }

    public final boolean g() {
        if (this.f53702b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final e3.l h(i2.h r34, i2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: q2.j.h(i2.h, i2.n):e3.l");
    }
}

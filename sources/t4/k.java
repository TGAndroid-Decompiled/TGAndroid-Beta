package t4;

import android.net.Uri;
import b4.f0;
import h5.c0;
import h5.w;
import j3.n0;
import j7.q7;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k7.a7;
import s8.i0;
public final class k extends q4.k {
    public static final AtomicInteger Y = new AtomicInteger();
    public final int B;
    public final g5.m C;
    public final g5.p D;
    public final b E;
    public final boolean F;
    public final boolean G;
    public final c0 H;
    public final j I;
    public final List J;
    public final o3.g K;
    public final j4.i L;
    public final w M;
    public final boolean N;
    public final boolean O;
    public b P;
    public r Q;
    public int R;
    public boolean S;
    public volatile boolean T;
    public boolean U;
    public s8.v V;
    public boolean W;
    public boolean X;
    public final int v;
    public final int f47943w;
    public final Uri f47944x;
    public final boolean f47945y;

    public k(j jVar, g5.m mVar, g5.p pVar, n0 n0Var, boolean z4, g5.m mVar2, g5.p pVar2, boolean z10, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z11, int i12, boolean z12, boolean z13, c0 c0Var, o3.g gVar, b bVar, j4.i iVar, w wVar, boolean z14, k3.k kVar) {
        super(mVar, pVar, n0Var, i10, obj, j10, j11, j12);
        boolean z15;
        this.N = z4;
        this.B = i11;
        this.X = z11;
        this.f47943w = i12;
        this.D = pVar2;
        this.C = mVar2;
        if (pVar2 != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.S = z15;
        this.O = z10;
        this.f47944x = uri;
        this.F = z13;
        this.H = c0Var;
        this.G = z12;
        this.I = jVar;
        this.J = list;
        this.K = gVar;
        this.E = bVar;
        this.L = iVar;
        this.M = wVar;
        this.f47945y = z14;
        s8.t tVar = s8.v.f47174b;
        this.V = i0.f47139e;
        this.v = Y.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (a7.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override
    public final void a() {
        b bVar;
        this.Q.getClass();
        if (this.P == null && (bVar = this.E) != null) {
            r3.k kVar = bVar.f47914a;
            if ((kVar instanceof f0) || (kVar instanceof z3.i)) {
                this.P = bVar;
                this.S = false;
            }
        }
        g5.p pVar = this.D;
        g5.m mVar = this.C;
        if (this.S) {
            mVar.getClass();
            pVar.getClass();
            d(mVar, pVar, this.O);
            this.R = 0;
            this.S = false;
        }
        if (!this.T) {
            if (!this.G) {
                d(this.f44510r, this.f44505b, this.N);
            }
            this.U = !this.T;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(g5.m mVar, g5.p pVar, boolean z4) {
        g5.p b10;
        long j10;
        boolean z10 = false;
        if (z4) {
            if (this.R != 0) {
                z10 = true;
            }
            b10 = pVar;
        } else {
            b10 = pVar.b(this.R);
        }
        try {
            r3.h g10 = g(mVar, b10);
            if (z10) {
                g10.s(this.R);
            }
            do {
                try {
                    if (this.T) {
                        break;
                    }
                } catch (EOFException e6) {
                    if ((this.d.f9321e & 16384) != 0) {
                        this.P.f47914a.d(0L, 0L);
                        j10 = g10.d;
                    } else {
                        throw e6;
                    }
                }
            } while (this.P.f47914a.h(g10, b.d) == 0);
            j10 = g10.d;
            this.R = (int) (j10 - pVar.f6888e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            q7.a(mVar);
            throw th2;
        }
        q7.a(mVar);
    }

    public final int f(int i10) {
        h5.a.i(!this.f47945y);
        if (i10 >= this.V.size()) {
            return 0;
        }
        return ((Integer) this.V.get(i10)).intValue();
    }

    public final r3.h g(g5.m r26, g5.p r27) {
        throw new UnsupportedOperationException("Method not decompiled: t4.k.g(g5.m, g5.p):r3.h");
    }

    @Override
    public final void l() {
        this.T = true;
    }
}

package u2;

import android.net.Uri;
import android.os.Handler;
import i2.q1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class t0 implements d0, c3.q, y2.h, y2.k, y0 {
    public static final Map f43414g0;
    public static final b2.s f43415h0;
    public final e2.g E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public z0[] K;
    public s0[] L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public com.google.firebase.messaging.t Q;
    public c3.b0 R;
    public long S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Uri f43416a;
    public long f43417a0;
    public final g2.h f43418b;
    public long f43419b0;
    public final n2.m f43420c;
    public boolean f43421c0;
    public final qb.b d;
    public int f43422d0;
    public final a5.a e;
    public boolean f43423e0;
    public final n2.j f43424f;
    public boolean f43425f0;
    public final v0 h;
    public final y2.d f43426n;
    public final String f43427r;
    public final long f43428s;
    public final b2.s v;
    public final long f43429w;
    public final y2.m f43430x;
    public final lf.i f43431y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f43414g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f3232a = "icy";
        rVar.f3245q = b2.r0.n("application/x-icy");
        f43415h0 = new b2.s(rVar);
    }

    public t0(Uri uri, g2.h hVar, lf.i iVar, n2.m mVar, n2.j jVar, qb.b bVar, a5.a aVar, v0 v0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar2) {
        y2.m mVar2;
        this.f43416a = uri;
        this.f43418b = hVar;
        this.f43420c = mVar;
        this.f43424f = jVar;
        this.d = bVar;
        this.e = aVar;
        this.h = v0Var;
        this.f43426n = dVar;
        this.f43427r = str;
        this.f43428s = i10;
        this.v = sVar;
        if (aVar2 != null) {
            mVar2 = new y2.m(aVar2);
        } else {
            mVar2 = new y2.m("ProgressiveMediaPeriod");
        }
        this.f43430x = mVar2;
        this.f43431y = iVar;
        this.f43429w = j3;
        this.E = new e2.g();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new s0[0];
        this.K = new z0[0];
        this.f43419b0 = -9223372036854775807L;
        this.U = 1;
    }

    public final void A(c3.b0 b0Var) {
        c3.b0 tVar;
        boolean z10;
        if (this.J == null) {
            tVar = b0Var;
        } else {
            tVar = new c3.t(-9223372036854775807L);
        }
        this.R = tVar;
        this.S = b0Var.l();
        int i10 = 1;
        if (!this.Z && b0Var.l() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        if (z10) {
            i10 = 7;
        }
        this.U = i10;
        if (this.N) {
            this.h.v(this.S, b0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        q0 q0Var = new q0(this, this.f43416a, this.f43418b, this.f43431y, this, this.E);
        if (this.N) {
            e2.d.g(v());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f43419b0 > j3) {
                this.f43423e0 = true;
                this.f43419b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f43419b0).f3703a.f3733b;
            long j11 = this.f43419b0;
            q0Var.f43399f.f3790a = j10;
            q0Var.f43401r = j11;
            q0Var.f43400n = true;
            q0Var.f43403w = false;
            for (z0 z0Var : this.K) {
                z0Var.f43480t = this.f43419b0;
            }
            this.f43419b0 = -9223372036854775807L;
        }
        this.f43422d0 = f();
        this.f43430x.f(q0Var, this, this.d.L3(this.U));
    }

    public final boolean C() {
        if (!this.W && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        q0 q0Var = (q0) jVar;
        Uri uri = q0Var.f43397b.f9335c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, q0Var.f43401r, this.S);
        if (!z10) {
            for (z0 z0Var : this.K) {
                z0Var.D(false);
            }
            if (this.Y > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.v(this);
            }
        }
    }

    @Override
    public final void X1(c3.b0 b0Var) {
        this.H.post(new p2.b(25, this, b0Var));
    }

    @Override
    public final c3.h0 Z1(int i10, int i11) {
        return z(new s0(i10, false));
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        z0[] z0VarArr;
        for (z0 z0Var : this.K) {
            z0Var.D(true);
            n2.g gVar = z0Var.h;
            if (gVar != null) {
                gVar.a(z0Var.e);
                z0Var.h = null;
                z0Var.f43468g = null;
            }
        }
        lf.i iVar = this.f43431y;
        c3.o oVar = (c3.o) iVar.f14012c;
        if (oVar != null) {
            oVar.release();
            iVar.f14012c = null;
        }
        iVar.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f43430x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f7887b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long d() {
        return s();
    }

    public final void e() {
        e2.d.g(this.N);
        this.Q.getClass();
        this.R.getClass();
    }

    @Override
    public final void e1() {
        this.M = true;
        this.H.post(this.F);
    }

    public final int f() {
        z0[] z0VarArr;
        int i10 = 0;
        for (z0 z0Var : this.K) {
            i10 += z0Var.f43477q + z0Var.f43476p;
        }
        return i10;
    }

    @Override
    public final void g() {
        int L3 = this.d.L3(this.U);
        y2.m mVar = this.f43430x;
        IOException iOException = mVar.f46251c;
        if (iOException == null) {
            y2.i iVar = mVar.f46250b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f46241a;
                }
                IOException iOException2 = iVar.e;
                if (iOException2 != null && iVar.f46244f > L3) {
                    throw iOException2;
                }
            }
            if (this.f43423e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long h(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.t0.h(long):long");
    }

    @Override
    public final void i(long j3) {
        if (!this.P) {
            e();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.Q.d;
                int length = this.K.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.K[i10].j(j3, zArr[i10]);
                }
            }
        }
    }

    public final long j(boolean z10) {
        long j3 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.K.length; i10++) {
            if (!z10) {
                com.google.firebase.messaging.t tVar = this.Q;
                tVar.getClass();
                if (!((boolean[]) tVar.d)[i10]) {
                }
            }
            j3 = Math.max(j3, this.K[i10].q());
        }
        return j3;
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.I = c0Var;
        b2.s sVar = this.v;
        if (sVar != null) {
            Z1(0, 3).b(sVar);
            A(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            e1();
            this.f43419b0 = j3;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final long l() {
        if (this.X) {
            this.X = false;
            return this.f43417a0;
        } else if (this.W) {
            if (this.f43423e0 || f() > this.f43422d0) {
                this.W = false;
                return this.f43417a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        if (!this.f43423e0) {
            y2.m mVar = this.f43430x;
            if (!mVar.c() && !this.f43421c0) {
                if ((!this.N && this.v == null) || this.Y != 0) {
                    boolean e = this.E.e();
                    if (!mVar.d()) {
                        B();
                        return true;
                    }
                    return e;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d n(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.t0.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        q0 q0Var = (q0) jVar;
        g2.b0 b0Var = q0Var.f43397b;
        if (i10 == 0) {
            tVar = new t(q0Var.f43402s);
        } else {
            Uri uri = b0Var.f9335c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, null, 0, null, q0Var.f43401r, this.S, i10);
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.r rVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        n1 n1Var = (n1) tVar.f7335b;
        boolean[] zArr3 = (boolean[]) tVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            a1 a1Var = a1VarArr[i12];
            if (a1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((r0) a1Var).f43405a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                a1VarArr[i12] = null;
            }
        }
        if (!this.V ? !(j3 == 0 || this.P) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (a1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                if (rVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
                if (rVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.g(z12);
                int b10 = n1Var.b(rVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = rVar.m().f3306x | this.X;
                a1VarArr[i14] = new r0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    z0 z0Var = this.K[b10];
                    if (z0Var.t() != 0 && !z0Var.G(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Y == 0) {
            this.f43421c0 = false;
            this.W = false;
            this.X = false;
            y2.m mVar = this.f43430x;
            if (mVar.d()) {
                z0[] z0VarArr = this.K;
                int length = z0VarArr.length;
                while (i11 < length) {
                    z0VarArr[i11].k();
                    i11++;
                }
                mVar.b();
            } else {
                this.f43423e0 = false;
                for (z0 z0Var2 : this.K) {
                    z0Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
            while (i11 < a1VarArr.length) {
                if (a1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override
    public final void q(y2.j jVar, long j3, long j10) {
        long j11;
        q0 q0Var = (q0) jVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long j12 = j(true);
            if (j12 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = j12 + 10000;
            }
            this.S = j11;
            this.h.v(j11, this.R, this.T);
        }
        Uri uri = q0Var.f43397b.f9335c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, null, 0, null, q0Var.f43401r, this.S);
        this.f43423e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.v(this);
    }

    @Override
    public final n1 r() {
        e();
        return (n1) this.Q.f7335b;
    }

    @Override
    public final long s() {
        long j3;
        boolean z10;
        e();
        if (this.f43423e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f43419b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.t tVar = this.Q;
                if (((boolean[]) tVar.f7336c)[i10] && ((boolean[]) tVar.d)[i10]) {
                    z0 z0Var = this.K[i10];
                    synchronized (z0Var) {
                        z10 = z0Var.f43482w;
                    }
                    if (!z10) {
                        j3 = Math.min(j3, this.K[i10].q());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = j(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f43417a0;
        }
        return j3;
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return q1Var.a(j3, j10.f3703a.f3732a, j10.f3704b.f3732a);
    }

    public final boolean v() {
        if (this.f43419b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f43429w;
        if (!this.f43425f0 && !this.N && this.M && this.R != null) {
            for (z0 z0Var : this.K) {
                if (z0Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f7887b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f3301r;
                boolean i11 = b2.r0.i(str);
                if (!i11 && !b2.r0.m(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i10] = z10;
                this.O = z10 | this.O;
                boolean k10 = b2.r0.k(str);
                if (j3 != -9223372036854775807L && length == 1 && k10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.P = z11;
                p3.b bVar = this.J;
                if (bVar != null) {
                    int i12 = bVar.f40488a;
                    if (i11 || this.L[i10].f43411b) {
                        b2.p0 p0Var = w10.f3295l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f3239k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f3292i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int L0 = this.f43420c.L0(w10);
                b2.r a12 = w10.a();
                a12.R = L0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f3306x | this.X;
            }
            this.Q = new com.google.firebase.messaging.t(new n1(l1VarArr), zArr);
            if (this.P && this.S == -9223372036854775807L) {
                this.S = j3;
                this.R = new p0(this, this.R);
            }
            this.h.v(this.S, this.R, this.T);
            this.N = true;
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.a(this);
        }
    }

    public final void x(int i10) {
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        boolean[] zArr = (boolean[]) tVar.e;
        if (!zArr[i10]) {
            b2.s sVar = ((n1) tVar.f7335b).a(i10).d[0];
            this.e.k(b2.r0.h(sVar.f3301r), sVar, 0, null, this.f43417a0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f43421c0) {
            if ((!this.O || ((boolean[]) this.Q.f7336c)[i10]) && !this.K[i10].x(false)) {
                this.f43419b0 = 0L;
                this.f43421c0 = false;
                this.W = true;
                this.f43417a0 = 0L;
                this.f43422d0 = 0;
                for (z0 z0Var : this.K) {
                    z0Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.v(this);
            }
        }
    }

    public final c3.h0 z(s0 s0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + s0Var.f43410a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f43420c;
        mVar.getClass();
        z0 z0Var = new z0(this.f43426n, mVar, this.f43424f);
        z0Var.f43467f = this;
        int i11 = length + 1;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.L, i11);
        s0VarArr[length] = s0Var;
        String str = e2.d0.f7871a;
        this.L = s0VarArr;
        z0[] z0VarArr = (z0[]) Arrays.copyOf(this.K, i11);
        z0VarArr[length] = z0Var;
        this.K = z0VarArr;
        return z0Var;
    }

    @Override
    public final void u(long j3) {
    }
}

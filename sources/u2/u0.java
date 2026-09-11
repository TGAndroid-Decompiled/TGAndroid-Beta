package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class u0 implements d0, c3.q, y2.h, y2.k, z0 {
    public static final Map f46809g0;
    public static final b2.s f46810h0;
    public final e2.g E;
    public final p0 F;
    public final p0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public a1[] K;
    public t0[] L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public com.google.firebase.messaging.s Q;
    public c3.b0 R;
    public long S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Uri f46811a;
    public long f46812a0;
    public final g2.h f46813b;
    public long f46814b0;
    public final n2.m f46815c;
    public boolean f46816c0;
    public final rb.a d;
    public int f46817d0;
    public final a5.a f46818e;
    public boolean f46819e0;
    public final n2.j f46820f;
    public boolean f46821f0;
    public final w0 h;
    public final y2.d f46822n;
    public final String f46823r;
    public final long f46824s;
    public final b2.s v;
    public final long f46825w;
    public final y2.m f46826x;
    public final m2.t f46827y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f46809g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f2298a = "icy";
        rVar.f2312q = b2.r0.n("application/x-icy");
        f46810h0 = new b2.s(rVar);
    }

    public u0(Uri uri, g2.h hVar, m2.t tVar, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, w0 w0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar3) {
        y2.m mVar2;
        this.f46811a = uri;
        this.f46813b = hVar;
        this.f46815c = mVar;
        this.f46820f = jVar;
        this.d = aVar;
        this.f46818e = aVar2;
        this.h = w0Var;
        this.f46822n = dVar;
        this.f46823r = str;
        this.f46824s = i10;
        this.v = sVar;
        if (aVar3 != null) {
            mVar2 = new y2.m(aVar3);
        } else {
            mVar2 = new y2.m("ProgressiveMediaPeriod");
        }
        this.f46826x = mVar2;
        this.f46827y = tVar;
        this.f46825w = j3;
        this.E = new e2.g();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new t0[0];
        this.K = new a1[0];
        this.f46814b0 = -9223372036854775807L;
        this.U = 1;
    }

    public final c3.h0 A(t0 t0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (t0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + t0Var.f46806a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f46815c;
        mVar.getClass();
        a1 a1Var = new a1(this.f46822n, mVar, this.f46820f);
        a1Var.f46622f = this;
        int i11 = length + 1;
        t0[] t0VarArr = (t0[]) Arrays.copyOf(this.L, i11);
        t0VarArr[length] = t0Var;
        String str = e2.d0.f8737a;
        this.L = t0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.K, i11);
        a1VarArr[length] = a1Var;
        this.K = a1VarArr;
        return a1Var;
    }

    public final void B(c3.b0 b0Var) {
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
            x();
        }
    }

    public final void C() {
        r0 r0Var = new r0(this, this.f46811a, this.f46813b, this.f46827y, this, this.E);
        if (this.N) {
            e2.d.g(v());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f46814b0 > j3) {
                this.f46819e0 = true;
                this.f46814b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f46814b0).f4198a.f4230b;
            long j11 = this.f46814b0;
            r0Var.f46792f.f4294a = j10;
            r0Var.f46794r = j11;
            r0Var.f46793n = true;
            r0Var.f46796w = false;
            for (a1 a1Var : this.K) {
                a1Var.f46635t = this.f46814b0;
            }
            this.f46814b0 = -9223372036854775807L;
        }
        this.f46817d0 = f();
        this.f46826x.f(r0Var, this, this.d.L3(this.U));
    }

    public final boolean D() {
        if (!this.W && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void P1(c3.b0 b0Var) {
        this.H.post(new org.telegram.ui.web.g1(24, this, b0Var));
    }

    @Override
    public final c3.h0 R1(int i10, int i11) {
        return A(new t0(i10, false));
    }

    @Override
    public final void Z0() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override
    public final void a() {
        a1[] a1VarArr;
        for (a1 a1Var : this.K) {
            a1Var.D(true);
            n2.g gVar = a1Var.h;
            if (gVar != null) {
                gVar.a(a1Var.f46621e);
                a1Var.h = null;
                a1Var.f46623g = null;
            }
        }
        m2.t tVar = this.f46827y;
        c3.o oVar = (c3.o) tVar.f15818c;
        if (oVar != null) {
            oVar.release();
            tVar.f15818c = null;
        }
        tVar.d = null;
    }

    @Override
    public final void b() {
        this.H.post(this.F);
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f46826x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f8754b;
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

    public final int f() {
        a1[] a1VarArr;
        int i10 = 0;
        for (a1 a1Var : this.K) {
            i10 += a1Var.f46632q + a1Var.f46631p;
        }
        return i10;
    }

    @Override
    public final k4.d g(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.u0.g(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        r0 r0Var = (r0) jVar;
        g2.b0 b0Var = r0Var.f46789b;
        if (i10 == 0) {
            tVar = new t(r0Var.f46795s);
        } else {
            Uri uri = b0Var.f10298c;
            tVar = new t(j10);
        }
        this.f46818e.r(tVar, 1, -1, null, 0, null, r0Var.f46794r, this.S, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        long j11;
        r0 r0Var = (r0) jVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long m10 = m(true);
            if (m10 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = m10 + 10000;
            }
            this.S = j11;
            this.h.v(j11, this.R, this.T);
        }
        Uri uri = r0Var.f46789b.f10298c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f46818e.o(tVar, 1, -1, null, 0, null, r0Var.f46794r, this.S);
        this.f46819e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final void j() {
        int L3 = this.d.L3(this.U);
        y2.m mVar = this.f46826x;
        IOException iOException = mVar.f49520c;
        if (iOException == null) {
            y2.i iVar = mVar.f49519b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f49508a;
                }
                IOException iOException2 = iVar.f49511e;
                if (iOException2 != null && iVar.f49512f > L3) {
                    throw iOException2;
                }
            }
            if (this.f46819e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long k(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.u0.k(long):long");
    }

    @Override
    public final void l(long j3) {
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

    public final long m(boolean z10) {
        long j3 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.K.length; i10++) {
            if (!z10) {
                com.google.firebase.messaging.s sVar = this.Q;
                sVar.getClass();
                if (!((boolean[]) sVar.d)[i10]) {
                }
            }
            j3 = Math.max(j3, this.K[i10].q());
        }
        return j3;
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.I = c0Var;
        b2.s sVar = this.v;
        if (sVar != null) {
            R1(0, 3).b(sVar);
            B(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            Z0();
            this.f46814b0 = j3;
            return;
        }
        this.E.e();
        C();
    }

    @Override
    public final long o() {
        if (this.X) {
            this.X = false;
            return this.f46812a0;
        } else if (this.W) {
            if (this.f46819e0 || f() > this.f46817d0) {
                this.W = false;
                return this.f46812a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        if (!this.f46819e0) {
            y2.m mVar = this.f46826x;
            if (!mVar.c() && !this.f46816c0) {
                if ((!this.N && this.v == null) || this.Y != 0) {
                    boolean e7 = this.E.e();
                    if (!mVar.d()) {
                        C();
                        return true;
                    }
                    return e7;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.r rVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        o1 o1Var = (o1) sVar.f6391b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((s0) b1Var).f46802a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                b1VarArr[i12] = null;
            }
        }
        if (!this.V ? !(j3 == 0 || this.P) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (b1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
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
                int b10 = o1Var.b(rVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = rVar.m().f2375x | this.X;
                b1VarArr[i14] = new s0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    a1 a1Var = this.K[b10];
                    if (a1Var.t() != 0 && !a1Var.G(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Y == 0) {
            this.f46816c0 = false;
            this.W = false;
            this.X = false;
            y2.m mVar = this.f46826x;
            if (mVar.d()) {
                a1[] a1VarArr = this.K;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].k();
                    i11++;
                }
                mVar.a();
            } else {
                this.f46819e0 = false;
                for (a1 a1Var2 : this.K) {
                    a1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = k(j3);
            while (i11 < b1VarArr.length) {
                if (b1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override
    public final o1 r() {
        e();
        return (o1) this.Q.f6391b;
    }

    @Override
    public final long s() {
        long j3;
        boolean z10;
        e();
        if (this.f46819e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f46814b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.Q;
                if (((boolean[]) sVar.f6392c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    a1 a1Var = this.K[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.f46637w;
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
            j3 = m(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f46812a0;
        }
        return j3;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return p1Var.a(j3, j10.f4198a.f4229a, j10.f4199b.f4229a);
    }

    public final boolean v() {
        if (this.f46814b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        r0 r0Var = (r0) jVar;
        Uri uri = r0Var.f46789b.f10298c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f46818e.n(tVar, 1, -1, null, 0, null, r0Var.f46794r, this.S);
        if (!z10) {
            for (a1 a1Var : this.K) {
                a1Var.D(false);
            }
            if (this.Y > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.b(this);
            }
        }
    }

    public final void x() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f46825w;
        if (!this.f46821f0 && !this.N && this.M && this.R != null) {
            for (a1 a1Var : this.K) {
                if (a1Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f8754b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f2370r;
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
                    int i12 = bVar.f43789a;
                    if (i11 || this.L[i10].f46807b) {
                        b2.p0 p0Var = w10.f2364l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f2306k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f2361i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int H0 = this.f46815c.H0(w10);
                b2.r a12 = w10.a();
                a12.R = H0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f2375x | this.X;
            }
            this.Q = new com.google.firebase.messaging.s(new o1(l1VarArr), zArr);
            if (this.P && this.S == -9223372036854775807L) {
                this.S = j3;
                this.R = new q0(this, this.R);
            }
            this.h.v(this.S, this.R, this.T);
            this.N = true;
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.a(this);
        }
    }

    public final void y(int i10) {
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        boolean[] zArr = (boolean[]) sVar.f6393e;
        if (!zArr[i10]) {
            b2.s sVar2 = ((o1) sVar.f6391b).a(i10).d[0];
            this.f46818e.j(b2.r0.h(sVar2.f2370r), sVar2, 0, null, this.f46812a0);
            zArr[i10] = true;
        }
    }

    public final void z(int i10) {
        e();
        if (this.f46816c0) {
            if ((!this.O || ((boolean[]) this.Q.f6392c)[i10]) && !this.K[i10].x(false)) {
                this.f46814b0 = 0L;
                this.f46816c0 = false;
                this.W = true;
                this.f46812a0 = 0L;
                this.f46817d0 = 0;
                for (a1 a1Var : this.K) {
                    a1Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.b(this);
            }
        }
    }

    @Override
    public final void u(long j3) {
    }
}

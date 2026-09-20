package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class v0 implements d0, c3.q, y2.h, y2.k, a1 {
    public static final Map f43794g0;
    public static final b2.s f43795h0;
    public final e2.g E;
    public final q0 F;
    public final q0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public b1[] K;
    public u0[] L;
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
    public final Uri f43796a;
    public long f43797a0;
    public final g2.h f43798b;
    public long f43799b0;
    public final n2.n f43800c;
    public boolean f43801c0;
    public final qb.b d;
    public int f43802d0;
    public final a5.a e;
    public boolean f43803e0;
    public final n2.k f43804f;
    public boolean f43805f0;
    public final x0 h;
    public final y2.d f43806n;
    public final String f43807r;
    public final long f43808s;
    public final b2.s v;
    public final long f43809w;
    public final y2.m f43810x;
    public final lf.h f43811y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f43794g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f3240a = "icy";
        rVar.f3253q = b2.r0.n("application/x-icy");
        f43795h0 = new b2.s(rVar);
    }

    public v0(Uri uri, g2.h hVar, lf.h hVar2, n2.n nVar, n2.k kVar, qb.b bVar, a5.a aVar, x0 x0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar2) {
        y2.m mVar;
        this.f43796a = uri;
        this.f43798b = hVar;
        this.f43800c = nVar;
        this.f43804f = kVar;
        this.d = bVar;
        this.e = aVar;
        this.h = x0Var;
        this.f43806n = dVar;
        this.f43807r = str;
        this.f43808s = i10;
        this.v = sVar;
        if (aVar2 != null) {
            mVar = new y2.m(aVar2);
        } else {
            mVar = new y2.m("ProgressiveMediaPeriod");
        }
        this.f43810x = mVar;
        this.f43811y = hVar2;
        this.f43809w = j3;
        this.E = new e2.g();
        this.F = new q0(this, 1);
        this.G = new q0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new u0[0];
        this.K = new b1[0];
        this.f43799b0 = -9223372036854775807L;
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
        s0 s0Var = new s0(this, this.f43796a, this.f43798b, this.f43811y, this, this.E);
        if (this.N) {
            e2.d.g(v());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f43799b0 > j3) {
                this.f43803e0 = true;
                this.f43799b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f43799b0).f3711a.f3741b;
            long j11 = this.f43799b0;
            s0Var.f43778f.f3798a = j10;
            s0Var.f43780r = j11;
            s0Var.f43779n = true;
            s0Var.f43782w = false;
            for (b1 b1Var : this.K) {
                b1Var.f43632t = this.f43799b0;
            }
            this.f43799b0 = -9223372036854775807L;
        }
        this.f43802d0 = f();
        this.f43810x.f(s0Var, this, this.d.L3(this.U));
    }

    public final boolean C() {
        if (!this.W && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(y2.j jVar, long j3, long j10, boolean z10) {
        s0 s0Var = (s0) jVar;
        Uri uri = s0Var.f43776b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, s0Var.f43780r, this.S);
        if (!z10) {
            for (b1 b1Var : this.K) {
                b1Var.D(false);
            }
            if (this.Y > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.m(this);
            }
        }
    }

    @Override
    public final void X1(c3.b0 b0Var) {
        this.H.post(new j0(1, this, b0Var));
    }

    @Override
    public final c3.h0 Z1(int i10, int i11) {
        return z(new u0(i10, false));
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        b1[] b1VarArr;
        for (b1 b1Var : this.K) {
            b1Var.D(true);
            n2.h hVar = b1Var.h;
            if (hVar != null) {
                hVar.a(b1Var.e);
                b1Var.h = null;
                b1Var.f43620g = null;
            }
        }
        lf.h hVar2 = this.f43811y;
        c3.o oVar = (c3.o) hVar2.f14216c;
        if (oVar != null) {
            oVar.release();
            hVar2.f14216c = null;
        }
        hVar2.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f43810x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f7904b;
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
        b1[] b1VarArr;
        int i10 = 0;
        for (b1 b1Var : this.K) {
            i10 += b1Var.f43629q + b1Var.f43628p;
        }
        return i10;
    }

    @Override
    public final void f1() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override
    public final void g() {
        int L3 = this.d.L3(this.U);
        y2.m mVar = this.f43810x;
        IOException iOException = mVar.f46599c;
        if (iOException == null) {
            y2.i iVar = mVar.f46598b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f46589a;
                }
                IOException iOException2 = iVar.e;
                if (iOException2 != null && iVar.f46592f > L3) {
                    throw iOException2;
                }
            }
            if (this.f43803e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long h(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.v0.h(long):long");
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
            f1();
            this.f43799b0 = j3;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final long l() {
        if (this.X) {
            this.X = false;
            return this.f43797a0;
        } else if (this.W) {
            if (this.f43803e0 || f() > this.f43802d0) {
                this.W = false;
                return this.f43797a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final k4.d m(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.v0.m(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void n(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        s0 s0Var = (s0) jVar;
        g2.b0 b0Var = s0Var.f43776b;
        if (i10 == 0) {
            tVar = new t(s0Var.f43781s);
        } else {
            Uri uri = b0Var.f9352c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, null, 0, null, s0Var.f43780r, this.S, i10);
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10) {
        long j11;
        s0 s0Var = (s0) jVar;
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
        Uri uri = s0Var.f43776b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, null, 0, null, s0Var.f43780r, this.S);
        this.f43803e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        if (!this.f43803e0) {
            y2.m mVar = this.f43810x;
            if (!mVar.c() && !this.f43801c0) {
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
    public final long q(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.s sVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        p1 p1Var = (p1) tVar.f7346b;
        boolean[] zArr3 = (boolean[]) tVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (sVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((t0) c1Var).f43786a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        if (!this.V ? !(j3 == 0 || this.P) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < sVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (sVar = sVarArr[i14]) != null) {
                if (sVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
                if (sVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.g(z12);
                int b10 = p1Var.b(sVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = sVar.m().f3314x | this.X;
                c1VarArr[i14] = new t0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.K[b10];
                    if (b1Var.t() != 0 && !b1Var.G(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Y == 0) {
            this.f43801c0 = false;
            this.W = false;
            this.X = false;
            y2.m mVar = this.f43810x;
            if (mVar.d()) {
                b1[] b1VarArr = this.K;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].k();
                    i11++;
                }
                mVar.b();
            } else {
                this.f43803e0 = false;
                for (b1 b1Var2 : this.K) {
                    b1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override
    public final p1 r() {
        e();
        return (p1) this.Q.f7346b;
    }

    @Override
    public final long s() {
        long j3;
        boolean z10;
        e();
        if (this.f43803e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f43799b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.t tVar = this.Q;
                if (((boolean[]) tVar.f7347c)[i10] && ((boolean[]) tVar.d)[i10]) {
                    b1 b1Var = this.K[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.f43634w;
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
            return this.f43797a0;
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
        return p1Var.a(j3, j10.f3711a.f3740a, j10.f3712b.f3740a);
    }

    public final boolean v() {
        if (this.f43799b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f43809w;
        if (!this.f43805f0 && !this.N && this.M && this.R != null) {
            for (b1 b1Var : this.K) {
                if (b1Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f7904b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f3309r;
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
                    int i12 = bVar.f40831a;
                    if (i11 || this.L[i10].f43790b) {
                        b2.p0 p0Var = w10.f3303l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f3247k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f3300i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int M0 = this.f43800c.M0(w10);
                b2.r a12 = w10.a();
                a12.R = M0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f3314x | this.X;
            }
            this.Q = new com.google.firebase.messaging.t(new p1(l1VarArr), zArr);
            if (this.P && this.S == -9223372036854775807L) {
                this.S = j3;
                this.R = new r0(this, this.R);
            }
            this.h.v(this.S, this.R, this.T);
            this.N = true;
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.b(this);
        }
    }

    public final void x(int i10) {
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        boolean[] zArr = (boolean[]) tVar.e;
        if (!zArr[i10]) {
            b2.s sVar = ((p1) tVar.f7346b).a(i10).d[0];
            this.e.k(b2.r0.h(sVar.f3309r), sVar, 0, null, this.f43797a0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f43801c0) {
            if ((!this.O || ((boolean[]) this.Q.f7347c)[i10]) && !this.K[i10].x(false)) {
                this.f43799b0 = 0L;
                this.f43801c0 = false;
                this.W = true;
                this.f43797a0 = 0L;
                this.f43802d0 = 0;
                for (b1 b1Var : this.K) {
                    b1Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.m(this);
            }
        }
    }

    public final c3.h0 z(u0 u0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (u0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.f43789a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.f43800c;
        nVar.getClass();
        b1 b1Var = new b1(this.f43806n, nVar, this.f43804f);
        b1Var.f43619f = this;
        int i11 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.L, i11);
        u0VarArr[length] = u0Var;
        String str = e2.d0.f7888a;
        this.L = u0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.K, i11);
        b1VarArr[length] = b1Var;
        this.K = b1VarArr;
        return b1Var;
    }

    @Override
    public final void u(long j3) {
    }
}

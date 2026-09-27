package u2;

import android.net.Uri;
import android.os.Handler;
import i2.q1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.web.g2;
public final class t0 implements d0, c3.q, y2.g, y2.j, z0 {
    public static final Map f43815g0;
    public static final b2.s f43816h0;
    public final e2.g E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public a1[] K;
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
    public final Uri f43817a;
    public long f43818a0;
    public final g2.h f43819b;
    public long f43820b0;
    public final n2.m f43821c;
    public boolean f43822c0;
    public final qb.b d;
    public int f43823d0;
    public final a5.a e;
    public boolean f43824e0;
    public final n2.j f43825f;
    public boolean f43826f0;
    public final v0 h;
    public final y2.d f43827n;
    public final String f43828r;
    public final long f43829s;
    public final b2.s v;
    public final long f43830w;
    public final y2.l f43831x;
    public final la.h f43832y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f43815g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f3234a = "icy";
        rVar.f3247q = b2.r0.n("application/x-icy");
        f43816h0 = new b2.s(rVar);
    }

    public t0(Uri uri, g2.h hVar, la.h hVar2, n2.m mVar, n2.j jVar, qb.b bVar, a5.a aVar, v0 v0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar2) {
        y2.l lVar;
        this.f43817a = uri;
        this.f43819b = hVar;
        this.f43821c = mVar;
        this.f43825f = jVar;
        this.d = bVar;
        this.e = aVar;
        this.h = v0Var;
        this.f43827n = dVar;
        this.f43828r = str;
        this.f43829s = i10;
        this.v = sVar;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f43831x = lVar;
        this.f43832y = hVar2;
        this.f43830w = j3;
        this.E = new e2.g();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new s0[0];
        this.K = new a1[0];
        this.f43820b0 = -9223372036854775807L;
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
        q0 q0Var = new q0(this, this.f43817a, this.f43819b, this.f43832y, this, this.E);
        if (this.N) {
            e2.d.g(v());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f43820b0 > j3) {
                this.f43824e0 = true;
                this.f43820b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f43820b0).f3705a.f3735b;
            long j11 = this.f43820b0;
            q0Var.f43800f.f3792a = j10;
            q0Var.f43802r = j11;
            q0Var.f43801n = true;
            q0Var.f43804w = false;
            for (a1 a1Var : this.K) {
                a1Var.f43658t = this.f43820b0;
            }
            this.f43820b0 = -9223372036854775807L;
        }
        this.f43823d0 = f();
        this.f43831x.f(q0Var, this, this.d.L3(this.U));
    }

    public final boolean C() {
        if (!this.W && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void G(y2.i iVar, long j3, long j10, boolean z10) {
        q0 q0Var = (q0) iVar;
        Uri uri = q0Var.f43798b.f9339c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, q0Var.f43802r, this.S);
        if (!z10) {
            for (a1 a1Var : this.K) {
                a1Var.D(false);
            }
            if (this.Y > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.h(this);
            }
        }
    }

    @Override
    public final void X1(c3.b0 b0Var) {
        this.H.post(new g2(28, this, b0Var));
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
        a1[] a1VarArr;
        for (a1 a1Var : this.K) {
            a1Var.D(true);
            n2.g gVar = a1Var.h;
            if (gVar != null) {
                gVar.a(a1Var.e);
                a1Var.h = null;
                a1Var.f43646g = null;
            }
        }
        la.h hVar = this.f43832y;
        c3.o oVar = (c3.o) hVar.f14169c;
        if (oVar != null) {
            oVar.release();
            hVar.f14169c = null;
        }
        hVar.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f43831x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f7888b;
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
        a1[] a1VarArr;
        int i10 = 0;
        for (a1 a1Var : this.K) {
            i10 += a1Var.f43655q + a1Var.f43654p;
        }
        return i10;
    }

    @Override
    public final void g() {
        int L3 = this.d.L3(this.U);
        y2.l lVar = this.f43831x;
        IOException iOException = lVar.f46621c;
        if (iOException == null) {
            y2.h hVar = lVar.f46620b;
            if (hVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = hVar.f46611a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f46614f > L3) {
                    throw iOException2;
                }
            }
            if (this.f43824e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    public final long h(boolean z10) {
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
    public final long i(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.t0.i(long):long");
    }

    @Override
    public final void j(long j3) {
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

    @Override
    public final void k(c0 c0Var, long j3) {
        this.I = c0Var;
        b2.s sVar = this.v;
        if (sVar != null) {
            Z1(0, 3).b(sVar);
            A(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            e1();
            this.f43820b0 = j3;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final k4.d l(y2.i r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.t0.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void m(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        q0 q0Var = (q0) iVar;
        g2.b0 b0Var = q0Var.f43798b;
        if (i10 == 0) {
            tVar = new t(q0Var.f43803s);
        } else {
            Uri uri = b0Var.f9339c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, null, 0, null, q0Var.f43802r, this.S, i10);
    }

    @Override
    public final long n() {
        if (this.X) {
            this.X = false;
            return this.f43818a0;
        } else if (this.W) {
            if (this.f43824e0 || f() > this.f43823d0) {
                this.W = false;
                return this.f43818a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        if (!this.f43824e0) {
            y2.l lVar = this.f43831x;
            if (!lVar.c() && !this.f43822c0) {
                if ((!this.N && this.v == null) || this.Y != 0) {
                    boolean e = this.E.e();
                    if (!lVar.d()) {
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
    public final long p(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.r rVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        o1 o1Var = (o1) tVar.f7336b;
        boolean[] zArr3 = (boolean[]) tVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((r0) b1Var).f43806a;
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
                this.X = rVar.m().f3308x | this.X;
                b1VarArr[i14] = new r0(this, b10);
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
            this.f43822c0 = false;
            this.W = false;
            this.X = false;
            y2.l lVar = this.f43831x;
            if (lVar.d()) {
                a1[] a1VarArr = this.K;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].k();
                    i11++;
                }
                lVar.b();
            } else {
                this.f43824e0 = false;
                for (a1 a1Var2 : this.K) {
                    a1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = i(j3);
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
    public final void q(y2.i iVar, long j3, long j10) {
        long j11;
        q0 q0Var = (q0) iVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long h = h(true);
            if (h == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = h + 10000;
            }
            this.S = j11;
            this.h.v(j11, this.R, this.T);
        }
        Uri uri = q0Var.f43798b.f9339c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, null, 0, null, q0Var.f43802r, this.S);
        this.f43824e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final o1 r() {
        e();
        return (o1) this.Q.f7336b;
    }

    @Override
    public final long s() {
        long j3;
        boolean z10;
        e();
        if (this.f43824e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f43820b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.t tVar = this.Q;
                if (((boolean[]) tVar.f7337c)[i10] && ((boolean[]) tVar.d)[i10]) {
                    a1 a1Var = this.K[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.f43660w;
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
            j3 = h(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f43818a0;
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
        return q1Var.a(j3, j10.f3705a.f3734a, j10.f3706b.f3734a);
    }

    public final boolean v() {
        if (this.f43820b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f43830w;
        if (!this.f43826f0 && !this.N && this.M && this.R != null) {
            for (a1 a1Var : this.K) {
                if (a1Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f7888b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f3303r;
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
                    int i12 = bVar.f40802a;
                    if (i11 || this.L[i10].f43812b) {
                        b2.p0 p0Var = w10.f3297l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f3241k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f3294i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int L0 = this.f43821c.L0(w10);
                b2.r a12 = w10.a();
                a12.R = L0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f3308x | this.X;
            }
            this.Q = new com.google.firebase.messaging.t(new o1(l1VarArr), zArr);
            if (this.P && this.S == -9223372036854775807L) {
                this.S = j3;
                this.R = new p0(this, this.R);
            }
            this.h.v(this.S, this.R, this.T);
            this.N = true;
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.e(this);
        }
    }

    public final void x(int i10) {
        e();
        com.google.firebase.messaging.t tVar = this.Q;
        boolean[] zArr = (boolean[]) tVar.e;
        if (!zArr[i10]) {
            b2.s sVar = ((o1) tVar.f7336b).a(i10).d[0];
            this.e.k(b2.r0.h(sVar.f3303r), sVar, 0, null, this.f43818a0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f43822c0) {
            if ((!this.O || ((boolean[]) this.Q.f7337c)[i10]) && !this.K[i10].x(false)) {
                this.f43820b0 = 0L;
                this.f43822c0 = false;
                this.W = true;
                this.f43818a0 = 0L;
                this.f43823d0 = 0;
                for (a1 a1Var : this.K) {
                    a1Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.h(this);
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
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + s0Var.f43811a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f43821c;
        mVar.getClass();
        a1 a1Var = new a1(this.f43827n, mVar, this.f43825f);
        a1Var.f43645f = this;
        int i11 = length + 1;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.L, i11);
        s0VarArr[length] = s0Var;
        String str = e2.d0.f7872a;
        this.L = s0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.K, i11);
        a1VarArr[length] = a1Var;
        this.K = a1VarArr;
        return a1Var;
    }

    @Override
    public final void u(long j3) {
    }
}

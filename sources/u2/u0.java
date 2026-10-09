package u2;

import android.net.Uri;
import android.os.Handler;
import i2.q1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class u0 implements d0, c3.q, y2.g, y2.j, z0 {
    public static final Map f48713g0;
    public static final b2.s f48714h0;
    public final e2.g E;
    public final o0 F;
    public final o0 G;
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
    public final Uri f48715a;
    public long f48716a0;
    public final g2.h f48717b;
    public long f48718b0;
    public final n2.m f48719c;
    public boolean f48720c0;
    public final rb.a d;
    public int f48721d0;
    public final a5.a f48722e;
    public boolean f48723e0;
    public final n2.j f48724f;
    public boolean f48725f0;
    public final w0 h;
    public final y2.d f48726n;
    public final String f48727r;
    public final long f48728s;
    public final b2.s v;
    public final long f48729w;
    public final y2.l f48730x;
    public final la.h f48731y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f48713g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f3571a = "icy";
        rVar.f3585q = b2.r0.n("application/x-icy");
        f48714h0 = new b2.s(rVar);
    }

    public u0(Uri uri, g2.h hVar, la.h hVar2, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, w0 w0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar3) {
        y2.l lVar;
        this.f48715a = uri;
        this.f48717b = hVar;
        this.f48719c = mVar;
        this.f48724f = jVar;
        this.d = aVar;
        this.f48722e = aVar2;
        this.h = w0Var;
        this.f48726n = dVar;
        this.f48727r = str;
        this.f48728s = i10;
        this.v = sVar;
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f48730x = lVar;
        this.f48731y = hVar2;
        this.f48729w = j3;
        this.E = new e2.g();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new t0[0];
        this.K = new a1[0];
        this.f48718b0 = -9223372036854775807L;
        this.U = 1;
    }

    public final boolean A() {
        if (!this.W && !m()) {
            return false;
        }
        return true;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        r0 r0Var = (r0) iVar;
        g2.b0 b0Var = r0Var.f48693b;
        if (i10 == 0) {
            tVar = new t(r0Var.f48699s);
        } else {
            Uri uri = b0Var.f10235c;
            tVar = new t(j10);
        }
        this.f48722e.u(tVar, 1, -1, null, 0, null, r0Var.f48698r, this.S, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        long j11;
        r0 r0Var = (r0) iVar;
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
        Uri uri = r0Var.f48693b.f10235c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48722e.q(tVar, 1, -1, null, 0, null, r0Var.f48698r, this.S);
        this.f48723e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.D(this);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        r0 r0Var = (r0) iVar;
        Uri uri = r0Var.f48693b.f10235c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48722e.p(tVar, 1, -1, null, 0, null, r0Var.f48698r, this.S);
        if (!z10) {
            for (a1 a1Var : this.K) {
                a1Var.D(false);
            }
            if (this.Y > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.D(this);
            }
        }
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
                gVar.a(a1Var.f48526e);
                a1Var.h = null;
                a1Var.f48528g = null;
            }
        }
        la.h hVar = this.f48731y;
        c3.o oVar = (c3.o) hVar.f15463c;
        if (oVar != null) {
            oVar.release();
            hVar.f15463c = null;
        }
        hVar.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f48730x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f8549b;
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
        return q();
    }

    @Override
    public final void d2(c3.b0 b0Var) {
        this.H.post(new p0(0, this, b0Var));
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
            i10 += a1Var.f48537q + a1Var.f48536p;
        }
        return i10;
    }

    @Override
    public final c3.h0 f2(int i10, int i11) {
        return w(new t0(i10, false));
    }

    @Override
    public final void g() {
        int m32 = this.d.m3(this.U);
        y2.l lVar = this.f48730x;
        IOException iOException = lVar.f51698c;
        if (iOException == null) {
            y2.h hVar = lVar.f51697b;
            if (hVar != null) {
                if (m32 == Integer.MIN_VALUE) {
                    m32 = hVar.f51686a;
                }
                IOException iOException2 = hVar.f51689e;
                if (iOException2 != null && hVar.f51690f > m32) {
                    throw iOException2;
                }
            }
            if (this.f48723e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long h(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.u0.h(long):long");
    }

    @Override
    public final void i(long j3) {
        if (!this.P) {
            e();
            if (!m()) {
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
    public final void k(c0 c0Var, long j3) {
        this.I = c0Var;
        b2.s sVar = this.v;
        if (sVar != null) {
            f2(0, 3).b(sVar);
            x(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            k1();
            this.f48718b0 = j3;
            return;
        }
        this.E.e();
        z();
    }

    @Override
    public final void k1() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override
    public final long l() {
        if (this.X) {
            this.X = false;
            return this.f48716a0;
        } else if (this.W) {
            if (this.f48723e0 || f() > this.f48721d0) {
                this.W = false;
                return this.f48716a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    public final boolean m() {
        if (this.f48718b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        if (!this.f48723e0) {
            y2.l lVar = this.f48730x;
            if (!lVar.c() && !this.f48720c0) {
                if ((!this.N && this.v == null) || this.Y != 0) {
                    boolean e7 = this.E.e();
                    if (!lVar.d()) {
                        z();
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
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.r rVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        o1 o1Var = (o1) sVar.f7971b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((s0) b1Var).f48706a;
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
                this.X = rVar.m().f3648x | this.X;
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
            this.f48720c0 = false;
            this.W = false;
            this.X = false;
            y2.l lVar = this.f48730x;
            if (lVar.d()) {
                a1[] a1VarArr = this.K;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].k();
                    i11++;
                }
                lVar.b();
            } else {
                this.f48723e0 = false;
                for (a1 a1Var2 : this.K) {
                    a1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
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
    public final o1 p() {
        e();
        return (o1) this.Q.f7971b;
    }

    @Override
    public final long q() {
        long j3;
        boolean z10;
        e();
        if (this.f48723e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.f48718b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.Q;
                if (((boolean[]) sVar.f7972c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    a1 a1Var = this.K[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.f48542w;
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
            return this.f48716a0;
        }
        return j3;
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return q1Var.a(j3, j10.f4053a.f4084a, j10.f4054b.f4084a);
    }

    public final void t() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f48729w;
        if (!this.f48725f0 && !this.N && this.M && this.R != null) {
            for (a1 a1Var : this.K) {
                if (a1Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f8549b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f3643r;
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
                    int i12 = bVar.f45311a;
                    if (i11 || this.L[i10].f48711b) {
                        b2.p0 p0Var = w10.f3637l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f3579k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f3634i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int Q0 = this.f48719c.Q0(w10);
                b2.r a12 = w10.a();
                a12.R = Q0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f3648x | this.X;
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
            c0Var.m(this);
        }
    }

    public final void u(int i10) {
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        boolean[] zArr = (boolean[]) sVar.f7973e;
        if (!zArr[i10]) {
            b2.s sVar2 = ((o1) sVar.f7971b).a(i10).d[0];
            this.f48722e.l(b2.r0.h(sVar2.f3643r), sVar2, 0, null, this.f48716a0);
            zArr[i10] = true;
        }
    }

    public final void v(int i10) {
        e();
        if (this.f48720c0) {
            if ((!this.O || ((boolean[]) this.Q.f7972c)[i10]) && !this.K[i10].x(false)) {
                this.f48718b0 = 0L;
                this.f48720c0 = false;
                this.W = true;
                this.f48716a0 = 0L;
                this.f48721d0 = 0;
                for (a1 a1Var : this.K) {
                    a1Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.D(this);
            }
        }
    }

    public final c3.h0 w(t0 t0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (t0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + t0Var.f48710a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f48719c;
        mVar.getClass();
        a1 a1Var = new a1(this.f48726n, mVar, this.f48724f);
        a1Var.f48527f = this;
        int i11 = length + 1;
        t0[] t0VarArr = (t0[]) Arrays.copyOf(this.L, i11);
        t0VarArr[length] = t0Var;
        String str = e2.d0.f8532a;
        this.L = t0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.K, i11);
        a1VarArr[length] = a1Var;
        this.K = a1VarArr;
        return a1Var;
    }

    public final void x(c3.b0 b0Var) {
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
            t();
        }
    }

    @Override
    public final k4.d y(y2.i r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.u0.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    public final void z() {
        r0 r0Var = new r0(this, this.f48715a, this.f48717b, this.f48731y, this, this.E);
        if (this.N) {
            e2.d.g(m());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f48718b0 > j3) {
                this.f48723e0 = true;
                this.f48718b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f48718b0).f4053a.f4085b;
            long j11 = this.f48718b0;
            r0Var.f48696f.f4150a = j10;
            r0Var.f48698r = j11;
            r0Var.f48697n = true;
            r0Var.f48700w = false;
            for (a1 a1Var : this.K) {
                a1Var.f48540t = this.f48718b0;
            }
            this.f48718b0 = -9223372036854775807L;
        }
        this.f48721d0 = f();
        this.f48730x.f(r0Var, this, this.d.m3(this.U));
    }

    @Override
    public final void s(long j3) {
    }
}

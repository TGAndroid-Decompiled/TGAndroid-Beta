package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import m.e3;
public final class w0 implements e0, c3.q, y2.i, y2.l, b1 {
    public static final Map f42465g0;
    public static final b2.s f42466h0;
    public final e2.g E;
    public final r0 F;
    public final r0 G;
    public final Handler H;
    public d0 I;
    public p3.b J;
    public c1[] K;
    public v0[] L;
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
    public final Uri f42467a;
    public long f42468a0;
    public final g2.h f42469b;
    public long f42470b0;
    public final n2.n f42471c;
    public boolean f42472c0;
    public final rb.a d;
    public int f42473d0;
    public final a5.a e;
    public boolean f42474e0;
    public final n2.j f42475f;
    public boolean f42476f0;
    public final y0 h;
    public final y2.d f42477n;
    public final String f42478r;
    public final long f42479s;
    public final b2.s v;
    public final long f42480w;
    public final y2.n f42481x;
    public final e3 f42482y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f42465g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.f1933a = "icy";
        rVar.f1946q = b2.r0.n("application/x-icy");
        f42466h0 = new b2.s(rVar);
    }

    public w0(Uri uri, g2.h hVar, e3 e3Var, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, y0 y0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar3) {
        y2.n nVar2;
        this.f42467a = uri;
        this.f42469b = hVar;
        this.f42471c = nVar;
        this.f42475f = jVar;
        this.d = aVar;
        this.e = aVar2;
        this.h = y0Var;
        this.f42477n = dVar;
        this.f42478r = str;
        this.f42479s = i10;
        this.v = sVar;
        if (aVar3 != null) {
            nVar2 = new y2.n(aVar3);
        } else {
            nVar2 = new y2.n("ProgressiveMediaPeriod");
        }
        this.f42481x = nVar2;
        this.f42482y = e3Var;
        this.f42480w = j3;
        this.E = new e2.g();
        this.F = new r0(this, 1);
        this.G = new r0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new v0[0];
        this.K = new c1[0];
        this.f42470b0 = -9223372036854775807L;
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

    @Override
    public final void B() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        t0 t0Var = (t0) kVar;
        Uri uri = t0Var.f42447b.f8480c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.m(uVar, 1, -1, null, 0, null, t0Var.f42451r, this.S);
        if (!z10) {
            for (c1 c1Var : this.K) {
                c1Var.D(false);
            }
            if (this.Y > 0) {
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.g(this);
            }
        }
    }

    public final void D() {
        t0 t0Var = new t0(this, this.f42467a, this.f42469b, this.f42482y, this, this.E);
        if (this.N) {
            e2.d.g(v());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.f42470b0 > j3) {
                this.f42474e0 = true;
                this.f42470b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.f42470b0).f4125a.f4155b;
            long j11 = this.f42470b0;
            t0Var.f42449f.f4212a = j10;
            t0Var.f42451r = j11;
            t0Var.f42450n = true;
            t0Var.f42453w = false;
            for (c1 c1Var : this.K) {
                c1Var.f42303t = this.f42470b0;
            }
            this.f42470b0 = -9223372036854775807L;
        }
        this.f42473d0 = g();
        this.f42481x.f(t0Var, this, this.d.o3(this.U));
    }

    public final boolean E() {
        if (!this.W && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void G(c3.b0 b0Var) {
        this.H.post(new k0(1, this, b0Var));
    }

    @Override
    public final c3.h0 I(int i10, int i11) {
        return z(new v0(i10, false));
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        for (c1 c1Var : this.K) {
            c1Var.D(true);
            n2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.f42291g = null;
            }
        }
        e3 e3Var = this.f42482y;
        c3.o oVar = (c3.o) e3Var.f13002c;
        if (oVar != null) {
            oVar.release();
            e3Var.f13002c = null;
        }
        e3Var.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f42481x.d()) {
            e2.g gVar = this.E;
            synchronized (gVar) {
                z10 = gVar.f7204b;
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
        return r();
    }

    public final void e() {
        e2.d.g(this.N);
        this.Q.getClass();
        this.R.getClass();
    }

    @Override
    public final void f() {
        int o32 = this.d.o3(this.U);
        y2.n nVar = this.f42481x;
        IOException iOException = nVar.f46447c;
        if (iOException == null) {
            y2.j jVar = nVar.f46446b;
            if (jVar != null) {
                if (o32 == Integer.MIN_VALUE) {
                    o32 = jVar.f46437a;
                }
                IOException iOException2 = jVar.e;
                if (iOException2 != null && jVar.f46440f > o32) {
                    throw iOException2;
                }
            }
            if (this.f42474e0 && !this.N) {
                throw b2.s0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    public final int g() {
        c1[] c1VarArr;
        int i10 = 0;
        for (c1 c1Var : this.K) {
            i10 += c1Var.f42300q + c1Var.f42299p;
        }
        return i10;
    }

    @Override
    public final long h(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w0.h(long):long");
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

    @Override
    public final void j(d0 d0Var, long j3) {
        this.I = d0Var;
        b2.s sVar = this.v;
        if (sVar != null) {
            I(0, 3).b(sVar);
            A(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            B();
            this.f42470b0 = j3;
            return;
        }
        this.E.e();
        D();
    }

    @Override
    public final k4.d k(y2.k r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w0.k(y2.k, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        t0 t0Var = (t0) kVar;
        g2.b0 b0Var = t0Var.f42447b;
        if (i10 == 0) {
            uVar = new u(t0Var.f42452s);
        } else {
            Uri uri = b0Var.f8480c;
            uVar = new u(j10);
        }
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.f42451r, this.S, i10);
    }

    @Override
    public final long m() {
        if (this.X) {
            this.X = false;
            return this.f42468a0;
        } else if (this.W) {
            if (this.f42474e0 || g() > this.f42473d0) {
                this.W = false;
                return this.f42468a0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        if (!this.f42474e0) {
            y2.n nVar = this.f42481x;
            if (!nVar.c() && !this.f42472c0) {
                if ((!this.N && this.v == null) || this.Y != 0) {
                    boolean e = this.E.e();
                    if (!nVar.d()) {
                        D();
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
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        x2.r rVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        q1 q1Var = (q1) sVar.f6118b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).f42457a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        if (!this.V ? !(j3 == 0 || this.P) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
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
                int b10 = q1Var.b(rVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = rVar.m().f2007x | this.X;
                d1VarArr[i14] = new u0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    c1 c1Var = this.K[b10];
                    if (c1Var.t() != 0 && !c1Var.G(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Y == 0) {
            this.f42472c0 = false;
            this.W = false;
            this.X = false;
            y2.n nVar = this.f42481x;
            if (nVar.d()) {
                c1[] c1VarArr = this.K;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].k();
                    i11++;
                }
                nVar.b();
            } else {
                this.f42474e0 = false;
                for (c1 c1Var2 : this.K) {
                    c1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
            while (i11 < d1VarArr.length) {
                if (d1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        long j11;
        t0 t0Var = (t0) kVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long t10 = t(true);
            if (t10 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = t10 + 10000;
            }
            this.S = j11;
            this.h.v(j11, this.R, this.T);
        }
        Uri uri = t0Var.f42447b.f8480c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.o(uVar, 1, -1, null, 0, null, t0Var.f42451r, this.S);
        this.f42474e0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override
    public final q1 q() {
        e();
        return (q1) this.Q.f6118b;
    }

    @Override
    public final long r() {
        long j3;
        boolean z10;
        e();
        if (this.f42474e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f42470b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.Q;
                if (((boolean[]) sVar.f6119c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    c1 c1Var = this.K[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.f42305w;
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
            j3 = t(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f42468a0;
        }
        return j3;
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return o1Var.a(j3, j10.f4125a.f4154a, j10.f4126b.f4154a);
    }

    public final long t(boolean z10) {
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

    public final boolean v() {
        if (this.f42470b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.p0 a2;
        long j3 = this.f42480w;
        if (!this.f42476f0 && !this.N && this.M && this.R != null) {
            for (c1 c1Var : this.K) {
                if (c1Var.w() == null) {
                    return;
                }
            }
            e2.g gVar = this.E;
            synchronized (gVar) {
                gVar.f7204b = false;
            }
            int length = this.K.length;
            b2.l1[] l1VarArr = new b2.l1[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                b2.s w10 = this.K[i10].w();
                w10.getClass();
                String str = w10.f2002r;
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
                    int i12 = bVar.f39662a;
                    if (i11 || this.L[i10].f42461b) {
                        b2.p0 p0Var = w10.f1996l;
                        if (p0Var == null) {
                            a2 = new b2.p0(bVar);
                        } else {
                            a2 = p0Var.a(bVar);
                        }
                        b2.r a10 = w10.a();
                        a10.f1940k = a2;
                        w10 = new b2.s(a10);
                    }
                    if (i11 && w10.h == -1 && w10.f1993i == -1 && i12 != -1) {
                        b2.r a11 = w10.a();
                        a11.h = i12;
                        w10 = new b2.s(a11);
                    }
                }
                int L0 = this.f42471c.L0(w10);
                b2.r a12 = w10.a();
                a12.R = L0;
                b2.s sVar = new b2.s(a12);
                l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
                this.X = sVar.f2007x | this.X;
            }
            this.Q = new com.google.firebase.messaging.s(new q1(l1VarArr), zArr);
            if (this.P && this.S == -9223372036854775807L) {
                this.S = j3;
                this.R = new s0(this, this.R);
            }
            this.h.v(this.S, this.R, this.T);
            this.N = true;
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.b(this);
        }
    }

    public final void x(int i10) {
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        boolean[] zArr = (boolean[]) sVar.e;
        if (!zArr[i10]) {
            b2.s sVar2 = ((q1) sVar.f6118b).a(i10).d[0];
            this.e.i(b2.r0.h(sVar2.f2002r), sVar2, 0, null, this.f42468a0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f42472c0) {
            if ((!this.O || ((boolean[]) this.Q.f6119c)[i10]) && !this.K[i10].x(false)) {
                this.f42470b0 = 0L;
                this.f42472c0 = false;
                this.W = true;
                this.f42468a0 = 0L;
                this.f42473d0 = 0;
                for (c1 c1Var : this.K) {
                    c1Var.D(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.g(this);
            }
        }
    }

    public final c3.h0 z(v0 v0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f42460a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.f42471c;
        nVar.getClass();
        c1 c1Var = new c1(this.f42477n, nVar, this.f42475f);
        c1Var.f42290f = this;
        int i11 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.L, i11);
        v0VarArr[length] = v0Var;
        String str = e2.d0.f7188a;
        this.L = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.K, i11);
        c1VarArr[length] = c1Var;
        this.K = c1VarArr;
        return c1Var;
    }

    @Override
    public final void u(long j3) {
    }
}

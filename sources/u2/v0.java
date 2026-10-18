package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import v7.u6;
public final class v0 implements d0, c3.q, y2.g, y2.j, a1 {
    public static final Map f47493i0;
    public static final b2.w f47494j0;
    public final e2.i E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public r0[] K;
    public b1[] L;
    public u0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public qi.e R;
    public c3.c0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri f47495a;
    public int f47496a0;
    public final g2.h f47497b;
    public boolean f47498b0;
    public final n2.n f47499c;
    public long f47500c0;
    public final oa.d d;
    public long f47501d0;
    public final a5.a e;
    public boolean f47502e0;
    public final n2.k f47503f;
    public int f47504f0;
    public boolean f47505g0;
    public final x0 h;
    public boolean f47506h0;
    public final androidx.biometric.e f47507n;
    public final String f47508r;
    public final long f47509s;
    public final b2.w v;
    public final long f47510w;
    public final y2.l f47511x;
    public final t0.h f47512y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f47493i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.v vVar = new b2.v();
        vVar.f4065a = "icy";
        vVar.f4079r = b2.v0.n("application/x-icy");
        f47494j0 = new b2.w(vVar);
    }

    public v0(Uri uri, g2.h hVar, t0.h hVar2, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, x0 x0Var, androidx.biometric.e eVar, String str, int i10, b2.w wVar, long j10, z2.a aVar2) {
        y2.l lVar;
        this.f47495a = uri;
        this.f47497b = hVar;
        this.f47499c = nVar;
        this.f47503f = kVar;
        this.d = dVar;
        this.e = aVar;
        this.h = x0Var;
        this.f47507n = eVar;
        this.f47508r = str;
        this.f47509s = i10;
        this.v = wVar;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f47511x = lVar;
        this.f47512y = hVar2;
        this.f47510w = j10;
        this.E = new e2.i();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.m0.q(null);
        this.M = new u0[0];
        this.L = new b1[0];
        this.K = new r0[0];
        this.f47501d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final void A(c3.c0 c0Var) {
        c3.c0 tVar;
        boolean z10;
        if (this.J == null) {
            tVar = c0Var;
        } else {
            tVar = new c3.t(-9223372036854775807L);
        }
        this.S = tVar;
        this.T = c0Var.h();
        int i10 = 1;
        if (!this.f47498b0 && c0Var.h() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        if (z10) {
            i10 = 7;
        }
        this.V = i10;
        if (this.O) {
            this.h.v(this.T, c0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        s0 s0Var = new s0(this, this.f47495a, this.f47497b, this.f47512y, this, this.E);
        if (this.O) {
            u6.p(v());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.f47501d0 > j10) {
                this.f47505g0 = true;
                this.f47501d0 = -9223372036854775807L;
                return;
            }
            c3.c0 c0Var = this.S;
            c0Var.getClass();
            long j11 = c0Var.f(this.f47501d0).f4591a.f4609b;
            long j12 = this.f47501d0;
            s0Var.f47473f.f4659a = j11;
            s0Var.f47475r = j12;
            s0Var.f47474n = true;
            s0Var.f47477w = false;
            for (b1 b1Var : this.L) {
                b1Var.f47325t = this.f47501d0;
            }
            this.f47501d0 = -9223372036854775807L;
        }
        this.f47504f0 = f();
        this.f47511x.f(s0Var, this, this.d.y3(this.V));
    }

    public final boolean C() {
        if (!this.Y && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void H() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.f47471b;
        t tVar = new t(s0Var.f47476s, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        this.d.getClass();
        this.e.q(tVar, 1, -1, null, 0, null, s0Var.f47475r, this.T);
        if (!z10) {
            for (b1 b1Var : this.L) {
                b1Var.G(false);
            }
            if (this.f47496a0 > 0) {
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.v(this);
            }
        }
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        b1[] b1VarArr;
        for (b1 b1Var : this.L) {
            b1Var.G(true);
            n2.h hVar = b1Var.h;
            if (hVar != null) {
                hVar.a(b1Var.e);
                b1Var.h = null;
                b1Var.f47313g = null;
            }
        }
        t0.h hVar2 = this.f47512y;
        c3.o oVar = (c3.o) hVar2.f46912c;
        if (oVar != null) {
            oVar.release();
            hVar2.f46912c = null;
        }
        hVar2.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (!this.f47505g0 && this.f47511x.d()) {
            e2.i iVar = this.E;
            synchronized (iVar) {
                z10 = iVar.f8238b;
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
        u6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int f() {
        b1[] b1VarArr;
        int i10 = 0;
        for (b1 b1Var : this.L) {
            i10 += b1Var.f47322q + b1Var.f47321p;
        }
        return i10;
    }

    @Override
    public final void g() {
        int y3 = this.d.y3(this.V);
        y2.l lVar = this.f47511x;
        IOException iOException = lVar.f49974c;
        if (iOException == null) {
            y2.h hVar = lVar.f49973b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f49964a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49967f > y3) {
                    throw iOException2;
                }
            }
            if (this.f47505g0 && !this.O) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final void g0(c3.c0 c0Var) {
        this.H.post(new p2.b(29, this, c0Var));
    }

    public final long h(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.L.length; i10++) {
            if (!z10) {
                qi.e eVar = this.R;
                eVar.getClass();
                if (!((boolean[]) eVar.f44799c)[i10]) {
                }
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override
    public final long i(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.v0.i(long):long");
    }

    @Override
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        int i11;
        k4.d dVar;
        c3.c0 c0Var;
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.f47471b;
        t tVar = new t(s0Var.f47476s, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        String str = e2.m0.f8255a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10784a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f49971f;
        } else {
            int f7 = f();
            if (f7 > this.f47504f0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f47498b0 && ((c0Var = this.S) == null || c0Var.h() == -9223372036854775807L)) {
                if (this.O && !C()) {
                    this.f47502e0 = true;
                    dVar = y2.l.e;
                } else {
                    this.Y = this.O;
                    this.f47500c0 = 0L;
                    this.f47504f0 = 0;
                    for (b1 b1Var : this.L) {
                        b1Var.G(false);
                    }
                    s0Var.f47473f.f4659a = 0L;
                    s0Var.f47475r = 0L;
                    s0Var.f47474n = true;
                    s0Var.f47477w = false;
                }
            } else {
                this.f47504f0 = f7;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.s(tVar, 1, -1, null, 0, null, s0Var.f47475r, this.T, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public final c3.j0 j0(int i10, int i11) {
        return z(new u0(i10, false));
    }

    @Override
    public final void k(long j10) {
        if (!this.Q) {
            e();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.R.f44799c;
                int length = this.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.L[i10].k(j10, zArr[i10]);
                }
            }
        }
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        t tVar;
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.f47471b;
        if (i10 == 0) {
            tVar = new t(s0Var.f47476s, j10);
        } else {
            tVar = new t(s0Var.f47476s, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        }
        this.e.v(tVar, 1, -1, null, 0, null, s0Var.f47475r, this.T, i10);
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.I = c0Var;
        b2.w wVar = this.v;
        if (wVar != null) {
            j0(0, 3).b(wVar);
            A(new c3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            H();
            this.f47501d0 = j10;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        long j12;
        s0 s0Var = (s0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long h = h(true);
            if (h == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = h + 10000;
            }
            this.T = j12;
            this.h.v(j12, this.S, this.U);
        }
        g2.b0 b0Var = s0Var.f47471b;
        t tVar = new t(s0Var.f47476s, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        this.d.getClass();
        this.e.r(tVar, 1, -1, null, 0, null, s0Var.f47475r, this.T);
        this.f47505g0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.v(this);
    }

    @Override
    public final long o() {
        if (this.Z) {
            this.Z = false;
            return this.f47500c0;
        } else if (this.Y) {
            if (this.f47505g0 || f() > this.f47504f0) {
                this.Y = false;
                return this.f47500c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        if (!this.f47505g0) {
            y2.l lVar = this.f47511x;
            if (!lVar.c() && !this.f47502e0) {
                if ((!this.O && this.v == null) || this.f47496a0 != 0) {
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
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        x2.p pVar;
        boolean z11;
        boolean z12;
        e();
        qi.e eVar = this.R;
        q1 q1Var = (q1) eVar.f44797a;
        boolean[] zArr3 = (boolean[]) eVar.f44799c;
        int i10 = this.f47496a0;
        int i11 = 0;
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (pVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((t0) c1Var).f47485a;
                u6.p(zArr3[i13]);
                this.f47496a0--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        if (!this.X ? !(j10 == 0 || this.Q) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (pVar = pVarArr[i14]) != null) {
                if (pVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.p(z11);
                if (pVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.p(z12);
                int b10 = q1Var.b(pVar.b());
                u6.p(!zArr3[b10]);
                this.f47496a0++;
                zArr3[b10] = true;
                this.Z = pVar.m().f4137y | this.Z;
                c1VarArr[i14] = new t0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.L[b10];
                    if (b1Var.v() != 0 && !b1Var.J(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f47496a0 == 0) {
            this.f47502e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.f47511x;
            if (lVar.d()) {
                b1[] b1VarArr = this.L;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].l();
                    i11++;
                }
                lVar.b();
            } else {
                this.f47505g0 = false;
                for (b1 b1Var2 : this.L) {
                    b1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j10;
    }

    @Override
    public final q1 r() {
        e();
        return (q1) this.R.f44797a;
    }

    @Override
    public final long s() {
        long j10;
        boolean z10;
        e();
        if (this.f47505g0 || this.f47496a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f47501d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                qi.e eVar = this.R;
                if (((boolean[]) eVar.f44798b)[i10] && ((boolean[]) eVar.f44799c)[i10]) {
                    b1 b1Var = this.L[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.f47329y;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.L[i10].s());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = h(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f47500c0;
        }
        return j10;
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        e();
        if (!this.S.d()) {
            return 0L;
        }
        c3.b0 f7 = this.S.f(j10);
        return r1Var.a(j10, f7.f4591a.f4608a, f7.f4592b.f4608a);
    }

    @Override
    public final void u(long j10) {
        if (this.f47496a0 > 0 && !v()) {
            int i10 = 0;
            if (this.W != Long.MIN_VALUE) {
                e();
                int i11 = 1;
                while (true) {
                    b1[] b1VarArr = this.L;
                    if (i10 >= b1VarArr.length) {
                        break;
                    }
                    qi.e eVar = this.R;
                    if (((boolean[]) eVar.f44799c)[i10] && (((boolean[]) eVar.f44798b)[i10] || !this.P)) {
                        i11 &= b1VarArr[i10].z();
                    }
                    i10++;
                }
                i10 = i11;
            }
            if (i10 != 0) {
                this.f47505g0 = true;
            }
        }
    }

    public final boolean v() {
        if (this.f47501d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.t0 a2;
        char c10;
        long j10 = this.f47510w;
        if (!this.f47506h0 && !this.O && this.N && this.S != null) {
            boolean z12 = false;
            for (b1 b1Var : this.L) {
                if (b1Var.y() == null) {
                    return;
                }
            }
            e2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f8238b = false;
            }
            int length = this.L.length;
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                char c11 = 1;
                if (i11 >= length) {
                    break;
                }
                b2.w y3 = this.L[i11].y();
                y3.getClass();
                int h = b2.v0.h(y3.f4132s);
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                c10 = 0;
                            } else {
                                c10 = 2;
                            }
                        } else {
                            c10 = 1;
                        }
                    } else {
                        c10 = 4;
                    }
                } else {
                    c10 = 3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                c11 = 0;
                            } else {
                                c11 = 2;
                            }
                        }
                    } else {
                        c11 = 4;
                    }
                } else {
                    c11 = 3;
                }
                if (c10 > c11) {
                    i12 = i11;
                    i10 = h;
                }
                i11++;
            }
            b2.p1[] p1VarArr = new b2.p1[length];
            boolean[] zArr = new boolean[length];
            int i13 = 0;
            while (i13 < length) {
                b2.w y10 = this.L[i13].y();
                y10.getClass();
                String str = y10.f4132s;
                boolean i14 = b2.v0.i(str);
                if (!i14 && !b2.v0.m(str)) {
                    z10 = z12;
                } else {
                    z10 = true;
                }
                zArr[i13] = z10;
                boolean z13 = z12;
                this.P |= z10;
                boolean k10 = b2.v0.k(str);
                if (j10 != -9223372036854775807L && length == 1 && k10) {
                    z11 = true;
                } else {
                    z11 = z13 ? 1 : 0;
                }
                this.Q = z11;
                p3.b bVar = this.J;
                if (bVar != null) {
                    int i15 = bVar.f44120a;
                    if (i14 || this.M[i13].f47489b) {
                        b2.t0 t0Var = y10.f4125l;
                        if (t0Var == null) {
                            b2.s0[] s0VarArr = new b2.s0[1];
                            s0VarArr[z13 ? 1 : 0] = bVar;
                            a2 = new b2.t0(s0VarArr);
                        } else {
                            b2.s0[] s0VarArr2 = new b2.s0[1];
                            s0VarArr2[z13 ? 1 : 0] = bVar;
                            a2 = t0Var.a(s0VarArr2);
                        }
                        b2.v a10 = y10.a();
                        a10.f4072k = a2;
                        y10 = new b2.w(a10);
                    }
                    if (i14 && y10.h == -1 && y10.f4122i == -1 && i15 != -1) {
                        b2.v a11 = y10.a();
                        a11.h = i15;
                        y10 = new b2.w(a11);
                    }
                }
                int I0 = this.f47499c.I0(y10);
                b2.v a12 = y10.a();
                a12.S = I0;
                b2.w wVar = new b2.w(a12);
                if (i13 != i12) {
                    b2.v a13 = wVar.a();
                    a13.f4073l = Integer.toString(i12);
                    wVar = new b2.w(a13);
                }
                String num = Integer.toString(i13);
                b2.w[] wVarArr = new b2.w[1];
                wVarArr[z13 ? 1 : 0] = wVar;
                p1VarArr[i13] = new b2.p1(num, wVarArr);
                this.Z = wVar.f4137y | this.Z;
                this.L[i13].K(this.W);
                i13++;
                z12 = z13 ? 1 : 0;
            }
            q1 q1Var = new q1(p1VarArr);
            ?? obj = new Object();
            obj.f44797a = q1Var;
            obj.f44798b = zArr;
            int i16 = q1Var.f47460a;
            obj.f44799c = new boolean[i16];
            obj.d = new boolean[i16];
            this.R = obj;
            if (this.Q && this.T == -9223372036854775807L) {
                this.T = j10;
                this.S = new p0(this, this.S);
            }
            this.h.v(this.T, this.S, this.U);
            this.O = true;
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.h(this);
        }
    }

    public final void x(int i10) {
        e();
        qi.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.d;
        if (!zArr[i10]) {
            b2.w wVar = ((q1) eVar.f44797a).a(i10).d[0];
            this.e.m(b2.v0.h(wVar.f4132s), wVar, 0, null, this.f47500c0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f47502e0) {
            if ((!this.P || ((boolean[]) this.R.f44798b)[i10]) && !this.L[i10].A(false)) {
                this.f47501d0 = 0L;
                this.f47502e0 = false;
                this.Y = true;
                this.f47500c0 = 0L;
                this.f47504f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.v(this);
            }
        }
    }

    public final c3.j0 z(u0 u0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (u0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.f47488a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.f47499c;
        nVar.getClass();
        b1 b1Var = new b1(this.f47507n, nVar, this.f47503f);
        r0 r0Var = new r0(b1Var);
        b1Var.f47312f = this;
        int i11 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.M, i11);
        u0VarArr[length] = u0Var;
        this.M = u0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.L, i11);
        b1VarArr[length] = b1Var;
        this.L = b1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.K, i11);
        r0VarArr[length] = r0Var;
        this.K = r0VarArr;
        return r0Var;
    }
}

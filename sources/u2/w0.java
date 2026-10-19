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
public final class w0 implements e0, c3.q, y2.g, y2.j, b1 {
    public static final Map f47450i0;
    public static final b2.w f47451j0;
    public final e2.i E;
    public final p0 F;
    public final p0 G;
    public final Handler H;
    public d0 I;
    public p3.b J;
    public s0[] K;
    public c1[] L;
    public v0[] M;
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
    public final Uri f47452a;
    public int f47453a0;
    public final g2.h f47454b;
    public boolean f47455b0;
    public final n2.n f47456c;
    public long f47457c0;
    public final oa.d d;
    public long f47458d0;
    public final a5.a e;
    public boolean f47459e0;
    public final n2.k f47460f;
    public int f47461f0;
    public boolean f47462g0;
    public final y0 h;
    public boolean f47463h0;
    public final androidx.biometric.e f47464n;
    public final String f47465r;
    public final long f47466s;
    public final b2.w v;
    public final long f47467w;
    public final y2.l f47468x;
    public final c f47469y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f47450i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.v vVar = new b2.v();
        vVar.f4063a = "icy";
        vVar.f4077r = b2.v0.n("application/x-icy");
        f47451j0 = new b2.w(vVar);
    }

    public w0(Uri uri, g2.h hVar, c cVar, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, y0 y0Var, androidx.biometric.e eVar, String str, int i10, b2.w wVar, long j10, z2.a aVar2) {
        y2.l lVar;
        this.f47452a = uri;
        this.f47454b = hVar;
        this.f47456c = nVar;
        this.f47460f = kVar;
        this.d = dVar;
        this.e = aVar;
        this.h = y0Var;
        this.f47464n = eVar;
        this.f47465r = str;
        this.f47466s = i10;
        this.v = wVar;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f47468x = lVar;
        this.f47469y = cVar;
        this.f47467w = j10;
        this.E = new e2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = e2.m0.q(null);
        this.M = new v0[0];
        this.L = new c1[0];
        this.K = new s0[0];
        this.f47458d0 = -9223372036854775807L;
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
        if (!this.f47455b0 && c0Var.h() == -9223372036854775807L) {
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
        t0 t0Var = new t0(this, this.f47452a, this.f47454b, this.f47469y, this, this.E);
        if (this.O) {
            u6.p(v());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.f47458d0 > j10) {
                this.f47462g0 = true;
                this.f47458d0 = -9223372036854775807L;
                return;
            }
            c3.c0 c0Var = this.S;
            c0Var.getClass();
            long j11 = c0Var.f(this.f47458d0).f4589a.f4607b;
            long j12 = this.f47458d0;
            t0Var.f47430f.f4657a = j11;
            t0Var.f47432r = j12;
            t0Var.f47431n = true;
            t0Var.f47434w = false;
            for (c1 c1Var : this.L) {
                c1Var.f47282t = this.f47458d0;
            }
            this.f47458d0 = -9223372036854775807L;
        }
        this.f47461f0 = g();
        this.f47468x.f(t0Var, this, this.d.y3(this.V));
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
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.f47428b;
        u uVar = new u(t0Var.f47433s, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.f47432r, this.T);
        if (!z10) {
            for (c1 c1Var : this.L) {
                c1Var.G(false);
            }
            if (this.f47453a0 > 0) {
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.h(this);
            }
        }
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        for (c1 c1Var : this.L) {
            c1Var.G(true);
            n2.h hVar = c1Var.h;
            if (hVar != null) {
                hVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.f47270g = null;
            }
        }
        c cVar = this.f47469y;
        c3.o oVar = (c3.o) cVar.f47260c;
        if (oVar != null) {
            oVar.release();
            cVar.f47260c = null;
        }
        cVar.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (!this.f47462g0 && this.f47468x.d()) {
            e2.i iVar = this.E;
            synchronized (iVar) {
                z10 = iVar.f8237b;
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

    @Override
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        int i11;
        k4.d dVar;
        c3.c0 c0Var;
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.f47428b;
        u uVar = new u(t0Var.f47433s, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        String str = e2.m0.f8254a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10783a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f49923f;
        } else {
            int g10 = g();
            if (g10 > this.f47461f0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f47455b0 && ((c0Var = this.S) == null || c0Var.h() == -9223372036854775807L)) {
                if (this.O && !C()) {
                    this.f47459e0 = true;
                    dVar = y2.l.e;
                } else {
                    this.Y = this.O;
                    this.f47457c0 = 0L;
                    this.f47461f0 = 0;
                    for (c1 c1Var : this.L) {
                        c1Var.G(false);
                    }
                    t0Var.f47430f.f4657a = 0L;
                    t0Var.f47432r = 0L;
                    t0Var.f47431n = true;
                    t0Var.f47434w = false;
                }
            } else {
                this.f47461f0 = g10;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.s(uVar, 1, -1, null, 0, null, t0Var.f47432r, this.T, iOException, !dVar.a());
        return dVar;
    }

    public final void f() {
        u6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int g() {
        c1[] c1VarArr;
        int i10 = 0;
        for (c1 c1Var : this.L) {
            i10 += c1Var.f47279q + c1Var.f47278p;
        }
        return i10;
    }

    @Override
    public final void g0(c3.c0 c0Var) {
        this.H.post(new p2.b(29, this, c0Var));
    }

    @Override
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.f47428b;
        if (i10 == 0) {
            uVar = new u(t0Var.f47433s, j10);
        } else {
            uVar = new u(t0Var.f47433s, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        }
        this.e.v(uVar, 1, -1, null, 0, null, t0Var.f47432r, this.T, i10);
    }

    @Override
    public final void i() {
        int y3 = this.d.y3(this.V);
        y2.l lVar = this.f47468x;
        IOException iOException = lVar.f49926c;
        if (iOException == null) {
            y2.h hVar = lVar.f49925b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f49916a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49919f > y3) {
                    throw iOException2;
                }
            }
            if (this.f47462g0 && !this.O) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long j(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w0.j(long):long");
    }

    @Override
    public final c3.j0 j0(int i10, int i11) {
        return z(new v0(i10, false));
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        long j12;
        t0 t0Var = (t0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long m10 = m(true);
            if (m10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = m10 + 10000;
            }
            this.T = j12;
            this.h.v(j12, this.S, this.U);
        }
        g2.b0 b0Var = t0Var.f47428b;
        u uVar = new u(t0Var.f47433s, b0Var.f10766c, b0Var.d, j10, j11, b0Var.f10765b);
        this.d.getClass();
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.f47432r, this.T);
        this.f47462g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final void l(long j10) {
        if (!this.Q) {
            f();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.R.f44752c;
                int length = this.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.L[i10].k(j10, zArr[i10]);
                }
            }
        }
    }

    public final long m(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.L.length; i10++) {
            if (!z10) {
                qi.e eVar = this.R;
                eVar.getClass();
                if (!((boolean[]) eVar.f44752c)[i10]) {
                }
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.I = d0Var;
        b2.w wVar = this.v;
        if (wVar != null) {
            j0(0, 3).b(wVar);
            A(new c3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            H();
            this.f47458d0 = j10;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final long o() {
        if (this.Z) {
            this.Z = false;
            return this.f47457c0;
        } else if (this.Y) {
            if (this.f47462g0 || g() > this.f47461f0) {
                this.Y = false;
                return this.f47457c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean p(i2.v0 v0Var) {
        if (!this.f47462g0) {
            y2.l lVar = this.f47468x;
            if (!lVar.c() && !this.f47459e0) {
                if ((!this.O && this.v == null) || this.f47453a0 != 0) {
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
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        x2.p pVar;
        boolean z11;
        boolean z12;
        f();
        qi.e eVar = this.R;
        r1 r1Var = (r1) eVar.f44750a;
        boolean[] zArr3 = (boolean[]) eVar.f44752c;
        int i10 = this.f47453a0;
        int i11 = 0;
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (pVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).f47442a;
                u6.p(zArr3[i13]);
                this.f47453a0--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        if (!this.X ? !(j10 == 0 || this.Q) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (pVar = pVarArr[i14]) != null) {
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
                int b10 = r1Var.b(pVar.b());
                u6.p(!zArr3[b10]);
                this.f47453a0++;
                zArr3[b10] = true;
                this.Z = pVar.m().f4135y | this.Z;
                d1VarArr[i14] = new u0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    c1 c1Var = this.L[b10];
                    if (c1Var.v() != 0 && !c1Var.J(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f47453a0 == 0) {
            this.f47459e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.f47468x;
            if (lVar.d()) {
                c1[] c1VarArr = this.L;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].l();
                    i11++;
                }
                lVar.b();
            } else {
                this.f47462g0 = false;
                for (c1 c1Var2 : this.L) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i11 < d1VarArr.length) {
                if (d1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j10;
    }

    @Override
    public final r1 r() {
        f();
        return (r1) this.R.f44750a;
    }

    @Override
    public final long s() {
        long j10;
        boolean z10;
        f();
        if (this.f47462g0 || this.f47453a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f47458d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                qi.e eVar = this.R;
                if (((boolean[]) eVar.f44751b)[i10] && ((boolean[]) eVar.f44752c)[i10]) {
                    c1 c1Var = this.L[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.f47286y;
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
            j10 = m(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f47457c0;
        }
        return j10;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        f();
        if (!this.S.d()) {
            return 0L;
        }
        c3.b0 f7 = this.S.f(j10);
        return s1Var.a(j10, f7.f4589a.f4606a, f7.f4590b.f4606a);
    }

    @Override
    public final void u(long j10) {
        if (this.f47453a0 > 0 && !v()) {
            int i10 = 0;
            if (this.W != Long.MIN_VALUE) {
                f();
                int i11 = 1;
                while (true) {
                    c1[] c1VarArr = this.L;
                    if (i10 >= c1VarArr.length) {
                        break;
                    }
                    qi.e eVar = this.R;
                    if (((boolean[]) eVar.f44752c)[i10] && (((boolean[]) eVar.f44751b)[i10] || !this.P)) {
                        i11 &= c1VarArr[i10].z();
                    }
                    i10++;
                }
                i10 = i11;
            }
            if (i10 != 0) {
                this.f47462g0 = true;
            }
        }
    }

    public final boolean v() {
        if (this.f47458d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.t0 a2;
        char c10;
        long j10 = this.f47467w;
        if (!this.f47463h0 && !this.O && this.N && this.S != null) {
            boolean z12 = false;
            for (c1 c1Var : this.L) {
                if (c1Var.y() == null) {
                    return;
                }
            }
            e2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f8237b = false;
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
                int h = b2.v0.h(y3.f4130s);
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
                String str = y10.f4130s;
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
                    int i15 = bVar.f44072a;
                    if (i14 || this.M[i13].f47446b) {
                        b2.t0 t0Var = y10.f4123l;
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
                        a10.f4070k = a2;
                        y10 = new b2.w(a10);
                    }
                    if (i14 && y10.h == -1 && y10.f4120i == -1 && i15 != -1) {
                        b2.v a11 = y10.a();
                        a11.h = i15;
                        y10 = new b2.w(a11);
                    }
                }
                int I0 = this.f47456c.I0(y10);
                b2.v a12 = y10.a();
                a12.S = I0;
                b2.w wVar = new b2.w(a12);
                if (i13 != i12) {
                    b2.v a13 = wVar.a();
                    a13.f4071l = Integer.toString(i12);
                    wVar = new b2.w(a13);
                }
                String num = Integer.toString(i13);
                b2.w[] wVarArr = new b2.w[1];
                wVarArr[z13 ? 1 : 0] = wVar;
                p1VarArr[i13] = new b2.p1(num, wVarArr);
                this.Z = wVar.f4135y | this.Z;
                this.L[i13].K(this.W);
                i13++;
                z12 = z13 ? 1 : 0;
            }
            r1 r1Var = new r1(p1VarArr);
            ?? obj = new Object();
            obj.f44750a = r1Var;
            obj.f44751b = zArr;
            int i16 = r1Var.f47417a;
            obj.f44752c = new boolean[i16];
            obj.d = new boolean[i16];
            this.R = obj;
            if (this.Q && this.T == -9223372036854775807L) {
                this.T = j10;
                this.S = new q0(this, this.S);
            }
            this.h.v(this.T, this.S, this.U);
            this.O = true;
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.a(this);
        }
    }

    public final void x(int i10) {
        f();
        qi.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.d;
        if (!zArr[i10]) {
            b2.w wVar = ((r1) eVar.f44750a).a(i10).d[0];
            this.e.m(b2.v0.h(wVar.f4130s), wVar, 0, null, this.f47457c0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        f();
        if (this.f47459e0) {
            if ((!this.P || ((boolean[]) this.R.f44751b)[i10]) && !this.L[i10].A(false)) {
                this.f47458d0 = 0L;
                this.f47459e0 = false;
                this.Y = true;
                this.f47457c0 = 0L;
                this.f47461f0 = 0;
                for (c1 c1Var : this.L) {
                    c1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.h(this);
            }
        }
    }

    public final c3.j0 z(v0 v0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f47445a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.f47456c;
        nVar.getClass();
        c1 c1Var = new c1(this.f47464n, nVar, this.f47460f);
        s0 s0Var = new s0(c1Var);
        c1Var.f47269f = this;
        int i11 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.M, i11);
        v0VarArr[length] = v0Var;
        this.M = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.L, i11);
        c1VarArr[length] = c1Var;
        this.L = c1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.K, i11);
        s0VarArr[length] = s0Var;
        this.K = s0VarArr;
        return s0Var;
    }
}

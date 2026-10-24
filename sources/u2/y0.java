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
public final class y0 implements f0, c3.s, y2.g, y2.j, d1 {
    public static final Map f47923i0;
    public static final b2.w f47924j0;
    public final e2.i E;
    public final r0 F;
    public final r0 G;
    public final Handler H;
    public e0 I;
    public p3.b J;
    public u0[] K;
    public e1[] L;
    public x0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public qi.e R;
    public c3.e0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri f47925a;
    public int f47926a0;
    public final g2.h f47927b;
    public boolean f47928b0;
    public final n2.n f47929c;
    public long f47930c0;
    public final oa.d d;
    public long f47931d0;
    public final a5.a e;
    public boolean f47932e0;
    public final n2.k f47933f;
    public int f47934f0;
    public boolean f47935g0;
    public final a1 h;
    public boolean f47936h0;
    public final androidx.biometric.e f47937n;
    public final String f47938r;
    public final long f47939s;
    public final b2.w v;
    public final long f47940w;
    public final y2.l f47941x;
    public final c f47942y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f47923i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.v vVar = new b2.v();
        vVar.f4068a = "icy";
        vVar.f4082r = b2.v0.n("application/x-icy");
        f47924j0 = new b2.w(vVar);
    }

    public y0(Uri uri, g2.h hVar, c cVar, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, a1 a1Var, androidx.biometric.e eVar, String str, int i10, b2.w wVar, long j10, z2.a aVar2) {
        y2.l lVar;
        this.f47925a = uri;
        this.f47927b = hVar;
        this.f47929c = nVar;
        this.f47933f = kVar;
        this.d = dVar;
        this.e = aVar;
        this.h = a1Var;
        this.f47937n = eVar;
        this.f47938r = str;
        this.f47939s = i10;
        this.v = wVar;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f47941x = lVar;
        this.f47942y = cVar;
        this.f47940w = j10;
        this.E = new e2.i();
        this.F = new r0(this, 1);
        this.G = new r0(this, 2);
        this.H = e2.m0.q(null);
        this.M = new x0[0];
        this.L = new e1[0];
        this.K = new u0[0];
        this.f47931d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final c3.l0 A(x0 x0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (x0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + x0Var.f47918a + ") after finishing tracks.");
            return new c3.p();
        }
        n2.n nVar = this.f47929c;
        nVar.getClass();
        e1 e1Var = new e1(this.f47937n, nVar, this.f47933f);
        u0 u0Var = new u0(e1Var);
        e1Var.f47739f = this;
        int i11 = length + 1;
        x0[] x0VarArr = (x0[]) Arrays.copyOf(this.M, i11);
        x0VarArr[length] = x0Var;
        this.M = x0VarArr;
        e1[] e1VarArr = (e1[]) Arrays.copyOf(this.L, i11);
        e1VarArr[length] = e1Var;
        this.L = e1VarArr;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.K, i11);
        u0VarArr[length] = u0Var;
        this.K = u0VarArr;
        return u0Var;
    }

    public final void B(c3.e0 e0Var) {
        c3.e0 vVar;
        boolean z10;
        if (this.J == null) {
            vVar = e0Var;
        } else {
            vVar = new c3.v(-9223372036854775807L);
        }
        this.S = vVar;
        this.T = e0Var.h();
        int i10 = 1;
        if (!this.f47928b0 && e0Var.h() == -9223372036854775807L) {
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
            this.h.v(this.T, e0Var, z10);
        } else {
            w();
        }
    }

    @Override
    public final void C() {
        this.N = true;
        this.H.post(this.F);
    }

    public final void D() {
        v0 v0Var = new v0(this, this.f47925a, this.f47927b, this.f47942y, this, this.E);
        if (this.O) {
            u6.p(v());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.f47931d0 > j10) {
                this.f47935g0 = true;
                this.f47931d0 = -9223372036854775807L;
                return;
            }
            c3.e0 e0Var = this.S;
            e0Var.getClass();
            long j11 = e0Var.f(this.f47931d0).f4609a.f4622b;
            long j12 = this.f47931d0;
            v0Var.f47905f.f4664a = j11;
            v0Var.f47907r = j12;
            v0Var.f47906n = true;
            v0Var.f47909w = false;
            for (e1 e1Var : this.L) {
                e1Var.f47752t = this.f47931d0;
            }
            this.f47931d0 = -9223372036854775807L;
        }
        this.f47934f0 = g();
        this.f47941x.f(v0Var, this, this.d.y3(this.V));
    }

    public final boolean E() {
        if (!this.Y && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        e1[] e1VarArr;
        for (e1 e1Var : this.L) {
            e1Var.G(true);
            n2.h hVar = e1Var.h;
            if (hVar != null) {
                hVar.a(e1Var.e);
                e1Var.h = null;
                e1Var.f47740g = null;
            }
        }
        c cVar = this.f47942y;
        c3.q qVar = (c3.q) cVar.f47712c;
        if (qVar != null) {
            qVar.release();
            cVar.f47712c = null;
        }
        cVar.d = null;
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (!this.f47935g0 && this.f47941x.d()) {
            e2.i iVar = this.E;
            synchronized (iVar) {
                z10 = iVar.f8242b;
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
        c3.e0 e0Var;
        v0 v0Var = (v0) iVar;
        g2.b0 b0Var = v0Var.f47903b;
        v vVar = new v(v0Var.f47908s, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        String str = e2.m0.f8259a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10800a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f50373f;
        } else {
            int g10 = g();
            if (g10 > this.f47934f0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f47928b0 && ((e0Var = this.S) == null || e0Var.h() == -9223372036854775807L)) {
                if (this.O && !E()) {
                    this.f47932e0 = true;
                    dVar = y2.l.e;
                } else {
                    this.Y = this.O;
                    this.f47930c0 = 0L;
                    this.f47934f0 = 0;
                    for (e1 e1Var : this.L) {
                        e1Var.G(false);
                    }
                    v0Var.f47905f.f4664a = 0L;
                    v0Var.f47907r = 0L;
                    v0Var.f47906n = true;
                    v0Var.f47909w = false;
                }
            } else {
                this.f47934f0 = g10;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.s(vVar, 1, -1, null, 0, null, v0Var.f47907r, this.T, iOException, !dVar.a());
        return dVar;
    }

    public final void f() {
        u6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int g() {
        e1[] e1VarArr;
        int i10 = 0;
        for (e1 e1Var : this.L) {
            i10 += e1Var.f47749q + e1Var.f47748p;
        }
        return i10;
    }

    @Override
    public final void g0(c3.e0 e0Var) {
        this.H.post(new k0(1, this, e0Var));
    }

    @Override
    public final void h() {
        int y3 = this.d.y3(this.V);
        y2.l lVar = this.f47941x;
        IOException iOException = lVar.f50376c;
        if (iOException == null) {
            y2.h hVar = lVar.f50375b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f50366a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f50369f > y3) {
                    throw iOException2;
                }
            }
            if (this.f47935g0 && !this.O) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long i(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.y0.i(long):long");
    }

    @Override
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        v vVar;
        v0 v0Var = (v0) iVar;
        g2.b0 b0Var = v0Var.f47903b;
        if (i10 == 0) {
            vVar = new v(v0Var.f47908s, j10);
        } else {
            vVar = new v(v0Var.f47908s, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        this.e.v(vVar, 1, -1, null, 0, null, v0Var.f47907r, this.T, i10);
    }

    @Override
    public final c3.l0 j0(int i10, int i11) {
        return A(new x0(i10, false));
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        long j12;
        v0 v0Var = (v0) iVar;
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
        g2.b0 b0Var = v0Var.f47903b;
        v vVar = new v(v0Var.f47908s, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.d.getClass();
        this.e.r(vVar, 1, -1, null, 0, null, v0Var.f47907r, this.T);
        this.f47935g0 = true;
        e0 e0Var = this.I;
        e0Var.getClass();
        e0Var.b(this);
    }

    @Override
    public final void l(long j10) {
        if (!this.Q) {
            f();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.R.f45177c;
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
                if (!((boolean[]) eVar.f45177c)[i10]) {
                }
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        this.I = e0Var;
        b2.w wVar = this.v;
        if (wVar != null) {
            j0(0, 3).b(wVar);
            B(new c3.b0(-9223372036854775807L, new long[]{0}, new long[]{0}));
            C();
            this.f47931d0 = j10;
            return;
        }
        this.E.e();
        D();
    }

    @Override
    public final long o() {
        if (this.Z) {
            this.Z = false;
            return this.f47930c0;
        } else if (this.Y) {
            if (this.f47935g0 || g() > this.f47934f0) {
                this.Y = false;
                return this.f47930c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final boolean p(i2.u0 u0Var) {
        if (!this.f47935g0) {
            y2.l lVar = this.f47941x;
            if (!lVar.c() && !this.f47932e0) {
                if ((!this.O && this.v == null) || this.f47926a0 != 0) {
                    boolean e = this.E.e();
                    if (!lVar.d()) {
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
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        x2.p pVar;
        boolean z11;
        boolean z12;
        f();
        qi.e eVar = this.R;
        t1 t1Var = (t1) eVar.f45175a;
        boolean[] zArr3 = (boolean[]) eVar.f45177c;
        int i10 = this.f47926a0;
        int i11 = 0;
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            f1 f1Var = f1VarArr[i12];
            if (f1Var != null && (pVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((w0) f1Var).f47913a;
                u6.p(zArr3[i13]);
                this.f47926a0--;
                zArr3[i13] = false;
                f1VarArr[i12] = null;
            }
        }
        if (!this.X ? !(j10 == 0 || this.Q) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (f1VarArr[i14] == null && (pVar = pVarArr[i14]) != null) {
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
                int b10 = t1Var.b(pVar.b());
                u6.p(!zArr3[b10]);
                this.f47926a0++;
                zArr3[b10] = true;
                this.Z = pVar.m().f4140y | this.Z;
                f1VarArr[i14] = new w0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    e1 e1Var = this.L[b10];
                    if (e1Var.v() != 0 && !e1Var.J(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f47926a0 == 0) {
            this.f47932e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.f47941x;
            if (lVar.d()) {
                e1[] e1VarArr = this.L;
                int length = e1VarArr.length;
                while (i11 < length) {
                    e1VarArr[i11].l();
                    i11++;
                }
                lVar.b();
            } else {
                this.f47935g0 = false;
                for (e1 e1Var2 : this.L) {
                    e1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < f1VarArr.length) {
                if (f1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j10;
    }

    @Override
    public final t1 r() {
        f();
        return (t1) this.R.f45175a;
    }

    @Override
    public final long s() {
        long j10;
        boolean z10;
        f();
        if (this.f47935g0 || this.f47926a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f47931d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                qi.e eVar = this.R;
                if (((boolean[]) eVar.f45176b)[i10] && ((boolean[]) eVar.f45177c)[i10]) {
                    e1 e1Var = this.L[i10];
                    synchronized (e1Var) {
                        z10 = e1Var.f47756y;
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
            return this.f47930c0;
        }
        return j10;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        f();
        if (!this.S.d()) {
            return 0L;
        }
        c3.d0 f7 = this.S.f(j10);
        return s1Var.a(j10, f7.f4609a.f4621a, f7.f4610b.f4621a);
    }

    @Override
    public final void u(long j10) {
        if (this.f47926a0 > 0 && !v()) {
            int i10 = 0;
            if (this.W != Long.MIN_VALUE) {
                f();
                int i11 = 1;
                while (true) {
                    e1[] e1VarArr = this.L;
                    if (i10 >= e1VarArr.length) {
                        break;
                    }
                    qi.e eVar = this.R;
                    if (((boolean[]) eVar.f45177c)[i10] && (((boolean[]) eVar.f45176b)[i10] || !this.P)) {
                        i11 &= e1VarArr[i10].z();
                    }
                    i10++;
                }
                i10 = i11;
            }
            if (i10 != 0) {
                this.f47935g0 = true;
            }
        }
    }

    public final boolean v() {
        if (this.f47931d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.t0 a2;
        char c10;
        long j10 = this.f47940w;
        if (!this.f47936h0 && !this.O && this.N && this.S != null) {
            boolean z12 = false;
            for (e1 e1Var : this.L) {
                if (e1Var.y() == null) {
                    return;
                }
            }
            e2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f8242b = false;
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
                int h = b2.v0.h(y3.f4135s);
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
                String str = y10.f4135s;
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
                    int i15 = bVar.f44500a;
                    if (i14 || this.M[i13].f47919b) {
                        b2.t0 t0Var = y10.f4128l;
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
                        a10.f4075k = a2;
                        y10 = new b2.w(a10);
                    }
                    if (i14 && y10.h == -1 && y10.f4125i == -1 && i15 != -1) {
                        b2.v a11 = y10.a();
                        a11.h = i15;
                        y10 = new b2.w(a11);
                    }
                }
                int I0 = this.f47929c.I0(y10);
                b2.v a12 = y10.a();
                a12.S = I0;
                b2.w wVar = new b2.w(a12);
                if (i13 != i12) {
                    b2.v a13 = wVar.a();
                    a13.f4076l = Integer.toString(i12);
                    wVar = new b2.w(a13);
                }
                String num = Integer.toString(i13);
                b2.w[] wVarArr = new b2.w[1];
                wVarArr[z13 ? 1 : 0] = wVar;
                p1VarArr[i13] = new b2.p1(num, wVarArr);
                this.Z = wVar.f4140y | this.Z;
                this.L[i13].K(this.W);
                i13++;
                z12 = z13 ? 1 : 0;
            }
            t1 t1Var = new t1(p1VarArr);
            ?? obj = new Object();
            obj.f45175a = t1Var;
            obj.f45176b = zArr;
            int i16 = t1Var.f47887a;
            obj.f45177c = new boolean[i16];
            obj.d = new boolean[i16];
            this.R = obj;
            if (this.Q && this.T == -9223372036854775807L) {
                this.T = j10;
                this.S = new s0(this, this.S);
            }
            this.h.v(this.T, this.S, this.U);
            this.O = true;
            e0 e0Var = this.I;
            e0Var.getClass();
            e0Var.a(this);
        }
    }

    public final void x(int i10) {
        f();
        qi.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.d;
        if (!zArr[i10]) {
            b2.w wVar = ((t1) eVar.f45175a).a(i10).d[0];
            this.e.m(b2.v0.h(wVar.f4135s), wVar, 0, null, this.f47930c0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        f();
        if (this.f47932e0) {
            if ((!this.P || ((boolean[]) this.R.f45176b)[i10]) && !this.L[i10].A(false)) {
                this.f47931d0 = 0L;
                this.f47932e0 = false;
                this.Y = true;
                this.f47930c0 = 0L;
                this.f47934f0 = 0;
                for (e1 e1Var : this.L) {
                    e1Var.G(false);
                }
                e0 e0Var = this.I;
                e0Var.getClass();
                e0Var.b(this);
            }
        }
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        v0 v0Var = (v0) iVar;
        g2.b0 b0Var = v0Var.f47903b;
        v vVar = new v(v0Var.f47908s, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.d.getClass();
        this.e.q(vVar, 1, -1, null, 0, null, v0Var.f47907r, this.T);
        if (!z10) {
            for (e1 e1Var : this.L) {
                e1Var.G(false);
            }
            if (this.f47926a0 > 0) {
                e0 e0Var = this.I;
                e0Var.getClass();
                e0Var.b(this);
            }
        }
    }
}

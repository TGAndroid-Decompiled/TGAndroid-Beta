package x2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l2.t1;
import org.telegram.ui.hy0;
public final class w0 implements e0, f3.q, b3.j, b3.m, a1 {
    public static final Map f58370i0;
    public static final e2.u f58371j0;
    public final hy0 D;
    public final h2.i E;
    public final p0 F;
    public final p0 G;
    public final Handler H;
    public d0 I;
    public s3.b J;
    public s0[] K;
    public b1[] L;
    public v0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public ui.e R;
    public f3.c0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri f58372a;
    public int f58373a0;
    public final j2.h f58374b;
    public boolean f58375b0;
    public final q2.m f58376c;
    public long f58377c0;
    public final pb.b d;
    public long f58378d0;
    public final wa f58379e;
    public boolean f58380e0;
    public final q2.j f58381f;
    public int f58382f0;
    public boolean f58383g0;
    public final y0 h;
    public boolean f58384h0;
    public final h6.m f58385n;
    public final String f58386r;
    public final long f58387s;
    public final e2.u f58388w;
    public final long f58389x;
    public final b3.o f58390y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f58370i0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.f10548a = "icy";
        tVar.f10563r = e2.s0.n("application/x-icy");
        f58371j0 = new e2.u(tVar);
    }

    public w0(Uri uri, j2.h hVar, hy0 hy0Var, q2.m mVar, q2.j jVar, pb.b bVar, wa waVar, y0 y0Var, h6.m mVar2, String str, int i7, e2.u uVar, long j3, c3.a aVar) {
        b3.o oVar;
        this.f58372a = uri;
        this.f58374b = hVar;
        this.f58376c = mVar;
        this.f58381f = jVar;
        this.d = bVar;
        this.f58379e = waVar;
        this.h = y0Var;
        this.f58385n = mVar2;
        this.f58386r = str;
        this.f58387s = i7;
        this.f58388w = uVar;
        if (aVar != null) {
            oVar = new b3.o(aVar);
        } else {
            oVar = new b3.o("ProgressiveMediaPeriod");
        }
        this.f58390y = oVar;
        this.D = hy0Var;
        this.f58389x = j3;
        this.E = new h2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = h2.m0.q(null);
        this.M = new v0[0];
        this.L = new b1[0];
        this.K = new s0[0];
        this.f58378d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final boolean A() {
        if (!this.Y && !t()) {
            return false;
        }
        return true;
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        u uVar;
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var = t0Var.f58346b;
        if (i7 == 0) {
            uVar = new u(t0Var.f58352s, j3);
        } else {
            uVar = new u(t0Var.f58352s, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        }
        this.f58379e.t(uVar, 1, -1, null, 0, null, t0Var.f58351r, this.T, i7);
    }

    @Override
    public final f3.j0 O1(int i7, int i10) {
        return x(new v0(i7, false));
    }

    @Override
    public final void U0() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        boolean z9;
        a3.u uVar;
        boolean z10;
        boolean z11;
        l();
        ui.e eVar = this.R;
        q1 q1Var = (q1) eVar.f56814b;
        boolean[] zArr3 = (boolean[]) eVar.d;
        int i7 = this.f58373a0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            c1 c1Var = c1VarArr[i11];
            if (c1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) c1Var).f58362a;
                ia.p(zArr3[i12]);
                this.f58373a0--;
                zArr3[i12] = false;
                c1VarArr[i11] = null;
            }
        }
        if (!this.X ? !(j3 == 0 || this.Q) : i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (c1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                if (uVar.length() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ia.p(z10);
                if (uVar.i(0) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ia.p(z11);
                int b10 = q1Var.b(uVar.c());
                ia.p(!zArr3[b10]);
                this.f58373a0++;
                zArr3[b10] = true;
                this.Z = uVar.n().f10620y | this.Z;
                c1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z9) {
                    b1 b1Var = this.L[b10];
                    if (b1Var.v() != 0 && !b1Var.J(j3, true)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
            }
        }
        if (this.f58373a0 == 0) {
            this.f58380e0 = false;
            this.Y = false;
            this.Z = false;
            b3.o oVar = this.f58390y;
            if (oVar.d()) {
                b1[] b1VarArr = this.L;
                int length = b1VarArr.length;
                while (i10 < length) {
                    b1VarArr[i10].l();
                    i10++;
                }
                oVar.b();
            } else {
                this.f58383g0 = false;
                for (b1 b1Var2 : this.L) {
                    b1Var2.G(false);
                }
            }
        } else if (z9) {
            j3 = j(j3);
            while (i10 < c1VarArr.length) {
                if (c1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.X = true;
        return j3;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        if (!this.f58383g0) {
            b3.o oVar = this.f58390y;
            if (!oVar.c() && !this.f58380e0) {
                if ((!this.O && this.f58388w == null) || this.f58373a0 != 0) {
                    boolean e10 = this.E.e();
                    if (!oVar.d()) {
                        z();
                        return true;
                    }
                    return e10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        b1[] b1VarArr;
        for (b1 b1Var : this.L) {
            b1Var.G(true);
            q2.g gVar = b1Var.h;
            if (gVar != null) {
                gVar.c(b1Var.f58163e);
                b1Var.h = null;
                b1Var.f58165g = null;
            }
        }
        hy0 hy0Var = this.D;
        f3.o oVar = (f3.o) hy0Var.f46520c;
        if (oVar != null) {
            oVar.release();
            hy0Var.f46520c = null;
        }
        hy0Var.d = null;
    }

    @Override
    public final long e() {
        return p();
    }

    @Override
    public final void f(f3.c0 c0Var) {
        this.H.post(new wi.q(3, this, c0Var));
    }

    @Override
    public final boolean g() {
        boolean z9;
        if (!this.f58383g0 && this.f58390y.d()) {
            h2.i iVar = this.E;
            synchronized (iVar) {
                z9 = iVar.f14094b;
            }
            if (z9) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        l();
        if (!this.S.d()) {
            return 0L;
        }
        f3.b0 f10 = this.S.f(j3);
        return t1Var.a(j3, f10.f10992a.f11011a, f10.f10993b.f11011a);
    }

    @Override
    public final void i() {
        int X0 = this.d.X0(this.V);
        b3.o oVar = this.f58390y;
        IOException iOException = oVar.f2964c;
        if (iOException == null) {
            b3.k kVar = oVar.f2963b;
            if (kVar != null) {
                if (X0 == Integer.MIN_VALUE) {
                    X0 = kVar.f2952a;
                }
                IOException iOException2 = kVar.f2955e;
                if (iOException2 != null && kVar.f2956f > X0) {
                    throw iOException2;
                }
            }
            if (this.f58383g0 && !this.O) {
                throw e2.t0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long j(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: x2.w0.j(long):long");
    }

    @Override
    public final void k(long j3) {
        if (!this.Q) {
            l();
            if (!t()) {
                boolean[] zArr = (boolean[]) this.R.d;
                int length = this.L.length;
                for (int i7 = 0; i7 < length; i7++) {
                    this.L[i7].k(j3, zArr[i7]);
                }
            }
        }
    }

    public final void l() {
        ia.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int m() {
        b1[] b1VarArr;
        int i7 = 0;
        for (b1 b1Var : this.L) {
            i7 += b1Var.f58174q + b1Var.f58173p;
        }
        return i7;
    }

    @Override
    public final long n() {
        if (this.Z) {
            this.Z = false;
            return this.f58377c0;
        } else if (this.Y) {
            if (this.f58383g0 || m() > this.f58382f0) {
                this.Y = false;
                return this.f58377c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final q1 o() {
        l();
        return (q1) this.R.f56814b;
    }

    @Override
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        int i10;
        b3.i iVar;
        f3.c0 c0Var;
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var2 = t0Var.f58346b;
        u uVar = new u(t0Var.f58352s, c0Var2.f16414c, c0Var2.d, j3, j10, c0Var2.f16413b);
        String str = h2.m0.f14112a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16434a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f2961f;
        } else {
            int m10 = m();
            if (m10 > this.f58382f0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f58375b0 && ((c0Var = this.S) == null || c0Var.h() == -9223372036854775807L)) {
                if (this.O && !A()) {
                    this.f58380e0 = true;
                    iVar = b3.o.f2960e;
                } else {
                    this.Y = this.O;
                    this.f58377c0 = 0L;
                    this.f58382f0 = 0;
                    for (b1 b1Var : this.L) {
                        b1Var.G(false);
                    }
                    t0Var.f58349f.f11070a = 0L;
                    t0Var.f58351r = 0L;
                    t0Var.f58350n = true;
                    t0Var.f58354x = false;
                }
            } else {
                this.f58382f0 = m10;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.f58379e.q(uVar, 1, -1, null, 0, null, t0Var.f58351r, this.T, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        long j11;
        t0 t0Var = (t0) lVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long s5 = s(true);
            if (s5 == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = s5 + 10000;
            }
            this.T = j11;
            this.h.v(j11, this.S, this.U);
        }
        j2.c0 c0Var = t0Var.f58346b;
        u uVar = new u(t0Var.f58352s, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        this.d.getClass();
        this.f58379e.p(uVar, 1, -1, null, 0, null, t0Var.f58351r, this.T);
        this.f58383g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override
    public final long p() {
        long j3;
        boolean z9;
        l();
        if (this.f58383g0 || this.f58373a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f58378d0;
        }
        if (this.P) {
            int length = this.L.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ui.e eVar = this.R;
                if (((boolean[]) eVar.f56815c)[i7] && ((boolean[]) eVar.d)[i7]) {
                    b1 b1Var = this.L[i7];
                    synchronized (b1Var) {
                        z9 = b1Var.f58181y;
                    }
                    if (!z9) {
                        j3 = Math.min(j3, this.L[i7].s());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = s(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f58377c0;
        }
        return j3;
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        this.I = d0Var;
        e2.u uVar = this.f58388w;
        if (uVar != null) {
            O1(0, 3).g(uVar);
            y(new f3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            U0();
            this.f58378d0 = j3;
            return;
        }
        this.E.e();
        z();
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var = t0Var.f58346b;
        u uVar = new u(t0Var.f58352s, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        this.d.getClass();
        this.f58379e.o(uVar, 1, -1, null, 0, null, t0Var.f58351r, this.T);
        if (!z9) {
            for (b1 b1Var : this.L) {
                b1Var.G(false);
            }
            if (this.f58373a0 > 0) {
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.d(this);
            }
        }
    }

    @Override
    public final void r(long j3) {
        if (this.f58373a0 > 0 && !t()) {
            int i7 = 0;
            if (this.W != Long.MIN_VALUE) {
                l();
                int i10 = 1;
                while (true) {
                    b1[] b1VarArr = this.L;
                    if (i7 >= b1VarArr.length) {
                        break;
                    }
                    ui.e eVar = this.R;
                    if (((boolean[]) eVar.d)[i7] && (((boolean[]) eVar.f56815c)[i7] || !this.P)) {
                        i10 &= b1VarArr[i7].z();
                    }
                    i7++;
                }
                i7 = i10;
            }
            if (i7 != 0) {
                this.f58383g0 = true;
            }
        }
    }

    public final long s(boolean z9) {
        long j3 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.L.length; i7++) {
            if (!z9) {
                ui.e eVar = this.R;
                eVar.getClass();
                if (!((boolean[]) eVar.d)[i7]) {
                }
            }
            j3 = Math.max(j3, this.L[i7].s());
        }
        return j3;
    }

    public final boolean t() {
        if (this.f58378d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void u() {
        boolean z9;
        boolean z10;
        e2.q0 a10;
        char c10;
        long j3 = this.f58389x;
        if (!this.f58384h0 && !this.O && this.N && this.S != null) {
            boolean z11 = false;
            for (b1 b1Var : this.L) {
                if (b1Var.y() == null) {
                    return;
                }
            }
            h2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f14094b = false;
            }
            int length = this.L.length;
            int i7 = -1;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                char c11 = 1;
                if (i10 >= length) {
                    break;
                }
                e2.u y10 = this.L[i10].y();
                y10.getClass();
                int h = e2.s0.h(y10.f10615s);
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
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
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
                    i11 = i10;
                    i7 = h;
                }
                i10++;
            }
            e2.m1[] m1VarArr = new e2.m1[length];
            boolean[] zArr = new boolean[length];
            int i12 = 0;
            while (i12 < length) {
                e2.u y11 = this.L[i12].y();
                y11.getClass();
                String str = y11.f10615s;
                boolean i13 = e2.s0.i(str);
                if (!i13 && !e2.s0.m(str)) {
                    z9 = z11;
                } else {
                    z9 = true;
                }
                zArr[i12] = z9;
                boolean z12 = z11;
                this.P |= z9;
                boolean k10 = e2.s0.k(str);
                if (j3 != -9223372036854775807L && length == 1 && k10) {
                    z10 = true;
                } else {
                    z10 = z12 ? 1 : 0;
                }
                this.Q = z10;
                s3.b bVar = this.J;
                if (bVar != null) {
                    int i14 = bVar.f54655a;
                    if (i13 || this.M[i12].f58366b) {
                        e2.q0 q0Var = y11.f10608l;
                        if (q0Var == null) {
                            e2.p0[] p0VarArr = new e2.p0[1];
                            p0VarArr[z12 ? 1 : 0] = bVar;
                            a10 = new e2.q0(p0VarArr);
                        } else {
                            e2.p0[] p0VarArr2 = new e2.p0[1];
                            p0VarArr2[z12 ? 1 : 0] = bVar;
                            a10 = q0Var.a(p0VarArr2);
                        }
                        e2.t a11 = y11.a();
                        a11.f10556k = a10;
                        y11 = new e2.u(a11);
                    }
                    if (i13 && y11.h == -1 && y11.f10605i == -1 && i14 != -1) {
                        e2.t a12 = y11.a();
                        a12.h = i14;
                        y11 = new e2.u(a12);
                    }
                }
                int F = this.f58376c.F(y11);
                e2.t a13 = y11.a();
                a13.S = F;
                e2.u uVar = new e2.u(a13);
                if (i12 != i11) {
                    e2.t a14 = uVar.a();
                    a14.f10557l = Integer.toString(i11);
                    uVar = new e2.u(a14);
                }
                String num = Integer.toString(i12);
                e2.u[] uVarArr = new e2.u[1];
                uVarArr[z12 ? 1 : 0] = uVar;
                m1VarArr[i12] = new e2.m1(num, uVarArr);
                this.Z = uVar.f10620y | this.Z;
                this.L[i12].K(this.W);
                i12++;
                z11 = z12 ? 1 : 0;
            }
            this.R = new ui.e(new q1(m1VarArr), zArr);
            if (this.Q && this.T == -9223372036854775807L) {
                this.T = j3;
                this.S = new q0(this, this.S);
            }
            this.h.v(this.T, this.S, this.U);
            this.O = true;
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.a(this);
        }
    }

    public final void v(int i7) {
        l();
        ui.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.f56816e;
        if (!zArr[i7]) {
            e2.u uVar = ((q1) eVar.f56814b).a(i7).d[0];
            this.f58379e.j(e2.s0.h(uVar.f10615s), uVar, 0, null, this.f58377c0);
            zArr[i7] = true;
        }
    }

    public final void w(int i7) {
        l();
        if (this.f58380e0) {
            if ((!this.P || ((boolean[]) this.R.f56815c)[i7]) && !this.L[i7].A(false)) {
                this.f58378d0 = 0L;
                this.f58380e0 = false;
                this.Y = true;
                this.f58377c0 = 0L;
                this.f58382f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.d(this);
            }
        }
    }

    public final f3.j0 x(v0 v0Var) {
        int length = this.L.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (v0Var.equals(this.M[i7])) {
                return this.L[i7];
            }
        }
        if (this.N) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f58365a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.m mVar = this.f58376c;
        mVar.getClass();
        b1 b1Var = new b1(this.f58385n, mVar, this.f58381f);
        s0 s0Var = new s0(b1Var);
        b1Var.f58164f = this;
        int i10 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.M, i10);
        v0VarArr[length] = v0Var;
        this.M = v0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.L, i10);
        b1VarArr[length] = b1Var;
        this.L = b1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.K, i10);
        s0VarArr[length] = s0Var;
        this.K = s0VarArr;
        return s0Var;
    }

    public final void y(f3.c0 c0Var) {
        f3.c0 tVar;
        boolean z9;
        if (this.J == null) {
            tVar = c0Var;
        } else {
            tVar = new f3.t(-9223372036854775807L);
        }
        this.S = tVar;
        this.T = c0Var.h();
        int i7 = 1;
        if (!this.f58375b0 && c0Var.h() == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.U = z9;
        if (z9) {
            i7 = 7;
        }
        this.V = i7;
        if (this.O) {
            this.h.v(this.T, c0Var, z9);
        } else {
            u();
        }
    }

    public final void z() {
        t0 t0Var = new t0(this, this.f58372a, this.f58374b, this.D, this, this.E);
        if (this.O) {
            ia.p(t());
            long j3 = this.W;
            if (j3 == Long.MIN_VALUE) {
                j3 = this.T;
            }
            if (j3 != -9223372036854775807L && this.f58378d0 > j3) {
                this.f58383g0 = true;
                this.f58378d0 = -9223372036854775807L;
                return;
            }
            f3.c0 c0Var = this.S;
            c0Var.getClass();
            long j10 = c0Var.f(this.f58378d0).f10992a.f11012b;
            long j11 = this.f58378d0;
            t0Var.f58349f.f11070a = j10;
            t0Var.f58351r = j11;
            t0Var.f58350n = true;
            t0Var.f58354x = false;
            for (b1 b1Var : this.L) {
                b1Var.f58177t = this.f58378d0;
            }
            this.f58378d0 = -9223372036854775807L;
        }
        this.f58382f0 = m();
        this.f58390y.f(t0Var, this, this.d.X0(this.V));
    }
}

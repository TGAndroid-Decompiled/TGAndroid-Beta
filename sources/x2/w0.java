package x2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Components.i61;
public final class w0 implements e0, f3.q, b3.k, b3.n, b1 {
    public static final Map f60379j0;
    public static final e2.u f60380k0;
    public final i61 E;
    public final h2.i F;
    public final p0 G;
    public final p0 H;
    public final Handler I;
    public d0 J;
    public s3.b K;
    public s0[] L;
    public c1[] M;
    public v0[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ab.c0 S;
    public f3.c0 T;
    public long U;
    public boolean V;
    public int W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri f60381a;
    public boolean f60382a0;
    public final j2.h f60383b;
    public int f60384b0;
    public final q2.m f60385c;
    public boolean f60386c0;
    public final qb.a d;
    public long f60387d0;
    public final xa f60388e;
    public long f60389e0;
    public final q2.j f60390f;
    public boolean f60391f0;
    public int f60392g0;
    public final y0 h;
    public boolean f60393h0;
    public boolean f60394i0;
    public final h6.m f60395n;
    public final String f60396r;
    public final long f60397s;
    public final e2.u f60398w;
    public final long f60399x;
    public final b3.p f60400y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f60379j0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.f10692a = "icy";
        tVar.f10707r = e2.s0.n("application/x-icy");
        f60380k0 = new e2.u(tVar);
    }

    public w0(Uri uri, j2.h hVar, i61 i61Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar, y0 y0Var, h6.m mVar2, String str, int i7, e2.u uVar, long j3, c3.a aVar2) {
        b3.p pVar;
        this.f60381a = uri;
        this.f60383b = hVar;
        this.f60385c = mVar;
        this.f60390f = jVar;
        this.d = aVar;
        this.f60388e = xaVar;
        this.h = y0Var;
        this.f60395n = mVar2;
        this.f60396r = str;
        this.f60397s = i7;
        this.f60398w = uVar;
        if (aVar2 != null) {
            pVar = new b3.p(aVar2);
        } else {
            pVar = new b3.p("ProgressiveMediaPeriod");
        }
        this.f60400y = pVar;
        this.E = i61Var;
        this.f60399x = j3;
        this.F = new h2.i();
        this.G = new p0(this, 1);
        this.H = new p0(this, 2);
        this.I = h2.l0.q(null);
        this.N = new v0[0];
        this.M = new c1[0];
        this.L = new s0[0];
        this.f60389e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(int i7) {
        b();
        if (this.f60391f0) {
            if ((!this.Q || ((boolean[]) this.S.f909c)[i7]) && !this.M[i7].A(false)) {
                this.f60389e0 = 0L;
                this.f60391f0 = false;
                this.Z = true;
                this.f60387d0 = 0L;
                this.f60392g0 = 0;
                for (c1 c1Var : this.M) {
                    c1Var.G(false);
                }
                d0 d0Var = this.J;
                d0Var.getClass();
                d0Var.i2(this);
            }
        }
    }

    public final f3.j0 B(v0 v0Var) {
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (v0Var.equals(this.N[i7])) {
                return this.M[i7];
            }
        }
        if (this.O) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f60374a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.m mVar = this.f60385c;
        mVar.getClass();
        c1 c1Var = new c1(this.f60395n, mVar, this.f60390f);
        s0 s0Var = new s0(c1Var);
        c1Var.f60182f = this;
        int i10 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.N, i10);
        v0VarArr[length] = v0Var;
        this.N = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.M, i10);
        c1VarArr[length] = c1Var;
        this.M = c1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.L, i10);
        s0VarArr[length] = s0Var;
        this.L = s0VarArr;
        return s0Var;
    }

    public final void C(f3.c0 c0Var) {
        f3.c0 tVar;
        boolean z10;
        if (this.K == null) {
            tVar = c0Var;
        } else {
            tVar = new f3.t(-9223372036854775807L);
        }
        this.T = tVar;
        this.U = c0Var.h();
        int i7 = 1;
        if (!this.f60386c0 && c0Var.h() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        if (z10) {
            i7 = 7;
        }
        this.W = i7;
        if (this.P) {
            this.h.v(this.U, c0Var, z10);
        } else {
            y();
        }
    }

    public final void D() {
        t0 t0Var = new t0(this, this.f60381a, this.f60383b, this.E, this, this.F);
        if (this.P) {
            ma.p(w());
            long j3 = this.X;
            if (j3 == Long.MIN_VALUE) {
                j3 = this.U;
            }
            if (j3 != -9223372036854775807L && this.f60389e0 > j3) {
                this.f60393h0 = true;
                this.f60389e0 = -9223372036854775807L;
                return;
            }
            f3.c0 c0Var = this.T;
            c0Var.getClass();
            long j10 = c0Var.f(this.f60389e0).f11117a.f11137b;
            long j11 = this.f60389e0;
            t0Var.f60357f.f11195a = j10;
            t0Var.f60359r = j11;
            t0Var.f60358n = true;
            t0Var.f60362x = false;
            for (c1 c1Var : this.M) {
                c1Var.f60195t = this.f60389e0;
            }
            this.f60389e0 = -9223372036854775807L;
        }
        this.f60392g0 = o();
        this.f60400y.f(t0Var, this, this.d.R4(this.W));
    }

    public final boolean E() {
        if (!this.Z && !w()) {
            return false;
        }
        return true;
    }

    @Override
    public final void Z0() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        ma.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override
    public final long c(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        a3.u uVar;
        boolean z11;
        boolean z12;
        b();
        ab.c0 c0Var = this.S;
        r1 r1Var = (r1) c0Var.f908b;
        boolean[] zArr3 = (boolean[]) c0Var.d;
        int i7 = this.f60384b0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            d1 d1Var = d1VarArr[i11];
            if (d1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) d1Var).f60371a;
                ma.p(zArr3[i12]);
                this.f60384b0--;
                zArr3[i12] = false;
                d1VarArr[i11] = null;
            }
        }
        if (!this.Y ? !(j3 == 0 || this.R) : i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (d1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                if (uVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ma.p(z11);
                if (uVar.i(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ma.p(z12);
                int b10 = r1Var.b(uVar.c());
                ma.p(!zArr3[b10]);
                this.f60384b0++;
                zArr3[b10] = true;
                this.f60382a0 = uVar.n().f10764y | this.f60382a0;
                d1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    c1 c1Var = this.M[b10];
                    if (c1Var.v() != 0 && !c1Var.J(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f60384b0 == 0) {
            this.f60391f0 = false;
            this.Z = false;
            this.f60382a0 = false;
            b3.p pVar = this.f60400y;
            if (pVar.d()) {
                c1[] c1VarArr = this.M;
                int length = c1VarArr.length;
                while (i10 < length) {
                    c1VarArr[i10].l();
                    i10++;
                }
                pVar.b();
            } else {
                this.f60393h0 = false;
                for (c1 c1Var2 : this.M) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j3 = l(j3);
            while (i10 < d1VarArr.length) {
                if (d1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j3;
    }

    @Override
    public final boolean d(l2.t0 t0Var) {
        if (!this.f60393h0) {
            b3.p pVar = this.f60400y;
            if (!pVar.c() && !this.f60391f0) {
                if ((!this.P && this.f60398w == null) || this.f60384b0 != 0) {
                    boolean e10 = this.F.e();
                    if (!pVar.d()) {
                        D();
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
    public final f3.j0 d2(int i7, int i10) {
        return B(new v0(i7, false));
    }

    @Override
    public final void e() {
        c1[] c1VarArr;
        for (c1 c1Var : this.M) {
            c1Var.G(true);
            q2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.c(c1Var.f60181e);
                c1Var.h = null;
                c1Var.f60183g = null;
            }
        }
        i61 i61Var = this.E;
        f3.o oVar = (f3.o) i61Var.f35959c;
        if (oVar != null) {
            oVar.release();
            i61Var.f35959c = null;
        }
        i61Var.d = null;
    }

    @Override
    public final long f() {
        return r();
    }

    @Override
    public final boolean g() {
        boolean z10;
        if (!this.f60393h0 && this.f60400y.d()) {
            h2.i iVar = this.F;
            synchronized (iVar) {
                z10 = iVar.f13761b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(f3.c0 c0Var) {
        this.I.post(new v9.b(15, this, c0Var));
    }

    @Override
    public final long i(long j3, l2.q1 q1Var) {
        b();
        if (!this.T.d()) {
            return 0L;
        }
        f3.b0 f10 = this.T.f(j3);
        return q1Var.a(j3, f10.f11117a.f11136a, f10.f11118b.f11136a);
    }

    @Override
    public final void j() {
        int R4 = this.d.R4(this.W);
        b3.p pVar = this.f60400y;
        IOException iOException = pVar.f2887c;
        if (iOException == null) {
            b3.l lVar = pVar.f2886b;
            if (lVar != null) {
                if (R4 == Integer.MIN_VALUE) {
                    R4 = lVar.f2875a;
                }
                IOException iOException2 = lVar.f2878e;
                if (iOException2 != null && lVar.f2879f > R4) {
                    throw iOException2;
                }
            }
            if (this.f60393h0 && !this.P) {
                throw e2.t0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        int i10;
        b3.i iVar;
        f3.c0 c0Var;
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var = t0Var.f60354b;
        u uVar = new u(t0Var.f60360s, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        String str = h2.l0.f13778a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17264a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.p.f2884f;
        } else {
            int o4 = o();
            if (o4 > this.f60392g0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f60386c0 && ((c0Var = this.T) == null || c0Var.h() == -9223372036854775807L)) {
                if (this.P && !E()) {
                    this.f60391f0 = true;
                    iVar = b3.p.f2883e;
                } else {
                    this.Z = this.P;
                    this.f60387d0 = 0L;
                    this.f60392g0 = 0;
                    for (c1 c1Var : this.M) {
                        c1Var.G(false);
                    }
                    t0Var.f60357f.f11195a = 0L;
                    t0Var.f60359r = 0L;
                    t0Var.f60358n = true;
                    t0Var.f60362x = false;
                }
            } else {
                this.f60392g0 = o4;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.f60388e.p(uVar, 1, -1, null, 0, null, t0Var.f60359r, this.U, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public final long l(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: x2.w0.l(long):long");
    }

    @Override
    public final void m(b3.m mVar, long j3, long j10, boolean z10) {
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var = t0Var.f60354b;
        u uVar = new u(t0Var.f60360s, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.d.getClass();
        this.f60388e.n(uVar, 1, -1, null, 0, null, t0Var.f60359r, this.U);
        if (!z10) {
            for (c1 c1Var : this.M) {
                c1Var.G(false);
            }
            if (this.f60384b0 > 0) {
                d0 d0Var = this.J;
                d0Var.getClass();
                d0Var.i2(this);
            }
        }
    }

    @Override
    public final void n(long j3) {
        if (!this.R) {
            b();
            if (!w()) {
                boolean[] zArr = (boolean[]) this.S.d;
                int length = this.M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    this.M[i7].k(j3, zArr[i7]);
                }
            }
        }
    }

    public final int o() {
        c1[] c1VarArr;
        int i7 = 0;
        for (c1 c1Var : this.M) {
            i7 += c1Var.f60192q + c1Var.f60191p;
        }
        return i7;
    }

    @Override
    public final long p() {
        if (this.f60382a0) {
            this.f60382a0 = false;
            return this.f60387d0;
        } else if (this.Z) {
            if (this.f60393h0 || o() > this.f60392g0) {
                this.Z = false;
                return this.f60387d0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final r1 q() {
        b();
        return (r1) this.S.f908b;
    }

    @Override
    public final long r() {
        long j3;
        boolean z10;
        b();
        if (this.f60393h0 || this.f60384b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.f60389e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.f909c)[i7] && ((boolean[]) c0Var.d)[i7]) {
                    c1 c1Var = this.M[i7];
                    synchronized (c1Var) {
                        z10 = c1Var.f60199y;
                    }
                    if (!z10) {
                        j3 = Math.min(j3, this.M[i7].s());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = v(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f60387d0;
        }
        return j3;
    }

    @Override
    public final void s(d0 d0Var, long j3) {
        this.J = d0Var;
        e2.u uVar = this.f60398w;
        if (uVar != null) {
            d2(0, 3).g(uVar);
            C(new f3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            Z0();
            this.f60389e0 = j3;
            return;
        }
        this.F.e();
        D();
    }

    @Override
    public final void t(b3.m mVar, long j3, long j10, int i7) {
        u uVar;
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var = t0Var.f60354b;
        if (i7 == 0) {
            uVar = new u(t0Var.f60360s, j3);
        } else {
            uVar = new u(t0Var.f60360s, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        }
        this.f60388e.s(uVar, 1, -1, null, 0, null, t0Var.f60359r, this.U, i7);
    }

    @Override
    public final void u(long j3) {
        if (this.f60384b0 > 0 && !w()) {
            int i7 = 0;
            if (this.X != Long.MIN_VALUE) {
                b();
                int i10 = 1;
                while (true) {
                    c1[] c1VarArr = this.M;
                    if (i7 >= c1VarArr.length) {
                        break;
                    }
                    ab.c0 c0Var = this.S;
                    if (((boolean[]) c0Var.d)[i7] && (((boolean[]) c0Var.f909c)[i7] || !this.Q)) {
                        i10 &= c1VarArr[i7].z();
                    }
                    i7++;
                }
                i7 = i10;
            }
            if (i7 != 0) {
                this.f60393h0 = true;
            }
        }
    }

    public final long v(boolean z10) {
        long j3 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.M.length; i7++) {
            if (!z10) {
                ab.c0 c0Var = this.S;
                c0Var.getClass();
                if (!((boolean[]) c0Var.d)[i7]) {
                }
            }
            j3 = Math.max(j3, this.M[i7].s());
        }
        return j3;
    }

    public final boolean w() {
        if (this.f60389e0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void x(b3.m mVar, long j3, long j10) {
        long j11;
        t0 t0Var = (t0) mVar;
        if (this.U == -9223372036854775807L && this.T != null) {
            long v = v(true);
            if (v == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = v + 10000;
            }
            this.U = j11;
            this.h.v(j11, this.T, this.V);
        }
        j2.b0 b0Var = t0Var.f60354b;
        u uVar = new u(t0Var.f60360s, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.d.getClass();
        this.f60388e.o(uVar, 1, -1, null, 0, null, t0Var.f60359r, this.U);
        this.f60393h0 = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.i2(this);
    }

    public final void y() {
        boolean z10;
        boolean z11;
        e2.q0 a10;
        char c10;
        long j3 = this.f60399x;
        if (!this.f60394i0 && !this.P && this.O && this.T != null) {
            boolean z12 = false;
            for (c1 c1Var : this.M) {
                if (c1Var.y() == null) {
                    return;
                }
            }
            h2.i iVar = this.F;
            synchronized (iVar) {
                iVar.f13761b = false;
            }
            int length = this.M.length;
            int i7 = -1;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                char c11 = 1;
                if (i10 >= length) {
                    break;
                }
                e2.u y10 = this.M[i10].y();
                y10.getClass();
                int h = e2.s0.h(y10.f10759s);
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
                e2.u y11 = this.M[i12].y();
                y11.getClass();
                String str = y11.f10759s;
                boolean i13 = e2.s0.i(str);
                if (!i13 && !e2.s0.m(str)) {
                    z10 = z12;
                } else {
                    z10 = true;
                }
                zArr[i12] = z10;
                boolean z13 = z12;
                this.Q |= z10;
                boolean k10 = e2.s0.k(str);
                if (j3 != -9223372036854775807L && length == 1 && k10) {
                    z11 = true;
                } else {
                    z11 = z13 ? 1 : 0;
                }
                this.R = z11;
                s3.b bVar = this.K;
                if (bVar != null) {
                    int i14 = bVar.f57037a;
                    if (i13 || this.N[i12].f60375b) {
                        e2.q0 q0Var = y11.f10752l;
                        if (q0Var == null) {
                            e2.p0[] p0VarArr = new e2.p0[1];
                            p0VarArr[z13 ? 1 : 0] = bVar;
                            a10 = new e2.q0(p0VarArr);
                        } else {
                            e2.p0[] p0VarArr2 = new e2.p0[1];
                            p0VarArr2[z13 ? 1 : 0] = bVar;
                            a10 = q0Var.a(p0VarArr2);
                        }
                        e2.t a11 = y11.a();
                        a11.f10700k = a10;
                        y11 = new e2.u(a11);
                    }
                    if (i13 && y11.h == -1 && y11.f10749i == -1 && i14 != -1) {
                        e2.t a12 = y11.a();
                        a12.h = i14;
                        y11 = new e2.u(a12);
                    }
                }
                int E1 = this.f60385c.E1(y11);
                e2.t a13 = y11.a();
                a13.S = E1;
                e2.u uVar = new e2.u(a13);
                if (i12 != i11) {
                    e2.t a14 = uVar.a();
                    a14.f10701l = Integer.toString(i11);
                    uVar = new e2.u(a14);
                }
                String num = Integer.toString(i12);
                e2.u[] uVarArr = new e2.u[1];
                uVarArr[z13 ? 1 : 0] = uVar;
                m1VarArr[i12] = new e2.m1(num, uVarArr);
                this.f60382a0 = uVar.f10764y | this.f60382a0;
                this.M[i12].K(this.X);
                i12++;
                z12 = z13 ? 1 : 0;
            }
            this.S = new ab.c0(new r1(m1VarArr), zArr);
            if (this.R && this.U == -9223372036854775807L) {
                this.U = j3;
                this.T = new q0(this, this.T);
            }
            this.h.v(this.U, this.T, this.V);
            this.P = true;
            d0 d0Var = this.J;
            d0Var.getClass();
            d0Var.V(this);
        }
    }

    public final void z(int i7) {
        b();
        ab.c0 c0Var = this.S;
        boolean[] zArr = (boolean[]) c0Var.f910e;
        if (!zArr[i7]) {
            e2.u uVar = ((r1) c0Var.f908b).a(i7).d[0];
            this.f60388e.i(e2.s0.h(uVar.f10759s), uVar, 0, null, this.f60387d0);
            zArr[i7] = true;
        }
    }
}

package w2;

import android.net.Uri;
import android.os.Handler;
import b8.kg;
import b8.zb;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class w0 implements e0, e3.q, a3.k, a3.n, b1 {
    public static final Map f57244j0;
    public static final d2.v f57245k0;
    public final p7.d E;
    public final g2.j F;
    public final p0 G;
    public final p0 H;
    public final Handler I;
    public d0 J;
    public r3.b K;
    public s0[] L;
    public c1[] M;
    public v0[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public za.p S;
    public e3.b0 T;
    public long U;
    public boolean V;
    public int W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri f57246a;
    public boolean f57247a0;
    public final i2.h f57248b;
    public int f57249b0;
    public final p2.m f57250c;
    public boolean f57251c0;
    public final kb.a d;
    public long f57252d0;
    public final kg f57253e;
    public long f57254e0;
    public final p2.j f57255f;
    public boolean f57256f0;
    public int f57257g0;
    public final y0 h;
    public boolean f57258h0;
    public boolean f57259i0;
    public final android.support.v4.media.session.a0 f57260n;
    public final String f57261r;
    public final long f57262s;
    public final d2.v f57263w;
    public final long f57264x;
    public final a3.q f57265y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f57244j0 = DesugarCollections.unmodifiableMap(hashMap);
        d2.u uVar = new d2.u();
        uVar.f8416a = "icy";
        uVar.f8431r = d2.u0.n("application/x-icy");
        f57245k0 = new d2.v(uVar);
    }

    public w0(Uri uri, i2.h hVar, p7.d dVar, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, y0 y0Var, android.support.v4.media.session.a0 a0Var, String str, int i3, d2.v vVar, long j10, b3.a aVar2) {
        a3.q qVar;
        this.f57246a = uri;
        this.f57248b = hVar;
        this.f57250c = mVar;
        this.f57255f = jVar;
        this.d = aVar;
        this.f57253e = kgVar;
        this.h = y0Var;
        this.f57260n = a0Var;
        this.f57261r = str;
        this.f57262s = i3;
        this.f57263w = vVar;
        if (aVar2 != null) {
            qVar = new a3.q(aVar2);
        } else {
            qVar = new a3.q("ProgressiveMediaPeriod");
        }
        this.f57265y = qVar;
        this.E = dVar;
        this.f57264x = j10;
        this.F = new g2.j();
        this.G = new p0(this, 1);
        this.H = new p0(this, 2);
        this.I = g2.n0.q(null);
        this.N = new v0[0];
        this.M = new c1[0];
        this.L = new s0[0];
        this.f57254e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(e3.b0 b0Var) {
        e3.b0 tVar;
        boolean z10;
        if (this.K == null) {
            tVar = b0Var;
        } else {
            tVar = new e3.t(-9223372036854775807L);
        }
        this.T = tVar;
        this.U = b0Var.h();
        int i3 = 1;
        if (!this.f57251c0 && b0Var.h() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        if (z10) {
            i3 = 7;
        }
        this.W = i3;
        if (this.P) {
            this.h.v(this.U, b0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        t0 t0Var = new t0(this, this.f57246a, this.f57248b, this.E, this, this.F);
        if (this.P) {
            zb.p(v());
            long j10 = this.X;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.U;
            }
            if (j10 != -9223372036854775807L && this.f57254e0 > j10) {
                this.f57258h0 = true;
                this.f57254e0 = -9223372036854775807L;
                return;
            }
            e3.b0 b0Var = this.T;
            b0Var.getClass();
            long j11 = b0Var.f(this.f57254e0).f9406a.f9438b;
            long j12 = this.f57254e0;
            t0Var.f57222f.f9506a = j11;
            t0Var.f57224r = j12;
            t0Var.f57223n = true;
            t0Var.f57227x = false;
            for (c1 c1Var : this.M) {
                c1Var.f57060t = this.f57254e0;
            }
            this.f57254e0 = -9223372036854775807L;
        }
        this.f57257g0 = o();
        this.f57265y.f(t0Var, this, this.d.F4(this.W));
    }

    public final boolean C() {
        if (!this.Z && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void L() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        u uVar;
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.f57219b;
        if (i3 == 0) {
            uVar = new u(t0Var.f57225s, j10);
        } else {
            uVar = new u(t0Var.f57225s, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.f57253e.u(uVar, 1, -1, null, 0, null, t0Var.f57224r, this.U, i3);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        for (c1 c1Var : this.M) {
            c1Var.G(true);
            p2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.b(c1Var.f57046e);
                c1Var.h = null;
                c1Var.f57048g = null;
            }
        }
        p7.d dVar = this.E;
        e3.o oVar = (e3.o) dVar.d;
        if (oVar != null) {
            oVar.release();
            dVar.d = null;
        }
        dVar.f53346c = null;
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        if (!this.f57258h0) {
            a3.q qVar = this.f57265y;
            if (!qVar.c() && !this.f57256f0) {
                if ((!this.P && this.f57263w == null) || this.f57249b0 != 0) {
                    boolean e10 = this.F.e();
                    if (!qVar.d()) {
                        B();
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
    public final boolean d() {
        boolean z10;
        if (!this.f57258h0 && this.f57265y.d()) {
            g2.j jVar = this.F;
            synchronized (jVar) {
                z10 = jVar.f11855b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long e() {
        return q();
    }

    @Override
    public final void f(e3.b0 b0Var) {
        this.I.post(new u9.a(15, this, b0Var));
    }

    @Override
    public final void g() {
        int F4 = this.d.F4(this.W);
        a3.q qVar = this.f57265y;
        IOException iOException = qVar.f109c;
        if (iOException == null) {
            a3.l lVar = qVar.f108b;
            if (lVar != null) {
                if (F4 == Integer.MIN_VALUE) {
                    F4 = lVar.f95a;
                }
                IOException iOException2 = lVar.f98e;
                if (iOException2 != null && lVar.f99f > F4) {
                    throw iOException2;
                }
            }
            if (this.f57258h0 && !this.P) {
                throw d2.v0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        long j12;
        t0 t0Var = (t0) mVar;
        if (this.U == -9223372036854775807L && this.T != null) {
            long u10 = u(true);
            if (u10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = u10 + 10000;
            }
            this.U = j12;
            this.h.v(j12, this.T, this.V);
        }
        i2.c0 c0Var = t0Var.f57219b;
        u uVar = new u(t0Var.f57225s, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.d.getClass();
        this.f57253e.q(uVar, 1, -1, null, 0, null, t0Var.f57224r, this.U);
        this.f57258h0 = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        this.J = d0Var;
        d2.v vVar = this.f57263w;
        if (vVar != null) {
            i0(0, 3).g(vVar);
            A(new e3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            L();
            this.f57254e0 = j10;
            return;
        }
        this.F.e();
        B();
    }

    @Override
    public final e3.i0 i0(int i3, int i10) {
        return z(new v0(i3, false));
    }

    @Override
    public final long j(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: w2.w0.j(long):long");
    }

    @Override
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        int i10;
        a3.i iVar;
        e3.b0 b0Var;
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.f57219b;
        u uVar = new u(t0Var.f57225s, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        String str = g2.n0.f11873a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof d2.v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).f14552a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = a3.q.f106f;
        } else {
            int o10 = o();
            if (o10 > this.f57257g0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f57251c0 && ((b0Var = this.T) == null || b0Var.h() == -9223372036854775807L)) {
                if (this.P && !C()) {
                    this.f57256f0 = true;
                    iVar = a3.q.f105e;
                } else {
                    this.Z = this.P;
                    this.f57252d0 = 0L;
                    this.f57257g0 = 0;
                    for (c1 c1Var : this.M) {
                        c1Var.G(false);
                    }
                    t0Var.f57222f.f9506a = 0L;
                    t0Var.f57224r = 0L;
                    t0Var.f57223n = true;
                    t0Var.f57227x = false;
                }
            } else {
                this.f57257g0 = o10;
            }
            iVar = new a3.i(i10, min, false);
        }
        this.f57253e.r(uVar, 1, -1, null, 0, null, t0Var.f57224r, this.U, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public final void l(long j10) {
        if (!this.R) {
            m();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.S.f60313c;
                int length = this.M.length;
                for (int i3 = 0; i3 < length; i3++) {
                    this.M[i3].k(j10, zArr[i3]);
                }
            }
        }
    }

    public final void m() {
        zb.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override
    public final long n() {
        if (this.f57247a0) {
            this.f57247a0 = false;
            return this.f57252d0;
        } else if (this.Z) {
            if (this.f57258h0 || o() > this.f57257g0) {
                this.Z = false;
                return this.f57252d0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    public final int o() {
        c1[] c1VarArr;
        int i3 = 0;
        for (c1 c1Var : this.M) {
            i3 += c1Var.f57057q + c1Var.f57056p;
        }
        return i3;
    }

    @Override
    public final r1 p() {
        m();
        return (r1) this.S.f60311a;
    }

    @Override
    public final long q() {
        long j10;
        boolean z10;
        m();
        if (this.f57258h0 || this.f57249b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f57254e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j10 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length; i3++) {
                za.p pVar = this.S;
                if (((boolean[]) pVar.f60312b)[i3] && ((boolean[]) pVar.f60313c)[i3]) {
                    c1 c1Var = this.M[i3];
                    synchronized (c1Var) {
                        z10 = c1Var.f57064y;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.M[i3].s());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = u(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f57252d0;
        }
        return j10;
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.f57219b;
        u uVar = new u(t0Var.f57225s, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.d.getClass();
        this.f57253e.p(uVar, 1, -1, null, 0, null, t0Var.f57224r, this.U);
        if (!z10) {
            for (c1 c1Var : this.M) {
                c1Var.G(false);
            }
            if (this.f57249b0 > 0) {
                d0 d0Var = this.J;
                d0Var.getClass();
                d0Var.k(this);
            }
        }
    }

    @Override
    public final long r(long j10, k2.t1 t1Var) {
        m();
        if (!this.T.d()) {
            return 0L;
        }
        e3.a0 f10 = this.T.f(j10);
        return t1Var.a(j10, f10.f9406a.f9437a, f10.f9407b.f9437a);
    }

    @Override
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        z2.p pVar;
        boolean z11;
        boolean z12;
        m();
        za.p pVar2 = this.S;
        r1 r1Var = (r1) pVar2.f60311a;
        boolean[] zArr3 = (boolean[]) pVar2.f60313c;
        int i3 = this.f57249b0;
        int i10 = 0;
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            d1 d1Var = d1VarArr[i11];
            if (d1Var != null && (pVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) d1Var).f57236a;
                zb.p(zArr3[i12]);
                this.f57249b0--;
                zArr3[i12] = false;
                d1VarArr[i11] = null;
            }
        }
        if (!this.Y ? !(j10 == 0 || this.R) : i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < pVarArr.length; i13++) {
            if (d1VarArr[i13] == null && (pVar = pVarArr[i13]) != null) {
                if (pVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zb.p(z11);
                if (pVar.i(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.p(z12);
                int b10 = r1Var.b(pVar.b());
                zb.p(!zArr3[b10]);
                this.f57249b0++;
                zArr3[b10] = true;
                this.f57247a0 = pVar.n().f8494y | this.f57247a0;
                d1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    c1 c1Var = this.M[b10];
                    if (c1Var.v() != 0 && !c1Var.J(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f57249b0 == 0) {
            this.f57256f0 = false;
            this.Z = false;
            this.f57247a0 = false;
            a3.q qVar = this.f57265y;
            if (qVar.d()) {
                c1[] c1VarArr = this.M;
                int length = c1VarArr.length;
                while (i10 < length) {
                    c1VarArr[i10].l();
                    i10++;
                }
                qVar.b();
            } else {
                this.f57258h0 = false;
                for (c1 c1Var2 : this.M) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i10 < d1VarArr.length) {
                if (d1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j10;
    }

    @Override
    public final void t(long j10) {
        if (this.f57249b0 > 0 && !v()) {
            int i3 = 0;
            if (this.X != Long.MIN_VALUE) {
                m();
                int i10 = 1;
                while (true) {
                    c1[] c1VarArr = this.M;
                    if (i3 >= c1VarArr.length) {
                        break;
                    }
                    za.p pVar = this.S;
                    if (((boolean[]) pVar.f60313c)[i3] && (((boolean[]) pVar.f60312b)[i3] || !this.Q)) {
                        i10 &= c1VarArr[i3].z();
                    }
                    i3++;
                }
                i3 = i10;
            }
            if (i3 != 0) {
                this.f57258h0 = true;
            }
        }
    }

    public final long u(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i3 = 0; i3 < this.M.length; i3++) {
            if (!z10) {
                za.p pVar = this.S;
                pVar.getClass();
                if (!((boolean[]) pVar.f60313c)[i3]) {
                }
            }
            j10 = Math.max(j10, this.M[i3].s());
        }
        return j10;
    }

    public final boolean v() {
        if (this.f57254e0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        d2.s0 a10;
        char c2;
        long j10 = this.f57264x;
        if (!this.f57259i0 && !this.P && this.O && this.T != null) {
            boolean z12 = false;
            for (c1 c1Var : this.M) {
                if (c1Var.y() == null) {
                    return;
                }
            }
            g2.j jVar = this.F;
            synchronized (jVar) {
                jVar.f11855b = false;
            }
            int length = this.M.length;
            int i3 = -1;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                char c10 = 1;
                if (i10 >= length) {
                    break;
                }
                d2.v y9 = this.M[i10].y();
                y9.getClass();
                int h = d2.u0.h(y9.f8489s);
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                c2 = 0;
                            } else {
                                c2 = 2;
                            }
                        } else {
                            c2 = 1;
                        }
                    } else {
                        c2 = 4;
                    }
                } else {
                    c2 = 3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                c10 = 0;
                            } else {
                                c10 = 2;
                            }
                        }
                    } else {
                        c10 = 4;
                    }
                } else {
                    c10 = 3;
                }
                if (c2 > c10) {
                    i11 = i10;
                    i3 = h;
                }
                i10++;
            }
            d2.o1[] o1VarArr = new d2.o1[length];
            boolean[] zArr = new boolean[length];
            int i12 = 0;
            while (i12 < length) {
                d2.v y10 = this.M[i12].y();
                y10.getClass();
                String str = y10.f8489s;
                boolean i13 = d2.u0.i(str);
                if (!i13 && !d2.u0.m(str)) {
                    z10 = z12;
                } else {
                    z10 = true;
                }
                zArr[i12] = z10;
                boolean z13 = z12;
                this.Q |= z10;
                boolean k10 = d2.u0.k(str);
                if (j10 != -9223372036854775807L && length == 1 && k10) {
                    z11 = true;
                } else {
                    z11 = z13 ? 1 : 0;
                }
                this.R = z11;
                r3.b bVar = this.K;
                if (bVar != null) {
                    int i14 = bVar.f54237a;
                    if (i13 || this.N[i12].f57240b) {
                        d2.s0 s0Var = y10.f8482l;
                        if (s0Var == null) {
                            d2.r0[] r0VarArr = new d2.r0[1];
                            r0VarArr[z13 ? 1 : 0] = bVar;
                            a10 = new d2.s0(r0VarArr);
                        } else {
                            d2.r0[] r0VarArr2 = new d2.r0[1];
                            r0VarArr2[z13 ? 1 : 0] = bVar;
                            a10 = s0Var.a(r0VarArr2);
                        }
                        d2.u a11 = y10.a();
                        a11.f8424k = a10;
                        y10 = new d2.v(a11);
                    }
                    if (i13 && y10.h == -1 && y10.f8479i == -1 && i14 != -1) {
                        d2.u a12 = y10.a();
                        a12.h = i14;
                        y10 = new d2.v(a12);
                    }
                }
                int u10 = this.f57250c.u(y10);
                d2.u a13 = y10.a();
                a13.S = u10;
                d2.v vVar = new d2.v(a13);
                if (i12 != i11) {
                    d2.u a14 = vVar.a();
                    a14.f8425l = Integer.toString(i11);
                    vVar = new d2.v(a14);
                }
                String num = Integer.toString(i12);
                d2.v[] vVarArr = new d2.v[1];
                vVarArr[z13 ? 1 : 0] = vVar;
                o1VarArr[i12] = new d2.o1(num, vVarArr);
                this.f57247a0 = vVar.f8494y | this.f57247a0;
                this.M[i12].K(this.X);
                i12++;
                z12 = z13 ? 1 : 0;
            }
            r1 r1Var = new r1(o1VarArr);
            ?? obj = new Object();
            obj.f60311a = r1Var;
            obj.f60312b = zArr;
            int i15 = r1Var.f57206a;
            obj.f60313c = new boolean[i15];
            obj.d = new boolean[i15];
            this.S = obj;
            if (this.R && this.U == -9223372036854775807L) {
                this.U = j10;
                this.T = new q0(this, this.T);
            }
            this.h.v(this.U, this.T, this.V);
            this.P = true;
            d0 d0Var = this.J;
            d0Var.getClass();
            d0Var.b(this);
        }
    }

    public final void x(int i3) {
        m();
        za.p pVar = this.S;
        boolean[] zArr = (boolean[]) pVar.d;
        if (!zArr[i3]) {
            d2.v vVar = ((r1) pVar.f60311a).a(i3).d[0];
            this.f57253e.k(d2.u0.h(vVar.f8489s), vVar, 0, null, this.f57252d0);
            zArr[i3] = true;
        }
    }

    public final void y(int i3) {
        m();
        if (this.f57256f0) {
            if ((!this.Q || ((boolean[]) this.S.f60312b)[i3]) && !this.M[i3].A(false)) {
                this.f57254e0 = 0L;
                this.f57256f0 = false;
                this.Z = true;
                this.f57252d0 = 0L;
                this.f57257g0 = 0;
                for (c1 c1Var : this.M) {
                    c1Var.G(false);
                }
                d0 d0Var = this.J;
                d0Var.getClass();
                d0Var.k(this);
            }
        }
    }

    public final e3.i0 z(v0 v0Var) {
        int length = this.M.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (v0Var.equals(this.N[i3])) {
                return this.M[i3];
            }
        }
        if (this.O) {
            g2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f57239a + ") after finishing tracks.");
            return new e3.n();
        }
        p2.m mVar = this.f57250c;
        mVar.getClass();
        c1 c1Var = new c1(this.f57260n, mVar, this.f57255f);
        s0 s0Var = new s0(c1Var);
        c1Var.f57047f = this;
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
}

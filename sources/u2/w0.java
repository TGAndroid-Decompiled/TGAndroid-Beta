package u2;

import android.net.Uri;
import android.os.Handler;
import i2.v1;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import v7.t6;
public final class w0 implements e0, c3.q, y2.g, y2.j, b1 {
    public static final Map f50041i0;
    public static final b2.x f50042j0;
    public final q5.d D;
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
    public ji.f R;
    public c3.b0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri f50043a;
    public int f50044a0;
    public final g2.h f50045b;
    public boolean f50046b0;
    public final n2.m f50047c;
    public long f50048c0;
    public final hb.a d;
    public long f50049d0;
    public final a5.a e;
    public boolean f50050e0;
    public final n2.j f50051f;
    public int f50052f0;
    public boolean f50053g0;
    public final y0 h;
    public boolean f50054h0;
    public final android.support.v4.media.session.a0 f50055n;
    public final String f50056r;
    public final long f50057s;
    public final b2.x f50058w;
    public final long f50059x;
    public final y2.l f50060y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f50041i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.w wVar = new b2.w();
        wVar.f2356a = "icy";
        wVar.f2370r = b2.v0.n("application/x-icy");
        f50042j0 = new b2.x(wVar);
    }

    public w0(Uri uri, g2.h hVar, q5.d dVar, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, y0 y0Var, android.support.v4.media.session.a0 a0Var, String str, int i10, b2.x xVar, long j10, z2.a aVar3) {
        y2.l lVar;
        this.f50043a = uri;
        this.f50045b = hVar;
        this.f50047c = mVar;
        this.f50051f = jVar;
        this.d = aVar;
        this.e = aVar2;
        this.h = y0Var;
        this.f50055n = a0Var;
        this.f50056r = str;
        this.f50057s = i10;
        this.f50058w = xVar;
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f50060y = lVar;
        this.D = dVar;
        this.f50059x = j10;
        this.E = new e2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = e2.l0.q(null);
        this.M = new v0[0];
        this.L = new c1[0];
        this.K = new s0[0];
        this.f50049d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final void A(c3.b0 b0Var) {
        c3.b0 tVar;
        boolean z10;
        if (this.J == null) {
            tVar = b0Var;
        } else {
            tVar = new c3.t(-9223372036854775807L);
        }
        this.S = tVar;
        this.T = b0Var.h();
        int i10 = 1;
        if (!this.f50046b0 && b0Var.h() == -9223372036854775807L) {
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
            this.h.v(this.T, b0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        t0 t0Var = new t0(this, this.f50043a, this.f50045b, this.D, this, this.E);
        if (this.O) {
            t6.p(v());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.f50049d0 > j10) {
                this.f50053g0 = true;
                this.f50049d0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.S;
            b0Var.getClass();
            long j11 = b0Var.f(this.f50049d0).f3595a.f3625b;
            long j12 = this.f50049d0;
            t0Var.f50020f.f3687a = j11;
            t0Var.f50022r = j12;
            t0Var.f50021n = true;
            t0Var.f50025x = false;
            for (c1 c1Var : this.L) {
                c1Var.f49870t = this.f50049d0;
            }
            this.f50049d0 = -9223372036854775807L;
        }
        this.f50052f0 = i();
        this.f50060y.f(t0Var, this, this.d.q0(this.V));
    }

    public final boolean C() {
        if (!this.Y && !v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void G1(c3.b0 b0Var) {
        this.H.post(new th.o0(27, this, b0Var));
    }

    @Override
    public final c3.k0 I1(int i10, int i11) {
        return z(new v0(i10, false));
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) iVar;
        g2.c0 c0Var = t0Var.f50018b;
        u uVar = new u(t0Var.f50023s, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.f50022r, this.T);
        if (!z10) {
            for (c1 c1Var : this.L) {
                c1Var.G(false);
            }
            if (this.f50044a0 > 0) {
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.r(this);
            }
        }
    }

    @Override
    public final void Q0() {
        this.N = true;
        this.H.post(this.F);
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
            n2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.f49858g = null;
            }
        }
        q5.d dVar = this.D;
        c3.o oVar = (c3.o) dVar.f45499c;
        if (oVar != null) {
            oVar.release();
            dVar.f45499c = null;
        }
        dVar.d = null;
    }

    @Override
    public final long c() {
        return s();
    }

    @Override
    public final boolean d() {
        boolean z10;
        if (!this.f50053g0 && this.f50060y.d()) {
            e2.i iVar = this.E;
            synchronized (iVar) {
                z10 = iVar.f6149b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e() {
        t6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    @Override
    public final void f() {
        int q02 = this.d.q0(this.V);
        y2.l lVar = this.f50060y;
        IOException iOException = lVar.f54187c;
        if (iOException == null) {
            y2.h hVar = lVar.f54186b;
            if (hVar != null) {
                if (q02 == Integer.MIN_VALUE) {
                    q02 = hVar.f54177a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f54180f > q02) {
                    throw iOException2;
                }
            }
            if (this.f50053g0 && !this.O) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long g(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w0.g(long):long");
    }

    @Override
    public final void h(long j10) {
        if (!this.Q) {
            e();
            if (!v()) {
                boolean[] zArr = (boolean[]) this.R.d;
                int length = this.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.L[i10].k(j10, zArr[i10]);
                }
            }
        }
    }

    public final int i() {
        c1[] c1VarArr;
        int i10 = 0;
        for (c1 c1Var : this.L) {
            i10 += c1Var.f49867q + c1Var.f49866p;
        }
        return i10;
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        this.I = d0Var;
        b2.x xVar = this.f50058w;
        if (xVar != null) {
            I1(0, 3).b(xVar);
            A(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            Q0();
            this.f50049d0 = j10;
            return;
        }
        this.E.e();
        B();
    }

    @Override
    public final long k() {
        if (this.Z) {
            this.Z = false;
            return this.f50048c0;
        } else if (this.Y) {
            if (this.f50053g0 || i() > this.f50052f0) {
                this.Y = false;
                return this.f50048c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        int i11;
        k4.d dVar;
        c3.b0 b0Var;
        t0 t0Var = (t0) iVar;
        g2.c0 c0Var = t0Var.f50018b;
        u uVar = new u(t0Var.f50023s, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        String str = e2.l0.f6165a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).f7305a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f54184f;
        } else {
            int i12 = i();
            if (i12 > this.f50052f0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f50046b0 && ((b0Var = this.S) == null || b0Var.h() == -9223372036854775807L)) {
                if (this.O && !C()) {
                    this.f50050e0 = true;
                    dVar = y2.l.e;
                } else {
                    this.Y = this.O;
                    this.f50048c0 = 0L;
                    this.f50052f0 = 0;
                    for (c1 c1Var : this.L) {
                        c1Var.G(false);
                    }
                    t0Var.f50020f.f3687a = 0L;
                    t0Var.f50022r = 0L;
                    t0Var.f50021n = true;
                    t0Var.f50025x = false;
                }
            } else {
                this.f50052f0 = i12;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.f50022r, this.T, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        if (!this.f50053g0) {
            y2.l lVar = this.f50060y;
            if (!lVar.c() && !this.f50050e0) {
                if ((!this.O && this.f50058w == null) || this.f50044a0 != 0) {
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
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        t0 t0Var = (t0) iVar;
        g2.c0 c0Var = t0Var.f50018b;
        if (i10 == 0) {
            uVar = new u(t0Var.f50023s, j10);
        } else {
            uVar = new u(t0Var.f50023s, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        }
        this.e.u(uVar, 1, -1, null, 0, null, t0Var.f50022r, this.T, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        long j12;
        t0 t0Var = (t0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long r10 = r(true);
            if (r10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = r10 + 10000;
            }
            this.T = j12;
            this.h.v(j12, this.S, this.U);
        }
        g2.c0 c0Var = t0Var.f50018b;
        u uVar = new u(t0Var.f50023s, c0Var.f7285c, c0Var.d, j10, j11, c0Var.f7284b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.f50022r, this.T);
        this.f50053g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.r(this);
    }

    @Override
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        x2.q qVar;
        boolean z11;
        boolean z12;
        e();
        ji.f fVar = this.R;
        r1 r1Var = (r1) fVar.f10442b;
        boolean[] zArr3 = (boolean[]) fVar.d;
        int i10 = this.f50044a0;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (qVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).f50033a;
                t6.p(zArr3[i13]);
                this.f50044a0--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        if (!this.X ? !(j10 == 0 || this.Q) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (qVar = qVarArr[i14]) != null) {
                if (qVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t6.p(z11);
                if (qVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t6.p(z12);
                int b10 = r1Var.b(qVar.b());
                t6.p(!zArr3[b10]);
                this.f50044a0++;
                zArr3[b10] = true;
                this.Z = qVar.m().f2428y | this.Z;
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
        if (this.f50044a0 == 0) {
            this.f50050e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.f50060y;
            if (lVar.d()) {
                c1[] c1VarArr = this.L;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].l();
                    i11++;
                }
                lVar.b();
            } else {
                this.f50053g0 = false;
                for (c1 c1Var2 : this.L) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = g(j10);
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
    public final r1 q() {
        e();
        return (r1) this.R.f10442b;
    }

    public final long r(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.L.length; i10++) {
            if (!z10) {
                ji.f fVar = this.R;
                fVar.getClass();
                if (!((boolean[]) fVar.d)[i10]) {
                }
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override
    public final long s() {
        long j10;
        boolean z10;
        e();
        if (this.f50053g0 || this.f50044a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f50049d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                ji.f fVar = this.R;
                if (((boolean[]) fVar.f10443c)[i10] && ((boolean[]) fVar.d)[i10]) {
                    c1 c1Var = this.L[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.f49874y;
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
            j10 = r(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f50048c0;
        }
        return j10;
    }

    @Override
    public final long t(long j10, v1 v1Var) {
        e();
        if (!this.S.d()) {
            return 0L;
        }
        c3.a0 f7 = this.S.f(j10);
        return v1Var.a(j10, f7.f3595a.f3624a, f7.f3596b.f3624a);
    }

    @Override
    public final void u(long j10) {
        if (this.f50044a0 > 0 && !v()) {
            int i10 = 0;
            if (this.W != Long.MIN_VALUE) {
                e();
                int i11 = 1;
                while (true) {
                    c1[] c1VarArr = this.L;
                    if (i10 >= c1VarArr.length) {
                        break;
                    }
                    ji.f fVar = this.R;
                    if (((boolean[]) fVar.d)[i10] && (((boolean[]) fVar.f10443c)[i10] || !this.P)) {
                        i11 &= c1VarArr[i10].z();
                    }
                    i10++;
                }
                i10 = i11;
            }
            if (i10 != 0) {
                this.f50053g0 = true;
            }
        }
    }

    public final boolean v() {
        if (this.f50049d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z10;
        boolean z11;
        b2.u0 a2;
        char c10;
        long j10 = this.f50059x;
        if (!this.f50054h0 && !this.O && this.N && this.S != null) {
            boolean z12 = false;
            for (c1 c1Var : this.L) {
                if (c1Var.y() == null) {
                    return;
                }
            }
            e2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f6149b = false;
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
                b2.x y3 = this.L[i11].y();
                y3.getClass();
                int h = b2.v0.h(y3.f2423s);
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
                b2.x y10 = this.L[i13].y();
                y10.getClass();
                String str = y10.f2423s;
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
                    int i15 = bVar.f44703a;
                    if (i14 || this.M[i13].f50037b) {
                        b2.u0 u0Var = y10.f2416l;
                        if (u0Var == null) {
                            b2.t0[] t0VarArr = new b2.t0[1];
                            t0VarArr[z13 ? 1 : 0] = bVar;
                            a2 = new b2.u0(t0VarArr);
                        } else {
                            b2.t0[] t0VarArr2 = new b2.t0[1];
                            t0VarArr2[z13 ? 1 : 0] = bVar;
                            a2 = u0Var.a(t0VarArr2);
                        }
                        b2.w a10 = y10.a();
                        a10.f2363k = a2;
                        y10 = new b2.x(a10);
                    }
                    if (i14 && y10.h == -1 && y10.f2413i == -1 && i15 != -1) {
                        b2.w a11 = y10.a();
                        a11.h = i15;
                        y10 = new b2.x(a11);
                    }
                }
                int t02 = this.f50047c.t0(y10);
                b2.w a12 = y10.a();
                a12.S = t02;
                b2.x xVar = new b2.x(a12);
                if (i13 != i12) {
                    b2.w a13 = xVar.a();
                    a13.f2364l = Integer.toString(i12);
                    xVar = new b2.x(a13);
                }
                String num = Integer.toString(i13);
                b2.x[] xVarArr = new b2.x[1];
                xVarArr[z13 ? 1 : 0] = xVar;
                p1VarArr[i13] = new b2.p1(num, xVarArr);
                this.Z = xVar.f2428y | this.Z;
                this.L[i13].K(this.W);
                i13++;
                z12 = z13 ? 1 : 0;
            }
            this.R = new ji.f(new r1(p1VarArr), zArr);
            if (this.Q && this.T == -9223372036854775807L) {
                this.T = j10;
                this.S = new q0(this, this.S);
            }
            this.h.v(this.T, this.S, this.U);
            this.O = true;
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.e(this);
        }
    }

    public final void x(int i10) {
        e();
        ji.f fVar = this.R;
        boolean[] zArr = (boolean[]) fVar.e;
        if (!zArr[i10]) {
            b2.x xVar = ((r1) fVar.f10442b).a(i10).d[0];
            this.e.l(b2.v0.h(xVar.f2423s), xVar, 0, null, this.f50048c0);
            zArr[i10] = true;
        }
    }

    public final void y(int i10) {
        e();
        if (this.f50050e0) {
            if ((!this.P || ((boolean[]) this.R.f10443c)[i10]) && !this.L[i10].A(false)) {
                this.f50049d0 = 0L;
                this.f50050e0 = false;
                this.Y = true;
                this.f50048c0 = 0L;
                this.f50052f0 = 0;
                for (c1 c1Var : this.L) {
                    c1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.r(this);
            }
        }
    }

    public final c3.k0 z(v0 v0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f50036a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f50047c;
        mVar.getClass();
        c1 c1Var = new c1(this.f50055n, mVar, this.f50051f);
        s0 s0Var = new s0(c1Var);
        c1Var.f49857f = this;
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

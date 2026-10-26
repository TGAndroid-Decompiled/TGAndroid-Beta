package u2;

import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class w0 implements e0, c3.q, y2.g, y2.j, b1 {
    public static final Map f49448i0;
    public static final b2.x f49449j0;
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
    public com.google.firebase.messaging.q R;
    public c3.b0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri f49450a;
    public int f49451a0;
    public final g2.h f49452b;
    public boolean f49453b0;
    public final n2.m f49454c;
    public long f49455c0;
    public final u7.s d;
    public long f49456d0;
    public final ng e;
    public boolean f49457e0;
    public final n2.j f49458f;
    public int f49459f0;
    public boolean f49460g0;
    public final y0 h;
    public boolean f49461h0;
    public final a8.h0 f49462n;
    public final String f49463r;
    public final long f49464s;
    public final b2.x v;
    public final long f49465w;
    public final y2.l f49466x;
    public final s4.d f49467y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f49448i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.w wVar = new b2.w();
        wVar.f3519a = "icy";
        wVar.f3533r = b2.w0.n("application/x-icy");
        f49449j0 = new b2.x(wVar);
    }

    public w0(Uri uri, g2.h hVar, s4.d dVar, n2.m mVar, n2.j jVar, u7.s sVar, ng ngVar, y0 y0Var, a8.h0 h0Var, String str, int i10, b2.x xVar, long j10, z2.a aVar) {
        y2.l lVar;
        this.f49450a = uri;
        this.f49452b = hVar;
        this.f49454c = mVar;
        this.f49458f = jVar;
        this.d = sVar;
        this.e = ngVar;
        this.h = y0Var;
        this.f49462n = h0Var;
        this.f49463r = str;
        this.f49464s = i10;
        this.v = xVar;
        if (aVar != null) {
            lVar = new y2.l(aVar);
        } else {
            lVar = new y2.l("ProgressiveMediaPeriod");
        }
        this.f49466x = lVar;
        this.f49467y = dVar;
        this.f49465w = j10;
        this.E = new e2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = e2.n0.q(null);
        this.M = new v0[0];
        this.L = new c1[0];
        this.K = new s0[0];
        this.f49456d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final void A() {
        t0 t0Var = new t0(this, this.f49450a, this.f49452b, this.f49467y, this, this.E);
        if (this.O) {
            yb.p(n());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.f49456d0 > j10) {
                this.f49460g0 = true;
                this.f49456d0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.S;
            b0Var.getClass();
            long j11 = b0Var.f(this.f49456d0).f6002a.f6032b;
            long j12 = this.f49456d0;
            t0Var.f49428f.f6092a = j11;
            t0Var.f49430r = j12;
            t0Var.f49429n = true;
            t0Var.f49432w = false;
            for (c1 c1Var : this.L) {
                c1Var.f49278t = this.f49456d0;
            }
            this.f49456d0 = -9223372036854775807L;
        }
        this.f49459f0 = f();
        this.f49466x.f(t0Var, this, this.d.B0(this.V));
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        long j12;
        t0 t0Var = (t0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long j13 = j(true);
            if (j13 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = j13 + 10000;
            }
            this.T = j12;
            this.h.v(j12, this.S, this.U);
        }
        g2.b0 b0Var = t0Var.f49426b;
        u uVar = new u(t0Var.f49431s, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.f49430r, this.T);
        this.f49460g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.u(this);
    }

    public final boolean C() {
        if (!this.Y && !n()) {
            return false;
        }
        return true;
    }

    @Override
    public final void D1(c3.b0 b0Var) {
        this.H.post(new sg.u(13, this, b0Var));
    }

    @Override
    public final c3.j0 F1(int i10, int i11) {
        return x(new v0(i10, false));
    }

    @Override
    public final void Q0() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        for (c1 c1Var : this.L) {
            c1Var.G(true);
            n2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.f49266g = null;
            }
        }
        s4.d dVar = this.f49467y;
        c3.o oVar = (c3.o) dVar.f47721c;
        if (oVar != null) {
            oVar.release();
            dVar.f47721c = null;
        }
        dVar.d = null;
    }

    @Override
    public final long b() {
        return q();
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (!this.f49460g0 && this.f49466x.c()) {
            e2.i iVar = this.E;
            synchronized (iVar) {
                z10 = iVar.f9670b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        this.H.post(this.F);
    }

    public final void e() {
        yb.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int f() {
        c1[] c1VarArr;
        int i10 = 0;
        for (c1 c1Var : this.L) {
            i10 += c1Var.f49275q + c1Var.f49274p;
        }
        return i10;
    }

    @Override
    public final void g() {
        int B0 = this.d.B0(this.V);
        y2.l lVar = this.f49466x;
        IOException iOException = lVar.f51966c;
        if (iOException == null) {
            y2.h hVar = lVar.f51965b;
            if (hVar != null) {
                if (B0 == Integer.MIN_VALUE) {
                    B0 = hVar.f51956a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f51959f > B0) {
                    throw iOException2;
                }
            }
            if (this.f49460g0 && !this.O) {
                throw b2.x0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long h(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.w0.h(long):long");
    }

    @Override
    public final void i(long j10) {
        if (!this.Q) {
            e();
            if (!n()) {
                boolean[] zArr = (boolean[]) this.R.f7759c;
                int length = this.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.L[i10].k(j10, zArr[i10]);
                }
            }
        }
    }

    public final long j(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.L.length; i10++) {
            if (!z10) {
                com.google.firebase.messaging.q qVar = this.R;
                qVar.getClass();
                if (!((boolean[]) qVar.f7759c)[i10]) {
                }
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.I = d0Var;
        b2.x xVar = this.v;
        if (xVar != null) {
            F1(0, 3).b(xVar);
            y(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            Q0();
            this.f49456d0 = j10;
            return;
        }
        this.E.e();
        A();
    }

    @Override
    public final long l() {
        if (this.Z) {
            this.Z = false;
            return this.f49455c0;
        } else if (this.Y) {
            if (this.f49460g0 || f() > this.f49459f0) {
                this.Y = false;
                return this.f49455c0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.f49426b;
        u uVar = new u(t0Var.f49431s, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.f49430r, this.T);
        if (!z10) {
            for (c1 c1Var : this.L) {
                c1Var.G(false);
            }
            if (this.f49451a0 > 0) {
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.u(this);
            }
        }
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        if (!this.f49460g0) {
            y2.l lVar = this.f49466x;
            if (!lVar.b() && !this.f49457e0) {
                if ((!this.O && this.v == null) || this.f49451a0 != 0) {
                    boolean e = this.E.e();
                    if (!lVar.c()) {
                        A();
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

    public final boolean n() {
        if (this.f49456d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long o(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        x2.q qVar;
        boolean z11;
        boolean z12;
        e();
        com.google.firebase.messaging.q qVar2 = this.R;
        r1 r1Var = (r1) qVar2.f7757a;
        boolean[] zArr3 = (boolean[]) qVar2.f7759c;
        int i10 = this.f49451a0;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (qVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).f49440a;
                yb.p(zArr3[i13]);
                this.f49451a0--;
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
                yb.p(z11);
                if (qVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yb.p(z12);
                int b10 = r1Var.b(qVar.b());
                yb.p(!zArr3[b10]);
                this.f49451a0++;
                zArr3[b10] = true;
                this.Z = qVar.m().f3591y | this.Z;
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
        if (this.f49451a0 == 0) {
            this.f49457e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.f49466x;
            if (lVar.c()) {
                c1[] c1VarArr = this.L;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].l();
                    i11++;
                }
                lVar.a();
            } else {
                this.f49460g0 = false;
                for (c1 c1Var2 : this.L) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = h(j10);
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
    public final r1 p() {
        e();
        return (r1) this.R.f7757a;
    }

    @Override
    public final long q() {
        long j10;
        boolean z10;
        e();
        if (this.f49460g0 || this.f49451a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f49456d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.q qVar = this.R;
                if (((boolean[]) qVar.f7758b)[i10] && ((boolean[]) qVar.f7759c)[i10]) {
                    c1 c1Var = this.L[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.f49282y;
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
            j10 = j(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f49455c0;
        }
        return j10;
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        e();
        if (!this.S.d()) {
            return 0L;
        }
        c3.a0 f7 = this.S.f(j10);
        return t1Var.a(j10, f7.f6002a.f6031a, f7.f6003b.f6031a);
    }

    @Override
    public final void s(long j10) {
        if (this.f49451a0 > 0 && !n()) {
            int i10 = 0;
            if (this.W != Long.MIN_VALUE) {
                e();
                int i11 = 1;
                while (true) {
                    c1[] c1VarArr = this.L;
                    if (i10 >= c1VarArr.length) {
                        break;
                    }
                    com.google.firebase.messaging.q qVar = this.R;
                    if (((boolean[]) qVar.f7759c)[i10] && (((boolean[]) qVar.f7758b)[i10] || !this.P)) {
                        i11 &= c1VarArr[i10].z();
                    }
                    i10++;
                }
                i10 = i11;
            }
            if (i10 != 0) {
                this.f49460g0 = true;
            }
        }
    }

    public final void t() {
        boolean z10;
        boolean z11;
        b2.u0 a2;
        char c10;
        long j10 = this.f49465w;
        if (!this.f49461h0 && !this.O && this.N && this.S != null) {
            boolean z12 = false;
            for (c1 c1Var : this.L) {
                if (c1Var.y() == null) {
                    return;
                }
            }
            e2.i iVar = this.E;
            synchronized (iVar) {
                iVar.f9670b = false;
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
                int h = b2.w0.h(y3.f3586s);
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
            b2.q1[] q1VarArr = new b2.q1[length];
            boolean[] zArr = new boolean[length];
            int i13 = 0;
            while (i13 < length) {
                b2.x y10 = this.L[i13].y();
                y10.getClass();
                String str = y10.f3586s;
                boolean i14 = b2.w0.i(str);
                if (!i14 && !b2.w0.m(str)) {
                    z10 = z12;
                } else {
                    z10 = true;
                }
                zArr[i13] = z10;
                boolean z13 = z12;
                this.P |= z10;
                boolean k10 = b2.w0.k(str);
                if (j10 != -9223372036854775807L && length == 1 && k10) {
                    z11 = true;
                } else {
                    z11 = z13 ? 1 : 0;
                }
                this.Q = z11;
                p3.b bVar = this.J;
                if (bVar != null) {
                    int i15 = bVar.f46643a;
                    if (i14 || this.M[i13].f49444b) {
                        b2.u0 u0Var = y10.f3579l;
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
                        a10.f3526k = a2;
                        y10 = new b2.x(a10);
                    }
                    if (i14 && y10.h == -1 && y10.f3576i == -1 && i15 != -1) {
                        b2.w a11 = y10.a();
                        a11.h = i15;
                        y10 = new b2.x(a11);
                    }
                }
                int w10 = this.f49454c.w(y10);
                b2.w a12 = y10.a();
                a12.S = w10;
                b2.x xVar = new b2.x(a12);
                if (i13 != i12) {
                    b2.w a13 = xVar.a();
                    a13.f3527l = Integer.toString(i12);
                    xVar = new b2.x(a13);
                }
                String num = Integer.toString(i13);
                b2.x[] xVarArr = new b2.x[1];
                xVarArr[z13 ? 1 : 0] = xVar;
                q1VarArr[i13] = new b2.q1(num, xVarArr);
                this.Z = xVar.f3591y | this.Z;
                this.L[i13].K(this.W);
                i13++;
                z12 = z13 ? 1 : 0;
            }
            r1 r1Var = new r1(q1VarArr);
            ?? obj = new Object();
            obj.f7757a = r1Var;
            obj.f7758b = zArr;
            int i16 = r1Var.f49415a;
            obj.f7759c = new boolean[i16];
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
            d0Var.n(this);
        }
    }

    public final void u(int i10) {
        e();
        com.google.firebase.messaging.q qVar = this.R;
        boolean[] zArr = (boolean[]) qVar.d;
        if (!zArr[i10]) {
            b2.x xVar = ((r1) qVar.f7757a).a(i10).d[0];
            this.e.l(b2.w0.h(xVar.f3586s), xVar, 0, null, this.f49455c0);
            zArr[i10] = true;
        }
    }

    public final void v(int i10) {
        e();
        if (this.f49457e0) {
            if ((!this.P || ((boolean[]) this.R.f7758b)[i10]) && !this.L[i10].A(false)) {
                this.f49456d0 = 0L;
                this.f49457e0 = false;
                this.Y = true;
                this.f49455c0 = 0L;
                this.f49459f0 = 0;
                for (c1 c1Var : this.L) {
                    c1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.u(this);
            }
        }
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        int i11;
        k4.d dVar;
        c3.b0 b0Var;
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var2 = t0Var.f49426b;
        u uVar = new u(t0Var.f49431s, b0Var2.f12231c, b0Var2.d, j10, j11, b0Var2.f12230b);
        String str = e2.n0.f9692a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f12248a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f51963f;
        } else {
            int f7 = f();
            if (f7 > this.f49459f0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f49453b0 && ((b0Var = this.S) == null || b0Var.h() == -9223372036854775807L)) {
                if (this.O && !C()) {
                    this.f49457e0 = true;
                    dVar = y2.l.e;
                } else {
                    this.Y = this.O;
                    this.f49455c0 = 0L;
                    this.f49459f0 = 0;
                    for (c1 c1Var : this.L) {
                        c1Var.G(false);
                    }
                    t0Var.f49428f.f6092a = 0L;
                    t0Var.f49430r = 0L;
                    t0Var.f49429n = true;
                    t0Var.f49432w = false;
                }
            } else {
                this.f49459f0 = f7;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.f49430r, this.T, iOException, !dVar.a());
        return dVar;
    }

    public final c3.j0 x(v0 v0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.f49443a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.f49454c;
        mVar.getClass();
        c1 c1Var = new c1(this.f49462n, mVar, this.f49458f);
        s0 s0Var = new s0(c1Var);
        c1Var.f49265f = this;
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

    public final void y(c3.b0 b0Var) {
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
        if (!this.f49453b0 && b0Var.h() == -9223372036854775807L) {
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
            t();
        }
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.f49426b;
        if (i10 == 0) {
            uVar = new u(t0Var.f49431s, j10);
        } else {
            uVar = new u(t0Var.f49431s, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        }
        this.e.u(uVar, 1, -1, null, 0, null, t0Var.f49430r, this.T, i10);
    }
}

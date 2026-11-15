package x2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.ld0;
import ug.t1;
public final class v0 implements d0, f3.q, b3.j, b3.m, z0 {
    public static final Map f59678j0;
    public static final e2.u f59679k0;
    public final ld0 E;
    public final h2.i F;
    public final o0 G;
    public final o0 H;
    public final Handler I;
    public c0 J;
    public s3.b K;
    public r0[] L;
    public a1[] M;
    public u0[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ab.c0 S;
    public f3.b0 T;
    public long U;
    public boolean V;
    public int W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri f59680a;
    public boolean f59681a0;
    public final j2.h f59682b;
    public int f59683b0;
    public final q2.n f59684c;
    public boolean f59685c0;
    public final qb.a d;
    public long f59686d0;
    public final xa f59687e;
    public long f59688e0;
    public final q2.k f59689f;
    public boolean f59690f0;
    public int f59691g0;
    public final x0 h;
    public boolean f59692h0;
    public boolean f59693i0;
    public final h6.m f59694n;
    public final String f59695r;
    public final long f59696s;
    public final e2.u f59697w;
    public final long f59698x;
    public final b3.o f59699y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f59678j0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.f10384a = "icy";
        tVar.f10399r = e2.s0.n("application/x-icy");
        f59679k0 = new e2.u(tVar);
    }

    public v0(Uri uri, j2.h hVar, ld0 ld0Var, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, x0 x0Var, h6.m mVar, String str, int i7, e2.u uVar, long j3, c3.a aVar2) {
        b3.o oVar;
        this.f59680a = uri;
        this.f59682b = hVar;
        this.f59684c = nVar;
        this.f59689f = kVar;
        this.d = aVar;
        this.f59687e = xaVar;
        this.h = x0Var;
        this.f59694n = mVar;
        this.f59695r = str;
        this.f59696s = i7;
        this.f59697w = uVar;
        if (aVar2 != null) {
            oVar = new b3.o(aVar2);
        } else {
            oVar = new b3.o("ProgressiveMediaPeriod");
        }
        this.f59699y = oVar;
        this.E = ld0Var;
        this.f59698x = j3;
        this.F = new h2.i();
        this.G = new o0(this, 1);
        this.H = new o0(this, 2);
        this.I = h2.l0.q(null);
        this.N = new u0[0];
        this.M = new a1[0];
        this.L = new r0[0];
        this.f59688e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(int i7) {
        n();
        if (this.f59690f0) {
            if ((!this.Q || ((boolean[]) this.S.f910c)[i7]) && !this.M[i7].A(false)) {
                this.f59688e0 = 0L;
                this.f59690f0 = false;
                this.Z = true;
                this.f59686d0 = 0L;
                this.f59691g0 = 0;
                for (a1 a1Var : this.M) {
                    a1Var.G(false);
                }
                c0 c0Var = this.J;
                c0Var.getClass();
                c0Var.f0(this);
            }
        }
    }

    public final f3.i0 B(u0 u0Var) {
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (u0Var.equals(this.N[i7])) {
                return this.M[i7];
            }
        }
        if (this.O) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.f59673a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.n nVar = this.f59684c;
        nVar.getClass();
        a1 a1Var = new a1(this.f59694n, nVar, this.f59689f);
        r0 r0Var = new r0(a1Var);
        a1Var.f59477f = this;
        int i10 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.N, i10);
        u0VarArr[length] = u0Var;
        this.N = u0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.M, i10);
        a1VarArr[length] = a1Var;
        this.M = a1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.L, i10);
        r0VarArr[length] = r0Var;
        this.L = r0VarArr;
        return r0Var;
    }

    public final void C(f3.b0 b0Var) {
        f3.b0 tVar;
        boolean z10;
        if (this.K == null) {
            tVar = b0Var;
        } else {
            tVar = new f3.t(-9223372036854775807L);
        }
        this.T = tVar;
        this.U = b0Var.h();
        int i7 = 1;
        if (!this.f59685c0 && b0Var.h() == -9223372036854775807L) {
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
            this.h.v(this.U, b0Var, z10);
        } else {
            y();
        }
    }

    public final void D() {
        s0 s0Var = new s0(this, this.f59680a, this.f59682b, this.E, this, this.F);
        if (this.P) {
            ja.p(x());
            long j3 = this.X;
            if (j3 == Long.MIN_VALUE) {
                j3 = this.U;
            }
            if (j3 != -9223372036854775807L && this.f59688e0 > j3) {
                this.f59692h0 = true;
                this.f59688e0 = -9223372036854775807L;
                return;
            }
            f3.b0 b0Var = this.T;
            b0Var.getClass();
            long j10 = b0Var.f(this.f59688e0).f10777a.f10809b;
            long j11 = this.f59688e0;
            s0Var.f59656f.f10877a = j10;
            s0Var.f59658r = j11;
            s0Var.f59657n = true;
            s0Var.f59661x = false;
            for (a1 a1Var : this.M) {
                a1Var.f59490t = this.f59688e0;
            }
            this.f59688e0 = -9223372036854775807L;
        }
        this.f59691g0 = q();
        this.f59699y.f(s0Var, this, this.d.R4(this.W));
    }

    public final boolean E() {
        if (!this.Z && !x()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        boolean z10;
        a3.u uVar;
        boolean z11;
        boolean z12;
        n();
        ab.c0 c0Var = this.S;
        q1 q1Var = (q1) c0Var.f909b;
        boolean[] zArr3 = (boolean[]) c0Var.d;
        int i7 = this.f59683b0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((t0) b1Var).f59670a;
                ja.p(zArr3[i12]);
                this.f59683b0--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        if (!this.Y ? !(j3 == 0 || this.R) : i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                if (uVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ja.p(z11);
                if (uVar.i(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ja.p(z12);
                int b10 = q1Var.b(uVar.c());
                ja.p(!zArr3[b10]);
                this.f59683b0++;
                zArr3[b10] = true;
                this.f59681a0 = uVar.n().f10456y | this.f59681a0;
                b1VarArr[i13] = new t0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    a1 a1Var = this.M[b10];
                    if (a1Var.v() != 0 && !a1Var.J(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f59683b0 == 0) {
            this.f59690f0 = false;
            this.Z = false;
            this.f59681a0 = false;
            b3.o oVar = this.f59699y;
            if (oVar.d()) {
                a1[] a1VarArr = this.M;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].l();
                    i10++;
                }
                oVar.b();
            } else {
                this.f59692h0 = false;
                for (a1 a1Var2 : this.M) {
                    a1Var2.G(false);
                }
            }
        } else if (z10) {
            j3 = j(j3);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j3;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        if (!this.f59692h0) {
            b3.o oVar = this.f59699y;
            if (!oVar.c() && !this.f59690f0) {
                if ((!this.P && this.f59697w == null) || this.f59683b0 != 0) {
                    boolean e10 = this.F.e();
                    if (!oVar.d()) {
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
    public final void d() {
        a1[] a1VarArr;
        for (a1 a1Var : this.M) {
            a1Var.G(true);
            q2.h hVar = a1Var.h;
            if (hVar != null) {
                hVar.c(a1Var.f59476e);
                a1Var.h = null;
                a1Var.f59478g = null;
            }
        }
        ld0 ld0Var = this.E;
        f3.o oVar = (f3.o) ld0Var.f48973c;
        if (oVar != null) {
            oVar.release();
            ld0Var.f48973c = null;
        }
        ld0Var.d = null;
    }

    @Override
    public final void d1() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override
    public final f3.i0 d2(int i7, int i10) {
        return B(new u0(i7, false));
    }

    @Override
    public final long e() {
        return s();
    }

    @Override
    public final void f(f3.b0 b0Var) {
        this.I.post(new t1(17, this, b0Var));
    }

    @Override
    public final boolean g() {
        boolean z10;
        if (!this.f59692h0 && this.f59699y.d()) {
            h2.i iVar = this.F;
            synchronized (iVar) {
                z10 = iVar.f13454b;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        n();
        if (!this.T.d()) {
            return 0L;
        }
        f3.a0 f10 = this.T.f(j3);
        return p1Var.a(j3, f10.f10777a.f10808a, f10.f10778b.f10808a);
    }

    @Override
    public final void i() {
        int R4 = this.d.R4(this.W);
        b3.o oVar = this.f59699y;
        IOException iOException = oVar.f2921c;
        if (iOException == null) {
            b3.k kVar = oVar.f2920b;
            if (kVar != null) {
                if (R4 == Integer.MIN_VALUE) {
                    R4 = kVar.f2909a;
                }
                IOException iOException2 = kVar.f2912e;
                if (iOException2 != null && kVar.f2913f > R4) {
                    throw iOException2;
                }
            }
            if (this.f59692h0 && !this.P) {
                throw e2.t0.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long j(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: x2.v0.j(long):long");
    }

    @Override
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        int i10;
        b3.i iVar;
        f3.b0 b0Var;
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var2 = s0Var.f59653b;
        t tVar = new t(s0Var.f59659s, b0Var2.f16771c, b0Var2.d, j3, j10, b0Var2.f16770b);
        String str = h2.l0.f13471a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16791a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f2918f;
        } else {
            int q10 = q();
            if (q10 > this.f59691g0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f59685c0 && ((b0Var = this.T) == null || b0Var.h() == -9223372036854775807L)) {
                if (this.P && !E()) {
                    this.f59690f0 = true;
                    iVar = b3.o.f2917e;
                } else {
                    this.Z = this.P;
                    this.f59686d0 = 0L;
                    this.f59691g0 = 0;
                    for (a1 a1Var : this.M) {
                        a1Var.G(false);
                    }
                    s0Var.f59656f.f10877a = 0L;
                    s0Var.f59658r = 0L;
                    s0Var.f59657n = true;
                    s0Var.f59661x = false;
                }
            } else {
                this.f59691g0 = q10;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.f59687e.p(tVar, 1, -1, null, 0, null, s0Var.f59658r, this.U, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public final void l(long j3) {
        if (!this.R) {
            n();
            if (!x()) {
                boolean[] zArr = (boolean[]) this.S.d;
                int length = this.M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    this.M[i7].k(j3, zArr[i7]);
                }
            }
        }
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var = s0Var.f59653b;
        t tVar = new t(s0Var.f59659s, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.d.getClass();
        this.f59687e.n(tVar, 1, -1, null, 0, null, s0Var.f59658r, this.U);
        if (!z10) {
            for (a1 a1Var : this.M) {
                a1Var.G(false);
            }
            if (this.f59683b0 > 0) {
                c0 c0Var = this.J;
                c0Var.getClass();
                c0Var.f0(this);
            }
        }
    }

    public final void n() {
        ja.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override
    public final long o() {
        if (this.f59681a0) {
            this.f59681a0 = false;
            return this.f59686d0;
        } else if (this.Z) {
            if (this.f59692h0 || q() > this.f59691g0) {
                this.Z = false;
                return this.f59686d0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final q1 p() {
        n();
        return (q1) this.S.f909b;
    }

    public final int q() {
        a1[] a1VarArr;
        int i7 = 0;
        for (a1 a1Var : this.M) {
            i7 += a1Var.f59487q + a1Var.f59486p;
        }
        return i7;
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        t tVar;
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var = s0Var.f59653b;
        if (i7 == 0) {
            tVar = new t(s0Var.f59659s, j3);
        } else {
            tVar = new t(s0Var.f59659s, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.f59687e.s(tVar, 1, -1, null, 0, null, s0Var.f59658r, this.U, i7);
    }

    @Override
    public final long s() {
        long j3;
        boolean z10;
        n();
        if (this.f59692h0 || this.f59683b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f59688e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.f910c)[i7] && ((boolean[]) c0Var.d)[i7]) {
                    a1 a1Var = this.M[i7];
                    synchronized (a1Var) {
                        z10 = a1Var.f59494y;
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
            return this.f59686d0;
        }
        return j3;
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.J = c0Var;
        e2.u uVar = this.f59697w;
        if (uVar != null) {
            d2(0, 3).g(uVar);
            C(new f3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            d1();
            this.f59688e0 = j3;
            return;
        }
        this.F.e();
        D();
    }

    @Override
    public final void u(long j3) {
        if (this.f59683b0 > 0 && !x()) {
            int i7 = 0;
            if (this.X != Long.MIN_VALUE) {
                n();
                int i10 = 1;
                while (true) {
                    a1[] a1VarArr = this.M;
                    if (i7 >= a1VarArr.length) {
                        break;
                    }
                    ab.c0 c0Var = this.S;
                    if (((boolean[]) c0Var.d)[i7] && (((boolean[]) c0Var.f910c)[i7] || !this.Q)) {
                        i10 &= a1VarArr[i7].z();
                    }
                    i7++;
                }
                i7 = i10;
            }
            if (i7 != 0) {
                this.f59692h0 = true;
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

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        long j11;
        s0 s0Var = (s0) lVar;
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
        j2.b0 b0Var = s0Var.f59653b;
        t tVar = new t(s0Var.f59659s, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.d.getClass();
        this.f59687e.o(tVar, 1, -1, null, 0, null, s0Var.f59658r, this.U);
        this.f59692h0 = true;
        c0 c0Var = this.J;
        c0Var.getClass();
        c0Var.f0(this);
    }

    public final boolean x() {
        if (this.f59688e0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void y() {
        boolean z10;
        boolean z11;
        e2.q0 a10;
        char c10;
        long j3 = this.f59698x;
        if (!this.f59693i0 && !this.P && this.O && this.T != null) {
            boolean z12 = false;
            for (a1 a1Var : this.M) {
                if (a1Var.y() == null) {
                    return;
                }
            }
            h2.i iVar = this.F;
            synchronized (iVar) {
                iVar.f13454b = false;
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
                int h = e2.s0.h(y10.f10451s);
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
                String str = y11.f10451s;
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
                    int i14 = bVar.f56337a;
                    if (i13 || this.N[i12].f59674b) {
                        e2.q0 q0Var = y11.f10444l;
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
                        a11.f10392k = a10;
                        y11 = new e2.u(a11);
                    }
                    if (i13 && y11.h == -1 && y11.f10441i == -1 && i14 != -1) {
                        e2.t a12 = y11.a();
                        a12.h = i14;
                        y11 = new e2.u(a12);
                    }
                }
                int E1 = this.f59684c.E1(y11);
                e2.t a13 = y11.a();
                a13.S = E1;
                e2.u uVar = new e2.u(a13);
                if (i12 != i11) {
                    e2.t a14 = uVar.a();
                    a14.f10393l = Integer.toString(i11);
                    uVar = new e2.u(a14);
                }
                String num = Integer.toString(i12);
                e2.u[] uVarArr = new e2.u[1];
                uVarArr[z13 ? 1 : 0] = uVar;
                m1VarArr[i12] = new e2.m1(num, uVarArr);
                this.f59681a0 = uVar.f10456y | this.f59681a0;
                this.M[i12].K(this.X);
                i12++;
                z12 = z13 ? 1 : 0;
            }
            this.S = new ab.c0(new q1(m1VarArr), zArr);
            if (this.R && this.U == -9223372036854775807L) {
                this.U = j3;
                this.T = new p0(this, this.T);
            }
            this.h.v(this.U, this.T, this.V);
            this.P = true;
            c0 c0Var = this.J;
            c0Var.getClass();
            c0Var.k(this);
        }
    }

    public final void z(int i7) {
        n();
        ab.c0 c0Var = this.S;
        boolean[] zArr = (boolean[]) c0Var.f911e;
        if (!zArr[i7]) {
            e2.u uVar = ((q1) c0Var.f909b).a(i7).d[0];
            this.f59687e.i(e2.s0.h(uVar.f10451s), uVar, 0, null, this.f59686d0);
            zArr[i7] = true;
        }
    }
}

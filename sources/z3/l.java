package z3;

import f3.f0;
import f3.j0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class l implements f3.o {
    public long A;
    public f3.q B;
    public k[] C;
    public long[][] D;
    public int E;
    public o3.b F;
    public final c4.k f60846a;
    public final int f60847b;
    public final boolean f60848c;
    public final x d;
    public final x f60849e;
    public final x f60850f;
    public final x f60851g;
    public final ArrayDeque h;
    public final o f60852i;
    public final ArrayList f60853j;
    public s1 f60854k;
    public int f60855l;
    public int f60856m;
    public long f60857n;
    public int f60858o;
    public x f60859p;
    public int f60860q;
    public int f60861r;
    public int f60862s;
    public int f60863t;
    public boolean f60864u;
    public boolean v;
    public boolean f60865w;
    public long f60866x;
    public boolean f60867y;
    public boolean f60868z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f60846a = kVar;
        this.f60847b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f60848c = z10;
        g0 g0Var = i0.f13686b;
        this.f60854k = s1.f13749e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f60855l = i10;
        this.f60852i = new o();
        this.f60853j = new ArrayList();
        this.f60851g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15659a);
        this.f60849e = new x(6);
        this.f60850f = new x();
        this.f60860q = -1;
        this.B = f3.q.f10876q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        s1 s1Var;
        if ((this.f60847b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            s1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f13686b;
            s1Var = s1.f13749e;
        }
        this.f60854k = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f60847b & 16) == 0) {
            qVar = new ab.q(qVar, this.f60846a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f60858o = 0;
        this.f60860q = -1;
        this.f60861r = 0;
        this.f60862s = 0;
        this.f60863t = 0;
        this.f60864u = false;
        this.f60868z = false;
        if (j3 == 0) {
            if (this.f60855l != 3) {
                this.f60855l = 0;
                this.f60858o = 0;
                return;
            }
            o oVar = this.f60852i;
            oVar.f60873a.clear();
            oVar.f60874b = 0;
            this.f60853j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f60842b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f60844e = a10;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f10851b = false;
                j0Var.f10852c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f60854k;
    }

    @Override
    public final int f(f3.p r43, f3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: z3.l.f(f3.p, f3.s):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: z3.l.g(long):void");
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}

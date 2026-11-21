package z3;

import f3.f0;
import f3.j0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
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
    public final c4.k f61452a;
    public final int f61453b;
    public final boolean f61454c;
    public final x d;
    public final x f61455e;
    public final x f61456f;
    public final x f61457g;
    public final ArrayDeque h;
    public final o f61458i;
    public final ArrayList f61459j;
    public t1 f61460k;
    public int f61461l;
    public int f61462m;
    public long f61463n;
    public int f61464o;
    public x f61465p;
    public int f61466q;
    public int f61467r;
    public int f61468s;
    public int f61469t;
    public boolean f61470u;
    public boolean v;
    public boolean f61471w;
    public long f61472x;
    public boolean f61473y;
    public boolean f61474z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f61452a = kVar;
        this.f61453b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61454c = z10;
        g0 g0Var = i0.f14032b;
        this.f61460k = t1.f14100e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f61461l = i10;
        this.f61458i = new o();
        this.f61459j = new ArrayList();
        this.f61457g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15999a);
        this.f61455e = new x(6);
        this.f61456f = new x();
        this.f61466q = -1;
        this.B = f3.q.f11224q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        t1 t1Var;
        if ((this.f61453b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14032b;
            t1Var = t1.f14100e;
        }
        this.f61460k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f61453b & 16) == 0) {
            qVar = new ab.q(qVar, this.f61452a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f61464o = 0;
        this.f61466q = -1;
        this.f61467r = 0;
        this.f61468s = 0;
        this.f61469t = 0;
        this.f61470u = false;
        this.f61474z = false;
        if (j3 == 0) {
            if (this.f61461l != 3) {
                this.f61461l = 0;
                this.f61464o = 0;
                return;
            }
            o oVar = this.f61458i;
            oVar.f61479a.clear();
            oVar.f61480b = 0;
            this.f61459j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f61448b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f61450e = a10;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f11199b = false;
                j0Var.f11200c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f61460k;
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

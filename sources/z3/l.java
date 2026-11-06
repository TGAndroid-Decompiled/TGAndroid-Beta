package z3;

import f3.k0;
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
    public final c4.k f59539a;
    public final int f59540b;
    public final boolean f59541c;
    public final x d;
    public final x f59542e;
    public final x f59543f;
    public final x f59544g;
    public final ArrayDeque h;
    public final o f59545i;
    public final ArrayList f59546j;
    public t1 f59547k;
    public int f59548l;
    public int f59549m;
    public long f59550n;
    public int f59551o;
    public x f59552p;
    public int f59553q;
    public int f59554r;
    public int f59555s;
    public int f59556t;
    public boolean f59557u;
    public boolean v;
    public boolean f59558w;
    public long f59559x;
    public boolean f59560y;
    public boolean f59561z;

    public l(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59539a = kVar;
        this.f59540b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59541c = z9;
        g0 g0Var = i0.f14329b;
        this.f59547k = t1.f14397e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59548l = i10;
        this.f59545i = new o();
        this.f59546j = new ArrayList();
        this.f59544g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15202a);
        this.f59542e = new x(6);
        this.f59543f = new x();
        this.f59553q = -1;
        this.B = f3.q.f11069q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59540b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3.g0 m10 = p.m(pVar, false, z9);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14329b;
            t1Var = t1.f14397e;
        }
        this.f59547k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59540b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59539a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f59551o = 0;
        this.f59553q = -1;
        this.f59554r = 0;
        this.f59555s = 0;
        this.f59556t = 0;
        this.f59557u = false;
        this.f59561z = false;
        if (j3 == 0) {
            if (this.f59548l != 3) {
                this.f59548l = 0;
                this.f59551o = 0;
                return;
            }
            o oVar = this.f59545i;
            oVar.f59566a.clear();
            oVar.f59567b = 0;
            this.f59546j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f59535b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f59537e = a10;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f11050b = false;
                k0Var.f11051c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59547k;
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

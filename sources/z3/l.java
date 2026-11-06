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
    public final c4.k f59540a;
    public final int f59541b;
    public final boolean f59542c;
    public final x d;
    public final x f59543e;
    public final x f59544f;
    public final x f59545g;
    public final ArrayDeque h;
    public final o f59546i;
    public final ArrayList f59547j;
    public t1 f59548k;
    public int f59549l;
    public int f59550m;
    public long f59551n;
    public int f59552o;
    public x f59553p;
    public int f59554q;
    public int f59555r;
    public int f59556s;
    public int f59557t;
    public boolean f59558u;
    public boolean v;
    public boolean f59559w;
    public long f59560x;
    public boolean f59561y;
    public boolean f59562z;

    public l(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59540a = kVar;
        this.f59541b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59542c = z9;
        g0 g0Var = i0.f14329b;
        this.f59548k = t1.f14397e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59549l = i10;
        this.f59546i = new o();
        this.f59547j = new ArrayList();
        this.f59545g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15202a);
        this.f59543e = new x(6);
        this.f59544f = new x();
        this.f59554q = -1;
        this.B = f3.q.f11069q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59541b & 2) != 0) {
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
        this.f59548k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59541b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59540a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f59552o = 0;
        this.f59554q = -1;
        this.f59555r = 0;
        this.f59556s = 0;
        this.f59557t = 0;
        this.f59558u = false;
        this.f59562z = false;
        if (j3 == 0) {
            if (this.f59549l != 3) {
                this.f59549l = 0;
                this.f59552o = 0;
                return;
            }
            o oVar = this.f59546i;
            oVar.f59567a.clear();
            oVar.f59568b = 0;
            this.f59547j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f59536b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f59538e = a10;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f11050b = false;
                k0Var.f11051c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59548k;
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

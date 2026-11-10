package z3;

import f3.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class m implements f3.o {
    public long A;
    public f3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public o3.b F;
    public final c4.k f59646a;
    public final int f59647b;
    public final boolean f59648c;
    public final x d;
    public final x f59649e;
    public final x f59650f;
    public final x f59651g;
    public final ArrayDeque h;
    public final p f59652i;
    public final ArrayList f59653j;
    public t1 f59654k;
    public int f59655l;
    public int f59656m;
    public long f59657n;
    public int f59658o;
    public x f59659p;
    public int f59660q;
    public int f59661r;
    public int f59662s;
    public int f59663t;
    public boolean f59664u;
    public boolean v;
    public boolean f59665w;
    public long f59666x;
    public boolean f59667y;
    public boolean f59668z;

    public m(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59646a = kVar;
        this.f59647b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59648c = z9;
        g0 g0Var = i0.f14331b;
        this.f59654k = t1.f14399e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59655l = i10;
        this.f59652i = new p();
        this.f59653j = new ArrayList();
        this.f59651g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15207a);
        this.f59649e = new x(6);
        this.f59650f = new x();
        this.f59660q = -1;
        this.B = f3.q.f11074q;
        this.C = new l[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59647b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3.g0 m10 = q.m(pVar, false, z9);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14331b;
            t1Var = t1.f14399e;
        }
        this.f59654k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59647b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59646a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        l[] lVarArr;
        this.h.clear();
        this.f59658o = 0;
        this.f59660q = -1;
        this.f59661r = 0;
        this.f59662s = 0;
        this.f59663t = 0;
        this.f59664u = false;
        this.f59668z = false;
        if (j3 == 0) {
            if (this.f59655l != 3) {
                this.f59655l = 0;
                this.f59658o = 0;
                return;
            }
            p pVar = this.f59652i;
            pVar.f59673a.clear();
            pVar.f59674b = 0;
            this.f59653j.clear();
            return;
        }
        for (l lVar : this.C) {
            u uVar = lVar.f59642b;
            int a10 = uVar.a(j10);
            if (a10 == -1) {
                a10 = uVar.b(j10);
            }
            lVar.f59644e = a10;
            k0 k0Var = lVar.d;
            if (k0Var != null) {
                k0Var.f11055b = false;
                k0Var.f11056c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59654k;
    }

    @Override
    public final int f(f3.p r43, f3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.f(f3.p, f3.s):int");
    }

    public final void g(long r47) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.g(long):void");
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}

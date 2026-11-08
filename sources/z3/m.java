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
    public final c4.k f59638a;
    public final int f59639b;
    public final boolean f59640c;
    public final x d;
    public final x f59641e;
    public final x f59642f;
    public final x f59643g;
    public final ArrayDeque h;
    public final p f59644i;
    public final ArrayList f59645j;
    public t1 f59646k;
    public int f59647l;
    public int f59648m;
    public long f59649n;
    public int f59650o;
    public x f59651p;
    public int f59652q;
    public int f59653r;
    public int f59654s;
    public int f59655t;
    public boolean f59656u;
    public boolean v;
    public boolean f59657w;
    public long f59658x;
    public boolean f59659y;
    public boolean f59660z;

    public m(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59638a = kVar;
        this.f59639b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59640c = z9;
        g0 g0Var = i0.f14329b;
        this.f59646k = t1.f14397e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59647l = i10;
        this.f59644i = new p();
        this.f59645j = new ArrayList();
        this.f59643g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15205a);
        this.f59641e = new x(6);
        this.f59642f = new x();
        this.f59652q = -1;
        this.B = f3.q.f11069q;
        this.C = new l[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59639b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3.g0 m10 = q.m(pVar, false, z9);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14329b;
            t1Var = t1.f14397e;
        }
        this.f59646k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59639b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59638a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        l[] lVarArr;
        this.h.clear();
        this.f59650o = 0;
        this.f59652q = -1;
        this.f59653r = 0;
        this.f59654s = 0;
        this.f59655t = 0;
        this.f59656u = false;
        this.f59660z = false;
        if (j3 == 0) {
            if (this.f59647l != 3) {
                this.f59647l = 0;
                this.f59650o = 0;
                return;
            }
            p pVar = this.f59644i;
            pVar.f59665a.clear();
            pVar.f59666b = 0;
            this.f59645j.clear();
            return;
        }
        for (l lVar : this.C) {
            u uVar = lVar.f59634b;
            int a10 = uVar.a(j10);
            if (a10 == -1) {
                a10 = uVar.b(j10);
            }
            lVar.f59636e = a10;
            k0 k0Var = lVar.d;
            if (k0Var != null) {
                k0Var.f11050b = false;
                k0Var.f11051c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59646k;
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

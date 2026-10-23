package w3;

import c3.g0;
import c3.k0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class l implements c3.o {
    public long A;
    public c3.q B;
    public k[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.k f48529a;
    public final int f48530b;
    public final boolean f48531c;
    public final x d;
    public final x e;
    public final x f48532f;
    public final x f48533g;
    public final ArrayDeque h;
    public final o f48534i;
    public final ArrayList f48535j;
    public x1 f48536k;
    public int f48537l;
    public int f48538m;
    public long f48539n;
    public int f48540o;
    public x f48541p;
    public int f48542q;
    public int f48543r;
    public int f48544s;
    public int f48545t;
    public boolean f48546u;
    public boolean v;
    public boolean f48547w;
    public long f48548x;
    public boolean f48549y;
    public boolean f48550z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48529a = kVar;
        this.f48530b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48531c = z10;
        l0 l0Var = n0.f8474b;
        this.f48536k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48537l = i11;
        this.f48534i = new o();
        this.f48535j = new ArrayList();
        this.f48533g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10335a);
        this.e = new x(6);
        this.f48532f = new x();
        this.f48542q = -1;
        this.B = c3.q.f4654i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48530b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8474b;
            x1Var = x1.e;
        }
        this.f48536k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f48530b & 16) == 0) {
            qVar = new c2.b(qVar, this.f48529a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48540o = 0;
        this.f48542q = -1;
        this.f48543r = 0;
        this.f48544s = 0;
        this.f48545t = 0;
        this.f48546u = false;
        this.f48550z = false;
        if (j10 == 0) {
            if (this.f48537l != 3) {
                this.f48537l = 0;
                this.f48540o = 0;
                return;
            }
            o oVar = this.f48534i;
            oVar.f48554a.clear();
            oVar.f48555b = 0;
            this.f48535j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48526b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f4638b = false;
                k0Var.f4639c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f48536k;
    }

    @Override
    public final int f(c3.p r43, c3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.f(c3.p, c3.s):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.g(long):void");
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}

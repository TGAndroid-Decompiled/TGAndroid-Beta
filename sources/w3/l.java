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
    public final z3.k f48540a;
    public final int f48541b;
    public final boolean f48542c;
    public final x d;
    public final x e;
    public final x f48543f;
    public final x f48544g;
    public final ArrayDeque h;
    public final o f48545i;
    public final ArrayList f48546j;
    public x1 f48547k;
    public int f48548l;
    public int f48549m;
    public long f48550n;
    public int f48551o;
    public x f48552p;
    public int f48553q;
    public int f48554r;
    public int f48555s;
    public int f48556t;
    public boolean f48557u;
    public boolean v;
    public boolean f48558w;
    public long f48559x;
    public boolean f48560y;
    public boolean f48561z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48540a = kVar;
        this.f48541b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48542c = z10;
        l0 l0Var = n0.f8476b;
        this.f48547k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48548l = i11;
        this.f48545i = new o();
        this.f48546j = new ArrayList();
        this.f48544g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10336a);
        this.e = new x(6);
        this.f48543f = new x();
        this.f48553q = -1;
        this.B = c3.q.f4657i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48541b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8476b;
            x1Var = x1.e;
        }
        this.f48547k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f48541b & 16) == 0) {
            qVar = new c2.b(qVar, this.f48540a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48551o = 0;
        this.f48553q = -1;
        this.f48554r = 0;
        this.f48555s = 0;
        this.f48556t = 0;
        this.f48557u = false;
        this.f48561z = false;
        if (j10 == 0) {
            if (this.f48548l != 3) {
                this.f48548l = 0;
                this.f48551o = 0;
                return;
            }
            o oVar = this.f48545i;
            oVar.f48565a.clear();
            oVar.f48566b = 0;
            this.f48546j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48537b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f4641b = false;
                k0Var.f4642c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f48547k;
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

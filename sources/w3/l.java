package w3;

import c3.f0;
import c3.k0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
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
    public final z3.k f50771a;
    public final int f50772b;
    public final boolean f50773c;
    public final x d;
    public final x e;
    public final x f50774f;
    public final x f50775g;
    public final ArrayDeque h;
    public final o f50776i;
    public final ArrayList f50777j;
    public s1 f50778k;
    public int f50779l;
    public int f50780m;
    public long f50781n;
    public int f50782o;
    public x f50783p;
    public int f50784q;
    public int f50785r;
    public int f50786s;
    public int f50787t;
    public boolean f50788u;
    public boolean v;
    public boolean f50789w;
    public long f50790x;
    public boolean f50791y;
    public boolean f50792z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f50771a = kVar;
        this.f50772b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50773c = z10;
        g0 g0Var = i0.f10286b;
        this.f50778k = s1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f50779l = i11;
        this.f50776i = new o();
        this.f50777j = new ArrayList();
        this.f50775g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10110a);
        this.e = new x(6);
        this.f50774f = new x();
        this.f50784q = -1;
        this.B = c3.q.f6091i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        s1 s1Var;
        if ((this.f50772b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            s1Var = i0.y(m10);
        } else {
            g0 g0Var = i0.f10286b;
            s1Var = s1.e;
        }
        this.f50778k = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f50772b & 16) == 0) {
            qVar = new c2.b(qVar, this.f50771a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f50782o = 0;
        this.f50784q = -1;
        this.f50785r = 0;
        this.f50786s = 0;
        this.f50787t = 0;
        this.f50788u = false;
        this.f50792z = false;
        if (j10 == 0) {
            if (this.f50779l != 3) {
                this.f50779l = 0;
                this.f50782o = 0;
                return;
            }
            o oVar = this.f50776i;
            oVar.f50796a.clear();
            oVar.f50797b = 0;
            this.f50777j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f50768b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f6074b = false;
                k0Var.f6075c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f50778k;
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

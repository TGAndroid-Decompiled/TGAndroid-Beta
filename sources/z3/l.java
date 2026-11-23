package z3;

import f3.k0;
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
    public final c4.k f61540a;
    public final int f61541b;
    public final boolean f61542c;
    public final x d;
    public final x f61543e;
    public final x f61544f;
    public final x f61545g;
    public final ArrayDeque h;
    public final o f61546i;
    public final ArrayList f61547j;
    public s1 f61548k;
    public int f61549l;
    public int f61550m;
    public long f61551n;
    public int f61552o;
    public x f61553p;
    public int f61554q;
    public int f61555r;
    public int f61556s;
    public int f61557t;
    public boolean f61558u;
    public boolean v;
    public boolean f61559w;
    public long f61560x;
    public boolean f61561y;
    public boolean f61562z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f61540a = kVar;
        this.f61541b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61542c = z10;
        g0 g0Var = i0.f13995b;
        this.f61548k = s1.f14058e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f61549l = i10;
        this.f61546i = new o();
        this.f61547j = new ArrayList();
        this.f61545g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f16063a);
        this.f61543e = new x(6);
        this.f61544f = new x();
        this.f61554q = -1;
        this.B = f3.q.f11194q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        s1 s1Var;
        if ((this.f61541b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3.g0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            s1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f13995b;
            s1Var = s1.f14058e;
        }
        this.f61548k = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f61541b & 16) == 0) {
            qVar = new ab.q(qVar, this.f61540a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f61552o = 0;
        this.f61554q = -1;
        this.f61555r = 0;
        this.f61556s = 0;
        this.f61557t = 0;
        this.f61558u = false;
        this.f61562z = false;
        if (j3 == 0) {
            if (this.f61549l != 3) {
                this.f61549l = 0;
                this.f61552o = 0;
                return;
            }
            o oVar = this.f61546i;
            oVar.f61567a.clear();
            oVar.f61568b = 0;
            this.f61547j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f61536b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f61538e = a10;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f11175b = false;
                k0Var.f11176c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f61548k;
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

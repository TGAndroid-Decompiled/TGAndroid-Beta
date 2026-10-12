package w3;

import c3.f0;
import c3.j0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class m implements c3.o {
    public long A;
    public c3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.l f47134a;
    public final int f47135b;
    public final boolean f47136c;
    public final x d;
    public final x e;
    public final x f47137f;
    public final x f47138g;
    public final ArrayDeque h;
    public final p f47139i;
    public final ArrayList f47140j;
    public x1 f47141k;
    public int f47142l;
    public int f47143m;
    public long f47144n;
    public int f47145o;
    public x f47146p;
    public int f47147q;
    public int f47148r;
    public int f47149s;
    public int f47150t;
    public boolean f47151u;
    public boolean v;
    public boolean f47152w;
    public long f47153x;
    public boolean f47154y;
    public boolean f47155z;

    public m(z3.l lVar, int i10) {
        boolean z10;
        int i11;
        this.f47134a = lVar;
        this.f47135b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47136c = z10;
        l0 l0Var = n0.f8592b;
        this.f47141k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f47142l = i11;
        this.f47139i = new p();
        this.f47140j = new ArrayList();
        this.f47138g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.p.f8889a);
        this.e = new x(6);
        this.f47137f = new x();
        this.f47147q = -1;
        this.B = c3.q.f4278i;
        this.C = new l[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f47135b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = q.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8592b;
            x1Var = x1.e;
        }
        this.f47141k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f47135b & 16) == 0) {
            qVar = new c2.b(qVar, this.f47134a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        l[] lVarArr;
        this.h.clear();
        this.f47145o = 0;
        this.f47147q = -1;
        this.f47148r = 0;
        this.f47149s = 0;
        this.f47150t = 0;
        this.f47151u = false;
        this.f47155z = false;
        if (j10 == 0) {
            if (this.f47142l != 3) {
                this.f47142l = 0;
                this.f47145o = 0;
                return;
            }
            p pVar = this.f47139i;
            pVar.f47159a.clear();
            pVar.f47160b = 0;
            this.f47140j.clear();
            return;
        }
        for (l lVar : this.C) {
            u uVar = lVar.f47131b;
            int a2 = uVar.a(j11);
            if (a2 == -1) {
                a2 = uVar.b(j11);
            }
            lVar.e = a2;
            j0 j0Var = lVar.d;
            if (j0Var != null) {
                j0Var.f4257b = false;
                j0Var.f4258c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f47141k;
    }

    @Override
    public final int f(c3.p r43, c3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.f(c3.p, c3.s):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.g(long):void");
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}

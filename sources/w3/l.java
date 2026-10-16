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
public final class l implements c3.o {
    public long A;
    public c3.q B;
    public k[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.l f47133a;
    public final int f47134b;
    public final boolean f47135c;
    public final x d;
    public final x e;
    public final x f47136f;
    public final x f47137g;
    public final ArrayDeque h;
    public final o f47138i;
    public final ArrayList f47139j;
    public x1 f47140k;
    public int f47141l;
    public int f47142m;
    public long f47143n;
    public int f47144o;
    public x f47145p;
    public int f47146q;
    public int f47147r;
    public int f47148s;
    public int f47149t;
    public boolean f47150u;
    public boolean v;
    public boolean f47151w;
    public long f47152x;
    public boolean f47153y;
    public boolean f47154z;

    public l(z3.l lVar, int i10) {
        boolean z10;
        int i11;
        this.f47133a = lVar;
        this.f47134b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47135c = z10;
        l0 l0Var = n0.f8595b;
        this.f47140k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f47141l = i11;
        this.f47138i = new o();
        this.f47139j = new ArrayList();
        this.f47137g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.p.f8892a);
        this.e = new x(6);
        this.f47136f = new x();
        this.f47146q = -1;
        this.B = c3.q.f4282i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f47134b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8595b;
            x1Var = x1.e;
        }
        this.f47140k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f47134b & 16) == 0) {
            qVar = new c2.b(qVar, this.f47133a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f47144o = 0;
        this.f47146q = -1;
        this.f47147r = 0;
        this.f47148s = 0;
        this.f47149t = 0;
        this.f47150u = false;
        this.f47154z = false;
        if (j10 == 0) {
            if (this.f47141l != 3) {
                this.f47141l = 0;
                this.f47144o = 0;
                return;
            }
            o oVar = this.f47138i;
            oVar.f47158a.clear();
            oVar.f47159b = 0;
            this.f47139j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f47130b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f4261b = false;
                j0Var.f4262c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f47140k;
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

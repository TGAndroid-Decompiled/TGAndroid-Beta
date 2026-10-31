package w3;

import c3.f0;
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
    public final z3.k f52392a;
    public final int f52393b;
    public final boolean f52394c;
    public final x d;
    public final x e;
    public final x f52395f;
    public final x f52396g;
    public final ArrayDeque h;
    public final o f52397i;
    public final ArrayList f52398j;
    public x1 f52399k;
    public int f52400l;
    public int f52401m;
    public long f52402n;
    public int f52403o;
    public x f52404p;
    public int f52405q;
    public int f52406r;
    public int f52407s;
    public int f52408t;
    public boolean f52409u;
    public boolean v;
    public boolean f52410w;
    public long f52411x;
    public boolean f52412y;
    public boolean f52413z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f52392a = kVar;
        this.f52393b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52394c = z10;
        l0 l0Var = n0.f6390b;
        this.f52399k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f52400l = i11;
        this.f52397i = new o();
        this.f52398j = new ArrayList();
        this.f52396g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f6783a);
        this.e = new x(6);
        this.f52395f = new x();
        this.f52405q = -1;
        this.B = c3.q.f3686i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f52393b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f6390b;
            x1Var = x1.e;
        }
        this.f52399k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f52393b & 16) == 0) {
            qVar = new ac.a(qVar, this.f52392a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f52403o = 0;
        this.f52405q = -1;
        this.f52406r = 0;
        this.f52407s = 0;
        this.f52408t = 0;
        this.f52409u = false;
        this.f52413z = false;
        if (j10 == 0) {
            if (this.f52400l != 3) {
                this.f52400l = 0;
                this.f52403o = 0;
                return;
            }
            o oVar = this.f52397i;
            oVar.f52417a.clear();
            oVar.f52418b = 0;
            this.f52398j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f52389b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            c3.l0 l0Var = kVar.d;
            if (l0Var != null) {
                l0Var.f3674b = false;
                l0Var.f3675c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f52399k;
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

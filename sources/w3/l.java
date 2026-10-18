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
    public final z3.k f48565a;
    public final int f48566b;
    public final boolean f48567c;
    public final x d;
    public final x e;
    public final x f48568f;
    public final x f48569g;
    public final ArrayDeque h;
    public final o f48570i;
    public final ArrayList f48571j;
    public x1 f48572k;
    public int f48573l;
    public int f48574m;
    public long f48575n;
    public int f48576o;
    public x f48577p;
    public int f48578q;
    public int f48579r;
    public int f48580s;
    public int f48581t;
    public boolean f48582u;
    public boolean v;
    public boolean f48583w;
    public long f48584x;
    public boolean f48585y;
    public boolean f48586z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48565a = kVar;
        this.f48566b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48567c = z10;
        l0 l0Var = n0.f8477b;
        this.f48572k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48573l = i11;
        this.f48570i = new o();
        this.f48571j = new ArrayList();
        this.f48569g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10338a);
        this.e = new x(6);
        this.f48568f = new x();
        this.f48578q = -1;
        this.B = c3.q.f4658i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48566b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8477b;
            x1Var = x1.e;
        }
        this.f48572k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f48566b & 16) == 0) {
            qVar = new c2.b(qVar, this.f48565a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48576o = 0;
        this.f48578q = -1;
        this.f48579r = 0;
        this.f48580s = 0;
        this.f48581t = 0;
        this.f48582u = false;
        this.f48586z = false;
        if (j10 == 0) {
            if (this.f48573l != 3) {
                this.f48573l = 0;
                this.f48576o = 0;
                return;
            }
            o oVar = this.f48570i;
            oVar.f48590a.clear();
            oVar.f48591b = 0;
            this.f48571j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48562b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f4642b = false;
                k0Var.f4643c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f48572k;
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

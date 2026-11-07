package z3;

import f3.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
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
    public final c4.k f59545a;
    public final int f59546b;
    public final boolean f59547c;
    public final x d;
    public final x f59548e;
    public final x f59549f;
    public final x f59550g;
    public final ArrayDeque h;
    public final o f59551i;
    public final ArrayList f59552j;
    public t1 f59553k;
    public int f59554l;
    public int f59555m;
    public long f59556n;
    public int f59557o;
    public x f59558p;
    public int f59559q;
    public int f59560r;
    public int f59561s;
    public int f59562t;
    public boolean f59563u;
    public boolean v;
    public boolean f59564w;
    public long f59565x;
    public boolean f59566y;
    public boolean f59567z;

    public l(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59545a = kVar;
        this.f59546b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59547c = z9;
        g0 g0Var = i0.f14329b;
        this.f59553k = t1.f14397e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59554l = i10;
        this.f59551i = new o();
        this.f59552j = new ArrayList();
        this.f59550g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15202a);
        this.f59548e = new x(6);
        this.f59549f = new x();
        this.f59559q = -1;
        this.B = f3.q.f11069q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59546b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3.g0 m10 = p.m(pVar, false, z9);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14329b;
            t1Var = t1.f14397e;
        }
        this.f59553k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59546b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59545a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f59557o = 0;
        this.f59559q = -1;
        this.f59560r = 0;
        this.f59561s = 0;
        this.f59562t = 0;
        this.f59563u = false;
        this.f59567z = false;
        if (j3 == 0) {
            if (this.f59554l != 3) {
                this.f59554l = 0;
                this.f59557o = 0;
                return;
            }
            o oVar = this.f59551i;
            oVar.f59572a.clear();
            oVar.f59573b = 0;
            this.f59552j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f59541b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f59543e = a10;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f11050b = false;
                k0Var.f11051c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59553k;
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

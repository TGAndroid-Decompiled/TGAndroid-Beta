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
    public final z3.k f48520a;
    public final int f48521b;
    public final boolean f48522c;
    public final x d;
    public final x e;
    public final x f48523f;
    public final x f48524g;
    public final ArrayDeque h;
    public final o f48525i;
    public final ArrayList f48526j;
    public x1 f48527k;
    public int f48528l;
    public int f48529m;
    public long f48530n;
    public int f48531o;
    public x f48532p;
    public int f48533q;
    public int f48534r;
    public int f48535s;
    public int f48536t;
    public boolean f48537u;
    public boolean v;
    public boolean f48538w;
    public long f48539x;
    public boolean f48540y;
    public boolean f48541z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48520a = kVar;
        this.f48521b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48522c = z10;
        l0 l0Var = n0.f8474b;
        this.f48527k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48528l = i11;
        this.f48525i = new o();
        this.f48526j = new ArrayList();
        this.f48524g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10335a);
        this.e = new x(6);
        this.f48523f = new x();
        this.f48533q = -1;
        this.B = c3.q.f4654i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48521b & 2) != 0) {
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
        this.f48527k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f48521b & 16) == 0) {
            qVar = new c2.b(qVar, this.f48520a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48531o = 0;
        this.f48533q = -1;
        this.f48534r = 0;
        this.f48535s = 0;
        this.f48536t = 0;
        this.f48537u = false;
        this.f48541z = false;
        if (j10 == 0) {
            if (this.f48528l != 3) {
                this.f48528l = 0;
                this.f48531o = 0;
                return;
            }
            o oVar = this.f48525i;
            oVar.f48545a.clear();
            oVar.f48546b = 0;
            this.f48526j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48517b;
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
        return this.f48527k;
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

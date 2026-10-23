package w3;

import c3.i0;
import c3.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class l implements c3.q {
    public long A;
    public c3.s B;
    public k[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.k f48967a;
    public final int f48968b;
    public final boolean f48969c;
    public final x d;
    public final x e;
    public final x f48970f;
    public final x f48971g;
    public final ArrayDeque h;
    public final o f48972i;
    public final ArrayList f48973j;
    public x1 f48974k;
    public int f48975l;
    public int f48976m;
    public long f48977n;
    public int f48978o;
    public x f48979p;
    public int f48980q;
    public int f48981r;
    public int f48982s;
    public int f48983t;
    public boolean f48984u;
    public boolean v;
    public boolean f48985w;
    public long f48986x;
    public boolean f48987y;
    public boolean f48988z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48967a = kVar;
        this.f48968b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48969c = z10;
        l0 l0Var = n0.f8481b;
        this.f48974k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48975l = i11;
        this.f48972i = new o();
        this.f48973j = new ArrayList();
        this.f48971g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10352a);
        this.e = new x(6);
        this.f48970f = new x();
        this.f48980q = -1;
        this.B = c3.s.f4663i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.r rVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48968b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0 m10 = p.m(rVar, false, z10);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8481b;
            x1Var = x1.e;
        }
        this.f48974k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        if ((this.f48968b & 16) == 0) {
            sVar = new c2.b(sVar, this.f48967a);
        }
        this.B = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48978o = 0;
        this.f48980q = -1;
        this.f48981r = 0;
        this.f48982s = 0;
        this.f48983t = 0;
        this.f48984u = false;
        this.f48988z = false;
        if (j10 == 0) {
            if (this.f48975l != 3) {
                this.f48975l = 0;
                this.f48978o = 0;
                return;
            }
            o oVar = this.f48972i;
            oVar.f48992a.clear();
            oVar.f48993b = 0;
            this.f48973j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48964b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            m0 m0Var = kVar.d;
            if (m0Var != null) {
                m0Var.f4651b = false;
                m0Var.f4652c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f48974k;
    }

    @Override
    public final int f(c3.r r43, c3.u r44) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.f(c3.r, c3.u):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.g(long):void");
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}

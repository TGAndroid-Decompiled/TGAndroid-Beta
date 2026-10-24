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
    public final z3.k f48966a;
    public final int f48967b;
    public final boolean f48968c;
    public final x d;
    public final x e;
    public final x f48969f;
    public final x f48970g;
    public final ArrayDeque h;
    public final o f48971i;
    public final ArrayList f48972j;
    public x1 f48973k;
    public int f48974l;
    public int f48975m;
    public long f48976n;
    public int f48977o;
    public x f48978p;
    public int f48979q;
    public int f48980r;
    public int f48981s;
    public int f48982t;
    public boolean f48983u;
    public boolean v;
    public boolean f48984w;
    public long f48985x;
    public boolean f48986y;
    public boolean f48987z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f48966a = kVar;
        this.f48967b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48968c = z10;
        l0 l0Var = n0.f8481b;
        this.f48973k = x1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48974l = i11;
        this.f48971i = new o();
        this.f48972j = new ArrayList();
        this.f48970g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10352a);
        this.e = new x(6);
        this.f48969f = new x();
        this.f48979q = -1;
        this.B = c3.s.f4663i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.r rVar) {
        boolean z10;
        x1 x1Var;
        if ((this.f48967b & 2) != 0) {
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
        this.f48973k = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        if ((this.f48967b & 16) == 0) {
            sVar = new c2.b(sVar, this.f48966a);
        }
        this.B = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f48977o = 0;
        this.f48979q = -1;
        this.f48980r = 0;
        this.f48981s = 0;
        this.f48982t = 0;
        this.f48983u = false;
        this.f48987z = false;
        if (j10 == 0) {
            if (this.f48974l != 3) {
                this.f48974l = 0;
                this.f48977o = 0;
                return;
            }
            o oVar = this.f48971i;
            oVar.f48991a.clear();
            oVar.f48992b = 0;
            this.f48972j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f48963b;
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
        return this.f48973k;
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

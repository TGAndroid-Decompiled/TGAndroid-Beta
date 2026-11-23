package z3;

import f3.f0;
import f3.j0;
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
    public final c4.k f61456a;
    public final int f61457b;
    public final boolean f61458c;
    public final x d;
    public final x f61459e;
    public final x f61460f;
    public final x f61461g;
    public final ArrayDeque h;
    public final o f61462i;
    public final ArrayList f61463j;
    public t1 f61464k;
    public int f61465l;
    public int f61466m;
    public long f61467n;
    public int f61468o;
    public x f61469p;
    public int f61470q;
    public int f61471r;
    public int f61472s;
    public int f61473t;
    public boolean f61474u;
    public boolean v;
    public boolean f61475w;
    public long f61476x;
    public boolean f61477y;
    public boolean f61478z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f61456a = kVar;
        this.f61457b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61458c = z10;
        g0 g0Var = i0.f14035b;
        this.f61464k = t1.f14103e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f61465l = i10;
        this.f61462i = new o();
        this.f61463j = new ArrayList();
        this.f61461g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f16002a);
        this.f61459e = new x(6);
        this.f61460f = new x();
        this.f61470q = -1;
        this.B = f3.q.f11227q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        t1 t1Var;
        if ((this.f61457b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14035b;
            t1Var = t1.f14103e;
        }
        this.f61464k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f61457b & 16) == 0) {
            qVar = new ab.q(qVar, this.f61456a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f61468o = 0;
        this.f61470q = -1;
        this.f61471r = 0;
        this.f61472s = 0;
        this.f61473t = 0;
        this.f61474u = false;
        this.f61478z = false;
        if (j3 == 0) {
            if (this.f61465l != 3) {
                this.f61465l = 0;
                this.f61468o = 0;
                return;
            }
            o oVar = this.f61462i;
            oVar.f61483a.clear();
            oVar.f61484b = 0;
            this.f61463j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f61452b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f61454e = a10;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f11202b = false;
                j0Var.f11203c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f61464k;
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

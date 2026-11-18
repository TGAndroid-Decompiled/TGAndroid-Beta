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
    public final c4.k f61411a;
    public final int f61412b;
    public final boolean f61413c;
    public final x d;
    public final x f61414e;
    public final x f61415f;
    public final x f61416g;
    public final ArrayDeque h;
    public final o f61417i;
    public final ArrayList f61418j;
    public t1 f61419k;
    public int f61420l;
    public int f61421m;
    public long f61422n;
    public int f61423o;
    public x f61424p;
    public int f61425q;
    public int f61426r;
    public int f61427s;
    public int f61428t;
    public boolean f61429u;
    public boolean v;
    public boolean f61430w;
    public long f61431x;
    public boolean f61432y;
    public boolean f61433z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f61411a = kVar;
        this.f61412b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61413c = z10;
        g0 g0Var = i0.f14003b;
        this.f61419k = t1.f14071e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f61420l = i10;
        this.f61417i = new o();
        this.f61418j = new ArrayList();
        this.f61416g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15974a);
        this.f61414e = new x(6);
        this.f61415f = new x();
        this.f61425q = -1;
        this.B = f3.q.f11195q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        t1 t1Var;
        if ((this.f61412b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14003b;
            t1Var = t1.f14071e;
        }
        this.f61419k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f61412b & 16) == 0) {
            qVar = new ab.q(qVar, this.f61411a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f61423o = 0;
        this.f61425q = -1;
        this.f61426r = 0;
        this.f61427s = 0;
        this.f61428t = 0;
        this.f61429u = false;
        this.f61433z = false;
        if (j3 == 0) {
            if (this.f61420l != 3) {
                this.f61420l = 0;
                this.f61423o = 0;
                return;
            }
            o oVar = this.f61417i;
            oVar.f61438a.clear();
            oVar.f61439b = 0;
            this.f61418j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f61407b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f61409e = a10;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f11170b = false;
                j0Var.f11171c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f61419k;
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

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
    public final c4.k f61421a;
    public final int f61422b;
    public final boolean f61423c;
    public final x d;
    public final x f61424e;
    public final x f61425f;
    public final x f61426g;
    public final ArrayDeque h;
    public final o f61427i;
    public final ArrayList f61428j;
    public t1 f61429k;
    public int f61430l;
    public int f61431m;
    public long f61432n;
    public int f61433o;
    public x f61434p;
    public int f61435q;
    public int f61436r;
    public int f61437s;
    public int f61438t;
    public boolean f61439u;
    public boolean v;
    public boolean f61440w;
    public long f61441x;
    public boolean f61442y;
    public boolean f61443z;

    public l(c4.k kVar, int i7) {
        boolean z10;
        int i10;
        this.f61421a = kVar;
        this.f61422b = i7;
        if ((i7 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f61423c = z10;
        g0 g0Var = i0.f13998b;
        this.f61429k = t1.f14066e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f61430l = i10;
        this.f61427i = new o();
        this.f61428j = new ArrayList();
        this.f61426g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15968a);
        this.f61424e = new x(6);
        this.f61425f = new x();
        this.f61435q = -1;
        this.B = f3.q.f11190q;
        this.C = new k[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z10;
        t1 t1Var;
        if ((this.f61422b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f13998b;
            t1Var = t1.f14066e;
        }
        this.f61429k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f61422b & 16) == 0) {
            qVar = new ab.q(qVar, this.f61421a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        k[] kVarArr;
        this.h.clear();
        this.f61433o = 0;
        this.f61435q = -1;
        this.f61436r = 0;
        this.f61437s = 0;
        this.f61438t = 0;
        this.f61439u = false;
        this.f61443z = false;
        if (j3 == 0) {
            if (this.f61430l != 3) {
                this.f61430l = 0;
                this.f61433o = 0;
                return;
            }
            o oVar = this.f61427i;
            oVar.f61448a.clear();
            oVar.f61449b = 0;
            this.f61428j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f61417b;
            int a10 = tVar.a(j10);
            if (a10 == -1) {
                a10 = tVar.b(j10);
            }
            kVar.f61419e = a10;
            j0 j0Var = kVar.d;
            if (j0Var != null) {
                j0Var.f11165b = false;
                j0Var.f11166c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f61429k;
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

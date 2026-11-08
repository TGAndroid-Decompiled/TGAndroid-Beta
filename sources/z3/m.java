package z3;

import f3.k0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class m implements f3.o {
    public long A;
    public f3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public o3.b F;
    public final c4.k f59639a;
    public final int f59640b;
    public final boolean f59641c;
    public final x d;
    public final x f59642e;
    public final x f59643f;
    public final x f59644g;
    public final ArrayDeque h;
    public final p f59645i;
    public final ArrayList f59646j;
    public t1 f59647k;
    public int f59648l;
    public int f59649m;
    public long f59650n;
    public int f59651o;
    public x f59652p;
    public int f59653q;
    public int f59654r;
    public int f59655s;
    public int f59656t;
    public boolean f59657u;
    public boolean v;
    public boolean f59658w;
    public long f59659x;
    public boolean f59660y;
    public boolean f59661z;

    public m(c4.k kVar, int i7) {
        boolean z9;
        int i10;
        this.f59639a = kVar;
        this.f59640b = i7;
        if ((i7 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59641c = z9;
        g0 g0Var = i0.f14329b;
        this.f59647k = t1.f14397e;
        if ((i7 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f59648l = i10;
        this.f59645i = new p();
        this.f59646j = new ArrayList();
        this.f59644g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(i2.o.f15205a);
        this.f59642e = new x(6);
        this.f59643f = new x();
        this.f59653q = -1;
        this.B = f3.q.f11069q;
        this.C = new l[0];
    }

    @Override
    public final boolean b(f3.p pVar) {
        boolean z9;
        t1 t1Var;
        if ((this.f59640b & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3.g0 m10 = q.m(pVar, false, z9);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14329b;
            t1Var = t1.f14397e;
        }
        this.f59647k = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        if ((this.f59640b & 16) == 0) {
            qVar = new ab.q(qVar, this.f59639a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        l[] lVarArr;
        this.h.clear();
        this.f59651o = 0;
        this.f59653q = -1;
        this.f59654r = 0;
        this.f59655s = 0;
        this.f59656t = 0;
        this.f59657u = false;
        this.f59661z = false;
        if (j3 == 0) {
            if (this.f59648l != 3) {
                this.f59648l = 0;
                this.f59651o = 0;
                return;
            }
            p pVar = this.f59645i;
            pVar.f59666a.clear();
            pVar.f59667b = 0;
            this.f59646j.clear();
            return;
        }
        for (l lVar : this.C) {
            u uVar = lVar.f59635b;
            int a10 = uVar.a(j10);
            if (a10 == -1) {
                a10 = uVar.b(j10);
            }
            lVar.f59637e = a10;
            k0 k0Var = lVar.d;
            if (k0Var != null) {
                k0Var.f11050b = false;
                k0Var.f11051c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f59647k;
    }

    @Override
    public final int f(f3.p r43, f3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.f(f3.p, f3.s):int");
    }

    public final void g(long r47) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.g(long):void");
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}

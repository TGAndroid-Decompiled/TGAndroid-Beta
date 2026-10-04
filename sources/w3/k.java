package w3;

import c3.b0;
import c3.f0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class k implements c3.o, b0 {
    public j[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public r3.a F;
    public final z3.l f48518a;
    public final int f48519b;
    public final v f48520c;
    public final v d;
    public final v f48521e;
    public final v f48522f;
    public final ArrayDeque f48523g;
    public final m h;
    public final ArrayList f48524i;
    public a1 f48525j;
    public int f48526k;
    public int f48527l;
    public long f48528m;
    public int f48529n;
    public v f48530o;
    public int f48531p;
    public int f48532q;
    public int f48533r;
    public int f48534s;
    public boolean f48535t;
    public boolean f48536u;
    public boolean v;
    public long f48537w;
    public boolean f48538x;
    public long f48539y;
    public c3.q f48540z;

    public k(z3.l lVar, int i10) {
        int i11;
        this.f48518a = lVar;
        this.f48519b = i10;
        g0 g0Var = i0.f8757b;
        this.f48525j = a1.f8720e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48526k = i11;
        this.h = new m();
        this.f48524i = new ArrayList();
        this.f48522f = new v(16);
        this.f48523g = new ArrayDeque();
        this.f48520c = new v(f2.o.f9605a);
        this.d = new v(6);
        this.f48521e = new v();
        this.f48531p = -1;
        this.f48540z = c3.q.f4099m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f48519b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8757b;
            a1Var = a1.f8720e;
        }
        this.f48525j = a1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(c3.q qVar) {
        if ((this.f48519b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f48518a);
        }
        this.f48540z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f48523g.clear();
        this.f48529n = 0;
        this.f48531p = -1;
        this.f48532q = 0;
        this.f48533r = 0;
        this.f48534s = 0;
        this.f48535t = false;
        if (j3 == 0) {
            if (this.f48526k != 3) {
                this.f48526k = 0;
                this.f48529n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f48544a.clear();
            mVar.f48545b = 0;
            this.f48524i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f48515b;
            int e7 = d0.e(rVar.f48581f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48582g[e7] & 1) != 0) {
                        break;
                    }
                    e7--;
                } else {
                    e7 = -1;
                    break;
                }
            }
            if (e7 == -1) {
                e7 = rVar.a(j10);
            }
            jVar.f48517e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4070b = false;
                i0Var.f4071c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f48525j;
    }

    @Override
    public final c3.a0 j(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: w3.k.j(long):c3.a0");
    }

    @Override
    public final long l() {
        return this.D;
    }

    @Override
    public final int m(c3.p r44, c3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: w3.k.m(c3.p, c3.s):int");
    }

    public final void n(long r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.k.n(long):void");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}

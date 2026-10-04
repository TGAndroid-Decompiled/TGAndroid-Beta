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
    public final z3.l f48519a;
    public final int f48520b;
    public final v f48521c;
    public final v d;
    public final v f48522e;
    public final v f48523f;
    public final ArrayDeque f48524g;
    public final m h;
    public final ArrayList f48525i;
    public a1 f48526j;
    public int f48527k;
    public int f48528l;
    public long f48529m;
    public int f48530n;
    public v f48531o;
    public int f48532p;
    public int f48533q;
    public int f48534r;
    public int f48535s;
    public boolean f48536t;
    public boolean f48537u;
    public boolean v;
    public long f48538w;
    public boolean f48539x;
    public long f48540y;
    public c3.q f48541z;

    public k(z3.l lVar, int i10) {
        int i11;
        this.f48519a = lVar;
        this.f48520b = i10;
        g0 g0Var = i0.f8757b;
        this.f48526j = a1.f8720e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48527k = i11;
        this.h = new m();
        this.f48525i = new ArrayList();
        this.f48523f = new v(16);
        this.f48524g = new ArrayDeque();
        this.f48521c = new v(f2.o.f9605a);
        this.d = new v(6);
        this.f48522e = new v();
        this.f48532p = -1;
        this.f48541z = c3.q.f4099m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f48520b & 2) != 0) {
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
        this.f48526j = a1Var;
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
        if ((this.f48520b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f48519a);
        }
        this.f48541z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f48524g.clear();
        this.f48530n = 0;
        this.f48532p = -1;
        this.f48533q = 0;
        this.f48534r = 0;
        this.f48535s = 0;
        this.f48536t = false;
        if (j3 == 0) {
            if (this.f48527k != 3) {
                this.f48527k = 0;
                this.f48530n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f48545a.clear();
            mVar.f48546b = 0;
            this.f48525i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f48516b;
            int e7 = d0.e(rVar.f48582f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48583g[e7] & 1) != 0) {
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
            jVar.f48518e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4070b = false;
                i0Var.f4071c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f48526j;
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

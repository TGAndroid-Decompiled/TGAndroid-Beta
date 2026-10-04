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
    public final z3.l f48527a;
    public final int f48528b;
    public final v f48529c;
    public final v d;
    public final v f48530e;
    public final v f48531f;
    public final ArrayDeque f48532g;
    public final m h;
    public final ArrayList f48533i;
    public a1 f48534j;
    public int f48535k;
    public int f48536l;
    public long f48537m;
    public int f48538n;
    public v f48539o;
    public int f48540p;
    public int f48541q;
    public int f48542r;
    public int f48543s;
    public boolean f48544t;
    public boolean f48545u;
    public boolean v;
    public long f48546w;
    public boolean f48547x;
    public long f48548y;
    public c3.q f48549z;

    public k(z3.l lVar, int i10) {
        int i11;
        this.f48527a = lVar;
        this.f48528b = i10;
        g0 g0Var = i0.f8758b;
        this.f48534j = a1.f8721e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48535k = i11;
        this.h = new m();
        this.f48533i = new ArrayList();
        this.f48531f = new v(16);
        this.f48532g = new ArrayDeque();
        this.f48529c = new v(f2.o.f9606a);
        this.d = new v(6);
        this.f48530e = new v();
        this.f48540p = -1;
        this.f48549z = c3.q.f4100m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f48528b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8758b;
            a1Var = a1.f8721e;
        }
        this.f48534j = a1Var;
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
        if ((this.f48528b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f48527a);
        }
        this.f48549z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f48532g.clear();
        this.f48538n = 0;
        this.f48540p = -1;
        this.f48541q = 0;
        this.f48542r = 0;
        this.f48543s = 0;
        this.f48544t = false;
        if (j3 == 0) {
            if (this.f48535k != 3) {
                this.f48535k = 0;
                this.f48538n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f48553a.clear();
            mVar.f48554b = 0;
            this.f48533i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f48524b;
            int e7 = d0.e(rVar.f48590f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48591g[e7] & 1) != 0) {
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
            jVar.f48526e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4071b = false;
                i0Var.f4072c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f48534j;
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

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
    public final z3.k f44555a;
    public final int f44556b;
    public final v f44557c;
    public final v d;
    public final v e;
    public final v f44558f;
    public final ArrayDeque f44559g;
    public final m h;
    public final ArrayList f44560i;
    public a1 f44561j;
    public int f44562k;
    public int f44563l;
    public long f44564m;
    public int f44565n;
    public v f44566o;
    public int f44567p;
    public int f44568q;
    public int f44569r;
    public int f44570s;
    public boolean f44571t;
    public boolean f44572u;
    public boolean v;
    public long f44573w;
    public boolean f44574x;
    public long f44575y;
    public c3.q f44576z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f44555a = kVar;
        this.f44556b = i10;
        g0 g0Var = i0.f8084b;
        this.f44561j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44562k = i11;
        this.h = new m();
        this.f44560i = new ArrayList();
        this.f44558f = new v(16);
        this.f44559g = new ArrayDeque();
        this.f44557c = new v(f2.o.f8850a);
        this.d = new v(6);
        this.e = new v();
        this.f44567p = -1;
        this.f44576z = c3.q.f3797m;
        this.A = new j[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44556b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8084b;
            a1Var = a1.e;
        }
        this.f44561j = a1Var;
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
        if ((this.f44556b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44555a);
        }
        this.f44576z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f44559g.clear();
        this.f44565n = 0;
        this.f44567p = -1;
        this.f44568q = 0;
        this.f44569r = 0;
        this.f44570s = 0;
        this.f44571t = false;
        if (j3 == 0) {
            if (this.f44562k != 3) {
                this.f44562k = 0;
                this.f44565n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f44579a.clear();
            mVar.f44580b = 0;
            this.f44560i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f44553b;
            int e = d0.e(rVar.f44612f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((rVar.f44613g[e] & 1) != 0) {
                        break;
                    }
                    e--;
                } else {
                    e = -1;
                    break;
                }
            }
            if (e == -1) {
                e = rVar.a(j10);
            }
            jVar.e = e;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f3772b = false;
                i0Var.f3773c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44561j;
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

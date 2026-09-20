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
public final class l implements c3.o, b0 {
    public k[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public r3.a F;
    public final z3.k f44830a;
    public final int f44831b;
    public final v f44832c;
    public final v d;
    public final v e;
    public final v f44833f;
    public final ArrayDeque f44834g;
    public final n h;
    public final ArrayList f44835i;
    public a1 f44836j;
    public int f44837k;
    public int f44838l;
    public long f44839m;
    public int f44840n;
    public v f44841o;
    public int f44842p;
    public int f44843q;
    public int f44844r;
    public int f44845s;
    public boolean f44846t;
    public boolean f44847u;
    public boolean v;
    public long f44848w;
    public boolean f44849x;
    public long f44850y;
    public c3.q f44851z;

    public l(z3.k kVar, int i10) {
        int i11;
        this.f44830a = kVar;
        this.f44831b = i10;
        g0 g0Var = i0.f8084b;
        this.f44836j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44837k = i11;
        this.h = new n();
        this.f44835i = new ArrayList();
        this.f44833f = new v(16);
        this.f44834g = new ArrayDeque();
        this.f44832c = new v(f2.o.f8850a);
        this.d = new v(6);
        this.e = new v();
        this.f44842p = -1;
        this.f44851z = c3.q.f3797m;
        this.A = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44831b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = o.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8084b;
            a1Var = a1.e;
        }
        this.f44836j = a1Var;
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
        if ((this.f44831b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44830a);
        }
        this.f44851z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        k[] kVarArr;
        this.f44834g.clear();
        this.f44840n = 0;
        this.f44842p = -1;
        this.f44843q = 0;
        this.f44844r = 0;
        this.f44845s = 0;
        this.f44846t = false;
        if (j3 == 0) {
            if (this.f44837k != 3) {
                this.f44837k = 0;
                this.f44840n = 0;
                return;
            }
            n nVar = this.h;
            nVar.f44854a.clear();
            nVar.f44855b = 0;
            this.f44835i.clear();
            return;
        }
        for (k kVar : this.A) {
            s sVar = kVar.f44828b;
            int e = d0.e(sVar.f44887f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((sVar.f44888g[e] & 1) != 0) {
                        break;
                    }
                    e--;
                } else {
                    e = -1;
                    break;
                }
            }
            if (e == -1) {
                e = sVar.a(j10);
            }
            kVar.e = e;
            c3.i0 i0Var = kVar.d;
            if (i0Var != null) {
                i0Var.f3772b = false;
                i0Var.f3773c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44836j;
    }

    @Override
    public final c3.a0 j(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.j(long):c3.a0");
    }

    @Override
    public final long l() {
        return this.D;
    }

    @Override
    public final int m(c3.p r44, c3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.m(c3.p, c3.s):int");
    }

    public final void n(long r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.n(long):void");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}

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
    public final z3.k f44812a;
    public final int f44813b;
    public final v f44814c;
    public final v d;
    public final v e;
    public final v f44815f;
    public final ArrayDeque f44816g;
    public final n h;
    public final ArrayList f44817i;
    public a1 f44818j;
    public int f44819k;
    public int f44820l;
    public long f44821m;
    public int f44822n;
    public v f44823o;
    public int f44824p;
    public int f44825q;
    public int f44826r;
    public int f44827s;
    public boolean f44828t;
    public boolean f44829u;
    public boolean v;
    public long f44830w;
    public boolean f44831x;
    public long f44832y;
    public c3.q f44833z;

    public l(z3.k kVar, int i10) {
        int i11;
        this.f44812a = kVar;
        this.f44813b = i10;
        g0 g0Var = i0.f8066b;
        this.f44818j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44819k = i11;
        this.h = new n();
        this.f44817i = new ArrayList();
        this.f44815f = new v(16);
        this.f44816g = new ArrayDeque();
        this.f44814c = new v(f2.o.f8832a);
        this.d = new v(6);
        this.e = new v();
        this.f44824p = -1;
        this.f44833z = c3.q.f3789m;
        this.A = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44813b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = o.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8066b;
            a1Var = a1.e;
        }
        this.f44818j = a1Var;
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
        if ((this.f44813b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44812a);
        }
        this.f44833z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        k[] kVarArr;
        this.f44816g.clear();
        this.f44822n = 0;
        this.f44824p = -1;
        this.f44825q = 0;
        this.f44826r = 0;
        this.f44827s = 0;
        this.f44828t = false;
        if (j3 == 0) {
            if (this.f44819k != 3) {
                this.f44819k = 0;
                this.f44822n = 0;
                return;
            }
            n nVar = this.h;
            nVar.f44836a.clear();
            nVar.f44837b = 0;
            this.f44817i.clear();
            return;
        }
        for (k kVar : this.A) {
            s sVar = kVar.f44810b;
            int e = d0.e(sVar.f44869f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((sVar.f44870g[e] & 1) != 0) {
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
                i0Var.f3764b = false;
                i0Var.f3765c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44818j;
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

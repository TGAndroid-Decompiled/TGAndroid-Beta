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
    public final z3.k f47973a;
    public final int f47974b;
    public final v f47975c;
    public final v d;
    public final v f47976e;
    public final v f47977f;
    public final ArrayDeque f47978g;
    public final m h;
    public final ArrayList f47979i;
    public a1 f47980j;
    public int f47981k;
    public int f47982l;
    public long f47983m;
    public int f47984n;
    public v f47985o;
    public int f47986p;
    public int f47987q;
    public int f47988r;
    public int f47989s;
    public boolean f47990t;
    public boolean f47991u;
    public boolean v;
    public long f47992w;
    public boolean f47993x;
    public long f47994y;
    public c3.q f47995z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f47973a = kVar;
        this.f47974b = i10;
        g0 g0Var = i0.f8957b;
        this.f47980j = a1.f8920e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f47981k = i11;
        this.h = new m();
        this.f47979i = new ArrayList();
        this.f47977f = new v(16);
        this.f47978g = new ArrayDeque();
        this.f47975c = new v(f2.p.f9229a);
        this.d = new v(6);
        this.f47976e = new v();
        this.f47986p = -1;
        this.f47995z = c3.q.f4293m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f47974b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8957b;
            a1Var = a1.f8920e;
        }
        this.f47980j = a1Var;
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
        if ((this.f47974b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f47973a);
        }
        this.f47995z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f47978g.clear();
        this.f47984n = 0;
        this.f47986p = -1;
        this.f47987q = 0;
        this.f47988r = 0;
        this.f47989s = 0;
        this.f47990t = false;
        if (j3 == 0) {
            if (this.f47981k != 3) {
                this.f47981k = 0;
                this.f47984n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f47999a.clear();
            mVar.f48000b = 0;
            this.f47979i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f47970b;
            int e7 = d0.e(rVar.f48036f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48037g[e7] & 1) != 0) {
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
            jVar.f47972e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4265b = false;
                i0Var.f4266c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f47980j;
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

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
    public final z3.k f47972a;
    public final int f47973b;
    public final v f47974c;
    public final v d;
    public final v f47975e;
    public final v f47976f;
    public final ArrayDeque f47977g;
    public final m h;
    public final ArrayList f47978i;
    public a1 f47979j;
    public int f47980k;
    public int f47981l;
    public long f47982m;
    public int f47983n;
    public v f47984o;
    public int f47985p;
    public int f47986q;
    public int f47987r;
    public int f47988s;
    public boolean f47989t;
    public boolean f47990u;
    public boolean v;
    public long f47991w;
    public boolean f47992x;
    public long f47993y;
    public c3.q f47994z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f47972a = kVar;
        this.f47973b = i10;
        g0 g0Var = i0.f8957b;
        this.f47979j = a1.f8920e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f47980k = i11;
        this.h = new m();
        this.f47978i = new ArrayList();
        this.f47976f = new v(16);
        this.f47977g = new ArrayDeque();
        this.f47974c = new v(f2.p.f9229a);
        this.d = new v(6);
        this.f47975e = new v();
        this.f47985p = -1;
        this.f47994z = c3.q.f4293m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f47973b & 2) != 0) {
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
        this.f47979j = a1Var;
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
        if ((this.f47973b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f47972a);
        }
        this.f47994z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f47977g.clear();
        this.f47983n = 0;
        this.f47985p = -1;
        this.f47986q = 0;
        this.f47987r = 0;
        this.f47988s = 0;
        this.f47989t = false;
        if (j3 == 0) {
            if (this.f47980k != 3) {
                this.f47980k = 0;
                this.f47983n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f47998a.clear();
            mVar.f47999b = 0;
            this.f47978i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f47969b;
            int e7 = d0.e(rVar.f48035f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48036g[e7] & 1) != 0) {
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
            jVar.f47971e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4265b = false;
                i0Var.f4266c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f47979j;
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

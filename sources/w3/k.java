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
    public final z3.k f44850a;
    public final int f44851b;
    public final v f44852c;
    public final v d;
    public final v e;
    public final v f44853f;
    public final ArrayDeque f44854g;
    public final m h;
    public final ArrayList f44855i;
    public a1 f44856j;
    public int f44857k;
    public int f44858l;
    public long f44859m;
    public int f44860n;
    public v f44861o;
    public int f44862p;
    public int f44863q;
    public int f44864r;
    public int f44865s;
    public boolean f44866t;
    public boolean f44867u;
    public boolean v;
    public long f44868w;
    public boolean f44869x;
    public long f44870y;
    public c3.q f44871z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f44850a = kVar;
        this.f44851b = i10;
        g0 g0Var = i0.f8083b;
        this.f44856j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44857k = i11;
        this.h = new m();
        this.f44855i = new ArrayList();
        this.f44853f = new v(16);
        this.f44854g = new ArrayDeque();
        this.f44852c = new v(f2.o.f8849a);
        this.d = new v(6);
        this.e = new v();
        this.f44862p = -1;
        this.f44871z = c3.q.f3796m;
        this.A = new j[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44851b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8083b;
            a1Var = a1.e;
        }
        this.f44856j = a1Var;
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
        if ((this.f44851b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44850a);
        }
        this.f44871z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f44854g.clear();
        this.f44860n = 0;
        this.f44862p = -1;
        this.f44863q = 0;
        this.f44864r = 0;
        this.f44865s = 0;
        this.f44866t = false;
        if (j3 == 0) {
            if (this.f44857k != 3) {
                this.f44857k = 0;
                this.f44860n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f44874a.clear();
            mVar.f44875b = 0;
            this.f44855i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f44848b;
            int e = d0.e(rVar.f44907f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((rVar.f44908g[e] & 1) != 0) {
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
                i0Var.f3771b = false;
                i0Var.f3772c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44856j;
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

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
    public final z3.k f48001a;
    public final int f48002b;
    public final v f48003c;
    public final v d;
    public final v f48004e;
    public final v f48005f;
    public final ArrayDeque f48006g;
    public final m h;
    public final ArrayList f48007i;
    public a1 f48008j;
    public int f48009k;
    public int f48010l;
    public long f48011m;
    public int f48012n;
    public v f48013o;
    public int f48014p;
    public int f48015q;
    public int f48016r;
    public int f48017s;
    public boolean f48018t;
    public boolean f48019u;
    public boolean v;
    public long f48020w;
    public boolean f48021x;
    public long f48022y;
    public c3.q f48023z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f48001a = kVar;
        this.f48002b = i10;
        g0 g0Var = i0.f8985b;
        this.f48008j = a1.f8948e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f48009k = i11;
        this.h = new m();
        this.f48007i = new ArrayList();
        this.f48005f = new v(16);
        this.f48006g = new ArrayDeque();
        this.f48003c = new v(f2.p.f9257a);
        this.d = new v(6);
        this.f48004e = new v();
        this.f48014p = -1;
        this.f48023z = c3.q.f4320m;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f48002b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8985b;
            a1Var = a1.f8948e;
        }
        this.f48008j = a1Var;
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
        if ((this.f48002b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f48001a);
        }
        this.f48023z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f48006g.clear();
        this.f48012n = 0;
        this.f48014p = -1;
        this.f48015q = 0;
        this.f48016r = 0;
        this.f48017s = 0;
        this.f48018t = false;
        if (j3 == 0) {
            if (this.f48009k != 3) {
                this.f48009k = 0;
                this.f48012n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f48027a.clear();
            mVar.f48028b = 0;
            this.f48007i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f47998b;
            int e7 = d0.e(rVar.f48064f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((rVar.f48065g[e7] & 1) != 0) {
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
            jVar.f48000e = e7;
            c3.i0 i0Var = jVar.d;
            if (i0Var != null) {
                i0Var.f4292b = false;
                i0Var.f4293c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f48008j;
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

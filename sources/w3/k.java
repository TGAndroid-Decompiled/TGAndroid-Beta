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
    public final z3.k f43491a;
    public final int f43492b;
    public final v f43493c;
    public final v d;
    public final v e;
    public final v f43494f;
    public final ArrayDeque f43495g;
    public final m h;
    public final ArrayList f43496i;
    public a1 f43497j;
    public int f43498k;
    public int f43499l;
    public long f43500m;
    public int f43501n;
    public v f43502o;
    public int f43503p;
    public int f43504q;
    public int f43505r;
    public int f43506s;
    public boolean f43507t;
    public boolean f43508u;
    public boolean v;
    public long f43509w;
    public boolean f43510x;
    public long f43511y;
    public c3.q f43512z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f43491a = kVar;
        this.f43492b = i10;
        g0 g0Var = i0.f7384b;
        this.f43497j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f43498k = i11;
        this.h = new m();
        this.f43496i = new ArrayList();
        this.f43494f = new v(16);
        this.f43495g = new ArrayDeque();
        this.f43493c = new v(f2.o.f7732a);
        this.d = new v(6);
        this.e = new v();
        this.f43503p = -1;
        this.f43512z = c3.q.f4211p;
        this.A = new j[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f43492b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f7384b;
            a1Var = a1.e;
        }
        this.f43497j = a1Var;
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
        if ((this.f43492b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f43491a);
        }
        this.f43512z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f43495g.clear();
        this.f43501n = 0;
        this.f43503p = -1;
        this.f43504q = 0;
        this.f43505r = 0;
        this.f43506s = 0;
        this.f43507t = false;
        if (j3 == 0) {
            if (this.f43498k != 3) {
                this.f43498k = 0;
                this.f43501n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f43515a.clear();
            mVar.f43516b = 0;
            this.f43496i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f43489b;
            int e = d0.e(rVar.f43548f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((rVar.f43549g[e] & 1) != 0) {
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
                i0Var.f4186b = false;
                i0Var.f4187c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f43497j;
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

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
    public final z3.k f44532a;
    public final int f44533b;
    public final v f44534c;
    public final v d;
    public final v e;
    public final v f44535f;
    public final ArrayDeque f44536g;
    public final m h;
    public final ArrayList f44537i;
    public a1 f44538j;
    public int f44539k;
    public int f44540l;
    public long f44541m;
    public int f44542n;
    public v f44543o;
    public int f44544p;
    public int f44545q;
    public int f44546r;
    public int f44547s;
    public boolean f44548t;
    public boolean f44549u;
    public boolean v;
    public long f44550w;
    public boolean f44551x;
    public long f44552y;
    public c3.q f44553z;

    public k(z3.k kVar, int i10) {
        int i11;
        this.f44532a = kVar;
        this.f44533b = i10;
        g0 g0Var = i0.f8079b;
        this.f44538j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44539k = i11;
        this.h = new m();
        this.f44537i = new ArrayList();
        this.f44535f = new v(16);
        this.f44536g = new ArrayDeque();
        this.f44534c = new v(f2.o.f8845a);
        this.d = new v(6);
        this.e = new v();
        this.f44544p = -1;
        this.f44553z = c3.q.f3792m;
        this.A = new j[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44533b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = n.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8079b;
            a1Var = a1.e;
        }
        this.f44538j = a1Var;
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
        if ((this.f44533b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44532a);
        }
        this.f44553z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        j[] jVarArr;
        this.f44536g.clear();
        this.f44542n = 0;
        this.f44544p = -1;
        this.f44545q = 0;
        this.f44546r = 0;
        this.f44547s = 0;
        this.f44548t = false;
        if (j3 == 0) {
            if (this.f44539k != 3) {
                this.f44539k = 0;
                this.f44542n = 0;
                return;
            }
            m mVar = this.h;
            mVar.f44556a.clear();
            mVar.f44557b = 0;
            this.f44537i.clear();
            return;
        }
        for (j jVar : this.A) {
            r rVar = jVar.f44530b;
            int e = d0.e(rVar.f44589f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((rVar.f44590g[e] & 1) != 0) {
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
                i0Var.f3767b = false;
                i0Var.f3768c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44538j;
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

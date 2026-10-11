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
public final class m implements c3.o, b0 {
    public l[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public r3.a F;
    public final z3.k f49940a;
    public final int f49941b;
    public final v f49942c;
    public final v d;
    public final v f49943e;
    public final v f49944f;
    public final ArrayDeque f49945g;
    public final o h;
    public final ArrayList f49946i;
    public a1 f49947j;
    public int f49948k;
    public int f49949l;
    public long f49950m;
    public int f49951n;
    public v f49952o;
    public int f49953p;
    public int f49954q;
    public int f49955r;
    public int f49956s;
    public boolean f49957t;
    public boolean f49958u;
    public boolean v;
    public long f49959w;
    public boolean f49960x;
    public long f49961y;
    public c3.q f49962z;

    public m(z3.k kVar, int i10) {
        int i11;
        this.f49940a = kVar;
        this.f49941b = i10;
        g0 g0Var = i0.f8751b;
        this.f49947j = a1.f8714e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f49948k = i11;
        this.h = new o();
        this.f49946i = new ArrayList();
        this.f49944f = new v(16);
        this.f49945g = new ArrayDeque();
        this.f49942c = new v(f2.p.f9616a);
        this.d = new v(6);
        this.f49943e = new v();
        this.f49953p = -1;
        this.f49962z = c3.q.f4149m;
        this.A = new l[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f49941b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = p.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8751b;
            a1Var = a1.f8714e;
        }
        this.f49947j = a1Var;
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
        if ((this.f49941b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f49940a);
        }
        this.f49962z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        l[] lVarArr;
        this.f49945g.clear();
        this.f49951n = 0;
        this.f49953p = -1;
        this.f49954q = 0;
        this.f49955r = 0;
        this.f49956s = 0;
        this.f49957t = false;
        if (j3 == 0) {
            if (this.f49948k != 3) {
                this.f49948k = 0;
                this.f49951n = 0;
                return;
            }
            o oVar = this.h;
            oVar.f49966a.clear();
            oVar.f49967b = 0;
            this.f49946i.clear();
            return;
        }
        for (l lVar : this.A) {
            t tVar = lVar.f49937b;
            int e7 = d0.e(tVar.f50003f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((tVar.f50004g[e7] & 1) != 0) {
                        break;
                    }
                    e7--;
                } else {
                    e7 = -1;
                    break;
                }
            }
            if (e7 == -1) {
                e7 = tVar.a(j10);
            }
            lVar.f49939e = e7;
            c3.i0 i0Var = lVar.d;
            if (i0Var != null) {
                i0Var.f4120b = false;
                i0Var.f4121c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f49947j;
    }

    @Override
    public final c3.a0 j(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.j(long):c3.a0");
    }

    @Override
    public final long l() {
        return this.D;
    }

    @Override
    public final int m(c3.p r44, c3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.m(c3.p, c3.s):int");
    }

    public final void n(long r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.n(long):void");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}

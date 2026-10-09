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
    public final z3.k f49819a;
    public final int f49820b;
    public final v f49821c;
    public final v d;
    public final v f49822e;
    public final v f49823f;
    public final ArrayDeque f49824g;
    public final o h;
    public final ArrayList f49825i;
    public a1 f49826j;
    public int f49827k;
    public int f49828l;
    public long f49829m;
    public int f49830n;
    public v f49831o;
    public int f49832p;
    public int f49833q;
    public int f49834r;
    public int f49835s;
    public boolean f49836t;
    public boolean f49837u;
    public boolean v;
    public long f49838w;
    public boolean f49839x;
    public long f49840y;
    public c3.q f49841z;

    public m(z3.k kVar, int i10) {
        int i11;
        this.f49819a = kVar;
        this.f49820b = i10;
        g0 g0Var = i0.f8752b;
        this.f49826j = a1.f8715e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f49827k = i11;
        this.h = new o();
        this.f49825i = new ArrayList();
        this.f49823f = new v(16);
        this.f49824g = new ArrayDeque();
        this.f49821c = new v(f2.p.f9617a);
        this.d = new v(6);
        this.f49822e = new v();
        this.f49832p = -1;
        this.f49841z = c3.q.f4149m;
        this.A = new l[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f49820b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = p.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8752b;
            a1Var = a1.f8715e;
        }
        this.f49826j = a1Var;
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
        if ((this.f49820b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f49819a);
        }
        this.f49841z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        l[] lVarArr;
        this.f49824g.clear();
        this.f49830n = 0;
        this.f49832p = -1;
        this.f49833q = 0;
        this.f49834r = 0;
        this.f49835s = 0;
        this.f49836t = false;
        if (j3 == 0) {
            if (this.f49827k != 3) {
                this.f49827k = 0;
                this.f49830n = 0;
                return;
            }
            o oVar = this.h;
            oVar.f49845a.clear();
            oVar.f49846b = 0;
            this.f49825i.clear();
            return;
        }
        for (l lVar : this.A) {
            t tVar = lVar.f49816b;
            int e7 = d0.e(tVar.f49882f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((tVar.f49883g[e7] & 1) != 0) {
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
            lVar.f49818e = e7;
            c3.i0 i0Var = lVar.d;
            if (i0Var != null) {
                i0Var.f4120b = false;
                i0Var.f4121c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f49826j;
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

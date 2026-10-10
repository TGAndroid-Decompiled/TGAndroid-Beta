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
    public final z3.k f49863a;
    public final int f49864b;
    public final v f49865c;
    public final v d;
    public final v f49866e;
    public final v f49867f;
    public final ArrayDeque f49868g;
    public final o h;
    public final ArrayList f49869i;
    public a1 f49870j;
    public int f49871k;
    public int f49872l;
    public long f49873m;
    public int f49874n;
    public v f49875o;
    public int f49876p;
    public int f49877q;
    public int f49878r;
    public int f49879s;
    public boolean f49880t;
    public boolean f49881u;
    public boolean v;
    public long f49882w;
    public boolean f49883x;
    public long f49884y;
    public c3.q f49885z;

    public m(z3.k kVar, int i10) {
        int i11;
        this.f49863a = kVar;
        this.f49864b = i10;
        g0 g0Var = i0.f8752b;
        this.f49870j = a1.f8715e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f49871k = i11;
        this.h = new o();
        this.f49869i = new ArrayList();
        this.f49867f = new v(16);
        this.f49868g = new ArrayDeque();
        this.f49865c = new v(f2.p.f9617a);
        this.d = new v(6);
        this.f49866e = new v();
        this.f49876p = -1;
        this.f49885z = c3.q.f4149m;
        this.A = new l[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f49864b & 2) != 0) {
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
        this.f49870j = a1Var;
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
        if ((this.f49864b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f49863a);
        }
        this.f49885z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        l[] lVarArr;
        this.f49868g.clear();
        this.f49874n = 0;
        this.f49876p = -1;
        this.f49877q = 0;
        this.f49878r = 0;
        this.f49879s = 0;
        this.f49880t = false;
        if (j3 == 0) {
            if (this.f49871k != 3) {
                this.f49871k = 0;
                this.f49874n = 0;
                return;
            }
            o oVar = this.h;
            oVar.f49889a.clear();
            oVar.f49890b = 0;
            this.f49869i.clear();
            return;
        }
        for (l lVar : this.A) {
            t tVar = lVar.f49860b;
            int e7 = d0.e(tVar.f49926f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((tVar.f49927g[e7] & 1) != 0) {
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
            lVar.f49862e = e7;
            c3.i0 i0Var = lVar.d;
            if (i0Var != null) {
                i0Var.f4120b = false;
                i0Var.f4121c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f49870j;
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

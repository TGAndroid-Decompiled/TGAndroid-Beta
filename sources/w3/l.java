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
    public final z3.k f44921a;
    public final int f44922b;
    public final v f44923c;
    public final v d;
    public final v e;
    public final v f44924f;
    public final ArrayDeque f44925g;
    public final n h;
    public final ArrayList f44926i;
    public a1 f44927j;
    public int f44928k;
    public int f44929l;
    public long f44930m;
    public int f44931n;
    public v f44932o;
    public int f44933p;
    public int f44934q;
    public int f44935r;
    public int f44936s;
    public boolean f44937t;
    public boolean f44938u;
    public boolean v;
    public long f44939w;
    public boolean f44940x;
    public long f44941y;
    public c3.q f44942z;

    public l(z3.k kVar, int i10) {
        int i11;
        this.f44921a = kVar;
        this.f44922b = i10;
        g0 g0Var = i0.f8078b;
        this.f44927j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44928k = i11;
        this.h = new n();
        this.f44926i = new ArrayList();
        this.f44924f = new v(16);
        this.f44925g = new ArrayDeque();
        this.f44923c = new v(f2.o.f8844a);
        this.d = new v(6);
        this.e = new v();
        this.f44933p = -1;
        this.f44942z = c3.q.f3796m;
        this.A = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44922b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = o.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8078b;
            a1Var = a1.e;
        }
        this.f44927j = a1Var;
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
        if ((this.f44922b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44921a);
        }
        this.f44942z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        k[] kVarArr;
        this.f44925g.clear();
        this.f44931n = 0;
        this.f44933p = -1;
        this.f44934q = 0;
        this.f44935r = 0;
        this.f44936s = 0;
        this.f44937t = false;
        if (j3 == 0) {
            if (this.f44928k != 3) {
                this.f44928k = 0;
                this.f44931n = 0;
                return;
            }
            n nVar = this.h;
            nVar.f44945a.clear();
            nVar.f44946b = 0;
            this.f44926i.clear();
            return;
        }
        for (k kVar : this.A) {
            s sVar = kVar.f44919b;
            int e = d0.e(sVar.f44978f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((sVar.f44979g[e] & 1) != 0) {
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
                i0Var.f3771b = false;
                i0Var.f3772c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44927j;
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

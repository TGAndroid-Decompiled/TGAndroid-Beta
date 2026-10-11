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
    public final z3.k f49906a;
    public final int f49907b;
    public final v f49908c;
    public final v d;
    public final v f49909e;
    public final v f49910f;
    public final ArrayDeque f49911g;
    public final o h;
    public final ArrayList f49912i;
    public a1 f49913j;
    public int f49914k;
    public int f49915l;
    public long f49916m;
    public int f49917n;
    public v f49918o;
    public int f49919p;
    public int f49920q;
    public int f49921r;
    public int f49922s;
    public boolean f49923t;
    public boolean f49924u;
    public boolean v;
    public long f49925w;
    public boolean f49926x;
    public long f49927y;
    public c3.q f49928z;

    public m(z3.k kVar, int i10) {
        int i11;
        this.f49906a = kVar;
        this.f49907b = i10;
        g0 g0Var = i0.f8751b;
        this.f49913j = a1.f8714e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f49914k = i11;
        this.h = new o();
        this.f49912i = new ArrayList();
        this.f49910f = new v(16);
        this.f49911g = new ArrayDeque();
        this.f49908c = new v(f2.p.f9616a);
        this.d = new v(6);
        this.f49909e = new v();
        this.f49919p = -1;
        this.f49928z = c3.q.f4149m;
        this.A = new l[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f49907b & 2) != 0) {
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
        this.f49913j = a1Var;
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
        if ((this.f49907b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f49906a);
        }
        this.f49928z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        l[] lVarArr;
        this.f49911g.clear();
        this.f49917n = 0;
        this.f49919p = -1;
        this.f49920q = 0;
        this.f49921r = 0;
        this.f49922s = 0;
        this.f49923t = false;
        if (j3 == 0) {
            if (this.f49914k != 3) {
                this.f49914k = 0;
                this.f49917n = 0;
                return;
            }
            o oVar = this.h;
            oVar.f49932a.clear();
            oVar.f49933b = 0;
            this.f49912i.clear();
            return;
        }
        for (l lVar : this.A) {
            t tVar = lVar.f49903b;
            int e7 = d0.e(tVar.f49969f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((tVar.f49970g[e7] & 1) != 0) {
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
            lVar.f49905e = e7;
            c3.i0 i0Var = lVar.d;
            if (i0Var != null) {
                i0Var.f4120b = false;
                i0Var.f4121c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f49913j;
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

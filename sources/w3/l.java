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
    public final z3.k f44786a;
    public final int f44787b;
    public final v f44788c;
    public final v d;
    public final v e;
    public final v f44789f;
    public final ArrayDeque f44790g;
    public final n h;
    public final ArrayList f44791i;
    public a1 f44792j;
    public int f44793k;
    public int f44794l;
    public long f44795m;
    public int f44796n;
    public v f44797o;
    public int f44798p;
    public int f44799q;
    public int f44800r;
    public int f44801s;
    public boolean f44802t;
    public boolean f44803u;
    public boolean v;
    public long f44804w;
    public boolean f44805x;
    public long f44806y;
    public c3.q f44807z;

    public l(z3.k kVar, int i10) {
        int i11;
        this.f44786a = kVar;
        this.f44787b = i10;
        g0 g0Var = i0.f8083b;
        this.f44792j = a1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f44793k = i11;
        this.h = new n();
        this.f44791i = new ArrayList();
        this.f44789f = new v(16);
        this.f44790g = new ArrayDeque();
        this.f44788c = new v(f2.o.f8849a);
        this.d = new v(6);
        this.e = new v();
        this.f44798p = -1;
        this.f44807z = c3.q.f3797m;
        this.A = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f44787b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = o.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8083b;
            a1Var = a1.e;
        }
        this.f44792j = a1Var;
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
        if ((this.f44787b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f44786a);
        }
        this.f44807z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        k[] kVarArr;
        this.f44790g.clear();
        this.f44796n = 0;
        this.f44798p = -1;
        this.f44799q = 0;
        this.f44800r = 0;
        this.f44801s = 0;
        this.f44802t = false;
        if (j3 == 0) {
            if (this.f44793k != 3) {
                this.f44793k = 0;
                this.f44796n = 0;
                return;
            }
            n nVar = this.h;
            nVar.f44810a.clear();
            nVar.f44811b = 0;
            this.f44791i.clear();
            return;
        }
        for (k kVar : this.A) {
            s sVar = kVar.f44784b;
            int e = d0.e(sVar.f44843f, j10, false);
            while (true) {
                if (e >= 0) {
                    if ((sVar.f44844g[e] & 1) != 0) {
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
                i0Var.f3772b = false;
                i0Var.f3773c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f44792j;
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

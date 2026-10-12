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
    public final z3.k f50054a;
    public final int f50055b;
    public final v f50056c;
    public final v d;
    public final v f50057e;
    public final v f50058f;
    public final ArrayDeque f50059g;
    public final n h;
    public final ArrayList f50060i;
    public a1 f50061j;
    public int f50062k;
    public int f50063l;
    public long f50064m;
    public int f50065n;
    public v f50066o;
    public int f50067p;
    public int f50068q;
    public int f50069r;
    public int f50070s;
    public boolean f50071t;
    public boolean f50072u;
    public boolean v;
    public long f50073w;
    public boolean f50074x;
    public long f50075y;
    public c3.q f50076z;

    public l(z3.k kVar, int i10) {
        int i11;
        this.f50054a = kVar;
        this.f50055b = i10;
        g0 g0Var = i0.f8749b;
        this.f50061j = a1.f8712e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f50062k = i11;
        this.h = new n();
        this.f50060i = new ArrayList();
        this.f50058f = new v(16);
        this.f50059g = new ArrayDeque();
        this.f50056c = new v(f2.p.f9614a);
        this.d = new v(6);
        this.f50057e = new v();
        this.f50067p = -1;
        this.f50076z = c3.q.f4148m;
        this.A = new k[0];
    }

    @Override
    public final boolean b(c3.p pVar) {
        boolean z10;
        a1 a1Var;
        if ((this.f50055b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 n10 = o.n(pVar, false, z10);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8749b;
            a1Var = a1.f8712e;
        }
        this.f50061j = a1Var;
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
        if ((this.f50055b & 16) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f50054a);
        }
        this.f50076z = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        k[] kVarArr;
        this.f50059g.clear();
        this.f50065n = 0;
        this.f50067p = -1;
        this.f50068q = 0;
        this.f50069r = 0;
        this.f50070s = 0;
        this.f50071t = false;
        if (j3 == 0) {
            if (this.f50062k != 3) {
                this.f50062k = 0;
                this.f50065n = 0;
                return;
            }
            n nVar = this.h;
            nVar.f50080a.clear();
            nVar.f50081b = 0;
            this.f50060i.clear();
            return;
        }
        for (k kVar : this.A) {
            s sVar = kVar.f50051b;
            int e7 = d0.e(sVar.f50117f, j10, false);
            while (true) {
                if (e7 >= 0) {
                    if ((sVar.f50118g[e7] & 1) != 0) {
                        break;
                    }
                    e7--;
                } else {
                    e7 = -1;
                    break;
                }
            }
            if (e7 == -1) {
                e7 = sVar.a(j10);
            }
            kVar.f50053e = e7;
            c3.i0 i0Var = kVar.d;
            if (i0Var != null) {
                i0Var.f4119b = false;
                i0Var.f4120c = 0;
            }
        }
    }

    @Override
    public final List i() {
        return this.f50061j;
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

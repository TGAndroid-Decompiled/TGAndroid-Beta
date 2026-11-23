package x2;

import a8.ma;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60105l;
    public final long f60106m;
    public final boolean f60107n;
    public final boolean f60108o;
    public final boolean f60109p;
    public final boolean f60110q;
    public final ArrayList f60111r;
    public final e2.k1 f60112s;
    public f f60113t;
    public g f60114u;
    public long v;
    public long f60115w;

    public h(e eVar) {
        super(eVar.f60089a);
        this.f60105l = eVar.f60090b;
        this.f60106m = eVar.f60091c;
        this.f60107n = eVar.d;
        this.f60108o = eVar.f60092e;
        this.f60109p = eVar.f60093f;
        this.f60110q = eVar.f60094g;
        this.f60111r = new ArrayList();
        this.f60112s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60114u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60112s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10483p;
        f fVar = this.f60113t;
        long j13 = this.f60106m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60111r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60108o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60115w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60109p;
            j3 = this.f60105l;
            if (z10) {
                long j15 = k1Var.f10479l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60115w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60115w;
                dVar.f60087f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60110q);
            this.f60113t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60114u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60088n = this.f60114u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60246k;
        if (aVar.i().f10498e.equals(l0Var.f10498e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60246k.c(g0Var, mVar, j3), this.f60107n, this.v, this.f60115w, 0);
        this.f60111r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60114u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60111r;
        ma.p(arrayList.remove(e0Var));
        this.f60246k.o(((d) e0Var).f60083a);
        if (arrayList.isEmpty() && !this.f60108o) {
            f fVar = this.f60113t;
            fVar.getClass();
            D(fVar.f60226e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60114u = null;
        this.f60113t = null;
    }
}

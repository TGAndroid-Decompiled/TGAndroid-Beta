package x2;

import a8.la;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60095l;
    public final long f60096m;
    public final boolean f60097n;
    public final boolean f60098o;
    public final boolean f60099p;
    public final boolean f60100q;
    public final ArrayList f60101r;
    public final e2.k1 f60102s;
    public f f60103t;
    public g f60104u;
    public long v;
    public long f60105w;

    public h(e eVar) {
        super(eVar.f60079a);
        this.f60095l = eVar.f60080b;
        this.f60096m = eVar.f60081c;
        this.f60097n = eVar.d;
        this.f60098o = eVar.f60082e;
        this.f60099p = eVar.f60083f;
        this.f60100q = eVar.f60084g;
        this.f60101r = new ArrayList();
        this.f60102s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60104u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60102s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10488p;
        f fVar = this.f60103t;
        long j13 = this.f60096m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60101r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60098o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60105w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60099p;
            j3 = this.f60095l;
            if (z10) {
                long j15 = k1Var.f10484l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60105w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60105w;
                dVar.f60077f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60100q);
            this.f60103t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60104u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60078n = this.f60104u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60236k;
        if (aVar.i().f10503e.equals(l0Var.f10503e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60236k.c(g0Var, mVar, j3), this.f60097n, this.v, this.f60105w, 0);
        this.f60101r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60104u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60101r;
        la.p(arrayList.remove(e0Var));
        this.f60236k.o(((d) e0Var).f60073a);
        if (arrayList.isEmpty() && !this.f60098o) {
            f fVar = this.f60103t;
            fVar.getClass();
            D(fVar.f60216e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60104u = null;
        this.f60103t = null;
    }
}

package x2;

import a8.la;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60094l;
    public final long f60095m;
    public final boolean f60096n;
    public final boolean f60097o;
    public final boolean f60098p;
    public final boolean f60099q;
    public final ArrayList f60100r;
    public final e2.k1 f60101s;
    public f f60102t;
    public g f60103u;
    public long v;
    public long f60104w;

    public h(e eVar) {
        super(eVar.f60078a);
        this.f60094l = eVar.f60079b;
        this.f60095m = eVar.f60080c;
        this.f60096n = eVar.d;
        this.f60097o = eVar.f60081e;
        this.f60098p = eVar.f60082f;
        this.f60099q = eVar.f60083g;
        this.f60100r = new ArrayList();
        this.f60101s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60103u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60101s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10491p;
        f fVar = this.f60102t;
        long j13 = this.f60095m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60100r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60097o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60104w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60098p;
            j3 = this.f60094l;
            if (z10) {
                long j15 = k1Var.f10487l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60104w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60104w;
                dVar.f60076f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60099q);
            this.f60102t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60103u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60077n = this.f60103u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60235k;
        if (aVar.i().f10506e.equals(l0Var.f10506e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60235k.c(g0Var, mVar, j3), this.f60096n, this.v, this.f60104w, 0);
        this.f60100r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60103u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60100r;
        la.p(arrayList.remove(e0Var));
        this.f60235k.o(((d) e0Var).f60072a);
        if (arrayList.isEmpty() && !this.f60097o) {
            f fVar = this.f60102t;
            fVar.getClass();
            D(fVar.f60215e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60103u = null;
        this.f60102t = null;
    }
}

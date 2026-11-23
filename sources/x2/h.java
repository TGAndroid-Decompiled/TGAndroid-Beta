package x2;

import a8.ma;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60223l;
    public final long f60224m;
    public final boolean f60225n;
    public final boolean f60226o;
    public final boolean f60227p;
    public final boolean f60228q;
    public final ArrayList f60229r;
    public final e2.k1 f60230s;
    public f f60231t;
    public g f60232u;
    public long v;
    public long f60233w;

    public h(e eVar) {
        super(eVar.f60207a);
        this.f60223l = eVar.f60208b;
        this.f60224m = eVar.f60209c;
        this.f60225n = eVar.d;
        this.f60226o = eVar.f60210e;
        this.f60227p = eVar.f60211f;
        this.f60228q = eVar.f60212g;
        this.f60229r = new ArrayList();
        this.f60230s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60232u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60230s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10481p;
        f fVar = this.f60231t;
        long j13 = this.f60224m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60229r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60226o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60233w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60227p;
            j3 = this.f60223l;
            if (z10) {
                long j15 = k1Var.f10477l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60233w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60233w;
                dVar.f60205f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60228q);
            this.f60231t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60232u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60206n = this.f60232u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60364k;
        if (aVar.i().f10496e.equals(l0Var.f10496e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60364k.c(g0Var, mVar, j3), this.f60225n, this.v, this.f60233w, 0);
        this.f60229r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60232u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60229r;
        ma.p(arrayList.remove(e0Var));
        this.f60364k.o(((d) e0Var).f60201a);
        if (arrayList.isEmpty() && !this.f60226o) {
            f fVar = this.f60231t;
            fVar.getClass();
            D(fVar.f60344e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60232u = null;
        this.f60231t = null;
    }
}

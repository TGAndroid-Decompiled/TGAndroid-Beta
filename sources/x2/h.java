package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58239l;
    public final long f58240m;
    public final boolean f58241n;
    public final boolean f58242o;
    public final boolean f58243p;
    public final boolean f58244q;
    public final ArrayList f58245r;
    public final e2.k1 f58246s;
    public f f58247t;
    public g f58248u;
    public long v;
    public long f58249w;

    public h(e eVar) {
        super(eVar.f58222a);
        this.f58239l = eVar.f58223b;
        this.f58240m = eVar.f58224c;
        this.f58241n = eVar.d;
        this.f58242o = eVar.f58225e;
        this.f58243p = eVar.f58226f;
        this.f58244q = eVar.f58227g;
        this.f58245r = new ArrayList();
        this.f58246s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58248u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58246s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58247t;
        long j13 = this.f58240m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58245r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58242o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58249w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58243p;
            j3 = this.f58239l;
            if (z9) {
                long j15 = k1Var.f10333l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f58249w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58249w;
                dVar.f58220f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58244q);
            this.f58247t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58248u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58221n = this.f58248u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58364k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58364k.c(g0Var, mVar, j3), this.f58241n, this.v, this.f58249w, 0);
        this.f58245r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58248u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58245r;
        ia.p(arrayList.remove(e0Var));
        this.f58364k.o(((d) e0Var).f58216a);
        if (arrayList.isEmpty() && !this.f58242o) {
            f fVar = this.f58247t;
            fVar.getClass();
            D(fVar.f58360e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58248u = null;
        this.f58247t = null;
    }
}

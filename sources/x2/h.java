package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58240l;
    public final long f58241m;
    public final boolean f58242n;
    public final boolean f58243o;
    public final boolean f58244p;
    public final boolean f58245q;
    public final ArrayList f58246r;
    public final e2.k1 f58247s;
    public f f58248t;
    public g f58249u;
    public long v;
    public long f58250w;

    public h(e eVar) {
        super(eVar.f58223a);
        this.f58240l = eVar.f58224b;
        this.f58241m = eVar.f58225c;
        this.f58242n = eVar.d;
        this.f58243o = eVar.f58226e;
        this.f58244p = eVar.f58227f;
        this.f58245q = eVar.f58228g;
        this.f58246r = new ArrayList();
        this.f58247s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58249u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58247s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58248t;
        long j13 = this.f58241m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58246r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58243o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58250w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58244p;
            j3 = this.f58240l;
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
            this.f58250w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58250w;
                dVar.f58221f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58245q);
            this.f58248t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58249u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58222n = this.f58249u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58365k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58365k.c(g0Var, mVar, j3), this.f58242n, this.v, this.f58250w, 0);
        this.f58246r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58249u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58246r;
        ia.p(arrayList.remove(e0Var));
        this.f58365k.o(((d) e0Var).f58217a);
        if (arrayList.isEmpty() && !this.f58243o) {
            f fVar = this.f58248t;
            fVar.getClass();
            D(fVar.f58361e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58249u = null;
        this.f58248t = null;
    }
}

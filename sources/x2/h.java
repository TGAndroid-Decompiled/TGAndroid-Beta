package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58215l;
    public final long f58216m;
    public final boolean f58217n;
    public final boolean f58218o;
    public final boolean f58219p;
    public final boolean f58220q;
    public final ArrayList f58221r;
    public final e2.k1 f58222s;
    public f f58223t;
    public g f58224u;
    public long v;
    public long f58225w;

    public h(e eVar) {
        super(eVar.f58198a);
        this.f58215l = eVar.f58199b;
        this.f58216m = eVar.f58200c;
        this.f58217n = eVar.d;
        this.f58218o = eVar.f58201e;
        this.f58219p = eVar.f58202f;
        this.f58220q = eVar.f58203g;
        this.f58221r = new ArrayList();
        this.f58222s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58224u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58222s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58223t;
        long j13 = this.f58216m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58221r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58218o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58225w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58219p;
            j3 = this.f58215l;
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
            this.f58225w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58225w;
                dVar.f58196f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58220q);
            this.f58223t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58224u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58197n = this.f58224u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58340k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58340k.c(g0Var, mVar, j3), this.f58217n, this.v, this.f58225w, 0);
        this.f58221r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58224u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58221r;
        ia.p(arrayList.remove(e0Var));
        this.f58340k.o(((d) e0Var).f58192a);
        if (arrayList.isEmpty() && !this.f58218o) {
            f fVar = this.f58223t;
            fVar.getClass();
            D(fVar.f58336e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58224u = null;
        this.f58223t = null;
    }
}

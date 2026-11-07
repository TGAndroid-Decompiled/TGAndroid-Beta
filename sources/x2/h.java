package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58245l;
    public final long f58246m;
    public final boolean f58247n;
    public final boolean f58248o;
    public final boolean f58249p;
    public final boolean f58250q;
    public final ArrayList f58251r;
    public final e2.k1 f58252s;
    public f f58253t;
    public g f58254u;
    public long v;
    public long f58255w;

    public h(e eVar) {
        super(eVar.f58228a);
        this.f58245l = eVar.f58229b;
        this.f58246m = eVar.f58230c;
        this.f58247n = eVar.d;
        this.f58248o = eVar.f58231e;
        this.f58249p = eVar.f58232f;
        this.f58250q = eVar.f58233g;
        this.f58251r = new ArrayList();
        this.f58252s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58254u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58252s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58253t;
        long j13 = this.f58246m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58251r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58248o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58255w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58249p;
            j3 = this.f58245l;
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
            this.f58255w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58255w;
                dVar.f58226f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58250q);
            this.f58253t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58254u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58227n = this.f58254u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58370k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58370k.c(g0Var, mVar, j3), this.f58247n, this.v, this.f58255w, 0);
        this.f58251r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58254u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58251r;
        ia.p(arrayList.remove(e0Var));
        this.f58370k.o(((d) e0Var).f58222a);
        if (arrayList.isEmpty() && !this.f58248o) {
            f fVar = this.f58253t;
            fVar.getClass();
            D(fVar.f58366e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58254u = null;
        this.f58253t = null;
    }
}

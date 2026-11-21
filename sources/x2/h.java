package x2;

import a8.la;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60136l;
    public final long f60137m;
    public final boolean f60138n;
    public final boolean f60139o;
    public final boolean f60140p;
    public final boolean f60141q;
    public final ArrayList f60142r;
    public final e2.k1 f60143s;
    public f f60144t;
    public g f60145u;
    public long v;
    public long f60146w;

    public h(e eVar) {
        super(eVar.f60120a);
        this.f60136l = eVar.f60121b;
        this.f60137m = eVar.f60122c;
        this.f60138n = eVar.d;
        this.f60139o = eVar.f60123e;
        this.f60140p = eVar.f60124f;
        this.f60141q = eVar.f60125g;
        this.f60142r = new ArrayList();
        this.f60143s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60145u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60143s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10517p;
        f fVar = this.f60144t;
        long j13 = this.f60137m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60142r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60139o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60146w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60140p;
            j3 = this.f60136l;
            if (z10) {
                long j15 = k1Var.f10513l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60146w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60146w;
                dVar.f60118f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60141q);
            this.f60144t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60145u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60119n = this.f60145u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60277k;
        if (aVar.i().f10532e.equals(l0Var.f10532e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60277k.c(g0Var, mVar, j3), this.f60138n, this.v, this.f60146w, 0);
        this.f60142r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60145u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60142r;
        la.p(arrayList.remove(e0Var));
        this.f60277k.o(((d) e0Var).f60114a);
        if (arrayList.isEmpty() && !this.f60139o) {
            f fVar = this.f60144t;
            fVar.getClass();
            D(fVar.f60257e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60145u = null;
        this.f60144t = null;
    }
}

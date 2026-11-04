package w2;

import b8.zb;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f57088l;
    public final long f57089m;
    public final boolean f57090n;
    public final boolean f57091o;
    public final boolean f57092p;
    public final boolean f57093q;
    public final ArrayList f57094r;
    public final d2.m1 f57095s;
    public f f57096t;
    public g f57097u;
    public long v;
    public long f57098w;

    public h(e eVar) {
        super(eVar.f57072a);
        this.f57088l = eVar.f57073b;
        this.f57089m = eVar.f57074c;
        this.f57090n = eVar.d;
        this.f57091o = eVar.f57075e;
        this.f57092p = eVar.f57076f;
        this.f57093q = eVar.f57077g;
        this.f57094r = new ArrayList();
        this.f57095s = new d2.m1();
    }

    @Override
    public final void A(d2.n1 n1Var) {
        if (this.f57097u != null) {
            return;
        }
        D(n1Var);
    }

    public final void D(d2.n1 n1Var) {
        long j10;
        long j11;
        long j12;
        d2.m1 m1Var = this.f57095s;
        n1Var.n(0, m1Var);
        long j13 = m1Var.f8221p;
        f fVar = this.f57096t;
        long j14 = this.f57089m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f57094r;
        if (fVar != null && !arrayList.isEmpty() && !this.f57091o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f57098w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f57092p;
            j10 = this.f57088l;
            if (z10) {
                long j16 = m1Var.f8217l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f57098w = j15;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = (d) arrayList.get(i3);
                long j17 = this.v;
                long j18 = this.f57098w;
                dVar.f57070f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(n1Var, j10, j12, this.f57093q);
            this.f57096t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f57097u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f57071n = this.f57097u;
            }
        }
    }

    @Override
    public final boolean a(d2.n0 n0Var) {
        a aVar = this.f57229k;
        if (aVar.i().f8243e.equals(n0Var.f8243e) && aVar.a(n0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        d dVar = new d(this.f57229k.c(g0Var, a0Var, j10), this.f57090n, this.v, this.f57098w, 0);
        this.f57094r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f57097u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f57094r;
        zb.p(arrayList.remove(e0Var));
        this.f57229k.o(((d) e0Var).f57066a);
        if (arrayList.isEmpty() && !this.f57091o) {
            f fVar = this.f57096t;
            fVar.getClass();
            D(fVar.f57209e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f57097u = null;
        this.f57096t = null;
    }
}

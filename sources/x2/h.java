package x2;

import a8.la;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f60140l;
    public final long f60141m;
    public final boolean f60142n;
    public final boolean f60143o;
    public final boolean f60144p;
    public final boolean f60145q;
    public final ArrayList f60146r;
    public final e2.k1 f60147s;
    public f f60148t;
    public g f60149u;
    public long v;
    public long f60150w;

    public h(e eVar) {
        super(eVar.f60124a);
        this.f60140l = eVar.f60125b;
        this.f60141m = eVar.f60126c;
        this.f60142n = eVar.d;
        this.f60143o = eVar.f60127e;
        this.f60144p = eVar.f60128f;
        this.f60145q = eVar.f60129g;
        this.f60146r = new ArrayList();
        this.f60147s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f60149u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f60147s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10520p;
        f fVar = this.f60148t;
        long j13 = this.f60141m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f60146r;
        if (fVar != null && !arrayList.isEmpty() && !this.f60143o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f60150w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f60144p;
            j3 = this.f60140l;
            if (z10) {
                long j15 = k1Var.f10516l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f60150w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f60150w;
                dVar.f60122f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f60145q);
            this.f60148t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f60149u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f60123n = this.f60149u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f60281k;
        if (aVar.i().f10535e.equals(l0Var.f10535e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f60281k.c(g0Var, mVar, j3), this.f60142n, this.v, this.f60150w, 0);
        this.f60146r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f60149u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f60146r;
        la.p(arrayList.remove(e0Var));
        this.f60281k.o(((d) e0Var).f60118a);
        if (arrayList.isEmpty() && !this.f60143o) {
            f fVar = this.f60148t;
            fVar.getClass();
            D(fVar.f60261e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f60149u = null;
        this.f60148t = null;
    }
}

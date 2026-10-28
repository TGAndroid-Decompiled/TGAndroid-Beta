package u2;

import a8.yb;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f49338l;
    public final long f49339m;
    public final boolean f49340n;
    public final boolean f49341o;
    public final boolean f49342p;
    public final boolean f49343q;
    public final ArrayList f49344r;
    public final b2.o1 f49345s;
    public f f49346t;
    public g f49347u;
    public long v;
    public long f49348w;

    public h(e eVar) {
        super(eVar.f49324a);
        this.f49338l = eVar.f49325b;
        this.f49339m = eVar.f49326c;
        this.f49340n = eVar.d;
        this.f49341o = eVar.e;
        this.f49342p = eVar.f49327f;
        this.f49343q = eVar.f49328g;
        this.f49344r = new ArrayList();
        this.f49345s = new b2.o1();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        if (this.f49347u != null) {
            return;
        }
        D(p1Var);
    }

    public final void D(b2.p1 p1Var) {
        long j10;
        long j11;
        long j12;
        b2.o1 o1Var = this.f49345s;
        p1Var.n(0, o1Var);
        long j13 = o1Var.f3337p;
        f fVar = this.f49346t;
        long j14 = this.f49339m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f49344r;
        if (fVar != null && !arrayList.isEmpty() && !this.f49341o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f49348w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f49342p;
            j10 = this.f49338l;
            if (z10) {
                long j16 = o1Var.f3333l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f49348w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f49348w;
                dVar.f49322f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(p1Var, j10, j12, this.f49343q);
            this.f49346t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f49347u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f49323n = this.f49347u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f49469k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        d dVar = new d(this.f49469k.c(g0Var, h0Var, j10), this.f49340n, this.v, this.f49348w, 0);
        this.f49344r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f49347u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f49344r;
        yb.p(arrayList.remove(e0Var));
        this.f49469k.o(((d) e0Var).f49319a);
        if (arrayList.isEmpty() && !this.f49341o) {
            f fVar = this.f49346t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f49347u = null;
        this.f49346t = null;
    }
}

package u2;

import java.util.ArrayList;
import v7.t6;
public final class h extends t1 {
    public final long f49881l;
    public final long f49882m;
    public final boolean f49883n;
    public final boolean f49884o;
    public final boolean f49885p;
    public final boolean f49886q;
    public final ArrayList f49887r;
    public final b2.n1 f49888s;
    public f f49889t;
    public g f49890u;
    public long v;
    public long f49891w;

    public h(e eVar) {
        super(eVar.f49867a);
        this.f49881l = eVar.f49868b;
        this.f49882m = eVar.f49869c;
        this.f49883n = eVar.d;
        this.f49884o = eVar.e;
        this.f49885p = eVar.f49870f;
        this.f49886q = eVar.f49871g;
        this.f49887r = new ArrayList();
        this.f49888s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f49890u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f49888s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f2149p;
        f fVar = this.f49889t;
        long j14 = this.f49882m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f49887r;
        if (fVar != null && !arrayList.isEmpty() && !this.f49884o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f49891w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f49885p;
            j10 = this.f49881l;
            if (z10) {
                long j16 = n1Var.f2145l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f49891w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f49891w;
                dVar.f49865f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(o1Var, j10, j12, this.f49886q);
            this.f49889t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f49890u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f49866n = this.f49890u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f50013k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        d dVar = new d(this.f50013k.c(g0Var, a0Var, j10), this.f49883n, this.v, this.f49891w, 0);
        this.f49887r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f49890u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f49887r;
        t6.p(arrayList.remove(e0Var));
        this.f50013k.o(((d) e0Var).f49862a);
        if (arrayList.isEmpty() && !this.f49884o) {
            f fVar = this.f49889t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f49890u = null;
        this.f49889t = null;
    }
}

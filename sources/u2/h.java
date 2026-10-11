package u2;

import java.util.ArrayList;
public final class h extends o1 {
    public final long f48690l;
    public final long f48691m;
    public final boolean f48692n;
    public final boolean f48693o;
    public final boolean f48694p;
    public final boolean f48695q;
    public final ArrayList f48696r;
    public final b2.j1 f48697s;
    public f f48698t;
    public g f48699u;
    public long v;
    public long f48700w;

    public h(e eVar) {
        super(eVar.f48664a);
        this.f48690l = eVar.f48665b;
        this.f48691m = eVar.f48666c;
        this.f48692n = eVar.d;
        this.f48693o = eVar.f48667e;
        this.f48694p = eVar.f48668f;
        this.f48695q = eVar.f48669g;
        this.f48696r = new ArrayList();
        this.f48697s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48699u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48697s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3392p;
        f fVar = this.f48698t;
        long j13 = this.f48691m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48696r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48693o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48700w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48694p;
            j3 = this.f48690l;
            if (z10) {
                long j15 = j1Var.f3388l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f48700w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48700w;
                dVar.f48659e = j16;
                dVar.f48660f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48695q);
            this.f48698t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48699u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48699u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48780k;
        if (aVar.i().f3402e.equals(k0Var.f3402e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48780k.c(f0Var, dVar, j3), this.f48692n, this.v, this.f48700w);
        this.f48696r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48699u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48696r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48780k.o(((d) d0Var).f48656a);
        if (arrayList.isEmpty() && !this.f48693o) {
            f fVar = this.f48698t;
            fVar.getClass();
            D(fVar.f48799e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48699u = null;
        this.f48698t = null;
    }
}

package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f43691l;
    public final long f43692m;
    public final boolean f43693n;
    public final boolean f43694o;
    public final boolean f43695p;
    public final boolean f43696q;
    public final ArrayList f43697r;
    public final b2.j1 f43698s;
    public f f43699t;
    public g f43700u;
    public long v;
    public long f43701w;

    public h(e eVar) {
        super(eVar.f43676a);
        this.f43691l = eVar.f43677b;
        this.f43692m = eVar.f43678c;
        this.f43693n = eVar.d;
        this.f43694o = eVar.e;
        this.f43695p = eVar.f43679f;
        this.f43696q = eVar.f43680g;
        this.f43697r = new ArrayList();
        this.f43698s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43700u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43698s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3064p;
        f fVar = this.f43699t;
        long j13 = this.f43692m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43697r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43694o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43701w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43695p;
            j3 = this.f43691l;
            if (z10) {
                long j15 = j1Var.f3060l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43701w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43701w;
                dVar.e = j16;
                dVar.f43675f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43696q);
            this.f43699t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43700u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43700u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43796k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43796k.c(f0Var, dVar, j3), this.f43693n, this.v, this.f43701w);
        this.f43697r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43700u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43697r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43796k.o(((d) d0Var).f43672a);
        if (arrayList.isEmpty() && !this.f43694o) {
            f fVar = this.f43699t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43700u = null;
        this.f43699t = null;
    }
}

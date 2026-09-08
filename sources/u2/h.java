package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f46700l;
    public final long f46701m;
    public final boolean f46702n;
    public final boolean f46703o;
    public final boolean f46704p;
    public final boolean f46705q;
    public final ArrayList f46706r;
    public final b2.j1 f46707s;
    public f f46708t;
    public g f46709u;
    public long v;
    public long f46710w;

    public h(e eVar) {
        super(eVar.f46683a);
        this.f46700l = eVar.f46684b;
        this.f46701m = eVar.f46685c;
        this.f46702n = eVar.d;
        this.f46703o = eVar.f46686e;
        this.f46704p = eVar.f46687f;
        this.f46705q = eVar.f46688g;
        this.f46706r = new ArrayList();
        this.f46707s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f46709u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f46707s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f2146p;
        f fVar = this.f46708t;
        long j13 = this.f46701m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f46706r;
        if (fVar != null && !arrayList.isEmpty() && !this.f46703o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f46710w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f46704p;
            j3 = this.f46700l;
            if (z10) {
                long j15 = j1Var.f2142l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f46710w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f46710w;
                dVar.f46681e = j16;
                dVar.f46682f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f46705q);
            this.f46708t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f46709u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f46709u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f46813k;
        if (aVar.i().f2156e.equals(k0Var.f2156e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f46813k.c(f0Var, dVar, j3), this.f46702n, this.v, this.f46710w);
        this.f46706r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f46709u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f46706r;
        e2.d.g(arrayList.remove(d0Var));
        this.f46813k.o(((d) d0Var).f46678a);
        if (arrayList.isEmpty() && !this.f46703o) {
            f fVar = this.f46708t;
            fVar.getClass();
            D(fVar.f46815e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f46709u = null;
        this.f46708t = null;
    }
}

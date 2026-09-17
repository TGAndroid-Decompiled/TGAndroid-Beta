package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f46701l;
    public final long f46702m;
    public final boolean f46703n;
    public final boolean f46704o;
    public final boolean f46705p;
    public final boolean f46706q;
    public final ArrayList f46707r;
    public final b2.j1 f46708s;
    public f f46709t;
    public g f46710u;
    public long v;
    public long f46711w;

    public h(e eVar) {
        super(eVar.f46684a);
        this.f46701l = eVar.f46685b;
        this.f46702m = eVar.f46686c;
        this.f46703n = eVar.d;
        this.f46704o = eVar.f46687e;
        this.f46705p = eVar.f46688f;
        this.f46706q = eVar.f46689g;
        this.f46707r = new ArrayList();
        this.f46708s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f46710u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f46708s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f2146p;
        f fVar = this.f46709t;
        long j13 = this.f46702m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f46707r;
        if (fVar != null && !arrayList.isEmpty() && !this.f46704o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f46711w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f46705p;
            j3 = this.f46701l;
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
            this.f46711w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f46711w;
                dVar.f46682e = j16;
                dVar.f46683f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f46706q);
            this.f46709t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f46710u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f46710u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f46814k;
        if (aVar.i().f2156e.equals(k0Var.f2156e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f46814k.c(f0Var, dVar, j3), this.f46703n, this.v, this.f46711w);
        this.f46707r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f46710u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f46707r;
        e2.d.g(arrayList.remove(d0Var));
        this.f46814k.o(((d) d0Var).f46679a);
        if (arrayList.isEmpty() && !this.f46704o) {
            f fVar = this.f46709t;
            fVar.getClass();
            D(fVar.f46816e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f46710u = null;
        this.f46709t = null;
    }
}

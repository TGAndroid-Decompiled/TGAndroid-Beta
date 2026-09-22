package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f43681l;
    public final long f43682m;
    public final boolean f43683n;
    public final boolean f43684o;
    public final boolean f43685p;
    public final boolean f43686q;
    public final ArrayList f43687r;
    public final b2.j1 f43688s;
    public f f43689t;
    public g f43690u;
    public long v;
    public long f43691w;

    public h(e eVar) {
        super(eVar.f43666a);
        this.f43681l = eVar.f43667b;
        this.f43682m = eVar.f43668c;
        this.f43683n = eVar.d;
        this.f43684o = eVar.e;
        this.f43685p = eVar.f43669f;
        this.f43686q = eVar.f43670g;
        this.f43687r = new ArrayList();
        this.f43688s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43690u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43688s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3069p;
        f fVar = this.f43689t;
        long j13 = this.f43682m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43687r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43684o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43691w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43685p;
            j3 = this.f43681l;
            if (z10) {
                long j15 = j1Var.f3065l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43691w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43691w;
                dVar.e = j16;
                dVar.f43665f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43686q);
            this.f43689t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43690u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43690u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43791k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43791k.c(f0Var, dVar, j3), this.f43683n, this.v, this.f43691w);
        this.f43687r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43690u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43687r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43791k.o(((d) d0Var).f43662a);
        if (arrayList.isEmpty() && !this.f43684o) {
            f fVar = this.f43689t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43690u = null;
        this.f43689t = null;
    }
}

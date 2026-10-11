package u2;

import java.util.ArrayList;
public final class h extends o1 {
    public final long f48656l;
    public final long f48657m;
    public final boolean f48658n;
    public final boolean f48659o;
    public final boolean f48660p;
    public final boolean f48661q;
    public final ArrayList f48662r;
    public final b2.j1 f48663s;
    public f f48664t;
    public g f48665u;
    public long v;
    public long f48666w;

    public h(e eVar) {
        super(eVar.f48630a);
        this.f48656l = eVar.f48631b;
        this.f48657m = eVar.f48632c;
        this.f48658n = eVar.d;
        this.f48659o = eVar.f48633e;
        this.f48660p = eVar.f48634f;
        this.f48661q = eVar.f48635g;
        this.f48662r = new ArrayList();
        this.f48663s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48665u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48663s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3392p;
        f fVar = this.f48664t;
        long j13 = this.f48657m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48662r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48659o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48666w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48660p;
            j3 = this.f48656l;
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
            this.f48666w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48666w;
                dVar.f48625e = j16;
                dVar.f48626f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48661q);
            this.f48664t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48665u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48665u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48746k;
        if (aVar.i().f3402e.equals(k0Var.f3402e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48746k.c(f0Var, dVar, j3), this.f48658n, this.v, this.f48666w);
        this.f48662r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48665u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48662r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48746k.o(((d) d0Var).f48622a);
        if (arrayList.isEmpty() && !this.f48659o) {
            f fVar = this.f48664t;
            fVar.getClass();
            D(fVar.f48765e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48665u = null;
        this.f48664t = null;
    }
}

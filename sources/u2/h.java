package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f48575l;
    public final long f48576m;
    public final boolean f48577n;
    public final boolean f48578o;
    public final boolean f48579p;
    public final boolean f48580q;
    public final ArrayList f48581r;
    public final b2.j1 f48582s;
    public f f48583t;
    public g f48584u;
    public long v;
    public long f48585w;

    public h(e eVar) {
        super(eVar.f48558a);
        this.f48575l = eVar.f48559b;
        this.f48576m = eVar.f48560c;
        this.f48577n = eVar.d;
        this.f48578o = eVar.f48561e;
        this.f48579p = eVar.f48562f;
        this.f48580q = eVar.f48563g;
        this.f48581r = new ArrayList();
        this.f48582s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48584u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48582s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3392p;
        f fVar = this.f48583t;
        long j13 = this.f48576m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48581r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48578o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48585w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48579p;
            j3 = this.f48575l;
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
            this.f48585w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48585w;
                dVar.f48556e = j16;
                dVar.f48557f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48580q);
            this.f48583t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48584u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48584u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48687k;
        if (aVar.i().f3402e.equals(k0Var.f3402e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48687k.c(f0Var, dVar, j3), this.f48577n, this.v, this.f48585w);
        this.f48581r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48584u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48581r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48687k.o(((d) d0Var).f48553a);
        if (arrayList.isEmpty() && !this.f48578o) {
            f fVar = this.f48583t;
            fVar.getClass();
            D(fVar.f48689e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48584u = null;
        this.f48583t = null;
    }
}

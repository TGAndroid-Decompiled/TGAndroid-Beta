package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f48621l;
    public final long f48622m;
    public final boolean f48623n;
    public final boolean f48624o;
    public final boolean f48625p;
    public final boolean f48626q;
    public final ArrayList f48627r;
    public final b2.j1 f48628s;
    public f f48629t;
    public g f48630u;
    public long v;
    public long f48631w;

    public h(e eVar) {
        super(eVar.f48604a);
        this.f48621l = eVar.f48605b;
        this.f48622m = eVar.f48606c;
        this.f48623n = eVar.d;
        this.f48624o = eVar.f48607e;
        this.f48625p = eVar.f48608f;
        this.f48626q = eVar.f48609g;
        this.f48627r = new ArrayList();
        this.f48628s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48630u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48628s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3392p;
        f fVar = this.f48629t;
        long j13 = this.f48622m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48627r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48624o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48631w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48625p;
            j3 = this.f48621l;
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
            this.f48631w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48631w;
                dVar.f48602e = j16;
                dVar.f48603f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48626q);
            this.f48629t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48630u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48630u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48733k;
        if (aVar.i().f3402e.equals(k0Var.f3402e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48733k.c(f0Var, dVar, j3), this.f48623n, this.v, this.f48631w);
        this.f48627r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48630u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48627r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48733k.o(((d) d0Var).f48599a);
        if (arrayList.isEmpty() && !this.f48624o) {
            f fVar = this.f48629t;
            fVar.getClass();
            D(fVar.f48735e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48630u = null;
        this.f48629t = null;
    }
}

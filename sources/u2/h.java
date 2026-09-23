package u2;

import java.util.ArrayList;
public final class h extends o1 {
    public final long f43301l;
    public final long f43302m;
    public final boolean f43303n;
    public final boolean f43304o;
    public final boolean f43305p;
    public final boolean f43306q;
    public final ArrayList f43307r;
    public final b2.j1 f43308s;
    public f f43309t;
    public g f43310u;
    public long v;
    public long f43311w;

    public h(e eVar) {
        super(eVar.f43278a);
        this.f43301l = eVar.f43279b;
        this.f43302m = eVar.f43280c;
        this.f43303n = eVar.d;
        this.f43304o = eVar.e;
        this.f43305p = eVar.f43281f;
        this.f43306q = eVar.f43282g;
        this.f43307r = new ArrayList();
        this.f43308s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43310u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43308s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3062p;
        f fVar = this.f43309t;
        long j13 = this.f43302m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43307r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43304o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43311w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43305p;
            j3 = this.f43301l;
            if (z10) {
                long j15 = j1Var.f3058l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43311w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43311w;
                dVar.e = j16;
                dVar.f43274f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43306q);
            this.f43309t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43310u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43310u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43388k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43388k.c(f0Var, dVar, j3), this.f43303n, this.v, this.f43311w);
        this.f43307r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43310u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43307r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43388k.o(((d) d0Var).f43271a);
        if (arrayList.isEmpty() && !this.f43304o) {
            f fVar = this.f43309t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43310u = null;
        this.f43309t = null;
    }
}

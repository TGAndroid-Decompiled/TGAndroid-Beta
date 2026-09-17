package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f46673l;
    public final long f46674m;
    public final boolean f46675n;
    public final boolean f46676o;
    public final boolean f46677p;
    public final boolean f46678q;
    public final ArrayList f46679r;
    public final b2.j1 f46680s;
    public f f46681t;
    public g f46682u;
    public long v;
    public long f46683w;

    public h(e eVar) {
        super(eVar.f46656a);
        this.f46673l = eVar.f46657b;
        this.f46674m = eVar.f46658c;
        this.f46675n = eVar.d;
        this.f46676o = eVar.f46659e;
        this.f46677p = eVar.f46660f;
        this.f46678q = eVar.f46661g;
        this.f46679r = new ArrayList();
        this.f46680s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f46682u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f46680s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f2119p;
        f fVar = this.f46681t;
        long j13 = this.f46674m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f46679r;
        if (fVar != null && !arrayList.isEmpty() && !this.f46676o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f46683w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f46677p;
            j3 = this.f46673l;
            if (z10) {
                long j15 = j1Var.f2115l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f46683w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f46683w;
                dVar.f46654e = j16;
                dVar.f46655f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f46678q);
            this.f46681t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f46682u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f46682u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f46786k;
        if (aVar.i().f2129e.equals(k0Var.f2129e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f46786k.c(f0Var, dVar, j3), this.f46675n, this.v, this.f46683w);
        this.f46679r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f46682u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f46679r;
        e2.d.g(arrayList.remove(d0Var));
        this.f46786k.o(((d) d0Var).f46651a);
        if (arrayList.isEmpty() && !this.f46676o) {
            f fVar = this.f46681t;
            fVar.getClass();
            D(fVar.f46788e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f46682u = null;
        this.f46681t = null;
    }
}

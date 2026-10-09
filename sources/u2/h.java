package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f48577l;
    public final long f48578m;
    public final boolean f48579n;
    public final boolean f48580o;
    public final boolean f48581p;
    public final boolean f48582q;
    public final ArrayList f48583r;
    public final b2.j1 f48584s;
    public f f48585t;
    public g f48586u;
    public long v;
    public long f48587w;

    public h(e eVar) {
        super(eVar.f48560a);
        this.f48577l = eVar.f48561b;
        this.f48578m = eVar.f48562c;
        this.f48579n = eVar.d;
        this.f48580o = eVar.f48563e;
        this.f48581p = eVar.f48564f;
        this.f48582q = eVar.f48565g;
        this.f48583r = new ArrayList();
        this.f48584s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48586u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48584s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3392p;
        f fVar = this.f48585t;
        long j13 = this.f48578m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48583r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48580o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48587w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48581p;
            j3 = this.f48577l;
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
            this.f48587w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48587w;
                dVar.f48558e = j16;
                dVar.f48559f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48582q);
            this.f48585t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48586u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48586u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48689k;
        if (aVar.i().f3402e.equals(k0Var.f3402e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48689k.c(f0Var, dVar, j3), this.f48579n, this.v, this.f48587w);
        this.f48583r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48586u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48583r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48689k.o(((d) d0Var).f48555a);
        if (arrayList.isEmpty() && !this.f48580o) {
            f fVar = this.f48585t;
            fVar.getClass();
            D(fVar.f48691e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48586u = null;
        this.f48585t = null;
    }
}

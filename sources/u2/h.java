package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f47263l;
    public final long f47264m;
    public final boolean f47265n;
    public final boolean f47266o;
    public final boolean f47267p;
    public final boolean f47268q;
    public final ArrayList f47269r;
    public final b2.j1 f47270s;
    public f f47271t;
    public g f47272u;
    public long v;
    public long f47273w;

    public h(e eVar) {
        super(eVar.f47246a);
        this.f47263l = eVar.f47247b;
        this.f47264m = eVar.f47248c;
        this.f47265n = eVar.d;
        this.f47266o = eVar.f47249e;
        this.f47267p = eVar.f47250f;
        this.f47268q = eVar.f47251g;
        this.f47269r = new ArrayList();
        this.f47270s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f47272u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f47270s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3313p;
        f fVar = this.f47271t;
        long j13 = this.f47264m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47269r;
        if (fVar != null && !arrayList.isEmpty() && !this.f47266o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f47273w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f47267p;
            j3 = this.f47263l;
            if (z10) {
                long j15 = j1Var.f3309l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f47273w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f47273w;
                dVar.f47244e = j16;
                dVar.f47245f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f47268q);
            this.f47271t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f47272u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f47272u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f47376k;
        if (aVar.i().f3323e.equals(k0Var.f3323e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f47376k.c(f0Var, dVar, j3), this.f47265n, this.v, this.f47273w);
        this.f47269r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f47272u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f47269r;
        e2.d.g(arrayList.remove(d0Var));
        this.f47376k.o(((d) d0Var).f47241a);
        if (arrayList.isEmpty() && !this.f47266o) {
            f fVar = this.f47271t;
            fVar.getClass();
            D(fVar.f47377e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47272u = null;
        this.f47271t = null;
    }
}

package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f47262l;
    public final long f47263m;
    public final boolean f47264n;
    public final boolean f47265o;
    public final boolean f47266p;
    public final boolean f47267q;
    public final ArrayList f47268r;
    public final b2.j1 f47269s;
    public f f47270t;
    public g f47271u;
    public long v;
    public long f47272w;

    public h(e eVar) {
        super(eVar.f47245a);
        this.f47262l = eVar.f47246b;
        this.f47263m = eVar.f47247c;
        this.f47264n = eVar.d;
        this.f47265o = eVar.f47248e;
        this.f47266p = eVar.f47249f;
        this.f47267q = eVar.f47250g;
        this.f47268r = new ArrayList();
        this.f47269s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f47271u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f47269s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3313p;
        f fVar = this.f47270t;
        long j13 = this.f47263m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47268r;
        if (fVar != null && !arrayList.isEmpty() && !this.f47265o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f47272w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f47266p;
            j3 = this.f47262l;
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
            this.f47272w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f47272w;
                dVar.f47243e = j16;
                dVar.f47244f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f47267q);
            this.f47270t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f47271u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f47271u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f47375k;
        if (aVar.i().f3323e.equals(k0Var.f3323e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f47375k.c(f0Var, dVar, j3), this.f47264n, this.v, this.f47272w);
        this.f47268r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f47271u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f47268r;
        e2.d.g(arrayList.remove(d0Var));
        this.f47375k.o(((d) d0Var).f47240a);
        if (arrayList.isEmpty() && !this.f47265o) {
            f fVar = this.f47270t;
            fVar.getClass();
            D(fVar.f47376e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47271u = null;
        this.f47270t = null;
    }
}

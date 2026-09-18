package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f43389l;
    public final long f43390m;
    public final boolean f43391n;
    public final boolean f43392o;
    public final boolean f43393p;
    public final boolean f43394q;
    public final ArrayList f43395r;
    public final b2.j1 f43396s;
    public f f43397t;
    public g f43398u;
    public long v;
    public long f43399w;

    public h(e eVar) {
        super(eVar.f43374a);
        this.f43389l = eVar.f43375b;
        this.f43390m = eVar.f43376c;
        this.f43391n = eVar.d;
        this.f43392o = eVar.e;
        this.f43393p = eVar.f43377f;
        this.f43394q = eVar.f43378g;
        this.f43395r = new ArrayList();
        this.f43396s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43398u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43396s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3070p;
        f fVar = this.f43397t;
        long j13 = this.f43390m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43395r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43392o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43399w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43393p;
            j3 = this.f43389l;
            if (z10) {
                long j15 = j1Var.f3066l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43399w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43399w;
                dVar.e = j16;
                dVar.f43373f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43394q);
            this.f43397t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43398u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43398u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43496k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43496k.c(f0Var, dVar, j3), this.f43391n, this.v, this.f43399w);
        this.f43395r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43398u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43395r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43496k.o(((d) d0Var).f43370a);
        if (arrayList.isEmpty() && !this.f43392o) {
            f fVar = this.f43397t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43398u = null;
        this.f43397t = null;
    }
}

package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f43753l;
    public final long f43754m;
    public final boolean f43755n;
    public final boolean f43756o;
    public final boolean f43757p;
    public final boolean f43758q;
    public final ArrayList f43759r;
    public final b2.j1 f43760s;
    public f f43761t;
    public g f43762u;
    public long v;
    public long f43763w;

    public h(e eVar) {
        super(eVar.f43738a);
        this.f43753l = eVar.f43739b;
        this.f43754m = eVar.f43740c;
        this.f43755n = eVar.d;
        this.f43756o = eVar.e;
        this.f43757p = eVar.f43741f;
        this.f43758q = eVar.f43742g;
        this.f43759r = new ArrayList();
        this.f43760s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43762u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43760s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3069p;
        f fVar = this.f43761t;
        long j13 = this.f43754m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43759r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43756o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43763w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43757p;
            j3 = this.f43753l;
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
            this.f43763w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43763w;
                dVar.e = j16;
                dVar.f43737f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43758q);
            this.f43761t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43762u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43762u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43862k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43862k.c(f0Var, dVar, j3), this.f43755n, this.v, this.f43763w);
        this.f43759r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43762u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43759r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43862k.o(((d) d0Var).f43734a);
        if (arrayList.isEmpty() && !this.f43756o) {
            f fVar = this.f43761t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43762u = null;
        this.f43761t = null;
    }
}

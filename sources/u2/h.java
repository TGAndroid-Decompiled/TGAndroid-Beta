package u2;

import java.util.ArrayList;
public final class h extends o1 {
    public final long f48805l;
    public final long f48806m;
    public final boolean f48807n;
    public final boolean f48808o;
    public final boolean f48809p;
    public final boolean f48810q;
    public final ArrayList f48811r;
    public final b2.j1 f48812s;
    public f f48813t;
    public g f48814u;
    public long v;
    public long f48815w;

    public h(e eVar) {
        super(eVar.f48779a);
        this.f48805l = eVar.f48780b;
        this.f48806m = eVar.f48781c;
        this.f48807n = eVar.d;
        this.f48808o = eVar.f48782e;
        this.f48809p = eVar.f48783f;
        this.f48810q = eVar.f48784g;
        this.f48811r = new ArrayList();
        this.f48812s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f48814u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f48812s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3390p;
        f fVar = this.f48813t;
        long j13 = this.f48806m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f48811r;
        if (fVar != null && !arrayList.isEmpty() && !this.f48808o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f48815w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f48809p;
            j3 = this.f48805l;
            if (z10) {
                long j15 = j1Var.f3386l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f48815w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f48815w;
                dVar.f48774e = j16;
                dVar.f48775f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f48810q);
            this.f48813t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f48814u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f48814u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f48895k;
        if (aVar.i().f3400e.equals(k0Var.f3400e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f48895k.c(f0Var, dVar, j3), this.f48807n, this.v, this.f48815w);
        this.f48811r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f48814u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f48811r;
        e2.d.g(arrayList.remove(d0Var));
        this.f48895k.o(((d) d0Var).f48771a);
        if (arrayList.isEmpty() && !this.f48808o) {
            f fVar = this.f48813t;
            fVar.getClass();
            D(fVar.f48914e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f48814u = null;
        this.f48813t = null;
    }
}

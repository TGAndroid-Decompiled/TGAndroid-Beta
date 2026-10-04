package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f47271l;
    public final long f47272m;
    public final boolean f47273n;
    public final boolean f47274o;
    public final boolean f47275p;
    public final boolean f47276q;
    public final ArrayList f47277r;
    public final b2.j1 f47278s;
    public f f47279t;
    public g f47280u;
    public long v;
    public long f47281w;

    public h(e eVar) {
        super(eVar.f47254a);
        this.f47271l = eVar.f47255b;
        this.f47272m = eVar.f47256c;
        this.f47273n = eVar.d;
        this.f47274o = eVar.f47257e;
        this.f47275p = eVar.f47258f;
        this.f47276q = eVar.f47259g;
        this.f47277r = new ArrayList();
        this.f47278s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f47280u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f47278s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3313p;
        f fVar = this.f47279t;
        long j13 = this.f47272m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47277r;
        if (fVar != null && !arrayList.isEmpty() && !this.f47274o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f47281w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f47275p;
            j3 = this.f47271l;
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
            this.f47281w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f47281w;
                dVar.f47252e = j16;
                dVar.f47253f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f47276q);
            this.f47279t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f47280u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f47280u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f47384k;
        if (aVar.i().f3323e.equals(k0Var.f3323e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f47384k.c(f0Var, dVar, j3), this.f47273n, this.v, this.f47281w);
        this.f47277r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f47280u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f47277r;
        e2.d.g(arrayList.remove(d0Var));
        this.f47384k.o(((d) d0Var).f47249a);
        if (arrayList.isEmpty() && !this.f47274o) {
            f fVar = this.f47279t;
            fVar.getClass();
            D(fVar.f47385e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47280u = null;
        this.f47279t = null;
    }
}

package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f47278l;
    public final long f47279m;
    public final boolean f47280n;
    public final boolean f47281o;
    public final boolean f47282p;
    public final boolean f47283q;
    public final ArrayList f47284r;
    public final b2.j1 f47285s;
    public f f47286t;
    public g f47287u;
    public long v;
    public long f47288w;

    public h(e eVar) {
        super(eVar.f47261a);
        this.f47278l = eVar.f47262b;
        this.f47279m = eVar.f47263c;
        this.f47280n = eVar.d;
        this.f47281o = eVar.f47264e;
        this.f47282p = eVar.f47265f;
        this.f47283q = eVar.f47266g;
        this.f47284r = new ArrayList();
        this.f47285s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f47287u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f47285s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3313p;
        f fVar = this.f47286t;
        long j13 = this.f47279m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47284r;
        if (fVar != null && !arrayList.isEmpty() && !this.f47281o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f47288w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f47282p;
            j3 = this.f47278l;
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
            this.f47288w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f47288w;
                dVar.f47259e = j16;
                dVar.f47260f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f47283q);
            this.f47286t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f47287u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f47287u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f47391k;
        if (aVar.i().f3323e.equals(k0Var.f3323e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f47391k.c(f0Var, dVar, j3), this.f47280n, this.v, this.f47288w);
        this.f47284r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f47287u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f47284r;
        e2.d.g(arrayList.remove(d0Var));
        this.f47391k.o(((d) d0Var).f47256a);
        if (arrayList.isEmpty() && !this.f47281o) {
            f fVar = this.f47286t;
            fVar.getClass();
            D(fVar.f47392e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47287u = null;
        this.f47286t = null;
    }
}

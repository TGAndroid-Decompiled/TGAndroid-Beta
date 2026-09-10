package u2;

import java.util.ArrayList;
public final class i extends r1 {
    public final long f42331l;
    public final long f42332m;
    public final boolean f42333n;
    public final boolean f42334o;
    public final boolean f42335p;
    public final boolean f42336q;
    public final ArrayList f42337r;
    public final b2.j1 f42338s;
    public g f42339t;
    public h f42340u;
    public long v;
    public long f42341w;

    public i(f fVar) {
        super(fVar.f42316a);
        this.f42331l = fVar.f42317b;
        this.f42332m = fVar.f42318c;
        this.f42333n = fVar.d;
        this.f42334o = fVar.e;
        this.f42335p = fVar.f42319f;
        this.f42336q = fVar.f42320g;
        this.f42337r = new ArrayList();
        this.f42338s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f42340u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f42338s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f1763p;
        g gVar = this.f42339t;
        long j13 = this.f42332m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f42337r;
        if (gVar != null && !arrayList.isEmpty() && !this.f42334o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f42341w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f42335p;
            j3 = this.f42331l;
            if (z10) {
                long j15 = j1Var.f1759l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f42341w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f42341w;
                eVar.e = j16;
                eVar.f42315f = j17;
            }
            j11 = j10;
        }
        try {
            g gVar2 = new g(k1Var, j3, j11, this.f42336q);
            this.f42339t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f42340u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).h = this.f42340u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f42441k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        e eVar = new e(this.f42441k.c(g0Var, dVar, j3), this.f42333n, this.v, this.f42341w);
        this.f42337r.add(eVar);
        return eVar;
    }

    @Override
    public final void k() {
        h hVar = this.f42340u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f42337r;
        e2.d.g(arrayList.remove(e0Var));
        this.f42441k.o(((e) e0Var).f42312a);
        if (arrayList.isEmpty() && !this.f42334o) {
            g gVar = this.f42339t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f42340u = null;
        this.f42339t = null;
    }
}

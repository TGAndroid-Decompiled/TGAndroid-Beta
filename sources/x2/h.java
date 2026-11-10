package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends r1 {
    public final long f58347l;
    public final long f58348m;
    public final boolean f58349n;
    public final boolean f58350o;
    public final boolean f58351p;
    public final boolean f58352q;
    public final ArrayList f58353r;
    public final e2.k1 f58354s;
    public f f58355t;
    public g f58356u;
    public long v;
    public long f58357w;

    public h(e eVar) {
        super(eVar.f58330a);
        this.f58347l = eVar.f58331b;
        this.f58348m = eVar.f58332c;
        this.f58349n = eVar.d;
        this.f58350o = eVar.f58333e;
        this.f58351p = eVar.f58334f;
        this.f58352q = eVar.f58335g;
        this.f58353r = new ArrayList();
        this.f58354s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58356u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58354s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10342p;
        f fVar = this.f58355t;
        long j13 = this.f58348m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58353r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58350o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58357w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58351p;
            j3 = this.f58347l;
            if (z9) {
                long j15 = k1Var.f10338l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f58357w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58357w;
                dVar.f58328f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58352q);
            this.f58355t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58356u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58329n = this.f58356u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58466k;
        if (aVar.i().f10357e.equals(l0Var.f10357e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58466k.c(f0Var, mVar, j3), this.f58349n, this.v, this.f58357w, 0);
        this.f58353r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58356u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f58353r;
        ia.p(arrayList.remove(d0Var));
        this.f58466k.o(((d) d0Var).f58324a);
        if (arrayList.isEmpty() && !this.f58350o) {
            f fVar = this.f58355t;
            fVar.getClass();
            D(fVar.f58462e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58356u = null;
        this.f58355t = null;
    }
}

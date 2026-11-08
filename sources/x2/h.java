package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58335l;
    public final long f58336m;
    public final boolean f58337n;
    public final boolean f58338o;
    public final boolean f58339p;
    public final boolean f58340q;
    public final ArrayList f58341r;
    public final e2.k1 f58342s;
    public f f58343t;
    public g f58344u;
    public long v;
    public long f58345w;

    public h(e eVar) {
        super(eVar.f58318a);
        this.f58335l = eVar.f58319b;
        this.f58336m = eVar.f58320c;
        this.f58337n = eVar.d;
        this.f58338o = eVar.f58321e;
        this.f58339p = eVar.f58322f;
        this.f58340q = eVar.f58323g;
        this.f58341r = new ArrayList();
        this.f58342s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58344u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58342s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58343t;
        long j13 = this.f58336m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58341r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58338o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58345w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58339p;
            j3 = this.f58335l;
            if (z9) {
                long j15 = k1Var.f10333l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f58345w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58345w;
                dVar.f58316f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58340q);
            this.f58343t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58344u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58317n = this.f58344u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58460k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58460k.c(g0Var, mVar, j3), this.f58337n, this.v, this.f58345w, 0);
        this.f58341r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58344u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58341r;
        ia.p(arrayList.remove(e0Var));
        this.f58460k.o(((d) e0Var).f58312a);
        if (arrayList.isEmpty() && !this.f58338o) {
            f fVar = this.f58343t;
            fVar.getClass();
            D(fVar.f58456e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58344u = null;
        this.f58343t = null;
    }
}

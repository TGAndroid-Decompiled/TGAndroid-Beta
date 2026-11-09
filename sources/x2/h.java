package x2;

import a8.ia;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f58344l;
    public final long f58345m;
    public final boolean f58346n;
    public final boolean f58347o;
    public final boolean f58348p;
    public final boolean f58349q;
    public final ArrayList f58350r;
    public final e2.k1 f58351s;
    public f f58352t;
    public g f58353u;
    public long v;
    public long f58354w;

    public h(e eVar) {
        super(eVar.f58327a);
        this.f58344l = eVar.f58328b;
        this.f58345m = eVar.f58329c;
        this.f58346n = eVar.d;
        this.f58347o = eVar.f58330e;
        this.f58348p = eVar.f58331f;
        this.f58349q = eVar.f58332g;
        this.f58350r = new ArrayList();
        this.f58351s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f58353u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f58351s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10337p;
        f fVar = this.f58352t;
        long j13 = this.f58345m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f58350r;
        if (fVar != null && !arrayList.isEmpty() && !this.f58347o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f58354w - j12;
            }
            j11 = j14;
        } else {
            boolean z9 = this.f58348p;
            j3 = this.f58344l;
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
            this.f58354w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f58354w;
                dVar.f58325f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f58349q);
            this.f58352t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f58353u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f58326n = this.f58353u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f58469k;
        if (aVar.i().f10352e.equals(l0Var.f10352e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f58469k.c(g0Var, mVar, j3), this.f58346n, this.v, this.f58354w, 0);
        this.f58350r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f58353u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f58350r;
        ia.p(arrayList.remove(e0Var));
        this.f58469k.o(((d) e0Var).f58321a);
        if (arrayList.isEmpty() && !this.f58347o) {
            f fVar = this.f58352t;
            fVar.getClass();
            D(fVar.f58465e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f58353u = null;
        this.f58352t = null;
    }
}
